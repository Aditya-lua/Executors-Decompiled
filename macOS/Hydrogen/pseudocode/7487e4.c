
undefined8 FUN_007487e4(ulong param_1)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  int in_w8;
  int extraout_w8;
  uint uVar4;
  ulong uVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  undefined8 uVar6;
  short unaff_w26;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  short in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if ((in_w8 == unaff_w22) && (param_1 < 0x10000)) {
    *(short *)(unaff_x20 + 0x4f4) = (short)param_1;
    if ((*(byte *)(unaff_x20 + 0x398) & 10) == 0) {
      lVar2 = unaff_x20 + 0x118;
    }
    else {
      lVar2 = *(long *)(unaff_x20 + 0x68);
    }
    auVar8 = (*pcRam0000000000a2b600)(lVar2);
    pcVar3 = auVar8._0_8_;
    *(char **)(unaff_x20 + 0x4b0) = pcVar3;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = auVar8._8_8_;
    auVar7 = auVar7 << 0x40;
    if (pcVar3 == (char *)0x0) goto code_r0x00748d80;
    uVar5 = *(ulong *)(unaff_x20 + 0x398);
    uVar4 = (uint)uVar5;
    goto joined_r0x00748a8c;
  }
  auVar7 = func_0x0073c9e4();
  uVar6 = 0xd;
  do {
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar6;
      }
      ___stack_chk_fail(auVar7._0_8_,auVar7._8_8_);
      if ((extraout_w8 < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      if ((*(byte *)(unaff_x20 + 0x398) & 10) == 0) {
        lVar2 = unaff_x20 + 0x118;
      }
      else {
        lVar2 = *(long *)(unaff_x20 + 0x68);
      }
      pcVar3 = (char *)(*pcRam0000000000a2b600)(lVar2);
      *(char **)(unaff_x20 + 0x4b0) = pcVar3;
      auVar7 = ZEXT816(0);
      if (pcVar3 != (char *)0x0) break;
code_r0x00748d80:
      uVar6 = 0x1b;
    }
    *(short *)(unaff_x20 + 0x4f4) = unaff_w26 + in_stack_00000030 * 0x100;
    uVar5 = *(ulong *)(unaff_x20 + 0x398);
    uVar4 = (uint)uVar5;
joined_r0x00748a8c:
    if ((uVar4 >> 4 & 1) == 0) {
      if (((uVar5 & 0x800040) == 0x800000) && (*pcVar3 == '\0')) {
        (*(code *)*unaff_x28)(pcVar3);
        *(undefined8 *)(unaff_x20 + 0x4b0) = 0;
        if ((*(byte *)(unaff_x20 + 0x398) & 10) == 0) {
          lVar2 = unaff_x20 + 0x118;
        }
        else {
          lVar2 = *(long *)(unaff_x20 + 0x68);
        }
        lVar2 = (*pcRam0000000000a2b600)(lVar2);
        *(long *)(unaff_x20 + 0x4b0) = lVar2;
        auVar7 = ZEXT816(0);
        if (lVar2 == 0) goto code_r0x00748d80;
      }
      iVar1 = func_0x0074f754();
      if (iVar1 == 1) {
        func_0x00728b3c();
      }
      if (in_stack_00000038 == (undefined8 *)0x0) {
        auVar7 = func_0x0073c9e4();
        uVar6 = 0xf;
      }
      else {
code_r0x00748c18:
        uVar6 = func_0x00736d28();
        if ((int)uVar6 == 0) {
          unaff_x21 = unaff_x19 + 0xa1a;
          if (((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
              (func_0x0074ef88(*in_stack_00000038,&uStack0000000000000040,0x100),
              *(char *)(unaff_x19 + 0xa1d) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          func_0x00750010();
          (*(code *)*unaff_x28)(*(undefined8 *)(unaff_x20 + 0x80));
          *(undefined8 *)(unaff_x20 + 0x80) = 0;
          *(undefined2 *)(unaff_x20 + 0x526) = *(undefined2 *)(unaff_x20 + 0x4f4);
          auVar7 = (*pcRam0000000000a2b600)(*(undefined8 *)(unaff_x20 + 0x4b0));
          *(long *)(unaff_x20 + 0x80) = auVar7._0_8_;
          if (auVar7._0_8_ == 0) goto code_r0x00748d80;
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000;
          unaff_x20 = *(long *)(unaff_x19 + 0x18);
          if (((*(char *)(unaff_x20 + 0x4f6) != '\0') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            auVar7 = func_0x0073cfbc();
          }
          uVar6 = 0;
          *(undefined1 *)(unaff_x20 + 0x4f6) = 0;
        }
        else {
          auVar7 = func_0x00750010();
          if (((int)unaff_x21 == 0xe5) && (*(int *)(unaff_x20 + 0x4e8) == 0)) {
            auVar7 = func_0x0074b274();
            uVar6 = auVar7._0_8_;
          }
        }
      }
    }
    else {
      iVar1 = func_0x0074f754();
      if (iVar1 == 1) {
        func_0x00728b3c();
      }
      if (in_stack_00000038 != (undefined8 *)0x0) goto code_r0x00748c18;
      auVar7 = func_0x0073c9e4();
      uVar6 = 5;
    }
  } while( true );
}

