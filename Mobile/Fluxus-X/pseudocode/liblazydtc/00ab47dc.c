/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab47dc
 */

int PEM_write_X509_PUBKEY(FILE *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_X509_PUBKEY,"PUBLIC KEY",param_1,param_2,(EVP_CIPHER *)0x0,(uchar *)0x0
                         ,0,(undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

