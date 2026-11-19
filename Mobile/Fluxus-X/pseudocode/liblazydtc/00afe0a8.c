/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe0a8
 */

void PROFESSION_INFO_set0_professionOIDs(long param_1,undefined8 param_2)

{
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x10),ASN1_OBJECT_free);
  *(undefined8 *)(param_1 + 0x10) = param_2;
  return;
}

