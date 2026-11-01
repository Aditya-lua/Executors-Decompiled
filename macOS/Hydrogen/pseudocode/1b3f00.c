
ulong FUN_001b3f00(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  undefined *puVar7;
  ulong extraout_x8;
  ulong uVar8;
  ulong extraout_x8_00;
  long lVar9;
  undefined8 unaff_x19;
  long lVar10;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined1 unaff_w25;
  undefined1 unaff_w26;
  long unaff_x28;
  unkbyte10 Var11;
  undefined4 uStack0000000000000018;
  undefined2 uStack000000000000001c;
  undefined4 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 auStack_58 [2];
  undefined8 uStack_48;
  
  uVar3 = in_stack_00000058;
  uVar2 = in_stack_00000050;
  uVar1 = in_stack_00000048;
  uVar6 = unaff_x21 + 2;
  *(ulong *)(unaff_x28 + 0x10) = uVar6;
  if (unaff_x21 < 0xfffffffffffffffe) {
    if (unaff_x20 < uVar6) goto LAB_001b407c;
    Var11 = func_0x001f4e14(*(ushort *)(unaff_x24 + unaff_x21) >> 8 |
                            *(ushort *)(unaff_x24 + unaff_x21) << 8);
    uVar4 = (ulong)Var11;
    if (unaff_x20 == uVar6) {
      unaff_x23[2] = &UNK_00820849;
      unaff_x23[3] = 0xb;
      *(undefined1 *)(unaff_x23 + 1) = 0xc;
LAB_001b3f50:
      *unaff_x23 = 0x8000000000000000;
      return uVar4;
    }
    uVar8 = unaff_x21 + 3;
    *(ulong *)(unaff_x28 + 0x10) = uVar8;
    if (unaff_x21 != 0xfffffffffffffffd) {
      if (uVar8 <= unaff_x20) {
        if (*(char *)(unaff_x24 + uVar6) != '\0') {
          *(undefined1 *)(unaff_x23 + 1) = 0x12;
          *unaff_x23 = 0x8000000000000000;
          return uVar4;
        }
        uVar4 = func_0x001a8dd8(&uStack0000000000000040);
        if ((uStack0000000000000040 & 1) == 0) {
          unaff_x23[1] = in_stack_00000050;
          *unaff_x23 = in_stack_00000048;
          unaff_x23[2] = in_stack_00000058;
          *(undefined4 *)((long)unaff_x23 + 0x1a) = uStack0000000000000018;
          *(undefined2 *)((long)unaff_x23 + 0x1e) = uStack000000000000001c;
          *(undefined1 *)(unaff_x23 + 3) = unaff_w25;
          *(undefined1 *)((long)unaff_x23 + 0x19) = unaff_w26;
          unaff_x23[4] = uVar1;
          unaff_x23[6] = uVar3;
          unaff_x23[5] = uVar2;
          unaff_x23[7] = unaff_x19;
          *(undefined4 *)(unaff_x23 + 8) = 9;
          *(short *)((long)unaff_x23 + 0x44) = (short)Var11;
          *(short *)((long)unaff_x23 + 0x46) = (short)((unkuint10)Var11 >> 0x40);
          return uVar4;
        }
        unaff_x23[2] = in_stack_00000050;
        unaff_x23[1] = in_stack_00000048;
        unaff_x23[3] = in_stack_00000058;
        goto LAB_001b3f50;
      }
      goto LAB_001b40a4;
    }
  }
  else {
    func_0x007a28bc();
LAB_001b407c:
    func_0x007a28b0(uVar6);
    uVar8 = extraout_x8;
  }
  func_0x007a28bc(0xffffffffffffffff,uVar8,&UNK_009c9a78);
  uVar8 = extraout_x8_00;
LAB_001b40a4:
  lVar5 = func_0x007a28b0(uVar8);
  auStack_58[0] = 0;
  uStack_48 = 0;
  lVar10 = *(long *)(lVar5 + 8) + 0x1a;
  lVar5 = *(long *)(lVar5 + 0x10) << 5;
  do {
    lVar9 = lVar5;
    if (lVar9 == 0) break;
    uVar6 = *(long *)(lVar10 + -0x1a) + 0x7fffffffffffffff;
    if (3 < uVar6) {
      uVar6 = 4;
    }
    if ((long)uVar6 < 2) {
      if (uVar6 == 0) {
        puVar7 = (undefined *)0x33;
      }
      else {
        puVar7 = (undefined *)0x2c;
      }
    }
    else if (uVar6 == 2) {
      puVar7 = (undefined *)0x2b;
    }
    else {
      if (uVar6 != 3) {
                    /* WARNING: Could not recover jumptable at 0x001b4148. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar6 = (*(code *)((ulong)(byte)(&UNK_0081da69)[*(ushort *)(lVar10 + -2)] * 4 + 0x1b4124))()
        ;
        return uVar6;
      }
      puVar7 = &UNK_0000fe0d;
    }
    uVar6 = func_0x001e108c(auStack_58,puVar7);
    lVar10 = lVar10 + 0x20;
    lVar5 = lVar9 + -0x20;
  } while ((uVar6 & 1) == 0);
  func_0x001e189c(auStack_58);
  return (ulong)(lVar9 != 0);
}

