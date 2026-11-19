/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd710
 */

void * ASN1_d2i_fp(xnew *xnew,undefined1 *d2i,FILE *in,void **x)

{
  BUF_MEM *a;
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  void *pvVar2;
  char *local_40;
  BUF_MEM *local_38;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_d2i_fp.c",0x1c,"ASN1_d2i_fp");
    ERR_set_error(0xd,0x80007,0);
    pvVar2 = (void *)0x0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,in);
    local_38 = (BUF_MEM *)0x0;
    iVar1 = asn1_d2i_read_bio(bp,&local_38);
    a = local_38;
    if (iVar1 < 0) {
      pvVar2 = (void *)0x0;
    }
    else {
      local_40 = local_38->data;
      pvVar2 = (void *)(*(code *)d2i)(x,&local_40,(long)iVar1);
    }
    BUF_MEM_free(a);
    BIO_free(bp);
  }
  return pvVar2;
}

