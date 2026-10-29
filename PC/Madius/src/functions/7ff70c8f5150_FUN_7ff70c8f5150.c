/* 7ff70c8f5150 FUN_7ff70c8f5150 */

undefined8 * FUN_7ff70c8f5150(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  longlong lVar5;
  undefined8 *puVar6;
  ulonglong uVar7;
  
  puVar6 = param_3 + 2;
  if (0xf < (ulonglong)param_3[3]) {
    param_3 = (undefined8 *)*param_3;
  }
  lVar2 = FUN_7ff70c95a780(*param_1,param_3,*(undefined4 *)puVar6);
  if (lVar2 == 0) {
    *param_2 = 0;
    param_2[1] = 0;
    param_2[2] = 0;
    param_2[3] = 0xf;
  }
  else {
    *param_2 = 0;
    param_2[1] = 0;
    uVar3 = FUN_7ff70cb12e80(lVar2);
    if ((longlong)uVar3 < 0) {
      FUN_7ff70ca00780();
      pcVar1 = (code *)swi(3);
      puVar6 = (undefined8 *)(*pcVar1)();
      return puVar6;
    }
    uVar7 = 0xf;
    puVar6 = param_2;
    if (0xf < uVar3) {
      uVar4 = uVar3 | 0xf;
      uVar7 = 0x16;
      if (0x16 < uVar4) {
        uVar7 = uVar4;
      }
      if (uVar4 < 0xfff) {
        puVar6 = (undefined8 *)FUN_7ff70ca8ff40(uVar7 + 1);
      }
      else {
        lVar5 = FUN_7ff70ca8ff40(uVar7 + 0x28);
        puVar6 = (undefined8 *)(lVar5 + 0x27U & 0xffffffffffffffe0);
        puVar6[-1] = lVar5;
      }
      *param_2 = puVar6;
    }
    param_2[2] = uVar3;
    param_2[3] = uVar7;
    FUN_7ff70cb12b60(puVar6,lVar2,uVar3);
    *(undefined1 *)((longlong)puVar6 + uVar3) = 0;
    FUN_7ff70c95ae90(lVar2);
  }
  return param_2;
}


