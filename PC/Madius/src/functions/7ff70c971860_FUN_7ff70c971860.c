/* 7ff70c971860 FUN_7ff70c971860 */

undefined8 * FUN_7ff70c971860(undefined8 *param_1,undefined8 param_2,longlong param_3)

{
  ulonglong uVar1;
  longlong lVar2;
  longlong lVar3;
  ulonglong uVar4;
  code *pcVar5;
  ulonglong uVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong *plVar10;
  undefined8 *puVar11;
  
  uVar6 = func_0x7ff70d98eeed(param_2);
  lVar2 = *(longlong *)(param_3 + 0x14);
  if (uVar6 <= 0x7ffffffffffffffeU - lVar2) {
    lVar3 = *(longlong *)(param_3 + 4);
    uVar4 = *(ulonglong *)(param_3 + 0x1c);
    *param_1 = 0;
    param_1[1] = 0;
    uVar1 = lVar2 + uVar6;
    uVar9 = 7;
    puVar11 = param_1;
    if (7 < uVar1) {
      uVar8 = uVar1 | 7;
      if (0x7ffffffffffffffe < uVar8) goto LAB_7ff70c97198e;
      uVar9 = 10;
      if (10 < uVar8) {
        uVar9 = uVar8;
      }
      if (uVar8 < 0x7ff) {
        puVar11 = (undefined8 *)FUN_7ff70ca8ff40(uVar9 * 2 + 2);
      }
      else {
        if (0x7fffffffffffffeb < uVar8) goto LAB_7ff70c97198e;
        lVar7 = FUN_7ff70ca8ff40(uVar9 * 2 + 0x29);
        puVar11 = (undefined8 *)(lVar7 + 0x27U & 0xffffffffffffffe0);
        puVar11[-1] = lVar7;
      }
      *param_1 = puVar11;
    }
    plVar10 = (longlong *)(param_3 + 4);
    if (7 < uVar4) {
      plVar10 = (longlong *)lVar3;
    }
    param_1[2] = uVar1;
    param_1[3] = uVar9;
    FUN_7ff70cb12b60(puVar11,param_2,uVar6 * 2);
    FUN_7ff70cb12b60((longlong)puVar11 + uVar6 * 2,plVar10,lVar2 * 2);
    *(undefined2 *)((longlong)puVar11 + uVar1 * 2) = 0;
    return param_1;
  }
  FUN_7ff70ca00780();
LAB_7ff70c97198e:
  FUN_7ff70ca007a0();
  pcVar5 = (code *)swi(3);
  puVar11 = (undefined8 *)(*pcVar5)();
  return puVar11;
}


