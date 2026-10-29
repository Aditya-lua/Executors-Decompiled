/* 7ff70c93e580 FUN_7ff70c93e580 */

ulonglong *
FUN_7ff70c93e580(ulonglong *param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4)

{
  ulonglong uVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  code *pcVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  ulonglong uVar12;
  longlong lVar13;
  ulonglong *puVar14;
  ulonglong uVar15;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar2 = param_3[2];
  uVar3 = param_4[2];
  uVar1 = uVar3 + uVar2;
  if ((ulonglong)param_3[3] < (ulonglong)param_4[3] || param_3[3] - uVar2 < uVar3) {
    if (param_4[3] - uVar3 < uVar2) {
      if (uVar3 <= 0x7ffffffffffffffe - uVar2) {
        uVar12 = uVar1 | 7;
        if (uVar12 < 0x7fffffffffffffff) {
          uVar15 = 10;
          if (10 < uVar12) {
            uVar15 = uVar12;
          }
          if (uVar12 < 0x7ff) {
            uVar12 = FUN_7ff70ca8ff40(uVar15 * 2 + 2);
LAB_7ff70c93e70c:
            *param_1 = uVar12;
            param_1[2] = uVar1;
            param_1[3] = uVar15;
            if (7 < (ulonglong)param_3[3]) {
              param_3 = (undefined8 *)*param_3;
            }
            FUN_7ff70cb12b60(uVar12,param_3,uVar2 * 2);
            if (7 < (ulonglong)param_4[3]) {
              param_4 = (undefined8 *)*param_4;
            }
            FUN_7ff70cb12b60(uVar12 + uVar2 * 2,param_4,uVar3 * 2 + 2);
            return param_1;
          }
          if (uVar12 < 0x7fffffffffffffec) {
            lVar13 = FUN_7ff70ca8ff40(uVar15 * 2 + 0x29);
            uVar12 = lVar13 + 0x27U & 0xffffffffffffffe0;
            *(longlong *)(uVar12 - 8) = lVar13;
            goto LAB_7ff70c93e70c;
          }
        }
        FUN_7ff70ca007a0();
      }
      FUN_7ff70ca00780();
      pcVar4 = (code *)swi(3);
      puVar14 = (ulonglong *)(*pcVar4)();
      return puVar14;
    }
    uVar5 = *(undefined4 *)param_4;
    uVar6 = *(undefined4 *)((longlong)param_4 + 4);
    uVar7 = *(undefined4 *)(param_4 + 1);
    uVar8 = *(undefined4 *)((longlong)param_4 + 0xc);
    uVar9 = *(undefined4 *)((longlong)param_4 + 0x14);
    uVar10 = *(undefined4 *)(param_4 + 3);
    uVar11 = *(undefined4 *)((longlong)param_4 + 0x1c);
    *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_4 + 2);
    *(undefined4 *)((longlong)param_1 + 0x14) = uVar9;
    *(undefined4 *)(param_1 + 3) = uVar10;
    *(undefined4 *)((longlong)param_1 + 0x1c) = uVar11;
    *(undefined4 *)param_1 = uVar5;
    *(undefined4 *)((longlong)param_1 + 4) = uVar6;
    *(undefined4 *)(param_1 + 1) = uVar7;
    *(undefined4 *)((longlong)param_1 + 0xc) = uVar8;
    param_4[2] = 0;
    param_4[3] = 7;
    *(undefined2 *)param_4 = 0;
    uVar12 = *param_1;
    lVar13 = uVar2 * 2;
    FUN_7ff70cb12b70(uVar12 + uVar2 * 2,uVar12,uVar3 * 2 + 2);
    if (7 < (ulonglong)param_3[3]) {
      param_3 = (undefined8 *)*param_3;
    }
  }
  else {
    uVar5 = *(undefined4 *)param_3;
    uVar6 = *(undefined4 *)((longlong)param_3 + 4);
    uVar7 = *(undefined4 *)(param_3 + 1);
    uVar8 = *(undefined4 *)((longlong)param_3 + 0xc);
    uVar12 = param_3[3];
    param_1[2] = param_3[2];
    param_1[3] = uVar12;
    *(undefined4 *)param_1 = uVar5;
    *(undefined4 *)((longlong)param_1 + 4) = uVar6;
    *(undefined4 *)(param_1 + 1) = uVar7;
    *(undefined4 *)((longlong)param_1 + 0xc) = uVar8;
    param_3[2] = 0;
    param_3[3] = 7;
    *(undefined2 *)param_3 = 0;
    puVar14 = param_1;
    if (7 < param_1[3]) {
      puVar14 = (ulonglong *)*param_1;
    }
    param_3 = param_4;
    if (7 < (ulonglong)param_4[3]) {
      param_3 = (undefined8 *)*param_4;
    }
    uVar12 = (longlong)puVar14 + uVar2 * 2;
    lVar13 = uVar3 * 2 + 2;
  }
  FUN_7ff70cb12b60(uVar12,param_3,lVar13);
  param_1[2] = uVar1;
  return param_1;
}


