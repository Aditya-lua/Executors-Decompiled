
undefined8 * FUN_0065b328(void)

{
  undefined8 *puVar1;
  int iVar2;
  
  if (((bRam0000000000a2ac48 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa2ac48), iVar2 != 0)) {
    ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa2ac08,0);
    ___cxa_guard_release(0xa2ac48);
  }
  DataMemoryBarrier(2,1);
  if (puRam0000000000a2ac50 != (undefined8 *)0x0) {
    return puRam0000000000a2ac50;
  }
  __ZNSt3__15mutex4lockEv(0xa2ac08);
  DataMemoryBarrier(2,1);
  if (puRam0000000000a2ac50 == (undefined8 *)0x0) {
    puRam0000000000a2ac50 = (undefined8 *)__Znwm(8);
    *puRam0000000000a2ac50 = &UNK_00a11dc0;
    DataMemoryBarrier(2,3);
  }
  puVar1 = puRam0000000000a2ac50;
  __ZNSt3__15mutex6unlockEv(0xa2ac08);
  return puVar1;
}

