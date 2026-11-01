
void FUN_0042ac70(undefined8 param_1,undefined8 param_2)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000180;
  undefined1 *in_stack_00000188;
  long in_stack_00000190;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  
  if (unaff_x20 < 0x180) {
    _memcpy(&uStack0000000000000008);
    (&uStack0000000000000008)[unaff_x20] = 0;
    func_0x00462a54(unaff_x29 + -0x38,&uStack0000000000000008,unaff_x20 + 1);
    if (*(int *)(unaff_x29 + -0x38) == 1) {
      *unaff_x19 = 0x8000000000000000;
      unaff_x19[1] = &UNK_009dae48;
    }
    else {
      func_0x004323bc();
    }
    return;
  }
  func_0x00459450(&uStack0000000000000180,param_2);
  lVar2 = in_stack_00000190;
  puVar1 = in_stack_00000188;
  if (uStack0000000000000180 == -0x8000000000000000) {
    (*(code *)&DAT_003f4d50)(1,in_stack_00000188,in_stack_00000190);
    *puVar1 = 0;
    if (lVar2 == 0) {
      return;
    }
  }
  else {
    *unaff_x19 = 0x8000000000000000;
    unaff_x19[1] = &UNK_009dae48;
    if (uStack0000000000000180 == 0) {
      return;
    }
    lVar2 = uStack0000000000000180;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puVar1,lVar2,1);
  return;
}

