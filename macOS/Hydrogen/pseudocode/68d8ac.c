
long FUN_0068d8ac(void)

{
  long unaff_x20;
  long lVar1;
  long unaff_x21;
  
  if (unaff_x20 != 0) {
    return unaff_x20;
  }
  __ZNSt3__15mutex4lockEv(0xa2ad48);
  lVar1 = *(long *)(unaff_x21 + 0xd90);
  DataMemoryBarrier(2,1);
  if (lVar1 == 0) {
    lVar1 = func_0x00694478();
    DataMemoryBarrier(2,3);
    *(long *)(unaff_x21 + 0xd90) = lVar1;
  }
  __ZNSt3__15mutex6unlockEv(0xa2ad48);
  return lVar1;
}

