
/* WARNING: Possible PIC construction at 0x001d505c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001d603c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001d60ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001d6000: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001d60b0) */
/* WARNING: Removing unreachable block (ram,0x001d60b8) */

void FUN_001d5034(void)

{
  code *pcVar1;
  long unaff_x19;
  undefined8 *puVar2;
  long unaff_x21;
  long lVar3;
  long lVar4;
  undefined8 *unaff_x29;
  undefined *puVar5;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (unaff_x21 != 0) {
    puVar2 = *(undefined8 **)(unaff_x19 + 0x2b0);
    pcVar1 = (code *)*puVar2;
    if (pcVar1 != (code *)0x0) {
      (*pcVar1)();
    }
    if (puVar2[1] != 0) {
      puVar5 = (undefined *)0x1d5060;
      goto code_r0x00187bd4;
    }
  }
  unaff_x29 = &uStack0000000000000020;
  lVar3 = *(long *)(unaff_x19 + 0x1a0);
  if (lVar3 == -0x8000000000000000) {
    return;
  }
  if ((*(ulong *)(unaff_x19 + 0x1f0) | 0x8000000000000000) == 0x8000000000000000) {
    lVar4 = *(long *)(unaff_x19 + 0x250);
  }
  else {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1f8),*(ulong *)(unaff_x19 + 0x1f0),1);
    lVar4 = *(long *)(unaff_x19 + 0x250);
  }
  if (lVar4 != 0) {
    puVar2 = *(undefined8 **)(unaff_x19 + 600);
    pcVar1 = (code *)*puVar2;
    if (pcVar1 != (code *)0x0) {
      (*pcVar1)(lVar4);
    }
    if (puVar2[1] != 0) {
      puVar5 = &UNK_001d6004;
      goto code_r0x00187bd4;
    }
  }
  if (lVar3 != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1a8),lVar3,1);
  }
  puVar2 = *(undefined8 **)(unaff_x19 + 0x248);
  pcVar1 = (code *)*puVar2;
  if (pcVar1 != (code *)0x0) {
    (*pcVar1)(*(undefined8 *)(unaff_x19 + 0x240));
  }
  if (puVar2[1] == 0) {
    if (((*(byte *)(unaff_x19 + 0x210) & 1) == 0) &&
       ((*(ulong *)(unaff_x19 + 0x218) | 0x8000000000000000) != 0x8000000000000000)) {
      puVar5 = &UNK_001d60b0;
    }
    else {
      if (*(long *)(unaff_x19 + 0x1c0) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1c8),*(long *)(unaff_x19 + 0x1c0),1);
      }
      if (*(long *)(unaff_x19 + 0x1d8) == 0) {
        return;
      }
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
      unaff_x29 = uStack0000000000000020;
      puVar5 = in_stack_00000028;
    }
  }
  else {
    puVar5 = &UNK_001d6040;
  }
code_r0x00187bd4:
  *(undefined8 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

