
undefined8 FUN_0077c568(long param_1,long param_2)

{
  long lVar1;
  char cVar2;
  byte bVar3;
  long in_x10;
  long lVar4;
  
  for (; (cVar2 = *(char *)(param_2 + 4 + param_1), cVar2 == '\t' || (cVar2 == ' '));
      param_1 = param_1 + 1) {
  }
  if (in_x10 + -4 != param_1) {
    lVar4 = 0;
    do {
      bVar3 = *(byte *)(in_x10 + param_2 + -1 + lVar4);
      if (0x20 < bVar3 || (1L << ((ulong)bVar3 & 0x3f) & 0x100002600U) == 0) {
        lVar4 = (in_x10 - param_1) + lVar4 + -4;
        goto code_r0x0077c5e0;
      }
      lVar1 = in_x10 + lVar4;
      lVar4 = lVar4 + -1;
    } while (lVar1 + -5 != param_1);
  }
  lVar4 = 0;
code_r0x0077c5e0:
  *(undefined1 *)(param_2 + 4 + lVar4 + param_1) = 0;
  func_0x0072a784();
  return 0;
}

