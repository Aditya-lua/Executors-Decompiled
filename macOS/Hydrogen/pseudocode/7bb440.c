
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb440(void)

{
  bool bVar1;
  undefined4 unaff_w28;
  undefined4 *unaff_x30;
  undefined1 in_z0 [32];
  undefined1 in_z11 [32];
  undefined4 in_p0;
  
  bVar1 = (bool)ExclusiveMonitorPass(unaff_x30,0x10);
  if (bVar1) {
    *unaff_x30 = unaff_w28;
    ExclusiveMonitorsStatus();
  }
  SVE_sabd(in_z11,in_p0,in_z11,in_z0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

