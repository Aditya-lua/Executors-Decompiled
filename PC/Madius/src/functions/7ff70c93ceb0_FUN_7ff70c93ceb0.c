/* 7ff70c93ceb0 FUN_7ff70c93ceb0 */

undefined8 * FUN_7ff70c93ceb0(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  undefined8 *puVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  undefined8 *puVar10;
  
  lVar2 = param_2[2];
  uVar5 = func_0x7ff70d8f293a(param_3);
  if (uVar5 <= 0x7ffffffffffffffeU - lVar2) {
    puVar7 = (undefined8 *)*param_2;
    uVar3 = param_2[3];
    *param_1 = 0;
    param_1[1] = 0;
    uVar1 = uVar5 + lVar2;
    uVar9 = 7;
    puVar10 = param_1;
    if (7 < uVar1) {
      uVar8 = uVar1 | 7;
      if (0x7ffffffffffffffe < uVar8) goto LAB_7ff70c93cfdd;
      uVar9 = 10;
      if (10 < uVar8) {
        uVar9 = uVar8;
      }
      if (uVar8 < 0x7ff) {
        puVar10 = (undefined8 *)FUN_7ff70ca8ff40(uVar9 * 2 + 2);
      }
      else {
        if (0x7fffffffffffffeb < uVar8) goto LAB_7ff70c93cfdd;
        lVar6 = FUN_7ff70ca8ff40(uVar9 * 2 + 0x29);
        puVar10 = (undefined8 *)(lVar6 + 0x27U & 0xffffffffffffffe0);
        puVar10[-1] = lVar6;
      }
      *param_1 = puVar10;
    }
    if (7 < uVar3) {
      param_2 = puVar7;
    }
    param_1[2] = uVar1;
    param_1[3] = uVar9;
    FUN_7ff70cb12b60(puVar10,param_2,lVar2 * 2);
    FUN_7ff70cb12b60((longlong)puVar10 + lVar2 * 2,param_3,uVar5 * 2);
    *(undefined2 *)((longlong)puVar10 + uVar1 * 2) = 0;
    return param_1;
  }
  FUN_7ff70ca00780();
LAB_7ff70c93cfdd:
  FUN_7ff70ca007a0();
  pcVar4 = (code *)swi(3);
  puVar7 = (undefined8 *)(*pcVar4)();
  return puVar7;
}


