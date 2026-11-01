
undefined8 thunk_FUN_0029ee70(undefined8 param_1)

{
  uint uVar1;
  int in_w8;
  long lVar2;
  int iVar3;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  int unaff_w22;
  
  if (0x3f < unaff_w21) {
    _bzero(param_1,unaff_w22 << 3);
    in_w8 = *(int *)(unaff_x20 + 8) + unaff_w22;
  }
  uVar1 = in_w8 + 1;
  lVar2 = (ulong)uVar1 * 8;
  iVar3 = in_w8 + 2;
  do {
    lVar2 = lVar2 + -8;
    iVar3 = iVar3 + -1;
    if (iVar3 < 1) {
      *(uint *)(unaff_x19 + 1) = uVar1 & (int)uVar1 >> 0x1f;
      if (in_w8 < -1) {
        return 1;
      }
      *(undefined4 *)(unaff_x19 + 2) = 0;
      return 1;
    }
  } while (*(long *)(*unaff_x19 + lVar2) == 0);
  *(int *)(unaff_x19 + 1) = iVar3;
  return 1;
}

