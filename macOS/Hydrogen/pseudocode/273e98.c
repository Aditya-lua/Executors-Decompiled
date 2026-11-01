
void FUN_00273e98(void)

{
  undefined *puVar1;
  byte bVar2;
  long lVar3;
  undefined1 auVar4 [16];
  byte *pbStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  byte ***pppbStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  byte **ppbStack_20;
  undefined *puStack_18;
  
  pbStack_58 = (byte *)func_0x007a28b0();
  bVar2 = *pbStack_58;
  if (bVar2 < 4) {
    if (bVar2 < 2) {
      if (bVar2 == 0) {
        lVar3 = func_0x002c20c8();
      }
      else {
        lVar3 = func_0x002c2140();
      }
    }
    else if (bVar2 == 2) {
      lVar3 = func_0x002c21b8();
    }
    else {
      lVar3 = func_0x002c2230();
    }
  }
  else if (bVar2 < 6) {
    if (bVar2 == 4) {
      lVar3 = func_0x002c22a8();
    }
    else {
      lVar3 = func_0x002c2394();
    }
  }
  else if (bVar2 == 6) {
    lVar3 = func_0x002c2484();
  }
  else if (bVar2 == 7) {
    lVar3 = func_0x002c24fc();
  }
  else {
    lVar3 = func_0x002c2574();
  }
  if (lVar3 != 0) {
    return;
  }
  ppbStack_20 = &pbStack_58;
  puStack_18 = &DAT_00273c94;
  puStack_50 = &UNK_009cc828;
  uStack_48 = 1;
  uStack_38 = 1;
  uStack_30 = 0;
  pppbStack_40 = &ppbStack_20;
  auVar4 = func_0x007a2420(&puStack_50,&UNK_009cc838);
  puVar1 = &UNK_0082d202;
  if (*(char *)(auVar4._0_8_ + 8) == '\0') {
    puVar1 = &UNK_0082d1fc;
  }
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(auVar4._8_8_[1] + 0x18))(*auVar4._8_8_,puVar1,6);
  return;
}

