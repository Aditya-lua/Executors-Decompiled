/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d2f4
 */

undefined8
FUN_00a6d2f4(int *param_1,ENGINE *param_2,int param_3,char *param_4,int param_5,long param_6)

{
  ENGINE **pe;
  uint uVar1;
  int iVar2;
  long lVar3;
  EVP_PKEY_ASN1_METHOD *pEVar4;
  EVP_PKEY_ASN1_METHOD *pEVar5;
  undefined8 uVar6;
  ENGINE *local_58;
  
  pe = &local_58;
  if (param_2 != (ENGINE *)0x0) {
    pe = (ENGINE **)0x0;
  }
  local_58 = param_2;
  if ((param_2 == (ENGINE *)0x0 && param_3 == 0) || (param_6 == 0)) {
    pEVar4 = (EVP_PKEY_ASN1_METHOD *)0x0;
    if (param_1 == (int *)0x0) {
LAB_00a6d3e0:
      if (param_4 == (char *)0x0) {
        if (param_3 == 0) {
          pEVar5 = (EVP_PKEY_ASN1_METHOD *)0x0;
        }
        else {
          pEVar5 = EVP_PKEY_asn1_find(pe,param_3);
          pEVar4 = pEVar5;
        }
      }
      else {
        pEVar5 = EVP_PKEY_asn1_find_str(pe,param_4,param_5);
        pEVar4 = pEVar5;
      }
      if ((param_1 == (int *)0x0) && (param_2 == (ENGINE *)0x0)) {
        uVar1 = ENGINE_finish(local_58);
        pEVar4 = (EVP_PKEY_ASN1_METHOD *)(ulong)uVar1;
      }
      if ((param_6 == 0) && (pEVar5 == (EVP_PKEY_ASN1_METHOD *)0x0)) {
        ERR_new(pEVar4);
        ERR_set_debug("crypto/evp/p_lib.c",0x615,"pkey_set_type");
        uVar6 = 0x9c;
        goto LAB_00a6d450;
      }
      if (param_1 == (int *)0x0) goto LAB_00a6d4e4;
      if (param_6 == 0) {
        param_1[0x18] = 0;
        param_1[0x19] = 0;
        *param_1 = param_3;
        param_1[1] = param_3;
        *(EVP_PKEY_ASN1_METHOD **)(param_1 + 2) = pEVar5;
        if (pEVar5 != (EVP_PKEY_ASN1_METHOD *)0x0) goto LAB_00a6d498;
LAB_00a6d4c0:
        iVar2 = -1;
LAB_00a6d4c4:
        *param_1 = iVar2;
      }
      else {
        iVar2 = EVP_KEYMGMT_up_ref(param_6);
        if (iVar2 == 0) {
          ERR_new();
          uVar6 = 0x61b;
          goto LAB_00a6d368;
        }
        *(long *)(param_1 + 0x18) = param_6;
        *param_1 = param_3;
        param_1[1] = param_3;
        if (pEVar5 == (EVP_PKEY_ASN1_METHOD *)0x0) goto LAB_00a6d4c0;
LAB_00a6d498:
        if (param_3 == 0) {
          iVar2 = *(int *)pEVar5;
          goto LAB_00a6d4c4;
        }
      }
      if (((pe == (ENGINE **)0x0) && (local_58 != (ENGINE *)0x0)) &&
         (iVar2 = ENGINE_init(local_58), iVar2 == 0)) {
        ERR_new();
        ERR_set_debug("crypto/evp/p_lib.c",0x63d,"pkey_set_type");
        uVar6 = 0x86;
        goto LAB_00a6d450;
      }
      *(ENGINE **)(param_1 + 4) = local_58;
    }
    else {
      if ((*(long *)(param_1 + 8) != 0) || (*(long *)(param_1 + 0x1a) != 0)) {
        evp_keymgmt_util_clear_operation_cache(param_1,1);
        evp_pkey_free_legacy(param_1);
        lVar3 = *(long *)(param_1 + 0x18);
        if (lVar3 != 0) {
          evp_keymgmt_freedata(lVar3,*(undefined8 *)(param_1 + 0x1a));
          EVP_KEYMGMT_free(*(undefined8 *)(param_1 + 0x18));
          *(long *)(param_1 + 0x18) = 0;
          param_1[0x1a] = 0;
          param_1[0x1b] = 0;
        }
        *param_1 = 0;
LAB_00a6d3c8:
        ENGINE_finish(*(ENGINE **)(param_1 + 4));
        param_1[4] = 0;
        param_1[5] = 0;
        uVar1 = ENGINE_finish(*(ENGINE **)(param_1 + 6));
        pEVar4 = (EVP_PKEY_ASN1_METHOD *)(ulong)uVar1;
        param_1[6] = 0;
        param_1[7] = 0;
        goto LAB_00a6d3e0;
      }
      if (((*param_1 == 0) || (param_1[1] != param_3)) || (*(long *)(param_1 + 2) == 0))
      goto LAB_00a6d3c8;
    }
LAB_00a6d4e4:
    uVar6 = 1;
  }
  else {
    ERR_new();
    uVar6 = 0x5e2;
LAB_00a6d368:
    ERR_set_debug("crypto/evp/p_lib.c",uVar6,"pkey_set_type");
    uVar6 = 0xc0103;
LAB_00a6d450:
    ERR_set_error(6,uVar6,0);
    uVar6 = 0;
  }
  return uVar6;
}

