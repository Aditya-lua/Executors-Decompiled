
void FUN_004aaa54(undefined8 *param_1,undefined8 *param_2)

{
  long *plVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  
  uVar4 = param_1[1];
  uVar2 = param_1[2];
  plVar1 = (long *)*param_2;
  lVar6 = param_2[1];
  if (uVar4 < uVar2) {
    uVar5 = *param_1;
    lVar7 = param_2[2];
    do {
      uVar3 = func_0x00486da8(uVar5,uVar4);
      uVar4 = uVar4 + 1;
      *(undefined8 *)(lVar7 + lVar6 * 8) = uVar3;
      lVar6 = lVar6 + 1;
    } while (uVar2 != uVar4);
  }
  *plVar1 = lVar6;
  return;
}

