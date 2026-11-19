/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d628
 */

int EVP_PKEY_assign(EVP_PKEY *pkey,int type,void *key)

{
  int iVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  EVP_PKEY_ASN1_METHOD *pEVar5;
  EC_GROUP *group;
  byte bVar6;
  ENGINE *local_38;
  
  pEVar5 = EVP_PKEY_asn1_find(&local_38,type);
  if (pEVar5 == (EVP_PKEY_ASN1_METHOD *)0x0) {
    iVar4 = 0;
  }
  else {
    iVar4 = *(int *)pEVar5;
  }
  ENGINE_finish(local_38);
  iVar1 = type;
  if ((key != (void *)0x0) &&
     (((iVar4 == 0x494 || (iVar4 == 0x198)) &&
      (group = EC_KEY_get0_group(key), group != (EC_GROUP *)0x0)))) {
    iVar3 = EC_GROUP_get_curve_name(group);
    if (((iVar4 != 0x198) || (iVar1 = 0x494, iVar3 != 0x494)) &&
       (iVar1 = 0x198, iVar3 == 0x494 || iVar4 != 0x494)) {
      iVar1 = type;
    }
  }
  if (pkey == (EVP_PKEY *)0x0) {
    return 0;
  }
  iVar4 = FUN_00a6d2f4(pkey,0,iVar1,0,0xffffffff,0);
  if (iVar4 == 0) {
    return 0;
  }
  iVar4 = pkey->type;
  (pkey->pkey).ptr = key;
  if (iVar4 < 0x198) {
    if (iVar4 == 6) goto LAB_00a6d720;
    if (iVar4 == 0x1c) {
      if (key != (void *)0x0) {
        iVar4 = ossl_dh_is_foreign(key);
        goto LAB_00a6d764;
      }
      goto LAB_00a6d770;
    }
    if (iVar4 == 0x74) {
      if (key == (void *)0x0) goto LAB_00a6d770;
      iVar4 = ossl_dsa_is_foreign(key);
      goto LAB_00a6d764;
    }
LAB_00a6d7a0:
    bVar6 = *(byte *)((long)&pkey[1].ameth + 4) & 0xfe;
  }
  else {
    if (iVar4 == 0x198) {
      if (key == (void *)0x0) goto LAB_00a6d770;
      iVar4 = ossl_ec_key_is_foreign(key);
      goto LAB_00a6d764;
    }
    if (iVar4 == 0x494) goto LAB_00a6d784;
    if (iVar4 != 0x390) goto LAB_00a6d7a0;
LAB_00a6d720:
    if (key == (void *)0x0) {
LAB_00a6d770:
      bVar2 = false;
    }
    else {
      iVar4 = ossl_rsa_is_foreign(key);
LAB_00a6d764:
      bVar2 = iVar4 != 0;
    }
    bVar6 = *(byte *)((long)&pkey[1].ameth + 4) & 0xfe | bVar2;
  }
  *(byte *)((long)&pkey[1].ameth + 4) = bVar6;
LAB_00a6d784:
  return (uint)(key != (void *)0x0);
}

