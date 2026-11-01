
undefined8 FUN_00786748(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long unaff_x19;
  long lVar7;
  undefined1 *unaff_x21;
  char *unaff_x22;
  ulong *unaff_x27;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000048;
  
code_r0x00786748:
  func_0x007878ec();
  lVar7 = in_stack_00000028;
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
  uVar3 = func_0x00787738();
  if ((int)uVar3 == 0) {
    if ((*(byte *)(lVar7 + 0x398) >> 6 & 1) == 0) {
      uVar3 = func_0x00787a58();
      if ((int)uVar3 != 0) goto code_r0x00786320;
    }
    else {
      *unaff_x22 = '\0';
    }
    puVar6 = *(undefined8 **)(lVar7 + 0x3a0);
    *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar6;
    *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar6 + 0x94) & 0x3ffffff;
    *(byte *)((long)unaff_x27 + 0xa2a) =
         *(byte *)(lVar7 + 0x398) >> 3 & 2 | *(byte *)((long)unaff_x27 + 0xa2a) & 0xfd;
    uVar3 = func_0x00731ca0();
    goto code_r0x007869b0;
  }
code_r0x00786320:
  do {
    if ((((int)uVar3 != 0x59) && (lVar7 != 0)) && ((int)uVar3 != 0)) {
      func_0x0076891c();
      func_0x00732ed0();
    }
code_r0x00786348:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000048) {
      return uVar3;
    }
    ___stack_chk_fail();
    uVar3 = func_0x00786b48();
    if ((((int)uVar3 != 0) || (uVar3 = func_0x00786f04(), (int)uVar3 != 0)) ||
       (uVar3 = func_0x00786fc4(), (int)uVar3 != 0)) goto code_r0x00786320;
    uVar5 = *(ulong *)(lVar7 + 0x398);
    if ((uVar5 & 1) != 0) {
      uVar3 = func_0x0075af14(lVar7 + 0xe0);
      if ((int)uVar3 != 0) goto code_r0x00786320;
      uVar5 = *(ulong *)(lVar7 + 0x398);
    }
    if (((uint)uVar5 >> 1 & 1) != 0) {
      uVar3 = func_0x0075af14(lVar7 + 0xa8);
      if ((int)uVar3 != 0) goto code_r0x00786320;
      uVar5 = *(ulong *)(lVar7 + 0x398);
    }
    if (((uint)uVar5 >> 8 & 1) != 0) {
      uVar3 = func_0x0075af14(lVar7 + 0x88);
      if ((int)uVar3 != 0) goto code_r0x00786320;
      uVar5 = *(ulong *)(lVar7 + 0x398);
      if (((uint)uVar5 >> 8 & 1) != 0) {
        iVar1 = func_0x0077e6f8(*(undefined8 *)(lVar7 + 0x98),*(undefined8 *)(lVar7 + 0x68));
        uVar5 = *(ulong *)(lVar7 + 0x398);
        if (iVar1 != 0) {
          uVar5 = uVar5 & 0xfffffffffffffeff;
          *(ulong *)(lVar7 + 0x398) = uVar5;
        }
      }
    }
    if ((((uint)uVar5 >> 9 & 1) != 0) && (*(int *)(lVar7 + 0x51c) == *(int *)(lVar7 + 0x518))) {
      uVar5 = uVar5 & 0xfffffffffffffdff;
      *(ulong *)(lVar7 + 0x398) = uVar5;
    }
    if (((uVar5 & 0x300) != 0) && ((uVar5 & 1) != 0)) {
      *(ulong *)(lVar7 + 0x398) = uVar5 | 8;
    }
    uVar3 = func_0x00787638();
    if ((int)uVar3 != 0) goto code_r0x00786320;
    puVar6 = *(undefined8 **)(lVar7 + 0x3a0);
    if ((*(byte *)((long)puVar6 + 0x9c) >> 4 & 1) == 0) {
      *(undefined **)(lVar7 + 0x240) = &DAT_00730ee8;
      *(undefined **)(lVar7 + 0x250) = &DAT_00730f64;
      *(undefined **)(lVar7 + 0x248) = &DAT_00730ee8;
      *(undefined **)(lVar7 + 600) = &DAT_00730f64;
      *(ulong *)(lVar7 + 0x398) =
           *(ulong *)(lVar7 + 0x398) & 0xffffffffff000000 |
           *(ulong *)(lVar7 + 0x398) & 0x7fffff | (*unaff_x27 >> 0x2a & 1) << 0x17;
      uVar3 = func_0x007931a8();
      if ((int)uVar3 != 0) goto code_r0x00786320;
      func_0x00734324();
      uVar5 = *unaff_x27;
      if ((uVar5 >> 0x21 & 1) == 0) {
        if ((uVar5 & 1) == 0) goto code_r0x0078672c;
      }
      else if (((uVar5 & 1) == 0) && (*(long *)(unaff_x19 + 0xc58) != 0)) {
code_r0x0078672c:
        iVar1 = func_0x00787810();
        if (iVar1 != 0) goto code_r0x00786748;
      }
      if (((*(byte *)(*(long *)(lVar7 + 0x3a0) + 0x9d) & 1) != 0) &&
         ((*(byte *)((long)unaff_x27 + 5) >> 3 & 1) != 0)) {
        *(ulong *)(lVar7 + 0x398) = *(ulong *)(lVar7 + 0x398) | 0x1000000;
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
            uVar3 = func_0x00793294();
            if ((int)uVar3 != 0) goto code_r0x00786320;
            func_0x00768a04();
            uVar3 = func_0x007331a0();
            if ((int)uVar3 == 0) goto LAB_00786924;
            goto code_r0x00786320;
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
      lVar7 = 0;
      uVar3 = 0x59;
      goto code_r0x00786320;
    }
    *(undefined8 *)(&UNK_00001420 + unaff_x19) = *puVar6;
    *(uint *)(&UNK_00001428 + unaff_x19) = *(uint *)((long)puVar6 + 0x94) & 0x3ffffff;
    uVar2 = (*(code *)puVar6[5])();
    if ((int)uVar2 == 0) {
      func_0x00768a04();
      uVar3 = func_0x007331a0();
      if ((int)uVar3 == 0) {
        uVar3 = func_0x00787738();
        if ((int)uVar3 == 0) {
          func_0x00783c98();
          goto code_r0x007866c0;
        }
        (**(code **)(*(long *)(lVar7 + 0x3a0) + 0x18))();
      }
    }
    else {
code_r0x007866c0:
      func_0x00786a54();
      uVar3 = uVar2;
    }
code_r0x007869b0:
    if ((int)uVar3 != 0) goto code_r0x00786320;
    uVar5 = func_0x006f4058(lVar7 + 0x3c8);
    if (1 < uVar5) {
      uVar3 = 0;
      *unaff_x21 = 1;
      goto code_r0x00786348;
    }
    if (*unaff_x22 != '\0') {
      uVar3 = 0;
      goto code_r0x00786348;
    }
    unaff_x22 = *(char **)(unaff_x19 + 0x18);
    func_0x007706e4();
    if ((*(byte *)(*(long *)(unaff_x22 + 0x3a0) + 0x9c) >> 4 & 1) == 0) {
      auVar8 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x22 + 0x208) = auVar8;
      if ((((byte)unaff_x22[0x398] >> 6 & 1) != 0) || (uVar3 = func_0x00736d28(), (int)uVar3 == 0))
      {
        uVar3 = func_0x0074e91c();
      }
      uVar4 = 0;
    }
    else {
      uVar3 = 0;
      uVar4 = 1;
    }
    *unaff_x21 = uVar4;
  } while( true );
}

