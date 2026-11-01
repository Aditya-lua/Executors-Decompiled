
void FUN_006132dc(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined4 *puVar7;
  ulong uVar8;
  ulong in_x9;
  ulong uVar9;
  undefined8 *puVar10;
  long unaff_x21;
  ulong unaff_x22;
  undefined4 *unaff_x23;
  ulong unaff_x24;
  undefined4 *puVar11;
  long unaff_x26;
  ulong *unaff_x27;
  undefined4 *unaff_x28;
  undefined4 *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  undefined8 uStack_28;
  long lStack_20;
  
code_r0x006132dc:
  lVar3 = 0;
  puVar7 = (undefined4 *)(unaff_x26 * 4);
  puVar11 = puVar7 + 1;
  *puVar7 = in_stack_00000008._4_4_;
  if (unaff_x28 != unaff_x23) goto LAB_006132bc;
LAB_0061338c:
  do {
    *(undefined4 **)(in_stack_00000000 + 8) = puVar7;
    *(undefined4 **)(in_stack_00000000 + 0x10) = puVar11;
    *(ulong *)(in_stack_00000000 + 0x18) = lVar3 + in_x9 * 4;
    if (unaff_x23 != (undefined4 *)0x0) {
      __ZdlPv(unaff_x23);
    }
    while( true ) {
      *(undefined4 **)(in_stack_00000000 + 0x10) = puVar11;
      unaff_x24 = unaff_x24 - unaff_x22;
      if (unaff_x24 == 0) {
        return;
      }
      unaff_x22 = func_0x00612ee4();
      if (unaff_x24 < unaff_x22) {
        puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
        *(undefined4 *)(puVar5 + 1) = 1;
        puVar5[2] = 0x6f63656420524542;
        puVar5[3] = 0x726f727265206564;
        *(undefined1 *)(puVar5 + 4) = 0;
        *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
        *puVar5 = &UNK_009f60b8;
        ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
        goto code_r0x00613428;
      }
      unaff_x28 = *(undefined4 **)(in_stack_00000000 + 0x10);
      if (*(undefined4 **)(in_stack_00000000 + 0x18) <= unaff_x28) break;
      puVar11 = unaff_x28 + 1;
      *unaff_x28 = in_stack_00000008._4_4_;
    }
    unaff_x23 = (undefined4 *)*unaff_x27;
    unaff_x21 = (long)unaff_x28 - (long)unaff_x23;
    unaff_x26 = unaff_x21 >> 2;
    uVar8 = unaff_x26 + 1;
    if (uVar8 >> 0x3e != 0) {
code_r0x00613428:
      func_0x00017f90(unaff_x27);
code_r0x00613430:
      lVar4 = func_0x00017514();
      puStack_40 = &UNK_009f6678;
      lStack_38 = 0;
      lStack_30 = 0;
      uStack_28 = 0;
      lStack_20 = in_stack_00000000;
      func_0x00613128(&puStack_40);
      lVar3 = lStack_38;
      if ((*(long *)(lVar4 + 0x10) - *(long *)(lVar4 + 8) != lStack_30 - lStack_38) ||
         (iVar2 = _memcmp(*(long *)(lVar4 + 8),lStack_38), iVar2 != 0)) {
        puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
        *(undefined4 *)(puVar5 + 1) = 1;
        puVar5[2] = 0x6f63656420524542;
        puVar5[3] = 0x726f727265206564;
        *(undefined1 *)(puVar5 + 4) = 0;
        *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
        *puVar5 = &UNK_009f60b8;
        ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x61350c);
        (*pcVar1)();
      }
      puStack_40 = &UNK_009f6678;
      if (lVar3 != 0) {
        lStack_30 = lVar3;
        __ZdlPv(lVar3);
      }
      return;
    }
    uVar6 = (long)*(undefined4 **)(in_stack_00000000 + 0x18) - (long)unaff_x23;
    in_x9 = (long)uVar6 >> 1;
    if (in_x9 <= uVar8) {
      in_x9 = uVar8;
    }
    if (0x7ffffffffffffffb < uVar6) {
      in_x9 = 0x3fffffffffffffff;
    }
    if (in_x9 == 0) goto code_r0x006132dc;
    if (in_x9 >> 0x3e != 0) goto code_r0x00613430;
    lVar3 = __Znwm(in_x9 << 2);
    puVar7 = (undefined4 *)(lVar3 + unaff_x26 * 4);
    puVar11 = puVar7 + 1;
    *puVar7 = in_stack_00000008._4_4_;
    if (unaff_x28 != unaff_x23) {
LAB_006132bc:
      uVar8 = (long)unaff_x28 + (-4 - (long)unaff_x23);
      puVar12 = unaff_x28;
      if ((0x3b < uVar8) && (0x3f < (ulong)((long)unaff_x28 - (lVar3 + unaff_x21)))) {
        uVar8 = (uVar8 >> 2) + 1;
        uVar9 = uVar8 & 0x7ffffffffffffff0;
        puVar12 = unaff_x28 + -uVar9;
        puVar7 = puVar7 + -uVar9;
        puVar5 = (undefined8 *)(unaff_x28 + -8);
        puVar10 = (undefined8 *)(lVar3 + unaff_x26 * 4 + -0x20);
        uVar6 = uVar9;
        do {
          uVar15 = *puVar5;
          uVar14 = puVar5[3];
          uVar13 = puVar5[2];
          uVar19 = puVar5[-3];
          uVar18 = puVar5[-4];
          uVar17 = puVar5[-1];
          uVar16 = puVar5[-2];
          puVar10[1] = puVar5[1];
          *puVar10 = uVar15;
          puVar10[3] = uVar14;
          puVar10[2] = uVar13;
          puVar10[-3] = uVar19;
          puVar10[-4] = uVar18;
          puVar10[-1] = uVar17;
          puVar10[-2] = uVar16;
          puVar5 = puVar5 + -8;
          puVar10 = puVar10 + -8;
          uVar6 = uVar6 - 0x10;
        } while (uVar6 != 0);
        if (uVar8 == uVar9) goto LAB_0061338c;
      }
      do {
        puVar12 = puVar12 + -1;
        puVar7 = puVar7 + -1;
        *puVar7 = *puVar12;
      } while (puVar12 != unaff_x23);
    }
  } while( true );
}

