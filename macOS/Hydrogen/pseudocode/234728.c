
void FUN_00234728(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x24;
  undefined8 unaff_x25;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  
  unaff_x19[1] = param_2;
  unaff_x19[2] = param_1 + 0x260;
  *unaff_x19 = unaff_x25;
  if (unaff_x20 != 0) {
    puVar2 = unaff_x24;
    do {
      *puVar2 = 0;
      unaff_x20 = unaff_x20 + -1;
      puVar2 = puVar2 + 1;
    } while (unaff_x20 != 0);
  }
  uStack0000000000000030 = 0;
  for (lVar1 = in_stack_00000020; lVar1 != 0; lVar1 = lVar1 + -1) {
    *unaff_x24 = 0;
    unaff_x24 = unaff_x24 + 1;
  }
  if (in_stack_00000020 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000028,in_stack_00000020,1);
  return;
}

