
bool FUN_0077e720(undefined8 param_1,byte *param_2)

{
  byte bVar1;
  uint in_w8;
  byte *in_x9;
  long in_x10;
  ulong in_x11;
  
  while( true ) {
    if (in_w8 != *(byte *)(in_x10 + in_x11)) {
      return false;
    }
    param_2 = param_2 + 1;
    bVar1 = *in_x9;
    if ((bVar1 == 0) || (in_x11 = (ulong)*param_2, in_x11 == 0)) break;
    in_w8 = (uint)*(byte *)(in_x10 + (ulong)bVar1);
    in_x9 = in_x9 + 1;
  }
  return (bVar1 != 0) != (*param_2 == 0);
}

