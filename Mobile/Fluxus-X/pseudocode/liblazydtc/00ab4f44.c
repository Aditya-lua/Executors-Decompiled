/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4f44
 */

DSA * PEM_read_bio_DSAparams(BIO *bp,DSA **x,undefined1 *cb,void *u)

{
  DSA *pDVar1;
  
  pDVar1 = PEM_ASN1_read_bio(d2i_DSAparams,"DSA PARAMETERS",bp,x,cb,u);
  return pDVar1;
}

