/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ec728
 */

int i2a_ASN1_OBJECT(BIO *bp,ASN1_OBJECT *a)

{
  int iVar1;
  int iVar2;
  char *buf;
  undefined8 uVar3;
  char acStack_90 [80];
  
  if ((a == (ASN1_OBJECT *)0x0) || (a->data == (uchar *)0x0)) {
    iVar1 = BIO_write(bp,&DAT_0029dc23,4);
  }
  else {
    iVar1 = OBJ_obj2txt(acStack_90,0x50,a,0);
    if (iVar1 < 0x50) {
      if (iVar1 < 1) {
        iVar2 = BIO_write(bp,"<INVALID>",9);
        iVar1 = BIO_dump(bp,(char *)a->data,a->length);
        iVar1 = iVar1 + iVar2;
      }
      else {
        BIO_write(bp,acStack_90,iVar1);
      }
    }
    else {
      if (iVar1 == 0x7fffffff) {
        ERR_new();
        ERR_set_debug("crypto/asn1/a_object.c",0xc4,"i2a_ASN1_OBJECT");
        uVar3 = 0xe7;
      }
      else {
        buf = CRYPTO_malloc(iVar1 + 1,"crypto/asn1/a_object.c",199);
        if (buf != (char *)0x0) {
          OBJ_obj2txt(buf,iVar1 + 1,a,0);
          BIO_write(bp,buf,iVar1);
          if (buf == acStack_90) {
            return iVar1;
          }
          CRYPTO_free(buf);
          return iVar1;
        }
        ERR_new();
        ERR_set_debug("crypto/asn1/a_object.c",200,"i2a_ASN1_OBJECT");
        uVar3 = 0xc0100;
      }
      ERR_set_error(0xd,uVar3,0);
      iVar1 = -1;
    }
  }
  return iVar1;
}

