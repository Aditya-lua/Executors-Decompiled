
ulong FUN_00785940(void)

{
  undefined8 *puVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  undefined4 uVar5;
  uint uVar6;
  long lVar7;
  undefined8 uVar8;
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
  char *pcVar15;
  undefined8 unaff_x24;
  ulong uVar16;
  undefined8 uVar17;
  ulong unaff_x25;
  undefined8 uVar18;
  ulong *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 auVar19 [16];
  long *plStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000048;
  
  (*(code *)*unaff_x28)
            (*(undefined8 *)
              ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
              unaff_x19 + 0x28));
  uVar6 = *(uint *)(&UNK_00001344 + unaff_x19);
  *(undefined8 *)
   ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" + unaff_x19 + 0x28) =
       unaff_x24;
  *(uint *)(&UNK_00001344 + unaff_x19) = uVar6 | 0x10000;
  if ((unaff_x25 & 1) == 0) {
    iVar4 = func_0x0078a0e4();
    if (iVar4 == 0) {
      uVar5 = func_0x00789530();
      uVar16 = 3;
      switch(uVar5) {
      case 0:
        uVar6 = *(uint *)(&UNK_00001344 + unaff_x19);
        if ((uVar6 >> 0x10 & 1) != 0) {
          (*(code *)*unaff_x28)
                    (*(undefined8 *)
                      ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                      unaff_x19 + 0x28));
          uVar6 = *(uint *)(&UNK_00001344 + unaff_x19);
        }
        *(undefined8 *)
         ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" + unaff_x19 + 0x28
         ) = uStack0000000000000030;
        *(uint *)(&UNK_00001344 + unaff_x19) = uVar6 | 0x10000;
        goto LAB_00785878;
      default:
        goto LAB_00786320;
      case 5:
        goto code_r0x00785c68;
      case 7:
        goto code_r0x0078631c;
      case 8:
        goto code_r0x00785ea8;
      }
    }
    func_0x0077ea64();
    func_0x0073c9e4();
joined_r0x00785c04:
    if (iVar4 - 5U < 4) {
      uVar16 = (ulong)*(uint *)(&UNK_008ce6d0 + (long)(int)(iVar4 - 5U) * 4);
    }
    else {
      uVar16 = 3;
    }
    goto LAB_00786320;
  }
LAB_00785878:
  puVar12 = (undefined8 *)((long)&dylib_command_00001170.cmd + unaff_x19);
  uVar5 = func_0x00789530();
  uVar16 = 3;
  switch(uVar5) {
  case 0:
    puVar1 = (undefined8 *)((long)&dylib_command_00001170.dylib.name.offset + unaff_x19);
    iVar4 = func_0x00789530();
    if (iVar4 == 0) {
      pcVar15 = (char *)*puVar1;
      uVar16 = _strlen(pcVar15);
      if (0xffff < uVar16) {
        func_0x0073c9e4();
        uVar16 = 3;
        goto LAB_00786320;
      }
    }
    else {
      iVar4 = func_0x0077e6f8("file",*puVar12);
      if (iVar4 == 0) break;
      pcVar15 = (char *)*puVar1;
    }
    pcVar11 = pcVar15;
    if ((pcVar15 != (char *)0x0) && (*pcVar15 == '[')) {
      *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x400;
      pcVar11 = pcVar15 + 1;
      lVar7 = _strlen(pcVar11);
      pcVar15[lVar7] = '\0';
      func_0x00787c94();
    }
    pcVar15 = "";
    if (pcVar11 != (char *)0x0) {
      pcVar15 = pcVar11;
    }
    lVar7 = (*pcRam0000000000a2b600)(pcVar15);
    *(long *)(unaff_x20 + 0x58) = lVar7;
    if (lVar7 != 0) {
      *(long *)(unaff_x20 + 0x68) = lVar7;
      uVar16 = func_0x0075af14();
      if ((int)uVar16 != 0) goto LAB_00786320;
      if ((*(long *)(unaff_x19 + 0xa30) != 0) &&
         (iVar4 = func_0x0077e6f8("http",*puVar12), iVar4 != 0)) {
        uVar17 = *(undefined8 *)(unaff_x19 + 0xa30);
        uVar18 = *(undefined8 *)(unaff_x20 + 0x68);
        uVar8 = _strlen(uVar18);
        lVar7 = func_0x00750c44(uVar17,uVar18,uVar8,1);
        if (lVar7 == 0) goto code_r0x00785c54;
        (*(code *)*unaff_x28)(*puVar12);
        *puVar12 = 0;
        uVar5 = func_0x0078a0e4();
        uVar16 = 3;
        switch(uVar5) {
        case 0:
          if (((&UNK_00001346)[unaff_x19] & 1) != 0) {
            (*(code *)*unaff_x28)
                      (*(undefined8 *)
                        ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                        unaff_x19 + 0x28));
            pcVar15 = "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                      unaff_x19 + 0x28;
            pcVar15[0] = '\0';
            pcVar15[1] = '\0';
            pcVar15[2] = '\0';
            pcVar15[3] = '\0';
            pcVar15[4] = '\0';
            pcVar15[5] = '\0';
            pcVar15[6] = '\0';
            pcVar15[7] = '\0';
          }
          uVar5 = func_0x00789530();
          switch(uVar5) {
          case 0:
            iVar4 = func_0x00789530();
            if (iVar4 != 0) {
              (*(code *)*unaff_x28)(uStack0000000000000030);
              goto joined_r0x00785c04;
            }
            *(undefined8 *)
             ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
             unaff_x19 + 0x28) = uStack0000000000000030;
            *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 0x10000;
            if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            break;
          default:
            goto LAB_00786320;
          case 5:
            goto code_r0x00785c68;
          case 7:
            goto code_r0x0078631c;
          case 8:
            goto code_r0x00785ea8;
          }
        default:
          goto LAB_00786320;
        case 5:
          goto code_r0x00785c68;
        case 7:
          goto code_r0x0078631c;
        case 8:
          goto code_r0x00785ea8;
        }
      }
code_r0x00785c54:
      iVar4 = func_0x00787dac();
      if (iVar4 != 0) {
code_r0x00785c68:
        uVar16 = 1;
        goto LAB_00786320;
      }
      if ((*(long *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19) == 0) ||
         ((*(uint *)(&UNK_00001344 + unaff_x19) & 3) != 2)) {
        uVar16 = 3;
        uVar5 = func_0x00789530();
        switch(uVar5) {
        case 0:
          uVar5 = 3;
          if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) & 0x2000) != 0) {
            uVar5 = 4;
          }
          uVar16 = func_0x00742734(*(undefined8 *)
                                    (
                                    "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                    + unaff_x19 + 8),0,&uStack0000000000000030,0,uVar5);
          if ((int)uVar16 != 0) goto LAB_00786320;
          *(undefined8 *)(unaff_x20 + 0x1e8) = uStack0000000000000030;
          uVar16 = func_0x00775ed0(unaff_x19 + 0x1320);
          if ((int)uVar16 != 0) goto LAB_00786320;
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
        uVar5 = func_0x00789530();
        uVar16 = 3;
        switch(uVar5) {
        case 0:
          uVar5 = 3;
          if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) & 0x2000) != 0) {
            uVar5 = 4;
          }
          uVar16 = func_0x00742734(*(undefined8 *)
                                    (
                                    "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                    + unaff_x19),0,&uStack0000000000000030,0,uVar5);
          if ((int)uVar16 != 0) goto LAB_00786320;
          *(undefined8 *)(unaff_x20 + 0x1e0) = uStack0000000000000030;
          uVar16 = func_0x00775ed0((long)&linkedit_data_command_00001318.cmd + unaff_x19);
          *(uint *)(&UNK_00001344 + unaff_x19) =
               *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 1;
          if ((int)uVar16 != 0) goto LAB_00786320;
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
      uVar5 = func_0x00789530();
      uVar16 = 3;
      switch(uVar5) {
      case 0:
        lVar7 = (*pcRam0000000000a2b600)
                          (*(undefined8 *)
                            ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                            + unaff_x19 + 0x10));
        *(long *)(unaff_x20 + 0x1f0) = lVar7;
        if (lVar7 != 0) goto code_r0x00785e38;
        break;
      default:
        goto LAB_00786320;
      case 5:
        goto code_r0x00785c68;
      case 7:
        break;
      case 8:
code_r0x00785ea8:
        uVar16 = 0x43;
        goto LAB_00786320;
      case 0xd:
code_r0x00785e38:
        uVar5 = func_0x00789530();
        switch(uVar5) {
        case 0:
          iVar4 = func_0x00789530();
          if (iVar4 == 0) {
            uVar8 = _strtoul(*(undefined8 *)
                              ((long)&dylib_command_00001170.dylib.current_version + unaff_x19),0,10
                            );
            uVar6 = (uint)*(ushort *)(unaff_x19 + 0xa0c);
            if ((*(ushort *)(unaff_x19 + 0xa0c) == 0) ||
               (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0)) {
              uVar6 = func_0x0078bbc8(uVar8);
            }
            *(uint *)(unaff_x20 + 0x518) = uVar6;
            *(uint *)(unaff_x20 + 0x174) = uVar6;
          }
          else {
            iVar4 = func_0x0077e6f8("file",*puVar12);
            if (iVar4 == 0) break;
          }
          func_0x00789530();
          if (*(int *)(unaff_x19 + 0x950) != 0) {
            *(int *)(unaff_x20 + 0x520) = *(int *)(unaff_x19 + 0x950);
          }
          if (*(long *)(unaff_x19 + 0x8d0) != 0) {
            lVar7 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x1f8) = lVar7;
            if (lVar7 == 0) break;
          }
          if (*(long *)(unaff_x19 + 0x8a0) != 0) {
            lVar7 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x200) = lVar7;
            if (lVar7 == 0) break;
          }
          if (*(long *)(unaff_x19 + 0x8a8) == 0) {
            uVar16 = *(ulong *)(unaff_x20 + 0x398);
          }
          else {
            lVar7 = (*pcRam0000000000a2b600)();
            *(long *)(unaff_x20 + 0x500) = lVar7;
            if (lVar7 == 0) break;
            uVar16 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffff8000000 |
                     *(ulong *)(unaff_x20 + 0x398) & 0x3ffffff | (*unaff_x27 >> 0x31 & 1) << 0x1a;
            *(ulong *)(unaff_x20 + 0x398) = uVar16;
          }
          if (((uint)uVar16 >> 2 & 1) == 0) {
code_r0x00785fe4:
            if (*(long *)(unaff_x19 + 0x810) == 0) {
              pcVar15 = (char *)0x0;
            }
            else {
              pcVar15 = (char *)(*pcRam0000000000a2b600)();
              if (pcVar15 == (char *)0x0) {
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
                uVar16 = 0x1b;
                goto code_r0x0078629c;
              }
            }
            if (*(long *)(unaff_x19 + 0x870) == 0) {
              lVar7 = func_0x0074cf0c("no_proxy");
              if ((((lVar7 != 0) || (lVar7 = func_0x0074cf0c("NO_PROXY"), lVar7 != 0)) &&
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
              lVar7 = 0;
            }
            lVar2 = lVar7;
            if (*(long *)(unaff_x19 + 0x870) != 0) {
              lVar2 = *(long *)(unaff_x19 + 0x870);
            }
            iVar4 = func_0x0076d0c0(*(undefined8 *)(unaff_x20 + 0x68),lVar2);
            if (iVar4 == 0) {
              if (pcVar15 == (char *)0x0 && pcVar11 == (char *)0x0) {
                func_0x00764560(&uStack0000000000000030,0x14,"%s_proxy");
                pcVar15 = (char *)func_0x0074cf0c(&uStack0000000000000030);
                if (pcVar15 == (char *)0x0) {
                  iVar4 = func_0x0077e6f8("http_proxy",&uStack0000000000000030);
                  if (iVar4 == 0) {
                    func_0x0077e7f8(&uStack0000000000000030,&uStack0000000000000030,0x14);
                    pcVar15 = (char *)func_0x0074cf0c(&uStack0000000000000030);
                    if (pcVar15 != (char *)0x0) goto code_r0x00786178;
                  }
                  iVar4 = func_0x0077e6f8("ws_proxy",&uStack0000000000000030);
                  if (iVar4 == 0) {
                    iVar4 = func_0x0077e6f8("wss_proxy",&uStack0000000000000030);
                    if (iVar4 != 0) {
                      pcVar15 = (char *)func_0x0074cf0c("https_proxy");
                      if (pcVar15 != (char *)0x0) goto code_r0x00786178;
                      pcVar15 = (char *)func_0x0074cf0c("HTTPS_PROXY");
                      goto joined_r0x00786600;
                    }
                  }
                  else {
                    pcVar15 = (char *)func_0x0074cf0c("http_proxy");
joined_r0x00786600:
                    if (pcVar15 != (char *)0x0) goto code_r0x00786178;
                  }
                  pcVar15 = (char *)func_0x0074cf0c("all_proxy");
                  if ((pcVar15 == (char *)0x0) &&
                     (pcVar15 = (char *)func_0x0074cf0c("ALL_PROXY"), pcVar15 == (char *)0x0))
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
              (*(code *)*unaff_x28)(lVar7);
              if ((pcVar15 != (char *)0x0) &&
                 (((*(long *)(unaff_x20 + 0x500) != 0 || (*pcVar15 == '\0')) ||
                  ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)))) {
                (*(code *)*unaff_x28)(pcVar15);
                pcVar15 = (char *)0x0;
              }
              if (pcVar11 == (char *)0x0) {
code_r0x00786210:
                if (pcVar15 == (char *)0x0) goto code_r0x00786258;
                pcVar11 = (char *)0x0;
                bVar3 = false;
code_r0x00786228:
                uVar16 = func_0x00787f68();
                (*(code *)*unaff_x28)(pcVar15);
                if ((int)uVar16 != 0) {
                  pcVar15 = (char *)0x0;
                  goto code_r0x0078629c;
                }
                if (bVar3) goto code_r0x007864b0;
              }
              else {
                if ((*pcVar11 == '\0') ||
                   ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)) {
                  (*(code *)*unaff_x28)(pcVar11);
                  goto code_r0x00786210;
                }
                if (pcVar15 != (char *)0x0) {
                  bVar3 = true;
                  goto code_r0x00786228;
                }
code_r0x007864b0:
                uVar16 = func_0x00787f68();
                (*(code *)*unaff_x28)(pcVar11);
                if ((int)uVar16 != 0) {
                  pcVar15 = (char *)0x0;
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
              (*(code *)*unaff_x28)(pcVar15);
              (*(code *)*unaff_x28)(pcVar11);
              (*(code *)*unaff_x28)(lVar7);
code_r0x00786258:
              uVar9 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffffc;
            }
            uVar13 = (ulong)(uint)((int)uVar9 << 3) & 0x10;
            if ((uVar9 & 1) != 0) {
              uVar13 = 0x10;
            }
            *(ulong *)(unaff_x20 + 0x398) = uVar13 | uVar9 & 0xffffffffffffffef;
            pcVar15 = (char *)0x0;
            pcVar11 = (char *)0x0;
            uVar16 = 0;
            if (uVar13 == 0) {
              *(ulong *)(unaff_x20 + 0x398) = uVar9 & 0xffffffffffffffe0;
              *(undefined1 *)(unaff_x20 + 0x104) = 0;
            }
          }
          else {
            pcVar11 = *(char **)((long)&linkedit_data_command_00001328.dataoff + unaff_x19);
            pcVar14 = *(char **)(&UNK_00001338 + unaff_x19);
            pcVar15 = "";
            if (pcVar11 != (char *)0x0) {
              pcVar15 = pcVar11;
            }
            lVar7 = (*pcRam0000000000a2b600)(pcVar15);
            *(long *)(unaff_x20 + 0x108) = lVar7;
            if (lVar7 == 0) {
              pcVar15 = (char *)0x0;
code_r0x0078606c:
              pcVar11 = (char *)0x0;
              uVar16 = 0x1b;
            }
            else {
              pcVar15 = "";
              if (pcVar14 != (char *)0x0) {
                pcVar15 = pcVar14;
              }
              lVar7 = (*pcRam0000000000a2b600)(pcVar15);
              *(long *)(unaff_x20 + 0x110) = lVar7;
              if (lVar7 != 0) goto code_r0x00785fe4;
              (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0x108));
              pcVar15 = (char *)0x0;
              pcVar11 = (char *)0x0;
              *(undefined8 *)(unaff_x20 + 0x108) = 0;
              uVar16 = 0x1b;
            }
          }
code_r0x0078629c:
          (*(code *)*unaff_x28)(pcVar11);
          (*(code *)*unaff_x28)(pcVar15);
          if ((int)uVar16 != 0) goto LAB_00786320;
          if (((*(byte *)(*(long *)(unaff_x20 + 0x3a8) + 0x9c) & 1) != 0) &&
             ((*(ulong *)(unaff_x20 + 0x398) & 1) != 0)) {
            *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 8;
          }
          if (*(ushort *)(unaff_x19 + 0xa0c) == 0) goto code_r0x00786388;
          if (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0) goto code_r0x00786388;
          *(uint *)(unaff_x20 + 0x518) = (uint)*(ushort *)(unaff_x19 + 0xa0c);
          func_0x00764560(&uStack0000000000000030,0x10,"%d");
          iVar4 = func_0x0078a0e4(*(undefined8 *)
                                   (
                                   "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                   + unaff_x19 + 0x48),6,&uStack0000000000000030,0);
          if (iVar4 == 0) goto code_r0x00786388;
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
code_r0x0078631c:
  uVar16 = 0x1b;
LAB_00786320:
  do {
    if ((((int)uVar16 != 0x59) && (unaff_x20 != 0)) && ((int)uVar16 != 0)) {
      func_0x0076891c();
      func_0x00732ed0();
    }
code_r0x00786348:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return uVar16;
    }
    ___stack_chk_fail();
code_r0x00786388:
    uVar16 = func_0x00786b48();
    if ((((int)uVar16 != 0) || (uVar16 = func_0x00786f04(), (int)uVar16 != 0)) ||
       (uVar16 = func_0x00786fc4(), (int)uVar16 != 0)) goto LAB_00786320;
    uVar16 = *(ulong *)(unaff_x20 + 0x398);
    if ((uVar16 & 1) != 0) {
      uVar16 = func_0x0075af14(unaff_x20 + 0xe0);
      if ((int)uVar16 != 0) goto LAB_00786320;
      uVar16 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar16 >> 1 & 1) != 0) {
      uVar16 = func_0x0075af14(unaff_x20 + 0xa8);
      if ((int)uVar16 != 0) goto LAB_00786320;
      uVar16 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar16 >> 8 & 1) != 0) {
      uVar16 = func_0x0075af14(unaff_x20 + 0x88);
      if ((int)uVar16 != 0) goto LAB_00786320;
      uVar16 = *(ulong *)(unaff_x20 + 0x398);
      if (((uint)uVar16 >> 8 & 1) != 0) {
        iVar4 = func_0x0077e6f8(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x68))
        ;
        uVar16 = *(ulong *)(unaff_x20 + 0x398);
        if (iVar4 != 0) {
          uVar16 = uVar16 & 0xfffffffffffffeff;
          *(ulong *)(unaff_x20 + 0x398) = uVar16;
        }
      }
    }
    if ((((uint)uVar16 >> 9 & 1) != 0) &&
       (*(int *)(unaff_x20 + 0x51c) == *(int *)(unaff_x20 + 0x518))) {
      uVar16 = uVar16 & 0xfffffffffffffdff;
      *(ulong *)(unaff_x20 + 0x398) = uVar16;
    }
    if (((uVar16 & 0x300) != 0) && ((uVar16 & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = uVar16 | 8;
    }
    uVar16 = func_0x00787638();
    if ((int)uVar16 != 0) goto LAB_00786320;
    puVar12 = *(undefined8 **)(unaff_x20 + 0x3a0);
    if ((*(byte *)((long)puVar12 + 0x9c) >> 4 & 1) == 0) {
      *(undefined **)(unaff_x20 + 0x240) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 0x250) = &DAT_00730f64;
      *(undefined **)(unaff_x20 + 0x248) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 600) = &DAT_00730f64;
      *(ulong *)(unaff_x20 + 0x398) =
           *(ulong *)(unaff_x20 + 0x398) & 0xffffffffff000000 |
           *(ulong *)(unaff_x20 + 0x398) & 0x7fffff | (*unaff_x27 >> 0x2a & 1) << 0x17;
      uVar16 = func_0x007931a8();
      if ((int)uVar16 != 0) goto LAB_00786320;
      func_0x00734324();
      uVar16 = *unaff_x27;
      if ((uVar16 >> 0x21 & 1) != 0) {
        if (((uVar16 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) goto code_r0x0078672c;
code_r0x007867a4:
        if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) & 1) != 0) &&
           ((*(byte *)((long)unaff_x27 + 5) >> 3 & 1) != 0)) {
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000000;
        }
        if (in_stack_00000020._6_1_ == '\0') {
          iVar4 = func_0x00732b50();
          if (iVar4 == 2) {
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
                iVar4 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x007868f0;
              }
              goto code_r0x007868fc;
            }
          }
          else {
            if (iVar4 != 1) {
code_r0x00786894:
              uVar16 = func_0x00793294();
              if ((int)uVar16 == 0) {
                func_0x00768a04();
                uVar16 = func_0x007331a0();
                if ((int)uVar16 == 0) goto code_r0x00786924;
              }
              goto LAB_00786320;
            }
            if (*(char *)((long)unaff_x27 + 3) < '\0') {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar4 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
joined_r0x007868f0:
                if (iVar4 < 1) goto code_r0x007867cc;
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
        uVar16 = 0x59;
        goto LAB_00786320;
      }
      if ((uVar16 & 1) != 0) goto code_r0x007867a4;
code_r0x0078672c:
      iVar4 = func_0x00787810();
      if (iVar4 == 0) goto code_r0x007867a4;
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
      uVar16 = func_0x00787738();
      if ((int)uVar16 != 0) goto LAB_00786320;
      if ((*(byte *)(unaff_x20 + 0x398) >> 6 & 1) == 0) {
        uVar16 = func_0x00787a58();
        if ((int)uVar16 != 0) goto LAB_00786320;
      }
      else {
        *unaff_x22 = '\0';
      }
      puVar12 = *(undefined8 **)(unaff_x20 + 0x3a0);
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar12;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar12 + 0x94) & 0x3ffffff;
      *(byte *)((long)unaff_x27 + 0xa2a) =
           *(byte *)(unaff_x20 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
      uVar16 = func_0x00731ca0();
    }
    else {
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar12;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar12 + 0x94) & 0x3ffffff;
      uVar9 = (*(code *)puVar12[5])();
      if ((int)uVar9 == 0) {
        func_0x00768a04();
        uVar16 = func_0x007331a0();
        if ((int)uVar16 == 0) {
          uVar16 = func_0x00787738();
          if ((int)uVar16 == 0) {
            func_0x00783c98();
            goto code_r0x007866c0;
          }
          (**(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x18))();
        }
      }
      else {
code_r0x007866c0:
        func_0x00786a54();
        uVar16 = uVar9;
      }
    }
    if ((int)uVar16 != 0) goto LAB_00786320;
    uVar16 = func_0x006f4058(unaff_x20 + 0x3c8);
    if (1 < uVar16) {
      uVar16 = 0;
      *unaff_x21 = 1;
      goto code_r0x00786348;
    }
    if (*unaff_x22 != '\0') {
      uVar16 = 0;
      goto code_r0x00786348;
    }
    unaff_x22 = *(char **)(unaff_x19 + 0x18);
    func_0x007706e4();
    if ((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x9c) >> 4 & 1) == 0) {
      auVar19 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar19;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar16 = func_0x00736d28(), (int)uVar16 == 0)
         ) {
        uVar16 = func_0x0074e91c();
      }
      uVar10 = 0;
    }
    else {
      uVar16 = 0;
      uVar10 = 1;
    }
    *unaff_x21 = uVar10;
  } while( true );
}

