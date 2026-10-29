/* 7ff70c95c280 FUN_7ff70c95c280 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c95c280(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined1 *puVar1;
  longlong lVar2;
  undefined8 uVar3;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 *puStack_48;
  char cStack_40;
  undefined8 *puStack_38;
  undefined1 auStack_30 [32];
  
  puStack_48 = auStack_30;
  uStackX_10 = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  puStack_38 = &uStackX_10;
  FUN_7ff70c94fcf0(puStack_48,8000000);
  cStack_40 = '\0';
  FUN_7ff70c95e7d0(&puStack_48,param_1,&uStackX_10);
  puVar1 = puStack_48;
  if (cStack_40 == '\x01') {
    FUN_7ff70c94fd10(puStack_48);
    return 0;
  }
  lVar2 = FUN_7ff70c94fff0(puStack_48);
  if (lVar2 != 0) {
    uVar3 = FUN_7ff70c94ffd0(puVar1);
    return uVar3;
  }
  uVar3 = (*_DAT_7ff70cbebae8)(&UNK_7ff70cb923a7);
  return uVar3;
}


