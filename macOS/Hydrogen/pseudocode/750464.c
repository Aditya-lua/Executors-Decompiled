
void FUN_00750464(void)

{
  int iVar1;
  ulong uVar2;
  char *pcVar3;
  long lVar4;
  char *pcVar5;
  long lVar6;
  undefined8 uVar7;
  long unaff_x19;
  long *unaff_x20;
  char *pcVar8;
  ulong uVar9;
  long unaff_x25;
  char *unaff_x26;
  long lVar10;
  long unaff_x29;
  char *in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000008a;
  
  pcVar5 = in_stack_00000030;
  do {
    in_stack_00000030 = pcVar5;
    pcVar5 = in_stack_00000030;
    if (in_stack_00000030 == (char *)0x0) {
      pcVar5 = (char *)_strlen(unaff_x26);
    }
    if ((char *)((long)&section_000000b8.reserved1 + 2) < pcVar5) {
      pcVar5 = (char *)((long)&section_000000b8.reserved1 + 3);
    }
    func_0x0077e82c(&uStack000000000000008a,unaff_x26,pcVar5);
    iVar1 = func_0x00764560(&uStack000000000000008a + (long)pcVar5,7,":%u");
    if (*(long *)(unaff_x19 + 0xe0) != 0) {
      func_0x00779cfc();
    }
    lVar6 = func_0x0074dc7c(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                            pcVar5 + (long)iVar1 + 1);
    if (lVar6 != 0) {
      if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                      pcVar5 + (long)iVar1 + 1);
    }
    lVar6 = func_0x0074f314();
    if (lVar6 != 0) {
      *(long *)(lVar6 + 0x10) = *(long *)(lVar6 + 0x10) + -1;
    }
    if (*(long *)(unaff_x19 + 0xe0) != 0) {
      func_0x00779d40();
    }
    if (lVar6 == 0) {
      func_0x0073a4d8(unaff_x25);
      uVar7 = 0x1b;
      if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60))
      goto LAB_00750648;
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
    if ((in_stack_00000030 == (char *)((long)&MACH_HEADER.magic + 1)) && (*unaff_x26 == '*')) {
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
    while( true ) {
      do {
        unaff_x20 = (long *)unaff_x20[1];
        if (unaff_x20 == (long *)0x0) {
          uVar7 = 0;
          pcVar5 = "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                   unaff_x19 + 0x38;
          pcVar5[0] = '\0';
          pcVar5[1] = '\0';
          pcVar5[2] = '\0';
          pcVar5[3] = '\0';
          pcVar5[4] = '\0';
          pcVar5[5] = '\0';
          pcVar5[6] = '\0';
          pcVar5[7] = '\0';
          if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60))
          goto LAB_00750648;
          return;
        }
        unaff_x26 = (char *)*unaff_x20;
      } while (unaff_x26 == (char *)0x0);
      if (*unaff_x26 != '-') break;
      lVar6 = _strchr(unaff_x26 + 1,0x3a);
      if (lVar6 == 0) {
code_r0x0075043c:
        if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
      }
      else {
        pcVar5 = (char *)_strtoul(lVar6 + 1,0,10);
        uVar2 = lVar6 - (long)(unaff_x26 + 1);
        if ((uVar2 == 0) || (in_stack_00000030 = pcVar5, "\b" <= pcVar5)) goto code_r0x0075043c;
        if (0xfe < uVar2) {
          uVar2 = 0xff;
        }
        func_0x0077e82c(&uStack000000000000008a,*unaff_x20 + 1,uVar2);
        iVar1 = func_0x00764560(&uStack000000000000008a + uVar2,7,":%u");
        if (*(long *)(unaff_x19 + 0xe0) != 0) {
          func_0x00779cfc();
        }
        func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                        uVar2 + (long)iVar1 + 1);
        if (*(long *)(unaff_x19 + 0xe0) != 0) {
          func_0x00779d40();
        }
      }
    }
    if (*unaff_x26 == '+') {
      unaff_x26 = unaff_x26 + 1;
    }
    lVar6 = _strchr(unaff_x26,0x3a);
    if (lVar6 == 0) {
code_r0x00750698:
      unaff_x25 = 0;
LAB_0075069c:
      while( true ) {
        func_0x0073c9e4();
        func_0x0073a4d8(unaff_x25);
        uVar7 = 0x31;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) break;
LAB_00750648:
        ___stack_chk_fail(uVar7);
code_r0x0075064c:
        pcVar8 = in_stack_00000030;
        in_stack_00000030 = pcVar8;
code_r0x00750650:
        uStack0000000000000040 = pcVar8;
      }
      return;
    }
    uVar2 = _strtoul((char *)(lVar6 + 1),&uStack0000000000000040,10);
    if (((uVar2 >> 0x10 != 0) ||
        (in_stack_00000030 = uStack0000000000000040, uStack0000000000000040 == (char *)(lVar6 + 1)))
       || (*uStack0000000000000040 != ':')) goto code_r0x00750698;
    unaff_x25 = 0;
    pcVar5 = uStack0000000000000040;
    lVar10 = 0;
    do {
      pcVar8 = pcVar5 + 1;
      pcVar3 = (char *)_strchr(pcVar8,0x2c);
      if (pcVar3 == (char *)0x0) {
        lVar4 = _strlen(pcVar8);
        pcVar3 = pcVar8 + lVar4;
        in_stack_00000030 = pcVar3;
        if (*pcVar8 == '[') goto code_r0x007503a8;
code_r0x007503e8:
        uVar9 = (long)pcVar3 - (long)pcVar8;
        in_stack_00000030 = pcVar3;
        if (uVar9 == 0) goto code_r0x00750370;
code_r0x007503f4:
        if (0x3f < uVar9) goto code_r0x0075064c;
        ___memcpy_chk(pcVar3,&uStack000000000000004a,pcVar8,uVar9,0x40);
        (&uStack000000000000004a)[uVar9] = 0;
        lVar4 = func_0x0073a7c0(&uStack000000000000004a,uVar2);
        if (lVar4 == 0) {
          uStack0000000000000040 = in_stack_00000030;
          if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          goto LAB_0075069c;
        }
        if (lVar10 == 0) {
          unaff_x25 = lVar4;
        }
        else {
          *(long *)(lVar10 + 0x28) = lVar4;
        }
      }
      else {
        in_stack_00000030 = pcVar3;
        if (*pcVar8 != '[') goto code_r0x007503e8;
code_r0x007503a8:
        if (in_stack_00000030 == pcVar8) goto code_r0x00750650;
        pcVar3 = in_stack_00000030 + -1;
        if (*pcVar3 != ']') goto code_r0x0075064c;
        pcVar8 = pcVar5 + 2;
        uVar9 = (long)pcVar3 - (long)pcVar8;
        if (uVar9 != 0) goto code_r0x007503f4;
code_r0x00750370:
        lVar4 = lVar10;
      }
      pcVar5 = in_stack_00000030;
      lVar10 = lVar4;
    } while (*in_stack_00000030 != '\0');
    pcVar5 = (char *)(lVar6 - (long)unaff_x26);
    uStack0000000000000040 = in_stack_00000030;
    if (unaff_x25 == 0) goto LAB_0075069c;
  } while( true );
}

