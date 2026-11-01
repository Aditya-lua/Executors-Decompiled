
undefined8 FUN_00785a4c(char *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  char *unaff_x22;
  undefined8 uVar6;
  ulong *unaff_x27;
  undefined1 auVar7 [16];
  char *pcStack0000000000000000;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000048;
  
  pcStack0000000000000000 = param_1;
  func_0x0073c9e4();
  uVar6 = 3;
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
    uVar6 = func_0x00786b48();
    if ((((int)uVar6 != 0) || (uVar6 = func_0x00786f04(), (int)uVar6 != 0)) ||
       (uVar6 = func_0x00786fc4(), (int)uVar6 != 0)) goto LAB_00786320;
    uVar4 = *(ulong *)(unaff_x20 + 0x398);
    if ((uVar4 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0xe0);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar4 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar4 >> 1 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0xa8);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar4 = *(ulong *)(unaff_x20 + 0x398);
    }
    if (((uint)uVar4 >> 8 & 1) != 0) {
      uVar6 = func_0x0075af14(unaff_x20 + 0x88);
      if ((int)uVar6 != 0) goto LAB_00786320;
      uVar4 = *(ulong *)(unaff_x20 + 0x398);
      if (((uint)uVar4 >> 8 & 1) != 0) {
        iVar1 = func_0x0077e6f8(*(undefined8 *)(unaff_x20 + 0x98),*(undefined8 *)(unaff_x20 + 0x68))
        ;
        uVar4 = *(ulong *)(unaff_x20 + 0x398);
        if (iVar1 != 0) {
          uVar4 = uVar4 & 0xfffffffffffffeff;
          *(ulong *)(unaff_x20 + 0x398) = uVar4;
        }
      }
    }
    if ((((uint)uVar4 >> 9 & 1) != 0) &&
       (*(int *)(unaff_x20 + 0x51c) == *(int *)(unaff_x20 + 0x518))) {
      uVar4 = uVar4 & 0xfffffffffffffdff;
      *(ulong *)(unaff_x20 + 0x398) = uVar4;
    }
    if (((uVar4 & 0x300) != 0) && ((uVar4 & 1) != 0)) {
      *(ulong *)(unaff_x20 + 0x398) = uVar4 | 8;
    }
    uVar6 = func_0x00787638();
    if ((int)uVar6 != 0) goto LAB_00786320;
    puVar5 = *(undefined8 **)(unaff_x20 + 0x3a0);
    if ((*(byte *)((long)puVar5 + 0x9c) >> 4 & 1) == 0) {
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
      uVar4 = *unaff_x27;
      if ((uVar4 >> 0x21 & 1) != 0) {
        if (((uVar4 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) goto code_r0x0078672c;
code_r0x007867a4:
        if (((*(byte *)(*(long *)(unaff_x20 + 0x3a0) + 0x9d) & 1) != 0) &&
           ((*(byte *)((long)unaff_x27 + 5) >> 3 & 1) != 0)) {
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000000;
        }
        if (in_stack_00000020._6_1_ == '\0') {
          iVar1 = func_0x00732b50();
          if (iVar1 == 2) {
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
                iVar1 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x007868f0;
              }
              goto code_r0x007868fc;
            }
          }
          else {
            if (iVar1 != 1) {
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
                iVar1 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
joined_r0x007868f0:
                if (iVar1 < 1) goto code_r0x007867cc;
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
      if ((uVar4 & 1) != 0) goto code_r0x007867a4;
code_r0x0078672c:
      iVar1 = func_0x00787810();
      if (iVar1 == 0) goto code_r0x007867a4;
      func_0x007878ec();
      unaff_x20 = in_stack_00000028;
      if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        pcStack0000000000000000 = "host";
        if ((*(byte *)(in_stack_00000028 + 0x398) & 0x10) != 0) {
          pcStack0000000000000000 = "proxy";
        }
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
      puVar5 = *(undefined8 **)(unaff_x20 + 0x3a0);
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar5;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar5 + 0x94) & 0x3ffffff;
      *(byte *)((long)unaff_x27 + 0xa2a) =
           *(byte *)(unaff_x20 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
      uVar6 = func_0x00731ca0();
    }
    else {
      *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar5;
      *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar5 + 0x94) & 0x3ffffff;
      uVar2 = (*(code *)puVar5[5])();
      if ((int)uVar2 == 0) {
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
        uVar6 = uVar2;
      }
    }
    if ((int)uVar6 != 0) goto LAB_00786320;
    uVar4 = func_0x006f4058(unaff_x20 + 0x3c8);
    if (1 < uVar4) {
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
      auVar7 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar7;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar6 = func_0x00736d28(), (int)uVar6 == 0))
      {
        uVar6 = func_0x0074e91c();
      }
      uVar3 = 0;
    }
    else {
      uVar6 = 0;
      uVar3 = 1;
    }
    *unaff_x21 = uVar3;
  } while( true );
}

