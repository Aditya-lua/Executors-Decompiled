/* 7ff70c94fdd0 FUN_7ff70c94fdd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c94fdd0(longlong *param_1,undefined8 param_2,longlong param_3)

{
  longlong lVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  undefined8 uVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  
  lVar1 = param_1[1];
  uVar7 = param_1[3];
  uVar6 = lVar1 + param_3 + 1;
  if (uVar7 < uVar6) {
LAB_7ff70c94fdf2:
    (*_DAT_7ff70cbebad8)(*param_1);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    uVar4 = 0x1b;
  }
  else {
    uVar2 = param_1[2];
    uVar3 = uVar2;
    if (uVar2 == 0) {
      if ((0x1f < uVar7) && (uVar7 = 0x20, 0x20 < uVar6)) {
        uVar7 = uVar6;
      }
    }
    else {
      do {
        uVar8 = uVar3;
        uVar3 = uVar8 * 2;
      } while (uVar8 < uVar6);
      if (uVar8 < uVar7) {
        uVar7 = uVar8;
      }
    }
    lVar5 = *param_1;
    if (uVar7 != uVar2) {
      lVar5 = (*_DAT_7ff70cbebae0)(lVar5,uVar7);
      if (lVar5 == 0) goto LAB_7ff70c94fdf2;
      *param_1 = lVar5;
      param_1[2] = uVar7;
    }
    if (param_3 != 0) {
      FUN_7ff70cb12b60(lVar5 + lVar1,param_2);
      lVar5 = *param_1;
    }
    param_1[1] = lVar1 + param_3;
    *(undefined1 *)(lVar5 + lVar1 + param_3) = 0;
    uVar4 = 0;
  }
  return uVar4;
}


