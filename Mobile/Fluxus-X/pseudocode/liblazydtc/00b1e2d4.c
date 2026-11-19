/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e2d4
 */

undefined8 ossl_x509_PUBKEY_get0_libctx(undefined8 *param_1,undefined8 *param_2,long param_3)

{
  if (param_1 != (undefined8 *)0x0) {
    *param_1 = *(undefined8 *)(param_3 + 0x18);
  }
  if (param_2 != (undefined8 *)0x0) {
    *param_2 = *(undefined8 *)(param_3 + 0x20);
  }
  return 1;
}

