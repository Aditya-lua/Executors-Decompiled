/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5088
 */

EC_GROUP * PEM_read_bio_ECPKParameters(BIO *bp,EC_GROUP **x,undefined1 *cb,void *u)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = PEM_ASN1_read_bio(d2i_ECPKParameters,"EC PARAMETERS",bp,x,cb,u);
  return pEVar1;
}

