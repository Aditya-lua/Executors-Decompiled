/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4d3c
 */

undefined8 FUN_008e4d3c(void)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = FUN_008e4d10();
  uVar2 = 0;
  if (lVar1 != 0) {
    uVar2 = *(undefined8 *)(lVar1 + 0x10);
  }
  return uVar2;
}

