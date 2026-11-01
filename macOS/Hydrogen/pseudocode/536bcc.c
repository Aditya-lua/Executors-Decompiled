
void FUN_00536bcc(uint param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  int iVar1;
  ushort uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  char cVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  bool bVar12;
  bool bVar13;
  ushort *puVar14;
  uint uVar15;
  long lVar16;
  ulong uVar17;
  uint in_w8;
  uint uVar18;
  uint in_w9;
  uint in_w13;
  uint in_w14;
  uint in_w15;
  uint in_w17;
  uint uVar19;
  uint uVar20;
  uint unaff_w22;
  uint uVar21;
  uint unaff_w24;
  uint uVar22;
  uint uVar23;
  uint unaff_w28;
  long unaff_x29;
  uint unaff_w30;
  undefined1 auVar24 [16];
  undefined8 in_stack_00000000;
  uint uStack0000000000000008;
  uint uStack000000000000000c;
  uint uStack0000000000000010;
  uint uStack0000000000000014;
  uint uStack0000000000000018;
  uint uStack000000000000001c;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  uint uStack0000000000000038;
  uint uStack000000000000003c;
  uint in_stack_00000040;
  uint uStack0000000000000044;
  uint uStack0000000000000048;
  uint uStack000000000000004c;
  undefined4 uStack0000000000000050;
  uint uStack0000000000000054;
  uint uStack0000000000000058;
  uint uStack000000000000005c;
  uint uStack0000000000000060;
  uint uStack0000000000000064;
  char in_stack_00000068;
  
  uStack0000000000000058 = in_w15;
  uStack000000000000005c = in_w17;
  uStack0000000000000048 = param_4;
code_r0x00536bcc:
  uVar15 = in_w9 | in_w13;
  uStack0000000000000048 =
       uStack000000000000005c << 0x10 | uStack0000000000000048 << 0x18 | uStack0000000000000058 << 8
       | in_w14;
  uVar18 = param_1 | unaff_w22 << 0x10 | unaff_w28 << 8 | 2;
code_r0x00536bec:
  _uStack0000000000000050 = CONCAT44(uStack0000000000000048 & 0xff,3);
  uStack0000000000000044 = 1;
  *(undefined4 *)(unaff_x29 + -100) = 1;
  uVar22 = in_w8;
code_r0x00536c40:
  uStack000000000000005c = uStack0000000000000048 >> 0x10 & 0xff;
  uStack0000000000000058 = uStack0000000000000048 >> 8 & 0xff;
  uStack0000000000000064 = uVar15 & 0xff;
  uStack0000000000000060 = uVar15 >> 8 & 0xff;
  uStack000000000000004c = uVar15 >> 0x10 & 0xff;
  uStack0000000000000048 = uStack0000000000000048 >> 0x18;
  uVar3 = uVar18 & 0xff;
  param_1 = uStack0000000000000048;
  uVar4 = uStack000000000000004c;
  uVar5 = uStack0000000000000060;
  uVar6 = uStack0000000000000058;
  uVar7 = uStack000000000000005c;
  uVar9 = uVar18 >> 8 & 0xff;
  uVar15 = uVar15 >> 0x18;
  uVar10 = uVar18 >> 0x18;
  uVar11 = uVar18 >> 0x10 & 0xff;
LAB_00536734:
  do {
    uVar21 = uVar11;
    uVar19 = uVar10;
    uVar23 = uVar15;
    uVar20 = uVar9;
    uStack000000000000005c = uVar7;
    uStack0000000000000058 = uVar6;
    uStack0000000000000060 = uVar5;
    uStack000000000000004c = uVar4;
    uStack0000000000000048 = param_1;
    uVar18 = uVar3;
    auVar24 = func_0x00537190(unaff_x29 + -0x60);
    in_w13 = uStack0000000000000064;
    uVar17 = _uStack0000000000000050 & 0xffffffff;
    in_w14 = uStack0000000000000054;
    if (auVar24._0_8_ == (ushort *)0x0) {
      if (uStack0000000000000064 == 3) {
        if (in_stack_00000040 == 3) goto code_r0x00536fb0;
      }
      else if (uStack0000000000000064 == in_stack_00000040) {
        if ((in_stack_00000040 < 2) || (uStack0000000000000060 != uStack000000000000003c)) {
          if ((in_stack_00000040 < 2) && (uStack0000000000000060 == uStack000000000000003c))
          goto code_r0x00536fb0;
        }
        else if ((uStack000000000000004c == unaff_w24) && (uVar23 == unaff_w30)) {
code_r0x00536fb0:
          if (uStack0000000000000054 == 3) {
            if (in_stack_00000028._4_4_ == 3) goto code_r0x00536fc0;
          }
          else if ((in_stack_00000028._4_4_ != 3) &&
                  (uStack0000000000000054 == in_stack_00000028._4_4_)) {
            if ((in_stack_00000028._4_4_ < 2) || (uStack0000000000000058 != uStack0000000000000018))
            {
              if ((in_stack_00000028._4_4_ < 2) &&
                 (uStack0000000000000058 == uStack0000000000000018)) goto code_r0x00536fc0;
            }
            else if ((uStack000000000000005c == uStack0000000000000010) &&
                    (uStack0000000000000048 == uStack0000000000000038)) {
code_r0x00536fc0:
              if (uVar18 == 3) {
                if (uStack000000000000001c == 3) goto code_r0x00536fd4;
              }
              else if ((uStack000000000000001c != 3) && (uVar18 == uStack000000000000001c)) {
                if ((uStack000000000000001c < 2) || (uVar20 != uStack000000000000000c)) {
                  if ((uStack000000000000001c < 2) && (uVar20 == uStack000000000000000c))
                  goto code_r0x00536fd4;
                }
                else if ((uVar21 == uStack0000000000000008) && (uVar19 == in_stack_00000000._4_4_))
                {
code_r0x00536fd4:
                  if (uStack0000000000000014 == (uVar22 & 0xffff)) goto code_r0x005370f4;
                }
              }
            }
          }
        }
      }
      if (*(long *)(in_stack_00000030 + 0x10) != 0) {
        *(undefined8 *)(in_stack_00000030 + 0x26) = *in_stack_00000020;
        *(undefined8 *)(in_stack_00000030 + 0x2c) = *(undefined8 *)((long)in_stack_00000020 + 6);
      }
code_r0x005370f4:
      *(uint *)(in_stack_00000030 + 0x18) =
           uStack000000000000004c << 0x10 | uVar23 << 0x18 | uStack0000000000000060 << 8 |
           uStack0000000000000064;
      *(uint *)(in_stack_00000030 + 0x1c) =
           uStack000000000000005c << 0x10 | uStack0000000000000048 << 0x18 |
           uStack0000000000000058 << 8 | uStack0000000000000054;
      *(uint *)(in_stack_00000030 + 0x20) = uVar21 << 0x10 | uVar19 << 0x18 | uVar20 << 8 | uVar18;
      *(short *)(in_stack_00000030 + 0x24) = (short)uVar22;
      return;
    }
    if (auVar24._8_8_ == 0) {
      uVar3 = uVar18;
      param_1 = uStack0000000000000048;
      uVar4 = uStack000000000000004c;
      uVar5 = uStack0000000000000060;
      uStack0000000000000064 = in_w13;
      uVar6 = uStack0000000000000058;
      uVar7 = uStack000000000000005c;
      uVar9 = uVar20;
      uVar15 = uVar23;
      uVar10 = uVar19;
      uVar11 = uVar21;
    }
    else {
      lVar16 = auVar24._8_8_ << 1;
      puVar14 = auVar24._0_8_;
      in_w8 = uVar22;
      do {
        uVar2 = *puVar14;
        uVar22 = (uint)uVar2;
        uVar15 = (uint)uVar17 & 0xff;
        param_1 = (uint)uVar2;
        cVar8 = in_stack_00000068;
        if (uVar15 == 1 || (uVar17 & 0xff) == 0) {
          if ((uVar17 & 0xff) == 0) {
            uVar17 = 1;
            uStack0000000000000064 = 3;
            _uStack0000000000000050 = 0x300000000;
            uVar3 = 3;
            uVar4 = param_1;
            uVar5 = param_1;
            uVar6 = param_1;
            uVar7 = param_1;
            cVar8 = '\0';
            uVar9 = uVar22;
            uVar15 = uVar22;
            uVar10 = uVar22;
            uVar11 = uVar22;
            switch(uVar22) {
            case 0:
              goto LAB_00536734;
            case 1:
              uVar22 = in_w8 | 1;
              break;
            case 2:
              uVar22 = in_w8 | 2;
              break;
            case 3:
              uVar22 = in_w8 | 4;
              break;
            case 4:
              in_w8 = in_w8 | 8;
              uVar17 = 4;
              cVar8 = in_stack_00000068;
              goto code_r0x005367ac;
            default:
              if (7 < (param_1 - 0x1e & 0xffff)) {
                if ((param_1 & 0xfff8) == 0x28) {
                  if (param_1 == 0x2b || uVar2 < 0x2b) {
                    if (param_1 == 0x29 || uVar2 < 0x29) {
                      if (param_1 == 0x28) {
                        _uStack0000000000000050 = 0;
                        uStack0000000000000058 = 0;
                        goto code_r0x00536e74;
                      }
                      uStack0000000000000058 = 1;
                    }
                    else if (param_1 == 0x2a) {
                      uStack0000000000000058 = 2;
                    }
                    else {
                      uStack0000000000000058 = 3;
                    }
                  }
                  else if (param_1 == 0x2d || uVar2 < 0x2d) {
                    if (param_1 == 0x2c) {
                      uStack0000000000000058 = 4;
                    }
                    else {
                      uStack0000000000000058 = 5;
                    }
                  }
                  else if (param_1 == 0x2e) {
                    uStack0000000000000058 = 6;
                  }
                  else {
                    uStack0000000000000058 = 7;
                  }
                }
                else {
                  if ((param_1 - 0x5a & 0xffff) < 8) {
                    if (param_1 == 0x5d || uVar2 < 0x5d) {
                      if (param_1 == 0x5b || uVar2 < 0x5b) {
                        if (param_1 == 0x5a) {
                          uStack000000000000004c = 0;
                          uStack0000000000000050 = 0;
                          uVar23 = 0;
                          uStack0000000000000060 = 8;
                          uStack0000000000000064 = 0;
                        }
                        else {
                          uStack000000000000004c = 0;
                          uStack0000000000000050 = 0;
                          uVar23 = 0;
                          uStack0000000000000060 = 9;
                          uStack0000000000000064 = 0;
                        }
                      }
                      else if (param_1 == 0x5c) {
                        uStack000000000000004c = 0;
                        uStack0000000000000050 = 0;
                        uVar23 = 0;
                        uStack0000000000000060 = 10;
                        uStack0000000000000064 = 0;
                      }
                      else {
                        uStack000000000000004c = 0;
                        uStack0000000000000050 = 0;
                        uVar23 = 0;
                        uStack0000000000000060 = 0xb;
                        uStack0000000000000064 = 0;
                      }
                    }
                    else if (param_1 == 0x5f || uVar2 < 0x5f) {
                      if (param_1 == 0x5e) {
                        uStack000000000000004c = 0;
                        uStack0000000000000050 = 0;
                        uVar23 = 0;
                        uStack0000000000000060 = 0xc;
                        uStack0000000000000064 = 0;
                      }
                      else {
                        uStack000000000000004c = 0;
                        uStack0000000000000050 = 0;
                        uVar23 = 0;
                        uStack0000000000000060 = 0xd;
                        uStack0000000000000064 = 0;
                      }
                    }
                    else if (param_1 == 0x60) {
                      uStack000000000000004c = 0;
                      uStack0000000000000050 = 0;
                      uVar23 = 0;
                      uStack0000000000000060 = 0xe;
                      uStack0000000000000064 = 0;
                    }
                    else {
                      uStack000000000000004c = 0;
                      uStack0000000000000050 = 0;
                      uVar23 = 0;
                      uStack0000000000000060 = 0xf;
                      uStack0000000000000064 = 0;
                    }
                    goto code_r0x00536940;
                  }
                  if (7 < (param_1 - 100 & 0xffff)) {
                    uStack0000000000000050 = 0;
                    goto code_r0x0053693c;
                  }
                  if (param_1 == 0x67 || uVar2 < 0x67) {
                    if (param_1 == 0x65 || uVar2 < 0x65) {
                      if (param_1 == 100) {
                        uStack0000000000000058 = 8;
                      }
                      else {
                        uStack0000000000000058 = 9;
                      }
                    }
                    else if (param_1 == 0x66) {
                      uStack0000000000000058 = 10;
                    }
                    else {
                      uStack0000000000000058 = 0xb;
                    }
                  }
                  else if (param_1 == 0x69 || uVar2 < 0x69) {
                    if (param_1 == 0x68) {
                      uStack0000000000000058 = 0xc;
                    }
                    else {
                      uStack0000000000000058 = 0xd;
                    }
                  }
                  else if (param_1 == 0x6a) {
                    uStack0000000000000058 = 0xe;
                  }
                  else {
                    uStack0000000000000058 = 0xf;
                  }
                }
                _uStack0000000000000050 = 0;
                goto code_r0x00536e74;
              }
              if (param_1 == 0x21 || uVar2 < 0x21) {
                uStack0000000000000060 = 2;
                if (param_1 != 0x20) {
                  uStack0000000000000060 = 3;
                }
                uVar15 = (uint)(param_1 != 0x1e);
                bVar12 = SBORROW4(param_1,0x1f);
                iVar1 = param_1 - 0x1f;
                bVar13 = param_1 == 0x1f;
              }
              else {
                uStack0000000000000060 = 6;
                if (param_1 != 0x24) {
                  uStack0000000000000060 = 7;
                }
                uVar15 = 4;
                if (param_1 != 0x22) {
                  uVar15 = 5;
                }
                bVar12 = SBORROW4(param_1,0x23);
                iVar1 = param_1 - 0x23;
                bVar13 = param_1 == 0x23;
              }
              uVar23 = 0;
              uStack000000000000004c = 0;
              uStack0000000000000050 = 0;
              if (bVar13 || iVar1 < 0 != bVar12) {
                uStack0000000000000060 = uVar15;
              }
              in_w13 = 0;
              goto code_r0x0053693c;
            case 7:
              uVar22 = in_w8 | 0x200;
              break;
            case 8:
              uVar22 = in_w8 | 0x400;
              break;
            case 9:
              uVar22 = in_w8 | 0x800;
              break;
            case 0x15:
              uVar22 = in_w8 | 0x10;
              break;
            case 0x26:
              goto code_r0x005367ac;
            case 0x27:
              uStack000000000000004c = 0;
              uStack0000000000000050 = 0;
              uVar23 = 0;
              uStack0000000000000060 = 0;
              in_w13 = 3;
              goto code_r0x0053693c;
            case 0x30:
              cVar8 = '\x01';
              goto code_r0x005367ac;
            case 0x31:
              uStack0000000000000058 = 0;
              _uStack0000000000000050 = 0x300000000;
code_r0x00536e74:
              uStack000000000000005c = 0;
              uStack0000000000000048 = 0;
              uStack0000000000000064 = in_w13;
              uVar22 = in_w8;
              goto code_r0x0053694c;
            case 0x3a:
              cVar8 = '\x02';
              goto code_r0x005367ac;
            }
            _uStack0000000000000050 = (ulong)in_w14 << 0x20;
            uVar3 = uVar18;
            param_1 = uStack0000000000000048;
            uVar4 = uStack000000000000004c;
            uVar5 = uStack0000000000000060;
            uStack0000000000000064 = in_w13;
            uVar6 = uStack0000000000000058;
            uVar7 = uStack000000000000005c;
            uVar9 = uVar20;
            uVar15 = uVar23;
            uVar10 = uVar19;
            uVar11 = uVar21;
            goto LAB_00536734;
          }
          if (param_1 != 2) {
            if (param_1 == 5) {
              uVar17 = 2;
              goto code_r0x005367ac;
            }
            uStack0000000000000050 = 1;
            break;
          }
          unaff_w22 = 0;
          uStack0000000000000044 = 0;
          unaff_w28 = 0;
          *(undefined4 *)(unaff_x29 + -100) = 0;
          uVar17 = 3;
        }
        else {
          if (uVar15 != 3) {
            if (uVar15 != 4) {
              if (in_stack_00000068 == '\0') {
                uStack0000000000000048 =
                     uStack000000000000005c << 0x10 | uStack0000000000000048 << 0x18 |
                     uStack0000000000000058 << 8 | in_w14;
                uVar18 = uVar21 << 0x10 | uVar19 << 0x18 | uVar20 << 8 | uVar18;
                uVar15 = (param_1 & 0xff) << 8 | 1;
              }
              else if (in_stack_00000068 == '\x01') {
                uVar15 = uStack000000000000004c << 0x10 | uVar23 << 0x18 |
                         uStack0000000000000060 << 8 | in_w13;
                uVar18 = uVar21 << 0x10 | uVar19 << 0x18 | uVar20 << 8 | uVar18;
                uStack0000000000000048 = param_1 << 8 & 0xffff | 1;
              }
              else {
                uVar15 = uStack000000000000004c << 0x10 | uVar23 << 0x18 |
                         uStack0000000000000060 << 8 | in_w13;
                uStack0000000000000048 =
                     uStack000000000000005c << 0x10 | uStack0000000000000048 << 0x18 |
                     uStack0000000000000058 << 8 | in_w14;
                uVar18 = param_1 << 8 & 0xffff | 1;
              }
              _uStack0000000000000050 = CONCAT44(uStack0000000000000048 & 0xff,2);
              uVar22 = in_w8;
              goto code_r0x00536c40;
            }
            if (uVar2 < 3) {
              if (param_1 == 0) {
                in_w8 = in_w8 & 0xfffffff7;
              }
              else {
                uVar17 = 4;
                if (param_1 == 1) goto code_r0x005367ac;
                if (param_1 != 2) goto code_r0x00536b7c;
                in_w8 = in_w8 & 0xffffffe7 | 0x10;
              }
            }
            else if (uVar2 == 3) {
              in_w8 = in_w8 & 0xfffffff7 | 0x20;
            }
            else if (uVar2 == 4) {
              in_w8 = in_w8 & 0xfffffff7 | 0x40;
            }
            else {
              if (uVar2 != 5) {
code_r0x00536b7c:
                uStack0000000000000050 = 4;
                break;
              }
              in_w8 = in_w8 & 0xfffffff7 | 0x80;
            }
            uVar17 = 4;
            goto code_r0x005367ac;
          }
          if ((*(uint *)(unaff_x29 + -100) & 1) == 0) {
            unaff_w28 = param_1 & 0xff;
            uVar17 = 3;
            *(undefined4 *)(unaff_x29 + -100) = 1;
          }
          else {
            if ((uStack0000000000000044 & 1) != 0) {
              if (in_stack_00000068 == '\0') {
                uStack0000000000000048 =
                     uStack000000000000005c << 0x10 | uStack0000000000000048 << 0x18 |
                     uStack0000000000000058 << 8 | in_w14;
                uVar18 = uVar21 << 0x10 | uVar19 << 0x18 | uVar20 << 8 | uVar18;
                uVar15 = param_1 << 0x18 | unaff_w22 << 0x10 | unaff_w28 << 8 | 2;
                goto code_r0x00536bec;
              }
              param_1 = param_1 << 0x18;
              if (in_stack_00000068 == '\x01') {
                uVar15 = uStack000000000000004c << 0x10 | uVar23 << 0x18 |
                         uStack0000000000000060 << 8 | in_w13;
                uVar18 = uVar21 << 0x10 | uVar19 << 0x18 | uVar20 << 8 | uVar18;
                uStack0000000000000048 = param_1 | unaff_w22 << 0x10 | unaff_w28 << 8 | 2;
                goto code_r0x00536bec;
              }
              in_w9 = uStack000000000000004c << 0x10 | uVar23 << 0x18 | uStack0000000000000060 << 8;
              goto code_r0x00536bcc;
            }
            unaff_w22 = param_1 & 0xff;
            uVar17 = 3;
            uStack0000000000000044 = 1;
            *(undefined4 *)(unaff_x29 + -100) = 1;
          }
        }
code_r0x005367ac:
        in_stack_00000068 = cVar8;
        uStack0000000000000050 = (undefined4)uVar17;
        lVar16 = lVar16 + -2;
        puVar14 = puVar14 + 1;
      } while (lVar16 != 0);
code_r0x0053693c:
      uStack0000000000000064 = in_w13;
code_r0x00536940:
      _uStack0000000000000050 = CONCAT44(in_w14,uStack0000000000000050);
      uVar22 = in_w8;
code_r0x0053694c:
      uVar3 = uVar18;
      param_1 = uStack0000000000000048;
      uVar4 = uStack000000000000004c;
      uVar5 = uStack0000000000000060;
      uVar6 = uStack0000000000000058;
      uVar7 = uStack000000000000005c;
      uVar9 = uVar20;
      uVar15 = uVar23;
      uVar10 = uVar19;
      uVar11 = uVar21;
    }
  } while( true );
}

