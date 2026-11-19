/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4e28
 */

DSA * PEM_read_DSA_PUBKEY(FILE *fp,DSA **x,undefined1 *cb,void *u)

{
  DSA *pDVar1;
  
  pDVar1 = PEM_ASN1_read(d2i_DSA_PUBKEY,"PUBLIC KEY",fp,x,cb,u);
  return pDVar1;
}

