
void FUN_005e16a8(long param_1,long param_2)

{
  uint uVar1;
  byte *pbVar2;
  long lVar3;
  byte *pbVar4;
  byte bVar5;
  bool bVar6;
  ulong uVar7;
  byte *extraout_x9;
  byte bVar8;
  uint uVar9;
  ulong uVar10;
  ulong unaff_x19;
  byte *pbVar11;
  ulong uVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *unaff_x22;
  byte bVar16;
  byte *unaff_x23;
  long unaff_x24;
  byte *pbVar17;
  byte *pbVar18;
  long unaff_x29;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined8 *in_stack_00000008;
  ulong uStack0000000000000010;
  ulong uStack0000000000000040;
  ulong uStack0000000000000098;
  byte *in_stack_000000a0;
  byte *in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  byte *in_stack_000000b8;
  long in_stack_000000c0;
  byte *in_stack_000000d0;
  byte *in_stack_000000d8;
  byte *in_stack_000000e0;
  byte bStack00000000000000e8;
  byte bStack00000000000000e9;
  
  uStack0000000000000040 = 0;
  uVar7 = -unaff_x24;
  *(byte **)(unaff_x29 + -0x70) = unaff_x23;
  *(long *)(unaff_x29 + -0x68) = param_1;
  *(undefined8 *)(unaff_x29 + -0x60) = 0;
  uStack0000000000000010 = 0;
  if (uVar7 != 0) {
    uStack0000000000000010 = unaff_x19 / uVar7;
  }
  pbVar11 = (byte *)(unaff_x19 - uStack0000000000000010 * uVar7);
  uStack0000000000000010 = uStack0000000000000010 + 1;
LAB_005e16ec:
  auVar20._8_8_ = unaff_x22;
  auVar20._0_8_ = unaff_x23;
  uStack0000000000000098 = 0;
  if ((uStack0000000000000040 & 1) == 0) {
    auVar20 = func_0x005e0d84(&uStack00000000000000b0);
  }
  uVar7 = auVar20._8_8_;
  if (auVar20._0_8_ == 0) {
    uVar19 = *(undefined8 *)(unaff_x29 + -0x70);
    in_stack_00000008[1] = *(undefined8 *)(unaff_x29 + -0x68);
    *in_stack_00000008 = uVar19;
    in_stack_00000008[2] = *(undefined8 *)(unaff_x29 + -0x60);
    return;
  }
  if ((ulong)(*(long *)(unaff_x29 + -0x70) - param_2) < uVar7) {
    func_0x007afcf8(unaff_x29 + -0x70,param_2,uVar7,1,1);
    param_1 = *(long *)(unaff_x29 + -0x68);
    param_2 = *(long *)(unaff_x29 + -0x60);
  }
  _memcpy(param_1 + param_2,auVar20._0_8_,uVar7);
  bVar5 = bStack00000000000000e8;
  pbVar4 = in_stack_000000d8;
  lVar3 = in_stack_000000c0;
  pbVar2 = in_stack_000000b8;
  param_2 = param_2 + uVar7;
  *(long *)(unaff_x29 + -0x60) = param_2;
  bVar6 = pbVar11 != (byte *)0x0;
  pbVar15 = pbVar11 + -1;
  uVar7 = uStack0000000000000010;
  pbVar11 = (byte *)0x0;
  if (bVar6) {
    uVar7 = uStack0000000000000010 + 1;
    pbVar11 = pbVar15;
  }
  uStack0000000000000040 = uStack0000000000000098;
  if (uVar7 != 0) {
    uVar12 = 1;
    pbVar13 = pbVar11;
    pbVar14 = in_stack_000000d0;
    pbVar15 = uStack00000000000000b0;
    pbVar17 = in_stack_000000e0;
    pbVar18 = in_stack_000000a0;
    bVar16 = bStack00000000000000e9;
    do {
      if ((uStack0000000000000040 & 1) == 0) {
        in_stack_000000d0 = pbVar14;
        uStack00000000000000b0 = pbVar15;
        in_stack_000000e0 = pbVar17;
        bVar8 = bVar16;
LAB_005e17fc:
        do {
          pbVar18 = pbVar15;
          pbVar15 = in_stack_000000e0;
          if ((bVar8 & 1) != 0) {
LAB_005e1938:
            pbVar18 = (byte *)0x0;
            bStack00000000000000e9 = bVar16;
            goto LAB_005e1948;
          }
          do {
            while( true ) {
              while( true ) {
                do {
                  in_stack_000000e0 = pbVar15;
                  if (in_stack_000000d0 == pbVar4) {
                    bVar16 = 1;
                    if (((bVar5 & 1) == 0) && (pbVar2 == pbVar18)) goto LAB_005e1938;
                    bVar8 = 1;
                    pbVar13 = pbVar2 + -(long)pbVar18;
                    pbVar15 = pbVar18;
                    if (pbVar13 == (byte *)0x0) goto LAB_005e17fc;
                    goto code_r0x005e1920;
                  }
                  pbVar13 = in_stack_000000d0 + 1;
                  uVar9 = (uint)*in_stack_000000d0;
                  uVar10 = (ulong)uVar9;
                  if ((char)*in_stack_000000d0 < '\0') {
                    if (uVar9 < 0xe0) {
                      pbVar13 = in_stack_000000d0 + 2;
                      uVar10 = (ulong)(in_stack_000000d0[1] & 0x3f | (uVar9 & 0x1f) << 6);
                    }
                    else {
                      uVar1 = in_stack_000000d0[2] & 0x3f | (in_stack_000000d0[1] & 0x3f) << 6;
                      if (uVar9 < 0xf0) {
                        pbVar13 = in_stack_000000d0 + 3;
                        uVar10 = (ulong)(uVar1 | (uVar9 & 0x1f) << 0xc);
                      }
                      else {
                        pbVar13 = in_stack_000000d0 + 4;
                        uVar10 = (ulong)(in_stack_000000d0[3] & 0x3f | uVar1 << 6 |
                                        (uVar9 & 7) << 0x12);
                      }
                    }
                  }
                  pbVar15 = pbVar13 + ((long)in_stack_000000e0 - (long)in_stack_000000d0);
                  uVar9 = (uint)uVar10;
                  in_stack_000000d0 = pbVar13;
                  if (uVar9 < 0x21 && (1L << (uVar10 & 0x3f) & 0x100003e00U) != 0)
                  goto code_r0x005e17e8;
                  pbVar13 = in_stack_000000e0;
                } while (uVar9 < 0x80);
                uVar1 = uVar9 >> 8;
                if (0x1f < uVar1) break;
                if (uVar1 == 0) {
                  if (((&
                       __ZN4core7unicode12unicode_data11white_space14WHITESPACE_MAP17h271c64803ec2808fE
                       )[uVar10 & 0xff] & 1) != 0) goto code_r0x005e17e8;
                }
                else if ((uVar1 == 0x16) && (uVar9 == 0x1680)) goto code_r0x005e17e8;
              }
              if (uVar1 == 0x20) break;
              if ((uVar1 == 0x30) && (uVar9 == 0x3000)) goto code_r0x005e17e8;
            }
          } while (((byte)(&
                          __ZN4core7unicode12unicode_data11white_space14WHITESPACE_MAP17h271c64803ec2808fE
                          )[uVar10 & 0xff] >> 1 & 1) == 0);
code_r0x005e17e8:
          bVar8 = 0;
          pbVar13 = in_stack_000000e0 + -(long)pbVar18;
          uStack00000000000000b0 = pbVar15;
          in_stack_000000e0 = pbVar15;
        } while (pbVar13 == (byte *)0x0);
code_r0x005e1920:
        pbVar18 = pbVar18 + lVar3;
        bStack00000000000000e9 = bVar16;
LAB_005e1948:
        uStack0000000000000098 = 1;
        uStack0000000000000040 = 1;
        pbVar14 = in_stack_000000d0;
        pbVar15 = uStack00000000000000b0;
        pbVar17 = in_stack_000000e0;
        in_stack_000000a0 = pbVar18;
        in_stack_000000a8 = pbVar13;
        bVar16 = bStack00000000000000e9;
      }
      if (pbVar18 != (byte *)0x0) {
        if (*(long *)(unaff_x29 + -0x70) == param_2) {
          func_0x007afcf8(unaff_x29 + -0x70,param_2,1,1,1);
          param_1 = *(long *)(unaff_x29 + -0x68);
          param_2 = *(long *)(unaff_x29 + -0x60);
          pbVar13 = extraout_x9;
        }
        *(undefined1 *)(param_1 + param_2) = 0x20;
        param_2 = param_2 + 1;
        *(long *)(unaff_x29 + -0x60) = param_2;
      }
      if (uVar7 <= uVar12) goto code_r0x005e16d8;
      uVar12 = uVar12 + 1;
    } while( true );
  }
  goto code_r0x005e16e4;
code_r0x005e16d8:
  uStack0000000000000040 = uStack0000000000000098;
code_r0x005e16e4:
  unaff_x22 = in_stack_000000a8;
  unaff_x23 = in_stack_000000a0;
  goto LAB_005e16ec;
}

