/* 7ff70c962534 FUN_7ff70c962534 */

undefined8 * FUN_7ff70c962534(undefined8 *param_1,longlong *param_2)

{
  code *pcVar1;
  ulonglong uVar2;
  longlong lVar3;
  ulonglong uVar4;
  undefined *puVar5;
  undefined8 *puVar6;
  ulonglong uVar7;
  
  uVar7 = 0;
  uVar2 = FUN_7ff70c963110(param_2,&UNK_7ff70cb90bfa,0);
  if (uVar2 == 0xffffffffffffffff) {
    puVar5 = &UNK_7ff70cb923a7;
  }
  else {
    lVar3 = FUN_7ff70c924340(param_2,&UNK_7ff70cb90bfa,0xffffffffffffffff);
    uVar4 = param_2[1] - uVar2;
    if ((ulonglong)param_2[1] < uVar2) {
      FUN_7ff70ca9ff70();
      pcVar1 = (code *)swi(3);
      puVar6 = (undefined8 *)(*pcVar1)();
      return puVar6;
    }
    uVar7 = (lVar3 - uVar2) + 1;
    if (uVar4 < uVar7) {
      uVar7 = uVar4;
    }
    puVar5 = (undefined *)(*param_2 + uVar2);
  }
  *param_1 = puVar5;
  param_1[1] = uVar7;
  return param_1;
}


