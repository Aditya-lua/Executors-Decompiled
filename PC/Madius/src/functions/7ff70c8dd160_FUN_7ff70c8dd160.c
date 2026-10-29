/* 7ff70c8dd160 FUN_7ff70c8dd160 */

void FUN_7ff70c8dd160(longlong *param_1)

{
  longlong lVar1;
  longlong lVar2;
  ulonglong uVar3;
  uint uVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong in_stack_ffffffffffffffd8;
  
  uVar6 = (ulonglong)(int)param_1[2];
  if ((longlong)uVar6 < 0) {
    if (*(char *)(*param_1 + 0xc) != '\x01') {
      return;
    }
    puVar5 = (undefined8 *)param_1[1];
    uVar3 = puVar5[2];
    uVar4 = (int)uVar3 + (int)param_1[2];
    uVar6 = 0;
    if (0 < (int)uVar4) {
      uVar6 = (ulonglong)uVar4;
    }
    uVar7 = uVar6 - uVar3;
    if (uVar6 < uVar3 || uVar7 == 0) {
      puVar5[2] = uVar6;
      if (0xf < (ulonglong)puVar5[3]) {
        puVar5 = (undefined8 *)*puVar5;
      }
    }
    else {
      if (puVar5[3] - uVar3 < uVar7) {
        FUN_7ff70ca418b0(puVar5,uVar7,uVar7,uVar7,in_stack_ffffffffffffffd8 & 0xffffffffffffff00,
                         0xfffffffffffffffe);
        return;
      }
      puVar5[2] = uVar6;
      if (0xf < (ulonglong)puVar5[3]) {
        puVar5 = (undefined8 *)*puVar5;
      }
      FUN_7ff70cb12b80(uVar3 + (longlong)puVar5,0);
    }
  }
  else {
    puVar5 = (undefined8 *)param_1[1];
    lVar1 = param_1[3];
    lVar2 = puVar5[2];
    if ((ulonglong)(puVar5[3] - lVar2) < uVar6) {
      FUN_7ff70ca00b60(puVar5,uVar6,uVar6,lVar1,uVar6);
      return;
    }
    uVar6 = lVar2 + uVar6;
    puVar5[2] = uVar6;
    if (0xf < (ulonglong)puVar5[3]) {
      puVar5 = (undefined8 *)*puVar5;
    }
    FUN_7ff70cb12b70(lVar2 + (longlong)puVar5,lVar1);
  }
  *(undefined1 *)((longlong)puVar5 + uVar6) = 0;
  return;
}


