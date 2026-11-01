
ulong FUN_0072aa9c(void)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  char *pcVar6;
  long unaff_x19;
  undefined1 *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  ulong uVar7;
  long *in_stack_00000010;
  long *plStack0000000000000018;
  long lStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  ulong *puStack0000000000000038;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  
  *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) & 0xfd;
  unaff_x21[2] = unaff_x22;
  lStack0000000000000030 = unaff_x21[3];
  lVar1 = unaff_x22 + 0x20;
  puStack0000000000000038 = (ulong *)(unaff_x22 + 0x40);
  plStack0000000000000018 = (long *)(unaff_x22 + 0xa0);
  lStack0000000000000020 = unaff_x22 + 0x50;
  lStack0000000000000028 = unaff_x19 + 0xe8;
LAB_0072ab24:
  lVar4 = func_0x00734ac8();
  if (lVar4 < 1) {
    func_0x0073c9e4();
    uVar7 = 0x1c;
    iVar3 = *(int *)(unaff_x22 + 0xa8);
    goto joined_r0x0072b990;
  }
  switch(*(undefined4 *)(unaff_x22 + 0xa8)) {
  case 0:
    if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
      func_0x0073cbdc();
    }
    uStack0000000000000058 = 0;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x1a8));
    *(undefined8 *)(unaff_x19 + 0x1a8) = 0;
    uVar7 = func_0x0075a4f0(&uStack0000000000000058);
    if ((int)uVar7 == 0) {
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x007406b0(lVar1);
      *puStack0000000000000038 = 0;
      puStack0000000000000038[1] = 0;
      uVar7 = func_0x00757f2c(uStack0000000000000058,*(char *)(*in_stack_00000010 + 0x104) != '\x01'
                              ,lVar1);
      if (((int)uVar7 != 0) || (uVar7 = func_0x00774a20(), (int)uVar7 != 0)) goto code_r0x0072ac5c;
    }
    else {
code_r0x0072ac5c:
      func_0x0073c9e4();
    }
    if (uStack0000000000000058 != 0) {
      func_0x00756ab4();
    }
    if ((int)uVar7 == 0) {
      if (*(int *)(unaff_x22 + 0xa8) != 1) {
        if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))
           ) {
          func_0x0073cbdc();
        }
        *(undefined4 *)(unaff_x22 + 0xa8) = 1;
        *(undefined4 *)(unaff_x22 + 0x98) = 1;
        func_0x007406b0();
      }
code_r0x0072ace4:
      if (((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc)))
      {
        func_0x0073cbdc();
      }
      bVar2 = false;
      goto code_r0x0072ad28;
    }
    goto code_r0x0072b8f8;
  case 1:
    break;
  case 2:
    goto code_r0x0072ae44;
  case 3:
    goto code_r0x0072b44c;
  default:
    goto LAB_0072ab1c;
  }
  if (unaff_x19 != 0) goto code_r0x0072ace4;
  bVar2 = true;
code_r0x0072ad28:
  func_0x00740a58(lVar1);
  uVar5 = func_0x00156654(lVar1);
  uStack0000000000000058 = uStack0000000000000058 & 0xffffffff00000000;
  if (*puStack0000000000000038 < uVar5) {
    lVar4 = (**(code **)(*(long *)unaff_x21[1] + 0x48))();
    if (lVar4 < 0) {
      if ((int)uStack0000000000000058 == 0x51) goto code_r0x0072add8;
    }
    else {
      *puStack0000000000000038 = *puStack0000000000000038 + lVar4;
      func_0x0073c8fc();
    }
    if ((int)uStack0000000000000058 != 0) {
      func_0x0073c9e4();
      uVar7 = uStack0000000000000058 & 0xffffffff;
      if ((int)uStack0000000000000058 != 0) {
        iVar3 = *(int *)(unaff_x22 + 0xa8);
        goto joined_r0x0072b990;
      }
    }
  }
code_r0x0072add8:
  if (*puStack0000000000000038 < uVar5) goto code_r0x0072b77c;
  if (*(int *)(unaff_x22 + 0xa8) != 2) {
    if ((((!bVar2) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
      func_0x0073cbdc();
    }
    *(undefined4 *)(unaff_x22 + 0xa8) = 2;
  }
code_r0x0072ae44:
  if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  iVar3 = func_0x007316f8();
  if (iVar3 == 0) {
code_r0x0072b3d4:
    uVar7 = 0;
    bVar2 = true;
  }
  else {
code_r0x0072ae9c:
    do {
      while( true ) {
        if (*(int *)(unaff_x22 + 0x98) == 0) goto code_r0x0072b618;
        uVar7 = func_0x007321b4();
        if ((int)uVar7 == 0x51) goto code_r0x0072b3d4;
        iVar3 = func_0x0077011c();
        if (iVar3 != 0) {
          uVar7 = 0x2a;
          bVar2 = true;
          goto code_r0x0072b3dc;
        }
        if ((int)uVar7 != 0) {
          bVar2 = false;
          *(undefined4 *)(unaff_x22 + 0x98) = 0;
          goto code_r0x0072b3dc;
        }
        if ((long)uStack0000000000000058 < 1) {
          if (((*(long *)(unaff_x19 + 0x200) == 0) || (*(long *)(unaff_x19 + 0xd10) == 0)) ||
             (*(long *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) == 0)) {
            func_0x0073c9e4();
            bVar2 = false;
            *(undefined4 *)(unaff_x22 + 0x98) = 0;
            uVar7 = 0x38;
            goto code_r0x0072b3dc;
          }
          *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) | 2;
          if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          goto code_r0x0072b614;
        }
        if (*(int *)(unaff_x22 + 0x98) == 2) break;
        iVar3 = func_0x0074075c();
        if (iVar3 != 0) {
          func_0x0073c9e4();
          uVar7 = 0x38;
          bVar2 = true;
          goto code_r0x0072b3dc;
        }
        if (in_stack_00000050._7_1_ == '\n') {
          *(long *)(unaff_x22 + 0x48) = *(long *)(unaff_x22 + 0x48) + 1;
          pcVar6 = (char *)func_0x00740a58();
          func_0x00156654();
          func_0x0073c8fc();
          uVar7 = func_0x007738a0();
          if (((int)uVar7 != 0) || (uVar7 = func_0x00754e80(), (int)uVar7 != 0)) {
            bVar2 = true;
            goto code_r0x0072b3dc;
          }
          if ((*pcVar6 == '\r') || (*pcVar6 == '\n')) {
            if ((*(int *)(unaff_x19 + 0x130) != 0x197) || ((char)(&UNK_00001344)[unaff_x19] < '\0'))
            goto code_r0x0072b614;
            *(undefined4 *)(unaff_x22 + 0x98) = 2;
            if (*(long *)(unaff_x22 + 0xa0) == 0) {
              iVar3 = (int)*(undefined8 *)(unaff_x19 + 0xa1a);
              if ((*(byte *)(unaff_x22 + 0xac) & 1) == 0) {
                if ((iVar3 < 0) &&
                   (((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))) &&
                    (0 < *(int *)(*unaff_x21 + 0xc))))) {
                  func_0x0073cbdc();
                }
                goto code_r0x0072b614;
              }
              if ((iVar3 < 0) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
            }
            else if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
                    ((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
          }
          else {
            iVar3 = func_0x0077e76c(pcVar6,"WWW-Authenticate:",0x11);
            if (((iVar3 != 0) && (*(int *)(unaff_x19 + 0x130) == 0x191)) ||
               ((iVar3 = func_0x0077e76c(pcVar6,"Proxy-authenticate:",0x13), iVar3 != 0 &&
                (*(int *)(unaff_x19 + 0x130) == 0x197)))) {
              lVar4 = func_0x007529d0(pcVar6);
              if (lVar4 == 0) {
                uVar7 = 0x1b;
              }
              else {
                if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
                   (((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))) &&
                    (0 < *(int *)(*unaff_x21 + 0xc))))) {
                  func_0x0073cbdc();
                }
                uVar7 = func_0x0075350c();
                (*pcRam0000000000a2b5f0)(lVar4);
                if ((int)uVar7 == 0) goto code_r0x0072b238;
              }
              bVar2 = true;
              goto code_r0x0072b3dc;
            }
            iVar3 = func_0x0077e76c(pcVar6,"Content-Length:",0xf);
            if (iVar3 == 0) {
              iVar3 = func_0x007537a0(pcVar6,"Connection:",0xb,"close",5);
              if (iVar3 == 0) {
                iVar3 = func_0x0077e76c(pcVar6,"Transfer-Encoding:",0x12);
                if (iVar3 == 0) {
                  iVar3 = func_0x007537a0(pcVar6,"Proxy-Connection:",0x11,"close",5);
                  if (iVar3 != 0) goto code_r0x0072b214;
                  iVar3 = _strncmp(pcVar6,"HTTP/1.",7);
                  if (((((iVar3 == 0) && ((pcVar6[7] & 0xfeU) == 0x30)) && (pcVar6[8] == ' ')) &&
                      (((byte)pcVar6[9] - 0x30 < 10 && ((byte)pcVar6[10] - 0x30 < 10)))) &&
                     (((byte)pcVar6[0xb] - 0x30 < 10 && (9 < (byte)pcVar6[0xc] - 0x30)))) {
                    iVar3 = (uint)(byte)pcVar6[10] * 10 + (uint)(byte)pcVar6[9] * 100 +
                            ((byte)pcVar6[0xb] - 0x14d0);
                    *(int *)(unaff_x19 + 0x130) = iVar3;
                    *(int *)(&UNK_00001354 + unaff_x19) = iVar3;
                  }
                }
                else if (*(int *)(unaff_x19 + 0x130) - 200U < 100) {
                  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                }
                else {
                  iVar3 = func_0x007537a0(pcVar6,"Transfer-Encoding:",0x12,"chunked",7);
                  if (iVar3 != 0) {
                    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
                       ((*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) == 0 ||
                        (0 < *(int *)(*(long *)(
                                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                               + unaff_x19 + 0x18) + 8))))) {
                      func_0x0073cab8();
                    }
                    *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) | 1;
                    func_0x007593ac();
                  }
                }
              }
              else {
code_r0x0072b214:
                *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) | 2;
              }
            }
            else if (*(int *)(unaff_x19 + 0x130) - 200U < 100) {
              if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
            }
            else {
              func_0x0077ed9c(pcVar6 + 0xf,0,10,plStack0000000000000018);
            }
code_r0x0072b238:
            func_0x007406b0();
          }
        }
      }
      lVar4 = *plStack0000000000000018;
      if (lVar4 == 0) {
        if ((*(byte *)(unaff_x22 + 0xac) & 1) != 0) {
          uVar7 = func_0x00759404();
          if ((int)uVar7 != 0) {
            bVar2 = true;
            goto code_r0x0072b3dc;
          }
          iVar3 = func_0x007593f4();
          if (iVar3 != 0) {
            if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            *(undefined4 *)(unaff_x22 + 0x98) = 0;
          }
        }
        goto code_r0x0072ae9c;
      }
      *plStack0000000000000018 = lVar4 + -1;
    } while (lVar4 + -1 != 0 && 0 < lVar4);
code_r0x0072b614:
    *(undefined4 *)(unaff_x22 + 0x98) = 0;
code_r0x0072b618:
    if (*(int *)(&UNK_00001354 + unaff_x19) - 200U < 100) {
      bVar2 = false;
      uVar7 = 0;
    }
    else {
      uVar7 = func_0x00752aa8();
      bVar2 = false;
    }
  }
code_r0x0072b3dc:
  iVar3 = func_0x0077011c();
  if (iVar3 != 0) {
    uVar7 = 0x2a;
code_r0x0072b8f8:
    iVar3 = *(int *)(unaff_x22 + 0xa8);
joined_r0x0072b990:
    if (iVar3 != 5) {
      if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc)))
      {
        func_0x0073cbdc();
      }
      *(undefined4 *)(unaff_x22 + 0xa8) = 5;
      func_0x007406b0();
      func_0x007406b0(lVar1);
      *(undefined4 *)(&UNK_00001350 + unaff_x19) = 0;
      (*pcRam0000000000a2b5f0)
                (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    }
    *unaff_x20 = 0;
    return uVar7;
  }
  if ((int)uVar7 != 0) {
    bVar2 = true;
  }
  if (bVar2) {
code_r0x0072b778:
    if ((int)uVar7 != 0) goto code_r0x0072b8f8;
    goto code_r0x0072b77c;
  }
  if (*(int *)(unaff_x22 + 0xa8) != 3) {
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))) {
      func_0x0073cbdc();
    }
    *(undefined4 *)(unaff_x22 + 0xa8) = 3;
  }
code_r0x0072b44c:
  if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  if (*(long *)(unaff_x19 + 0x1a8) == 0) goto LAB_0072b680;
  func_0x007710b8(lStack0000000000000028);
  if (((*(byte *)(unaff_x22 + 0xac) >> 1 & 1) != 0) ||
     ((*(byte *)(lStack0000000000000030 + 0x398) >> 5 & 1) != 0)) {
    if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
      lVar4 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
      if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
        if (0 < *(int *)(*unaff_x21 + 0xc)) {
          func_0x0073cbdc();
          if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto code_r0x0072b748;
          lVar4 = *(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18);
        }
        if (lVar4 != 0) goto code_r0x0072b72c;
      }
      else {
code_r0x0072b72c:
        if (*(int *)(lVar4 + 8) < 1) goto code_r0x0072b748;
      }
      func_0x0073cab8();
    }
code_r0x0072b748:
    func_0x00731170();
    func_0x00734f74(lStack0000000000000030,0);
    uVar7 = func_0x00731158(unaff_x21[1]);
    goto code_r0x0072b778;
  }
  if (*(int *)(unaff_x22 + 0xa8) != 0) {
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))) {
      func_0x0073cbdc();
    }
    func_0x007406b0();
    func_0x007406b0(lVar1);
    *(undefined4 *)(unaff_x22 + 0xa8) = 0;
    *(undefined4 *)(unaff_x22 + 0x98) = 1;
    *(undefined8 *)(unaff_x22 + 0xa0) = 0;
    *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) & 0xfd;
  }
LAB_0072ab1c:
  if (*(long *)(unaff_x19 + 0x1a8) == 0) {
LAB_0072b680:
    if (*(int *)(&UNK_00001354 + unaff_x19) - 200U < 100) {
      func_0x0072bc9c();
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
code_r0x0072b77c:
      (*pcRam0000000000a2b5f0)
                (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
      if (unaff_x21[2] == 0) {
        uVar7 = 0;
        *unaff_x20 = 0;
      }
      else {
        bVar2 = *(int *)(unaff_x21[2] + 0xa8) == 4;
        *unaff_x20 = bVar2;
        if (bVar2) {
          *(byte *)((long)unaff_x21 + 0x24) = *(byte *)((long)unaff_x21 + 0x24) | 1;
          func_0x007710b8(unaff_x19 + 0xe8);
          func_0x00773c94();
          func_0x00770948();
          func_0x0077093c();
          func_0x0072bbb8();
        }
        uVar7 = 0;
      }
    }
    else {
      (*pcRam0000000000a2b5f0)(0);
      *(undefined8 *)(unaff_x19 + 0x1a8) = 0;
      func_0x00734f74(lStack0000000000000030,2);
      if (*(int *)(unaff_x22 + 0xa8) != 5) {
        if (((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))
           ) {
          func_0x0073cbdc();
        }
        *(undefined4 *)(unaff_x22 + 0xa8) = 5;
        func_0x007406b0();
        func_0x007406b0(lVar1);
        *(undefined4 *)(&UNK_00001350 + unaff_x19) = 0;
        (*pcRam0000000000a2b5f0)
                  (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
        *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
      }
      func_0x0073c9e4();
      uVar7 = 0x38;
      *unaff_x20 = 0;
    }
    return uVar7;
  }
  goto LAB_0072ab24;
}

