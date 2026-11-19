/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f7b0
 */

undefined8 OSSL_PARAM_get_octet_ptr(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (((param_1 != 0) && (param_2 != (undefined8 *)0x0)) && (uVar1 = 0, *(int *)(param_1 + 8) == 7))
  {
    if (param_3 != (undefined8 *)0x0) {
      *param_3 = *(undefined8 *)(param_1 + 0x18);
    }
    *param_2 = **(undefined8 **)(param_1 + 0x10);
    uVar1 = 1;
  }
  return uVar1;
}

