
void FUN_0042a3c8(undefined8 *param_1,undefined8 param_2,ulong param_3)

{
  undefined1 *puVar1;
  long lVar2;
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
  
  if (param_3 < 0x180) {
    _memcpy(&uStack0000000000000008,param_2,param_3);
    (&uStack0000000000000008)[param_3] = 0;
    func_0x00462a54(unaff_x29 + -0x38,&uStack0000000000000008,param_3 + 1);
    if (*(int *)(unaff_x29 + -0x38) == 1) {
      *param_1 = 0x8000000000000000;
      param_1[1] = &UNK_009dae48;
    }
    else {
      func_0x00432218(param_1,*(undefined8 *)(unaff_x29 + -0x30));
    }
    return;
  }
  func_0x00459450(&uStack0000000000000180,param_2,param_3);
  lVar2 = in_stack_00000190;
  puVar1 = in_stack_00000188;
  if (uStack0000000000000180 == -0x8000000000000000) {
    (*(code *)&DAT_003f4c90)(param_1,1,in_stack_00000188,in_stack_00000190);
    *puVar1 = 0;
    if (lVar2 == 0) {
      return;
    }
  }
  else {
    *param_1 = 0x8000000000000000;
    param_1[1] = &UNK_009dae48;
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

