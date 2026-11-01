
void FUN_0077d37c(void)

{
  long lVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  char *unaff_x26;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined1 auVar5 [16];
  int in_stack_00000050;
  
  _strcpy();
  *(char **)(unaff_x23 + 0x9a) = unaff_x26;
  *(undefined8 *)(unaff_x23 + 2) = unaff_x27;
  if (*unaff_x23 != 0xe) {
    *unaff_x23 = 0xe;
  }
  lVar1 = func_0x00731184(*(undefined8 *)(unaff_x20 + 8));
  if (lVar1 < 1) {
    if (in_stack_00000050 == 0x51) {
      lVar4 = *(long *)(unaff_x23 + 2);
      goto joined_r0x0077d4c8;
    }
    if (in_stack_00000050 != 0) {
      func_0x0077e9f4();
      func_0x0073c9e4();
      iVar3 = 0x1d;
      goto LAB_0077de8c;
    }
LAB_0077df08:
    func_0x0073c9e4();
    iVar3 = 3;
    goto LAB_0077de8c;
  }
  lVar4 = *(long *)(unaff_x23 + 2) - lVar1;
  *(long *)(unaff_x23 + 2) = lVar4;
  *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar1;
joined_r0x0077d4c8:
  if (lVar4 == 0) {
    unaff_x23[2] = 8;
    unaff_x23[3] = 0;
    *(char **)(unaff_x23 + 0x9a) = unaff_x26;
    if (*unaff_x23 != 4) {
      *unaff_x23 = 4;
    }
    lVar1 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
    if (lVar1 < 1) {
      if (in_stack_00000050 != 0x51) {
        if (in_stack_00000050 != 0) {
          func_0x0077e9f4();
          func_0x0073c9e4();
          iVar3 = 0xf;
          goto LAB_0077de8c;
        }
        goto LAB_0077df08;
      }
      lVar4 = *(long *)(unaff_x23 + 2);
    }
    else {
      lVar4 = *(long *)(unaff_x23 + 2) - lVar1;
      *(long *)(unaff_x23 + 2) = lVar4;
      *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar1;
    }
    if (lVar4 == 0) {
      if (*unaff_x23 != 0x11) {
        *unaff_x23 = 0x11;
      }
      if (*unaff_x26 != '\0') {
        func_0x0073c9e4();
        iVar3 = 2;
        goto LAB_0077de8c;
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
        goto LAB_0077de88;
      case 0x5b:
        func_0x0073c9e4();
        iVar3 = 0x1a;
        break;
      case 0x5c:
        func_0x0073c9e4();
        iVar3 = 7;
        break;
      case 0x5d:
        func_0x0073c9e4();
        iVar3 = 8;
        break;
      default:
        func_0x0073c9e4();
        iVar3 = 0x1f;
      }
      goto LAB_0077de8c;
    }
  }
LAB_0077de88:
  iVar3 = 0;
LAB_0077de8c:
  if (iVar3 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar2 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar2 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar2 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar3;
    uVar2 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar5 = ___stack_chk_fail(uVar2);
  lVar1 = auVar5._0_8_;
  *(byte *)(lVar1 + 0x24) = *(byte *)(lVar1 + 0x24) & 0xfe;
  if (*(long *)(lVar1 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar1 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar1 + 8) + 0x20))(*(long **)(lVar1 + 8),auVar5._8_8_);
  return;
}

