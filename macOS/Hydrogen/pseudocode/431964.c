
void FUN_00431964(undefined8 param_1,undefined8 param_2,long param_3)

{
  ushort uVar1;
  int iVar2;
  uint *puVar3;
  undefined4 uVar4;
  ulong in_x9;
  undefined4 *unaff_x19;
  ulong uStack0000000000000000;
  
  if ((((in_x9 & 1) == 0) || ((*(byte *)(param_3 + 9) & 1) == 0)) ||
     ((*(byte *)(param_3 + 0xb) & 1) != 0)) {
    uVar1 = *(ushort *)(param_3 + 4);
    do {
      uStack0000000000000000 = (ulong)uVar1;
      iVar2 = _open();
      if (iVar2 != -1) {
        uVar4 = 0;
        unaff_x19[1] = iVar2;
        goto LAB_00431abc;
      }
      puVar3 = (uint *)___error();
    } while (*puVar3 == 4);
    *(ulong *)(unaff_x19 + 2) = (ulong)*puVar3 << 0x20 | 2;
    uVar4 = 1;
  }
  else {
    *(undefined8 *)(unaff_x19 + 2) = 0x1600000002;
    uVar4 = 1;
  }
LAB_00431abc:
  *unaff_x19 = uVar4;
  return;
}

