
undefined8 * FUN_00661604(undefined8 param_1)

{
  undefined8 *puVar1;
  
  ___cxa_atexit(param_1,0xa2acf8,0);
  ___cxa_guard_release(0xa2ad38);
  DataMemoryBarrier(2,1);
  if (puRam0000000000a2ad40 != (undefined8 *)0x0) {
    return puRam0000000000a2ad40;
  }
  __ZNSt3__15mutex4lockEv(0xa2acf8);
  DataMemoryBarrier(2,1);
  if (puRam0000000000a2ad40 == (undefined8 *)0x0) {
    puRam0000000000a2ad40 = (undefined8 *)__Znwm(8);
    *puRam0000000000a2ad40 = &UNK_00a0bc28;
    DataMemoryBarrier(2,3);
  }
  puVar1 = puRam0000000000a2ad40;
  __ZNSt3__15mutex6unlockEv(0xa2acf8);
  return puVar1;
}

