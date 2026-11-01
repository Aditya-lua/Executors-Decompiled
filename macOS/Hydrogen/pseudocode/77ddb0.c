
void FUN_0077ddb0(void)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x24;
  ulong unaff_x26;
  ulong unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined1 auVar7 [16];
  long in_stack_00000030;
  char *in_stack_00000038;
  undefined8 uStack0000000000000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  
  *(char *)((long)unaff_x23 + 0x11) = (char)unaff_x27;
  if (unaff_x27 == 0) {
    in_stack_00000038[2] = (char)unaff_x26;
    lVar5 = *(long *)(unaff_x23 + 0xa2);
  }
  else {
    if (0xff < unaff_x27) {
      func_0x0073c9e4();
      iVar3 = 0xb;
      goto LAB_0077de8c;
    }
    _memcpy((long)unaff_x23 + 0x12);
    in_stack_00000038[unaff_x27 + 2] = (char)unaff_x26;
    lVar5 = *(long *)(unaff_x23 + 0xa2);
  }
  if ((lVar5 != 0) && (unaff_x26 != 0)) {
    if (0xff < unaff_x26) {
      func_0x0073c9e4();
      iVar3 = 10;
      goto LAB_0077de8c;
    }
    _memcpy(in_stack_00000038 + unaff_x27 + 3);
  }
  if (*unaff_x23 != 7) {
    *unaff_x23 = 7;
  }
  *(ulong *)(unaff_x23 + 2) = unaff_x27 + 3 + unaff_x26;
  *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
  lVar5 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
  if (lVar5 < 1) {
    if ((int)uStack0000000000000050 == 0x51) {
      lVar6 = *(long *)(unaff_x23 + 2);
      goto joined_r0x0077df24;
    }
    if ((int)uStack0000000000000050 != 0) {
      func_0x0077e9f4();
      func_0x0073c9e4();
      iVar3 = 0x1c;
      goto LAB_0077de8c;
    }
code_r0x0077df08:
    func_0x0073c9e4();
    iVar3 = 3;
    goto LAB_0077de8c;
  }
  lVar6 = *(long *)(unaff_x23 + 2) - lVar5;
  *(long *)(unaff_x23 + 2) = lVar6;
  *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar5;
joined_r0x0077df24:
  if (lVar6 == 0) {
    *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
    unaff_x23[2] = 2;
    unaff_x23[3] = 0;
    if (*unaff_x23 != 8) {
      *unaff_x23 = 8;
    }
    lVar5 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
    if (lVar5 < 1) {
      if ((int)uStack0000000000000050 != 0x51) {
        if ((int)uStack0000000000000050 != 0) {
          func_0x0077e9f4();
          func_0x0073c9e4();
          iVar3 = 0xe;
          goto LAB_0077de8c;
        }
        goto code_r0x0077df08;
      }
      lVar6 = *(long *)(unaff_x23 + 2);
    }
    else {
      lVar6 = *(long *)(unaff_x23 + 2) - lVar5;
      *(long *)(unaff_x23 + 2) = lVar6;
      *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar5;
    }
    if (lVar6 == 0) {
      if (*(char *)((long)unaff_x23 + 0x11) != '\0') {
        func_0x0073c9e4();
        iVar3 = 0x21;
        goto LAB_0077de8c;
      }
      if (*unaff_x23 != 9) {
        *unaff_x23 = 9;
      }
      if (unaff_w28 == 5) {
        iVar3 = func_0x0074f754();
        if (iVar3 == -1) {
          iVar3 = 0x1b;
          goto LAB_0077de8c;
        }
        if (iVar3 != 1) {
          if (*unaff_x23 != 0xb) {
            *unaff_x23 = 0xb;
          }
          lVar5 = 0;
          if (in_stack_00000048 != (long *)0x0) {
            lVar5 = *in_stack_00000048;
          }
          if (*(char *)(unaff_x21 + 0xa19) == '\0') {
            if (lVar5 != 0) {
code_r0x0077d958:
              func_0x0074ef88(lVar5,&uStack0000000000000050,0x2e);
              *(undefined2 *)(unaff_x23 + 4) = 0x105;
              *(undefined1 *)((long)unaff_x23 + 0x12) = 0;
              if (*(int *)(lVar5 + 4) == 0x1e) {
                *(undefined1 *)((long)unaff_x23 + 0x13) = 4;
                lVar5 = *(long *)(lVar5 + 0x20);
                *(undefined1 *)(unaff_x23 + 5) = *(undefined1 *)(lVar5 + 8);
                *(undefined1 *)((long)unaff_x23 + 0x15) = *(undefined1 *)(lVar5 + 9);
                *(undefined1 *)((long)unaff_x23 + 0x16) = *(undefined1 *)(lVar5 + 10);
                *(undefined1 *)((long)unaff_x23 + 0x17) = *(undefined1 *)(lVar5 + 0xb);
                *(undefined1 *)(unaff_x23 + 6) = *(undefined1 *)(lVar5 + 0xc);
                *(undefined1 *)((long)unaff_x23 + 0x19) = *(undefined1 *)(lVar5 + 0xd);
                *(undefined1 *)((long)unaff_x23 + 0x1a) = *(undefined1 *)(lVar5 + 0xe);
                *(undefined1 *)((long)unaff_x23 + 0x1b) = *(undefined1 *)(lVar5 + 0xf);
                *(undefined1 *)(unaff_x23 + 7) = *(undefined1 *)(lVar5 + 0x10);
                *(undefined1 *)((long)unaff_x23 + 0x1d) = *(undefined1 *)(lVar5 + 0x11);
                *(undefined1 *)((long)unaff_x23 + 0x1e) = *(undefined1 *)(lVar5 + 0x12);
                *(undefined1 *)((long)unaff_x23 + 0x1f) = *(undefined1 *)(lVar5 + 0x13);
                *(undefined1 *)(unaff_x23 + 8) = *(undefined1 *)(lVar5 + 0x14);
                *(undefined1 *)((long)unaff_x23 + 0x21) = *(undefined1 *)(lVar5 + 0x15);
                *(undefined1 *)((long)unaff_x23 + 0x22) = *(undefined1 *)(lVar5 + 0x16);
                *(undefined1 *)((long)unaff_x23 + 0x23) = *(undefined1 *)(lVar5 + 0x17);
                if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x21 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
                in_stack_00000030 = 0x14;
              }
              else if (*(int *)(lVar5 + 4) == 2) {
                *(undefined1 *)((long)unaff_x23 + 0x13) = 1;
                lVar5 = *(long *)(lVar5 + 0x20);
                *(undefined1 *)(unaff_x23 + 5) = *(undefined1 *)(lVar5 + 4);
                *(undefined1 *)((long)unaff_x23 + 0x15) = *(undefined1 *)(lVar5 + 5);
                *(undefined1 *)((long)unaff_x23 + 0x16) = *(undefined1 *)(lVar5 + 6);
                *(undefined1 *)((long)unaff_x23 + 0x17) = *(undefined1 *)(lVar5 + 7);
                if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x21 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
                in_stack_00000030 = 8;
              }
              else {
                func_0x0073c9e4();
                in_stack_00000030 = 3;
              }
              func_0x00750010();
              goto code_r0x0077db10;
            }
          }
          else {
            iVar3 = 2;
            if (*(char *)(unaff_x21 + 0xa19) != '\x01') {
              iVar3 = 0x1e;
            }
            for (; lVar5 != 0; lVar5 = *(long *)(lVar5 + 0x28)) {
              if (*(int *)(lVar5 + 4) == iVar3) goto code_r0x0077d958;
            }
          }
          func_0x0073c9e4();
          iVar3 = 0x1b;
          goto LAB_0077de8c;
        }
        if (*unaff_x23 != 10) {
          iVar3 = 0;
          *unaff_x23 = 10;
          goto LAB_0077de8c;
        }
      }
      else {
        *(undefined2 *)(unaff_x23 + 4) = 0x105;
        *(undefined1 *)((long)unaff_x23 + 0x12) = 0;
        if ((*(byte *)(unaff_x24 + 0x399) >> 2 & 1) == 0) {
          iVar3 = _inet_pton(2,*(undefined8 *)(unaff_x23 + 0x9c),(long)&uStack0000000000000040 + 4);
          if (iVar3 == 1) {
            *(undefined1 *)((long)unaff_x23 + 0x13) = 1;
            unaff_x23[5] = uStack0000000000000040._4_4_;
            in_stack_00000030 = 8;
          }
          else {
            *(undefined1 *)((long)unaff_x23 + 0x13) = 3;
            *(char *)(unaff_x23 + 5) = (char)in_stack_00000030;
            _memcpy((long)unaff_x23 + 0x15,*(undefined8 *)(unaff_x23 + 0x9c),in_stack_00000030);
            in_stack_00000030 = in_stack_00000030 + 5;
          }
        }
        else {
          iVar3 = _inet_pton(0x1e,*(undefined8 *)(unaff_x23 + 0x9c),&uStack0000000000000050);
          if (iVar3 != 1) {
            iVar3 = 1;
            goto LAB_0077de8c;
          }
          *(undefined1 *)((long)unaff_x23 + 0x13) = 4;
          *(undefined8 *)(unaff_x23 + 7) = in_stack_00000058;
          *(ulong *)(unaff_x23 + 5) =
               CONCAT44(uStack0000000000000050._4_4_,(int)uStack0000000000000050);
          in_stack_00000030 = 0x14;
        }
        if ((*(char *)(unaff_x21 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x21 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x21 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
code_r0x0077db10:
        in_stack_00000038[in_stack_00000030] = (char)((uint)unaff_x23[0x9e] >> 8);
        (in_stack_00000038 + in_stack_00000030)[1] = (char)unaff_x23[0x9e];
        *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
        *(long *)(unaff_x23 + 2) = in_stack_00000030 + 2;
        if (*unaff_x23 != 0xe) {
          *unaff_x23 = 0xe;
        }
        lVar5 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
        if (lVar5 < 1) {
          if ((int)uStack0000000000000050 != 0x51) {
            if ((int)uStack0000000000000050 != 0) {
              func_0x0077e9f4();
              func_0x0073c9e4();
              iVar3 = 0x1e;
              goto LAB_0077de8c;
            }
            goto code_r0x0077df08;
          }
          lVar6 = *(long *)(unaff_x23 + 2);
        }
        else {
          lVar6 = *(long *)(unaff_x23 + 2) - lVar5;
          *(long *)(unaff_x23 + 2) = lVar6;
          *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar5;
        }
        if (lVar6 == 0) {
          unaff_x23[2] = 10;
          unaff_x23[3] = 0;
          *(char **)(unaff_x23 + 0x9a) = in_stack_00000038;
          if (*unaff_x23 != 0xf) {
            *unaff_x23 = 0xf;
          }
          lVar5 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
          if (lVar5 < 1) {
            if ((int)uStack0000000000000050 != 0x51) {
              if ((int)uStack0000000000000050 != 0) {
                func_0x0077e9f4();
                func_0x0073c9e4();
                iVar3 = 0x10;
                goto LAB_0077de8c;
              }
              goto code_r0x0077df08;
            }
            lVar6 = *(long *)(unaff_x23 + 2);
          }
          else {
            lVar6 = *(long *)(unaff_x23 + 2) - lVar5;
            *(long *)(unaff_x23 + 2) = lVar6;
            *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar5;
          }
          if (lVar6 == 0) {
            if (*in_stack_00000038 != '\x05') {
              func_0x0073c9e4();
              iVar3 = 2;
              goto LAB_0077de8c;
            }
            bVar1 = *(byte *)((long)unaff_x23 + 0x11);
            if (bVar1 != 0) {
              func_0x0073c9e4();
              if (bVar1 < 9) {
                iVar3 = *(int *)(&UNK_008ce3dc + (ulong)bVar1 * 4);
              }
              else {
                iVar3 = 0x19;
              }
              goto LAB_0077de8c;
            }
            cVar2 = *(char *)((long)unaff_x23 + 0x13);
            if (cVar2 != '\x01') {
              if (cVar2 == '\x03') {
                if ((ulong)*(byte *)(unaff_x23 + 5) < 4) goto code_r0x0077d0f8;
                lVar5 = (ulong)*(byte *)(unaff_x23 + 5) + 7;
              }
              else {
                if (cVar2 != '\x04') {
                  func_0x0073c9e4();
                  iVar3 = 1;
                  goto LAB_0077de8c;
                }
                lVar5 = 0x16;
              }
              *(long *)(unaff_x23 + 2) = lVar5 + -10;
              *(long *)(unaff_x23 + 0x9a) = (long)unaff_x23 + 0x1a;
              if (*unaff_x23 != 0x10) {
                *unaff_x23 = 0x10;
              }
              lVar5 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
              if (lVar5 < 1) {
                if ((int)uStack0000000000000050 != 0x51) {
                  if ((int)uStack0000000000000050 != 0) {
                    func_0x0077e9f4();
                    func_0x0073c9e4();
                    iVar3 = 0xd;
                    goto LAB_0077de8c;
                  }
                  goto code_r0x0077df08;
                }
                lVar6 = *(long *)(unaff_x23 + 2);
              }
              else {
                lVar6 = *(long *)(unaff_x23 + 2) - lVar5;
                *(long *)(unaff_x23 + 2) = lVar6;
                *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar5;
              }
              if (lVar6 != 0) goto code_r0x0077de88;
            }
code_r0x0077d0f8:
            if (*unaff_x23 != 0x11) {
              *unaff_x23 = 0x11;
            }
            if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x21 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x21 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
          }
        }
      }
    }
  }
code_r0x0077de88:
  iVar3 = 0;
LAB_0077de8c:
  if (iVar3 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar4 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar4 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar4 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar3;
    uVar4 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar7 = ___stack_chk_fail(uVar4);
  lVar5 = auVar7._0_8_;
  *(byte *)(lVar5 + 0x24) = *(byte *)(lVar5 + 0x24) & 0xfe;
  if (*(long *)(lVar5 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar5 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar5 + 8) + 0x20))(*(long **)(lVar5 + 8),auVar7._8_8_);
  return;
}

