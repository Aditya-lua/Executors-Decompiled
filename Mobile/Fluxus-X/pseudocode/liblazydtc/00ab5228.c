/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5228
 */

EC_KEY * PEM_read_EC_PUBKEY(FILE *fp,EC_KEY **x,undefined1 *cb,void *u)

{
  EC_KEY *pEVar1;
  
  pEVar1 = PEM_ASN1_read(d2i_EC_PUBKEY,"PUBLIC KEY",fp,x,cb,u);
  return pEVar1;
}

