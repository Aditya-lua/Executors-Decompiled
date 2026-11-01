
undefined8 FUN_005f00b0(long param_1)

{
  int iVar1;
  undefined8 *puVar2;
  
  iVar1 = ___cxa_guard_acquire(param_1 + 0x100);
  if (iVar1 == 0) {
    return 0xa3c0f8;
  }
  puVar2 = (undefined8 *)func_0x005edf2c(0xa3c0f8,1);
  *puVar2 = &UNK_009f57d8;
  ___cxa_guard_release(puVar2 + 1);
  return 0xa3c0f8;
}

