
void FUN_0026d330(undefined8 *param_1,undefined8 *param_2)

{
  undefined1 uVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lStack_28;
  undefined1 auStack_20 [16];
  long lStack_10;
  undefined8 uStack_8;
  
  lVar3 = param_2[3];
  if (lVar3 < 0) {
    uVar5 = 0;
LAB_0026d3c4:
    auStack_20 = func_0x007a1f00(uVar5,lVar3,&UNK_009cbc38);
    uStack_8 = 0x26d3d8;
    lStack_28 = auStack_20._0_8_ + 0x28;
    lStack_10 = (long)register0x00000008 + 0x30;
    func_0x002668e0(auStack_20._8_8_,&lStack_28);
    return;
  }
  uVar4 = param_2[2];
  if (lVar3 == 0) {
    lVar2 = 1;
  }
  else {
    uVar5 = 1;
    lVar2 = func_0x00187bd0(lVar3,1);
    if (lVar2 == 0) goto LAB_0026d3c4;
  }
  _memcpy(lVar2,uVar4,lVar3);
  uVar5 = param_2[4];
  uVar1 = *(undefined1 *)(param_2 + 5);
  param_1[2] = lVar3;
  param_1[3] = lVar2;
  param_1[4] = lVar3;
  param_1[5] = uVar5;
  *(undefined1 *)(param_1 + 6) = uVar1;
  uVar5 = *param_2;
  param_1[1] = param_2[1];
  *param_1 = uVar5;
  return;
}

