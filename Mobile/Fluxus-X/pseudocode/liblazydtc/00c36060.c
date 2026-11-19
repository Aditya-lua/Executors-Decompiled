/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36060
 */

int PEM_ASN1_write(undefined1 *i2d,char *name,FILE *fp,void *x,EVP_CIPHER *enc,uchar *kstr,int klen,
                  undefined1 *callback,void *u)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d,name,fp,x,enc,kstr,klen,callback,u);
  return iVar1;
}

