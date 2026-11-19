/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab53d4
 */

int PEM_write_bio_DHxparams(BIO *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write_bio(i2d_DHxparams,"X9.42 DH PARAMETERS",param_1,param_2,(EVP_CIPHER *)0x0,
                             (uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

