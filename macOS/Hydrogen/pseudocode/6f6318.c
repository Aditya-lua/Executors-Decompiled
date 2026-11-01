
void FUN_006f6318(void)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  undefined4 *puVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  uint unaff_w20;
  
  func_0x006edfb0();
  uVar1 = *(uint *)(unaff_x19 + 0x48) ^ unaff_w20;
  if (0 < (int)uVar1) {
    lVar4 = *(long *)(unaff_x19 + 0x30);
    uVar2 = (ulong)uVar1;
    if (uVar1 < 4) {
      uVar6 = 0;
    }
    else {
      uVar6 = uVar2 & 0xfffffffc;
      puVar5 = (undefined4 *)(lVar4 + 0x2c);
      uVar7 = uVar6;
      do {
        puVar5[-8] = 0;
        puVar5[-4] = 0;
        *puVar5 = 0;
        puVar5[4] = 0;
        puVar5 = puVar5 + 0x10;
        uVar7 = uVar7 - 4;
      } while (uVar7 != 0);
      if (uVar6 == uVar2) {
        return;
      }
    }
    lVar3 = uVar2 - uVar6;
    puVar5 = (undefined4 *)(lVar4 + uVar6 * 0x10 + 0xc);
    do {
      *puVar5 = 0;
      lVar3 = lVar3 + -1;
      puVar5 = puVar5 + 4;
    } while (lVar3 != 0);
  }
  return;
}

