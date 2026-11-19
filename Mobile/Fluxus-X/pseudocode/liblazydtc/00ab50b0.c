/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab50b0
 */

EC_GROUP * PEM_read_ECPKParameters(FILE *fp,EC_GROUP **x,undefined1 *cb,void *u)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = PEM_ASN1_read(d2i_ECPKParameters,"EC PARAMETERS",fp,x,cb,u);
  return pEVar1;
}

