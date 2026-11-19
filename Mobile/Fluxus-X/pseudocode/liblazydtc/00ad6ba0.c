/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad6ba0
 */

int FUN_00ad6ba0(long param_1,uchar *param_2,size_t *param_3,uchar *param_4,undefined8 param_5)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  RSA *rsa;
  undefined8 uVar4;
  long lVar5;
  size_t __n;
  int local_48 [2];
  
  lVar5 = *(long *)(param_1 + 0x98);
  rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_1 + 0x88));
  if (*(long *)(lVar5 + 0x20) == 0) {
    local_48[0] = RSA_public_decrypt((int)param_5,param_4,param_2,rsa,*(int *)(lVar5 + 0x1c));
joined_r0x00ad6c8c:
    if (local_48[0] < 0) {
      return local_48[0];
    }
    __n = (size_t)local_48[0];
LAB_00ad6cd8:
    iVar2 = 1;
    *param_3 = __n;
  }
  else {
    if (*(int *)(lVar5 + 0x1c) == 1) {
      uVar4 = EVP_MD_get_type(*(long *)(lVar5 + 0x20));
      iVar2 = ossl_rsa_verify(uVar4,0,0,param_2,local_48,param_4,param_5,rsa);
      if (0 < iVar2) goto joined_r0x00ad6c8c;
    }
    else {
      if ((*(int *)(lVar5 + 0x1c) != 5) || (iVar2 = FUN_00ad789c(lVar5,param_1), iVar2 == 0)) {
        return -1;
      }
      iVar2 = RSA_public_decrypt((int)param_5,param_4,*(uchar **)(lVar5 + 0x38),rsa,5);
      if (0 < iVar2) {
        __n = (long)iVar2 - 1;
        bVar1 = *(byte *)(*(long *)(lVar5 + 0x38) + __n);
        iVar2 = EVP_MD_get_type(*(undefined8 *)(lVar5 + 0x20));
        uVar3 = RSA_X931_hash_id(iVar2);
        if (uVar3 == bVar1) {
          iVar2 = EVP_MD_get_size(*(undefined8 *)(lVar5 + 0x20));
          if ((int)__n == iVar2) {
            if (param_2 != (uchar *)0x0) {
              memcpy(param_2,*(void **)(lVar5 + 0x38),__n);
            }
            goto LAB_00ad6cd8;
          }
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_pmeth.c",0xe6,"pkey_rsa_verifyrecover");
          uVar4 = 0x8f;
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_pmeth.c",0xe2,"pkey_rsa_verifyrecover");
          uVar4 = 100;
        }
        ERR_set_error(4,uVar4,0);
      }
    }
    iVar2 = 0;
  }
  return iVar2;
}

