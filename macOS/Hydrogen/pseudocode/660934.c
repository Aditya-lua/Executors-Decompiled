
/* WARNING: Removing unreachable block (ram,0x006609a0) */

void FUN_00660934(long param_1)

{
  ulong uVar1;
  long *plVar2;
  undefined8 *unaff_x19;
  long *unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  unaff_x19[5] = param_1 + 0x938;
  func_0x00660bb4();
  unaff_x19[4] = &UNK_009fcef8;
  unaff_x19[5] = &UNK_009fcfd8;
  *unaff_x19 = &UNK_00a0b5d8;
  unaff_x19[1] = &UNK_00a0b6b0;
  unaff_x19[2] = &UNK_00a0b708;
  unaff_x19[3] = &UNK_009fce60;
  uVar1 = func_0x0065f564();
  if ((uVar1 & 1) == 0) {
    plVar2 = (long *)(**(code **)(*unaff_x20 + 0x18))();
    (**(code **)(*(long *)((long)plVar2 + *(long *)(*plVar2 + -0x70)) + 0x18))();
    func_0x0065f8ec();
    func_0x0065f6bc(&uStack0000000000000008,"PrivateExponent",0x28,1);
  }
  return;
}

