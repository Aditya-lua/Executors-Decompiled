
/* WARNING: Possible PIC construction at 0x0018dddc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0018dde0) */

void FUN_0018dd8c(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 unaff_x29;
  undefined *puVar5;
  undefined8 in_stack_00000040;
  undefined *in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = 0;
  while( true ) {
    puVar1 = (undefined8 *)(unaff_x19 + lVar2 * 0x20);
    _CFRelease(*puVar1);
    lVar3 = puVar1[3];
    if (lVar3 != 0) {
      puVar4 = (undefined8 *)puVar1[2];
      do {
        _CFRelease(*puVar4);
        lVar3 = lVar3 + -1;
        puVar4 = puVar4 + 1;
      } while (lVar3 != 0);
    }
    if (puVar1[1] != 0) break;
    lVar2 = lVar2 + 1;
    if (lVar2 == unaff_x21) {
      if (unaff_x20 == 0) {
        return;
      }
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
      unaff_x29 = in_stack_00000040;
      puVar5 = in_stack_00000048;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
  }
  puVar5 = &UNK_0018dde0;
  goto code_r0x00187bd4;
}

