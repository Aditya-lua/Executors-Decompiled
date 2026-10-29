/* 7ff70c962038 FUN_7ff70c962038 */

void FUN_7ff70c962038(char param_1,char param_2,undefined8 param_3,undefined8 param_4,
                     longlong param_5,longlong param_6)

{
  code *pcVar1;
  undefined *puStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined1 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined8 uStack_78;
  undefined *puStack_70;
  undefined8 uStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_10;
  
  uStack_10 = 0xfffffffffffffffe;
  if (param_1 != '\0') {
    return;
  }
  puStack_60 = &UNK_7ff70cb80d8e;
  if (param_2 != '\0') {
    puStack_60 = &UNK_7ff70cb80d9b;
  }
  puStack_70 = &UNK_7ff70cb89948;
  if (param_2 != '\0') {
    puStack_70 = &UNK_7ff70cb89969;
  }
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  uStack_40 = 0xf;
  uStack_78 = param_3;
  uStack_68 = param_4;
  if (param_6 == 0) {
    FUN_7ff70c962bb0(&uStack_38,&UNK_7ff70cb90cd0,&puStack_60,param_5,param_5 + 8,&uStack_68);
    FUN_7ff70c91d130(&uStack_58,&uStack_38);
  }
  else {
    FUN_7ff70c962ca0(&uStack_38,&UNK_7ff70cb90d4e,&puStack_60,param_5,param_5 + 8,&uStack_68,
                     &param_6);
    FUN_7ff70c91d130(&uStack_58,&uStack_38);
  }
  FUN_7ff70c8e9fd0(&uStack_38);
  FUN_7ff70c962da0(&uStack_38,&UNK_7ff70cb914e1,&puStack_70,&uStack_78);
  FUN_7ff70c91d130(&uStack_58,&uStack_38);
  FUN_7ff70c8e9fd0(&uStack_38);
  FUN_7ff70c963f40(&uStack_38,0);
  uStack_c0 = uStack_28;
  uStack_c8 = uStack_30;
  uStack_d0 = uStack_38;
  uStack_e8 = 0;
  uStack_e0 = 0;
  uStack_d8 = 0;
  uStack_28 = 0;
  uStack_38 = 0;
  uStack_30 = 0;
  uStack_b8 = 0;
  uStack_b0 = 0;
  uStack_a8 = 0;
  uStack_a0 = 0xf;
  uStack_98 = (undefined4)uStack_58;
  uStack_94 = uStack_58._4_4_;
  uStack_90 = (undefined4)uStack_50;
  uStack_8c = uStack_50._4_4_;
  uStack_88 = (undefined4)uStack_48;
  uStack_84 = uStack_48._4_4_;
  uStack_80 = (undefined4)uStack_40;
  uStack_7c = uStack_40._4_4_;
  uStack_48 = 0;
  uStack_40 = 0xf;
  uStack_58 = uStack_58 & 0xffffffffffffff00;
  puStack_f0 = &UNK_7ff70cb45448;
  FUN_7ff70cb12a50(&puStack_f0,&UNK_7ff70cbb7a28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


