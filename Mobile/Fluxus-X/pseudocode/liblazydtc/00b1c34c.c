/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1c34c
 */

ulong FUN_00b1c34c(undefined8 *param_1,long *param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  ASN1_VALUE *pAVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  uchar *local_58;
  ASN1_VALUE *local_48;
  
  param_1 = (undefined8 *)*param_1;
  if (*(int *)(param_1 + 1) == 0) {
LAB_00b1c490:
    uVar7 = *(ulong *)param_1[2];
    if (param_2 != (long *)0x0) {
      memcpy((void *)*param_2,(void *)((ulong *)param_1[2])[1],(long)(int)uVar7);
      *param_2 = *param_2 + (long)(int)uVar7;
    }
    goto LAB_00b1c514;
  }
  pAVar5 = (ASN1_VALUE *)OPENSSL_sk_new_null();
  local_48 = pAVar5;
  if (pAVar5 == (ASN1_VALUE *)0x0) {
LAB_00b1c4d0:
    OPENSSL_sk_pop_free(pAVar5,&LAB_00b1c9e0);
    ERR_new();
    ERR_set_debug("crypto/x509/x_name.c",0x117,"x509_name_encode");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    iVar1 = OPENSSL_sk_num(*param_1);
    if (0 < iVar1) {
      iVar1 = 0;
      lVar8 = 0;
      iVar2 = -1;
      do {
        lVar6 = OPENSSL_sk_value(*param_1,iVar1);
        if (*(int *)(lVar6 + 0x10) != iVar2) {
          lVar8 = OPENSSL_sk_new_null();
          if (lVar8 == 0) goto LAB_00b1c4d0;
          iVar2 = OPENSSL_sk_push(pAVar5,lVar8);
          if (iVar2 == 0) {
            OPENSSL_sk_free(lVar8);
            goto LAB_00b1c4d0;
          }
          iVar2 = *(int *)(lVar6 + 0x10);
        }
        iVar3 = OPENSSL_sk_push(lVar8,lVar6);
        if (iVar3 == 0) goto LAB_00b1c4d0;
        iVar1 = iVar1 + 1;
        iVar3 = OPENSSL_sk_num(*param_1);
      } while (iVar1 < iVar3);
    }
    uVar4 = ASN1_item_ex_i2d(&local_48,(uchar **)0x0,(ASN1_ITEM *)&DAT_00c82580,-1,-1);
    uVar7 = (ulong)uVar4;
    iVar1 = BUF_MEM_grow((BUF_MEM *)param_1[2],(long)(int)uVar4);
    if (iVar1 == 0) {
      pAVar5 = local_48;
      goto LAB_00b1c4d0;
    }
    local_58 = *(uchar **)(param_1[2] + 8);
    ASN1_item_ex_i2d(&local_48,&local_58,(ASN1_ITEM *)&DAT_00c82580,-1,-1);
    OPENSSL_sk_pop_free(local_48,&LAB_00b1c9e0);
    *(undefined4 *)(param_1 + 1) = 0;
    if ((int)uVar4 < 0) goto LAB_00b1c514;
    iVar1 = FUN_00b1c55c(param_1);
    if (iVar1 != 0) goto LAB_00b1c490;
  }
  uVar7 = 0xffffffff;
LAB_00b1c514:
  return uVar7 & 0xffffffff;
}

