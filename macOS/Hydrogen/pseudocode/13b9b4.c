
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_0013b9b4(void)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  undefined8 *unaff_x19;
  ulong uVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined1 auVar8 [16];
  
  __ZdlPv(*unaff_x19);
  auVar8 = __Unwind_Resume();
  lVar4 = auVar8._0_8_;
  if (*(char *)(lVar4 + 0x5e) == '\0') {
    return *(uint *)(lVar4 + 0xd0);
  }
  bVar3 = *(byte *)(auVar8._8_8_ + 8);
  if ((bVar3 & 1) != 0) {
    return *(uint *)(lVar4 + 0xf8);
  }
  if ((bVar3 >> 1 & 1) != 0) {
    return *(uint *)(lVar4 + 0xfc);
  }
  uVar1 = *(uint *)(lVar4 + (long)*(int *)(auVar8._8_8_ + 4) * 4 + 0xd0);
  if ((bVar3 >> 2 & 1) != 0) {
    uVar2 = *(uint *)(lVar4 + 0xe8);
    uVar5 = NEON_ushl(CONCAT44(uVar1,uVar1),_UNK_0080c180,4);
    uVar7 = NEON_ushl(CONCAT44(uVar2,uVar2),_UNK_0080c180,4);
    uVar6 = NEON_ushl(CONCAT44((int)((uVar7 & 0xff000000ff) >> 0x20) +
                               (int)((uVar5 & 0xff000000ff) >> 0x20),
                               (int)(uVar7 & 0xff000000ff) + (int)(uVar5 & 0xff000000ff)),
                      _UNK_008133d8,4);
    uVar1 = (uVar2 & 0xff) + (uVar1 & 0xff) >> 1 | ((uVar2 >> 0x18) + (uVar1 >> 0x18) >> 1) << 0x18
            | (uint)uVar6 & 0xff00 | (uint)((ulong)uVar6 >> 0x20) & 0xff0000;
  }
  return uVar1;
}

