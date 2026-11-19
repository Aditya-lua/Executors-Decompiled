/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab51b4
 */

int PEM_write_ECPrivateKey
              (FILE *fp,EC_KEY *x,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_ECPrivateKey,"EC PRIVATE KEY",fp,x,enc,kstr,klen,cb,u);
  return iVar1;
}

