/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79010
 */

undefined8 mbedtls_md_info_from_ctx(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != (undefined8 *)0x0) {
    uVar1 = *param_1;
  }
  return uVar1;
}

