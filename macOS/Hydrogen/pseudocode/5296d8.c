
bool FUN_005296d8(void)

{
  byte bVar1;
  byte *pbVar2;
  long lVar3;
  byte *pbVar4;
  long in_x3;
  uint uVar5;
  undefined1 auVar6 [16];
  
  pbVar4 = &UNK_009ea990;
  auVar6 = func_0x007a2570();
  if (auVar6._8_8_ != in_x3) {
    return false;
  }
  do {
    lVar3 = auVar6._8_8_;
    pbVar2 = auVar6._0_8_;
    if (lVar3 == 0) {
      return true;
    }
    auVar6._8_8_ = lVar3 + -1;
    auVar6._0_8_ = pbVar2 + 1;
    bVar1 = *pbVar4;
    uVar5 = (uint)*pbVar2;
    pbVar4 = pbVar4 + 1;
  } while ((uVar5 | (uint)(uVar5 - 0x41 < 0x1a) << 5) ==
           ((uint)bVar1 | (uint)(bVar1 - 0x41 < 0x1a) << 5));
  return lVar3 == 0;
}

