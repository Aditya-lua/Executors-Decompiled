
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0014c044(void)

{
  long lVar1;
  undefined8 *extraout_x1;
  undefined8 *extraout_x1_00;
  undefined8 *extraout_x1_01;
  undefined8 *extraout_x1_02;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 *puVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined8 *puVar7;
  long unaff_x21;
  long unaff_x23;
  long unaff_x25;
  int *unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar12;
  ulong uVar11;
  int iVar13;
  int iVar14;
  float fVar15;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  ulong unaff_d10;
  float unaff_s13;
  undefined1 auVar16 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined *in_stack_00000060;
  undefined *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  double in_stack_000000b0;
  double in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  float in_stack_000000d0;
  undefined8 in_stack_000000e0;
  undefined *puStack_100;
  undefined8 uStack_f8;
  undefined *puStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  float *pfStack_d0;
  undefined *puStack_c8;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  double dStack_a8;
  double dStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  float afStack_88 [6];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  long lStack_48;
  
  do {
    uVar5 = 0;
    func_0x007b69a0();
    puVar7 = extraout_x1_01;
    do {
      do {
        while( true ) {
          unaff_x28 = unaff_x28 + 1;
          unaff_x23 = unaff_x23 + 0x38;
          if (*unaff_x26 <= unaff_x28) {
            do {
              unaff_x25 = unaff_x25 + (long)unaff_x26[8] * 0x14;
              in_stack_00000028 = in_stack_00000028 + (long)unaff_x26[4] * 2;
              in_stack_00000010 = in_stack_00000010 + 1;
              if (*(int *)(unaff_x21 + 4) <= in_stack_00000010) {
                uStack0000000000000050 = PTR___NSConcreteStackBlock_009b0030;
                in_stack_00000058 = _UNK_0080be50;
                in_stack_00000060 = &DAT_0014c354;
                in_stack_00000068 = &UNK_009bd838;
                in_stack_00000070 = in_stack_00000018;
                in_stack_00000078 = in_stack_00000020;
                puVar4 = &uStack0000000000000050;
                func_0x007b6220(in_stack_00000008,puVar7,puVar4);
                if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x90)) {
                  return;
                }
                auVar16 = ___stack_chk_fail();
                uVar2 = auVar16._8_8_;
                lVar1 = auVar16._0_8_;
                lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
                auVar16 = func_0x000bae3c();
                uVar3 = auVar16._8_8_;
                if (auVar16._0_8_ == 0) {
                  puVar7 = (undefined8 *)0x0;
                }
                else {
                  auVar16 = func_0x000c2db8();
                  uVar3 = auVar16._8_8_;
                  puVar7 = *(undefined8 **)(auVar16._0_8_ + 0x90);
                }
                func_0x007b75e0(uVar2,uVar3,0);
                auVar16 = func_0x007b68c0(*puVar7);
                func_0x007b7680(uVar2,auVar16._8_8_,auVar16._0_8_);
                uStack_b8 = 0;
                uStack_b0 = 0;
                dStack_a8 = (double)((float)*(undefined8 *)(lVar1 + 0x28) *
                                    (float)*(undefined8 *)(lVar1 + 0x30));
                dStack_a0 = (double)((float)((ulong)*(undefined8 *)(lVar1 + 0x28) >> 0x20) *
                                    (float)((ulong)*(undefined8 *)(lVar1 + 0x30) >> 0x20));
                uStack_90 = _UNK_00813828;
                uStack_98 = _UNK_00813820;
                func_0x007b7c80(uVar2,extraout_x1_03,&uStack_b8);
                afStack_88[3] = 0.0;
                afStack_88[4] = 0.0;
                afStack_88[1] = 0.0;
                afStack_88[2] = 0.0;
                uStack_70 = 0;
                uStack_68 = 0;
                fVar8 = (float)*(undefined8 *)(lVar1 + 0x20);
                fVar10 = fVar8 + (float)*(undefined8 *)(lVar1 + 0x28);
                fVar9 = (float)((ulong)*(undefined8 *)(lVar1 + 0x20) >> 0x20);
                fVar12 = fVar9 + (float)((ulong)*(undefined8 *)(lVar1 + 0x28) >> 0x20);
                afStack_88[0] = 2.0 / (fVar10 - fVar8);
                afStack_88[5] = 2.0 / (fVar9 - fVar12);
                uStack_58 = CONCAT44((fVar9 + fVar12) / (fVar12 - fVar9),
                                     (fVar8 + fVar10) / (fVar8 - fVar10));
                uStack_60 = _UNK_0080c198;
                uStack_50 = _UNK_0080c128;
                func_0x007b7be0(uVar2,extraout_x1_04,afStack_88,0x40,1);
                func_0x007b79a0(uVar2,extraout_x1_05,puVar4);
                auVar16 = func_0x007b6400(unaff_x27);
                func_0x007b7ba0(uVar2,auVar16._8_8_,auVar16._0_8_,0,0);
                func_0x007b7bc0(uVar2,extraout_x1_06,uVar5,0);
                if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
                  return;
                }
                lVar1 = ___stack_chk_fail();
                puStack_c8 = &DAT_0014c354;
                puStack_100 = PTR___NSConcreteStackBlock_009b0030;
                uStack_f8 = _UNK_0080be50;
                puStack_f0 = &DAT_0014c3b0;
                puStack_e8 = &UNK_009bd808;
                uStack_d8 = *(undefined8 *)(lVar1 + 0x28);
                uStack_e0 = *(undefined8 *)(lVar1 + 0x20);
                pfStack_d0 = afStack_88 + 0x1e;
                _dispatch_async(PTR___dispatch_main_q_009b0208,&puStack_100);
                return;
              }
              unaff_x26 = *(int **)(*(long *)(unaff_x21 + 0x18) + in_stack_00000010 * 8);
              func_0x007b6400(in_stack_00000018);
              lVar1 = func_0x007b66a0();
              _memcpy(lVar1 + unaff_x25,*(undefined8 *)(unaff_x26 + 10),(long)unaff_x26[8] * 0x14);
              func_0x007b6400(in_stack_00000020);
              lVar1 = func_0x007b66a0();
              _memcpy(lVar1 + in_stack_00000028,*(undefined8 *)(unaff_x26 + 6),
                      (long)unaff_x26[4] << 1);
              puVar7 = extraout_x1;
            } while (*unaff_x26 < 1);
            unaff_x23 = 0;
            unaff_x28 = 0;
          }
          puVar7 = (undefined8 *)(*(long *)(unaff_x26 + 2) + unaff_x23);
          pcVar6 = (code *)puVar7[5];
          if (pcVar6 == (code *)0x0) break;
          if (pcVar6 == (code *)0xfffffffffffffff8) {
            lVar1 = func_0x000bae3c();
            if (lVar1 == 0) {
              puVar7 = (undefined8 *)0x0;
            }
            else {
              lVar1 = func_0x000c2db8();
              puVar7 = *(undefined8 **)(lVar1 + 0x90);
            }
            func_0x007b75e0();
            func_0x007b68c0(*puVar7);
            func_0x007b7680();
            in_stack_000000a0 = 0;
            in_stack_000000a8 = 0;
            in_stack_000000b0 =
                 (double)((float)*(undefined8 *)(unaff_x21 + 0x28) *
                         (float)*(undefined8 *)(unaff_x21 + 0x30));
            in_stack_000000b8 =
                 (double)((float)((ulong)*(undefined8 *)(unaff_x21 + 0x28) >> 0x20) *
                         (float)((ulong)*(undefined8 *)(unaff_x21 + 0x30) >> 0x20));
            in_stack_000000c8 = in_stack_00000038;
            in_stack_000000c0 = in_stack_00000030;
            func_0x007b7c80();
            uVar5 = *(undefined8 *)(unaff_x21 + 0x28);
            fVar8 = (float)*(undefined8 *)(unaff_x21 + 0x20);
            fVar9 = (float)((ulong)*(undefined8 *)(unaff_x21 + 0x20) >> 0x20);
            *in_stack_00000048 = 0;
            in_stack_00000048[1] = 0;
            *in_stack_00000040 = 0;
            in_stack_00000040[1] = 0;
            in_stack_000000d0 = unaff_s13 / ((fVar8 + (float)uVar5) - fVar8);
            in_stack_000000e0._4_4_ = unaff_s13 / (fVar9 - (fVar9 + (float)((ulong)uVar5 >> 0x20)));
            func_0x007b7be0();
            func_0x007b79a0();
            func_0x007b6400(in_stack_00000018);
            uVar5 = 0;
            func_0x007b7ba0();
            unaff_x27 = 0;
            func_0x007b7bc0();
            puVar7 = extraout_x1_02;
          }
          else {
            (*pcVar6)(unaff_x26);
            puVar7 = extraout_x1_00;
          }
        }
        fVar15 = (float)((ulong)unaff_d8 >> 0x20);
        fVar8 = (float)unaff_d9 * ((float)*puVar7 - (float)unaff_d8);
        fVar12 = (float)((ulong)unaff_d9 >> 0x20);
        fVar9 = fVar12 * ((float)((ulong)*puVar7 >> 0x20) - fVar15);
        iVar13 = -(uint)(fVar8 < 0.0);
        iVar14 = -(uint)(fVar9 < 0.0);
        fVar8 = (float)CONCAT13((byte)((uint)fVar8 >> 0x18) & ~(byte)((uint)iVar13 >> 0x18),
                                CONCAT12((byte)((uint)fVar8 >> 0x10) & ~(byte)((uint)iVar13 >> 0x10)
                                         ,CONCAT11((byte)((uint)fVar8 >> 8) &
                                                   ~(byte)((uint)iVar13 >> 8),
                                                   SUB41(fVar8,0) & ~(byte)iVar13)));
        fVar10 = (float)unaff_d9 * ((float)puVar7[1] - (float)unaff_d8);
        fVar12 = fVar12 * ((float)((ulong)puVar7[1] >> 0x20) - fVar15);
        uVar11 = CONCAT44(fVar12,fVar10);
        uVar11 = uVar11 ^ (uVar11 ^ unaff_d10) &
                          CONCAT44(-(uint)((float)(unaff_d10 >> 0x20) < fVar12),
                                   -(uint)((float)unaff_d10 < fVar10));
        fVar10 = (float)uVar11;
        fVar9 = (float)(CONCAT17((byte)((uint)fVar9 >> 0x18) & ~(byte)((uint)iVar14 >> 0x18),
                                 CONCAT16((byte)((uint)fVar9 >> 0x10) &
                                          ~(byte)((uint)iVar14 >> 0x10),
                                          CONCAT15((byte)((uint)fVar9 >> 8) &
                                                   ~(byte)((uint)iVar14 >> 8),
                                                   CONCAT14(SUB41(fVar9,0) & ~(byte)iVar14,fVar8))))
                       >> 0x20);
        fVar12 = (float)(uVar11 >> 0x20);
      } while (!(bool)(~(fVar10 <= fVar8) & ~(fVar12 <= fVar9)));
      lVar1 = *(long *)(unaff_x26 + 2) + unaff_x23;
    } while (*(int *)(lVar1 + 0x20) == 0);
    in_stack_00000080 = (long)fVar8;
    in_stack_00000088 = (long)fVar9;
    in_stack_00000090 = (long)(fVar10 - fVar8);
    in_stack_00000098 = (long)(fVar12 - fVar9);
    func_0x007b7a20();
    if (*(long *)(lVar1 + 0x10) != 0) {
      func_0x007b77a0();
    }
    func_0x007b7bc0();
    unaff_x27 = (ulong)*(uint *)(lVar1 + 0x20);
    func_0x007b6400(in_stack_00000020);
  } while( true );
}

