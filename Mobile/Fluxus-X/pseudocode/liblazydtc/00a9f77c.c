/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f77c
 */

undefined8 OSSL_PARAM_get_utf8_ptr(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (((param_1 != 0) && (param_2 != (undefined8 *)0x0)) && (uVar1 = 0, *(int *)(param_1 + 8) == 6))
  {
    uVar1 = 1;
    *param_2 = **(undefined8 **)(param_1 + 0x10);
  }
  return uVar1;
}

