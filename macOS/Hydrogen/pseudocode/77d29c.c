
void FUN_0077d29c(void)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x24;
  int *piVar5;
  ulong uVar6;
  undefined8 uVar7;
  char *unaff_x26;
  int unaff_w28;
  long unaff_x29;
  undefined1 auVar8 [16];
  int in_stack_00000050;
  
  func_0x0074ef88();
  lVar3 = *(long *)(unaff_x24 + 0x20);
  *(undefined1 *)(unaff_x23 + 5) = *(undefined1 *)(lVar3 + 4);
  *(undefined1 *)((long)unaff_x23 + 0x15) = *(undefined1 *)(lVar3 + 5);
  *(undefined1 *)((long)unaff_x23 + 0x16) = *(undefined1 *)(lVar3 + 6);
  *(undefined1 *)((long)unaff_x23 + 0x17) = *(undefined1 *)(lVar3 + 7);
  if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x21 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x21 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  func_0x00750010();
  piVar5 = unaff_x23 + 6;
  *(undefined1 *)piVar5 = 0;
  lVar3 = *(long *)(unaff_x23 + 0xa0);
  if (lVar3 != 0) {
    uVar1 = _strlen(lVar3);
    if (0xff < uVar1) {
      func_0x0073c9e4();
      iVar2 = 0xb;
      goto code_r0x0077de8c;
    }
    _memcpy(piVar5,lVar3,uVar1 + 1);
  }
  lVar3 = _strlen(piVar5);
  uVar1 = lVar3 + 9;
  uVar6 = uVar1;
  if (unaff_w28 == 6) {
    unaff_x23[5] = 0x1000000;
    uVar7 = *(undefined8 *)(unaff_x23 + 0x9c);
    lVar3 = _strlen(uVar7);
    if ((0xff < lVar3 + 1U) || (uVar6 = lVar3 + 1U + uVar1, 599 < uVar6)) {
      func_0x0073c9e4();
      iVar2 = 9;
      goto code_r0x0077de8c;
    }
    _strcpy(unaff_x26 + uVar1,uVar7);
  }
  *(char **)(unaff_x23 + 0x9a) = unaff_x26;
  *(ulong *)(unaff_x23 + 2) = uVar6;
  if (*unaff_x23 != 0xe) {
    *unaff_x23 = 0xe;
  }
  lVar3 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
  if (lVar3 < 1) {
    if (in_stack_00000050 == 0x51) {
      lVar4 = *(long *)(unaff_x23 + 2);
      goto joined_r0x0077d4c8;
    }
    if (in_stack_00000050 != 0) {
      func_0x0077e9f4();
      func_0x0073c9e4();
      iVar2 = 0x1d;
      goto code_r0x0077de8c;
    }
code_r0x0077df08:
    func_0x0073c9e4();
    iVar2 = 3;
    goto code_r0x0077de8c;
  }
  lVar4 = *(long *)(unaff_x23 + 2) - lVar3;
  *(long *)(unaff_x23 + 2) = lVar4;
  *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar3;
joined_r0x0077d4c8:
  if (lVar4 == 0) {
    unaff_x23[2] = 8;
    unaff_x23[3] = 0;
    *(char **)(unaff_x23 + 0x9a) = unaff_x26;
    if (*unaff_x23 != 4) {
      *unaff_x23 = 4;
    }
    lVar3 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
    if (lVar3 < 1) {
      if (in_stack_00000050 != 0x51) {
        if (in_stack_00000050 != 0) {
          func_0x0077e9f4();
          func_0x0073c9e4();
          iVar2 = 0xf;
          goto code_r0x0077de8c;
        }
        goto code_r0x0077df08;
      }
      lVar4 = *(long *)(unaff_x23 + 2);
    }
    else {
      lVar4 = *(long *)(unaff_x23 + 2) - lVar3;
      *(long *)(unaff_x23 + 2) = lVar4;
      *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar3;
    }
    if (lVar4 == 0) {
      if (*unaff_x23 != 0x11) {
        *unaff_x23 = 0x11;
      }
      if (*unaff_x26 != '\0') {
        func_0x0073c9e4();
        iVar2 = 2;
        goto code_r0x0077de8c;
      }
      switch(*(undefined1 *)((long)unaff_x23 + 0x11)) {
      case 0x5a:
        if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x21 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x21 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        goto code_r0x0077de88;
      case 0x5b:
        func_0x0073c9e4();
        iVar2 = 0x1a;
        break;
      case 0x5c:
        func_0x0073c9e4();
        iVar2 = 7;
        break;
      case 0x5d:
        func_0x0073c9e4();
        iVar2 = 8;
        break;
      default:
        func_0x0073c9e4();
        iVar2 = 0x1f;
      }
      goto code_r0x0077de8c;
    }
  }
code_r0x0077de88:
  iVar2 = 0;
code_r0x0077de8c:
  if (iVar2 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar7 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar7 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar7 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar2;
    uVar7 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar8 = ___stack_chk_fail(uVar7);
  lVar3 = auVar8._0_8_;
  *(byte *)(lVar3 + 0x24) = *(byte *)(lVar3 + 0x24) & 0xfe;
  if (*(long *)(lVar3 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar3 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar3 + 8) + 0x20))(*(long **)(lVar3 + 8),auVar8._8_8_);
  return;
}

