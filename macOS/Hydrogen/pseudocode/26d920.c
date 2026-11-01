
undefined8 FUN_0026d920(void)

{
  ulong uVar1;
  int iVar2;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  undefined8 in_stack_00000008;
  
  iVar2 = _memcmp();
  if (iVar2 != 0) {
    unaff_x22 = (long)iVar2;
  }
  if (-1 < (long)(unaff_x22 ^ unaff_x26)) {
    iVar2 = _memcmp(in_stack_00000008);
    uVar1 = unaff_x25 - unaff_x27;
    if (iVar2 != 0) {
      uVar1 = (long)iVar2;
    }
    unaff_x21 = unaff_x19;
    if (-1 < (long)(uVar1 ^ unaff_x26)) {
      unaff_x21 = unaff_x20;
    }
  }
  return unaff_x21;
}

