
void FUN_007502c0(void)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  char *pcVar4;
  long lVar5;
  char *pcVar6;
  undefined8 uVar7;
  char *pcVar8;
  char *pcVar9;
  long unaff_x19;
  long *unaff_x20;
  ulong unaff_x22;
  char *pcVar10;
  int unaff_w23;
  ulong uVar11;
  char *unaff_x24;
  char *pcVar12;
  long unaff_x25;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000008a;
  
code_r0x007502c0:
  func_0x00779cfc();
  pcVar9 = unaff_x24;
code_r0x007502d0:
  func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                  unaff_x22 + (long)unaff_w23 + 1);
  if (*(long *)(unaff_x19 + 0xe0) != 0) {
    func_0x00779d40();
  }
LAB_00750220:
  while( true ) {
    do {
      unaff_x20 = (long *)unaff_x20[1];
      if (unaff_x20 == (long *)0x0) {
        uVar7 = 0;
        pcVar8 = "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                 unaff_x19 + 0x38;
        pcVar8[0] = '\0';
        pcVar8[1] = '\0';
        pcVar8[2] = '\0';
        pcVar8[3] = '\0';
        pcVar8[4] = '\0';
        pcVar8[5] = '\0';
        pcVar8[6] = '\0';
        pcVar8[7] = '\0';
        if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60))
        goto code_r0x00750648;
        return;
      }
      pcVar8 = (char *)*unaff_x20;
    } while (pcVar8 == (char *)0x0);
    if (*pcVar8 == '-') break;
    if (*pcVar8 == '+') {
      pcVar8 = pcVar8 + 1;
    }
    lVar2 = _strchr(pcVar8,0x3a);
    if (lVar2 == 0) {
code_r0x00750698:
      unaff_x25 = 0;
      pcVar12 = pcVar9;
code_r0x0075069c:
      while( true ) {
        pcVar9 = pcVar12;
        func_0x0073c9e4();
        func_0x0073a4d8(unaff_x25);
        uVar7 = 0x31;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) break;
code_r0x00750648:
        ___stack_chk_fail(uVar7);
        pcVar12 = pcVar9;
LAB_0075064c:
        pcVar10 = pcVar12;
        pcVar12 = pcVar10;
code_r0x00750650:
        uStack0000000000000040 = pcVar10;
      }
      return;
    }
    uVar3 = _strtoul((char *)(lVar2 + 1),&uStack0000000000000040,10);
    if (((uVar3 >> 0x10 != 0) ||
        (pcVar9 = uStack0000000000000040, uStack0000000000000040 == (char *)(lVar2 + 1))) ||
       (*uStack0000000000000040 != ':')) goto code_r0x00750698;
    unaff_x25 = 0;
    pcVar9 = (char *)(lVar2 - (long)pcVar8);
    pcVar6 = uStack0000000000000040;
    lVar2 = 0;
    do {
      pcVar10 = pcVar6 + 1;
      pcVar4 = (char *)_strchr(pcVar10,0x2c);
      if (pcVar4 == (char *)0x0) {
        lVar5 = _strlen(pcVar10);
        pcVar4 = pcVar10 + lVar5;
        pcVar12 = pcVar4;
        if (*pcVar10 == '[') goto code_r0x007503a8;
code_r0x007503e8:
        uVar11 = (long)pcVar4 - (long)pcVar10;
        pcVar12 = pcVar4;
        if (uVar11 == 0) goto LAB_00750370;
LAB_007503f4:
        if (0x3f < uVar11) goto LAB_0075064c;
        ___memcpy_chk(pcVar4,&uStack000000000000004a,pcVar10,uVar11,0x40);
        (&uStack000000000000004a)[uVar11] = 0;
        lVar5 = func_0x0073a7c0(&uStack000000000000004a,uVar3);
        if (lVar5 == 0) {
          uStack0000000000000040 = pcVar12;
          if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          goto code_r0x0075069c;
        }
        if (lVar2 == 0) {
          unaff_x25 = lVar5;
        }
        else {
          *(long *)(lVar2 + 0x28) = lVar5;
        }
      }
      else {
        pcVar12 = pcVar4;
        if (*pcVar10 != '[') goto code_r0x007503e8;
code_r0x007503a8:
        if (pcVar12 == pcVar10) goto code_r0x00750650;
        pcVar4 = pcVar12 + -1;
        if (*pcVar4 != ']') goto LAB_0075064c;
        pcVar10 = pcVar6 + 2;
        uVar11 = (long)pcVar4 - (long)pcVar10;
        if (uVar11 != 0) goto LAB_007503f4;
LAB_00750370:
        lVar5 = lVar2;
      }
      pcVar6 = pcVar12;
      lVar2 = lVar5;
    } while (*pcVar12 != '\0');
    uStack0000000000000040 = pcVar12;
    if (unaff_x25 == 0) goto code_r0x0075069c;
    pcVar6 = pcVar9;
    if (pcVar9 == (char *)0x0) {
      pcVar6 = (char *)_strlen(pcVar8);
    }
    if ((char *)((long)&section_000000b8.reserved1 + 2) < pcVar6) {
      pcVar6 = (char *)((long)&section_000000b8.reserved1 + 3);
    }
    func_0x0077e82c(&uStack000000000000008a,pcVar8,pcVar6);
    iVar1 = func_0x00764560(&uStack000000000000008a + (long)pcVar6,7,":%u");
    if (*(long *)(unaff_x19 + 0xe0) != 0) {
      func_0x00779cfc();
    }
    lVar2 = func_0x0074dc7c(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                            pcVar6 + (long)iVar1 + 1);
    if (lVar2 != 0) {
      if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                      pcVar6 + (long)iVar1 + 1);
    }
    lVar2 = func_0x0074f314();
    if (lVar2 != 0) {
      *(long *)(lVar2 + 0x10) = *(long *)(lVar2 + 0x10) + -1;
    }
    if (*(long *)(unaff_x19 + 0xe0) != 0) {
      func_0x00779d40();
    }
    if (lVar2 == 0) {
      func_0x0073a4d8(unaff_x25);
      uVar7 = 0x1b;
      if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60))
      goto code_r0x00750648;
      return;
    }
    if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    unaff_x28 = in_stack_00000038;
    if ((pcVar9 == (char *)((long)&MACH_HEADER.magic + 1)) && (*pcVar8 == '*')) {
      if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 0x40000;
    }
  }
  lVar2 = _strchr(pcVar8 + 1,0x3a);
  if (lVar2 != 0) {
    unaff_x24 = (char *)_strtoul(lVar2 + 1,0,10);
    unaff_x22 = lVar2 - (long)(pcVar8 + 1);
    if ((unaff_x22 != 0) && (pcVar9 = unaff_x24, unaff_x24 < "\b")) goto code_r0x00750278;
  }
  if ((*(char *)(unaff_x28 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  goto LAB_00750220;
code_r0x00750278:
  if (0xfe < unaff_x22) {
    unaff_x22 = 0xff;
  }
  func_0x0077e82c(&uStack000000000000008a,*unaff_x20 + 1,unaff_x22);
  unaff_w23 = func_0x00764560(&uStack000000000000008a + unaff_x22,7,":%u");
  if (*(long *)(unaff_x19 + 0xe0) != 0) goto code_r0x007502c0;
  goto code_r0x007502d0;
}

