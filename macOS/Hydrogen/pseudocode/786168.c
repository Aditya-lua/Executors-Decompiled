
undefined8 FUN_00786168(void)

{
  bool bVar1;
  int iVar2;
  char *pcVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  char *unaff_x22;
  char *unaff_x23;
  ulong *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 auVar10 [16];
  long *plStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  long in_stack_00000048;
  
  pcVar3 = (char *)func_0x0074cf0c(&uStack0000000000000030);
  if (pcVar3 == (char *)0x0) {
    iVar2 = func_0x0077e6f8("http_proxy",&uStack0000000000000030);
    if (iVar2 == 0) {
      func_0x0077e7f8(&uStack0000000000000030,&uStack0000000000000030,0x14);
      pcVar3 = (char *)func_0x0074cf0c(&uStack0000000000000030);
      if (pcVar3 != (char *)0x0) goto code_r0x00786178;
    }
    iVar2 = func_0x0077e6f8("ws_proxy",&uStack0000000000000030);
    if (iVar2 != 0) {
      pcVar3 = (char *)func_0x0074cf0c("http_proxy");
      if (pcVar3 == (char *)0x0) goto code_r0x00786610;
      goto code_r0x00786178;
    }
    iVar2 = func_0x0077e6f8("wss_proxy",&uStack0000000000000030);
    if ((iVar2 != 0) &&
       ((pcVar3 = (char *)func_0x0074cf0c("https_proxy"), pcVar3 != (char *)0x0 ||
        (pcVar3 = (char *)func_0x0074cf0c("HTTPS_PROXY"), pcVar3 != (char *)0x0))))
    goto code_r0x00786178;
code_r0x00786610:
    pcVar3 = (char *)func_0x0074cf0c("all_proxy");
    if ((pcVar3 != (char *)0x0) ||
       (pcVar3 = (char *)func_0x0074cf0c("ALL_PROXY"), pcVar3 != (char *)0x0))
    goto code_r0x00786178;
  }
  else {
code_r0x00786178:
    if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
  (*(code *)*unaff_x28)();
  if ((pcVar3 != (char *)0x0) &&
     (((*(long *)(unaff_x20 + 0x500) != 0 || (*pcVar3 == '\0')) ||
      ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)))) {
    (*(code *)*unaff_x28)(pcVar3);
    pcVar3 = (char *)0x0;
  }
  if (unaff_x23 == (char *)0x0) {
LAB_00786210:
    if (pcVar3 != (char *)0x0) {
      unaff_x23 = (char *)0x0;
      bVar1 = false;
code_r0x00786228:
      uVar4 = func_0x00787f68();
      (*(code *)*unaff_x28)(pcVar3);
      if ((int)uVar4 != 0) goto code_r0x0078629c;
      if (bVar1) goto code_r0x007864b0;
      goto code_r0x007864e4;
    }
    uVar7 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffffc;
  }
  else {
    if ((*unaff_x23 == '\0') || ((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9c) >> 4 & 1) != 0)) {
      (*(code *)*unaff_x28)();
      goto LAB_00786210;
    }
    if (pcVar3 != (char *)0x0) {
      bVar1 = true;
      goto code_r0x00786228;
    }
code_r0x007864b0:
    uVar4 = func_0x00787f68();
    (*(code *)*unaff_x28)(unaff_x23);
    if ((int)uVar4 != 0) {
      unaff_x23 = (char *)0x0;
      goto code_r0x0078629c;
    }
code_r0x007864e4:
    plStack0000000000000018 = (long *)(unaff_x20 + 0xe0);
    if (*plStack0000000000000018 == 0) {
      uVar7 = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffffffff6;
      *(ulong *)(unaff_x20 + 0x398) = uVar7;
      if (*(long *)(unaff_x20 + 0xa8) == 0) goto code_r0x00786658;
      if (*(long *)(unaff_x20 + 0xd0) != 0) goto code_r0x00786650;
      *(undefined8 *)(unaff_x20 + 0xd0) = *(undefined8 *)(unaff_x20 + 0x108);
      *(undefined8 *)(unaff_x20 + 0x108) = 0;
      (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0xd8));
      *(undefined8 *)(unaff_x20 + 0xd8) = *(undefined8 *)(unaff_x20 + 0x110);
      *(undefined8 *)(unaff_x20 + 0x110) = 0;
      uVar7 = *(ulong *)(unaff_x20 + 0x398) | 2;
    }
    else {
      uVar7 = *(ulong *)(unaff_x20 + 0x398);
      if ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) & 0xc0000003) == 0) {
        if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) >> 3 & 1) == 0) ||
           (((uint)uVar7 >> 3 & 1) != 0)) {
          uVar7 = uVar7 | 8;
        }
        else {
          *(undefined **)(unaff_x20 + 0x3a0) = &UNK_00a1e860;
        }
      }
      uVar7 = uVar7 | 1;
      if (*(long *)(unaff_x20 + 0xa8) == 0) {
code_r0x00786658:
        uVar7 = uVar7 & 0xfffffffffffffffd;
      }
      else {
code_r0x00786650:
        uVar7 = uVar7 | 2;
      }
    }
  }
  uVar9 = (ulong)(uint)((int)uVar7 << 3) & 0x10;
  if ((uVar7 & 1) != 0) {
    uVar9 = 0x10;
  }
  *(ulong *)(unaff_x20 + 0x398) = uVar9 | uVar7 & 0xffffffffffffffef;
  unaff_x23 = (char *)0x0;
  uVar4 = 0;
  if (uVar9 == 0) {
    *(ulong *)(unaff_x20 + 0x398) = uVar7 & 0xffffffffffffffe0;
    *(undefined1 *)(unaff_x20 + 0x104) = 0;
  }
code_r0x0078629c:
  (*(code *)*unaff_x28)(unaff_x23);
  (*(code *)*unaff_x28)(0);
  if ((int)uVar4 == 0) {
    if (((*(byte *)(*(long *)(unaff_x20 + 0x3a8) + 0x9c) & 1) != 0) &&
       ((*(ulong *)(unaff_x20 + 0x398) & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 8;
    }
    if (*(ushort *)(unaff_x19 + 0xa0c) == 0) goto code_r0x00786388;
    if (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0) goto code_r0x00786388;
    *(uint *)(unaff_x20 + 0x518) = (uint)*(ushort *)(unaff_x19 + 0xa0c);
    func_0x00764560(&uStack0000000000000030,0x10,"%d");
    iVar2 = func_0x0078a0e4(*(undefined8 *)
                             (
                             "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                             + unaff_x19 + 0x48),6,&uStack0000000000000030,0);
    if (iVar2 == 0) goto code_r0x00786388;
    uVar4 = 0x1b;
  }
code_r0x00786320:
  do {
    if ((((int)uVar4 != 0x59) && (unaff_x20 != 0)) && ((int)uVar4 != 0)) {
      func_0x0076891c();
      func_0x00732ed0();
    }
code_r0x00786348:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return uVar4;
    }
    ___stack_chk_fail();
code_r0x00786388:
    uVar4 = func_0x00786b48();
    if ((((int)uVar4 != 0) || (uVar4 = func_0x00786f04(), (int)uVar4 != 0)) ||
       (uVar4 = func_0x00786fc4(), (int)uVar4 != 0)) goto code_r0x00786320;
    uVar7 = *(ulong *)(unaff_x20 + 0x398);
    if ((uVar7 & 1) != 0) {
      uVar4 = func_0x0075af14(unaff_x20 + 0xe0);
      if ((int)uVar4 != 0) goto code_r0x00786320;
      uVar7 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar7 >> 1 & 1) != 0) {
      uVar4 = func_0x0075af14(unaff_x20 + 0xa8);
      if ((int)uVar4 != 0) goto code_r0x00786320;
      uVar7 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar7 >> 8 & 1) != 0) {
      uVar4 = func_0x0075af14(unaff_x20 + 0x88);
      if ((int)uVar4 != 0) goto code_r0x00786320;
      uVar7 = *(ulong *)(unaff_x20 + 0x398);
      if (((uint)uVar7 >> 8 & 1) != 0) {
        iVar2 = func_0x0077e6f8(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x68))
        ;
        uVar7 = *(ulong *)(unaff_x20 + 0x398);
        if (iVar2 != 0) {
          uVar7 = uVar7 & 0xfffffffffffffeff;
          *(ulong *)(unaff_x20 + 0x398) = uVar7;
        }
      }
    }
    if ((((uint)uVar7 >> 9 & 1) != 0) &&
       (*(int *)(unaff_x20 + 0x51c) == *(int *)(unaff_x20 + 0x518))) {
      uVar7 = uVar7 & 0xfffffffffffffdff;
      *(ulong *)(unaff_x20 + 0x398) = uVar7;
    }
    if (((uVar7 & 0x300) != 0) && ((uVar7 & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = uVar7 | 8;
    }
    uVar4 = func_0x00787638();
    if ((int)uVar4 != 0) goto code_r0x00786320;
    puVar8 = *(undefined8 **)(unaff_x20 + 0x3a0);
    if ((*(byte *)((long)puVar8 + 0x9c) >> 4 & 1) == 0) {
      *(undefined **)(unaff_x20 + 0x240) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 0x250) = &DAT_00730f64;
      *(undefined **)(unaff_x20 + 0x248) = &DAT_00730ee8;
      *(undefined **)(unaff_x20 + 600) = &DAT_00730f64;
      *(ulong *)(unaff_x20 + 0x398) =
           *(ulong *)(unaff_x20 + 0x398) & 0xffffffffff000000 |
           *(ulong *)(unaff_x20 + 0x398) & 0x7fffff | (*unaff_x27 >> 0x2a & 1) << 0x17;
      uVar4 = func_0x007931a8();
      if ((int)uVar4 != 0) goto code_r0x00786320;
      func_0x00734324();
      uVar7 = *unaff_x27;
      if ((uVar7 >> 0x21 & 1) != 0) {
        if (((uVar7 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) goto code_r0x0078672c;
code_r0x007867a4:
        if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) & 1) != 0) &&
           ((*(byte *)((long)unaff_x27 + 5) >> 3 & 1) != 0)) {
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000000;
        }
        if (in_stack_00000020._6_1_ == '\0') {
          iVar2 = func_0x00732b50();
          if (iVar2 == 2) {
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
                iVar2 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x007868f0;
              }
              goto code_r0x007868fc;
            }
          }
          else {
            if (iVar2 != 1) {
code_r0x00786894:
              uVar4 = func_0x00793294();
              if ((int)uVar4 == 0) {
                func_0x00768a04();
                uVar4 = func_0x007331a0();
                if ((int)uVar4 == 0) goto LAB_00786924;
              }
              goto code_r0x00786320;
            }
            if (*(char *)((long)unaff_x27 + 3) < '\0') {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar2 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
joined_r0x007868f0:
                if (iVar2 < 1) goto code_r0x007867cc;
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
        uVar4 = 0x59;
        goto code_r0x00786320;
      }
      if ((uVar7 & 1) != 0) goto code_r0x007867a4;
code_r0x0078672c:
      iVar2 = func_0x00787810();
      if (iVar2 == 0) goto code_r0x007867a4;
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
LAB_00786924:
      func_0x00786a54();
      uVar4 = func_0x00787738();
      if ((int)uVar4 != 0) goto code_r0x00786320;
      if ((*(byte *)(unaff_x20 + 0x398) >> 6 & 1) == 0) {
        uVar4 = func_0x00787a58();
        if ((int)uVar4 != 0) goto code_r0x00786320;
      }
      else {
        *unaff_x22 = '\0';
      }
      puVar8 = *(undefined8 **)(unaff_x20 + 0x3a0);
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar8;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar8 + 0x94) & 0x3ffffff;
      *(byte *)((long)unaff_x27 + 0xa2a) =
           *(byte *)(unaff_x20 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
      uVar4 = func_0x00731ca0();
    }
    else {
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar8;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar8 + 0x94) & 0x3ffffff;
      uVar5 = (*(code *)puVar8[5])();
      if ((int)uVar5 == 0) {
        func_0x00768a04();
        uVar4 = func_0x007331a0();
        if ((int)uVar4 == 0) {
          uVar4 = func_0x00787738();
          if ((int)uVar4 == 0) {
            func_0x00783c98();
            goto code_r0x007866c0;
          }
          (**(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x18))();
        }
      }
      else {
code_r0x007866c0:
        func_0x00786a54();
        uVar4 = uVar5;
      }
    }
    if ((int)uVar4 != 0) goto code_r0x00786320;
    uVar7 = func_0x006f4058(unaff_x20 + 0x3c8);
    if (1 < uVar7) {
      uVar4 = 0;
      *unaff_x21 = 1;
      goto code_r0x00786348;
    }
    if (*unaff_x22 != '\0') {
      uVar4 = 0;
      goto code_r0x00786348;
    }
    unaff_x22 = *(char **)(unaff_x19 + 0x18);
    func_0x007706e4();
    if ((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x9c) >> 4 & 1) == 0) {
      auVar10 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar10;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar4 = func_0x00736d28(), (int)uVar4 == 0))
      {
        uVar4 = func_0x0074e91c();
      }
      uVar6 = 0;
    }
    else {
      uVar4 = 0;
      uVar6 = 1;
    }
    *unaff_x21 = uVar6;
  } while( true );
}

