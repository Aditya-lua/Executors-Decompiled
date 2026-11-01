
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0072f0a4(void)

{
  uint uVar1;
  bool in_CY;
  undefined8 *puVar2;
  int *piVar3;
  undefined8 uVar4;
  long in_x3;
  int in_w4;
  long unaff_x19;
  long *unaff_x20;
  undefined1 *unaff_x21;
  undefined4 unaff_w22;
  undefined8 uVar5;
  long unaff_x29;
  undefined8 uStack_38;
  undefined8 uStack_30;
  
  if (in_CY) {
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0077ea88();
      func_0x0073cab8();
    }
    *(undefined4 *)(unaff_x19 + 0xc54) = unaff_w22;
    uVar5 = 7;
  }
  else {
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
      func_0x0073cbdc();
    }
    uVar5 = 0;
    *unaff_x21 = 1;
    *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return uVar5;
  }
  puVar2 = (undefined8 *)___stack_chk_fail();
  uStack_38 = 0;
  uStack_30 = uVar5;
  piVar3 = (int *)(*pcRam0000000000a2b608)(1,0x138);
  if (piVar3 == (int *)0x0) {
    uVar5 = 0x1b;
  }
  else {
    piVar3[0x4c] = 0;
    piVar3[0x4d] = 0;
    piVar3[0x46] = 0;
    piVar3[0x47] = 0;
    piVar3[0x44] = 0;
    piVar3[0x45] = 0;
    piVar3[0x4a] = 0;
    piVar3[0x4b] = 0;
    piVar3[0x48] = 0;
    piVar3[0x49] = 0;
    piVar3[0x3e] = 0;
    piVar3[0x3f] = 0;
    piVar3[0x3c] = 0;
    piVar3[0x3d] = 0;
    piVar3[0x42] = 0;
    piVar3[0x43] = 0;
    piVar3[0x40] = 0;
    piVar3[0x41] = 0;
    piVar3[0x36] = 0;
    piVar3[0x37] = 0;
    piVar3[0x34] = 0;
    piVar3[0x35] = 0;
    piVar3[0x3a] = 0;
    piVar3[0x3b] = 0;
    piVar3[0x38] = 0;
    piVar3[0x39] = 0;
    piVar3[0x2e] = 0;
    piVar3[0x2f] = 0;
    piVar3[0x2c] = 0;
    piVar3[0x2d] = 0;
    piVar3[0x32] = 0;
    piVar3[0x33] = 0;
    piVar3[0x30] = 0;
    piVar3[0x31] = 0;
    piVar3[0x26] = 0;
    piVar3[0x27] = 0;
    piVar3[0x24] = 0;
    piVar3[0x25] = 0;
    piVar3[0x2a] = 0;
    piVar3[0x2b] = 0;
    piVar3[0x28] = 0;
    piVar3[0x29] = 0;
    piVar3[0x1e] = 0;
    piVar3[0x1f] = 0;
    piVar3[0x1c] = 0;
    piVar3[0x1d] = 0;
    piVar3[0x22] = 0;
    piVar3[0x23] = 0;
    piVar3[0x20] = 0;
    piVar3[0x21] = 0;
    piVar3[0x16] = 0;
    piVar3[0x17] = 0;
    piVar3[0x14] = 0;
    piVar3[0x15] = 0;
    piVar3[0x1a] = 0;
    piVar3[0x1b] = 0;
    piVar3[0x18] = 0;
    piVar3[0x19] = 0;
    piVar3[0xe] = 0;
    piVar3[0xf] = 0;
    piVar3[0xc] = 0;
    piVar3[0xd] = 0;
    piVar3[0x12] = 0;
    piVar3[0x13] = 0;
    piVar3[0x10] = 0;
    piVar3[0x11] = 0;
    piVar3[6] = 0;
    piVar3[7] = 0;
    piVar3[4] = 0;
    piVar3[5] = 0;
    piVar3[10] = 0;
    piVar3[0xb] = 0;
    piVar3[8] = 0;
    piVar3[9] = 0;
    piVar3[2] = 0;
    piVar3[3] = 0;
    piVar3[0] = 0;
    piVar3[1] = 0;
    piVar3[0x26] = -1;
    *piVar3 = in_w4;
    piVar3[2] = *(int *)(in_x3 + 4);
    if (in_w4 == 3) {
      *(undefined8 *)(piVar3 + 3) = _UNK_008ccd40;
      uVar1 = *(uint *)(in_x3 + 0x10);
      piVar3[5] = uVar1;
    }
    else if (in_w4 == 6) {
      *(undefined8 *)(piVar3 + 3) = _UNK_007fc080;
      uVar1 = *(uint *)(in_x3 + 0x10);
      piVar3[5] = uVar1;
    }
    else {
      *(undefined8 *)(piVar3 + 3) = _UNK_008ccd48;
      uVar1 = *(uint *)(in_x3 + 0x10);
      piVar3[5] = uVar1;
    }
    if (uVar1 < 0x81) {
      _memcpy(piVar3 + 6,*(undefined8 *)(in_x3 + 0x20));
      uVar5 = func_0x00730fe0(&uStack_38,0xa2b2f0,piVar3);
      uVar4 = uStack_38;
      if ((int)uVar5 != 0) {
        uVar4 = 0;
      }
      *puVar2 = uVar4;
      uVar4 = uStack_38;
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      goto code_r0x0072f2c8;
    }
    uVar5 = 100;
  }
  *puVar2 = 0;
  uVar4 = 0;
code_r0x0072f2c8:
  (*pcRam0000000000a2b5f0)(uVar4);
  uStack_38 = 0;
  (*pcRam0000000000a2b5f0)(piVar3);
  return uVar5;
}

