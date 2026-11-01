
undefined8 FUN_007488d4(char *param_1)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  uint uVar7;
  uint extraout_w8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  ulong unaff_x26;
  undefined8 *unaff_x28;
  long unaff_x29;
  ulong in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 uStack0000000000000040;
  
  while (((((*param_1 != ',' || (9 < (byte)param_1[1] - 0x30)) ||
           (uVar2 = _strtoul(param_1 + 1,&uStack0000000000000040,10), 0xff < uVar2)) ||
          ((*uStack0000000000000040 != ',' || (9 < (byte)uStack0000000000000040[1] - 0x30)))) ||
         (((uVar2 = _strtoul(uStack0000000000000040 + 1,&uStack0000000000000040,10), 0xff < uVar2 ||
           ((*uStack0000000000000040 != ',' || (9 < (byte)uStack0000000000000040[1] - 0x30)))) ||
          (uVar3 = _strtoul(uStack0000000000000040 + 1,&uStack0000000000000040,10),
          in_stack_00000030 = uVar2, 0xff < uVar3))))) {
    do {
      unaff_x22 = unaff_x22 + 1;
      if (*unaff_x22 == 0) goto LAB_00748818;
    } while ((((9 < *unaff_x22 - 0x30) ||
              (uVar2 = _strtoul(unaff_x22,&uStack0000000000000040,10), 0xff < uVar2)) ||
             (*uStack0000000000000040 != ',')) ||
            (((9 < (byte)uStack0000000000000040[1] - 0x30 ||
              (uVar2 = _strtoul(uStack0000000000000040 + 1,&uStack0000000000000040,10), 0xff < uVar2
              )) || ((*uStack0000000000000040 != ',' ||
                     ((9 < (byte)uStack0000000000000040[1] - 0x30 ||
                      (uVar2 = _strtoul(uStack0000000000000040 + 1,&uStack0000000000000040,10),
                      0xff < uVar2))))))));
    param_1 = uStack0000000000000040;
  }
  if (*unaff_x22 != 0) {
    uVar7 = (uint)*(undefined8 *)(unaff_x19 + 0xa1a);
    if ((uVar7 >> 0x13 & 1) != 0) goto LAB_00748b48;
    pcVar4 = (char *)func_0x00764704("%u.%u.%u.%u");
    goto LAB_00748bac;
  }
LAB_00748818:
  func_0x0073c9e4();
  uVar6 = 0xe;
  uVar3 = unaff_x26;
  do {
    while( true ) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar6;
      }
      ___stack_chk_fail();
      uVar7 = extraout_w8;
LAB_00748b48:
      if (((int)uVar7 < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      if ((*(byte *)(unaff_x20 + 0x398) & 10) == 0) {
        lVar5 = unaff_x20 + 0x118;
      }
      else {
        lVar5 = *(long *)(unaff_x20 + 0x68);
      }
      pcVar4 = (char *)(*pcRam0000000000a2b600)(lVar5);
LAB_00748bac:
      *(char **)(unaff_x20 + 0x4b0) = pcVar4;
      if (pcVar4 != (char *)0x0) break;
code_r0x00748d80:
      uVar6 = 0x1b;
    }
    *(short *)(unaff_x20 + 0x4f4) = (short)uVar3 + (short)in_stack_00000030 * 0x100;
    if (((uint)*(ulong *)(unaff_x20 + 0x398) >> 4 & 1) == 0) {
      if (((*(ulong *)(unaff_x20 + 0x398) & 0x800040) == 0x800000) && (*pcVar4 == '\0')) {
        (*(code *)*unaff_x28)(pcVar4);
        *(undefined8 *)(unaff_x20 + 0x4b0) = 0;
        if ((*(byte *)(unaff_x20 + 0x398) & 10) == 0) {
          lVar5 = unaff_x20 + 0x118;
        }
        else {
          lVar5 = *(long *)(unaff_x20 + 0x68);
        }
        lVar5 = (*pcRam0000000000a2b600)(lVar5);
        *(long *)(unaff_x20 + 0x4b0) = lVar5;
        if (lVar5 == 0) goto code_r0x00748d80;
      }
      iVar1 = func_0x0074f754();
      if (iVar1 == 1) {
        func_0x00728b3c();
      }
      if (in_stack_00000038 == (undefined8 *)0x0) {
        func_0x0073c9e4();
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
          lVar5 = (*pcRam0000000000a2b600)(*(undefined8 *)(unaff_x20 + 0x4b0));
          *(long *)(unaff_x20 + 0x80) = lVar5;
          if (lVar5 == 0) goto code_r0x00748d80;
          *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x1000;
          unaff_x20 = *(long *)(unaff_x19 + 0x18);
          if ((((*(char *)(unaff_x20 + 0x4f6) != '\0') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
            func_0x0073cfbc();
          }
          uVar6 = 0;
          *(undefined1 *)(unaff_x20 + 0x4f6) = 0;
        }
        else {
          func_0x00750010();
          if (((int)unaff_x21 == 0xe5) && (*(int *)(unaff_x20 + 0x4e8) == 0)) {
            uVar6 = func_0x0074b274();
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
      func_0x0073c9e4();
      uVar6 = 5;
    }
  } while( true );
}

