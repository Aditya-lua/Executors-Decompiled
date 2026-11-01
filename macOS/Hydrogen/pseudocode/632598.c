
void FUN_00632598(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  undefined8 extraout_x8;
  long in_x9;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar10;
  undefined8 unaff_x22;
  long unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  undefined1 in_stack_00000070;
  undefined1 uStack0000000000000080;
  undefined *puStack_168;
  undefined *puStack_160;
  ulong uStack_150;
  ulong uStack_148;
  long lStack_140;
  undefined *puStack_130;
  ulong uStack_120;
  ulong uStack_118;
  long lStack_110;
  long lStack_f8;
  long lStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 *puStack_d8;
  long lStack_d0;
  undefined8 uStack_c8;
  long lStack_c0;
  undefined *puStack_b8;
  undefined4 uStack_a8;
  undefined1 auStack_a4 [3];
  undefined1 uStack_a1;
  undefined *puStack_a0;
  undefined *puStack_98;
  long lStack_48;
  
  do {
    param_1 = param_1 - 1;
    if (param_1 == 0) {
      do {
        func_0x00611644();
        do {
          uStack0000000000000010 = unaff_x24 + 0x10;
          uVar3 = in_stack_00000020;
          if (in_stack_00000028 <= in_stack_00000020) {
            uVar3 = in_stack_00000028;
          }
          if (in_stack_00000030 != 0) {
            if (uVar3 != 0) {
              do {
                *(undefined8 *)(in_stack_00000030 + -8 + uVar3 * 8) = 0;
                uVar3 = uVar3 - 1;
              } while (uVar3 != 0);
            }
            func_0x00611644();
          }
          uVar3 = func_0x006129e8(&uStack0000000000000080);
          if ((uVar3 & 1) != 0) {
            if ((*(long *)(unaff_x19 + 0xb0) != *(long *)(unaff_x19 + 0xb8)) &&
               (iVar2 = (**(code **)(*unaff_x20 + 0x10))(), iVar2 != 0)) {
              unaff_x21 = &uStack0000000000000008;
              (**(code **)(*unaff_x20 + 0x20))(&uStack0000000000000008);
              func_0x005ffccc(unaff_x19 + 0x10,&uStack0000000000000010);
              func_0x005ffccc(unaff_x19 + 0x40,&uStack0000000000000040);
              *(undefined1 *)(unaff_x19 + 0x70) = in_stack_00000070;
              lVar9 = unaff_x24 + 0x10;
              if (in_stack_00000058 <= in_stack_00000050) {
                in_stack_00000050 = in_stack_00000058;
              }
              uStack0000000000000008 = unaff_x25;
              uStack0000000000000040 = lVar9;
              if (in_stack_00000060 != 0) {
                if (in_stack_00000050 != 0) {
                  do {
                    *(undefined8 *)(in_stack_00000060 + -8 + in_stack_00000050 * 8) = 0;
                    in_stack_00000050 = in_stack_00000050 - 1;
                  } while (in_stack_00000050 != 0);
                }
                func_0x00611644();
              }
              uVar3 = in_stack_00000020;
              if (in_stack_00000028 <= in_stack_00000020) {
                uVar3 = in_stack_00000028;
              }
              uStack0000000000000010 = lVar9;
              if (in_stack_00000030 != 0) {
                if (uVar3 != 0) {
                  do {
                    *(undefined8 *)(in_stack_00000030 + -8 + uVar3 * 8) = 0;
                    uVar3 = uVar3 - 1;
                  } while (uVar3 != 0);
                }
                func_0x00611644();
              }
            }
            func_0x00612a40(&uStack0000000000000080);
            func_0x00613f64(&uStack0000000000000080);
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
              return;
            }
            auVar12 = ___stack_chk_fail();
            if (auVar12._8_4_ == 0) {
              __Unwind_Resume(auVar12._0_8_);
            }
            uVar5 = func_0x0001753c(auVar12._0_8_);
            func_0x00613f64(&uStack0000000000000080);
            uVar5 = __Unwind_Resume(uVar5);
            func_0x00613f64(&uStack0000000000000080);
            auVar11 = __Unwind_Resume(uVar5);
            lVar6 = auVar11._0_8_;
            lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
            func_0x006129a4(&puStack_a0,param_4,0x30);
            puStack_a0 = &UNK_009f6108;
            puStack_98 = &UNK_009f6298;
            uStack_a8 = 0;
            auStack_a4[0] = 1;
            uStack_a1 = 2;
            func_0x00698dbc(&puStack_a0,&uStack_a1,1,0,1);
            func_0x00611648(&puStack_a0,1);
            lVar8 = 1;
            (**(code **)(puStack_a0 + 0x38))(&puStack_a0,auStack_a4,1,0,1);
            func_0x00602890(lVar6 + 0x80,&puStack_a0);
            lVar9 = *(long *)(lVar6 + 0xb0);
            if (*(long *)(lVar6 + 0xb8) != lVar9) {
              unaff_x22 = 0x70;
              puVar4 = (undefined8 *)0x0;
              puVar10 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
              do {
                lVar8 = lVar9 + (long)puVar4 * 0x70;
                (**(code **)(*auVar11._8_8_ + 0x38))(auVar11._8_8_,&puStack_a0,lVar8);
                lVar9 = *(long *)(lVar6 + 0xb0);
                unaff_x21 = (undefined8 *)(ulong)((int)puVar10 + 1);
                bVar1 = puVar10 < (undefined8 *)
                                  ((*(long *)(lVar6 + 0xb8) - lVar9 >> 4) * 0x6db6db6db6db6db7);
                puVar4 = puVar10;
                puVar10 = unaff_x21;
              } while (bVar1);
            }
            func_0x00612b0c(&puStack_a0);
            func_0x006143a8(&puStack_a0);
            if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
              return;
            }
            ___stack_chk_fail();
            uVar5 = __Unwind_Resume();
            func_0x006143a8(&puStack_a0);
            uVar5 = __Unwind_Resume(uVar5);
            func_0x006143a8(&puStack_a0);
            auVar11 = __Unwind_Resume(uVar5);
            plVar7 = auVar11._8_8_;
            lVar9 = auVar11._0_8_;
            puStack_b8 = &DAT_00632958;
            lStack_f8 = 0;
            lStack_f0 = 0;
            uStack_e8 = 0;
            uStack_e0 = unaff_x22;
            puStack_d8 = unaff_x21;
            lStack_d0 = lVar6;
            uStack_c8 = uVar5;
            lStack_c0 = (long)register0x00000008 + -0x10;
            func_0x00632b44(&lStack_f8,
                            (*(long *)(lVar9 + 0xb8) - *(long *)(lVar9 + 0xb0) >> 4) *
                            0x6db6db6db6db6db7);
            func_0x00632c7c(lVar9,plVar7,&lStack_f8,lVar8);
            uVar5 = (**(code **)(*plVar7 + 0x28))(plVar7);
            func_0x00633274(&puStack_168,uVar5,lStack_f8,lStack_f0);
            (**(code **)(*plVar7 + 0x20))(extraout_x8,plVar7,&puStack_168);
            puStack_168 = &UNK_00a09a40;
            puStack_130 = &UNK_009f5d60;
            if (uStack_118 <= uStack_120) {
              uStack_120 = uStack_118;
            }
            if (lStack_110 != 0) {
              if (uStack_120 != 0) {
                do {
                  *(undefined8 *)(lStack_110 + -8 + uStack_120 * 8) = 0;
                  uStack_120 = uStack_120 - 1;
                } while (uStack_120 != 0);
              }
              func_0x00611644();
            }
            puStack_160 = &UNK_009f5d60;
            if (uStack_148 <= uStack_150) {
              uStack_150 = uStack_148;
            }
            if (lStack_140 != 0) {
              if (uStack_150 != 0) {
                do {
                  *(undefined8 *)(lStack_140 + -8 + uStack_150 * 8) = 0;
                  uStack_150 = uStack_150 - 1;
                } while (uStack_150 != 0);
              }
              func_0x00611644();
            }
            lVar6 = lStack_f8;
            lVar9 = lStack_f0;
            if (lStack_f8 != 0) {
              while (lVar9 != lVar6) {
                *(undefined **)(lVar9 + -0x30) = &UNK_009f5d60;
                lVar8 = *(long *)(lVar9 + -0x10);
                uVar3 = *(ulong *)(lVar9 + -0x20);
                if (*(ulong *)(lVar9 + -0x18) <= *(ulong *)(lVar9 + -0x20)) {
                  uVar3 = *(ulong *)(lVar9 + -0x18);
                }
                if (lVar8 != 0) {
                  if (uVar3 != 0) {
                    do {
                      *(undefined8 *)(lVar8 + -8 + uVar3 * 8) = 0;
                      uVar3 = uVar3 - 1;
                    } while (uVar3 != 0);
                  }
                  func_0x00611644();
                }
                func_0x0064f6d0(lVar9 + -0xa0);
                lVar9 = lVar9 + -0xa0;
              }
              lStack_f0 = lVar6;
              __ZdlPv(lStack_f8);
            }
            return;
          }
          (**(code **)(*unaff_x20 + 0x30))(&uStack0000000000000008);
          puVar4 = *(undefined8 **)(unaff_x19 + 0xb8);
          if (puVar4 < *(undefined8 **)(unaff_x19 + 0xc0)) {
            *puVar4 = unaff_x25;
            func_0x005fe0b4(puVar4 + 1);
            func_0x005fe0b4(puVar4 + 7);
            *(undefined1 *)(puVar4 + 0xd) = in_stack_00000070;
            puVar4 = puVar4 + 0xe;
            *(undefined8 **)(unaff_x19 + 0xb8) = puVar4;
          }
          else {
            puVar4 = (undefined8 *)func_0x00651190();
          }
          *(undefined8 **)(unaff_x19 + 0xb8) = puVar4;
          param_1 = in_stack_00000050;
          if (in_stack_00000058 <= in_stack_00000050) {
            param_1 = in_stack_00000058;
          }
          uStack0000000000000008 = unaff_x25;
          uStack0000000000000040 = unaff_x26;
        } while (in_stack_00000060 == 0);
      } while (param_1 == 0);
      in_x9 = in_stack_00000060 + -8;
    }
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  } while( true );
}

