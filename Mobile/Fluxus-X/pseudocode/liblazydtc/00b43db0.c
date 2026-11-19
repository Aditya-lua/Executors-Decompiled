/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b43db0
 */

bool FUN_00b43db0(long param_1,void *param_2,ulong *param_3,size_t param_4)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  EC_GROUP *pEVar4;
  long lVar5;
  EC_POINT *pub_key;
  EC_KEY *key;
  ulong uVar6;
  
  if ((*(EC_KEY **)(param_1 + 8) == (EC_KEY *)0x0) || (*(long *)(param_1 + 0x10) == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/exchange/ecdh_exch.c",0x1ba,"ecdh_plain_derive");
    ERR_set_error(0x39,0x80,0);
  }
  else {
    pEVar4 = EC_KEY_get0_group(*(EC_KEY **)(param_1 + 8));
    if (pEVar4 == (EC_GROUP *)0x0) {
      uVar6 = 0;
    }
    else {
      iVar2 = EC_GROUP_get_degree(pEVar4);
      uVar6 = (long)iVar2 + 7U >> 3;
    }
    if (param_2 == (void *)0x0) {
      *param_3 = uVar6;
      return true;
    }
    pEVar4 = EC_KEY_get0_group(*(EC_KEY **)(param_1 + 8));
    if ((pEVar4 != (EC_GROUP *)0x0) && (lVar5 = EC_GROUP_get0_cofactor(), lVar5 != 0)) {
      if (uVar6 <= param_4) {
        param_4 = uVar6;
      }
      uVar3 = EC_KEY_get_flags(*(EC_KEY **)(param_1 + 8));
      if (((*(uint *)(param_1 + 0x18) == 0xffffffff) ||
          (*(uint *)(param_1 + 0x18) == (uVar3 >> 0xc & 1))) ||
         (iVar2 = BN_is_one(lVar5), iVar2 != 0)) {
        key = *(EC_KEY **)(param_1 + 8);
      }
      else {
        key = EC_KEY_dup(*(EC_KEY **)(param_1 + 8));
        if (key == (EC_KEY *)0x0) {
          return false;
        }
        if (*(int *)(param_1 + 0x18) == 1) {
          EC_KEY_set_flags(key,0x1000);
        }
        else {
          EC_KEY_clear_flags(key,0x1000);
        }
      }
      pub_key = EC_KEY_get0_public_key(*(EC_KEY **)(param_1 + 0x10));
      iVar2 = ECDH_compute_key(param_2,param_4,pub_key,key,(KDF *)0x0);
      bVar1 = 0 < iVar2;
      if (bVar1) {
        *param_3 = (long)iVar2;
      }
      if (key == *(EC_KEY **)(param_1 + 8)) {
        return bVar1;
      }
      EC_KEY_free(key);
      return bVar1;
    }
  }
  return false;
}

