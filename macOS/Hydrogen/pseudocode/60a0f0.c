
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0060a0f0(long param_1)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  uint uVar7;
  long in_x9;
  long lVar8;
  ulong uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  *(undefined **)(in_x9 + 0x20) = &DAT_005f6838;
  *(undefined **)(in_x9 + 0xb0) = &DAT_005f9574;
  *(undefined **)(in_x9 + 0x68) = &DAT_005f850c;
  *(undefined **)(in_x9 + 0xf8) = &DAT_005fa300;
  *(undefined1 *)(param_1 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  *unaff_x19 = &UNK_009f5d60;
  uVar6 = _UNK_008baa70;
  unaff_x19[3] = _UNK_008baa78;
  unaff_x19[2] = uVar6;
  puVar5 = (undefined8 *)func_0x006115d0(0x10);
  lVar8 = 0;
  unaff_x19[4] = puVar5;
  *(undefined4 *)(unaff_x19 + 5) = 0;
  *puVar5 = 0;
  puVar5[1] = 0;
  lVar2 = *(long *)(unaff_x20 + 0x18);
  iVar4 = (int)lVar2;
  uVar7 = iVar4 << 6 ^ 0xffffffff;
  do {
    if (lVar2 + lVar8 == 0) goto LAB_0060a1d0;
    lVar1 = lVar8 * 8;
    uVar7 = uVar7 + 0x40;
    lVar8 = lVar8 + -1;
  } while (*(long *)(*(long *)(unaff_x20 + 0x20) + lVar2 * 8 + -8 + lVar1) == 0);
  if (iVar4 + (int)lVar8 == -1) {
LAB_0060a1d0:
    uVar9 = 0;
  }
  else {
    uVar9 = *(ulong *)(*(long *)(unaff_x20 + 0x20) + (ulong)(uint)(iVar4 + (int)lVar8) * 8);
    if (uVar9 == 0) {
      uVar11 = 0;
    }
    else {
      uVar12 = 0;
      uVar10 = 0x40;
      do {
        uVar3 = uVar12 + uVar10 >> 1;
        uVar11 = uVar3;
        if (uVar9 >> ((ulong)uVar3 & 0x3f) != 0) {
          uVar11 = uVar10;
          uVar12 = uVar3;
        }
        uVar10 = uVar11;
      } while (1 < uVar11 - uVar12);
    }
    uVar9 = (ulong)(uVar11 - uVar7 >> 1);
  }
  uVar6 = func_0x006001b4(unaff_x29 + -0x50,0,uVar9 + 0x40 >> 6);
  func_0x005ffad4(uVar6,uVar9,1);
  do {
    func_0x005ffccc();
    func_0x006095dc();
    func_0x006072ac(&uStack0000000000000030);
    func_0x00609afc(&uStack0000000000000060,&uStack0000000000000030,1);
    func_0x005ffccc(unaff_x29 + -0x50,&uStack0000000000000060);
    uStack0000000000000060 = &UNK_009f5d60;
    uVar9 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar9 = in_stack_00000078;
    }
    if (in_stack_00000080 != 0) {
      if (uVar9 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar9 * 8) = 0;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
      func_0x00611644();
    }
    uStack0000000000000030 = &UNK_009f5d60;
    uVar9 = in_stack_00000040;
    if (in_stack_00000048 <= in_stack_00000040) {
      uVar9 = in_stack_00000048;
    }
    if (in_stack_00000050 != 0) {
      if (uVar9 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar9 * 8) = 0;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
      func_0x00611644();
    }
    uVar9 = in_stack_00000010;
    if (in_stack_00000018 <= in_stack_00000010) {
      uVar9 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (uVar9 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + uVar9 * 8) = 0;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
      func_0x00611644();
    }
    iVar4 = func_0x00609ec8(unaff_x29 + -0x50);
  } while (iVar4 < 0);
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f5d60;
  lVar2 = *(long *)(unaff_x29 + -0x30);
  uVar9 = *(ulong *)(unaff_x29 + -0x40);
  if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
    uVar9 = *(ulong *)(unaff_x29 + -0x38);
  }
  if (lVar2 != 0) {
    if (uVar9 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar9 * 8) = 0;
        uVar9 = uVar9 - 1;
      } while (uVar9 != 0);
    }
    func_0x00611644();
  }
  return;
}

