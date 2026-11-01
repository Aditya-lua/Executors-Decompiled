
long FUN_0068d89c(void)

{
  long lVar1;
  int iVar2;
  uint in_w8;
  
  if (((in_w8 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa2ad88), iVar2 != 0)) {
    ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa2ad48,0);
    ___cxa_guard_release(0xa2ad88);
  }
  DataMemoryBarrier(2,1);
  if (lRam0000000000a2ad90 != 0) {
    return lRam0000000000a2ad90;
  }
  __ZNSt3__15mutex4lockEv(0xa2ad48);
  DataMemoryBarrier(2,1);
  if (lRam0000000000a2ad90 == 0) {
    lRam0000000000a2ad90 = func_0x00694478();
    DataMemoryBarrier(2,3);
  }
  lVar1 = lRam0000000000a2ad90;
  __ZNSt3__15mutex6unlockEv(0xa2ad48);
  return lVar1;
}

