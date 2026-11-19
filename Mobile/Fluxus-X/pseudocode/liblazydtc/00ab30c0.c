/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab30c0
 */

X509 * FUN_00ab30c0(stack_st_X509 *param_1,int *param_2)

{
  int iVar1;
  int iVar2;
  EVP_MD *type;
  void *__s1;
  X509 *pXVar3;
  uchar auStack_64 [20];
  
  if (*param_2 == 0) {
    pXVar3 = X509_find_by_subject(param_1,*(X509_NAME **)(param_2 + 2));
  }
  else {
    pXVar3 = (X509 *)0x0;
    if (**(int **)(param_2 + 2) == 0x14) {
      __s1 = *(void **)(*(int **)(param_2 + 2) + 2);
      iVar1 = OPENSSL_sk_num(param_1);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          pXVar3 = (X509 *)OPENSSL_sk_value(param_1,iVar1);
          if (pXVar3 != (X509 *)0x0) {
            type = (EVP_MD *)
                   EVP_MD_fetch(*(undefined8 *)pXVar3[1].sha1_hash,&DAT_002d142e,
                                *(undefined8 *)(pXVar3[1].sha1_hash + 8));
            if (type == (EVP_MD *)0x0) break;
            iVar2 = X509_pubkey_digest(pXVar3,type,auStack_64,(uint *)0x0);
            EVP_MD_free(type);
            if (iVar2 == 0) break;
            iVar2 = memcmp(__s1,auStack_64,0x14);
            if (iVar2 == 0) {
              return pXVar3;
            }
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(param_1);
        } while (iVar1 < iVar2);
      }
      pXVar3 = (X509 *)0x0;
    }
  }
  return pXVar3;
}

