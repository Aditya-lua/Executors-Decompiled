
void FUN_00260a7c(undefined8 param_1)

{
  ushort uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long *plVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *in_x9;
  long in_x10;
  int iVar7;
  long unaff_x19;
  long unaff_x20;
  long lVar8;
  long unaff_x22;
  long unaff_x23;
  long lVar9;
  long unaff_x24;
  ulong uVar10;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  
  while( true ) {
    in_x9[9] = param_1;
    uVar11 = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(in_x10 + 0x128) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(in_x10 + 0x120) = uVar11;
    uVar11 = *(undefined8 *)(unaff_x29 + -0x90);
    *(undefined8 *)(in_x10 + 0x138) = *(undefined8 *)(unaff_x29 + -0x88);
    *(undefined8 *)(in_x10 + 0x130) = uVar11;
    *(undefined8 *)(in_x10 + 0x140) = *(undefined8 *)(unaff_x29 + -0x80);
    uVar11 = *(undefined8 *)(unaff_x29 + -0xb0);
    *(undefined8 *)(in_x10 + 0x118) = *(undefined8 *)(unaff_x29 + -0xa8);
    *(undefined8 *)(in_x10 + 0x110) = uVar11;
    *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000038;
    *(undefined8 *)(unaff_x29 + -0x70) = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000040;
    uStack00000000000000a8 = in_x9[4];
    uStack00000000000000a0 = in_x9[3];
    uStack00000000000000b8 = in_x9[6];
    uStack00000000000000b0 = in_x9[5];
    uStack00000000000000c8 = in_x9[8];
    uStack00000000000000c0 = in_x9[7];
    uStack00000000000000d0 = in_x9[9];
    puVar3 = (undefined8 *)(in_stack_00000018 + in_stack_00000010);
    puVar3[1] = in_stack_00000038;
    *puVar3 = uStack0000000000000030;
    puVar3[2] = in_stack_00000040;
    puVar3 = (undefined8 *)(unaff_x20 + unaff_x19);
    puVar3[1] = uStack00000000000000a8;
    *puVar3 = uStack00000000000000a0;
    puVar3[3] = uStack00000000000000b8;
    puVar3[2] = uStack00000000000000b0;
    puVar3[5] = uStack00000000000000c8;
    puVar3[4] = uStack00000000000000c0;
    puVar3[6] = uStack00000000000000d0;
    if (unaff_x23 != 1) {
      lVar9 = unaff_x24 + 0x380;
      _memmove(lVar9 + unaff_x27 * 8,lVar9,in_stack_00000008 * 8 + 8);
      _memcpy(lVar9,in_stack_00000028 + in_stack_00000000 * 8 + 0x380,unaff_x27 * 8);
      plVar4 = *(long **)(unaff_x24 + 0x380);
      *plVar4 = unaff_x24;
      *(undefined2 *)(plVar4 + 0x6f) = 0;
      plVar4 = *(long **)(unaff_x24 + 0x388);
      *plVar4 = unaff_x24;
      *(undefined2 *)(plVar4 + 0x6f) = 1;
      plVar4 = *(long **)(unaff_x24 + 0x390);
      *plVar4 = unaff_x24;
      *(undefined2 *)(plVar4 + 0x6f) = 2;
      plVar4 = *(long **)(unaff_x24 + 0x398);
      *plVar4 = unaff_x24;
      *(undefined2 *)(plVar4 + 0x6f) = 3;
      plVar4 = *(long **)(unaff_x24 + 0x3a0);
      *plVar4 = unaff_x24;
      *(undefined2 *)(plVar4 + 0x6f) = 4;
      plVar4 = *(long **)(unaff_x24 + 0x3a8);
      *plVar4 = unaff_x24;
      *(short *)(plVar4 + 0x6f) = (short)unaff_x22;
    }
    do {
      lVar9 = unaff_x24;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        return;
      }
      if (*(ushort *)(lVar9 + 0x37a) == 0) {
        func_0x007a247c(&UNK_0082b07b,0x19,&UNK_009cb0c8);
        func_0x007a1f18(8,0x380);
        goto code_r0x00260c3c;
      }
      lVar5 = (ulong)*(ushort *)(lVar9 + 0x37a) - 1;
      lVar8 = lVar9 + lVar5 * 8;
      unaff_x24 = *(long *)(lVar8 + 0x388);
      in_stack_00000008 = (ulong)*(ushort *)(unaff_x24 + 0x37a);
    } while (4 < *(ushort *)(unaff_x24 + 0x37a));
    in_stack_00000028 = *(long *)(lVar8 + 0x380);
    uVar1 = *(ushort *)(in_stack_00000028 + 0x37a);
    unaff_x27 = unaff_x22 - in_stack_00000008;
    if ((uint)uVar1 < (uint)unaff_x27) break;
    uVar10 = uVar1 - unaff_x27;
    *(short *)(in_stack_00000028 + 0x37a) = (short)uVar10;
    *(short *)(unaff_x24 + 0x37a) = (short)unaff_x22;
    in_stack_00000018 = unaff_x24 + 8;
    _memmove(in_stack_00000018 + (unaff_x27 & 0xffffffff) * 0x18,in_stack_00000018,
             in_stack_00000008 * 0x18);
    unaff_x20 = unaff_x24 + 0x110;
    _memmove(unaff_x20 + (unaff_x27 & 0xffffffff) * 0x38,unaff_x20,in_stack_00000008 * 0x38);
    in_stack_00000000 = uVar10 + 1;
    lVar8 = uVar1 - in_stack_00000000;
    if (lVar8 != unaff_x27 - 1) goto code_r0x00260c18;
    in_stack_00000010 = lVar8 * 0x18;
    _memcpy(in_stack_00000018,in_stack_00000028 + 8 + (in_stack_00000000 & 0xffffffff) * 0x18);
    unaff_x19 = lVar8 * 0x38;
    _memcpy(unaff_x20,in_stack_00000028 + 0x110 + (in_stack_00000000 & 0xffffffff) * 0x38,unaff_x19)
    ;
    puVar3 = (undefined8 *)(in_stack_00000028 + 8 + (uVar10 & 0xffffffff) * 0x18);
    unaff_x22 = 5;
    puVar6 = (undefined8 *)(in_stack_00000028 + 0x110 + (uVar10 & 0xffffffff) * 0x38);
    uVar11 = *puVar6;
    *(undefined8 *)(unaff_x29 + -0xa8) = puVar6[1];
    *(undefined8 *)(unaff_x29 + -0xb0) = uVar11;
    uVar11 = puVar6[2];
    *(undefined8 *)(unaff_x29 + -0x98) = puVar6[3];
    *(undefined8 *)(unaff_x29 + -0xa0) = uVar11;
    uVar11 = puVar6[4];
    *(undefined8 *)(unaff_x29 + -0x88) = puVar6[5];
    *(undefined8 *)(unaff_x29 + -0x90) = uVar11;
    *(undefined8 *)(unaff_x29 + -0x80) = puVar6[6];
    iVar7 = (int)lVar5;
    lVar8 = lVar9 + (long)iVar7 * 0x18;
    in_x10 = lVar9 + (long)iVar7 * 0x38;
    in_stack_00000038 = *(undefined8 *)(lVar8 + 0x10);
    uStack0000000000000030 = *(undefined8 *)(lVar8 + 8);
    in_stack_00000040 = *(undefined8 *)(lVar8 + 0x18);
    uVar12 = puVar3[1];
    uVar11 = *puVar3;
    *(undefined8 *)(lVar8 + 0x18) = puVar3[2];
    *(undefined8 *)(lVar8 + 0x10) = uVar12;
    *(undefined8 *)(lVar8 + 8) = uVar11;
    in_x9 = &uStack0000000000000030;
    in_stack_00000050 = *(undefined8 *)(in_x10 + 0x118);
    in_stack_00000048 = *(undefined8 *)(in_x10 + 0x110);
    in_stack_00000060 = *(undefined8 *)(in_x10 + 0x128);
    in_stack_00000058 = *(undefined8 *)(in_x10 + 0x120);
    in_stack_00000070 = *(undefined8 *)(in_x10 + 0x138);
    in_stack_00000068 = *(undefined8 *)(in_x10 + 0x130);
    param_1 = *(undefined8 *)(in_x10 + 0x140);
  }
  func_0x007a247c(&UNK_0082b159,0x27,&UNK_009cb110);
code_r0x00260c18:
  func_0x007a247c(&UNK_0082b131,0x28,&UNK_009cb0f8);
  func_0x007a1f18(8,0x3e0);
code_r0x00260c3c:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x260c40);
  (*pcVar2)();
}

