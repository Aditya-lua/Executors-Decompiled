/* 7ff70c96a260 FUN_7ff70c96a260 */

undefined4 * FUN_7ff70c96a260(undefined4 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  undefined1 uStack_50;
  undefined *puStack_48;
  undefined4 uStack_40;
  undefined8 uStack_38;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  longlong lStack_28;
  char cStack_20;
  undefined8 uStack_18;
  
  uStack_18 = 0xfffffffffffffffe;
  uStack_68 = *(undefined4 *)param_2;
  uStack_64 = *(undefined4 *)((longlong)param_2 + 4);
  uStack_58 = *param_2;
  uStack_60 = *(undefined4 *)(param_2 + 1);
  uStack_5c = *(undefined4 *)((longlong)param_2 + 0xc);
  uStack_50 = 0;
  FUN_7ff70c96a460(&uStack_68,&uStack_38);
  if (cStack_20 == '\0') {
    *param_1 = (undefined4)uStack_38;
    param_1[1] = uStack_38._4_4_;
    param_1[2] = uStack_30;
    param_1[3] = uStack_2c;
    *(longlong *)(param_1 + 4) = lStack_28;
    *(undefined1 *)(param_1 + 6) = 1;
  }
  else {
    puStack_48 = &UNK_7ff70cb83e3d;
    uStack_40 = 0x23a;
    FUN_7ff70c962038(CONCAT71(0x7ff70cb83e,cStack_20 == '\x01'),1,&UNK_7ff70cb8bdf2,
                     &UNK_7ff70cb8e7a3,&puStack_48,0);
    *(undefined1 *)(param_1 + 6) = 0;
    if ((cStack_20 == '\0') && (uStack_38 != 0)) {
      uVar3 = lStack_28 - uStack_38;
      lVar2 = uStack_38;
      if (0xfff < uVar3) {
        lVar2 = *(longlong *)(uStack_38 + -8);
        if (0x1f < (ulonglong)((uStack_38 + -8) - lVar2)) {
                    /* WARNING: Does not return */
          pcVar1 = (code *)invalidInstructionException();
          (*pcVar1)();
        }
        uVar3 = uVar3 + 0x27;
      }
      thunk_FUN_7ff70ca90250(lVar2,uVar3);
    }
  }
  return param_1;
}


