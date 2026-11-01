
undefined8 FUN_00785d0c(void)

{
  long lVar1;
  bool bVar2;
  undefined4 uVar3;
  uint uVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  char *pcVar8;
  undefined8 uVar9;
  undefined1 uVar10;
  char *pcVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  char *unaff_x22;
  char *pcVar15;
  undefined8 *unaff_x25;
  ulong *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 auVar16 [16];
  long *plStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000048;
  
  uVar6 = func_0x00775ed0();
  if ((int)uVar6 != 0) goto LAB_00786320;
  *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 1;
  if ((*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) != 0) &&
     ((*(uint *)(&UNK_00001344 + unaff_x19) & 3) == 2)) goto LAB_00785dd8;
  uVar3 = func_0x00789530();
  uVar6 = 3;
  switch(uVar3) {
  case 0:
    uVar3 = 3;
    if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) & 0x2000) != 0) {
      uVar3 = 4;
    }
    uVar6 = func_0x00742734(*(undefined8 *)
                             (
                             "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                             + unaff_x19),0,&uStack0000000000000030,0,uVar3);
    if ((int)uVar6 != 0) goto LAB_00786320;
    *(undefined8 *)(unaff_x20 + 0x1e0) = uStack0000000000000030;
    uVar6 = func_0x00775ed0((long)&linkedit_data_command_00001318.cmd + unaff_x19);
    *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 1;
    if ((int)uVar6 != 0) goto LAB_00786320;
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
LAB_00785dd8:
  uVar3 = func_0x00789530();
  uVar6 = 3;
  switch(uVar3) {
  case 0:
    lVar7 = (*pcRam0000000000a2b600)
                      (*(undefined8 *)
                        ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                        unaff_x19 + 0x10));
    *(long *)(unaff_x20 + 0x1f0) = lVar7;
    if (lVar7 != 0) goto code_r0x00785e38;
    break;
  default:
    goto LAB_00786320;
  case 5:
code_r0x00785c68:
    uVar6 = 1;
    goto LAB_00786320;
  case 7:
    break;
  case 8:
code_r0x00785ea8:
    uVar6 = 0x43;
    goto LAB_00786320;
  case 0xd:
code_r0x00785e38:
    uVar3 = func_0x00789530();
    switch(uVar3) {
    case 0:
      iVar5 = func_0x00789530();
      if (iVar5 == 0) {
        uVar6 = _strtoul(*(undefined8 *)
                          ((long)&dylib_command_00001170.dylib.current_version + unaff_x19),0,10);
        uVar4 = (uint)*(ushort *)(unaff_x19 + 0xa0c);
        if ((*(ushort *)(unaff_x19 + 0xa0c) == 0) ||
           (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0)) {
          uVar4 = func_0x0078bbc8(uVar6);
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
        uVar12 = *(ulong *)(unaff_x20 + 0x398);
      }
      else {
        lVar7 = (*pcRam0000000000a2b600)();
        *(long *)(unaff_x20 + 0x500) = lVar7;
        if (lVar7 == 0) break;
        uVar12 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffff8000000 |
                 *(ulong *)(unaff_x20 + 0x398) & 0x3ffffff | (*unaff_x27 >> 0x31 & 1) << 0x1a;
        *(ulong *)(unaff_x20 + 0x398) = uVar12;
      }
      if (((uint)uVar12 >> 2 & 1) == 0) {
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
            uVar6 = 0x1b;
            goto code_r0x0078629c;
          }
        }
        if (*(long *)(unaff_x19 + 0x870) == 0) {
          lVar7 = func_0x0074cf0c("no_proxy");
          if ((((lVar7 != 0) || (lVar7 = func_0x0074cf0c("NO_PROXY"), lVar7 != 0)) &&
              (*(char *)((long)unaff_x27 + 3) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
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
        lVar1 = lVar7;
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
          (*(code *)*unaff_x28)(lVar7);
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
            uVar6 = func_0x00787f68();
            (*(code *)*unaff_x28)(pcVar8);
            if ((int)uVar6 != 0) {
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
            uVar6 = func_0x00787f68();
            (*(code *)*unaff_x28)(pcVar11);
            if ((int)uVar6 != 0) {
              pcVar8 = (char *)0x0;
              pcVar11 = (char *)0x0;
              goto code_r0x0078629c;
            }
          }
          plStack0000000000000018 = (long *)(unaff_x20 + 0xe0);
          if (*plStack0000000000000018 == 0) {
            uVar12 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffff6;
            *(ulong *)(unaff_x20 + 0x398) = uVar12;
            if (*(long *)(unaff_x20 + 0xa8) == 0) goto code_r0x00786658;
            if (*(long *)(unaff_x20 + 0xd0) != 0) goto code_r0x00786650;
            *(undefined8 *)(unaff_x20 + 0xd0) = *(undefined8 *)(unaff_x20 + 0x108);
            *(undefined8 *)(unaff_x20 + 0x108) = 0;
            (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0xd8));
            *(undefined8 *)(unaff_x20 + 0xd8) = *(undefined8 *)(unaff_x20 + 0x110);
            *(undefined8 *)(unaff_x20 + 0x110) = 0;
            uVar12 = *(ulong *)(unaff_x20 + 0x398) | 2;
          }
          else {
            uVar12 = *(ulong *)(unaff_x20 + 0x398);
            if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) & 0xc0000003) == 0) {
              if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) >> 3 & 1) == 0) ||
                 (((uint)uVar12 >> 3 & 1) != 0)) {
                uVar12 = uVar12 | 8;
              }
              else {
                *(undefined **)(unaff_x20 + 0x3a0) = &UNK_00a1e860;
              }
            }
            uVar12 = uVar12 | 1;
            if (*(long *)(unaff_x20 + 0xa8) == 0) {
code_r0x00786658:
              uVar12 = uVar12 & 0xfffffffffffffffd;
            }
            else {
code_r0x00786650:
              uVar12 = uVar12 | 2;
            }
          }
        }
        else {
          (*(code *)*unaff_x28)(pcVar8);
          (*(code *)*unaff_x28)(pcVar11);
          (*(code *)*unaff_x28)(lVar7);
code_r0x00786258:
          uVar12 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffffc;
        }
        uVar14 = (ulong)(uint)((int)uVar12 << 3) & 0x10;
        if ((uVar12 & 1) != 0) {
          uVar14 = 0x10;
        }
        *(ulong *)(unaff_x20 + 0x398) = uVar14 | uVar12 & 0xffffffffffffffef;
        pcVar8 = (char *)0x0;
        pcVar11 = (char *)0x0;
        uVar6 = 0;
        if (uVar14 == 0) {
          *(ulong *)(unaff_x20 + 0x398) = uVar12 & 0xffffffffffffffe0;
          *(undefined1 *)(unaff_x20 + 0x104) = 0;
        }
      }
      else {
        pcVar11 = *(char **)((long)&linkedit_data_command_00001328.dataoff + unaff_x19);
        pcVar15 = *(char **)(&UNK_00001338 + unaff_x19);
        pcVar8 = "";
        if (pcVar11 != (char *)0x0) {
          pcVar8 = pcVar11;
        }
        lVar7 = (*pcRam0000000000a2b600)(pcVar8);
        *(long *)(unaff_x20 + 0x108) = lVar7;
        if (lVar7 == 0) {
          pcVar8 = (char *)0x0;
code_r0x0078606c:
          pcVar11 = (char *)0x0;
          uVar6 = 0x1b;
        }
        else {
          pcVar8 = "";
          if (pcVar15 != (char *)0x0) {
            pcVar8 = pcVar15;
          }
          lVar7 = (*pcRam0000000000a2b600)(pcVar8);
          *(long *)(unaff_x20 + 0x110) = lVar7;
          if (lVar7 != 0) goto code_r0x00785fe4;
          (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0x108));
          pcVar8 = (char *)0x0;
          pcVar11 = (char *)0x0;
          *(undefined8 *)(unaff_x20 + 0x108) = 0;
          uVar6 = 0x1b;
        }
      }
code_r0x0078629c:
      (*(code *)*unaff_x28)(pcVar11);
      (*(code *)*unaff_x28)(pcVar8);
      if ((int)uVar6 != 0) goto LAB_00786320;
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
code_r0x0078631c:
  uVar6 = 0x1b;
LAB_00786320:
  do {
    if ((((int)uVar6 != 0x59) && (unaff_x20 != 0)) && ((int)uVar6 != 0)) {
      func_0x0076891c();
      func_0x00732ed0();
    }
code_r0x00786348:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return uVar6;
    }
    ___stack_chk_fail();
code_r0x00786388:
    uVar6 = func_0x00786b48();
    if ((((int)uVar6 != 0) || (uVar6 = func_0x00786f04(), (int)uVar6 != 0)) ||
       (uVar6 = func_0x00786fc4(), (int)uVar6 != 0)) goto LAB_00786320;
    uVar12 = *(ulong *)(unaff_x20 + 0x398);
    if ((uVar12 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0xe0);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar12 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar12 >> 1 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0xa8);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar12 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar12 >> 8 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0x88);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar12 = *(ulong *)(unaff_x20 + 0x398);
      if (((uint)uVar12 >> 8 & 1) != 0) {
        iVar5 = func_0x0077e6f8(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x68))
        ;
        uVar12 = *(ulong *)(unaff_x20 + 0x398);
        if (iVar5 != 0) {
          uVar12 = uVar12 & 0xfffffffffffffeff;
          *(ulong *)(unaff_x20 + 0x398) = uVar12;
        }
      }
    }
    if ((((uint)uVar12 >> 9 & 1) != 0) &&
       (*(int *)(unaff_x20 + 0x51c) == *(int *)(unaff_x20 + 0x518))) {
      uVar12 = uVar12 & 0xfffffffffffffdff;
      *(ulong *)(unaff_x20 + 0x398) = uVar12;
    }
    if (((uVar12 & 0x300) != 0) && ((uVar12 & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = uVar12 | 8;
    }
    uVar6 = func_0x00787638();
    if ((int)uVar6 != 0) goto LAB_00786320;
    puVar13 = *(undefined8 **)(unaff_x20 + 0x3a0);
    if ((*(byte *)((long)puVar13 + 0x9c) >> 4 & 1) == 0) {
      *(undefined **)(unaff_x20 + 0x240) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 0x250) = &DAT_00730f64;
      *(undefined **)(unaff_x20 + 0x248) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 600) = &DAT_00730f64;
      *(ulong *)(unaff_x20 + 0x398) =
           *(ulong *)(unaff_x20 + 0x398) & 0xffffffffff000000 |
           *(ulong *)(unaff_x20 + 0x398) & 0x7fffff | (*unaff_x27 >> 0x2a & 1) << 0x17;
      uVar6 = func_0x007931a8();
      if ((int)uVar6 != 0) goto LAB_00786320;
      func_0x00734324();
      uVar12 = *unaff_x27;
      if ((uVar12 >> 0x21 & 1) != 0) {
        if (((uVar12 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) goto code_r0x0078672c;
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
              uVar6 = func_0x00793294();
              if ((int)uVar6 == 0) {
                func_0x00768a04();
                uVar6 = func_0x007331a0();
                if ((int)uVar6 == 0) goto code_r0x00786924;
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
        uVar6 = 0x59;
        goto LAB_00786320;
      }
      if ((uVar12 & 1) != 0) goto code_r0x007867a4;
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
      uVar6 = func_0x00787738();
      if ((int)uVar6 != 0) goto LAB_00786320;
      if ((*(byte *)(unaff_x20 + 0x398) >> 6 & 1) == 0) {
        uVar6 = func_0x00787a58();
        if ((int)uVar6 != 0) goto LAB_00786320;
      }
      else {
        *unaff_x22 = '\0';
      }
      puVar13 = *(undefined8 **)(unaff_x20 + 0x3a0);
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar13;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar13 + 0x94) & 0x3ffffff;
      *(byte *)((long)unaff_x27 + 0xa2a) =
           *(byte *)(unaff_x20 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
      uVar6 = func_0x00731ca0();
    }
    else {
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar13;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar13 + 0x94) & 0x3ffffff;
      uVar9 = (*(code *)puVar13[5])();
      if ((int)uVar9 == 0) {
        func_0x00768a04();
        uVar6 = func_0x007331a0();
        if ((int)uVar6 == 0) {
          uVar6 = func_0x00787738();
          if ((int)uVar6 == 0) {
            func_0x00783c98();
            goto code_r0x007866c0;
          }
          (**(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x18))();
        }
      }
      else {
code_r0x007866c0:
        func_0x00786a54();
        uVar6 = uVar9;
      }
    }
    if ((int)uVar6 != 0) goto LAB_00786320;
    uVar12 = func_0x006f4058(unaff_x20 + 0x3c8);
    if (1 < uVar12) {
      uVar6 = 0;
      *unaff_x21 = 1;
      goto code_r0x00786348;
    }
    if (*unaff_x22 != '\0') {
      uVar6 = 0;
      goto code_r0x00786348;
    }
    unaff_x22 = *(char **)(unaff_x19 + 0x18);
    func_0x007706e4();
    if ((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x9c) >> 4 & 1) == 0) {
      auVar16 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar16;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar6 = func_0x00736d28(), (int)uVar6 == 0))
      {
        uVar6 = func_0x0074e91c();
      }
      uVar10 = 0;
    }
    else {
      uVar6 = 0;
      uVar10 = 1;
    }
    *unaff_x21 = uVar10;
  } while( true );
}

