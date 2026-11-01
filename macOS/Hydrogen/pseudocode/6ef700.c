
void FUN_006ef700(void)

{
  undefined4 in_w8;
  long in_x9;
  ulong uVar1;
  long lVar2;
  long *plVar3;
  long in_x10;
  ulong uVar4;
  undefined4 *puVar5;
  ulong uVar6;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  
  *(long *)(unaff_x22 + 0x78) = in_x9 - (in_x10 + 0x28);
  if (0 < (int)unaff_w21) {
    uVar1 = (ulong)unaff_w21;
    if (unaff_w21 < 4) {
      uVar4 = 0;
    }
    else {
      uVar4 = uVar1 & 0xfffffffc;
      puVar5 = (undefined4 *)(unaff_x20 + 0x5c);
      uVar6 = uVar4;
      do {
        puVar5[-0xc] = 0;
        puVar5[-8] = 0;
        puVar5[-4] = 0;
        *puVar5 = 0;
        uVar6 = uVar6 - 4;
        puVar5 = puVar5 + 0x10;
      } while (uVar6 != 0);
      if (uVar4 == uVar1) goto LAB_006ef76c;
    }
    lVar2 = uVar1 - uVar4;
    puVar5 = (undefined4 *)(unaff_x20 + uVar4 * 0x10 + 0x2c);
    do {
      *puVar5 = 0;
      lVar2 = lVar2 + -1;
      puVar5 = puVar5 + 4;
    } while (lVar2 != 0);
  }
LAB_006ef76c:
  plVar3 = *(long **)(unaff_x19 + 8);
  *plVar3 = unaff_x20;
  *(undefined4 *)((long)plVar3 + 0xc) = in_w8;
  lVar2 = *(long *)(unaff_x19 + 8);
  if (*(long *)(unaff_x19 + 0x28) - lVar2 < 0x11) {
    func_0x006ee1d4();
    lVar2 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = lVar2 + 0x10;
  func_0x006e1d54();
  return;
}

