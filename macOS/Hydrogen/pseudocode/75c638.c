
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0075c638(void)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  undefined8 unaff_x24;
  long lVar7;
  ulong unaff_x25;
  undefined8 uVar8;
  byte *pbVar9;
  ulong uVar10;
  long lVar11;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000058;
  
code_r0x0075c638:
  uVar8 = 0;
LAB_0075ca94:
  *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0;
code_r0x0075cb2c:
  if ((int)uVar8 == 0) {
code_r0x0075cb30:
    iVar1 = *(int *)(unaff_x21 + 0x4d8);
code_r0x0075cb34:
    if ((iVar1 != 0) && (uVar3 = func_0x0076e6e0(), (uVar3 & 1) != 0)) {
code_r0x0075c320:
      uVar8 = func_0x0076e374();
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      if (in_stack_00000030._4_4_ == -1) {
        return 8;
      }
      if (in_stack_00000030._4_4_ == 0) {
        return 0;
      }
      switch(*(undefined4 *)(unaff_x21 + 0x4d8)) {
      case 1:
        lVar2 = *(long *)(unaff_x19 + 0x18);
        if (in_stack_00000030._4_4_ != 1) {
          if (in_stack_00000030._4_4_ != 3) {
            func_0x0073c9e4();
            return 8;
          }
          *(byte *)(lVar2 + 0x4e3) = *(byte *)(lVar2 + 0x4e3) | 2;
          if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
        }
        *(undefined2 *)(lVar2 + 0x4a0) = 0;
        *(undefined2 *)(lVar2 + 0x4a4) = 0;
        *(byte *)(lVar2 + 0x4e3) = *(byte *)(lVar2 + 0x4e3) & 0xfb;
        uVar8 = func_0x0075d338();
        if ((int)uVar8 != 0) {
          return uVar8;
        }
        *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 2;
        unaff_x24 = in_stack_00000020;
        goto code_r0x0075cb30;
      case 2:
        lVar7 = *(long *)(unaff_x19 + 0x18);
        lVar2 = func_0x00740a58(lVar7 + 0x448);
        if (in_stack_00000030._4_4_ == 0x2a) {
          pbVar9 = (byte *)(lVar2 + 2);
          goto code_r0x0075c460;
        }
        if ((*(char *)(unaff_x19 + 0xa14) != '\0') &&
           (uVar3 = func_0x007315f4(lVar7,0), (uVar3 & 1) == 0)) {
          if ((in_stack_00000030._4_4_ == 1) && ((*(byte *)(lVar7 + 0x4e3) & 6) == 4)) {
            uVar8 = func_0x0075d338();
            if ((int)uVar8 != 0) {
              return uVar8;
            }
            *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 3;
            goto code_r0x0075cb30;
          }
          if (1 < *(byte *)(unaff_x19 + 0xa14)) goto code_r0x0075ce44;
        }
        uVar8 = func_0x0075d434();
        goto code_r0x0075cb28;
      case 3:
        if (*(long *)(*(long *)(unaff_x19 + 0x18) + 0x468) != 0) {
          return 8;
        }
        if (in_stack_00000030._4_4_ == 1) {
          *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 4;
        }
        else {
          if (*(char *)(unaff_x19 + 0xa14) != '\x01') {
code_r0x0075ce44:
            func_0x0073c9e4();
            return 0x40;
          }
          uVar8 = func_0x0075d434();
          if ((int)uVar8 != 0) {
            return uVar8;
          }
        }
        iVar1 = *(int *)(unaff_x21 + 0x4d8);
        if (iVar1 == 4) {
          uStack0000000000000038 = uStack0000000000000038 & 0xffffffffffffff00;
          uVar3 = func_0x007315f4();
          if ((uVar3 & 1) == 0) {
            uVar8 = func_0x00794ee8();
            if ((int)uVar8 != 0) {
              return uVar8;
            }
            *(undefined **)(unaff_x21 + 0x3a0) = &UNK_00a1eb70;
            *(ulong *)(unaff_x21 + 0x398) = *(ulong *)(unaff_x21 + 0x398) | 0x8000000;
          }
          uVar8 = func_0x007311c4();
          if ((int)uVar8 != 0) {
            return uVar8;
          }
          if ((char)uStack0000000000000038 != '\0') {
            *(undefined2 *)(unaff_x21 + 0x4a0) = 0;
            *(undefined2 *)(unaff_x21 + 0x4a4) = 0;
            *(byte *)(unaff_x21 + 0x4e3) = *(byte *)(unaff_x21 + 0x4e3) & 0xfb | 1;
            uVar8 = func_0x0075d338();
            if ((int)uVar8 != 0) {
              return uVar8;
            }
            *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 2;
          }
          if (*(int *)(unaff_x21 + 0x4d8) != 4) goto code_r0x0075c300;
          goto code_r0x0075cda8;
        }
        goto code_r0x0075cb34;
      case 5:
        uVar8 = func_0x0073bd40(in_stack_00000018);
        if ((int)uVar8 != 0) goto code_r0x0075cb2c;
        if ((int)uStack0000000000000038 != 0) {
          if ((int)uStack0000000000000038 == 2) goto code_r0x0075c638;
          uVar8 = 0;
          goto code_r0x0075cb2c;
        }
        if (((*(byte *)(unaff_x21 + 0x4e3) >> 3 & 1) != 0) ||
           ((*(byte *)(unaff_x21 + 0x4e1) & 1) == 0)) {
          func_0x0073c9e4();
          uVar8 = 0x43;
          goto code_r0x0075cb2c;
        }
        uVar6 = 0;
        if (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) != 0) {
          uVar4 = func_0x0075d62c(*(undefined8 *)(unaff_x21 + 0x1e0),0);
          uVar5 = func_0x0075d62c(*(undefined8 *)(unaff_x21 + 0x1e8),0);
          uVar8 = func_0x0075d338();
          (*pcRam0000000000a2b5f0)(uVar4);
          (*pcRam0000000000a2b5f0)(uVar5);
          if ((int)uVar8 != 0) goto code_r0x0075cb2c;
          uVar6 = 6;
        }
        uVar8 = 0;
        *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = uVar6;
        goto code_r0x0075cb2c;
      case 6:
        if (in_stack_00000030._4_4_ != 1) {
code_r0x0075ce2c:
          func_0x0073c9e4();
          return 0x43;
        }
        break;
      case 7:
      case 0xd:
        func_0x00740a58(*(long *)(unaff_x19 + 0x18) + 0x448);
        if (in_stack_00000030._4_4_ == 1) break;
        if (in_stack_00000030._4_4_ != 0x2a) {
          return 0x15;
        }
        uVar8 = func_0x007738a0();
code_r0x0075cb28:
        goto code_r0x0075cb2c;
      case 8:
        lVar11 = *(long *)(unaff_x19 + 0x18);
        lVar7 = *(long *)(unaff_x19 + 0x1b0);
        lVar2 = func_0x00740a58(lVar11 + 0x448);
        if (in_stack_00000030._4_4_ == 1) {
          if (((*(long *)(lVar7 + 0x10) != 0) && (*(long *)(lVar11 + 0x4d0) != 0)) &&
             (iVar1 = func_0x0077e6f8(), iVar1 == 0)) {
            func_0x0073c9e4();
            return 0x4e;
          }
          lVar2 = (*pcRam0000000000a2b600)(*(undefined8 *)(lVar7 + 8));
          *(long *)(lVar11 + 0x4c8) = lVar2;
          if (lVar2 != 0) {
            if (*(long *)(lVar7 + 0x40) == 0) {
              if (*(long *)(lVar7 + 0x38) == 0) {
                uVar8 = func_0x0075d770();
                unaff_x24 = in_stack_00000020;
                goto code_r0x0075cb2c;
              }
              if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x38) == 0) {
                func_0x0073c9e4();
                return 3;
              }
              uVar8 = func_0x0075d338();
              if ((int)uVar8 != 0) {
                return uVar8;
              }
              *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0xd;
              unaff_x24 = in_stack_00000020;
            }
            else {
              if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x40) == 0) {
                lVar2 = *(long *)(*(long *)(unaff_x19 + 0x1b0) + 8);
                if (lVar2 == 0) {
                  lVar2 = (*pcRam0000000000a2b600)("");
                }
                else {
                  lVar2 = func_0x0075d62c(lVar2,1);
                }
                if (lVar2 == 0) {
                  return 0x1b;
                }
                uVar8 = func_0x0075d338();
                (*pcRam0000000000a2b5f0)(lVar2);
                iVar1 = (int)uVar8;
              }
              else {
                uVar8 = func_0x0075d338();
                iVar1 = (int)uVar8;
              }
              if (iVar1 != 0) {
                return uVar8;
              }
              *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 7;
              unaff_x24 = in_stack_00000020;
            }
            goto code_r0x0075cb30;
          }
        }
        else {
          if (in_stack_00000030._4_4_ != 0x2a) goto code_r0x0075ce2c;
          iVar1 = func_0x0077e76c(lVar2 + 2,"OK [UIDVALIDITY ",0x10);
          unaff_x24 = in_stack_00000020;
          if ((iVar1 == 0) || (pbVar9 = (byte *)(lVar2 + 0x12), *pbVar9 - 0x3a < 0xfffffff6))
          goto code_r0x0075cb30;
          if (*(byte *)(lVar2 + 0x13) - 0x30 < 10) {
            if (*(byte *)(lVar2 + 0x14) - 0x30 < 10) {
              if (*(byte *)(lVar2 + 0x15) - 0x30 < 10) {
                if (*(byte *)(lVar2 + 0x16) - 0x30 < 10) {
                  if (*(byte *)(lVar2 + 0x17) - 0x30 < 10) {
                    if (*(byte *)(lVar2 + 0x18) - 0x30 < 10) {
                      if (*(byte *)(lVar2 + 0x19) - 0x30 < 10) {
                        if (*(byte *)(lVar2 + 0x1a) - 0x30 < 10) {
                          if (*(byte *)(lVar2 + 0x1b) - 0x30 < 10) {
                            if (*(byte *)(lVar2 + 0x1c) - 0x30 < 10) {
                              if (*(byte *)(lVar2 + 0x1d) - 0x30 < 10) {
                                if (*(byte *)(lVar2 + 0x1e) - 0x30 < 10) {
                                  if (*(byte *)(lVar2 + 0x1f) - 0x30 < 10) {
                                    if (*(byte *)(lVar2 + 0x20) - 0x30 < 10) {
                                      if (*(byte *)(lVar2 + 0x21) - 0x30 < 10) {
                                        if (*(byte *)(lVar2 + 0x22) - 0x30 < 10) {
                                          if (*(byte *)(lVar2 + 0x23) - 0x30 < 10) {
                                            if (*(byte *)(lVar2 + 0x24) - 0x30 < 10) {
                                              if (*(byte *)(lVar2 + 0x25) - 0x30 < 10) {
                                                lVar2 = 0x14;
                                              }
                                              else {
                                                lVar2 = 0x13;
                                              }
                                            }
                                            else {
                                              lVar2 = 0x12;
                                            }
                                          }
                                          else {
                                            lVar2 = 0x11;
                                          }
                                        }
                                        else {
                                          lVar2 = 0x10;
                                        }
                                      }
                                      else {
                                        lVar2 = 0xf;
                                      }
                                    }
                                    else {
                                      lVar2 = 0xe;
                                    }
                                  }
                                  else {
                                    lVar2 = 0xd;
                                  }
                                }
                                else {
                                  lVar2 = 0xc;
                                }
                              }
                              else {
                                lVar2 = 0xb;
                              }
                            }
                            else {
                              lVar2 = 10;
                            }
                          }
                          else {
                            lVar2 = 9;
                          }
                        }
                        else {
                          lVar2 = 8;
                        }
                      }
                      else {
                        lVar2 = 7;
                      }
                    }
                    else {
                      lVar2 = 6;
                    }
                  }
                  else {
                    lVar2 = 5;
                  }
                }
                else {
                  lVar2 = 4;
                }
              }
              else {
                lVar2 = 3;
              }
            }
            else {
              lVar2 = 2;
            }
          }
          else {
            lVar2 = 1;
          }
          if (pbVar9[lVar2] != 0x5d) goto code_r0x0075cb30;
          func_0x0074066c(&uStack0000000000000038,0x14);
          iVar1 = func_0x0074075c(&uStack0000000000000038,pbVar9,lVar2);
          if (iVar1 == 0) {
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar11 + 0x4d0));
            *(undefined8 *)(lVar11 + 0x4d0) = 0;
            uVar8 = func_0x00740a58(&uStack0000000000000038);
            *(undefined8 *)(lVar11 + 0x4d0) = uVar8;
            goto code_r0x0075cb30;
          }
        }
        return 0x1b;
      case 9:
        uVar8 = func_0x00740a58(*(long *)(unaff_x19 + 0x18) + 0x448);
        uStack0000000000000038 = 0;
        if (in_stack_00000030._4_4_ != 0x2a) {
          func_0x00770554();
          uVar8 = 0x4e;
          goto LAB_0075ca94;
        }
        lVar2 = _memchr(uVar8,0x7b);
        if ((((lVar2 == 0) ||
             (iVar1 = func_0x0077ed9c(lVar2 + 1,&uStack0000000000000058,10,&uStack0000000000000038),
             iVar1 != 0)) || ((long)uStack0000000000000058 - lVar2 < 2)) ||
           (*uStack0000000000000058 != '}')) {
          func_0x0073c9e4();
          uVar8 = 8;
          goto LAB_0075ca94;
        }
        if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00770554();
        uVar3 = *(ulong *)(unaff_x21 + 0x468);
        if (uVar3 != 0) {
          func_0x007406c8(unaff_x24,uVar3);
          *(undefined8 *)(unaff_x21 + 0x470) = 0;
          if (uStack0000000000000038 <= uVar3) {
            uVar3 = uStack0000000000000038;
          }
          if (uVar3 == 0) goto code_r0x0075c638;
          func_0x00740a58(unaff_x24);
          uVar8 = func_0x007738a0();
          if ((int)uVar8 != 0) goto code_r0x0075cb2c;
          if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          lVar2 = *(ulong *)(unaff_x21 + 0x468) - uVar3;
          if (*(ulong *)(unaff_x21 + 0x468) < uVar3 || lVar2 == 0) {
            *(undefined8 *)(unaff_x21 + 0x468) = 0;
            func_0x007406b0(unaff_x24);
          }
          else {
            *(long *)(unaff_x21 + 0x468) = lVar2;
            func_0x007406c8(unaff_x24);
          }
        }
        if (*(ulong *)(unaff_x19 + 0xf8) == uStack0000000000000038) {
          func_0x00783c98();
          uVar8 = 0;
        }
        else {
          *(ulong *)(unaff_x19 + 0xf0) = uStack0000000000000038;
          *(char *)(in_stack_00000010 + 0x929) = (char)unaff_x22;
          func_0x00783e98();
          uVar8 = 0;
        }
        goto LAB_0075ca94;
      case 10:
        if (in_stack_00000030._4_4_ != 1) {
          return 8;
        }
        break;
      case 0xb:
        if (in_stack_00000030._4_4_ != 0x2b) {
          return 0x19;
        }
        func_0x00770580();
        func_0x00783e98();
        break;
      case 0xc:
        if (in_stack_00000030._4_4_ != 1) {
          return 0x19;
        }
      }
      *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0;
      goto code_r0x0075cb30;
    }
code_r0x0075cda8:
    uVar8 = 0;
  }
  return uVar8;
code_r0x0075c300:
  if (*(long *)(unaff_x21 + 0x400) != 0) {
    uVar8 = func_0x0076e5ec();
    return uVar8;
  }
  unaff_x22 = 1;
  unaff_x25 = 0x100002601;
  unaff_x23 = 0x100002600;
  in_stack_00000020 = unaff_x24;
  goto code_r0x0075c320;
code_r0x0075c460:
  uVar3 = (ulong)*pbVar9;
  if (*pbVar9 < 0x21) {
    if ((unaff_x22 << (uVar3 & 0x3f) & unaff_x23) != 0) {
      pbVar9 = pbVar9 + 1;
      goto code_r0x0075c460;
    }
    if (uVar3 == 0) goto code_r0x0075cb30;
  }
  uVar10 = 0;
  while ((0x20 < (uint)uVar3 || ((unaff_x22 << (uVar3 & 0x3f) & unaff_x25) == 0))) {
    uVar3 = (ulong)pbVar9[uVar10 + 1];
    uVar10 = uVar10 + 1;
  }
  if (uVar10 != 7) {
    if (uVar10 == 0xd) {
      if (*(long *)pbVar9 == 0x5349444e49474f4c && *(long *)(pbVar9 + 5) == 0x44454c4241534944) {
        *(byte *)(lVar7 + 0x4e3) = *(byte *)(lVar7 + 0x4e3) | 8;
        pbVar9 = pbVar9 + 0xd;
        goto code_r0x0075c460;
      }
code_r0x0075c590:
      if (*(int *)pbVar9 == 0x48545541 && pbVar9[4] == 0x3d) {
        pbVar9 = pbVar9 + 5;
        iVar1 = func_0x0073ada4(pbVar9,uVar10 - 5,&uStack0000000000000038);
        if ((iVar1 != 0) && (uStack0000000000000038 + 5 == uVar10)) {
          *(ushort *)(lVar7 + 0x4a0) = *(ushort *)(lVar7 + 0x4a0) | (ushort)iVar1;
        }
        unaff_x24 = in_stack_00000020;
        uVar10 = uVar10 - 5;
      }
    }
    else {
      if (uVar10 == 8) {
        if (*(long *)pbVar9 != 0x534c545452415453) goto code_r0x0075c590;
        *(byte *)(lVar7 + 0x4e3) = *(byte *)(lVar7 + 0x4e3) | 4;
        pbVar9 = pbVar9 + 8;
        goto code_r0x0075c460;
      }
      if (5 < uVar10) goto code_r0x0075c590;
    }
    pbVar9 = pbVar9 + uVar10;
    goto code_r0x0075c460;
  }
  if (*(int *)pbVar9 != 0x4c534153 || *(int *)(pbVar9 + 3) != 0x52492d4c) goto code_r0x0075c590;
  *(byte *)(lVar7 + 0x4e3) = *(byte *)(lVar7 + 0x4e3) | 0x10;
  pbVar9 = pbVar9 + 7;
  goto code_r0x0075c460;
}

