/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ee30
 */

undefined8
FUN_00b5ee30(long param_1,uchar *param_2,ulong *param_3,ulong param_4,uchar *param_5,
            undefined8 param_6)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  uchar *to;
  char *pcVar6;
  ulong __n;
  uint local_48 [2];
  
  uVar5 = ossl_prov_is_running();
  if ((int)uVar5 == 0) {
    return uVar5;
  }
  if (param_2 == (uchar *)0x0) {
    iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
    goto LAB_00b5efd8;
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    uVar3 = RSA_public_decrypt((int)param_6,param_5,param_2,*(RSA **)(param_1 + 0x10),
                               *(int *)(param_1 + 0x68));
    __n = (ulong)uVar3;
    if (-1 < (int)uVar3) goto LAB_00b5efd4;
    ERR_new();
    uVar5 = 0x2e9;
LAB_00b5f048:
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",uVar5,"rsa_verify_recover");
    uVar5 = 0x80004;
  }
  else {
    if (*(int *)(param_1 + 0x68) == 1) {
      iVar2 = ossl_rsa_verify(*(undefined4 *)(param_1 + 0x30),0,0,param_2,local_48,param_5,param_6,
                              *(undefined8 *)(param_1 + 0x10));
      if (iVar2 < 1) {
        ERR_new();
        uVar5 = 0x2d9;
        goto LAB_00b5f048;
      }
      __n = (ulong)local_48[0];
LAB_00b5efd4:
      iVar2 = (int)__n;
LAB_00b5efd8:
      *param_3 = (long)iVar2;
      return 1;
    }
    if (*(int *)(param_1 + 0x68) != 5) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x2e1,"rsa_verify_recover");
      pcVar6 = "Only X.931 or PKCS#1 v1.5 padding allowed";
      uVar5 = 0xa8;
      goto LAB_00b5f05c;
    }
    to = *(uchar **)(param_1 + 0xb8);
    if (to == (uchar *)0x0) {
      iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
      to = CRYPTO_malloc(iVar2,"providers/implementations/signature/rsa_sig.c",0x1e7);
      *(uchar **)(param_1 + 0xb8) = to;
      if (to != (uchar *)0x0) goto LAB_00b5eeb8;
      ERR_new();
      ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1e8,"setup_tbuf");
      uVar5 = 0xc0100;
    }
    else {
LAB_00b5eeb8:
      iVar2 = RSA_public_decrypt((int)param_6,param_5,to,*(RSA **)(param_1 + 0x10),5);
      if (iVar2 < 1) {
        ERR_new();
        uVar5 = 0x2b7;
        goto LAB_00b5f048;
      }
      __n = (long)iVar2 - 1;
      bVar1 = *(byte *)(*(long *)(param_1 + 0xb8) + __n);
      uVar3 = RSA_X931_hash_id(*(int *)(param_1 + 0x30));
      if (uVar3 == bVar1) {
        iVar2 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
        if ((int)__n != iVar2) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x2c0,"rsa_verify_recover");
          uVar4 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
          ERR_set_error(0x39,0xa6,"Should be %d, but got %d",uVar4,__n & 0xffffffff);
          return 0;
        }
        *param_3 = __n;
        if (*(uchar **)(param_1 + 0xb8) != param_2) {
          if (param_4 < __n) {
            ERR_new();
            ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x2c9,"rsa_verify_recover"
                         );
            ERR_set_error(0x39,0x6a,"buffer size is %d, should be %d",param_4,__n & 0xffffffff);
            return 0;
          }
          memcpy(param_2,*(uchar **)(param_1 + 0xb8),__n);
        }
        goto LAB_00b5efd4;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/signature/rsa_sig.c",700,"rsa_verify_recover");
      uVar5 = 0xad;
    }
  }
  pcVar6 = (char *)0x0;
LAB_00b5f05c:
  ERR_set_error(0x39,uVar5,pcVar6);
  return 0;
}

