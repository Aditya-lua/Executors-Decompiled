
undefined8 * FUN_005ff684(long param_1,long param_2)

{
  code *pcVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 uVar4;
  
  do {
    *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  __Unwind_Resume();
  puVar2 = (undefined8 *)func_0x0001753c();
  DataMemoryBarrier(2,3);
  if ((bRam0000000000a3c148 & 1) == 0) {
    puRam0000000000a2ab70 = &DAT_005f6230;
    puRam0000000000a2ab78 = &DAT_005f627c;
    puRam0000000000a2aa98 = &DAT_005f4e6c;
    puRam0000000000a2aaa0 = &DAT_005f4ed4;
    puRam0000000000a2aaa8 = &DAT_005f50a8;
    puRam0000000000a2ab28 = &DAT_005f5e0c;
    puRam0000000000a2ab30 = &DAT_005f5e38;
    puRam0000000000a2ab38 = &DAT_005f5eec;
    puRam0000000000a2aae0 = &DAT_005f57fc;
    puRam0000000000a2aae8 = &DAT_005f5844;
    puRam0000000000a2aaf0 = &DAT_005f5984;
    puRam0000000000a2ab80 = &DAT_005f63c0;
    puRam0000000000a2aab8 = &DAT_005f6838;
    puRam0000000000a2ab48 = &DAT_005f9574;
    puRam0000000000a2ab00 = &DAT_005f850c;
    puRam0000000000a2ab90 = &DAT_005fa300;
    bRam0000000000a3c148 = 1;
    DataMemoryBarrier(2,3);
  }
  *puVar2 = &UNK_009f5d60;
  puVar2[3] = 0;
  puVar2[4] = 0;
  puVar2[2] = 0x1fffffffffffffff;
  uVar3 = func_0x005ff820(puVar2);
  if ((uVar3 & 1) == 0) {
    uVar4 = ___cxa_allocate_exception(0x28);
    func_0x005ff980();
    ___cxa_throw(uVar4,&UNK_009f5d88,&DAT_005ffa2c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5ff7f0);
    (*pcVar1)();
  }
  return puVar2;
}

