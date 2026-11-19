/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917b34
 */

undefined8 FUN_00917b34(void)

{
  undefined8 uVar1;
  undefined8 *in_x3;
  long in_x4;
  
  *in_x3 = 0;
  if (in_x4 < 0) {
    return 0xfffffffe;
  }
  uVar1 = FUN_00917358();
  return uVar1;
}

