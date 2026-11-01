
undefined8 FUN_00609e80(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  long in_x9;
  long in_x10;
  
  while( true ) {
    if (in_x10 == 0) {
      return 0;
    }
    puVar1 = (ulong *)(param_1 + in_x10);
    puVar2 = (ulong *)(in_x9 + in_x10);
    if (*puVar2 < *puVar1) break;
    in_x10 = in_x10 + -8;
    if (*puVar1 < *puVar2) {
      return 0xffffffff;
    }
  }
  return 1;
}

