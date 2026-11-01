
/* WARNING: Possible PIC construction at 0x00171be0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00171bfc: Changing call to branch */

void FUN_00172144(undefined8 param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 *puVar4;
  long lVar5;
  long lVar6;
  long unaff_x19;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  
  if (param_2 != -0x8000000000000000 && param_2 != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x310),param_2,1);
  }
  lVar5 = *(long *)(unaff_x19 + 0x130);
  if (lVar5 == -0x8000000000000000 || lVar5 == 0) {
    uVar9 = *(ulong *)(unaff_x19 + 0x128);
    uVar7 = *(ulong *)(unaff_x19 + 0x110);
  }
  else {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x138),lVar5,1);
    uVar9 = *(ulong *)(unaff_x19 + 0x128);
    uVar7 = *(ulong *)(unaff_x19 + 0x110);
  }
  if (uVar9 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x118);
    uVar3 = *(ulong *)(unaff_x19 + 0x120);
    uVar1 = 0;
    if (uVar7 <= uVar3) {
      uVar1 = uVar7;
    }
    lVar6 = uVar3 - uVar1;
    uVar11 = uVar7 - lVar6;
    lVar8 = 0;
    if (uVar11 <= uVar9) {
      lVar8 = uVar9 - uVar11;
    }
    uVar2 = uVar7;
    if (uVar9 <= uVar11) {
      uVar2 = lVar6 + uVar9;
    }
    lVar6 = uVar2 - lVar6;
    if (lVar6 != 0) {
      puVar10 = (undefined8 *)(lVar5 + uVar1 * -0x20 + uVar3 * 0x20 + 0x10);
      do {
        if (puVar10[-1] != 0) {
          func_0x00187bd4(*puVar10,puVar10[-1],1);
        }
        puVar10 = puVar10 + 4;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (uVar11 < uVar9) {
      puVar10 = (undefined8 *)(lVar5 + 0x10);
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
      puVar4 = (undefined1 *)(unaff_x19 + 0x250);
    }
    else {
      func_0x00252db4(unaff_x19 + 0x158);
      puVar4 = (undefined1 *)(unaff_x19 + 0x1a0);
    }
  }
  else {
    puVar4 = (undefined1 *)(unaff_x19 + 200);
  }
  *puVar4 = 0;
  puVar4[1] = 0;
  puVar4[2] = 0;
  puVar4[3] = 0;
  puVar4[4] = 0;
  puVar4[5] = 0;
  puVar4[6] = 0;
  puVar4[7] = 0;
  puVar4[8] = 0;
  puVar4[9] = 0;
  puVar4[10] = 0;
  puVar4[0xb] = 0;
  puVar4[0xc] = 0;
  puVar4[0xd] = 0;
  puVar4[0xe] = 0;
  puVar4[0xf] = 0;
  puVar4[0x10] = 0;
  puVar4[0x11] = 0;
  puVar4[0x12] = 0;
  puVar4[0x13] = 0;
  puVar4[0x14] = 0;
  puVar4[0x15] = 0;
  puVar4[0x16] = 0;
  puVar4[0x17] = 0;
  puVar4[0x18] = 0;
  puVar4[0x19] = 0;
  puVar4[0x1a] = 0;
  puVar4[0x1b] = 0;
  puVar4[0x1c] = 0;
  puVar4[0x1d] = 0;
  puVar4[0x1e] = 0;
  puVar4[0x1f] = 0;
  puVar4[0x20] = 0;
  puVar4[0x21] = 0;
  puVar4[0x22] = 0;
  puVar4[0x23] = 0;
  puVar4[0x24] = 0;
  puVar4[0x25] = 0;
  puVar4[0x26] = 0;
  puVar4[0x27] = 0;
  puVar4[0x28] = 0;
  puVar4[0x29] = 0;
  puVar4[0x2a] = 0;
  puVar4[0x2b] = 0;
  puVar4[0x2c] = 0;
  puVar4[0x2d] = 0;
  puVar4[0x2e] = 0;
  puVar4[0x2f] = 0;
  puVar4[0x30] = 0;
  puVar4[0x31] = 0;
  puVar4[0x32] = 0;
  puVar4[0x33] = 0;
  puVar4[0x34] = 0;
  puVar4[0x35] = 0;
  puVar4[0x36] = 0;
  puVar4[0x37] = 0;
  puVar4[0x38] = 0;
  puVar4[0x39] = 0;
  puVar4[0x3a] = 0;
  puVar4[0x3b] = 0;
  puVar4[0x3c] = 0;
  puVar4[0x3d] = 0;
  puVar4[0x3e] = 0;
  puVar4[0x3f] = 0;
  return;
}

