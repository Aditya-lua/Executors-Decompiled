/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6aeac
 */

undefined8
PKCS5_pbe_set0_algor_ex
          (X509_ALGOR *param_1,int param_2,int param_3,void *param_4,int param_5,undefined8 param_6)

{
  long v;
  int iVar1;
  int iVar2;
  ASN1_VALUE *val;
  void *__dest;
  ASN1_STRING *pAVar3;
  ASN1_OBJECT *aobj;
  undefined8 uVar4;
  ASN1_OCTET_STRING *local_58;
  
  local_58 = (ASN1_STRING *)0x0;
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5eb50);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    uVar4 = 0x25;
LAB_00a6af90:
    ERR_set_debug("crypto/asn1/p5_pbe.c",uVar4,"PKCS5_pbe_set0_algor_ex");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    v = 0x800;
    if (0 < param_3) {
      v = (long)param_3;
    }
    iVar1 = ASN1_INTEGER_set(*(ASN1_INTEGER **)(val + 8),v);
    if (iVar1 == 0) {
      ERR_new();
      uVar4 = 0x2b;
      goto LAB_00a6af90;
    }
    iVar1 = 8;
    if (param_5 != 0) {
      iVar1 = param_5;
    }
    if (-1 < iVar1) {
      __dest = CRYPTO_malloc(iVar1,"crypto/asn1/p5_pbe.c",0x33);
      if (__dest == (void *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/p5_pbe.c",0x35,"PKCS5_pbe_set0_algor_ex");
        ERR_set_error(0xd,0xc0100,0);
        goto LAB_00a6afac;
      }
      if (param_4 == (void *)0x0) {
        iVar2 = RAND_bytes_ex(param_6,__dest,(long)iVar1,0);
        if (iVar2 < 1) goto LAB_00a6afac;
      }
      else {
        memcpy(__dest,param_4,(long)iVar1);
      }
      ASN1_STRING_set0(*(ASN1_STRING **)val,__dest,iVar1);
      pAVar3 = ASN1_item_pack(val,(ASN1_ITEM *)&DAT_00c5eb50,&local_58);
      if (pAVar3 == (ASN1_STRING *)0x0) {
        ERR_new();
        uVar4 = 0x41;
        goto LAB_00a6af90;
      }
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5eb50);
      aobj = OBJ_nid2obj(param_2);
      iVar1 = X509_ALGOR_set0(param_1,aobj,0x10,local_58);
      if (iVar1 != 0) {
        return 1;
      }
      val = (ASN1_VALUE *)0x0;
    }
  }
  __dest = (void *)0x0;
LAB_00a6afac:
  CRYPTO_free(__dest);
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5eb50);
  ASN1_STRING_free(local_58);
  return 0;
}

