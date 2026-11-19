/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f8cc
 */

undefined8 OSSL_PARAM_get_utf8_string_ptr(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar1 = 0;
  if ((param_1 != 0) && (param_2 != (undefined8 *)0x0)) {
    if (*(int *)(param_1 + 8) == 4) {
      uVar2 = *(undefined8 *)(param_1 + 0x10);
    }
    else {
      if (*(int *)(param_1 + 8) != 6) {
        return 0;
      }
      uVar2 = **(undefined8 **)(param_1 + 0x10);
    }
    uVar1 = 1;
    *param_2 = uVar2;
  }
  return uVar1;
}

