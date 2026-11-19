/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9b64
 */

int ASN1_i2d_fp(undefined1 *i2d,FILE *out,void *x)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_i2d_fp.c",0x18,"ASN1_i2d_fp");
    ERR_set_error(0xd,0x80007,0);
    iVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,out);
    iVar1 = ASN1_i2d_bio(i2d,bp,x);
    BIO_free(bp);
  }
  return iVar1;
}

