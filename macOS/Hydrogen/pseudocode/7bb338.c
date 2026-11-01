
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb338(undefined1 *param_1)

{
  bool bVar1;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  
  bVar1 = (bool)ExclusiveMonitorPass(param_1,0x10);
  if (bVar1) {
    *param_1 = (char)param_1;
    ExclusiveMonitorsStatus();
  }
  bVar1 = (bool)ExclusiveMonitorPass(unaff_x21,0x10);
  if (bVar1) {
    *unaff_x21 = unaff_x20;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

