/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970120
 */

undefined8 FUN_00970120(long param_1,int param_2)

{
  long lVar1;
  
  lVar1 = 0;
  if (param_2 != 0x40002b) {
    lVar1 = 8;
  }
  return *(undefined8 *)(*(long *)(param_1 + 0x30) + lVar1);
}

