
/* WARNING: Possible PIC construction at 0x0021b2bc: Changing call to branch */

void FUN_0021b330(void)

{
  long lVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x29;
  undefined *puVar3;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000080;
  undefined *in_stack_00000088;
  undefined1 uStack0000000000000090;
  
  func_0x0079b61c();
  lVar2 = in_stack_00000018;
  lVar1 = in_stack_00000010;
  _memcpy(in_stack_00000010 + in_stack_00000018);
  if (in_stack_00000020 == 0) {
    func_0x0020c220(&uStack0000000000000038,0x30,lVar1,lVar2 + unaff_x20,1,0);
    unaff_x19[1] = in_stack_00000040;
    *unaff_x19 = uStack0000000000000038;
    unaff_x19[2] = in_stack_00000048;
    if (in_stack_00000008 == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000090;
    unaff_x29 = in_stack_00000080;
    puVar3 = in_stack_00000088;
  }
  else {
    puVar3 = &UNK_0021b2c0;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

