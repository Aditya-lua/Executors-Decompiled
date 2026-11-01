
void FUN_005fba3c(long param_1)

{
  uint in_w9;
  ulong in_x10;
  long lVar1;
  ulong unaff_x19;
  
  do {
    lVar1 = *(long *)(param_1 + in_x10 * 8);
    *(long *)(param_1 + in_x10 * 8) = lVar1 + 1;
    in_x10 = (ulong)in_w9;
    in_w9 = in_w9 + 1;
  } while ((lVar1 == -1 && in_x10 <= unaff_x19) && (lVar1 != -1 || unaff_x19 != in_x10));
  return;
}

