
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */

void FUN_00736160(void)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  long *unaff_x20;
  long lVar4;
  long unaff_x22;
  long lVar5;
  undefined8 unaff_x29;
  undefined8 uVar6;
  long in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  lVar5 = unaff_x22;
  if (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))) {
    func_0x0073cbdc();
    lVar5 = unaff_x20[2];
  }
  lVar4 = *(long *)(lVar5 + 0x20);
  lVar3 = unaff_x19;
  if (lVar4 != 0) {
    plVar1 = (long *)(lVar4 + 0x28);
    if (*plVar1 != 0) {
      uVar6 = 0x7361c8;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar4);
  }
  *(undefined8 *)(lVar5 + 0x20) = 0;
  lVar4 = *(long *)(lVar5 + 0x28);
  if (lVar4 != 0) {
    plVar1 = (long *)(lVar4 + 0x28);
    if (*plVar1 != 0) {
      uVar6 = 0x7361f4;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar4);
  }
  *(undefined8 *)(lVar5 + 0x28) = 0;
  lVar4 = *(long *)(lVar5 + 0x30);
  if (lVar4 != 0) {
    plVar1 = (long *)(lVar4 + 0x28);
    if (*plVar1 != 0) {
      uVar6 = 0x736220;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(lVar4);
  }
  *(undefined8 *)(lVar5 + 0x30) = 0;
  plVar1 = unaff_x20 + 1;
  plVar2 = (long *)*plVar1;
  *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) & 0xfe;
  *(undefined4 *)(unaff_x22 + 0x18) = 0;
  if (plVar2 == (long *)0x0) {
    return;
  }
  (**(code **)(*plVar2 + 0x20))();
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  lVar3 = in_stack_00000028;
  unaff_x20 = in_stack_00000020;
  lVar4 = in_stack_00000018;
  unaff_x22 = in_stack_00000010;
  unaff_x29 = in_stack_00000030;
  uVar6 = in_stack_00000038;
code_r0x00730b28:
  *(long *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(long *)((long)register0x00000008 + -0x28) = lVar4;
  *(long **)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = lVar3;
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar6;
  plVar2 = (long *)*plVar1;
  if (plVar2 != (long *)0x0) {
    *plVar1 = 0;
    do {
      plVar1 = (long *)plVar2[1];
      plVar2[1] = 0;
      (**(code **)(*plVar2 + 0x10))(plVar2,unaff_x19);
      (*pcRam0000000000a2b5f0)(plVar2);
      plVar2 = plVar1;
    } while (plVar1 != (long *)0x0);
  }
  return;
}

