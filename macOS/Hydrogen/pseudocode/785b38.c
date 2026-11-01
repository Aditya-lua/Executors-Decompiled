
ulong FUN_00785b38(code *param_1)

{
  long lVar1;
  bool bVar2;
  undefined4 uVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  char *pcVar8;
  ulong uVar9;
  undefined1 uVar10;
  char *pcVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  char *unaff_x22;
  char *pcVar14;
  ulong uVar15;
  undefined8 *unaff_x25;
  ulong *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 auVar16 [16];
  long *plStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000048;
  
  (*param_1)();
  *unaff_x25 = 0;
  uVar3 = func_0x0078a0e4();
  uVar15 = 3;
  switch(uVar3) {
  case 0:
    if (((&UNK_00001346)[unaff_x19] & 1) != 0) {
      (*(code *)*unaff_x28)
                (*(undefined8 *)
                  ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                  unaff_x19 + 0x28));
      pcVar8 = "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
               unaff_x19 + 0x28;
      pcVar8[0] = '\0';
      pcVar8[1] = '\0';
      pcVar8[2] = '\0';
      pcVar8[3] = '\0';
      pcVar8[4] = '\0';
      pcVar8[5] = '\0';
      pcVar8[6] = '\0';
      pcVar8[7] = '\0';
    }
    uVar3 = func_0x00789530();
    switch(uVar3) {
    case 0:
      iVar5 = func_0x00789530();
      if (iVar5 != 0) {
        (*(code *)*unaff_x28)(uStack0000000000000030);
        if (iVar5 - 5U < 4) {
          uVar15 = (ulong)*(uint *)(&UNK_008ce6d0 + (long)(int)(iVar5 - 5U) * 4);
        }
        else {
          uVar15 = 3;
        }
        goto LAB_00786320;
      }
      *(undefined8 *)
       ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" + unaff_x19 + 0x28)
           = uStack0000000000000030;
      *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 0x10000;
      if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      iVar5 = func_0x00787dac();
      if (iVar5 != 0) goto code_r0x00785c68;
      if ((*(long *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19) == 0) ||
         ((*(uint *)(&UNK_00001344 + unaff_x19) & 3) != 2)) {
        uVar15 = 3;
        uVar3 = func_0x00789530();
        switch(uVar3) {
        case 0:
          uVar3 = 3;
          if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) & 0x2000) != 0) {
            uVar3 = 4;
          }
          uVar15 = func_0x00742734(*(undefined8 *)
                                    (
                                    "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                    + unaff_x19 + 8),0,&uStack0000000000000030,0,uVar3);
          if ((int)uVar15 != 0) goto LAB_00786320;
          *(undefined8 *)(unaff_x20 + 0x1e8) = uStack0000000000000030;
          uVar15 = func_0x00775ed0(unaff_x19 + 0x1320);
          if ((int)uVar15 != 0) goto LAB_00786320;
          *(uint *)(&UNK_00001344 + unaff_x19) =
               *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 1;
          break;
        default:
          goto LAB_00786320;
        case 5:
          goto code_r0x00785c68;
        case 7:
          goto code_r0x0078631c;
        case 8:
          goto code_r0x00785ea8;
        case 0xc:
          break;
        }
      }
      if ((*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) == 0) ||
         ((*(uint *)(&UNK_00001344 + unaff_x19) & 3) != 2)) {
        uVar3 = func_0x00789530();
        uVar15 = 3;
        switch(uVar3) {
        case 0:
          uVar3 = 3;
          if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) & 0x2000) != 0) {
            uVar3 = 4;
          }
          uVar15 = func_0x00742734(*(undefined8 *)
                                    (
                                    "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                    + unaff_x19),0,&uStack0000000000000030,0,uVar3);
          if ((int)uVar15 != 0) goto LAB_00786320;
          *(undefined8 *)(unaff_x20 + 0x1e0) = uStack0000000000000030;
          uVar15 = func_0x00775ed0((long)&linkedit_data_command_00001318.cmd + unaff_x19);
          *(uint *)(&UNK_00001344 + unaff_x19) =
               *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 1;
          if ((int)uVar15 != 0) goto LAB_00786320;
          break;
        default:
          goto LAB_00786320;
        case 5:
          goto code_r0x00785c68;
        case 7:
          goto code_r0x0078631c;
        case 8:
          goto code_r0x00785ea8;
        case 0xb:
          break;
        }
      }
      uVar3 = func_0x00789530();
      uVar15 = 3;
      switch(uVar3) {
      case 0:
        lVar6 = (*pcRam0000000000a2b600)
                          (*(undefined8 *)
                            ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                            + unaff_x19 + 0x10));
        *(long *)(unaff_x20 + 0x1f0) = lVar6;
        if (lVar6 != 0) goto code_r0x00785e38;
        break;
      default:
        goto LAB_00786320;
      case 5:
        goto code_r0x00785c68;
      case 7:
        break;
      case 8:
        goto code_r0x00785ea8;
      case 0xd:
code_r0x00785e38:
        uVar3 = func_0x00789530();
        switch(uVar3) {
        case 0:
          iVar5 = func_0x00789530();
          if (iVar5 == 0) {
            uVar7 = _strtoul(*(undefined8 *)
                              ((long)&dylib_command_00001170.dylib.current_version + unaff_x19),0,10
                            );
            uVar4 = (uint)*(ushort *)(unaff_x19 + 0xa0c);
            if ((*(ushort *)(unaff_x19 + 0xa0c) == 0) ||
               (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0)) {
              uVar4 = func_0x0078bbc8(uVar7);
            }
            *(uint *)(unaff_x20 + 0x518) = uVar4;
            *(uint *)(unaff_x20 + 0x174) = uVar4;
          }
          else {
            iVar5 = func_0x0077e6f8("file",*unaff_x25);
            if (iVar5 == 0) break;
          }
          func_0x00789530();
          if (*(int *)(unaff_x19 + 0x950) != 0) {
            *(int *)(unaff_x20 + 0x520) = *(int *)(unaff_x19 + 0x950);
          }
          if (*(long *)(unaff_x19 + 0x8d0) != 0) {
            lVar6 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x1f8) = lVar6;
            if (lVar6 == 0) break;
          }
          if (*(long *)(unaff_x19 + 0x8a0) != 0) {
            lVar6 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x200) = lVar6;
            if (lVar6 == 0) break;
          }
          if (*(long *)(unaff_x19 + 0x8a8) == 0) {
            uVar15 = *(ulong *)(unaff_x20 + 0x398);
          }
          else {
            lVar6 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x500) = lVar6;
            if (lVar6 == 0) break;
            uVar15 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffff8000000 |
                     *(ulong *)(unaff_x20 + 0x398) & 0x3ffffff | (*unaff_x27 >> 0x31 & 1) << 0x1a;
            *(ulong *)(unaff_x20 + 0x398) = uVar15;
          }
          if (((uint)uVar15 >> 2 & 1) == 0) {
code_r0x00785fe4:
            if (*(long *)(unaff_x19 + 0x810) == 0) {
              pcVar8 = (char *)0x0;
            }
            else {
              pcVar8 = (char *)(*pcRam0000000000a2b600)();
              if (pcVar8 == (char *)0x0) {
                func_0x0073c9e4();
                goto code_r0x0078606c;
              }
            }
            if (*(long *)(unaff_x19 + 0x818) == 0) {
              pcVar11 = (char *)0x0;
            }
            else {
              pcVar11 = (char *)(*pcRam0000000000a2b600)();
              if (pcVar11 == (char *)0x0) {
                func_0x0073c9e4();
                uVar15 = 0x1b;
                goto code_r0x0078629c;
              }
            }
            if (*(long *)(unaff_x19 + 0x870) == 0) {
              lVar6 = func_0x0074cf0c("no_proxy");
              if ((((lVar6 != 0) || (lVar6 = func_0x0074cf0c("NO_PROXY"), lVar6 != 0)) &&
                  (*(char *)((long)unaff_x27 + 3) < '\0')) &&
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
              lVar6 = 0;
            }
            lVar1 = lVar6;
            if (*(long *)(unaff_x19 + 0x870) != 0) {
              lVar1 = *(long *)(unaff_x19 + 0x870);
            }
            iVar5 = func_0x0076d0c0(*(undefined8 *)(unaff_x20 + 0x68),lVar1);
            if (iVar5 == 0) {
              if (pcVar8 == (char *)0x0 && pcVar11 == (char *)0x0) {
                func_0x00764560(&uStack0000000000000030,0x14,"%s_proxy");
                pcVar8 = (char *)func_0x0074cf0c(&uStack0000000000000030);
                if (pcVar8 == (char *)0x0) {
                  iVar5 = func_0x0077e6f8("http_proxy",&uStack0000000000000030);
                  if (iVar5 == 0) {
                    func_0x0077e7f8(&uStack0000000000000030,&uStack0000000000000030,0x14);
                    pcVar8 = (char *)func_0x0074cf0c(&uStack0000000000000030);
                    if (pcVar8 != (char *)0x0) goto code_r0x00786178;
                  }
                  iVar5 = func_0x0077e6f8("ws_proxy",&uStack0000000000000030);
                  if (iVar5 == 0) {
                    iVar5 = func_0x0077e6f8("wss_proxy",&uStack0000000000000030);
                    if (iVar5 != 0) {
                      pcVar8 = (char *)func_0x0074cf0c("https_proxy");
                      if (pcVar8 != (char *)0x0) goto code_r0x00786178;
                      pcVar8 = (char *)func_0x0074cf0c("HTTPS_PROXY");
                      goto joined_r0x00786600;
                    }
                  }
                  else {
                    pcVar8 = (char *)func_0x0074cf0c("http_proxy");
joined_r0x00786600:
                    if (pcVar8 != (char *)0x0) goto code_r0x00786178;
                  }
                  pcVar8 = (char *)func_0x0074cf0c("all_proxy");
                  if ((pcVar8 == (char *)0x0) &&
                     (pcVar8 = (char *)func_0x0074cf0c("ALL_PROXY"), pcVar8 == (char *)0x0))
                  goto code_r0x007861a8;
                }
code_r0x00786178:
                if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x19 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
              }
code_r0x007861a8:
              (*(code *)*unaff_x28)(lVar6);
              if ((pcVar8 != (char *)0x0) &&
                 (((*(long *)(unaff_x20 + 0x500) != 0 || (*pcVar8 == '\0')) ||
                  ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)))) {
                (*(code *)*unaff_x28)(pcVar8);
                pcVar8 = (char *)0x0;
              }
              if (pcVar11 == (char *)0x0) {
code_r0x00786210:
                if (pcVar8 == (char *)0x0) goto code_r0x00786258;
                pcVar11 = (char *)0x0;
                bVar2 = false;
code_r0x00786228:
                uVar15 = func_0x00787f68();
                (*(code *)*unaff_x28)(pcVar8);
                if ((int)uVar15 != 0) {
                  pcVar8 = (char *)0x0;
                  goto code_r0x0078629c;
                }
                if (bVar2) goto code_r0x007864b0;
              }
              else {
                if ((*pcVar11 == '\0') ||
                   ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)) {
                  (*(code *)*unaff_x28)(pcVar11);
                  goto code_r0x00786210;
                }
                if (pcVar8 != (char *)0x0) {
                  bVar2 = true;
                  goto code_r0x00786228;
                }
code_r0x007864b0:
                uVar15 = func_0x00787f68();
                (*(code *)*unaff_x28)(pcVar11);
                if ((int)uVar15 != 0) {
                  pcVar8 = (char *)0x0;
                  pcVar11 = (char *)0x0;
                  goto code_r0x0078629c;
                }
              }
              plStack0000000000000018 = (long *)(unaff_x20 + 0xe0);
              if (*plStack0000000000000018 == 0) {
                uVar9 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffff6;
                *(ulong *)(unaff_x20 + 0x398) = uVar9;
                if (*(long *)(unaff_x20 + 0xa8) == 0) goto code_r0x00786658;
                if (*(long *)(unaff_x20 + 0xd0) != 0) goto code_r0x00786650;
                *(undefined8 *)(unaff_x20 + 0xd0) = *(undefined8 *)(unaff_x20 + 0x108);
                *(undefined8 *)(unaff_x20 + 0x108) = 0;
                (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0xd8));
                *(undefined8 *)(unaff_x20 + 0xd8) = *(undefined8 *)(unaff_x20 + 0x110);
                *(undefined8 *)(unaff_x20 + 0x110) = 0;
                uVar9 = *(ulong *)(unaff_x20 + 0x398) | 2;
              }
              else {
                uVar9 = *(ulong *)(unaff_x20 + 0x398);
                if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) & 0xc0000003) == 0) {
                  if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) >> 3 & 1) == 0) ||
                     (((uint)uVar9 >> 3 & 1) != 0)) {
                    uVar9 = uVar9 | 8;
                  }
                  else {
                    *(undefined **)(unaff_x20 + 0x3a0) = &UNK_00a1e860;
                  }
                }
                uVar9 = uVar9 | 1;
                if (*(long *)(unaff_x20 + 0xa8) == 0) {
code_r0x00786658:
                  uVar9 = uVar9 & 0xfffffffffffffffd;
                }
                else {
code_r0x00786650:
                  uVar9 = uVar9 | 2;
                }
              }
            }
            else {
              (*(code *)*unaff_x28)(pcVar8);
              (*(code *)*unaff_x28)(pcVar11);
              (*(code *)*unaff_x28)(lVar6);
code_r0x00786258:
              uVar9 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffffc;
            }
            uVar13 = (ulong)(uint)((int)uVar9 << 3) & 0x10;
            if ((uVar9 & 1) != 0) {
              uVar13 = 0x10;
            }
            *(ulong *)(unaff_x20 + 0x398) = uVar13 | uVar9 & 0xffffffffffffffef;
            pcVar8 = (char *)0x0;
            pcVar11 = (char *)0x0;
            uVar15 = 0;
            if (uVar13 == 0) {
              *(ulong *)(unaff_x20 + 0x398) = uVar9 & 0xffffffffffffffe0;
              *(undefined1 *)(unaff_x20 + 0x104) = 0;
            }
          }
          else {
            pcVar11 = *(char **)((long)&linkedit_data_command_00001328.dataoff + unaff_x19);
            pcVar14 = *(char **)(&UNK_00001338 + unaff_x19);
            pcVar8 = "";
            if (pcVar11 != (char *)0x0) {
              pcVar8 = pcVar11;
            }
            lVar6 = (*pcRam0000000000a2b600)(pcVar8);
            *(long *)(unaff_x20 + 0x108) = lVar6;
            if (lVar6 == 0) {
              pcVar8 = (char *)0x0;
code_r0x0078606c:
              pcVar11 = (char *)0x0;
              uVar15 = 0x1b;
            }
            else {
              pcVar8 = "";
              if (pcVar14 != (char *)0x0) {
                pcVar8 = pcVar14;
              }
              lVar6 = (*pcRam0000000000a2b600)(pcVar8);
              *(long *)(unaff_x20 + 0x110) = lVar6;
              if (lVar6 != 0) goto code_r0x00785fe4;
              (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0x108));
              pcVar8 = (char *)0x0;
              pcVar11 = (char *)0x0;
              *(undefined8 *)(unaff_x20 + 0x108) = 0;
              uVar15 = 0x1b;
            }
          }
code_r0x0078629c:
          (*(code *)*unaff_x28)(pcVar11);
          (*(code *)*unaff_x28)(pcVar8);
          if ((int)uVar15 != 0) goto LAB_00786320;
          if (((*(byte *)(*(long *)(unaff_x20 + 0x3a8) + 0x9c) & 1) != 0) &&
             ((*(ulong *)(unaff_x20 + 0x398) & 1) != 0)) {
            *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 8;
          }
          if (*(ushort *)(unaff_x19 + 0xa0c) == 0) goto code_r0x00786388;
          if (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0) goto code_r0x00786388;
          *(uint *)(unaff_x20 + 0x518) = (uint)*(ushort *)(unaff_x19 + 0xa0c);
          func_0x00764560(&uStack0000000000000030,0x10,"%d");
          iVar5 = func_0x0078a0e4(*(undefined8 *)
                                   (
                                   "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                   + unaff_x19 + 0x48),6,&uStack0000000000000030,0);
          if (iVar5 == 0) goto code_r0x00786388;
          break;
        default:
          goto LAB_00786320;
        case 5:
          goto code_r0x00785c68;
        case 7:
          break;
        case 8:
          goto code_r0x00785ea8;
        }
      }
      break;
    default:
      goto LAB_00786320;
    case 5:
      goto code_r0x00785c68;
    case 7:
      break;
    case 8:
      goto code_r0x00785ea8;
    }
  case 7:
code_r0x0078631c:
    uVar15 = 0x1b;
    break;
  default:
    break;
  case 5:
code_r0x00785c68:
    uVar15 = 1;
    break;
  case 8:
code_r0x00785ea8:
    uVar15 = 0x43;
  }
LAB_00786320:
  do {
    if ((((int)uVar15 != 0x59) && (unaff_x20 != 0)) && ((int)uVar15 != 0)) {
      func_0x0076891c();
      func_0x00732ed0();
    }
code_r0x00786348:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return uVar15;
    }
    ___stack_chk_fail();
code_r0x00786388:
    uVar15 = func_0x00786b48();
    if ((((int)uVar15 != 0) || (uVar15 = func_0x00786f04(), (int)uVar15 != 0)) ||
       (uVar15 = func_0x00786fc4(), (int)uVar15 != 0)) goto LAB_00786320;
    uVar15 = *(ulong *)(unaff_x20 + 0x398);
    if ((uVar15 & 1) != 0) {
      uVar15 = func_0x0075af14(unaff_x20 + 0xe0);
      if ((int)uVar15 != 0) goto LAB_00786320;
      uVar15 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar15 >> 1 & 1) != 0) {
      uVar15 = func_0x0075af14(unaff_x20 + 0xa8);
      if ((int)uVar15 != 0) goto LAB_00786320;
      uVar15 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar15 >> 8 & 1) != 0) {
      uVar15 = func_0x0075af14(unaff_x20 + 0x88);
      if ((int)uVar15 != 0) goto LAB_00786320;
      uVar15 = *(ulong *)(unaff_x20 + 0x398);
      if (((uint)uVar15 >> 8 & 1) != 0) {
        iVar5 = func_0x0077e6f8(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x68))
        ;
        uVar15 = *(ulong *)(unaff_x20 + 0x398);
        if (iVar5 != 0) {
          uVar15 = uVar15 & 0xfffffffffffffeff;
          *(ulong *)(unaff_x20 + 0x398) = uVar15;
        }
      }
    }
    if ((((uint)uVar15 >> 9 & 1) != 0) &&
       (*(int *)(unaff_x20 + 0x51c) == *(int *)(unaff_x20 + 0x518))) {
      uVar15 = uVar15 & 0xfffffffffffffdff;
      *(ulong *)(unaff_x20 + 0x398) = uVar15;
    }
    if (((uVar15 & 0x300) != 0) && ((uVar15 & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = uVar15 | 8;
    }
    uVar15 = func_0x00787638();
    if ((int)uVar15 != 0) goto LAB_00786320;
    puVar12 = *(undefined8 **)(unaff_x20 + 0x3a0);
    if ((*(byte *)((long)puVar12 + 0x9c) >> 4 & 1) == 0) {
      *(undefined **)(unaff_x20 + 0x240) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 0x250) = &DAT_00730f64;
      *(undefined **)(unaff_x20 + 0x248) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 600) = &DAT_00730f64;
      *(ulong *)(unaff_x20 + 0x398) =
           *(ulong *)(unaff_x20 + 0x398) & 0xffffffffff000000 |
           *(ulong *)(unaff_x20 + 0x398) & 0x7fffff | (*unaff_x27 >> 0x2a & 1) << 0x17;
      uVar15 = func_0x007931a8();
      if ((int)uVar15 != 0) goto LAB_00786320;
      func_0x00734324();
      uVar15 = *unaff_x27;
      if ((uVar15 >> 0x21 & 1) != 0) {
        if (((uVar15 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) goto code_r0x0078672c;
code_r0x007867a4:
        if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) & 1) != 0) &&
           ((*(byte *)((long)unaff_x27 + 5) >> 3 & 1) != 0)) {
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000000;
        }
        if (in_stack_00000020._6_1_ == '\0') {
          iVar5 = func_0x00732b50();
          if (iVar5 == 2) {
            if (-1 < *(long *)(unaff_x19 + 0x9e0)) {
              if (((int)*unaff_x27 < 0) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
              goto code_r0x00786894;
            }
            if ((int)*unaff_x27 < 0) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar5 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x007868f0;
              }
              goto code_r0x007868fc;
            }
          }
          else {
            if (iVar5 != 1) {
code_r0x00786894:
              uVar15 = func_0x00793294();
              if ((int)uVar15 == 0) {
                func_0x00768a04();
                uVar15 = func_0x007331a0();
                if ((int)uVar15 == 0) goto code_r0x00786924;
              }
              goto LAB_00786320;
            }
            if (*(char *)((long)unaff_x27 + 3) < '\0') {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar5 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
joined_r0x007868f0:
                if (iVar5 < 1) goto code_r0x007867cc;
              }
code_r0x007868fc:
              func_0x0073cab8();
            }
          }
        }
code_r0x007867cc:
        if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00784acc();
        unaff_x20 = 0;
        uVar15 = 0x59;
        goto LAB_00786320;
      }
      if ((uVar15 & 1) != 0) goto code_r0x007867a4;
code_r0x0078672c:
      iVar5 = func_0x00787810();
      if (iVar5 == 0) goto code_r0x007867a4;
      func_0x007878ec();
      unaff_x20 = in_stack_00000028;
      if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
code_r0x00786924:
      func_0x00786a54();
      uVar15 = func_0x00787738();
      if ((int)uVar15 != 0) goto LAB_00786320;
      if ((*(byte *)(unaff_x20 + 0x398) >> 6 & 1) == 0) {
        uVar15 = func_0x00787a58();
        if ((int)uVar15 != 0) goto LAB_00786320;
      }
      else {
        *unaff_x22 = '\0';
      }
      puVar12 = *(undefined8 **)(unaff_x20 + 0x3a0);
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar12;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar12 + 0x94) & 0x3ffffff;
      *(byte *)((long)unaff_x27 + 0xa2a) =
           *(byte *)(unaff_x20 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
      uVar15 = func_0x00731ca0();
    }
    else {
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar12;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar12 + 0x94) & 0x3ffffff;
      uVar9 = (*(code *)puVar12[5])();
      if ((int)uVar9 == 0) {
        func_0x00768a04();
        uVar15 = func_0x007331a0();
        if ((int)uVar15 == 0) {
          uVar15 = func_0x00787738();
          if ((int)uVar15 == 0) {
            func_0x00783c98();
            goto code_r0x007866c0;
          }
          (**(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x18))();
        }
      }
      else {
code_r0x007866c0:
        func_0x00786a54();
        uVar15 = uVar9;
      }
    }
    if ((int)uVar15 != 0) goto LAB_00786320;
    uVar15 = func_0x006f4058(unaff_x20 + 0x3c8);
    if (1 < uVar15) {
      uVar15 = 0;
      *unaff_x21 = 1;
      goto code_r0x00786348;
    }
    if (*unaff_x22 != '\0') {
      uVar15 = 0;
      goto code_r0x00786348;
    }
    unaff_x22 = *(char **)(unaff_x19 + 0x18);
    func_0x007706e4();
    if ((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x9c) >> 4 & 1) == 0) {
      auVar16 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar16;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar15 = func_0x00736d28(), (int)uVar15 == 0)
         ) {
        uVar15 = func_0x0074e91c();
      }
      uVar10 = 0;
    }
    else {
      uVar15 = 0;
      uVar10 = 1;
    }
    *unaff_x21 = uVar10;
  } while( true );
}

