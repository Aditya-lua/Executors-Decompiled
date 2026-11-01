
void FUN_00427860(void)

{
  int iVar1;
  uint *puVar2;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  undefined4 *unaff_x20;
  undefined8 uStack0000000000000008;
  
  uVar3 = unaff_x20[2];
  do {
    iVar1 = _waitpid(uVar3,(long)&uStack0000000000000008 + 4,0);
    if (iVar1 != -1) {
      *unaff_x20 = 1;
      unaff_x20[1] = uStack0000000000000008._4_4_;
      uVar3 = 0;
      unaff_x19[1] = uStack0000000000000008._4_4_;
      goto LAB_004278b8;
    }
    puVar2 = (uint *)___error();
  } while (*puVar2 == 4);
  *(ulong *)(unaff_x19 + 2) = (ulong)*puVar2 << 0x20 | 2;
  uVar3 = 1;
LAB_004278b8:
  *unaff_x19 = uVar3;
  return;
}

