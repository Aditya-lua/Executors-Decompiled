
/* WARNING: Possible PIC construction at 0x001f80f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f810c: Changing call to branch */

void FUN_001f8964(undefined8 param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  long lVar4;
  undefined1 *puVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  long unaff_x19;
  ulong uVar9;
  long lVar10;
  long unaff_x21;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  
  if (*(long *)(unaff_x21 + 0x38) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x21 + 0x40),*(long *)(unaff_x21 + 0x38) << 5,8);
  }
  if ((unaff_x19 != -0x8000000000000000) && (unaff_x19 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x21 + 8));
  }
  lVar4 = __Unwind_Resume(param_1);
  uVar2 = *(undefined8 *)(lVar4 + 0x10);
  puVar12 = *(undefined8 **)(lVar4 + 0x18);
  if ((code *)*puVar12 != (code *)0x0) {
    (*(code *)*puVar12)(uVar2);
  }
  if (puVar12[1] != 0) {
    func_0x00187bd4(uVar2,puVar12[1],puVar12[2]);
  }
  uVar2 = *(undefined8 *)(lVar4 + 0x20);
  puVar12 = *(undefined8 **)(lVar4 + 0x28);
  if ((code *)*puVar12 != (code *)0x0) {
    (*(code *)*puVar12)(uVar2);
  }
  if (puVar12[1] != 0) {
    func_0x00187bd4(uVar2,puVar12[1],puVar12[2]);
  }
  lVar6 = *(long *)(lVar4 + 0x2d8);
  if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0x2e0),lVar6,1);
  }
  lVar6 = *(long *)(lVar4 + 0x2f0);
  if (lVar6 != -0x8000000000000000) {
    lVar10 = *(long *)(lVar4 + 0x300);
    if (lVar10 != 0) {
      puVar12 = (undefined8 *)(*(long *)(lVar4 + 0x2f8) + 8);
      do {
        lVar6 = puVar12[-1];
        if (lVar6 != -0x8000000000000000 && lVar6 != 0) {
          func_0x00187bd4(*puVar12,lVar6,1);
        }
        puVar12 = puVar12 + 3;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
      lVar6 = *(long *)(lVar4 + 0x2f0);
    }
    if (lVar6 != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar4 + 0x2f8),lVar6 * 0x18,8);
    }
  }
  uVar11 = *(ulong *)(lVar4 + 0x78);
  if (uVar11 != 0) {
    lVar6 = *(long *)(lVar4 + 0x68);
    uVar3 = *(ulong *)(lVar4 + 0x70);
    uVar7 = *(ulong *)(lVar4 + 0x60);
    uVar9 = 0;
    if (uVar7 <= uVar3) {
      uVar9 = uVar7;
    }
    lVar8 = uVar3 - uVar9;
    uVar13 = uVar7 - lVar8;
    lVar10 = 0;
    if (uVar13 <= uVar11) {
      lVar10 = uVar11 - uVar13;
    }
    if (uVar11 <= uVar13) {
      uVar7 = lVar8 + uVar11;
    }
    lVar8 = uVar7 - lVar8;
    if (lVar8 != 0) {
      puVar12 = (undefined8 *)(uVar3 * 0x18 + uVar9 * -0x18 + lVar6 + 8);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (uVar13 < uVar11) {
      puVar12 = (undefined8 *)(lVar6 + 8);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 3;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
    }
  }
  if (*(long *)(lVar4 + 0x60) != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0x68),*(long *)(lVar4 + 0x60) * 0x18,8);
  }
  uVar11 = *(ulong *)(lVar4 + 0xb0);
  if (uVar11 != 0) {
    lVar6 = *(long *)(lVar4 + 0xa0);
    uVar3 = *(ulong *)(lVar4 + 0xa8);
    uVar7 = *(ulong *)(lVar4 + 0x98);
    uVar9 = 0;
    if (uVar7 <= uVar3) {
      uVar9 = uVar7;
    }
    lVar8 = uVar3 - uVar9;
    uVar13 = uVar7 - lVar8;
    lVar10 = 0;
    if (uVar13 <= uVar11) {
      lVar10 = uVar11 - uVar13;
    }
    if (uVar11 <= uVar13) {
      uVar7 = lVar8 + uVar11;
    }
    lVar8 = uVar7 - lVar8;
    if (lVar8 != 0) {
      puVar12 = (undefined8 *)(uVar3 * 0x18 + uVar9 * -0x18 + lVar6 + 8);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (uVar13 < uVar11) {
      puVar12 = (undefined8 *)(lVar6 + 8);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 3;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
    }
  }
  if (*(long *)(lVar4 + 0x98) != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0xa0),*(long *)(lVar4 + 0x98) * 0x18,8);
  }
  lVar6 = *(long *)(lVar4 + 0x308);
  if (lVar6 != -0x8000000000000000 && lVar6 != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0x310),lVar6,1);
  }
  lVar6 = *(long *)(lVar4 + 0x130);
  if (lVar6 == -0x8000000000000000 || lVar6 == 0) {
    uVar11 = *(ulong *)(lVar4 + 0x128);
    uVar9 = *(ulong *)(lVar4 + 0x110);
  }
  else {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0x138),lVar6,1);
    uVar11 = *(ulong *)(lVar4 + 0x128);
    uVar9 = *(ulong *)(lVar4 + 0x110);
  }
  if (uVar11 != 0) {
    lVar6 = *(long *)(lVar4 + 0x118);
    uVar3 = *(ulong *)(lVar4 + 0x120);
    uVar7 = 0;
    if (uVar9 <= uVar3) {
      uVar7 = uVar9;
    }
    lVar8 = uVar3 - uVar7;
    uVar13 = uVar9 - lVar8;
    lVar10 = 0;
    if (uVar13 <= uVar11) {
      lVar10 = uVar11 - uVar13;
    }
    uVar1 = uVar9;
    if (uVar11 <= uVar13) {
      uVar1 = lVar8 + uVar11;
    }
    lVar8 = uVar1 - lVar8;
    if (lVar8 != 0) {
      puVar12 = (undefined8 *)(lVar6 + uVar7 * -0x20 + uVar3 * 0x20 + 0x10);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 4;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (uVar13 < uVar11) {
      puVar12 = (undefined8 *)(lVar6 + 0x10);
      do {
        if (puVar12[-1] != 0) {
          func_0x00187bd4(*puVar12,puVar12[-1],1);
        }
        puVar12 = puVar12 + 4;
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
    }
  }
  if (uVar9 != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar4 + 0x118),uVar9 << 5,8);
  }
  if (*(long *)(lVar4 + 0xc0) == 0) {
    if (*(char *)(lVar4 + 0x1f1) == '\x02') {
      if (*(char *)(lVar4 + 0x2a1) == '\x02') {
        return;
      }
      func_0x00252db4(lVar4 + 0x208);
      puVar5 = (undefined1 *)(lVar4 + 0x250);
    }
    else {
      func_0x00252db4(lVar4 + 0x158);
      puVar5 = (undefined1 *)(lVar4 + 0x1a0);
    }
  }
  else {
    puVar5 = (undefined1 *)(lVar4 + 200);
  }
  *puVar5 = 0;
  puVar5[1] = 0;
  puVar5[2] = 0;
  puVar5[3] = 0;
  puVar5[4] = 0;
  puVar5[5] = 0;
  puVar5[6] = 0;
  puVar5[7] = 0;
  puVar5[8] = 0;
  puVar5[9] = 0;
  puVar5[10] = 0;
  puVar5[0xb] = 0;
  puVar5[0xc] = 0;
  puVar5[0xd] = 0;
  puVar5[0xe] = 0;
  puVar5[0xf] = 0;
  puVar5[0x10] = 0;
  puVar5[0x11] = 0;
  puVar5[0x12] = 0;
  puVar5[0x13] = 0;
  puVar5[0x14] = 0;
  puVar5[0x15] = 0;
  puVar5[0x16] = 0;
  puVar5[0x17] = 0;
  puVar5[0x18] = 0;
  puVar5[0x19] = 0;
  puVar5[0x1a] = 0;
  puVar5[0x1b] = 0;
  puVar5[0x1c] = 0;
  puVar5[0x1d] = 0;
  puVar5[0x1e] = 0;
  puVar5[0x1f] = 0;
  puVar5[0x20] = 0;
  puVar5[0x21] = 0;
  puVar5[0x22] = 0;
  puVar5[0x23] = 0;
  puVar5[0x24] = 0;
  puVar5[0x25] = 0;
  puVar5[0x26] = 0;
  puVar5[0x27] = 0;
  puVar5[0x28] = 0;
  puVar5[0x29] = 0;
  puVar5[0x2a] = 0;
  puVar5[0x2b] = 0;
  puVar5[0x2c] = 0;
  puVar5[0x2d] = 0;
  puVar5[0x2e] = 0;
  puVar5[0x2f] = 0;
  puVar5[0x30] = 0;
  puVar5[0x31] = 0;
  puVar5[0x32] = 0;
  puVar5[0x33] = 0;
  puVar5[0x34] = 0;
  puVar5[0x35] = 0;
  puVar5[0x36] = 0;
  puVar5[0x37] = 0;
  puVar5[0x38] = 0;
  puVar5[0x39] = 0;
  puVar5[0x3a] = 0;
  puVar5[0x3b] = 0;
  puVar5[0x3c] = 0;
  puVar5[0x3d] = 0;
  puVar5[0x3e] = 0;
  puVar5[0x3f] = 0;
  return;
}

