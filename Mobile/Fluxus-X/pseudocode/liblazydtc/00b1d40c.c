/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d40c
 */

int i2d_PUBKEY(EVP_PKEY *a,uchar **pp)

{
  int iVar1;
  ASN1_VALUE *val;
  undefined8 uVar2;
  BIO_METHOD *type;
  BIO *bp;
  long lVar3;
  code *pcVar4;
  int iVar5;
  undefined8 *local_38;
  
  iVar1 = 0;
  if (a != (EVP_PKEY *)0x0) {
    if (*(long *)&a->references == 0) {
      if (*(long *)&a[1].save_parameters != 0) {
        uVar2 = OSSL_ENCODER_CTX_new_for_pkey(a,0x86,&DAT_002b7291,"SubjectPublicKeyInfo",0);
        type = BIO_s_mem();
        bp = BIO_new(type);
        local_38 = (undefined8 *)0x0;
        iVar1 = OSSL_ENCODER_CTX_get_num_encoders(uVar2);
        iVar5 = -1;
        if ((bp != (BIO *)0x0) && (iVar1 != 0)) {
          iVar1 = OSSL_ENCODER_to_bio(uVar2,bp);
          if ((iVar1 == 0) || (lVar3 = BIO_ctrl(bp,0x73,0,&local_38), lVar3 < 1)) {
            iVar5 = -1;
          }
          else {
            iVar5 = (int)*local_38;
            if (pp != (uchar **)0x0) {
              if (*pp == (uchar *)0x0) {
                *pp = (uchar *)local_38[1];
                *local_38 = 0;
                local_38[1] = 0;
              }
              else {
                memcpy(*pp,(void *)local_38[1],(long)iVar5);
                *pp = *pp + iVar5;
              }
            }
          }
        }
        BIO_free(bp);
        OSSL_ENCODER_CTX_free(uVar2);
        return iVar5;
      }
    }
    else {
      val = ASN1_item_new((ASN1_ITEM *)&DAT_00c82640);
      if (val != (ASN1_VALUE *)0x0) {
        pcVar4 = *(code **)(*(long *)&a->references + 0x28);
        if ((pcVar4 == (code *)0x0) || (iVar1 = (*pcVar4)(val,a), iVar1 == 0)) {
          iVar1 = -1;
        }
        else {
          *(EVP_PKEY **)(val + 0x10) = a;
          iVar1 = ASN1_item_i2d(val,pp,(ASN1_ITEM *)&DAT_00c82640);
          *(undefined8 *)(val + 0x10) = 0;
        }
        ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c82640);
        return iVar1;
      }
    }
    iVar1 = -1;
  }
  return iVar1;
}

