
/* WARNING: Possible PIC construction at 0x00509b44: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00509b48) */

void FUN_00509d54(void)

{
  bool in_ZR;
  undefined1 uVar1;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined *puVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_000000a0;
  undefined *in_stack_000000a8;
  undefined1 uStack00000000000000b0;
  
  if (in_ZR) {
    uVar1 = 9;
  }
  else {
    if (*unaff_x20 != 0x656d616e74736f68) {
      *(undefined1 **)(unaff_x29 + -0x40) = &uStack0000000000000008;
      *(undefined **)(unaff_x29 + -0x38) = &DAT_00519924;
      uStack0000000000000030 = &UNK_009e8dc0;
      in_stack_00000038 = 2;
      in_stack_00000040 = unaff_x29 + -0x40;
      in_stack_00000048 = 1;
      in_stack_00000050 = 0;
      func_0x00459f08(&uStack0000000000000018,&uStack0000000000000030);
      unaff_x21[1] = in_stack_00000020;
      *unaff_x21 = uStack0000000000000018;
      unaff_x21[2] = in_stack_00000028;
      puVar2 = &UNK_00509b48;
      goto code_r0x00187bd4;
    }
    uVar1 = 10;
  }
  *(undefined1 *)(unaff_x21 + 1) = uVar1;
  *unaff_x21 = 0x8000000000000000;
  register0x00000008 = (BADSPACEBASE *)&uStack00000000000000b0;
  unaff_x29 = in_stack_000000a0;
  puVar2 = in_stack_000000a8;
code_r0x00187bd4:
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

