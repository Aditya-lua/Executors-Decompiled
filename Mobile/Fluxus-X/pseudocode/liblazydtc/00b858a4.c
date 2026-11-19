/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b858a4
 */

undefined8 mbedtls_asn1_write_bool(long *param_1,long param_2,int param_3)

{
  long lVar1;
  
  lVar1 = *param_1;
  if (lVar1 - param_2 < 1) {
    return 0xffffff94;
  }
  *param_1 = lVar1 + -1;
  *(char *)(lVar1 + -1) = -(param_3 != 0);
  lVar1 = *param_1;
  if (lVar1 - param_2 < 1) {
    return 0xffffff94;
  }
  *param_1 = lVar1 + -1;
  *(undefined1 *)(lVar1 + -1) = 1;
  lVar1 = *param_1;
  if (lVar1 - param_2 < 1) {
    return 0xffffff94;
  }
  *param_1 = lVar1 + -1;
  *(undefined1 *)(lVar1 + -1) = 1;
  return 3;
}

