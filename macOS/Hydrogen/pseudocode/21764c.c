
/* WARNING: Possible PIC construction at 0x00216f74: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00216f90: Changing call to branch */

void FUN_0021764c(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 in_ZR;
  undefined1 *puVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long unaff_x19;
  ulong uVar7;
  long unaff_x20;
  long lVar8;
  undefined8 *unaff_x21;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  
  while (!(bool)in_ZR) {
    if (unaff_x21[-1] != 0) {
      func_0x00187bd4(*unaff_x21,unaff_x21[-1],1);
    }
    unaff_x21 = unaff_x21 + 3;
    unaff_x20 = unaff_x20 + -1;
    in_ZR = unaff_x20 == 0;
  }
  if (*(long *)(unaff_x19 + 0x60) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x68),*(long *)(unaff_x19 + 0x60) * 0x18,8);
  }
  uVar9 = *(ulong *)(unaff_x19 + 0xb0);
  if (uVar9 != 0) {
    lVar4 = *(long *)(unaff_x19 + 0xa0);
    uVar2 = *(ulong *)(unaff_x19 + 0xa8);
    uVar5 = *(ulong *)(unaff_x19 + 0x98);
    uVar7 = 0;
    if (uVar5 <= uVar2) {
      uVar7 = uVar5;
    }
    lVar6 = uVar2 - uVar7;
    uVar11 = uVar5 - lVar6;
    lVar8 = 0;
    if (uVar11 <= uVar9) {
      lVar8 = uVar9 - uVar11;
    }
    if (uVar9 <= uVar11) {
      uVar5 = lVar6 + uVar9;
    }
    lVar6 = uVar5 - lVar6;
    if (lVar6 != 0) {
      puVar10 = (undefined8 *)(uVar2 * 0x18 + uVar7 * -0x18 + lVar4 + 8);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 3;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (uVar11 < uVar9) {
      puVar10 = (undefined8 *)(lVar4 + 8);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
  }
  if (*(long *)(unaff_x19 + 0x98) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xa0),*(long *)(unaff_x19 + 0x98) * 0x18,8);
  }
  lVar4 = *(long *)(unaff_x19 + 0x308);
  if (lVar4 != -0x8000000000000000 && lVar4 != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x310),lVar4,1);
  }
  lVar4 = *(long *)(unaff_x19 + 0x130);
  if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
    uVar9 = *(ulong *)(unaff_x19 + 0x128);
    uVar7 = *(ulong *)(unaff_x19 + 0x110);
  }
  else {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x138),lVar4,1);
    uVar9 = *(ulong *)(unaff_x19 + 0x128);
    uVar7 = *(ulong *)(unaff_x19 + 0x110);
  }
  if (uVar9 != 0) {
    lVar4 = *(long *)(unaff_x19 + 0x118);
    uVar2 = *(ulong *)(unaff_x19 + 0x120);
    uVar5 = 0;
    if (uVar7 <= uVar2) {
      uVar5 = uVar7;
    }
    lVar6 = uVar2 - uVar5;
    uVar11 = uVar7 - lVar6;
    lVar8 = 0;
    if (uVar11 <= uVar9) {
      lVar8 = uVar9 - uVar11;
    }
    uVar1 = uVar7;
    if (uVar9 <= uVar11) {
      uVar1 = lVar6 + uVar9;
    }
    lVar6 = uVar1 - lVar6;
    if (lVar6 != 0) {
      puVar10 = (undefined8 *)(lVar4 + uVar5 * -0x20 + uVar2 * 0x20 + 0x10);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 4;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (uVar11 < uVar9) {
      puVar10 = (undefined8 *)(lVar4 + 0x10);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 4;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
  }
  if (uVar7 != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x118),uVar7 << 5,8);
  }
  if (*(long *)(unaff_x19 + 0xc0) == 0) {
    if (*(char *)(unaff_x19 + 0x1f1) == '\x02') {
      if (*(char *)(unaff_x19 + 0x2a1) == '\x02') {
        return;
      }
      func_0x00252db4(unaff_x19 + 0x208);
      puVar3 = (undefined1 *)(unaff_x19 + 0x250);
    }
    else {
      func_0x00252db4(unaff_x19 + 0x158);
      puVar3 = (undefined1 *)(unaff_x19 + 0x1a0);
    }
  }
  else {
    puVar3 = (undefined1 *)(unaff_x19 + 200);
  }
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = 0;
  puVar3[3] = 0;
  puVar3[4] = 0;
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[7] = 0;
  puVar3[8] = 0;
  puVar3[9] = 0;
  puVar3[10] = 0;
  puVar3[0xb] = 0;
  puVar3[0xc] = 0;
  puVar3[0xd] = 0;
  puVar3[0xe] = 0;
  puVar3[0xf] = 0;
  puVar3[0x10] = 0;
  puVar3[0x11] = 0;
  puVar3[0x12] = 0;
  puVar3[0x13] = 0;
  puVar3[0x14] = 0;
  puVar3[0x15] = 0;
  puVar3[0x16] = 0;
  puVar3[0x17] = 0;
  puVar3[0x18] = 0;
  puVar3[0x19] = 0;
  puVar3[0x1a] = 0;
  puVar3[0x1b] = 0;
  puVar3[0x1c] = 0;
  puVar3[0x1d] = 0;
  puVar3[0x1e] = 0;
  puVar3[0x1f] = 0;
  puVar3[0x20] = 0;
  puVar3[0x21] = 0;
  puVar3[0x22] = 0;
  puVar3[0x23] = 0;
  puVar3[0x24] = 0;
  puVar3[0x25] = 0;
  puVar3[0x26] = 0;
  puVar3[0x27] = 0;
  puVar3[0x28] = 0;
  puVar3[0x29] = 0;
  puVar3[0x2a] = 0;
  puVar3[0x2b] = 0;
  puVar3[0x2c] = 0;
  puVar3[0x2d] = 0;
  puVar3[0x2e] = 0;
  puVar3[0x2f] = 0;
  puVar3[0x30] = 0;
  puVar3[0x31] = 0;
  puVar3[0x32] = 0;
  puVar3[0x33] = 0;
  puVar3[0x34] = 0;
  puVar3[0x35] = 0;
  puVar3[0x36] = 0;
  puVar3[0x37] = 0;
  puVar3[0x38] = 0;
  puVar3[0x39] = 0;
  puVar3[0x3a] = 0;
  puVar3[0x3b] = 0;
  puVar3[0x3c] = 0;
  puVar3[0x3d] = 0;
  puVar3[0x3e] = 0;
  puVar3[0x3f] = 0;
  return;
}

