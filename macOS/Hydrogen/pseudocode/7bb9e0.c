
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb9e0(undefined1 *param_1)

{
  bool bVar1;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *param_1 = (char)param_1;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

