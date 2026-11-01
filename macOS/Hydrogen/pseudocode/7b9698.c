
/* WARNING: Control flow encountered bad instruction data */

void FUN_007b9698(undefined1 *param_1)

{
  bool bVar1;
  undefined1 in_w5;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *param_1 = in_w5;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

