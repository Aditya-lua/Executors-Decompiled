
ulong FUN_0027e784(long *param_1,undefined8 param_2,ulong param_3)

{
  uint uVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uStack0000000000000008;
  
  if ((*param_1 == 0) || (*(long *)(*param_1 + 0x10) == 0)) {
    uVar3 = 0x73;
    uVar4 = 0xf3;
LAB_0027e884:
    func_0x0028f83c(0x11,0,uVar3,"/aws-lc/crypto/bio/bio.c",uVar4);
    return 0xfffffffe;
  }
  if ((int)param_3 < 1) {
    return 0;
  }
  if (((code *)param_1[2] == (code *)0x0) ||
     (uVar2 = (*(code *)param_1[2])(param_1,3,param_2,param_3 & 0xffffffff,0,0,1,0), 0 < (int)uVar2)
     ) {
    if ((int)param_1[4] == 0) {
      uVar3 = 0x72;
      uVar4 = 0x102;
      goto LAB_0027e884;
    }
    uVar2 = (**(code **)(*param_1 + 0x10))(param_1,param_2,param_3);
    uVar1 = (uint)uVar2;
    if (0 < (int)uVar1) {
      param_1[10] = param_1[10] + (uVar2 & 0xffffffff);
    }
    if ((code *)param_1[2] != (code *)0x0) {
      uStack0000000000000008 = (ulong)(uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU));
      uVar1 = (*(code *)param_1[2])
                        (param_1,0x83,param_2,param_3 & 0xffffffff,0,0,uVar2,&uStack0000000000000008
                        );
      if ((int)uVar1 < 1) {
        uStack0000000000000008._0_4_ = uVar1;
      }
      uVar2 = (ulong)(uint)uStack0000000000000008;
    }
  }
  return uVar2;
}

