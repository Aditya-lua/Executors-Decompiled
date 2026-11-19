/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7a890
 */

undefined8 FUN_00a7a890(long param_1,void *param_2,size_t *param_3)

{
  uint uVar1;
  int iVar2;
  EC_KEY *key;
  EC_POINT *pub_key;
  EC_GROUP *group;
  undefined8 uVar3;
  size_t sVar4;
  long lVar5;
  EC_KEY *key_00;
  
  if ((*(long *)(param_1 + 0x88) == 0) || (*(long *)(param_1 + 0x90) == 0)) {
    ERR_new();
    uVar3 = 0xb2;
  }
  else {
    lVar5 = *(long *)(param_1 + 0x98);
    key = (EC_KEY *)EVP_PKEY_get0_EC_KEY();
    if (key != (EC_KEY *)0x0) {
      key_00 = *(EC_KEY **)(lVar5 + 0x10);
      if (key_00 == (EC_KEY *)0x0) {
        key_00 = (EC_KEY *)EVP_PKEY_get0_EC_KEY(*(undefined8 *)(param_1 + 0x88));
      }
      if (param_2 == (void *)0x0) {
        group = EC_KEY_get0_group(key_00);
        if (group == (EC_GROUP *)0x0) {
          return 0;
        }
        iVar2 = EC_GROUP_get_degree(group);
        uVar1 = iVar2 + 0xe;
        if (-1 < (int)(iVar2 + 7U)) {
          uVar1 = iVar2 + 7U;
        }
        sVar4 = (long)((ulong)uVar1 << 0x20) >> 0x23;
      }
      else {
        pub_key = EC_KEY_get0_public_key(key);
        iVar2 = ECDH_compute_key(param_2,*param_3,pub_key,key_00,(KDF *)0x0);
        if (iVar2 < 1) {
          return 0;
        }
        sVar4 = (size_t)iVar2;
      }
      *param_3 = sVar4;
      return 1;
    }
    ERR_new();
    uVar3 = 0xb7;
  }
  ERR_set_debug("crypto/ec/ec_pmeth.c",uVar3,"pkey_ec_derive");
  ERR_set_error(0x10,0x8c,0);
  return 0;
}

