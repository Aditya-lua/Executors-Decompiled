/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7a36c
 */

ulong FUN_00a7a36c(long param_1,uint param_2,int param_3,undefined8 *param_4)

{
  uint uVar1;
  int iVar2;
  EC_GROUP *pEVar3;
  EC_KEY *pEVar4;
  EC_KEY *key;
  undefined8 uVar5;
  undefined8 *puVar6;
  
  puVar6 = *(undefined8 **)(param_1 + 0x98);
  switch(param_2) {
  case 0x1001:
    pEVar3 = EC_GROUP_new_by_curve_name(param_3);
    if (pEVar3 == (EC_GROUP *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_pmeth.c",0x103,"pkey_ec_ctrl");
      uVar5 = 0x8d;
LAB_00a7a630:
      ERR_set_error(0x10,uVar5,0);
      return 0;
    }
    EC_GROUP_free((EC_GROUP *)*puVar6);
    *puVar6 = pEVar3;
    break;
  case 0x1002:
    if ((EC_GROUP *)*puVar6 == (EC_GROUP *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_pmeth.c",0x10c,"pkey_ec_ctrl");
      uVar5 = 0x8b;
      goto LAB_00a7a630;
    }
    EC_GROUP_set_asn1_flag((EC_GROUP *)*puVar6,param_3);
    break;
  case 0x1003:
    if (param_3 == -2) {
      if (*(char *)(puVar6 + 3) == -1) {
        pEVar4 = (EC_KEY *)EVP_PKEY_get0_EC_KEY(*(undefined8 *)(param_1 + 0x88));
        uVar1 = EC_KEY_get_flags(pEVar4);
        return (ulong)(uVar1 >> 0xc & 1);
      }
      return (long)*(char *)(puVar6 + 3);
    }
    if (2 < param_3 + 1U) {
      return 0xfffffffe;
    }
    *(char *)(puVar6 + 3) = (char)param_3;
    if (param_3 == -1) {
      EC_KEY_free((EC_KEY *)puVar6[2]);
      puVar6[2] = 0;
    }
    else {
      pEVar4 = (EC_KEY *)EVP_PKEY_get0_EC_KEY(*(undefined8 *)(param_1 + 0x88));
      if (*(long *)(*(long *)(param_1 + 0x88) + 0x60) != 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_pmeth.c",0x126,"pkey_ec_ctrl");
        uVar5 = 0x8010c;
        goto LAB_00a7a630;
      }
      if (*(long *)(pEVar4 + 0x18) == 0) {
        return 0xfffffffe;
      }
      iVar2 = BN_is_one(*(undefined8 *)(*(long *)(pEVar4 + 0x18) + 0x18));
      if (iVar2 == 0) {
        key = (EC_KEY *)puVar6[2];
        if (key == (EC_KEY *)0x0) {
          key = EC_KEY_dup(pEVar4);
          puVar6[2] = key;
          if (key == (EC_KEY *)0x0) {
            return 0;
          }
        }
        if (param_3 == 0) {
          EC_KEY_clear_flags(key,0x1000);
        }
        else {
          EC_KEY_set_flags(key,0x1000);
        }
      }
    }
    break;
  case 0x1004:
    if (param_3 == -2) {
      return (ulong)*(byte *)((long)puVar6 + 0x19);
    }
    if (1 < param_3 - 1U) {
      return 0xfffffffe;
    }
    *(char *)((long)puVar6 + 0x19) = (char)param_3;
    break;
  case 0x1005:
    puVar6[4] = param_4;
    break;
  case 0x1006:
    uVar5 = puVar6[4];
    goto LAB_00a7a47c;
  case 0x1007:
    if (param_3 < 1) {
      return 0xfffffffe;
    }
    puVar6[7] = (long)param_3;
    break;
  case 0x1008:
    *(int *)param_4 = (int)puVar6[7];
    return 1;
  case 0x1009:
    CRYPTO_free((void *)puVar6[5]);
    puVar6[5] = param_4;
    if (param_4 == (undefined8 *)0x0) {
      puVar6[6] = 0;
    }
    else {
      puVar6[6] = (long)param_3;
    }
    break;
  case 0x100a:
    *param_4 = puVar6[5];
    return (ulong)*(uint *)(puVar6 + 6);
  default:
    if (0xd < param_2) {
      return 0xfffffffe;
    }
    if ((1 << (ulong)(param_2 & 0x1f) & 0x8a4U) != 0) {
      return 1;
    }
    if (param_2 == 1) {
      iVar2 = EVP_MD_get_type(param_4);
      if ((((((iVar2 == 0x40) || (iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x1a0)) ||
            (iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x2a3)) ||
           ((iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x2a0 ||
            (iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x2a1)))) ||
          ((iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x2a2 ||
           ((iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x448 ||
            (iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x449)))))) ||
         ((iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x44a ||
          ((iVar2 = EVP_MD_get_type(param_4), iVar2 == 1099 ||
           (iVar2 = EVP_MD_get_type(param_4), iVar2 == 0x477)))))) {
        puVar6[1] = param_4;
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_pmeth.c",0x171,"pkey_ec_ctrl");
      uVar5 = 0x8a;
      goto LAB_00a7a630;
    }
    if (param_2 != 0xd) {
      return 0xfffffffe;
    }
    uVar5 = puVar6[1];
LAB_00a7a47c:
    *param_4 = uVar5;
  }
  return 1;
}

