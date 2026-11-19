/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a8b4
 */

X509_ALGOR *
PKCS5_pbkdf2_set_ex(int param_1,void *param_2,int param_3,int param_4,int param_5,undefined8 param_6
                   )

{
  int iVar1;
  ASN1_VALUE *val;
  ASN1_OCTET_STRING *pAVar2;
  uchar *__dest;
  ASN1_INTEGER *a;
  X509_ALGOR *pXVar3;
  ASN1_OBJECT *pAVar4;
  long lVar5;
  
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5ea28);
  if ((val != (ASN1_VALUE *)0x0) &&
     (pAVar2 = ASN1_OCTET_STRING_new(), pAVar2 != (ASN1_OCTET_STRING *)0x0)) {
    *(ASN1_OCTET_STRING **)(*(long *)val + 8) = pAVar2;
    **(undefined4 **)val = 4;
    if (-1 < param_3) {
      iVar1 = 8;
      if (param_3 != 0) {
        iVar1 = param_3;
      }
      __dest = CRYPTO_malloc(iVar1,"crypto/asn1/p5_pbev2.c",0xb8);
      pAVar2->data = __dest;
      if (__dest != (uchar *)0x0) {
        pAVar2->length = iVar1;
        if (param_2 == (void *)0x0) {
          iVar1 = RAND_bytes_ex(param_6,__dest,(long)iVar1,0);
          if (iVar1 < 1) goto LAB_00a6aa40;
        }
        else {
          memcpy(__dest,param_2,(long)iVar1);
        }
        lVar5 = 0x800;
        if (0 < param_1) {
          lVar5 = (long)param_1;
        }
        iVar1 = ASN1_INTEGER_set(*(ASN1_INTEGER **)(val + 8),lVar5);
        if (iVar1 != 0) {
          if (0 < param_5) {
            a = ASN1_INTEGER_new();
            *(ASN1_INTEGER **)(val + 0x10) = a;
            if ((a == (ASN1_INTEGER *)0x0) ||
               (iVar1 = ASN1_INTEGER_set(a,(long)param_5), iVar1 == 0)) goto LAB_00a6aa40;
          }
          if ((0 < param_4) && (param_4 != 0xa3)) {
            pXVar3 = X509_ALGOR_new();
            *(X509_ALGOR **)(val + 0x18) = pXVar3;
            if (pXVar3 == (X509_ALGOR *)0x0) goto LAB_00a6aa40;
            pAVar4 = OBJ_nid2obj(param_4);
            X509_ALGOR_set0(pXVar3,pAVar4,5,(void *)0x0);
          }
          pXVar3 = X509_ALGOR_new();
          if (pXVar3 != (X509_ALGOR *)0x0) {
            pAVar4 = OBJ_nid2obj(0x45);
            pXVar3->algorithm = pAVar4;
            lVar5 = ASN1_TYPE_pack_sequence(&DAT_00c5ea28,val,&pXVar3->parameter);
            if (lVar5 != 0) {
              ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5ea28);
              return pXVar3;
            }
          }
          goto LAB_00a6aa44;
        }
      }
    }
  }
LAB_00a6aa40:
  pXVar3 = (X509_ALGOR *)0x0;
LAB_00a6aa44:
  ERR_new();
  ERR_set_debug("crypto/asn1/p5_pbev2.c",0xeb,"PKCS5_pbkdf2_set_ex");
  ERR_set_error(0xd,0xc0100,0);
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5ea28);
  X509_ALGOR_free(pXVar3);
  return (X509_ALGOR *)0x0;
}

