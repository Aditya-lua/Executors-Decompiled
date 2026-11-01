
undefined8 * FUN_004b85f4(void)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  undefined1 uVar6;
  uint uVar7;
  ulong uVar8;
  code *pcVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  undefined *puVar14;
  ulong in_x3;
  long lVar15;
  undefined8 *unaff_x19;
  byte *unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  ulong uVar16;
  long unaff_x25;
  long lVar17;
  undefined1 auVar18 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 uStack_e0;
  undefined8 *puStack_d8;
  undefined *puStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a0;
  ulong uStack_98;
  undefined *puStack_90;
  undefined8 uStack_88;
  long lStack_80;
  undefined *puStack_78;
  ulong uStack_68;
  undefined8 *puStack_60;
  ulong uStack_58;
  
  puVar11 = (undefined8 *)func_0x00187bd0();
  if (puVar11 == (undefined8 *)0x0) {
    puVar14 = &UNK_009e55f8;
    uVar13 = func_0x007a1f00(4);
    if (uStack0000000000000008 != 0) {
      puVar14 = (undefined *)0x4;
      func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 2);
    }
    auVar18 = __Unwind_Resume(uVar13);
    puVar11 = auVar18._0_8_;
    uVar16 = *auVar18._8_8_;
    uVar8 = uVar16;
    if (0xffff < uVar16) {
      uVar8 = 0x10000;
    }
    if (uVar16 == 0) {
      uStack_68 = 0;
      puStack_60 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
      uStack_58 = 0;
      puVar12 = puVar11;
    }
    else {
      puVar12 = (undefined8 *)func_0x00187bd0(uVar8,1);
      if (puVar12 == (undefined8 *)0x0) {
        uVar13 = func_0x007a1f00(1,uVar8,&UNK_009e55f8);
        if (uStack_68 != 0) {
          func_0x00187bd4(puStack_60,uStack_68,1);
        }
        auVar18 = __Unwind_Resume(uVar13);
        uStack_e0 = auVar18._0_8_;
        puStack_78 = &DAT_004b88e0;
        puStack_d8 = (undefined8 *)0x0;
        uStack_a0 = uVar8;
        uStack_98 = in_x3;
        puStack_90 = puVar14;
        uStack_88 = uVar13;
        lStack_80 = (long)register0x00000008 + -0x10;
        iVar10 = func_0x0046849c(&uStack_e0,&UNK_009e5628,auVar18._8_8_);
        if (iVar10 == 0) {
          if (((ulong)puStack_d8 & 3) == 1) {
            puVar11 = (undefined8 *)((long)puStack_d8 - 1);
            uVar13 = *puVar11;
            puVar12 = *(undefined8 **)((long)puStack_d8 + 7);
            if ((code *)*puVar12 != (code *)0x0) {
              (*(code *)*puVar12)(uVar13);
            }
            if (puVar12[1] != 0) {
              func_0x00187bd4(uVar13,puVar12[1],puVar12[2]);
            }
            func_0x00187bd4(puVar11,0x18,8);
          }
          puStack_d8 = (undefined8 *)0x0;
        }
        else if (puStack_d8 == (undefined8 *)0x0) {
          puStack_d0 = &UNK_009e5658;
          uStack_c8 = 1;
          uStack_b8 = 0;
          uStack_b0 = 0;
          uStack_c0 = 8;
          func_0x007a2420(&puStack_d0,&UNK_009e5668);
                    /* WARNING: Does not return */
          pcVar9 = (code *)SoftwareBreakpoint(1,0x4b8948);
          (*pcVar9)();
        }
        return puStack_d8;
      }
      uStack_58 = 0;
      uStack_68 = uVar8;
      puStack_60 = puVar12;
      do {
        uVar8 = uStack_58;
        if (in_x3 == uStack_58) {
          puVar11[2] = puVar14 + uStack_58;
          puVar11[3] = 0;
          *(undefined1 *)(puVar11 + 4) = 0x17;
          puVar11[1] = 1;
          *puVar11 = 1;
          if (uStack_68 == 0) {
            return puVar12;
          }
          puVar11 = (undefined8 *)func_0x00187bd4(puStack_60,uStack_68,1);
          return puVar11;
        }
        uVar6 = puVar14[uStack_58];
        if (uStack_58 == uStack_68) {
          puVar12 = (undefined8 *)func_0x00458a18(&uStack_68,&UNK_009e5610);
        }
        *(undefined1 *)((long)puStack_60 + uVar8) = uVar6;
        uStack_58 = uVar8 + 1;
      } while (uVar16 != uStack_58);
      puVar14 = puVar14 + uStack_58;
      in_x3 = in_x3 - uVar16;
    }
    puVar11[4] = puStack_60;
    puVar11[3] = uStack_68;
    puVar11[5] = uStack_58;
    puVar11[1] = puVar14;
    puVar11[2] = in_x3;
    *puVar11 = 0;
    return puVar12;
  }
  uVar8 = unaff_x21 - 4;
  puVar12 = puVar11;
  uStack0000000000000008 = unaff_x23;
  if (unaff_x21 < 4) {
    unaff_x19[2] = unaff_x20;
    unaff_x19[3] = unaff_x21;
    *(undefined4 *)(unaff_x19 + 4) = 0x17;
    unaff_x19[1] = 1;
    *unaff_x19 = 1;
  }
  else {
    lVar15 = unaff_x21 + unaff_x25 * -4;
    lVar17 = 0;
    do {
      bVar2 = unaff_x20[3];
      bVar3 = unaff_x20[2];
      bVar4 = unaff_x20[1];
      bVar5 = *unaff_x20;
      if (lVar17 == uStack0000000000000008) {
        puVar12 = (undefined8 *)func_0x004aafb8(&uStack0000000000000008,&UNK_009e5610);
      }
      uVar7 = (uint)bVar2 << 0x10 | (uint)bVar3 << 8 | (uint)bVar4;
      *(uint *)((long)puVar11 + lVar17 * 4) = (uint)bVar5 | uVar7 << 8;
      lVar1 = lVar17 + 1;
      unaff_x20 = unaff_x20 + 4;
      if (unaff_x25 + -1 == lVar17) {
        unaff_x19[4] = puVar11;
        unaff_x19[3] = uStack0000000000000008;
        unaff_x19[5] = lVar1;
        unaff_x19[1] = unaff_x20;
        unaff_x19[2] = lVar15;
        *unaff_x19 = 0;
        return puVar12;
      }
      unaff_x21 = unaff_x21 - 4;
      lVar17 = lVar1;
    } while ((uVar8 >> 2) + 1 != lVar1);
    unaff_x19[2] = unaff_x20;
    unaff_x19[3] = unaff_x21;
    *(uint *)(unaff_x19 + 4) = uVar7 << 8 | 0x17;
    unaff_x19[1] = 1;
    *unaff_x19 = 1;
  }
  if (uStack0000000000000008 != 0) {
    puVar12 = (undefined8 *)func_0x00187bd4(puVar11,uStack0000000000000008 << 2,4);
  }
  return puVar12;
}

