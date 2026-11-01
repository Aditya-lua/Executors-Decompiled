
void FUN_0011f28c(ulong param_1,long param_2)

{
  bool bVar1;
  long in_x9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  
  if (in_x12 != in_x11) {
    do {
      *(undefined2 *)(param_2 + in_x11 * 2) = *(undefined2 *)(in_x9 + in_x10 * 2 + in_x11 * 2);
      bVar1 = in_x11 < param_1;
      in_x11 = in_x11 + 1;
    } while (bVar1);
  }
  return;
}

