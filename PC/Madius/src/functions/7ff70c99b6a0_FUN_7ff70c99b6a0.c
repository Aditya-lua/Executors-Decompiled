/* 7ff70c99b6a0 FUN_7ff70c99b6a0 */

void FUN_7ff70c99b6a0(int param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
                     longlong param_5)

{
  code *pcVar1;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_78 [56];
  undefined1 auStack_40 [56];
  
  uStack_90 = *(undefined8 *)(&UNK_7ff70cb6d850 + (longlong)param_1 * 8);
  uStack_98 = *(undefined8 *)(&UNK_7ff70cb6d870 + (longlong)param_1 * 8);
  uStack_88 = param_2;
  uStack_80 = param_3;
  if (param_5 == 0) {
    FUN_7ff70c99bb30(auStack_40,&UNK_7ff70cb91490,&uStack_90,param_4,param_4 + 8,&uStack_80,
                     &uStack_98,&uStack_88);
    FUN_7ff70cb12a50(auStack_40,&UNK_7ff70cbcadd0);
  }
  FUN_7ff70c99be90(auStack_78,&UNK_7ff70cb914bd,&uStack_90);
  FUN_7ff70cb12a50(auStack_78,&UNK_7ff70cbcadd0);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


