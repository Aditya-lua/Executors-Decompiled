
undefined8 FUN_0029afb4(void)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  auVar4 = func_0x0079d9f4();
  uVar3 = auVar4._8_8_;
  plVar1 = auVar4._0_8_;
  if ((ulong)(long)*(int *)((long)plVar1 + 0xc) < uVar3) {
    if (0x7fffff < uVar3) {
      func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x161);
      return 0;
    }
    if ((*(byte *)((long)plVar1 + 0x14) >> 1 & 1) != 0) {
      func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
      return 0;
    }
    lVar2 = func_0x0036e358(uVar3,8);
    if (lVar2 == 0) {
      return 0;
    }
    if ((int)plVar1[1] != 0) {
      _memcpy(lVar2,*plVar1,(long)(int)plVar1[1] << 3);
    }
    func_0x0036e3d8(*plVar1);
    *plVar1 = lVar2;
    *(int *)((long)plVar1 + 0xc) = auVar4._8_4_;
  }
  return 1;
}

