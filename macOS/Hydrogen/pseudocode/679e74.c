
void FUN_00679e74(long param_1)

{
  long unaff_x19;
  long *unaff_x20;
  uint uVar1;
  long unaff_x21;
  
  *(long *)(unaff_x19 + 0x18) = param_1;
  if (param_1 != *(long *)(unaff_x21 + 0x18)) {
    _memcpy();
  }
  if (1 < *(uint *)(unaff_x20 + 0x12)) {
    uVar1 = 1;
    do {
      (**(code **)(*unaff_x20 + 0x90))();
      func_0x006771a4();
      uVar1 = uVar1 + 1;
    } while (uVar1 < *(uint *)(unaff_x20 + 0x12));
  }
  return;
}

