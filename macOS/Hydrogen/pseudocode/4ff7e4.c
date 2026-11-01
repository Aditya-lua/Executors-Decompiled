
void FUN_004ff7e4(long *param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  undefined *puVar3;
  code *pcVar4;
  int iVar5;
  undefined8 *puVar6;
  long *extraout_x8;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  long lVar12;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined8 *puVar18;
  undefined1 auVar19 [16];
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  undefined *puStack_90;
  undefined *puStack_88;
  undefined1 auStack_80 [16];
  undefined8 uStack_70;
  
  puVar6 = (undefined8 *)func_0x00187bd0(0x10,8);
  if (puVar6 != (undefined8 *)0x0) {
    uVar7 = *(undefined8 *)(param_2 + 0x238);
    *puVar6 = *(undefined8 *)(param_2 + 0x230);
    puVar6[1] = uVar7;
    uStack0000000000000008 = 1;
    in_stack_00000018 = 1;
    puVar18 = *(undefined8 **)(param_2 + 0x40);
    puVar11 = puVar18 + *(long *)(param_2 + 0x48) * 3;
    in_stack_00000010 = puVar6;
    do {
      lVar15 = in_stack_00000018;
      do {
        puVar13 = puVar18;
        if (puVar13 == puVar11) {
          param_1[1] = (long)in_stack_00000010;
          *param_1 = uStack0000000000000008;
          param_1[2] = in_stack_00000018;
          return;
        }
        puVar18 = puVar13 + 3;
      } while (*(char *)(puVar13 + 2) != '\x01');
      uVar7 = *puVar13;
      uVar1 = puVar13[1];
      if (in_stack_00000018 == uStack0000000000000008) {
        func_0x007a5594(&uStack0000000000000008,in_stack_00000018,1,8,0x10);
        puVar6 = in_stack_00000010;
      }
      puVar6[lVar15 * 2] = uVar7;
      (puVar6 + lVar15 * 2)[1] = uVar1;
      in_stack_00000018 = lVar15 + 1;
    } while( true );
  }
  uVar7 = func_0x007a1f18(8,0x10);
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 4,8);
  }
  auVar19 = __Unwind_Resume(uVar7);
  lVar17 = auVar19._8_8_;
  lVar15 = auVar19._0_8_;
  if ((*(byte *)(lVar17 + 0x250) >> 1 & 1) == 0) {
    lStack_c0 = 0;
    lStack_b8 = 8;
    lStack_b0 = 0;
    if (*(long *)(lVar17 + 0x78) != 0) {
      puVar18 = *(undefined8 **)(lVar17 + 0x70);
      puVar6 = puVar18 + *(long *)(lVar17 + 0x78) * 2;
      lVar17 = *(long *)(lVar15 + 0x88);
      lVar16 = *(long *)(lVar15 + 0x90);
      lVar8 = *(long *)(lVar15 + 0xd8);
      if (lVar8 == 0) {
        if (lVar16 == 0) {
LAB_004ffc18:
          puStack_90 = &UNK_009e89c0;
          puStack_88 = (undefined *)0x1;
          auStack_80._8_8_ = 0;
          uStack_70 = 0;
          auStack_80._0_8_ = 8;
          func_0x007a2420(&puStack_90,&UNK_009e89d0);
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x4ffc48);
          (*pcVar4)();
        }
        do {
          lVar9 = lStack_b0;
          puVar11 = puVar18 + 2;
          lVar12 = puVar18[1];
          lVar15 = lVar17;
          lVar8 = lVar16 * 600;
          while ((*(long *)(lVar15 + 0x220) != lVar12 ||
                 (iVar5 = _memcmp(*(undefined8 *)(lVar15 + 0x218),*puVar18,lVar12), iVar5 != 0))) {
            lVar15 = lVar15 + 600;
            lVar8 = lVar8 + -600;
            if (lVar8 == 0) goto LAB_004ffc18;
          }
          if (lVar9 == lStack_c0) {
            func_0x0050c238(&lStack_c0,&UNK_009e8990);
          }
          *(long *)(lStack_b8 + lVar9 * 8) = lVar15;
          lStack_b0 = lVar9 + 1;
          puVar18 = puVar11;
        } while (puVar11 != puVar6);
      }
      else {
        lVar9 = *(long *)(lVar15 + 0xd0);
        if (lVar16 == 0) {
          do {
            puVar11 = puVar18 + 2;
            lVar16 = puVar18[1];
            puVar13 = (undefined8 *)(lVar9 + 0x48);
            lVar17 = lVar8 * 0x60;
            while ((puVar13[1] != lVar16 || (iVar5 = _memcmp(*puVar13,*puVar18,lVar16), iVar5 != 0))
                  ) {
              puVar13 = puVar13 + 0xc;
              lVar17 = lVar17 + -0x60;
              if (lVar17 == 0) goto LAB_004ffc18;
            }
            func_0x00505704(&puStack_90,lVar15,puVar13);
            puVar3 = puStack_88;
            lStack_a0 = (long)puStack_88 + auStack_80._0_8_ * 0x10;
            lStack_a8 = (long)puStack_88;
            lStack_98 = lVar15;
            func_0x004e05e8(&lStack_c0,&lStack_a8,&UNK_009e89a8);
            if (puStack_90 != (undefined *)0x0) {
              func_0x00187bd4(puVar3,(long)puStack_90 << 4,8);
            }
            puVar18 = puVar11;
          } while (puVar11 != puVar6);
        }
        else {
          do {
            puVar11 = puVar18 + 2;
            lVar14 = puVar18[1];
            lVar10 = lVar16 * 600;
            lVar12 = lVar17;
            do {
              if ((*(long *)(lVar12 + 0x220) == lVar14) &&
                 (iVar5 = _memcmp(*(undefined8 *)(lVar12 + 0x218),*puVar18,lVar14),
                 lVar2 = lStack_b0, iVar5 == 0)) {
                if (lStack_b0 == lStack_c0) {
                  func_0x0050c238(&lStack_c0,&UNK_009e8990);
                }
                *(long *)(lStack_b8 + lVar2 * 8) = lVar12;
                lStack_b0 = lVar2 + 1;
                goto LAB_004ff984;
              }
              lVar12 = lVar12 + 600;
              lVar10 = lVar10 + -600;
            } while (lVar10 != 0);
            lVar12 = lVar8 * 0x60;
            puVar13 = (undefined8 *)(lVar9 + 0x48);
            while ((puVar13[1] != lVar14 || (iVar5 = _memcmp(*puVar13,*puVar18,lVar14), iVar5 != 0))
                  ) {
              puVar13 = puVar13 + 0xc;
              lVar12 = lVar12 + -0x60;
              if (lVar12 == 0) goto LAB_004ffc18;
            }
            func_0x00505704(&puStack_90,lVar15,puVar13);
            puVar3 = puStack_88;
            lStack_a0 = (long)puStack_88 + auStack_80._0_8_ * 0x10;
            lStack_a8 = (long)puStack_88;
            lStack_98 = lVar15;
            func_0x004e05e8(&lStack_c0,&lStack_a8,&UNK_009e89a8);
            if (puStack_90 != (undefined *)0x0) {
              func_0x00187bd4(puVar3,(long)puStack_90 << 4,8);
            }
LAB_004ff984:
            puVar18 = puVar11;
          } while (puVar11 != puVar6);
        }
      }
    }
    extraout_x8[1] = lStack_b8;
    *extraout_x8 = lStack_c0;
    extraout_x8[2] = lStack_b0;
  }
  else {
    puStack_90 = *(undefined **)(lVar17 + 0x70);
    puStack_88 = puStack_90 + *(long *)(lVar17 + 0x78) * 0x10;
    auStack_80 = auVar19;
    func_0x004e5d48(&puStack_90,&UNK_009e88f8);
  }
  return;
}

