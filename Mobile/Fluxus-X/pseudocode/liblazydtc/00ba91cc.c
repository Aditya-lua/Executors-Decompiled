/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba91cc
 */

undefined8 FUN_00ba91cc(undefined8 param_1,undefined1 *param_2,long param_3)

{
  int iVar1;
  
  for (; param_3 != 0; param_3 = param_3 + -1) {
    iVar1 = rand();
    *param_2 = (char)iVar1;
    param_2 = param_2 + 1;
  }
  return 0;
}

