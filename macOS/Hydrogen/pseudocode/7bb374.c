
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb374(void)

{
  bool bVar1;
  undefined1 uStack0000000000000000;
  
  bVar1 = (bool)ExclusiveMonitorPass(&uStack0000000000000000,0x10);
  if (bVar1) {
    ExclusiveMonitorsStatus();
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

