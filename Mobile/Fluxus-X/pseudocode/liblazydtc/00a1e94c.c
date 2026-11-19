/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e94c
 */

long ossl_dh_key2buf(undefined8 param_1,undefined8 *param_2,ulong param_3,int param_4)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  void *ptr;
  undefined8 uVar4;
  BIGNUM *local_48;
  BIGNUM *local_38;
  
  DH_get0_pqg(param_1,&local_48,0,0);
  DH_get0_key(param_1,&local_38,0);
  if ((local_48 != (BIGNUM *)0x0) && (local_38 != (BIGNUM *)0x0)) {
    iVar2 = BN_num_bits(local_48);
    uVar1 = iVar2 + 0xeU;
    if (-1 < (int)(iVar2 + 7U)) {
      uVar1 = iVar2 + 7U;
    }
    if ((0xe < iVar2 + 0xeU) && (iVar2 = BN_num_bits(local_38), 0xe < iVar2 + 0xeU)) {
      iVar2 = (int)uVar1 >> 3;
      if (param_2 == (undefined8 *)0x0) goto LAB_00a1eaa0;
      if (param_4 == 0) {
        ptr = (void *)*param_2;
        if (ptr == (void *)0x0) goto LAB_00a1eaa0;
        if (param_3 < (ulong)(long)iVar2) goto LAB_00a1ea74;
      }
      else {
        ptr = CRYPTO_malloc(iVar2,"crypto/dh/dh_key.c",0x1b1);
        if (ptr == (void *)0x0) {
LAB_00a1ea74:
          ERR_new();
          ERR_set_debug("crypto/dh/dh_key.c",0x1b5,"ossl_dh_key2buf");
          uVar4 = 0xc0100;
          goto LAB_00a1e9f8;
        }
      }
      iVar3 = BN_bn2binpad(local_38,ptr,iVar2);
      if (-1 < iVar3) {
        *param_2 = ptr;
LAB_00a1eaa0:
        return (long)iVar2;
      }
      if (param_4 != 0) {
        CRYPTO_free(ptr);
      }
      ERR_new();
      ERR_set_debug("crypto/dh/dh_key.c",0x1bf,"ossl_dh_key2buf");
      uVar4 = 0x6a;
      goto LAB_00a1e9f8;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/dh/dh_key.c",0x1a9,"ossl_dh_key2buf");
  uVar4 = 0x66;
LAB_00a1e9f8:
  ERR_set_error(5,uVar4,0);
  return 0;
}

