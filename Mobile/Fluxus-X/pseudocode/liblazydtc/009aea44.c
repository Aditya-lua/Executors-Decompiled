/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aea44
 */

undefined8 FUN_009aea44(long param_1,long *param_2,long *param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  
  lVar2 = OPENSSL_sk_dup(*param_2);
  uVar4 = 0;
  if (lVar2 != 0) {
    iVar1 = OPENSSL_sk_num();
    while ((0 < iVar1 && (lVar3 = OPENSSL_sk_value(lVar2,0), *(int *)(lVar3 + 0x2c) == 0x304))) {
      OPENSSL_sk_delete(lVar2,0);
      iVar1 = OPENSSL_sk_num(lVar2);
    }
    iVar1 = OPENSSL_sk_num(param_4);
    if (0 < iVar1) {
      iVar1 = iVar1 + 1;
      do {
        lVar3 = OPENSSL_sk_value(param_4,iVar1 + -2);
        if (((*(uint *)(param_1 + 0x640) & *(uint *)(lVar3 + 0x24)) == 0) &&
           ((*(uint *)(param_1 + 0x644) & (&DAT_0074bf1c)[(ulong)*(byte *)(lVar3 + 0x40) * 2]) == 0)
           ) {
          OPENSSL_sk_unshift(lVar2,lVar3);
        }
        iVar1 = iVar1 + -1;
      } while (1 < iVar1);
    }
    lVar3 = OPENSSL_sk_dup(lVar2);
    if (lVar3 == 0) {
      OPENSSL_sk_free(lVar2);
      uVar4 = 0;
    }
    else {
      OPENSSL_sk_free(*param_3);
      *param_3 = lVar3;
      OPENSSL_sk_set_cmp_func(lVar3,ssl_cipher_ptr_id_cmp);
      OPENSSL_sk_sort(*param_3);
      OPENSSL_sk_free(*param_2);
      uVar4 = 1;
      *param_2 = lVar2;
    }
  }
  return uVar4;
}

