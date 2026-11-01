
void FUN_002609cc(long param_1,long param_2)

{
  ushort uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *plVar5;
  ulong in_x9;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  ulong in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  while( true ) {
    _memcpy(param_1,param_2);
    _memcpy(unaff_x20,unaff_x26 + 0x110 + (in_x9 & 0xffffffff) * 0x38,unaff_x21 * 0x38);
    puVar3 = (undefined8 *)(unaff_x22 + (unaff_x25 & 0xffffffff) * 0x18);
    puVar6 = (undefined8 *)(unaff_x26 + 0x110 + (unaff_x25 & 0xffffffff) * 0x38);
    uVar4 = *puVar6;
    *(undefined8 *)(unaff_x29 + -0xa8) = puVar6[1];
    *(undefined8 *)(unaff_x29 + -0xb0) = uVar4;
    uVar4 = puVar6[2];
    *(undefined8 *)(unaff_x29 + -0x98) = puVar6[3];
    *(undefined8 *)(unaff_x29 + -0xa0) = uVar4;
    uVar4 = puVar6[4];
    *(undefined8 *)(unaff_x29 + -0x88) = puVar6[5];
    *(undefined8 *)(unaff_x29 + -0x90) = uVar4;
    *(undefined8 *)(unaff_x29 + -0x80) = puVar6[6];
    lVar7 = unaff_x28 + (long)(int)in_stack_00000020 * 0x18;
    lVar8 = unaff_x28 + (long)(int)in_stack_00000020 * 0x38;
    uVar14 = *(undefined8 *)(lVar7 + 0x10);
    uVar10 = *(undefined8 *)(lVar7 + 8);
    uVar9 = *(undefined8 *)(lVar7 + 0x18);
    uVar15 = puVar3[1];
    uVar4 = *puVar3;
    *(undefined8 *)(lVar7 + 0x18) = puVar3[2];
    *(undefined8 *)(lVar7 + 0x10) = uVar15;
    *(undefined8 *)(lVar7 + 8) = uVar4;
    uVar16 = *(undefined8 *)(lVar8 + 0x118);
    uVar15 = *(undefined8 *)(lVar8 + 0x110);
    uVar17 = *(undefined8 *)(lVar8 + 0x128);
    uVar11 = *(undefined8 *)(lVar8 + 0x120);
    uVar18 = *(undefined8 *)(lVar8 + 0x138);
    uVar12 = *(undefined8 *)(lVar8 + 0x130);
    uVar4 = *(undefined8 *)(lVar8 + 0x140);
    uVar13 = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(lVar8 + 0x128) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(lVar8 + 0x120) = uVar13;
    uVar13 = *(undefined8 *)(unaff_x29 + -0x90);
    *(undefined8 *)(lVar8 + 0x138) = *(undefined8 *)(unaff_x29 + -0x88);
    *(undefined8 *)(lVar8 + 0x130) = uVar13;
    *(undefined8 *)(lVar8 + 0x140) = *(undefined8 *)(unaff_x29 + -0x80);
    uVar13 = *(undefined8 *)(unaff_x29 + -0xb0);
    *(undefined8 *)(lVar8 + 0x118) = *(undefined8 *)(unaff_x29 + -0xa8);
    *(undefined8 *)(lVar8 + 0x110) = uVar13;
    *(undefined8 *)(unaff_x29 + -0x68) = uVar14;
    *(undefined8 *)(unaff_x29 + -0x70) = uVar10;
    *(undefined8 *)(unaff_x29 + -0x60) = uVar9;
    puVar3 = (undefined8 *)(in_stack_00000018 + in_stack_00000010);
    puVar3[1] = uVar14;
    *puVar3 = uVar10;
    puVar3[2] = uVar9;
    puVar3 = (undefined8 *)(unaff_x20 + unaff_x21 * 0x38);
    puVar3[1] = uVar16;
    *puVar3 = uVar15;
    puVar3[3] = uVar17;
    puVar3[2] = uVar11;
    puVar3[5] = uVar18;
    puVar3[4] = uVar12;
    puVar3[6] = uVar4;
    if (unaff_x23 != 1) {
      lVar7 = unaff_x24 + 0x380;
      _memmove(lVar7 + unaff_x27 * 8,lVar7,in_stack_00000008 * 8 + 8);
      _memcpy(lVar7,in_stack_00000028 + in_x9 * 8 + 0x380,unaff_x27 * 8);
      plVar5 = *(long **)(unaff_x24 + 0x380);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 0;
      plVar5 = *(long **)(unaff_x24 + 0x388);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 1;
      plVar5 = *(long **)(unaff_x24 + 0x390);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 2;
      plVar5 = *(long **)(unaff_x24 + 0x398);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 3;
      plVar5 = *(long **)(unaff_x24 + 0x3a0);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 4;
      plVar5 = *(long **)(unaff_x24 + 0x3a8);
      *plVar5 = unaff_x24;
      *(undefined2 *)(plVar5 + 0x6f) = 5;
    }
    do {
      unaff_x28 = unaff_x24;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        return;
      }
      if (*(ushort *)(unaff_x28 + 0x37a) == 0) {
        func_0x007a247c(&UNK_0082b07b,0x19,&UNK_009cb0c8);
        func_0x007a1f18(8,0x380);
        goto code_r0x00260c3c;
      }
      in_stack_00000020 = (ulong)*(ushort *)(unaff_x28 + 0x37a) - 1;
      lVar7 = unaff_x28 + in_stack_00000020 * 8;
      unaff_x24 = *(long *)(lVar7 + 0x388);
      in_stack_00000008 = (ulong)*(ushort *)(unaff_x24 + 0x37a);
    } while (4 < *(ushort *)(unaff_x24 + 0x37a));
    unaff_x26 = *(long *)(lVar7 + 0x380);
    uVar1 = *(ushort *)(unaff_x26 + 0x37a);
    unaff_x27 = -in_stack_00000008 + 5;
    if ((uint)uVar1 < (uint)unaff_x27) break;
    unaff_x25 = uVar1 - unaff_x27;
    *(short *)(unaff_x26 + 0x37a) = (short)unaff_x25;
    *(undefined2 *)(unaff_x24 + 0x37a) = 5;
    param_1 = unaff_x24 + 8;
    _memmove(param_1 + (unaff_x27 & 0xffffffff) * 0x18,param_1,in_stack_00000008 * 0x18);
    unaff_x20 = unaff_x24 + 0x110;
    _memmove(unaff_x20 + (unaff_x27 & 0xffffffff) * 0x38,unaff_x20,in_stack_00000008 * 0x38);
    in_x9 = unaff_x25 + 1;
    unaff_x21 = uVar1 - in_x9;
    if (unaff_x21 != -in_stack_00000008 + 4) goto code_r0x00260c18;
    unaff_x22 = unaff_x26 + 8;
    param_2 = unaff_x22 + (in_x9 & 0xffffffff) * 0x18;
    in_stack_00000010 = unaff_x21 * 0x18;
    in_stack_00000018 = param_1;
    in_stack_00000028 = unaff_x26;
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

