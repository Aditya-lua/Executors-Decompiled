/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85510
 */

undefined8 mbedtls_asn1_write_null(long *param_1,long param_2)

{
  long lVar1;
  
  lVar1 = *param_1;
  if (lVar1 - param_2 < 1) {
    return 0xffffff94;
  }
  *param_1 = lVar1 + -1;
  *(undefined1 *)(lVar1 + -1) = 0;
  lVar1 = *param_1;
  if (lVar1 - param_2 < 1) {
    return 0xffffff94;
  }
  *param_1 = lVar1 + -1;
  *(undefined1 *)(lVar1 + -1) = 5;
  return 2;
}

