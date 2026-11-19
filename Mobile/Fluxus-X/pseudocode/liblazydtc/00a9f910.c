/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f910
 */

undefined8 OSSL_PARAM_get_octet_string_ptr(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_1 != 0) && (param_2 != (undefined8 *)0x0)) {
    if (*(int *)(param_1 + 8) == 5) {
      if (param_3 != (undefined8 *)0x0) {
        *param_3 = *(undefined8 *)(param_1 + 0x18);
      }
      uVar1 = *(undefined8 *)(param_1 + 0x10);
    }
    else {
      if (*(int *)(param_1 + 8) != 7) {
        return 0;
      }
      if (param_3 != (undefined8 *)0x0) {
        *param_3 = *(undefined8 *)(param_1 + 0x18);
      }
      uVar1 = **(undefined8 **)(param_1 + 0x10);
    }
    *param_2 = uVar1;
    uVar1 = 1;
  }
  return uVar1;
}

