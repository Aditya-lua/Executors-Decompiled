
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bae68(void)

{
  bool bVar1;
  undefined4 *in_x7;
  undefined4 in_w16;
  
  bVar1 = (bool)ExclusiveMonitorPass(in_x7,0x10);
  if (bVar1) {
    *in_x7 = in_w16;
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

