package org.jvnet.hk2.test.runlevel;

import org.jvnet.hk2.annotations.Inject;
import org.jvnet.hk2.annotations.RunLevel;
import org.jvnet.hk2.annotations.Service;

/**
 * 
 * @see RunLevelService#testOptionalDependencies()
 * 
 * @author Jeff Trent
 */
@RunLevel(value=1, environment=OptionalRunLevelTstEnv.class)
@Service(name="bad.case2")
public class RunLevelService_withBadOptionalsCase2 implements ShouldNotBeActivateable1 {

  @Inject(optional=true)
  ServiceClientFirstRemovedOf_ContractWithExceptionThrowingImplementers dep;
  
}
