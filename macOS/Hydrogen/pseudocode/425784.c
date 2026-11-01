
long FUN_00425784(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined8 uStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  undefined8 uStack_38;
  long alStack_10 [2];
  
  lVar2 = (long)register0x00000008 + 0x20;
  if (param_2 < 0) {
    uVar3 = 0;
  }
  else {
    if (param_2 == 0) {
      lVar1 = 1;
LAB_004257c4:
      _memcpy(lVar1,param_1,param_2);
      return lVar1;
    }
    uVar3 = 1;
    lVar1 = func_0x00187bd0(param_2,1);
    if (lVar1 != 0) goto LAB_004257c4;
  }
  auVar4 = func_0x007a1f00(uVar3,param_2,&UNK_009d90d8);
  lVar1 = auVar4._8_8_;
  alStack_10[1] = 0x425804;
  alStack_10[0] = lVar2;
  if (lVar1 < 0) {
    uVar3 = 0;
LAB_00425878:
    lVar2 = func_0x007a1f00(uVar3,lVar1,&UNK_009d90d8);
    uStack_38 = 0x42588c;
    uStack_50 = *(undefined8 *)(lVar2 + 8);
    uStack_48 = *(undefined8 *)(lVar2 + 0x10);
    plStack_40 = alStack_10;
    lVar2 = func_0x0046d710(&uStack_50);
    return lVar2;
  }
  if (lVar1 == 0) {
    lVar2 = 1;
  }
  else {
    uVar3 = 1;
    lVar2 = func_0x00187bd0(lVar1,1);
    if (lVar2 == 0) goto LAB_00425878;
  }
  _memcpy(lVar2,auVar4._0_8_,lVar1);
  return lVar2;
}

