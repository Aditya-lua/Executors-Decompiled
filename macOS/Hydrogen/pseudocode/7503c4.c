
void FUN_007503c4(char *param_1)

{
  char cVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  undefined8 uVar6;
  long unaff_x19;
  long *unaff_x20;
  char *unaff_x22;
  char *pcVar7;
  char *unaff_x24;
  long unaff_x25;
  char *unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  char *in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000008a;
  
code_r0x007503c4:
  uVar2 = (long)param_1 - (long)unaff_x22;
  lVar4 = unaff_x28;
  do {
    if (uVar2 == 0) {
      unaff_x28 = lVar4;
    }
    else {
      pcVar5 = unaff_x24;
      if (0x3f < uVar2) goto LAB_0075064c;
      ___memcpy_chk(param_1,&uStack000000000000004a,unaff_x22,uVar2,0x40);
      (&uStack000000000000004a)[uVar2] = 0;
      unaff_x28 = func_0x0073a7c0(&uStack000000000000004a,unaff_x27);
      if (unaff_x28 == 0) {
        uStack0000000000000040 = unaff_x24;
        if (-1 < *(char *)(in_stack_00000038 + 3)) goto code_r0x0075069c;
        if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) != 0) &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0075069c;
        func_0x0073cab8();
        goto code_r0x0075069c;
      }
      if (lVar4 == 0) {
        unaff_x25 = unaff_x28;
      }
      else {
        *(long *)(lVar4 + 0x28) = unaff_x28;
      }
    }
    pcVar7 = unaff_x24;
    if (*unaff_x24 == '\0') {
      uStack0000000000000040 = unaff_x24;
      if (unaff_x25 == 0) goto code_r0x0075069c;
      pcVar5 = in_stack_00000030;
      if (in_stack_00000030 == (char *)0x0) {
        pcVar5 = (char *)_strlen(unaff_x26);
      }
      if ((char *)((long)&section_000000b8.reserved1 + 2) < pcVar5) {
        pcVar5 = (char *)((long)&section_000000b8.reserved1 + 3);
      }
      func_0x0077e82c(&uStack000000000000008a,unaff_x26,pcVar5);
      iVar3 = func_0x00764560(&uStack000000000000008a + (long)pcVar5,7,":%u");
      if (*(long *)(unaff_x19 + 0xe0) != 0) {
        func_0x00779cfc();
      }
      lVar4 = func_0x0074dc7c(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                              pcVar5 + (long)iVar3 + 1);
      if (lVar4 != 0) {
        if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                        pcVar5 + (long)iVar3 + 1);
      }
      lVar4 = func_0x0074f314();
      if (lVar4 != 0) {
        *(long *)(lVar4 + 0x10) = *(long *)(lVar4 + 0x10) + -1;
      }
      if (*(long *)(unaff_x19 + 0xe0) != 0) {
        func_0x00779d40();
      }
      if (lVar4 == 0) {
        func_0x0073a4d8(unaff_x25);
        uVar6 = 0x1b;
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
            uVar6 = 0;
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
            goto code_r0x00750648;
            return;
          }
          unaff_x26 = (char *)*unaff_x20;
        } while (unaff_x26 == (char *)0x0);
        if (*unaff_x26 != '-') break;
        lVar4 = _strchr(unaff_x26 + 1,0x3a);
        if (lVar4 == 0) {
code_r0x0075043c:
          if ((*(char *)(in_stack_00000038 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
        }
        else {
          pcVar5 = (char *)_strtoul(lVar4 + 1,0,10);
          uVar2 = lVar4 - (long)(unaff_x26 + 1);
          if ((uVar2 == 0) || (in_stack_00000030 = pcVar5, "\b" <= pcVar5)) goto code_r0x0075043c;
          if (0xfe < uVar2) {
            uVar2 = 0xff;
          }
          func_0x0077e82c(&uStack000000000000008a,*unaff_x20 + 1,uVar2);
          iVar3 = func_0x00764560(&uStack000000000000008a + uVar2,7,":%u");
          if (*(long *)(unaff_x19 + 0xe0) != 0) {
            func_0x00779cfc();
          }
          func_0x0074dbbc(*(undefined8 *)(unaff_x19 + 0xc0),&uStack000000000000008a,
                          uVar2 + (long)iVar3 + 1);
          if (*(long *)(unaff_x19 + 0xe0) != 0) {
            func_0x00779d40();
          }
        }
      }
      if (*unaff_x26 == '+') {
        unaff_x26 = unaff_x26 + 1;
      }
      lVar4 = _strchr(unaff_x26,0x3a);
      unaff_x24 = in_stack_00000030;
      if (lVar4 == 0) {
code_r0x00750698:
        unaff_x25 = 0;
        goto code_r0x0075069c;
      }
      unaff_x27 = _strtoul((char *)(lVar4 + 1),&uStack0000000000000040,10);
      if (((unaff_x27 >> 0x10 != 0) ||
          (unaff_x24 = uStack0000000000000040, uStack0000000000000040 == (char *)(lVar4 + 1))) ||
         (*uStack0000000000000040 != ':')) goto code_r0x00750698;
      unaff_x28 = 0;
      unaff_x25 = 0;
      in_stack_00000030 = (char *)(lVar4 - (long)unaff_x26);
      pcVar7 = uStack0000000000000040;
    }
    pcVar5 = pcVar7 + 1;
    unaff_x24 = (char *)_strchr(pcVar5,0x2c);
    if (unaff_x24 == (char *)0x0) {
      lVar4 = _strlen(pcVar5);
      unaff_x24 = pcVar5 + lVar4;
      cVar1 = *pcVar5;
    }
    else {
      cVar1 = *pcVar5;
    }
    if (cVar1 == '[') break;
    uVar2 = (long)unaff_x24 - (long)pcVar5;
    param_1 = unaff_x24;
    unaff_x22 = pcVar5;
    lVar4 = unaff_x28;
  } while( true );
  if (unaff_x24 == pcVar5) goto code_r0x00750650;
  param_1 = unaff_x24 + -1;
  pcVar5 = unaff_x24;
  if (*param_1 != ']') {
LAB_0075064c:
    while( true ) {
      unaff_x24 = pcVar5;
code_r0x00750650:
      uStack0000000000000040 = pcVar5;
code_r0x0075069c:
      func_0x0073c9e4();
      func_0x0073a4d8(unaff_x25);
      uVar6 = 0x31;
      in_stack_00000030 = unaff_x24;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) break;
code_r0x00750648:
      ___stack_chk_fail(uVar6);
      pcVar5 = in_stack_00000030;
    }
    return;
  }
  unaff_x22 = pcVar7 + 2;
  goto code_r0x007503c4;
}

