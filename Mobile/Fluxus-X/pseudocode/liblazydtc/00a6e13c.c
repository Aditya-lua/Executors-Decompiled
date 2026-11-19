/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e13c
 */

undefined8 EVP_PKEY_can_sign(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  EVP_PKEY_ASN1_METHOD *pEVar4;
  long lVar5;
  code *pcVar6;
  ENGINE *local_28;
  
  if (*(long *)(param_1 + 0x18) == 0) {
    pEVar4 = EVP_PKEY_asn1_find(&local_28,*param_1);
    if (pEVar4 == (EVP_PKEY_ASN1_METHOD *)0x0) {
      ENGINE_finish(local_28);
    }
    else {
      iVar1 = *(int *)pEVar4;
      ENGINE_finish(local_28);
      if (iVar1 < 0x390) {
        if (iVar1 == 6) {
          return 1;
        }
        if (iVar1 == 0x74) {
          return 1;
        }
        if (iVar1 == 0x198) {
          uVar2 = EC_KEY_can_sign(*(undefined8 *)(param_1 + 8));
          return uVar2;
        }
      }
      else {
        if (iVar1 - 0x43fU < 2) {
          return 1;
        }
        if (iVar1 == 0x390) {
          return 1;
        }
      }
    }
  }
  else {
    EVP_KEYMGMT_get0_provider();
    uVar2 = ossl_provider_libctx();
    pcVar6 = *(code **)(*(long *)(param_1 + 0x18) + 0x98);
    if (pcVar6 == (code *)0x0) {
      uVar3 = EVP_KEYMGMT_get0_name(*(long *)(param_1 + 0x18));
    }
    else {
      uVar3 = (*pcVar6)(0xc);
    }
    lVar5 = EVP_SIGNATURE_fetch(uVar2,uVar3,0);
    if (lVar5 != 0) {
      EVP_SIGNATURE_free();
      return 1;
    }
  }
  return 0;
}

