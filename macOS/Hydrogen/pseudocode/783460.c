
/* WARNING: Removing unreachable block (ram,0x007830f0) */
/* WARNING: Removing unreachable block (ram,0x00783100) */
/* WARNING: Removing unreachable block (ram,0x00783514) */

undefined8 FUN_00783460(void)

{
  char cVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  code *pcVar9;
  undefined1 uVar10;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w22;
  int unaff_w23;
  long lVar11;
  uint *unaff_x27;
  long unaff_x28;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000040;
  long in_stack_00000048;
  
  do {
    lVar5 = in_stack_00000020;
    if (unaff_w23 == -1) {
LAB_00783634:
      uVar7 = *(uint *)(unaff_x19 + 0x134);
      uVar10 = 3;
      if ((uVar7 & 0x2a) != 2) {
        uVar10 = 1;
      }
      *(undefined1 *)(unaff_x28 + 0x929) = uVar10;
code_r0x00783650:
      if (((uVar7 & 3) == 2) &&
         ((unaff_w22 | (*(byte *)(in_stack_00000028 + 0x398) & 0x20) >> 5) == 1)) {
        if ((*(char *)(unaff_x28 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00771a28();
      }
code_r0x007836a8:
      func_0x0076bd1c();
      if (((byte)*unaff_x27 >> 1 & 1) == 0) {
        uVar3 = func_0x007718c0();
        if (((((uVar3 & 1) != 0) || ((*(byte *)(unaff_x19 + 0x134) >> 6 & 1) != 0)) &&
            (uVar3 = func_0x00771930(), (uVar3 & 1) == 0)) &&
           (uVar4 = func_0x00771818(), (int)uVar4 != 0)) {
          return uVar4;
        }
        iVar2 = func_0x0077011c();
        if (iVar2 != 0) {
          return 0x2a;
        }
        uVar4 = func_0x0077e1cc();
        if ((int)uVar4 != 0) {
          return uVar4;
        }
        if (*(int *)(unaff_x19 + 0x134) == 0) {
          if ((((*(byte *)((long)unaff_x27 + 2) >> 1 & 1) == 0) &&
              (*(long *)(unaff_x19 + 0xe8) != -1)) &&
             ((*(long *)(unaff_x19 + 0xe8) != *(long *)(unaff_x19 + 0xf8) &&
              (*(long *)(unaff_x19 + 0x1a8) == 0)))) {
            func_0x0073c9e4();
            return 0x12;
          }
          iVar2 = func_0x0077011c();
          if (iVar2 != 0) {
            return 0x2a;
          }
        }
        else {
          lVar5 = func_0x00734ac8();
          if (lVar5 < 0) {
            func_0x00782dc4(*unaff_x20,unaff_x20[1],*(undefined8 *)(unaff_x19 + 0xb18),
                            *(undefined8 *)(unaff_x19 + 0xb20));
            func_0x0073c9e4();
            return 0x1c;
          }
        }
        if ((*(byte *)(unaff_x19 + 0x134) & 0x3f) == 0) {
          *unaff_x27 = *unaff_x27 | 2;
          return 0;
        }
      }
      return 0;
    }
    lVar11 = in_stack_00000030;
    if ((unaff_w22 & 1) != 0) {
      unaff_w22 = 1;
      if (in_stack_00000030 == 0) goto code_r0x007831bc;
code_r0x007831a0:
      lVar8 = *(long *)(unaff_x19 + 0x318);
      if (lVar8 < 1) goto code_r0x007831bc;
      if (in_stack_00000020 == 0) {
        if (in_stack_00000030 <= lVar8) {
          lVar8 = in_stack_00000030;
        }
        lVar11 = lVar8;
        goto code_r0x007831bc;
      }
code_r0x00783584:
      if (unaff_w23 < 1) goto LAB_00783634;
      uVar7 = *(uint *)(*(long *)(*(long *)(unaff_x19 + 0x18) + 0x3a0) + 0x94);
      if ((uVar7 & 0xc) == 0) {
        if ((uVar7 & 0x30) != 0) goto LAB_00783634;
        uVar3 = func_0x007316f8();
      }
      else {
        uVar3 = func_0x007316f8();
      }
      if ((uVar3 & 1) == 0) {
        uVar7 = *(uint *)(unaff_x19 + 0x134);
        goto code_r0x00783650;
      }
      goto LAB_00783634;
    }
    unaff_w22 = func_0x0073162c(in_stack_00000028,0);
    if (in_stack_00000030 != 0) goto code_r0x007831a0;
code_r0x007831bc:
    if ((((unaff_w22 & 1) == 0) && ((*unaff_x27 & 1) == 0)) && (*(long *)(unaff_x19 + 0xe8) != -1))
    {
      lVar8 = *(long *)(unaff_x19 + 0xe8) - *(long *)(unaff_x19 + 0xf8);
      if (0 < lVar8) {
        if (lVar8 < lVar11) goto code_r0x0078327c;
        goto code_r0x00783274;
      }
code_r0x00783224:
      in_stack_00000048 = 0;
code_r0x00783228:
      if ((*(byte *)((long)unaff_x27 + 2) >> 4 & 1) != 0) {
        if ((*(long *)(unaff_x19 + 0x18) == 0) ||
           (*(int *)(*(long *)(unaff_x19 + 0x18) + 0x3c0) == -1)) {
          uVar4 = 2;
code_r0x00783318:
          if ((int)uVar4 != 0x51) goto code_r0x00783130;
        }
        else {
          uVar4 = func_0x00730c40();
          if ((int)uVar4 != 0) goto code_r0x00783318;
          if (in_stack_00000040._7_1_ != '\0') goto code_r0x007832cc;
        }
        if ((*unaff_x27 & 0x22008) != 0x20008) goto code_r0x00783584;
      }
code_r0x0078333c:
      uVar4 = func_0x00771bd8();
      if ((int)uVar4 != 0) goto code_r0x00783130;
      if (((byte)*unaff_x27 >> 4 & 1) != 0) goto code_r0x00783584;
      pcVar9 = *(code **)(*(long *)(*(long *)(unaff_x19 + 0x18) + 0x3a0) + 0x68);
      if (pcVar9 == (code *)0x0) {
        uVar4 = func_0x007738a0();
        if ((int)uVar4 == 0) goto code_r0x007833a4;
code_r0x0078337c:
        cVar1 = *(char *)(unaff_x28 + 3);
      }
      else {
        uVar4 = (*pcVar9)();
        if ((int)uVar4 != 0) goto code_r0x0078337c;
code_r0x007833a4:
        *unaff_x27 = *unaff_x27 | 0x18;
        cVar1 = *(char *)(unaff_x28 + 3);
      }
      if (cVar1 < '\0') {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) {
          if (iRam0000000000a2b560 < 1) goto code_r0x0078341c;
        }
        else {
          uVar7 = 1;
          if ((*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1) || (iRam0000000000a2b560 < 1))
          goto code_r0x00783420;
        }
        uVar7 = 1;
        func_0x0073ce84();
      }
      else {
code_r0x0078341c:
        uVar7 = 1;
      }
    }
    else {
      if ((*(long *)(unaff_x19 + 0x18) == 0) ||
         (*(int *)(*(long *)(unaff_x19 + 0x18) + 0x3c0) == -1)) {
code_r0x00783274:
        if (lVar11 == 0) goto code_r0x00783224;
      }
      else {
        uVar3 = func_0x00734dc8();
        if ((lVar11 == 0) || ((uVar3 & 1) != 0)) goto code_r0x00783224;
      }
code_r0x0078327c:
      uVar4 = func_0x007321b4();
      if ((int)uVar4 != 0) goto code_r0x00783318;
      if (in_stack_00000048 == 0) goto code_r0x00783228;
code_r0x007832cc:
      if (in_stack_00000048 < 0) goto code_r0x007836a8;
      if (in_stack_00000048 == 0) goto code_r0x0078333c;
      pcVar9 = *(code **)(*(long *)(*(long *)(unaff_x19 + 0x18) + 0x3a0) + 0x68);
      if (pcVar9 == (code *)0x0) {
        uVar4 = func_0x007738a0();
        if (*(char *)(unaff_x28 + 3) < '\0') goto code_r0x0078349c;
code_r0x00783500:
        in_stack_00000020 = in_stack_00000048 + lVar5;
        uVar7 = 0;
      }
      else {
        uVar4 = (*pcVar9)();
        if (-1 < *(char *)(unaff_x28 + 3)) goto code_r0x00783500;
code_r0x0078349c:
        in_stack_00000020 = in_stack_00000048 + in_stack_00000020;
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) {
          if (iRam0000000000a2b560 < 1) goto code_r0x00783500;
code_r0x007834e0:
          func_0x0073ce84();
          uVar7 = 0;
        }
        else {
          uVar7 = 0;
          if ((0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8)) && (0 < iRam0000000000a2b560))
          goto code_r0x007834e0;
        }
      }
    }
code_r0x00783420:
    if ((int)uVar4 != 0) {
code_r0x00783130:
      func_0x0076bd1c();
      return uVar4;
    }
    if ((*unaff_x27 >> 1 & 1) != 0) goto code_r0x007836a8;
    uVar6 = *(uint *)(unaff_x19 + 0x134);
    if ((uVar7 | *unaff_x27 >> 3 & 1 & (unaff_w22 ^ 0xffffffff)) == 1) {
      uVar6 = uVar6 & 0xfffffffe;
      *(uint *)(unaff_x19 + 0x134) = uVar6;
    }
    if ((uVar6 & 0x11) != 1) goto code_r0x00783584;
    unaff_w23 = unaff_w23 + -1;
  } while( true );
}

