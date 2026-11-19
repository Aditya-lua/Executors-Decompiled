/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f82c
 */

void FUN_0092f82c(long *param_1)

{
  long lVar1;
  
  lVar1 = *param_1;
  if (lVar1 != 0) {
    FUN_00930868(*(undefined8 *)(lVar1 + 0x10));
  }
  (*(code *)PTR_free_00cc4678)(lVar1);
  *param_1 = 0;
  return;
}

