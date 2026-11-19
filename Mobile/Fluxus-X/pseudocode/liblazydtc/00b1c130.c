/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1c130
 */

int FUN_00b1c130(undefined8 *param_1,undefined8 *param_2,long param_3,undefined8 param_4,int param_5
                ,int param_6,char param_7,ASN1_TLC *param_8)

{
  ASN1_VALUE *val;
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *ptr;
  uchar *__src;
  ASN1_VALUE *local_58;
  ASN1_VALUE *local_50;
  uchar *local_48;
  
  __src = (uchar *)*param_2;
  if (0xfffff < param_3) {
    param_3 = 0x100000;
  }
  local_58 = (ASN1_VALUE *)0x0;
  local_50 = (ASN1_VALUE *)0x0;
  local_48 = __src;
  iVar1 = ASN1_item_ex_d2i(&local_50,&local_48,param_3,(ASN1_ITEM *)&DAT_00c82580,param_5,param_6,
                           param_7,param_8);
  if (0 < iVar1) {
    ptr = (undefined8 *)*param_1;
    if (ptr != (undefined8 *)0x0) {
      BUF_MEM_free((BUF_MEM *)ptr[2]);
      OPENSSL_sk_pop_free(*ptr,X509_NAME_ENTRY_free);
      CRYPTO_free((void *)ptr[3]);
      CRYPTO_free(ptr);
      *param_1 = 0;
    }
    iVar1 = FUN_00b1bfd8(&local_58,0);
    val = local_58;
    if ((iVar1 != 0) &&
       (iVar1 = BUF_MEM_grow(*(BUF_MEM **)(local_58 + 0x10),(long)local_48 - (long)__src),
       iVar1 != 0)) {
      memcpy(*(void **)(*(long *)(val + 0x10) + 8),__src,(long)local_48 - (long)__src);
      iVar1 = OPENSSL_sk_num(local_50);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          uVar4 = OPENSSL_sk_value(local_50,iVar1);
          iVar2 = OPENSSL_sk_num();
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              lVar5 = OPENSSL_sk_value(uVar4,iVar2);
              *(int *)(lVar5 + 0x10) = iVar1;
              iVar3 = OPENSSL_sk_push(*(undefined8 *)val,lVar5);
              if (iVar3 == 0) goto LAB_00b1c2d4;
              OPENSSL_sk_set(uVar4,iVar2,0);
              iVar2 = iVar2 + 1;
              iVar3 = OPENSSL_sk_num(uVar4);
            } while (iVar2 < iVar3);
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(local_50);
        } while (iVar1 < iVar2);
      }
      iVar1 = FUN_00b1c55c(val);
      if (iVar1 != 0) {
        OPENSSL_sk_pop_free(local_50,&LAB_00b1c9e0);
        *(undefined4 *)(val + 8) = 0;
        *param_1 = val;
        *param_2 = local_48;
        return iVar1;
      }
    }
    if (val != (ASN1_VALUE *)0x0) {
LAB_00b1c2d4:
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c824b0);
    }
    OPENSSL_sk_pop_free(local_50,&LAB_00b1c9e4);
    ERR_new();
    ERR_set_debug("crypto/x509/x_name.c",0xcf,"x509_name_ex_d2i");
    ERR_set_error(0xd,0x8010a,0);
    iVar1 = 0;
  }
  return iVar1;
}

