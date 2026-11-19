/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9dcc
 */

int ASN1_item_i2d_bio(ASN1_ITEM *it,BIO *out,void *x)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uchar *local_28;
  
  local_28 = (uchar *)0x0;
  iVar1 = ASN1_item_i2d(x,&local_28,it);
  if (local_28 == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_i2d_fp.c",0x5e,"ASN1_item_i2d_bio");
    ERR_set_error(0xd,0xc0100,0);
    iVar1 = 0;
  }
  else {
    iVar2 = BIO_write(out,local_28,iVar1);
    if (iVar1 != iVar2) {
      iVar3 = 0;
      do {
        if (iVar2 < 1) {
          iVar1 = 0;
          goto LAB_00ab9e8c;
        }
        iVar3 = iVar2 + iVar3;
        iVar1 = iVar1 - iVar2;
        iVar2 = BIO_write(out,local_28 + iVar3,iVar1);
      } while (iVar1 != iVar2);
    }
    iVar1 = 1;
LAB_00ab9e8c:
    CRYPTO_free(local_28);
  }
  return iVar1;
}

