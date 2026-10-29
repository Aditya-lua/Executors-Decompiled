/* 7ff70c926110 FUN_7ff70c926110 */

ulonglong * FUN_7ff70c926110(ulonglong *param_1,longlong *param_2)

{
  longlong lVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  ulonglong *puVar5;
  longlong lVar6;
  
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  lVar1 = *param_2;
  lVar6 = param_2[1] - lVar1;
  if (lVar6 != 0) {
    uVar3 = param_2[1] - lVar1 >> 4;
    if (uVar3 >> 0x3c != 0) {
      FUN_7ff70c7ac850();
      pcVar2 = (code *)swi(3);
      puVar5 = (ulonglong *)(*pcVar2)();
      return puVar5;
    }
    if (uVar3 < 0x100) {
      uVar3 = FUN_7ff70ca8ff40(lVar6);
    }
    else {
      lVar4 = FUN_7ff70ca8ff40(lVar6 + 0x27);
      uVar3 = lVar4 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar3 - 8) = lVar4;
    }
    *param_1 = uVar3;
    param_1[1] = uVar3;
    param_1[2] = lVar6 + uVar3;
    FUN_7ff70cb12b60(uVar3,lVar1,lVar6);
    param_1[1] = lVar6 + uVar3;
  }
  return param_1;
}


