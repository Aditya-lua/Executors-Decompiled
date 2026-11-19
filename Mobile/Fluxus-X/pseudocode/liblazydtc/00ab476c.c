/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab476c
 */

void PEM_read_X509_PUBKEY(FILE *param_1,void **param_2,undefined1 *param_3,void *param_4)

{
  PEM_ASN1_read(d2i_X509_PUBKEY,"PUBLIC KEY",param_1,param_2,param_3,param_4);
  return;
}

