
void FUN_00595fd4(void)

{
  code *pcVar1;
  ulong uVar2;
  ulong *puVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  long unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  
  do {
    uVar2 = 8;
LAB_00595fd8:
    puVar3 = (ulong *)(unaff_x24 + unaff_x22 * unaff_x26);
    *puVar3 = unaff_x21;
    puVar3[1] = uVar2;
    puVar3[2] = unaff_x21;
    unaff_x22 = unaff_x22 + 1;
    unaff_x23 = unaff_x23 + 1;
    if (unaff_x23 == unaff_x25) {
      *in_stack_00000008 = unaff_x22;
      return;
    }
    lVar4 = *(long *)(unaff_x19 + unaff_x23 * unaff_x26);
    unaff_x21 = *(ulong *)(lVar4 + 0x10);
    if (unaff_x21 != 0) {
      lVar4 = *(long *)(lVar4 + 8);
      uVar2 = func_0x00187bd0(unaff_x21 << 3,8);
      if (uVar2 == 0) {
        func_0x007a1f00(8,unaff_x21 << 3,&UNK_009f16d8);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x59610c);
        (*pcVar1)();
      }
      if (7 < unaff_x21) break;
      uVar5 = 0;
      goto LAB_005960a8;
    }
  } while( true );
  uVar5 = unaff_x21 & 0xfffffffffffffff8;
  plVar6 = (long *)(uVar2 + 0x20);
  uVar7 = uVar5;
  lVar8 = in_stack_00000010;
  lVar9 = in_stack_00000018;
  do {
    lVar10 = lVar4 + lVar8 * 0x48;
    lVar11 = lVar4 + lVar9 * 0x48;
    plVar6[-3] = lVar11 + unaff_x27;
    plVar6[-4] = lVar10 + unaff_x27;
    plVar6[-1] = lVar11 + in_stack_00000048;
    plVar6[-2] = lVar10 + in_stack_00000040;
    plVar6[1] = lVar11 + in_stack_00000038;
    *plVar6 = lVar10 + in_stack_00000030;
    plVar6[3] = lVar11 + in_stack_00000028;
    plVar6[2] = lVar10 + in_stack_00000020;
    lVar8 = lVar8 + unaff_x27;
    lVar9 = lVar9 + unaff_x27;
    uVar7 = uVar7 - 8;
    plVar6 = plVar6 + 8;
  } while (uVar7 != 0);
  if (unaff_x21 != uVar5) {
LAB_005960a8:
    lVar4 = lVar4 + uVar5 * 0x48 + 8;
    do {
      *(long *)(uVar2 + uVar5 * 8) = lVar4;
      uVar5 = uVar5 + 1;
      lVar4 = lVar4 + 0x48;
    } while (unaff_x21 != uVar5);
  }
  goto LAB_00595fd8;
}

