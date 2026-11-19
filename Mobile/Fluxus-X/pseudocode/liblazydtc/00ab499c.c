/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab499c
 */

int PEM_write_NETSCAPE_CERT_SEQUENCE(FILE *fp,NETSCAPE_CERT_SEQUENCE *x)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_NETSCAPE_CERT_SEQUENCE,"CERTIFICATE",fp,x,(EVP_CIPHER *)0x0,
                         (uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
  return iVar1;
}

