/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5120
 */

int PEM_write_ECPKParameters(FILE *fp,EC_GROUP *x)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_ECPKParameters,"EC PARAMETERS",fp,x,(EVP_CIPHER *)0x0,(uchar *)0x0,0,
                         (undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

