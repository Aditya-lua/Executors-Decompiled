
/* WARNING: Possible PIC construction at 0x00735d84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735db0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735ddc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */

void FUN_00735d68(void)

{
  undefined1 *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  int iVar4;
  long *plVar5;
  long *plVar6;
  long unaff_x19;
  long *plVar7;
  long unaff_x20;
  long unaff_x21;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000000;
  undefined1 *in_stack_00000008;
  ulong in_stack_00000010;
  long *in_stack_00000048;
  long in_stack_00000058;
  undefined8 in_stack_00000068;
  undefined1 uStack000000000000007c;
  uint in_stack_000000d8;
  undefined1 auStack_c0 [128];
  long lStack_30;
  undefined8 uStack_8;
  
  auVar3._8_8_ = unaff_x19;
  auVar3._0_8_ = unaff_x20;
  auVar2._8_8_ = unaff_x19;
  auVar2._0_8_ = unaff_x20;
  auVar11._8_8_ = unaff_x19;
  auVar11._0_8_ = unaff_x20;
  lStack_30 = 0xa2b5f0;
  if (unaff_x21 != 0) {
    plVar5 = (long *)(unaff_x21 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = (undefined *)0x735d88;
      auVar3 = auVar11;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)();
  }
  *(undefined8 *)(unaff_x20 + 0x20) = 0;
  unaff_x21 = *(long *)(unaff_x20 + 0x28);
  if (unaff_x21 != 0) {
    plVar5 = (long *)(unaff_x21 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = (undefined *)0x735db4;
      auVar3 = auVar2;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  *(undefined8 *)(unaff_x20 + 0x28) = 0;
  unaff_x21 = *(long *)(unaff_x20 + 0x30);
  if (unaff_x21 != 0) {
    plVar5 = (long *)(unaff_x21 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = (undefined *)0x735de0;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar5 = in_stack_00000048;
  *(undefined8 *)(unaff_x20 + 0x30) = 0;
  if ((*(byte *)(*(long *)(in_stack_00000048[3] + 0x3a0) + 0x94) & 0x30) != 0) {
    func_0x007706e4();
  }
  if ((((unaff_x19 != 0) && (*(char *)(in_stack_00000058 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) &&
     (((((0 < *(int *)(*plVar5 + 0xc) && (iVar4 = func_0x00731b68(plVar5[1]), iVar4 == 0)) &&
        ((**(code **)(*(long *)plVar5[1] + 0x30))(), *(char *)(in_stack_00000058 + 3) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*plVar5 + 0xc))))) {
    in_stack_00000010 = (ulong)in_stack_000000d8;
    in_stack_00000008 = &uStack000000000000007c;
    in_stack_00000000 = in_stack_00000068;
    func_0x0073cbdc();
  }
  *(long *)(&UNK_00001390 + unaff_x19) = *(long *)(&UNK_00001390 + unaff_x19) + 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  auVar11 = ___stack_chk_fail(0);
  auVar11._8_8_ = auVar11._8_8_;
  auVar3._8_8_ = auVar11._8_8_;
  auVar3._0_8_ = plVar5;
  plVar7 = auVar11._0_8_;
  lStack_30 = 0xa2b5f0;
  uStack_8 = &DAT_0073612c;
  puVar1 = auStack_c0 + 0xb0;
  lVar9 = plVar7[2];
  lVar10 = lVar9;
  if ((((auVar11._8_8_ != 0) && (*(char *)(auVar11._8_8_ + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 auVar11._8_8_ + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + auVar11._8_8_ + 0x18) + 8))))) && (0 < *(int *)(*plVar7 + 0xc))) {
    func_0x0073cbdc(auVar11._8_8_,plVar7,"close");
    lVar10 = plVar7[2];
  }
  lVar8 = *(long *)(lVar10 + 0x20);
  if (lVar8 != 0) {
    plVar5 = (long *)(lVar8 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = &UNK_007361c8;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x19 = auVar11._8_8_;
      unaff_x21 = lVar8;
      lStack_30 = lVar9;
      unaff_x29 = puVar1;
      auVar3 = auVar11;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar8);
  }
  *(undefined8 *)(lVar10 + 0x20) = 0;
  lVar8 = *(long *)(lVar10 + 0x28);
  if (lVar8 != 0) {
    plVar5 = (long *)(lVar8 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = &UNK_007361f4;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x19 = auVar11._8_8_;
      unaff_x21 = lVar8;
      lStack_30 = lVar9;
      unaff_x29 = puVar1;
      auVar3 = auVar11;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar8);
  }
  *(undefined8 *)(lVar10 + 0x28) = 0;
  lVar8 = *(long *)(lVar10 + 0x30);
  if (lVar8 != 0) {
    plVar5 = (long *)(lVar8 + 0x28);
    if (*plVar5 != 0) {
      uStack_8 = &UNK_00736220;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x19 = auVar11._8_8_;
      unaff_x21 = lVar8;
      lStack_30 = lVar9;
      unaff_x29 = puVar1;
      auVar3 = auVar11;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar8);
  }
  *(undefined8 *)(lVar10 + 0x30) = 0;
  plVar5 = plVar7 + 1;
  plVar6 = (long *)*plVar5;
  *(byte *)((long)plVar7 + 0x24) = *(byte *)((long)plVar7 + 0x24) & 0xfe;
  *(undefined4 *)(lVar9 + 0x18) = 0;
  if (plVar6 == (long *)0x0) {
    return;
  }
  (**(code **)(*plVar6 + 0x20))(plVar6,auVar11._8_8_);
code_r0x00730b28:
  *(long *)((long)register0x00000008 + -0x30) = lStack_30;
  *(long *)((long)register0x00000008 + -0x28) = unaff_x21;
  *(long *)((long)register0x00000008 + -0x20) = auVar3._0_8_;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
  plVar7 = (long *)*plVar5;
  if (plVar7 != (long *)0x0) {
    *plVar5 = 0;
    do {
      plVar5 = (long *)plVar7[1];
      plVar7[1] = 0;
      (**(code **)(*plVar7 + 0x10))(plVar7,auVar3._8_8_);
      (*pcRam0000000000a2b5f0)(plVar7);
      plVar7 = plVar5;
    } while (plVar5 != (long *)0x0);
  }
  return;
}

