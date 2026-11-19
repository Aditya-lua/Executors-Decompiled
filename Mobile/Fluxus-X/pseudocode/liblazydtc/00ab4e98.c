/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4e98
 */

int PEM_write_DSA_PUBKEY(FILE *fp,DSA *x)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_DSA_PUBKEY,"PUBLIC KEY",fp,x,(EVP_CIPHER *)0x0,(uchar *)0x0,0,
                         (undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

