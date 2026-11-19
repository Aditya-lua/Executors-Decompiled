/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4fb3c
 */

ulong FUN_00a4fb3c(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  int iVar11;
  long local_78;
  long local_70;
  int local_68;
  
  lVar5 = OSSL_DECODER_INSTANCE_get_decoder();
  uVar6 = OSSL_DECODER_INSTANCE_get_decoder_ctx(param_1);
  lVar7 = OSSL_DECODER_get0_provider(lVar5);
  lVar8 = OSSL_PARAM_locate_const(param_2,"data-type");
  if (lVar8 != 0) {
    local_78 = 0;
    uVar9 = OSSL_PARAM_get_utf8_string(lVar8,&local_78,0);
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    CRYPTO_free((void *)param_3[4]);
    param_3[4] = local_78;
  }
  lVar8 = OSSL_PARAM_locate_const(param_2,"reference");
  if (lVar8 == 0) {
    return 0;
  }
  if (*(int *)(lVar8 + 8) != 5) {
    return 0;
  }
  uVar1 = *(undefined8 *)(lVar8 + 0x10);
  uVar2 = *(undefined8 *)(lVar8 + 0x18);
  iVar3 = OPENSSL_sk_num(param_3[3]);
  if (0 < iVar3) {
    iVar11 = 0;
    do {
      lVar10 = OPENSSL_sk_value(param_3[3],iVar11);
      lVar8 = EVP_KEYMGMT_get0_provider();
      if (((lVar8 == lVar7) && (iVar4 = evp_keymgmt_has_load(lVar10), iVar4 != 0)) &&
         (iVar4 = EVP_KEYMGMT_is_a(lVar10,param_3[4]), iVar4 != 0)) {
        uVar9 = EVP_KEYMGMT_up_ref(lVar10);
        if ((int)uVar9 == 0) {
          return uVar9;
        }
        if (lVar10 != 0) goto LAB_00a4fcc8;
        goto LAB_00a4fd10;
      }
      iVar11 = iVar11 + 1;
    } while (iVar11 < iVar3);
  }
  lVar10 = EVP_KEYMGMT_fetch(*param_3,param_3[4],param_3[1]);
  if (lVar10 == 0) goto LAB_00a4fd10;
  lVar8 = EVP_KEYMGMT_get0_provider();
  if (lVar8 == lVar7) {
LAB_00a4fcc8:
    lVar5 = evp_keymgmt_load(lVar10,uVar1,uVar2);
    if (lVar5 != 0) goto LAB_00a4fce0;
LAB_00a4fcfc:
    lVar7 = 0;
  }
  else {
    local_70 = 0;
    local_68 = 0x87;
    if (*(int *)(param_3 + 2) != 0) {
      local_68 = *(int *)(param_3 + 2);
    }
    local_78 = lVar10;
    (**(code **)(lVar5 + 0x78))(uVar6,uVar1,uVar2,evp_keymgmt_util_try_import,&local_78);
    lVar5 = local_70;
    if (local_70 == 0) goto LAB_00a4fcfc;
LAB_00a4fce0:
    lVar7 = evp_keymgmt_util_make_pkey(lVar10,lVar5);
    if (lVar7 == 0) {
      evp_keymgmt_freedata(lVar10,lVar5);
      goto LAB_00a4fcfc;
    }
  }
  *(long *)param_3[5] = lVar7;
  EVP_KEYMGMT_free(lVar10);
LAB_00a4fd10:
  return (ulong)(*(long *)param_3[5] != 0);
}

