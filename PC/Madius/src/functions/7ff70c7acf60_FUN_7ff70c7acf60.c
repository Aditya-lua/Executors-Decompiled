/* 7ff70c7acf60 FUN_7ff70c7acf60 */

ulonglong * FUN_7ff70c7acf60(ulonglong *param_1,ulonglong *param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  ulonglong *puVar5;
  ulonglong uVar6;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar1 = param_2[2];
  puVar5 = param_2;
  if (0xf < param_2[3]) {
    puVar5 = (ulonglong *)*param_2;
  }
  if ((longlong)uVar1 < 0) {
    FUN_7ff70ca00780();
  }
  else {
    if (uVar1 < 0x10) {
      param_1[2] = uVar1;
      param_1[3] = 0xf;
      uVar1 = puVar5[1];
      *param_1 = *puVar5;
      param_1[1] = uVar1;
    }
    else {
      uVar3 = uVar1 | 0xf;
      uVar6 = 0x16;
      if (0x16 < uVar3) {
        uVar6 = uVar3;
      }
      if (uVar3 < 0xfff) {
        uVar3 = FUN_7ff70ca8ff40(uVar6 + 1);
      }
      else {
        lVar4 = FUN_7ff70ca8ff40(uVar6 + 0x28);
        uVar3 = lVar4 + 0x27U & 0xffffffffffffffe0;
        *(longlong *)(uVar3 - 8) = lVar4;
      }
      *param_1 = uVar3;
      param_1[2] = uVar1;
      param_1[3] = uVar6;
      FUN_7ff70cb12b60(uVar3,puVar5,uVar1 + 1);
    }
    param_1[6] = 0;
    param_1[7] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    uVar1 = param_2[6];
    if (param_2[7] < 0x10) {
      param_2 = param_2 + 4;
    }
    else {
      param_2 = (ulonglong *)param_2[4];
    }
    if (-1 < (longlong)uVar1) {
      if (uVar1 < 0x10) {
        param_1[6] = uVar1;
        param_1[7] = 0xf;
        uVar1 = param_2[1];
        param_1[4] = *param_2;
        param_1[5] = uVar1;
      }
      else {
        uVar3 = uVar1 | 0xf;
        uVar6 = 0x16;
        if (0x16 < uVar3) {
          uVar6 = uVar3;
        }
        if (uVar3 < 0xfff) {
          uVar3 = FUN_7ff70ca8ff40(uVar6 + 1);
        }
        else {
          lVar4 = FUN_7ff70ca8ff40(uVar6 + 0x28);
          uVar3 = lVar4 + 0x27U & 0xffffffffffffffe0;
          *(longlong *)(uVar3 - 8) = lVar4;
        }
        param_1[4] = uVar3;
        param_1[6] = uVar1;
        param_1[7] = uVar6;
        FUN_7ff70cb12b60(uVar3,param_2,uVar1 + 1);
      }
      return param_1;
    }
  }
  FUN_7ff70ca00780();
  pcVar2 = (code *)swi(3);
  puVar5 = (ulonglong *)(*pcVar2)();
  return puVar5;
}


