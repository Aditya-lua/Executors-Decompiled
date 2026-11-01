
undefined8 FUN_000957d4(long param_1)

{
  long lVar1;
  long lVar2;
  
  if (*(long *)(param_1 + 0x20) == 0) goto LAB_00095854;
  lVar1 = *(long *)(param_1 + 0x28);
  lVar2 = lVar1 + -1;
  *(long *)(param_1 + 0x28) = lVar2;
  if (lVar1 == 0) {
LAB_0009584c:
    _free();
  }
  else {
    do {
      lVar1 = *(long *)(*(long *)(*(long *)(param_1 + 0x20) + lVar2 * 8) + 8);
      if (lVar1 == 0) {
LAB_00095800:
        _free();
        lVar1 = *(long *)(param_1 + 0x28);
      }
      else {
        _free(lVar1);
        lVar1 = *(long *)(param_1 + 0x28);
        if (*(long *)(*(long *)(param_1 + 0x20) + lVar1 * 8) != 0) goto LAB_00095800;
      }
      lVar2 = lVar1 + -1;
      *(long *)(param_1 + 0x28) = lVar2;
    } while (lVar1 != 0);
    if (*(long *)(param_1 + 0x20) != 0) goto LAB_0009584c;
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
LAB_00095854:
  if (*(long *)(param_1 + 0x10) != 0) {
    _free();
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  if (*(long *)(param_1 + 8) != 0) {
    _free();
    *(undefined8 *)(param_1 + 8) = 0;
  }
  return 0;
}

