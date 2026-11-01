
void FUN_004242f4(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  char *pcVar4;
  long lVar5;
  long lVar6;
  undefined1 uVar7;
  ulong uVar8;
  undefined1 uVar9;
  undefined1 auVar10 [16];
  undefined1 auStack_68 [24];
  undefined1 auStack_50 [16];
  long *plStack_40;
  long *plStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 auStack_6 [6];
  
  auVar10 = func_0x007a28a4();
  auVar10._8_8_ = auVar10._8_8_;
  auVar10._0_8_ = auVar10._0_8_;
  uVar2 = func_0x00423e58(auVar10._8_8_);
  uVar3 = auVar10._8_8_[1];
  if (uVar3 < uVar2) {
    auVar10 = func_0x007a28a4(uVar2,uVar3,&UNK_009da948);
  }
  else {
    lVar5 = *auVar10._8_8_;
    pcVar4 = (char *)(lVar5 + uVar2);
    lVar6 = -1;
    uVar8 = uVar2;
    do {
      if (uVar3 == uVar8) {
        lVar5 = 0;
        lVar6 = uVar3 - uVar2;
        if (lVar6 != 0) goto LAB_00424388;
        goto LAB_00424374;
      }
      lVar1 = lVar5 + uVar3;
      lVar5 = lVar5 + -1;
      uVar8 = uVar8 + 1;
      lVar6 = lVar6 + 1;
    } while (*(char *)(lVar1 + -1) != '/');
    uVar2 = uVar3 - lVar6;
    auVar10._8_8_ = uVar3;
    auVar10._0_8_ = uVar2;
    if (uVar2 <= uVar3) {
      pcVar4 = (char *)(lVar5 + uVar3 + 1);
      lVar5 = 1;
      lVar6 = uVar3 - uVar2;
      if (lVar6 == 0) {
LAB_00424374:
        uVar7 = 10;
      }
      else {
LAB_00424388:
        if (lVar6 == 2) {
          uVar7 = 8;
          if (pcVar4[1] != '.' || *pcVar4 != '.') {
            uVar7 = 9;
          }
        }
        else if (lVar6 == 1) {
          uVar9 = 7;
          if (2 < *(byte *)(auVar10._8_8_ + 2)) {
            uVar9 = 10;
          }
          uVar7 = 9;
          if (*pcVar4 == '.') {
            uVar7 = uVar9;
          }
        }
        else {
          uVar7 = 9;
        }
      }
      *auVar10._0_8_ = lVar6 + lVar5;
      *(undefined1 *)(auVar10._0_8_ + 1) = uVar7;
      auVar10._0_8_[2] = (long)pcVar4;
      auVar10._0_8_[3] = lVar6;
      return;
    }
  }
  auVar10 = func_0x007a28a4(auVar10._0_8_,auVar10._8_8_,&UNK_009da960);
  uStack_28 = 0x42441c;
  plStack_40 = auVar10._8_8_;
  plStack_38 = auVar10._0_8_;
  puStack_30 = auStack_6 + -10;
  func_0x00469960(auStack_68,auVar10._8_8_,&UNK_0088848c,4);
  auStack_50 = func_0x00423fe0(auVar10._0_8_);
  func_0x004656a8(auStack_68,auStack_50,&UNK_009da9a8);
  func_0x004658b0();
  return;
}

