
void FUN_00609520(ulong param_1)

{
  uint uVar1;
  ulong uVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  long lVar7;
  uint in_w9;
  ulong in_x10;
  long unaff_x19;
  long unaff_x22;
  uint unaff_w23;
  ulong uVar8;
  long unaff_x27;
  ulong uVar9;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  while (uVar6 = (uint)param_1, 1 < uVar6 - in_w9) {
    uVar3 = in_w9 + uVar6 >> 1;
    uVar1 = uVar3;
    if (in_x10 >> ((ulong)uVar3 & 0x3f) != 0) {
      uVar1 = uVar6;
      in_w9 = uVar3;
    }
    param_1 = (ulong)uVar1;
  }
  uVar8 = 1L << (param_1 & 0x3f);
  uVar9 = *(ulong *)(unaff_x19 + 0x18);
  lVar7 = *(long *)(unaff_x19 + 0x20);
  if (uVar9 == uVar8) {
    *(ulong *)(unaff_x19 + 0x18) = uVar8;
    *(long *)(unaff_x19 + 0x20) = lVar7;
    *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
    lVar5 = *(long *)(unaff_x22 + 0x20);
    lVar4 = lVar7;
    if (lVar7 == lVar5) goto code_r0x00609388;
  }
  else {
    func_0x006108a0(uVar8);
    if (uVar8 == 0) {
      lVar4 = 0;
code_r0x00609340:
      if (lVar7 != 0) goto code_r0x00609344;
    }
    else {
      lVar4 = func_0x006115d0(uVar8 << 3);
      if ((lVar7 == 0) || (lVar4 == 0)) goto code_r0x00609340;
      uVar2 = uVar8;
      if (uVar9 <= uVar8) {
        uVar2 = uVar9;
      }
      _memcpy(lVar4,lVar7,uVar2 << 3);
code_r0x00609344:
      if (uVar9 != 0) {
        do {
          *(undefined8 *)(lVar7 + -8 + uVar9 * 8) = 0;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
      func_0x00611644(lVar7);
    }
    *(ulong *)(unaff_x19 + 0x18) = uVar8;
    *(long *)(unaff_x19 + 0x20) = lVar4;
    *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
    lVar5 = *(long *)(unaff_x22 + 0x20);
    lVar7 = lVar4;
    if (lVar4 == lVar5) goto code_r0x00609388;
  }
  _memcpy(lVar4,lVar5,unaff_x27 << 3);
  uVar8 = *(ulong *)(unaff_x19 + 0x18);
  lVar7 = *(long *)(unaff_x19 + 0x20);
code_r0x00609388:
  if (uVar8 - unaff_x27 != 0) {
    _bzero(lVar7 + unaff_x27 * 8,(uVar8 - unaff_x27) * 8);
  }
  if ((unaff_w23 & 0x3f) != 0) {
    lVar7 = lVar7 + unaff_x27 * 8;
    *(ulong *)(lVar7 + -8) =
         *(ulong *)(lVar7 + -8) & (-1L << (unaff_w23 & 0x3f) ^ 0xffffffffffffffffU);
  }
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  if (*(int *)(unaff_x22 + 0x28) == 1) {
    if (**(long **)(unaff_x19 + 0x20) == 0) {
      lVar7 = *(long *)(unaff_x19 + 0x18);
      do {
        if (lVar7 == 0) {
          return;
        }
        lVar5 = lVar7 + -1;
        lVar4 = lVar7 + -1;
        lVar7 = lVar5;
      } while ((*(long **)(unaff_x19 + 0x20))[lVar4] == 0);
      if ((int)lVar5 == -1) {
        return;
      }
    }
    func_0x00605d50();
    func_0x006001b4();
    func_0x005ffad4();
    func_0x00607398(&uStack0000000000000030);
    func_0x005ffccc();
    uStack0000000000000030 = &UNK_009f5d60;
    uVar8 = in_stack_00000040;
    if (in_stack_00000048 <= in_stack_00000040) {
      uVar8 = in_stack_00000048;
    }
    if (in_stack_00000050 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
    if (in_stack_00000018 <= in_stack_00000010) {
      in_stack_00000010 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (in_stack_00000010 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
          in_stack_00000010 = in_stack_00000010 - 1;
        } while (in_stack_00000010 != 0);
      }
      func_0x00611644();
    }
  }
  return;
}

