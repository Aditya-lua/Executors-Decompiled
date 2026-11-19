/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79434
 */

undefined8 mbedtls_md_hmac_update(long *param_1)

{
  undefined8 uVar1;
  
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) || (param_1[2] == 0)) {
    return 0xffffaf00;
  }
  uVar1 = mbedtls_md_update();
  return uVar1;
}

