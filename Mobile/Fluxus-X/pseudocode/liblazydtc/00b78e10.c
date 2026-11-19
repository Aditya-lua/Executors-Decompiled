/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78e10
 */

undefined4 mbedtls_md_get_type(undefined4 *param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0;
  if (param_1 != (undefined4 *)0x0) {
    uVar1 = *param_1;
  }
  return uVar1;
}

