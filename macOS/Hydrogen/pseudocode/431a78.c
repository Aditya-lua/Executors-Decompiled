
void FUN_00431a78(void)

{
  int iVar1;
  uint *puVar2;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  ulong unaff_x22;
  
  do {
    iVar1 = _open();
    if (iVar1 != -1) {
      uVar3 = 0;
      unaff_x19[1] = iVar1;
      goto LAB_00431abc;
    }
    puVar2 = (uint *)___error();
  } while (*puVar2 == 4);
  *(ulong *)(unaff_x19 + 2) = unaff_x22 & 0xffffffff | (ulong)*puVar2 << 0x20;
  uVar3 = 1;
LAB_00431abc:
  *unaff_x19 = uVar3;
  return;
}

