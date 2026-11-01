
undefined8 FUN_0029b014(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined4 unaff_w19;
  long *unaff_x20;
  
  if ((*(byte *)(param_1 + 0x14) >> 1 & 1) != 0) {
    func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
    return 0;
  }
  lVar1 = func_0x0036e358();
  uVar2 = 0;
  if (lVar1 != 0) {
    if ((int)unaff_x20[1] != 0) {
      _memcpy(lVar1,*unaff_x20,(long)(int)unaff_x20[1] << 3);
    }
    func_0x0036e3d8(*unaff_x20);
    *unaff_x20 = lVar1;
    *(undefined4 *)((long)unaff_x20 + 0xc) = unaff_w19;
    uVar2 = 1;
  }
  return uVar2;
}

