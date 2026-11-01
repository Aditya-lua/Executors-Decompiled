
void FUN_0059f340(long param_1)

{
  long unaff_x19;
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)(param_1 + 8);
  do {
    if (puVar1[-1] != 0) {
      func_0x00187bd4(*puVar1,puVar1[-1] << 2,4);
    }
    puVar1 = puVar1 + 3;
    unaff_x19 = unaff_x19 + -1;
  } while (unaff_x19 != 0);
  return;
}

