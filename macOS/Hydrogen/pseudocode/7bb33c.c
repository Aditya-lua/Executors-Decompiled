
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb33c(void)

{
  bool bVar1;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  
  bVar1 = (bool)ExclusiveMonitorPass(unaff_x21,0x10);
  if (bVar1) {
    *unaff_x21 = unaff_x20;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

