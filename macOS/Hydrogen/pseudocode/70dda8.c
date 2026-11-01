
undefined8 FUN_0070dda8(long *param_1)

{
  long *plVar1;
  byte bVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  char cVar6;
  ulong uVar7;
  ulong in_x10;
  uint uVar8;
  int iVar9;
  long *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  int unaff_w22;
  long unaff_x23;
  ulong uVar10;
  
  cVar6 = '\v';
  do {
    *(char *)((long)param_1 + unaff_x20) = cVar6;
    uVar7 = in_x10;
    unaff_x20 = unaff_x20 + 1;
LAB_0070d6e8:
    if (unaff_x21 <= uVar7) {
code_r0x0070ddb8:
      if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
        if (unaff_x20 <= (ulong)unaff_x19[1]) {
          unaff_x19[1] = unaff_x20;
          unaff_x19 = (long *)*unaff_x19;
          goto code_r0x0070de18;
        }
      }
      else if (unaff_x20 <= *(byte *)((long)unaff_x19 + 0x17)) {
        *(byte *)((long)unaff_x19 + 0x17) = (byte)unaff_x20 & 0x7f;
code_r0x0070de18:
        *(undefined1 *)((long)unaff_x19 + unaff_x20) = 0;
        return 1;
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
      return 1;
    }
    param_1 = (long *)*unaff_x19;
    if (-1 < *(char *)((long)unaff_x19 + 0x17)) {
      param_1 = unaff_x19;
    }
    if (*(char *)((long)param_1 + uVar7) != '\\') {
      *(char *)((long)param_1 + unaff_x20) = *(char *)((long)param_1 + uVar7);
      unaff_x20 = unaff_x20 + 1;
      uVar7 = uVar7 + 1;
      goto LAB_0070d6e8;
    }
    if (uVar7 + 1 == unaff_x21) {
      return 0;
    }
    cVar6 = *(char *)((long)param_1 + uVar7 + 1);
    in_x10 = uVar7 + 2;
    iVar9 = (int)cVar6;
    if (cVar6 < 'u') {
      if (iVar9 == 10) {
        *(char *)((long)param_1 + unaff_x20) = (char)unaff_w22;
        unaff_x20 = unaff_x20 + 1;
        uVar7 = in_x10;
        goto LAB_0070d6e8;
      }
      if (iVar9 == 0xd) {
        *(char *)((long)param_1 + unaff_x20) = (char)unaff_w22;
        if (in_x10 < unaff_x21) {
          plVar1 = (long *)*unaff_x19;
          if (-1 < *(char *)((long)unaff_x19 + 0x17)) {
            plVar1 = unaff_x19;
          }
          uVar7 = uVar7 + 3;
          if (*(char *)((long)plVar1 + in_x10) != '\n') {
            uVar7 = in_x10;
          }
          unaff_x20 = unaff_x20 + 1;
        }
        else {
          uVar7 = in_x10;
          unaff_x20 = unaff_x20 + 1;
        }
        goto LAB_0070d6e8;
      }
      if (cVar6 == '\0') {
        return 0;
      }
    }
    else {
      if (cVar6 == 'u') {
        if (unaff_x21 < uVar7 + 5) {
          return 0;
        }
        if (*(char *)((long)param_1 + in_x10) != '{') {
          return 0;
        }
        uVar10 = uVar7 + 3;
        if (*(char *)((long)param_1 + uVar10) == '}') {
          return 0;
        }
        if (uVar10 == unaff_x21) {
          return 0;
        }
        cVar6 = *(char *)((long)param_1 + uVar10);
        if (cVar6 == 0x7d) {
          uVar8 = 0;
        }
        else {
          uVar8 = (int)cVar6 - 0x30;
          uVar3 = ((int)cVar6 | 0x20U) - 0x61;
          if ((uVar8 >= 10 && 4 < uVar3) && (uVar8 < 10 || uVar3 != 5)) {
            return 0;
          }
          if (9 < uVar8) {
            uVar8 = ((int)cVar6 | 0x20U) - 0x57;
          }
          uVar10 = uVar7 + 4;
          if (uVar10 == unaff_x21) {
            return 0;
          }
          cVar6 = *(char *)((long)param_1 + uVar10);
          if (cVar6 != 0x7d) {
            uVar3 = (int)cVar6 - 0x30;
            if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
              return 0;
            }
            if (9 < uVar3) {
              uVar3 = ((int)cVar6 | 0x20U) - 0x57;
            }
            uVar10 = uVar7 + 5;
            if (uVar10 == unaff_x21) {
              return 0;
            }
            uVar8 = uVar3 + uVar8 * 0x10;
            cVar6 = *(char *)((long)param_1 + uVar10);
            if (cVar6 != 0x7d) {
              uVar3 = (int)cVar6 - 0x30;
              if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                return 0;
              }
              if (9 < uVar3) {
                uVar3 = ((int)cVar6 | 0x20U) - 0x57;
              }
              uVar10 = uVar7 + 6;
              if (uVar10 == unaff_x21) {
                return 0;
              }
              uVar8 = uVar3 + uVar8 * 0x10;
              cVar6 = *(char *)((long)param_1 + uVar10);
              if (cVar6 != 0x7d) {
                uVar3 = (int)cVar6 - 0x30;
                if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                  return 0;
                }
                if (9 < uVar3) {
                  uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                }
                uVar10 = uVar7 + 7;
                if (uVar10 == unaff_x21) {
                  return 0;
                }
                uVar8 = uVar3 + uVar8 * 0x10;
                cVar6 = *(char *)((long)param_1 + uVar10);
                if (cVar6 != 0x7d) {
                  uVar3 = (int)cVar6 - 0x30;
                  if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                    return 0;
                  }
                  if (9 < uVar3) {
                    uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                  }
                  uVar10 = uVar7 + 8;
                  if (uVar10 == unaff_x21) {
                    return 0;
                  }
                  uVar8 = uVar3 + uVar8 * 0x10;
                  cVar6 = *(char *)((long)param_1 + uVar10);
                  if (cVar6 != 0x7d) {
                    uVar3 = (int)cVar6 - 0x30;
                    if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                      return 0;
                    }
                    if (9 < uVar3) {
                      uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                    }
                    uVar10 = uVar7 + 9;
                    if (uVar10 == unaff_x21) {
                      return 0;
                    }
                    uVar8 = uVar3 + uVar8 * 0x10;
                    cVar6 = *(char *)((long)param_1 + uVar10);
                    if (cVar6 != 0x7d) {
                      uVar3 = (int)cVar6 - 0x30;
                      if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                        return 0;
                      }
                      if (9 < uVar3) {
                        uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                      }
                      uVar10 = uVar7 + 10;
                      if (uVar10 == unaff_x21) {
                        return 0;
                      }
                      uVar8 = uVar3 + uVar8 * 0x10;
                      cVar6 = *(char *)((long)param_1 + uVar10);
                      if (cVar6 != 0x7d) {
                        uVar3 = (int)cVar6 - 0x30;
                        if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                          return 0;
                        }
                        if (9 < uVar3) {
                          uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                        }
                        uVar10 = uVar7 + 0xb;
                        if (uVar10 == unaff_x21) {
                          return 0;
                        }
                        uVar8 = uVar3 + uVar8 * 0x10;
                        cVar6 = *(char *)((long)param_1 + uVar10);
                        if (cVar6 != 0x7d) {
                          uVar3 = (int)cVar6 - 0x30;
                          if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                            return 0;
                          }
                          if (9 < uVar3) {
                            uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                          }
                          uVar10 = uVar7 + 0xc;
                          if (uVar10 == unaff_x21) {
                            return 0;
                          }
                          uVar8 = uVar3 + uVar8 * 0x10;
                          cVar6 = *(char *)((long)param_1 + uVar10);
                          if (cVar6 != 0x7d) {
                            uVar3 = (int)cVar6 - 0x30;
                            if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                              return 0;
                            }
                            if (9 < uVar3) {
                              uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                            }
                            uVar10 = uVar7 + 0xd;
                            if (uVar10 == unaff_x21) {
                              return 0;
                            }
                            uVar8 = uVar3 + uVar8 * 0x10;
                            cVar6 = *(char *)((long)param_1 + uVar10);
                            if (cVar6 != 0x7d) {
                              uVar3 = (int)cVar6 - 0x30;
                              if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                return 0;
                              }
                              if (9 < uVar3) {
                                uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                              }
                              uVar10 = uVar7 + 0xe;
                              if (uVar10 == unaff_x21) {
                                return 0;
                              }
                              uVar8 = uVar3 + uVar8 * 0x10;
                              cVar6 = *(char *)((long)param_1 + uVar10);
                              if (cVar6 != 0x7d) {
                                uVar3 = (int)cVar6 - 0x30;
                                if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                  return 0;
                                }
                                if (9 < uVar3) {
                                  uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                                }
                                uVar10 = uVar7 + 0xf;
                                if (uVar10 == unaff_x21) {
                                  return 0;
                                }
                                uVar8 = uVar3 + uVar8 * 0x10;
                                cVar6 = *(char *)((long)param_1 + uVar10);
                                if (cVar6 != 0x7d) {
                                  uVar3 = (int)cVar6 - 0x30;
                                  if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                    return 0;
                                  }
                                  if (9 < uVar3) {
                                    uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                                  }
                                  uVar10 = uVar7 + 0x10;
                                  if (uVar10 == unaff_x21) {
                                    return 0;
                                  }
                                  uVar8 = uVar3 + uVar8 * 0x10;
                                  cVar6 = *(char *)((long)param_1 + uVar10);
                                  if (cVar6 != 0x7d) {
                                    uVar3 = (int)cVar6 - 0x30;
                                    if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                      return 0;
                                    }
                                    if (9 < uVar3) {
                                      uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                                    }
                                    uVar10 = uVar7 + 0x11;
                                    if (uVar10 == unaff_x21) {
                                      return 0;
                                    }
                                    uVar8 = uVar3 + uVar8 * 0x10;
                                    cVar6 = *(char *)((long)param_1 + uVar10);
                                    if (cVar6 != 0x7d) {
                                      uVar3 = (int)cVar6 - 0x30;
                                      if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                        return 0;
                                      }
                                      if (9 < uVar3) {
                                        uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                                      }
                                      uVar10 = uVar7 + 0x12;
                                      if (uVar10 == unaff_x21) {
                                        return 0;
                                      }
                                      uVar8 = uVar3 + uVar8 * 0x10;
                                      cVar6 = *(char *)((long)param_1 + uVar10);
                                      if (cVar6 != 0x7d) {
                                        uVar3 = (int)cVar6 - 0x30;
                                        if ((9 < uVar3) && (5 < ((int)cVar6 | 0x20U) - 0x61)) {
                                          return 0;
                                        }
                                        uVar10 = uVar7 + 0x13;
                                        if (9 < uVar3) {
                                          uVar3 = ((int)cVar6 | 0x20U) - 0x57;
                                        }
                                        uVar8 = uVar3 + uVar8 * 0x10;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (uVar10 == unaff_x21) {
          return 0;
        }
        if (*(char *)((long)param_1 + uVar10) != '}') {
          return 0;
        }
        lVar5 = func_0x0070de34((long)param_1 + unaff_x20,uVar8);
        if (lVar5 == 0) {
          return 0;
        }
        uVar7 = uVar10 + 1;
        unaff_x20 = lVar5 + unaff_x20;
        goto LAB_0070d6e8;
      }
      if (iVar9 == 0x78) {
        if (unaff_x21 < uVar7 + 4) {
          return 0;
        }
        cVar6 = *(char *)((long)param_1 + in_x10);
        uVar8 = (int)cVar6 - 0x30;
        if (9 < uVar8 && 5 < ((int)cVar6 | 0x20U) - 0x61) {
          return 0;
        }
        bVar2 = *(byte *)((long)param_1 + uVar7 + 3);
        uVar3 = (int)(char)bVar2 - 0x30;
        if (9 < uVar3 && 5 < ((int)(char)bVar2 | 0x20U) - 0x61) {
          return 0;
        }
        if (9 < uVar8) {
          uVar8 = (int)cVar6 - 0x57;
        }
        if (9 < uVar3) {
          uVar3 = (bVar2 | 0x20) + 0xa9;
        }
        *(char *)((long)param_1 + unaff_x20) = (char)uVar3 + (char)uVar8 * '\x10';
        uVar7 = uVar7 + 4;
        unaff_x20 = unaff_x20 + 1;
        goto LAB_0070d6e8;
      }
      if (iVar9 == 0x7a) {
        uVar7 = in_x10;
        if (in_x10 < unaff_x21) {
          while ((*(byte *)((long)param_1 + in_x10) - 9 < 5 ||
                 (uVar7 = in_x10, *(byte *)((long)param_1 + in_x10) == 0x20))) {
            in_x10 = in_x10 + 1;
            if (unaff_x21 == in_x10) goto code_r0x0070ddb8;
          }
        }
        goto LAB_0070d6e8;
      }
    }
    uVar8 = iVar9 - 0x30;
    if (uVar8 < 10) {
      if (in_x10 == unaff_x21) {
        in_x10 = unaff_x21;
      }
      else {
        if ((int)*(char *)((long)param_1 + in_x10) - 0x30U < 10) {
          uVar8 = ((int)*(char *)((long)param_1 + in_x10) + uVar8 * unaff_w22) - 0x30;
          in_x10 = uVar7 + 3;
          if ((in_x10 != unaff_x21) && ((int)*(char *)((long)param_1 + in_x10) - 0x30U < 10)) {
            uVar8 = ((int)*(char *)((long)param_1 + in_x10) + uVar8 * unaff_w22) - 0x30;
            in_x10 = uVar7 + 4;
          }
        }
        if (0xff < uVar8) {
          return 0;
        }
      }
      *(char *)((long)param_1 + unaff_x20) = (char)uVar8;
      uVar7 = in_x10;
      unaff_x20 = unaff_x20 + 1;
      goto LAB_0070d6e8;
    }
    if (iVar9 - 0x61U < 0x16) {
                    /* WARNING: Could not recover jumptable at 0x0070d8d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*(code *)(&UNK_0070d8d4 +
                        (ulong)*(ushort *)(unaff_x23 + (ulong)(iVar9 - 0x61U) * 2) * 4))();
      return uVar4;
    }
  } while( true );
}

