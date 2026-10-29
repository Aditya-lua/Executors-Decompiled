/* 7ff70c933060 FUN_7ff70c933060 */

undefined8 * FUN_7ff70c933060(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  longlong lVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar2 = FUN_7ff70cb12e80(param_2);
  if ((longlong)uVar2 < 0) {
    FUN_7ff70ca00780();
  }
  else {
    uVar6 = 0xf;
    puVar5 = param_1;
    if (0xf < uVar2) {
      uVar3 = uVar2 | 0xf;
      uVar6 = 0x16;
      if (0x16 < uVar3) {
        uVar6 = uVar3;
      }
      if (uVar3 < 0xfff) {
        puVar5 = (undefined8 *)FUN_7ff70ca8ff40(uVar6 + 1);
      }
      else {
        lVar4 = FUN_7ff70ca8ff40(uVar6 + 0x28);
        puVar5 = (undefined8 *)(lVar4 + 0x27U & 0xffffffffffffffe0);
        puVar5[-1] = lVar4;
      }
      *param_1 = puVar5;
    }
    param_1[2] = uVar2;
    param_1[3] = uVar6;
    FUN_7ff70cb12b60(puVar5,param_2,uVar2);
    *(undefined1 *)((longlong)puVar5 + uVar2) = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[6] = 0;
    param_1[7] = 0;
    uVar2 = FUN_7ff70cb12e80(param_3);
    if (-1 < (longlong)uVar2) {
      uVar6 = 0xf;
      puVar5 = param_1 + 4;
      if (0xf < uVar2) {
        uVar3 = uVar2 | 0xf;
        uVar6 = 0x16;
        if (0x16 < uVar3) {
          uVar6 = uVar3;
        }
        if (uVar3 < 0xfff) {
          puVar5 = (undefined8 *)FUN_7ff70ca8ff40(uVar6 + 1);
        }
        else {
          lVar4 = FUN_7ff70ca8ff40(uVar6 + 0x28);
          puVar5 = (undefined8 *)(lVar4 + 0x27U & 0xffffffffffffffe0);
          puVar5[-1] = lVar4;
        }
        param_1[4] = puVar5;
      }
      param_1[6] = uVar2;
      param_1[7] = uVar6;
      FUN_7ff70cb12b60(puVar5,param_3,uVar2);
      *(undefined1 *)((longlong)puVar5 + uVar2) = 0;
      return param_1;
    }
  }
  FUN_7ff70ca00780();
  pcVar1 = (code *)swi(3);
  puVar5 = (undefined8 *)(*pcVar1)();
  return puVar5;
}


