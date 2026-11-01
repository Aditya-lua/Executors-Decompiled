
void FUN_0059ffb8(ulong param_1)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  dword *pdVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long *unaff_x19;
  undefined8 unaff_x20;
  ulong *unaff_x21;
  undefined8 uVar9;
  ulong unaff_x25;
  long lVar10;
  long unaff_x29;
  long lVar11;
  undefined1 auVar12 [16];
  long lVar13;
  undefined8 uStack0000000000000008;
  dword *in_stack_00000010;
  long in_stack_00000018;
  int iStack0000000000000020;
  undefined8 *in_stack_00000028;
  undefined1 in_stack_00000030;
  undefined7 uStack0000000000000031;
  ulong in_stack_00000038;
  undefined8 *in_stack_00000040;
  ulong in_stack_00000048;
  undefined8 *in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 *in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  undefined8 *in_stack_00000080;
  ulong in_stack_00000088;
  undefined8 *in_stack_00000090;
  
  param_1 = param_1 >> 3;
  uVar9 = 0;
  *(ulong *)(unaff_x29 + -0x68) = param_1;
  uVar5 = param_1;
  if (param_1 < 4) {
    uVar5 = 3;
  }
  if (param_1 < 0x1fffffffffffffff) {
    lVar10 = uVar5 + 1;
    unaff_x25 = lVar10 * 8;
    if (unaff_x25 < 0x7ffffffffffffff9) {
      if (unaff_x25 == 0) {
        lVar10 = 0;
        pdVar4 = &MACH_HEADER.cpusubtype;
      }
      else {
        uVar9 = 8;
        pdVar4 = (dword *)func_0x00187bd0(unaff_x25,8);
        if (pdVar4 == (dword *)0x0) goto LAB_005a030c;
      }
      *(undefined8 *)pdVar4 = unaff_x20;
      in_stack_00000018 = 1;
      in_stack_00000068 = unaff_x21[9];
      in_stack_00000060 = (undefined8 *)unaff_x21[8];
      in_stack_00000078 = unaff_x21[0xb];
      in_stack_00000070 = unaff_x21[10];
      in_stack_00000088 = unaff_x21[0xd];
      in_stack_00000080 = (undefined8 *)unaff_x21[0xc];
      in_stack_00000090 = (undefined8 *)unaff_x21[0xe];
      in_stack_00000028 = (undefined8 *)unaff_x21[1];
      _iStack0000000000000020 = *unaff_x21;
      in_stack_00000038 = unaff_x21[3];
      in_stack_00000030 = (undefined1)unaff_x21[2];
      uStack0000000000000031 = (undefined7)(unaff_x21[2] >> 8);
      in_stack_00000048 = unaff_x21[5];
      in_stack_00000040 = (undefined8 *)unaff_x21[4];
      in_stack_00000058 = unaff_x21[7];
      in_stack_00000050 = (undefined8 *)unaff_x21[6];
      uStack0000000000000008 = lVar10;
      in_stack_00000010 = pdVar4;
      do {
        lVar10 = in_stack_00000018;
        if (in_stack_00000078 == 0) {
LAB_005a012c:
          uVar5 = _iStack0000000000000020;
          if ((int)_iStack0000000000000020 != 1) {
LAB_005a02a0:
            if (uVar5 != 0) {
              if ((in_stack_00000028 != (undefined8 *)0x0) && (in_stack_00000038 != 0)) {
                func_0x00187bd4(in_stack_00000028,in_stack_00000038 << 3,8);
              }
              if ((in_stack_00000048 != 0) && (in_stack_00000058 != 0)) {
                func_0x00187bd4(in_stack_00000048,in_stack_00000058 << 3,8);
              }
            }
            unaff_x19[1] = (long)in_stack_00000010;
            *unaff_x19 = uStack0000000000000008;
            unaff_x19[2] = in_stack_00000018;
            return;
          }
          if (in_stack_00000028 == (undefined8 *)0x0) goto LAB_005a0180;
          puVar7 = (undefined8 *)CONCAT71(uStack0000000000000031,in_stack_00000030);
          if (puVar7 == in_stack_00000040) {
            do {
              if (in_stack_00000038 != 0) {
                func_0x00187bd4(in_stack_00000028,in_stack_00000038 << 3,8);
              }
              in_stack_00000028 = (undefined8 *)0x0;
LAB_005a0180:
              if ((in_stack_00000068 == 0) || (in_stack_00000068 == in_stack_00000070)) {
LAB_005a01b0:
                if (in_stack_00000048 == 0) goto LAB_005a02a0;
                if (in_stack_00000050 != in_stack_00000060) {
                  uVar9 = *in_stack_00000050;
                  in_stack_00000050 = in_stack_00000050 + 1;
                  goto joined_r0x005a01d8;
                }
                if (in_stack_00000058 != 0) {
                  func_0x00187bd4(in_stack_00000048,in_stack_00000058 << 3,8);
                }
                in_stack_00000048 = 0;
                goto LAB_005a02a0;
              }
              in_stack_00000068 = in_stack_00000068 + 0x40;
              func_0x005a54e8(unaff_x29 + -0x68);
              uVar8 = *(ulong *)(unaff_x29 + -0x68);
              if (uVar8 == 0x8000000000000000) goto LAB_005a01b0;
              puVar7 = *(undefined8 **)(unaff_x29 + -0x60);
              in_stack_00000040 = puVar7 + *(long *)(unaff_x29 + -0x58);
              in_stack_00000030 = SUB81(puVar7,0);
              uStack0000000000000031 = (undefined7)((ulong)puVar7 >> 8);
              in_stack_00000028 = puVar7;
              in_stack_00000038 = uVar8;
            } while (puVar7 == in_stack_00000040);
          }
          uVar9 = *puVar7;
          in_stack_00000030 = SUB81(puVar7 + 1,0);
          uStack0000000000000031 = (undefined7)((ulong)(puVar7 + 1) >> 8);
joined_r0x005a01d8:
          if (lVar10 == uStack0000000000000008) {
            if (iStack0000000000000020 == 1) {
              auVar12[8] = in_stack_00000030;
              auVar12._0_8_ = in_stack_00000028;
              auVar2._8_8_ = in_stack_00000048;
              auVar2._0_8_ = in_stack_00000040;
              auVar12[9] = (char)uStack0000000000000031;
              auVar12[10] = (char)((uint7)uStack0000000000000031 >> 8);
              auVar12[0xb] = (char)((uint7)uStack0000000000000031 >> 0x10);
              auVar12[0xc] = (char)((uint7)uStack0000000000000031 >> 0x18);
              auVar12[0xd] = (char)((uint7)uStack0000000000000031 >> 0x20);
              auVar12[0xe] = (char)((uint7)uStack0000000000000031 >> 0x28);
              auVar12[0xf] = (char)((uint7)uStack0000000000000031 >> 0x30);
              auVar12 = NEON_ext(auVar2,auVar12,8,1);
              lVar11 = -(ulong)(auVar12._0_8_ == 0);
              lVar13 = -(ulong)(auVar12._8_8_ == 0);
              uVar8 = (long)in_stack_00000040 - CONCAT71(uStack0000000000000031,in_stack_00000030);
              uVar5 = (ulong)((long)in_stack_00000060 - (long)in_stack_00000050) >> 3;
              uVar1 = uVar8 >> 3;
              uVar5 = CONCAT17((byte)((ulong)((long)in_stack_00000060 - (long)in_stack_00000050) >>
                                     0x3b) & ~(byte)((ulong)lVar11 >> 0x38),
                               CONCAT16((byte)(uVar5 >> 0x30) & ~(byte)((ulong)lVar11 >> 0x30),
                                        CONCAT15((byte)(uVar5 >> 0x28) &
                                                 ~(byte)((ulong)lVar11 >> 0x28),
                                                 CONCAT14((byte)(uVar5 >> 0x20) &
                                                          ~(byte)((ulong)lVar11 >> 0x20),
                                                          CONCAT13((byte)(uVar5 >> 0x18) &
                                                                   ~(byte)((ulong)lVar11 >> 0x18),
                                                                   CONCAT12((byte)(uVar5 >> 0x10) &
                                                                            ~(byte)((ulong)lVar11 >>
                                                                                   0x10),
                                                                            CONCAT11((byte)(uVar5 >>
                                                                                           8) &
                                                                                     ~(byte)((ulong)
                                                  lVar11 >> 8),(byte)uVar5 & ~(byte)lVar11))))))) +
                      CONCAT17((byte)(uVar8 >> 0x3b) & ~(byte)((ulong)lVar13 >> 0x38),
                               CONCAT16((byte)(uVar1 >> 0x30) & ~(byte)((ulong)lVar13 >> 0x30),
                                        CONCAT15((byte)(uVar1 >> 0x28) &
                                                 ~(byte)((ulong)lVar13 >> 0x28),
                                                 CONCAT14((byte)(uVar1 >> 0x20) &
                                                          ~(byte)((ulong)lVar13 >> 0x20),
                                                          CONCAT13((byte)(uVar1 >> 0x18) &
                                                                   ~(byte)((ulong)lVar13 >> 0x18),
                                                                   CONCAT12((byte)(uVar1 >> 0x10) &
                                                                            ~(byte)((ulong)lVar13 >>
                                                                                   0x10),
                                                                            CONCAT11((byte)(uVar1 >>
                                                                                           8) &
                                                                                     ~(byte)((ulong)
                                                  lVar13 >> 8),(byte)uVar1 & ~(byte)lVar13)))))));
              uVar8 = (ulong)(in_stack_00000068 == 0 || in_stack_00000070 == in_stack_00000068);
              puVar6 = (ulong *)(unaff_x29 + -0x68);
            }
            else {
              uVar5 = 0;
              uVar8 = 0;
              puVar6 = (ulong *)(unaff_x29 + -0x70);
            }
LAB_005a0244:
            *puVar6 = uVar8;
            func_0x007af5a0(&uStack0000000000000008,lVar10,uVar5 + 1,8,8);
            pdVar4 = in_stack_00000010;
          }
        }
        else {
          if (in_stack_00000080 == in_stack_00000090) {
            if (in_stack_00000088 != 0) {
              func_0x00187bd4(in_stack_00000078,in_stack_00000088 << 3,8);
            }
            in_stack_00000078 = 0;
            goto LAB_005a012c;
          }
          puVar7 = in_stack_00000080 + 1;
          uVar9 = *in_stack_00000080;
          in_stack_00000080 = puVar7;
          if (in_stack_00000018 == uStack0000000000000008) {
            uVar5 = (ulong)((long)in_stack_00000090 - (long)puVar7) >> 3;
            if ((_iStack0000000000000020 & 1) != 0) {
              uVar8 = 0;
              if (in_stack_00000028 != (undefined8 *)0x0) {
                uVar8 = (ulong)((long)in_stack_00000040 -
                               CONCAT71(uStack0000000000000031,in_stack_00000030)) >> 3;
              }
              uVar1 = 0;
              if (in_stack_00000048 != 0) {
                uVar1 = (ulong)((long)in_stack_00000060 - (long)in_stack_00000050) >> 3;
              }
              uVar5 = uVar8 + uVar5 + uVar1;
            }
            puVar6 = (ulong *)(unaff_x29 + -0x70);
            uVar8 = uVar5;
            goto LAB_005a0244;
          }
        }
        *(undefined8 *)(pdVar4 + lVar10 * 2) = uVar9;
        in_stack_00000018 = lVar10 + 1;
      } while( true );
    }
  }
LAB_005a030c:
  func_0x007a1f00(uVar9,unaff_x25);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5a0320);
  (*pcVar3)();
}

