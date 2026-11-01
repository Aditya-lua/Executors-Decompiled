
void FUN_0077ce64(int param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  char *unaff_x26;
  long unaff_x29;
  undefined1 auVar4 [16];
  
  if (!in_ZR) {
    if (param_1 == 0) {
      func_0x0073c9e4();
      iVar3 = 3;
    }
    else {
      func_0x0077e9f4();
      func_0x0073c9e4();
      iVar3 = 0xf;
    }
    goto code_r0x0077de8c;
  }
  if (*(long *)(unaff_x23 + 2) == 0) {
    if (*unaff_x23 != 0x11) {
      *unaff_x23 = 0x11;
    }
    if (*unaff_x26 != '\0') {
      func_0x0073c9e4();
      iVar3 = 2;
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
  }
  else {
code_r0x0077de88:
    iVar3 = 0;
  }
code_r0x0077de8c:
  if (iVar3 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar1 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar1 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar1 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar3;
    uVar1 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar4 = ___stack_chk_fail(uVar1);
  lVar2 = auVar4._0_8_;
  *(byte *)(lVar2 + 0x24) = *(byte *)(lVar2 + 0x24) & 0xfe;
  if (*(long *)(lVar2 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar2 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar2 + 8) + 0x20))(*(long **)(lVar2 + 8),auVar4._8_8_);
  return;
}

