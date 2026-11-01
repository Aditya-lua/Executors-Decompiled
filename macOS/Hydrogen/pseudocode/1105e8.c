
byte * FUN_001105e8(int param_1)

{
  byte bVar1;
  uint uVar2;
  byte *pbVar3;
  char *pcVar4;
  long lVar5;
  byte *pbVar6;
  int iVar7;
  char cVar8;
  bool bVar9;
  undefined1 auVar10 [16];
  long in_stack_00000038;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
    return (byte *)(ulong)(param_1 != 0);
  }
  auVar10 = ___stack_chk_fail((byte *)(ulong)(param_1 != 0));
  auVar10._8_8_ = auVar10._8_8_;
  auVar10._0_8_ = auVar10._0_8_;
  pbVar6 = auVar10._8_8_;
  if (*auVar10._0_8_ == '%') {
    iVar7 = 0x25;
    cVar8 = '%';
    pcVar4 = auVar10._0_8_;
    do {
      pcVar4 = pcVar4 + 1;
      if ((byte)(cVar8 + 0xbfU) < 0x1a) {
        uVar2 = 1 << (ulong)(iVar7 - 0x41U & 0x1f) & 0x900;
joined_r0x00110648:
        if (uVar2 == 0) break;
      }
      else if ((byte)(cVar8 + 0x9fU) < 0x1a) {
        uVar2 = 1 << (ulong)(iVar7 - 0x61U & 0x1f) & 0x2480a80;
        goto joined_r0x00110648;
      }
      cVar8 = *pcVar4;
      iVar7 = (int)cVar8;
    } while (cVar8 != '\0');
    lVar5 = (long)pcVar4 - (long)auVar10._0_8_;
    if (auVar10._0_8_ <= pcVar4 && lVar5 != 0) {
      bVar9 = false;
      do {
        pbVar6 = auVar10._8_8_;
        pbVar3 = auVar10._0_8_;
        bVar1 = *pbVar3;
        if ((bVar9) ||
           ((9 < (byte)(bVar1 - 0x30) &&
            (0x2e < bVar1 || (1L << ((ulong)bVar1 & 0x3f) & 0x480800000000U) == 0)))) {
          bVar9 = (bool)(bVar9 | ((bVar1 & 0xffffffdf) - 0x41 & 0xff) < 0x1a);
          uVar2 = bVar1 - 0x24;
          if (0x3b < uVar2 || (1L << ((ulong)uVar2 & 0x3f) & 0x800000000000009U) == 0) {
            *pbVar6 = bVar1;
            pbVar6 = pbVar6 + 1;
          }
        }
        else {
          bVar9 = false;
        }
        auVar10._8_8_ = pbVar6;
        auVar10._0_8_ = pbVar3 + 1;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
  }
  *pbVar6 = 0;
  return auVar10._8_8_;
}

