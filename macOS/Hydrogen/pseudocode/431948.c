
void FUN_00431948(undefined8 param_1,undefined8 param_2,long param_3)

{
  byte bVar1;
  ushort uVar2;
  int iVar3;
  uint *puVar4;
  undefined4 uVar5;
  undefined4 *unaff_x19;
  ulong uStack0000000000000000;
  
  bVar1 = *(byte *)(param_3 + 8);
  if ((*(byte *)(param_3 + 6) & 1) == 0) {
    if ((*(byte *)(param_3 + 7) & 1) == 0) {
      if ((bVar1 & 1) != 0) goto code_r0x004319c0;
    }
    else {
      if ((bVar1 & 1) == 0) goto LAB_00431a64;
code_r0x004319c0:
      if (((*(byte *)(param_3 + 9) & 1) == 0) || ((*(byte *)(param_3 + 0xb) & 1) != 0))
      goto LAB_00431a64;
    }
code_r0x00431a28:
    *(undefined8 *)(unaff_x19 + 2) = 0x1600000002;
    uVar5 = 1;
  }
  else {
    if ((*(byte *)(param_3 + 7) & 1) == 0) {
      if ((bVar1 & 1) != 0) goto code_r0x004319c0;
      if (((*(byte *)(param_3 + 9) & 1) != 0) ||
         (((*(byte *)(param_3 + 10) & 1) != 0 || ((*(byte *)(param_3 + 0xb) & 1) != 0))))
      goto code_r0x00431a28;
    }
    else if ((bVar1 & 1) != 0) goto code_r0x004319c0;
LAB_00431a64:
    uVar2 = *(ushort *)(param_3 + 4);
    do {
      uStack0000000000000000 = (ulong)uVar2;
      iVar3 = _open();
      if (iVar3 != -1) {
        uVar5 = 0;
        unaff_x19[1] = iVar3;
        goto LAB_00431abc;
      }
      puVar4 = (uint *)___error();
    } while (*puVar4 == 4);
    *(ulong *)(unaff_x19 + 2) = (ulong)*puVar4 << 0x20 | 2;
    uVar5 = 1;
  }
LAB_00431abc:
  *unaff_x19 = uVar5;
  return;
}

