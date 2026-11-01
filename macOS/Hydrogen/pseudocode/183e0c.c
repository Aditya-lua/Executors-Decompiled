
/* WARNING: Possible PIC construction at 0x00183e24: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00183e28) */

void FUN_00183e0c(void)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  do {
    lVar2 = unaff_x21[-1];
    if (lVar2 != unaff_x22 && lVar2 != 0) {
      lVar1 = *unaff_x21;
      uVar3 = 1;
      uVar4 = 0x183e28;
      goto code_r0x00187bd4;
    }
    unaff_x21 = unaff_x21 + 3;
    unaff_x20 = unaff_x20 + -1;
  } while (unaff_x20 != 0);
  if (*unaff_x19 == 0) {
    return;
  }
  lVar1 = unaff_x19[1];
  lVar2 = *unaff_x19 * 0x18;
  uVar3 = 8;
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
  unaff_x29 = in_stack_00000020;
  uVar4 = in_stack_00000028;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,uVar3);
  return;
}

