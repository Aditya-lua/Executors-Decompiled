
/* WARNING: Type propagation algorithm not settling */

ulong FUN_0072b430(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  char *pcVar5;
  long unaff_x19;
  undefined1 *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x24;
  ulong uVar6;
  long *in_stack_00000010;
  long *in_stack_00000018;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  ulong *in_stack_00000038;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  
code_r0x0072b430:
  func_0x0073cbdc();
code_r0x0072b444:
  *(undefined4 *)(unaff_x22 + 0xa8) = 3;
code_r0x0072b44c:
  if ((((unaff_x19 != 0) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  if (*(long *)(unaff_x19 + 0x1a8) != 0) {
    func_0x007710b8(in_stack_00000028);
    if (((*(byte *)(unaff_x22 + 0xac) >> 1 & 1) == 0) &&
       ((*(byte *)(in_stack_00000030 + 0x398) >> 5 & 1) == 0)) {
      if (*(int *)(unaff_x22 + 0xa8) != 0) {
        if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))
           ) {
          func_0x0073cbdc();
        }
        func_0x007406b0();
        func_0x007406b0();
        *(undefined4 *)(unaff_x22 + 0xa8) = 0;
        *(undefined4 *)(unaff_x22 + 0x98) = 1;
        *(undefined8 *)(unaff_x22 + 0xa0) = 0;
        *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) & 0xfd;
      }
      do {
        if (*(long *)(unaff_x19 + 0x1a8) == 0) goto LAB_0072b680;
        lVar3 = func_0x00734ac8();
        if (lVar3 < 1) {
          func_0x0073c9e4();
          uVar6 = 0x1c;
          iVar2 = *(int *)(unaff_x22 + 0xa8);
          goto joined_r0x0072b990;
        }
        switch(*(undefined4 *)(unaff_x22 + 0xa8)) {
        case 0:
          goto code_r0x0072ab60;
        case 1:
          if (unaff_x19 != 0) goto code_r0x0072ace4;
          bVar1 = true;
          goto code_r0x0072ad28;
        case 2:
          goto code_r0x0072ae44;
        case 3:
          goto code_r0x0072b44c;
        }
      } while( true );
    }
    if (*(char *)((long)unaff_x24 + 3) < '\0') {
      lVar3 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
      if ((lVar3 == 0) || (0 < *(int *)(lVar3 + 8))) {
        if (0 < *(int *)(*unaff_x21 + 0xc)) {
          func_0x0073cbdc();
          if (-1 < *(char *)((long)unaff_x24 + 3)) goto code_r0x0072b748;
          lVar3 = *(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18);
        }
        if (lVar3 != 0) goto code_r0x0072b72c;
      }
      else {
code_r0x0072b72c:
        if (*(int *)(lVar3 + 8) < 1) goto code_r0x0072b748;
      }
      func_0x0073cab8();
    }
code_r0x0072b748:
    func_0x00731170();
    func_0x00734f74(in_stack_00000030,0);
    uVar6 = func_0x00731158(unaff_x21[1]);
    goto code_r0x0072b778;
  }
LAB_0072b680:
  if (99 < *(int *)(&UNK_00001354 + unaff_x19) - 200U) {
    (*pcRam0000000000a2b5f0)(0);
    *(undefined8 *)(unaff_x19 + 0x1a8) = 0;
    func_0x00734f74(in_stack_00000030,2);
    if (*(int *)(unaff_x22 + 0xa8) != 5) {
      if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc)))))
      {
        func_0x0073cbdc();
      }
      *(undefined4 *)(unaff_x22 + 0xa8) = 5;
      func_0x007406b0();
      func_0x007406b0();
      *(undefined4 *)(&UNK_00001350 + unaff_x19) = 0;
      (*pcRam0000000000a2b5f0)
                (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    }
    func_0x0073c9e4();
    *unaff_x20 = 0;
    return 0x38;
  }
  func_0x0072bc9c();
  if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  goto code_r0x0072b77c;
code_r0x0072b400:
  if (((unaff_x19 == 0) || (-1 < *(char *)((long)unaff_x24 + 3))) ||
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) != 0 &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1)) || (*(int *)(*unaff_x21 + 0xc) < 1))))
  goto code_r0x0072b444;
  goto code_r0x0072b430;
code_r0x0072ab60:
  if ((((unaff_x19 != 0) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
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
  uVar6 = func_0x0075a4f0(&uStack0000000000000058);
  if ((int)uVar6 == 0) {
    if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    func_0x007406b0();
    *in_stack_00000038 = 0;
    in_stack_00000038[1] = 0;
    uVar6 = func_0x00757f2c(uStack0000000000000058,*(char *)(*in_stack_00000010 + 0x104) != '\x01');
    if (((int)uVar6 != 0) || (uVar6 = func_0x00774a20(), (int)uVar6 != 0)) goto code_r0x0072ac5c;
  }
  else {
code_r0x0072ac5c:
    func_0x0073c9e4();
  }
  if (uStack0000000000000058 != 0) {
    func_0x00756ab4();
  }
  if ((int)uVar6 != 0) goto LAB_0072b8f8;
  if (*(int *)(unaff_x22 + 0xa8) != 1) {
    if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))) {
      func_0x0073cbdc();
    }
    *(undefined4 *)(unaff_x22 + 0xa8) = 1;
    *(undefined4 *)(unaff_x22 + 0x98) = 1;
    func_0x007406b0();
  }
code_r0x0072ace4:
  if (((*(char *)((long)unaff_x24 + 3) < '\0') &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  bVar1 = false;
code_r0x0072ad28:
  func_0x00740a58();
  uVar4 = func_0x00156654();
  uStack0000000000000058 = uStack0000000000000058 & 0xffffffff00000000;
  if (*in_stack_00000038 < uVar4) {
    lVar3 = (**(code **)(*(long *)unaff_x21[1] + 0x48))();
    if (lVar3 < 0) {
      if ((int)uStack0000000000000058 == 0x51) goto code_r0x0072add8;
    }
    else {
      *in_stack_00000038 = *in_stack_00000038 + lVar3;
      func_0x0073c8fc();
    }
    if ((int)uStack0000000000000058 != 0) {
      func_0x0073c9e4();
      uVar6 = uStack0000000000000058 & 0xffffffff;
      if ((int)uStack0000000000000058 != 0) {
        iVar2 = *(int *)(unaff_x22 + 0xa8);
        goto joined_r0x0072b990;
      }
    }
  }
code_r0x0072add8:
  if (*in_stack_00000038 < uVar4) goto code_r0x0072b77c;
  if (*(int *)(unaff_x22 + 0xa8) != 2) {
    if ((((!bVar1) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
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
  if ((((unaff_x19 != 0) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  iVar2 = func_0x007316f8();
  if (iVar2 == 0) {
code_r0x0072b3d4:
    uVar6 = 0;
    bVar1 = true;
  }
  else {
code_r0x0072ae9c:
    do {
      while( true ) {
        if (*(int *)(unaff_x22 + 0x98) == 0) goto code_r0x0072b618;
        uVar6 = func_0x007321b4();
        if ((int)uVar6 == 0x51) goto code_r0x0072b3d4;
        iVar2 = func_0x0077011c();
        if (iVar2 != 0) {
          uVar6 = 0x2a;
          bVar1 = true;
          goto code_r0x0072b3dc;
        }
        if ((int)uVar6 != 0) {
          bVar1 = false;
          *(undefined4 *)(unaff_x22 + 0x98) = 0;
          goto code_r0x0072b3dc;
        }
        if ((long)uStack0000000000000058 < 1) {
          if (((*(long *)(unaff_x19 + 0x200) == 0) || (*(long *)(unaff_x19 + 0xd10) == 0)) ||
             (*(long *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) == 0)) {
            func_0x0073c9e4();
            bVar1 = false;
            *(undefined4 *)(unaff_x22 + 0x98) = 0;
            uVar6 = 0x38;
            goto code_r0x0072b3dc;
          }
          *(byte *)(unaff_x22 + 0xac) = *(byte *)(unaff_x22 + 0xac) | 2;
          if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
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
        iVar2 = func_0x0074075c();
        if (iVar2 != 0) {
          func_0x0073c9e4();
          uVar6 = 0x38;
          bVar1 = true;
          goto code_r0x0072b3dc;
        }
        if (in_stack_00000050._7_1_ == '\n') {
          *(long *)(unaff_x22 + 0x48) = *(long *)(unaff_x22 + 0x48) + 1;
          pcVar5 = (char *)func_0x00740a58();
          func_0x00156654();
          func_0x0073c8fc();
          uVar6 = func_0x007738a0();
          if (((int)uVar6 != 0) || (uVar6 = func_0x00754e80(), (int)uVar6 != 0)) {
            bVar1 = true;
            goto code_r0x0072b3dc;
          }
          if ((*pcVar5 == '\r') || (*pcVar5 == '\n')) {
            if ((*(int *)(unaff_x19 + 0x130) != 0x197) || ((char)(&UNK_00001344)[unaff_x19] < '\0'))
            goto code_r0x0072b614;
            *(undefined4 *)(unaff_x22 + 0x98) = 2;
            if (*(long *)(unaff_x22 + 0xa0) == 0) {
              if ((*(byte *)(unaff_x22 + 0xac) & 1) == 0) {
                if (((int)*unaff_x24 < 0) &&
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
              if (((int)*unaff_x24 < 0) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
            }
            else if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
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
            iVar2 = func_0x0077e76c(pcVar5,"WWW-Authenticate:",0x11);
            if (((iVar2 != 0) && (*(int *)(unaff_x19 + 0x130) == 0x191)) ||
               ((iVar2 = func_0x0077e76c(pcVar5,"Proxy-authenticate:",0x13), iVar2 != 0 &&
                (*(int *)(unaff_x19 + 0x130) == 0x197)))) {
              lVar3 = func_0x007529d0(pcVar5);
              if (lVar3 == 0) {
                uVar6 = 0x1b;
              }
              else {
                if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
                   (((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))) &&
                    (0 < *(int *)(*unaff_x21 + 0xc))))) {
                  func_0x0073cbdc();
                }
                uVar6 = func_0x0075350c();
                (*pcRam0000000000a2b5f0)(lVar3);
                if ((int)uVar6 == 0) goto code_r0x0072b238;
              }
              bVar1 = true;
              goto code_r0x0072b3dc;
            }
            iVar2 = func_0x0077e76c(pcVar5,"Content-Length:",0xf);
            if (iVar2 == 0) {
              iVar2 = func_0x007537a0(pcVar5,"Connection:",0xb,"close",5);
              if (iVar2 == 0) {
                iVar2 = func_0x0077e76c(pcVar5,"Transfer-Encoding:",0x12);
                if (iVar2 == 0) {
                  iVar2 = func_0x007537a0(pcVar5,"Proxy-Connection:",0x11,"close",5);
                  if (iVar2 != 0) goto code_r0x0072b214;
                  iVar2 = _strncmp(pcVar5,"HTTP/1.",7);
                  if (((iVar2 == 0) && ((pcVar5[7] & 0xfeU) == 0x30)) &&
                     ((pcVar5[8] == ' ' &&
                      (((((byte)pcVar5[9] - 0x30 < 10 && ((byte)pcVar5[10] - 0x30 < 10)) &&
                        ((byte)pcVar5[0xb] - 0x30 < 10)) && (9 < (byte)pcVar5[0xc] - 0x30)))))) {
                    iVar2 = (uint)(byte)pcVar5[10] * 10 + (uint)(byte)pcVar5[9] * 100 +
                            ((byte)pcVar5[0xb] - 0x14d0);
                    *(int *)(unaff_x19 + 0x130) = iVar2;
                    *(int *)(&UNK_00001354 + unaff_x19) = iVar2;
                  }
                }
                else if (*(int *)(unaff_x19 + 0x130) - 200U < 100) {
                  if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
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
                  iVar2 = func_0x007537a0(pcVar5,"Transfer-Encoding:",0x12,"chunked",7);
                  if (iVar2 != 0) {
                    if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
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
              if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
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
              func_0x0077ed9c(pcVar5 + 0xf,0,10,in_stack_00000018);
            }
code_r0x0072b238:
            func_0x007406b0();
          }
        }
      }
      lVar3 = *in_stack_00000018;
      if (lVar3 == 0) {
        if ((*(byte *)(unaff_x22 + 0xac) & 1) != 0) {
          uVar6 = func_0x00759404();
          if ((int)uVar6 != 0) {
            bVar1 = true;
            goto code_r0x0072b3dc;
          }
          iVar2 = func_0x007593f4();
          if (iVar2 != 0) {
            if (((unaff_x19 != 0) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
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
      *in_stack_00000018 = lVar3 + -1;
    } while (lVar3 + -1 != 0 && 0 < lVar3);
code_r0x0072b614:
    *(undefined4 *)(unaff_x22 + 0x98) = 0;
code_r0x0072b618:
    if (*(int *)(&UNK_00001354 + unaff_x19) - 200U < 100) {
      bVar1 = false;
      uVar6 = 0;
    }
    else {
      uVar6 = func_0x00752aa8();
      bVar1 = false;
    }
  }
code_r0x0072b3dc:
  iVar2 = func_0x0077011c();
  if (iVar2 != 0) {
    uVar6 = 0x2a;
    goto LAB_0072b8f8;
  }
  if ((int)uVar6 != 0) {
    bVar1 = true;
  }
  if (!bVar1) {
    if (*(int *)(unaff_x22 + 0xa8) != 3) goto code_r0x0072b400;
    goto code_r0x0072b44c;
  }
code_r0x0072b778:
  if ((int)uVar6 == 0) {
code_r0x0072b77c:
    (*pcRam0000000000a2b5f0)(*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19))
    ;
    *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    if (unaff_x21[2] == 0) {
      uVar6 = 0;
      *unaff_x20 = 0;
    }
    else {
      bVar1 = *(int *)(unaff_x21[2] + 0xa8) == 4;
      *unaff_x20 = bVar1;
      if (bVar1) {
        *(byte *)((long)unaff_x21 + 0x24) = *(byte *)((long)unaff_x21 + 0x24) | 1;
        func_0x007710b8(unaff_x19 + 0xe8);
        func_0x00773c94();
        func_0x00770948();
        func_0x0077093c();
        func_0x0072bbb8();
      }
      uVar6 = 0;
    }
  }
  else {
LAB_0072b8f8:
    iVar2 = *(int *)(unaff_x22 + 0xa8);
joined_r0x0072b990:
    if (iVar2 != 5) {
      if ((((unaff_x19 != 0) && (*(char *)((long)unaff_x24 + 3) < '\0')) &&
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
      func_0x007406b0();
      *(undefined4 *)(&UNK_00001350 + unaff_x19) = 0;
      (*pcRam0000000000a2b5f0)
                (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
    }
    *unaff_x20 = 0;
  }
  return uVar6;
}

