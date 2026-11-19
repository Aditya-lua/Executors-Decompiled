/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5200
 */

EC_KEY * PEM_read_bio_EC_PUBKEY(BIO *bp,EC_KEY **x,undefined1 *cb,void *u)

{
  EC_KEY *pEVar1;
  
  pEVar1 = PEM_ASN1_read_bio(d2i_EC_PUBKEY,"PUBLIC KEY",bp,x,cb,u);
  return pEVar1;
}

