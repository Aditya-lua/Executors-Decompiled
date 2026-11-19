/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4e00
 */

DSA * PEM_read_bio_DSA_PUBKEY(BIO *bp,DSA **x,undefined1 *cb,void *u)

{
  DSA *pDVar1;
  
  pDVar1 = PEM_ASN1_read_bio(d2i_DSA_PUBKEY,"PUBLIC KEY",bp,x,cb,u);
  return pDVar1;
}

