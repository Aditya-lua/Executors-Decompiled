
long FUN_006fbeac(undefined8 param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  undefined4 uStack000000000000000c;
  
  uVar1 = (int)param_3 - 1;
  if (uVar1 < *(uint *)(param_2 + 8)) {
    lVar2 = *(long *)(param_2 + 0x18) + (long)(int)uVar1 * 0x10;
  }
  else {
    lVar2 = func_0x006fb65c(param_2,param_3);
    lVar3 = __dyld_get_image_header(0);
    if (lVar2 == lVar3 + 0x4e8dd08) {
      uStack000000000000000c = 3;
      lVar2 = func_0x006fbc58(param_1,param_2);
      return lVar2;
    }
  }
  return lVar2;
}

