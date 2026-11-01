
/* WARNING: Removing unreachable block (ram,0x0077d4e8) */
/* WARNING: Removing unreachable block (ram,0x0077d4ec) */

void FUN_0077dc64(void)

{
  byte bVar1;
  char cVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  char *unaff_x24;
  long unaff_x29;
  undefined1 auVar7 [16];
  int in_stack_00000050;
  
  if (in_stack_00000050 != 0x51) {
    if (in_stack_00000050 == 0) {
      func_0x0073c9e4();
      iVar4 = 3;
    }
    else {
      func_0x0077e9f4();
      func_0x0073c9e4();
      iVar4 = 0x10;
    }
    goto code_r0x0077de8c;
  }
  if (*(long *)(unaff_x23 + 2) == 0) {
    if (*unaff_x24 != '\x05') {
      func_0x0073c9e4();
      iVar4 = 2;
      goto code_r0x0077de8c;
    }
    bVar1 = *(byte *)((long)unaff_x23 + 0x11);
    if (bVar1 != 0) {
      func_0x0073c9e4();
      if (bVar1 < 9) {
        iVar4 = *(int *)(&UNK_008ce3dc + (ulong)bVar1 * 4);
      }
      else {
        iVar4 = 0x19;
      }
      goto code_r0x0077de8c;
    }
    cVar2 = *(char *)((long)unaff_x23 + 0x13);
    if (cVar2 != '\x01') {
      if (cVar2 == '\x03') {
        if ((ulong)*(byte *)(unaff_x23 + 5) < 4) goto code_r0x0077d0f8;
        lVar6 = (ulong)*(byte *)(unaff_x23 + 5) + 7;
      }
      else {
        if (cVar2 != '\x04') {
          func_0x0073c9e4();
          iVar4 = 1;
          goto code_r0x0077de8c;
        }
        lVar6 = 0x16;
      }
      *(long *)(unaff_x23 + 2) = lVar6 + -10;
      *(long *)(unaff_x23 + 0x9a) = (long)unaff_x23 + 0x1a;
      if (*unaff_x23 != 0x10) {
        *unaff_x23 = 0x10;
      }
      lVar6 = func_0x007311a4(*(undefined8 *)(unaff_x20 + 8));
      if (lVar6 < 1) {
        lVar5 = *(long *)(unaff_x23 + 2);
      }
      else {
        lVar5 = *(long *)(unaff_x23 + 2) - lVar6;
        *(long *)(unaff_x23 + 2) = lVar5;
        *(long *)(unaff_x23 + 0x9a) = *(long *)(unaff_x23 + 0x9a) + lVar6;
      }
      if (lVar5 != 0) goto code_r0x0077de88;
    }
code_r0x0077d0f8:
    if (*unaff_x23 != 0x11) {
      *unaff_x23 = 0x11;
    }
    if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x21 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x21 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
code_r0x0077de88:
  iVar4 = 0;
code_r0x0077de8c:
  if (iVar4 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar3 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar3 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar3 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = iVar4;
    uVar3 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar7 = ___stack_chk_fail(uVar3);
  lVar6 = auVar7._0_8_;
  *(byte *)(lVar6 + 0x24) = *(byte *)(lVar6 + 0x24) & 0xfe;
  if (*(long *)(lVar6 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar6 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar6 + 8) + 0x20))(*(long **)(lVar6 + 8),auVar7._8_8_);
  return;
}

