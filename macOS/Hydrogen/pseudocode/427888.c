
void FUN_00427888(void)

{
  int iVar1;
  uint *puVar2;
  uint in_w8;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  undefined4 *unaff_x20;
  ulong unaff_x22;
  undefined8 in_stack_00000008;
  
  do {
    if (in_w8 != 4) {
      *(ulong *)(unaff_x19 + 2) = unaff_x22 & 0xffffffff | (ulong)in_w8 << 0x20;
      uVar3 = 1;
LAB_004278b8:
      *unaff_x19 = uVar3;
      return;
    }
    iVar1 = _waitpid();
    if (iVar1 != -1) {
      *unaff_x20 = 1;
      unaff_x20[1] = in_stack_00000008._4_4_;
      uVar3 = 0;
      unaff_x19[1] = in_stack_00000008._4_4_;
      goto LAB_004278b8;
    }
    puVar2 = (uint *)___error();
    in_w8 = *puVar2;
  } while( true );
}

