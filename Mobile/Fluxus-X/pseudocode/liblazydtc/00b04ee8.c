/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04ee8
 */

int SXNET_add_id_INTEGER(SXNET **psx,ASN1_INTEGER *izone,char *user,int userlen)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  ASN1_VALUE *val;
  size_t sVar4;
  undefined8 uVar5;
  SXNET *val_00;
  
  if (((psx == (SXNET **)0x0) || (izone == (ASN1_INTEGER *)0x0)) || (user == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_sxnet.c",0xa7,"SXNET_add_id_INTEGER");
    uVar5 = 0x6b;
  }
  else {
    if (userlen == -1) {
      sVar4 = strlen(user);
      userlen = (int)sVar4;
    }
    if (userlen < 0x41) {
      val_00 = *psx;
      if ((val_00 == (SXNET *)0x0) &&
         ((val_00 = (SXNET *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80fc8), val_00 == (SXNET *)0x0 ||
          (iVar1 = ASN1_INTEGER_set(val_00->version,0), iVar1 == 0)))) {
        val = (ASN1_VALUE *)0x0;
      }
      else {
        iVar1 = OPENSSL_sk_num(val_00->ids);
        if (0 < iVar1) {
          iVar1 = 0;
          do {
            puVar3 = (undefined8 *)OPENSSL_sk_value(val_00->ids,iVar1);
            iVar2 = ASN1_INTEGER_cmp((ASN1_INTEGER *)*puVar3,izone);
            if (iVar2 == 0) {
              if (puVar3[1] != 0) {
                ERR_new();
                ERR_set_debug("crypto/x509/v3_sxnet.c",0xb8,"SXNET_add_id_INTEGER");
                ERR_set_error(0x22,0x85,0);
                goto LAB_00b0510c;
              }
              break;
            }
            iVar1 = iVar1 + 1;
            iVar2 = OPENSSL_sk_num(val_00->ids);
          } while (iVar1 < iVar2);
        }
        val = ASN1_item_new((ASN1_ITEM *)&DAT_00c80f90);
        if (val != (ASN1_VALUE *)0x0) {
          if (userlen == -1) {
            sVar4 = strlen(user);
            userlen = (int)sVar4;
          }
          iVar1 = ASN1_OCTET_STRING_set(*(ASN1_STRING **)(val + 8),user,userlen);
          if ((iVar1 != 0) && (iVar1 = OPENSSL_sk_push(val_00->ids,val), iVar1 != 0)) {
            ASN1_INTEGER_free(*(ASN1_STRING **)val);
            *(ASN1_INTEGER **)val = izone;
            *psx = val_00;
            return 1;
          }
        }
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_sxnet.c",0xcd,"SXNET_add_id_INTEGER");
      ERR_set_error(0x22,0xc0100,0);
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c80f90);
LAB_00b0510c:
      if (*psx == (SXNET *)0x0) {
        ASN1_item_free((ASN1_VALUE *)val_00,(ASN1_ITEM *)&DAT_00c80fc8);
        return 0;
      }
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_sxnet.c",0xad,"SXNET_add_id_INTEGER");
    uVar5 = 0x84;
  }
  ERR_set_error(0x22,uVar5,0);
  return 0;
}

