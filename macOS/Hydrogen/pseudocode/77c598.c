
undefined8 FUN_0077c598(long param_1,long param_2)

{
  long lVar1;
  byte bVar2;
  long in_x9;
  long in_x10;
  long lVar3;
  
  lVar3 = 0;
  do {
    bVar2 = *(byte *)(in_x10 + param_2 + -1 + lVar3);
    if (0x20 < bVar2 || (1L << ((ulong)bVar2 & 0x3f) & 0x100002600U) == 0) {
      lVar3 = (in_x10 - param_1) + lVar3 + -4;
      goto LAB_0077c5e0;
    }
    lVar1 = in_x10 + lVar3;
    lVar3 = lVar3 + -1;
  } while (lVar1 + -5 != param_1);
  lVar3 = 0;
LAB_0077c5e0:
  *(undefined1 *)(in_x9 + lVar3 + param_1) = 0;
  func_0x0072a784();
  return 0;
}

