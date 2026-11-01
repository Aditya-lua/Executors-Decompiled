
void FUN_004380ec(void)

{
  long lVar1;
  long *unaff_x19;
  undefined1 uStack0000000000000008;
  
  _dispatch_semaphore_signal(unaff_x19[5]);
  lVar1 = *unaff_x19;
  *unaff_x19 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403874(&uStack0000000000000008);
  }
  return;
}

