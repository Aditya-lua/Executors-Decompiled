/* 7ff70c90f790 FUN_7ff70c90f790 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c90f790(void)

{
  code *pcVar1;
  undefined4 uVar2;
  undefined1 auStack_78 [40];
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined *puStack_30;
  undefined *puStack_28;
  undefined *puStack_20;
  undefined *puStack_18;
  undefined8 uStack_10;
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  puStack_18 = (undefined *)0x0;
  uStack_10 = 0;
  puStack_28 = (undefined *)0x0;
  puStack_20 = (undefined *)0x0;
  uStack_38 = 0;
  puStack_30 = (undefined *)0x0;
  uStack_48 = 0;
  puStack_40 = (undefined *)0x0;
  puStack_50 = &UNK_7ff70cb870f5;
  uVar2 = FUN_7ff70c802f50(&UNK_7ff70cb870f5,0,0);
  uStack_48 = CONCAT44(uStack_48._4_4_,uVar2);
  puStack_40 = &UNK_7ff70c90f850;
  puStack_30 = &UNK_7ff70c90f920;
  puStack_28 = &UNK_7ff70c90fc20;
  puStack_20 = &UNK_7ff70c90fed0;
  puStack_18 = &UNK_7ff70c90ff80;
  FUN_7ff70c8142f0(&puStack_50);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_78);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


