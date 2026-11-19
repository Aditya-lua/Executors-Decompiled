/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b137a4
 */

void ossl_policy_data_free(byte *param_1)

{
  if (param_1 == (byte *)0x0) {
    return;
  }
  ASN1_OBJECT_free(*(ASN1_OBJECT **)(param_1 + 8));
  if ((*param_1 >> 2 & 1) == 0) {
    OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x10),POLICYQUALINFO_free);
  }
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x18),ASN1_OBJECT_free);
  CRYPTO_free(param_1);
  return;
}

