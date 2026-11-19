/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78390
 */

int FUN_00a78390(long param_1,uchar *param_2,long *param_3)

{
  int iVar1;
  int iVar2;
  DH *dh;
  long lVar3;
  uchar *key;
  undefined8 uVar4;
  BIGNUM *pub_key;
  long lVar5;
  
  if ((*(long *)(param_1 + 0x88) == 0) || (*(long *)(param_1 + 0x90) == 0)) {
    ERR_new();
    uVar4 = 0x198;
  }
  else {
    lVar5 = *(long *)(param_1 + 0x98);
    dh = (DH *)EVP_PKEY_get0_DH();
    lVar3 = EVP_PKEY_get0_DH(*(undefined8 *)(param_1 + 0x90));
    if (lVar3 != 0) {
      pub_key = *(BIGNUM **)(lVar3 + 0x70);
      if (*(char *)(lVar5 + 0x2c) != '\x02') {
        if (*(char *)(lVar5 + 0x2c) != '\x01') {
          return 0;
        }
        if (param_2 == (uchar *)0x0) {
          iVar1 = DH_size(dh);
          lVar3 = (long)iVar1;
        }
        else {
          if (*(int *)(lVar5 + 0x10) == 0) {
            iVar1 = DH_compute_key(param_2,pub_key,dh);
          }
          else {
            iVar1 = DH_compute_key_padded(param_2,pub_key,dh);
          }
          if (iVar1 < 0) {
            return iVar1;
          }
          lVar3 = (long)iVar1;
        }
LAB_00a78550:
        *param_3 = lVar3;
        return 1;
      }
      lVar3 = *(long *)(lVar5 + 0x50);
      if (lVar3 == 0) {
        return 0;
      }
      if (*(long *)(lVar5 + 0x30) == 0) {
        return 0;
      }
      if (param_2 == (uchar *)0x0) goto LAB_00a78550;
      if (*param_3 != lVar3) {
        return 0;
      }
      iVar1 = DH_size(dh);
      if (iVar1 < 1) {
        return 0;
      }
      key = CRYPTO_malloc(iVar1,"crypto/dh/dh_pmeth.c",0x1c0);
      if (key != (uchar *)0x0) {
        iVar2 = DH_compute_key_padded(key,pub_key,dh);
        if ((iVar2 < 1) ||
           (iVar2 = DH_KDF_X9_42(param_2,*param_3,key,(long)iVar1,*(undefined8 *)(lVar5 + 0x30),
                                 *(undefined8 *)(lVar5 + 0x40),*(undefined8 *)(lVar5 + 0x48),
                                 *(undefined8 *)(lVar5 + 0x38)), iVar2 == 0)) {
          iVar2 = 0;
        }
        else {
          iVar2 = 1;
          *param_3 = *(long *)(lVar5 + 0x50);
        }
        CRYPTO_clear_free(key,(long)iVar1,"crypto/dh/dh_pmeth.c",0x1cc);
        return iVar2;
      }
      ERR_new();
      ERR_set_debug("crypto/dh/dh_pmeth.c",0x1c1,"pkey_dh_derive");
      uVar4 = 0xc0100;
      goto LAB_00a78448;
    }
    ERR_new();
    uVar4 = 0x19e;
  }
  ERR_set_debug("crypto/dh/dh_pmeth.c",uVar4,"pkey_dh_derive");
  uVar4 = 0x6c;
LAB_00a78448:
  ERR_set_error(5,uVar4,0);
  return 0;
}

