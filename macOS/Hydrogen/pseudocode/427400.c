
void FUN_00427400(void)

{
  int iVar1;
  uint *puVar2;
  undefined4 *unaff_x19;
  int unaff_w20;
  int unaff_w21;
  ulong unaff_x23;
  undefined4 in_stack_00000008;
  
  do {
    iVar1 = _waitpid();
    if (iVar1 != -1) {
      *unaff_x19 = 0;
      unaff_x19[1] = in_stack_00000008;
      if (unaff_w21 == -1) goto LAB_00427458;
      goto LAB_00427450;
    }
    puVar2 = (uint *)___error();
  } while (*puVar2 == 4);
  *(ulong *)(unaff_x19 + 2) = unaff_x23 & 0xffffffff | (ulong)*puVar2 << 0x20;
  *unaff_x19 = 1;
  if (unaff_w21 != -1) {
LAB_00427450:
    _close();
  }
LAB_00427458:
  if (unaff_w20 != -1) {
    _close();
  }
  return;
}

