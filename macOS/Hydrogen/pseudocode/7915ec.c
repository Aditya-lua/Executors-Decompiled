
uint FUN_007915ec(void)

{
  char in_NG;
  char in_OV;
  long lVar1;
  byte bVar2;
  long *unaff_x19;
  char *unaff_x20;
  long unaff_x29;
  undefined8 in_stack_00000010;
  
  if ((in_NG == in_OV) && (0 < *(int *)(*unaff_x19 + 0xc))) {
    func_0x0073cbdc();
  }
  if (in_stack_00000010._4_4_ == 0) {
    in_stack_00000010._4_4_ = 0;
    bVar2 = *unaff_x20 << 1;
  }
  else {
    bVar2 = 2;
  }
  *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) & 0xfd | bVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return in_stack_00000010._4_4_;
  }
  lVar1 = ___stack_chk_fail(in_stack_00000010._4_4_);
  return *(byte *)(*(long *)(*(long *)(lVar1 + 0x10) + 0x40) + 0x18) & 1;
}

