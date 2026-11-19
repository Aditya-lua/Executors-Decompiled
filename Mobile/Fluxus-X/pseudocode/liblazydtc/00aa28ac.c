/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa28ac
 */

undefined8 ossl_provider_info_add_to_store(undefined8 param_1,long *param_2)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  void *pvVar4;
  long lVar5;
  long *plVar6;
  undefined8 uVar7;
  long *plVar8;
  
  lVar3 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
    lVar5 = *param_2;
  }
  else {
    lVar5 = *param_2;
  }
  if (lVar5 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x171,"ossl_provider_info_add_to_store");
    uVar1 = 0xc0102;
LAB_00aa29b8:
    ERR_set_error(0xf,uVar1,0);
    return 0;
  }
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x176,"ossl_provider_info_add_to_store");
    uVar1 = 0xc0103;
    goto LAB_00aa29b8;
  }
  iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar3 + 0x20));
  if (iVar2 == 0) {
    return 0;
  }
  lVar5 = *(long *)(lVar3 + 0x40);
  if (lVar5 == 0) {
    pvVar4 = (void *)CRYPTO_zalloc(400,"crypto/provider_core.c",0x17e);
    *(void **)(lVar3 + 0x30) = pvVar4;
    if (pvVar4 == (void *)0x0) {
      ERR_new();
      uVar7 = 0x180;
LAB_00aa2a68:
      ERR_set_debug("crypto/provider_core.c",uVar7,"ossl_provider_info_add_to_store");
      ERR_set_error(0xf,0xc0100,0);
      uVar7 = 0;
      goto LAB_00aa2a84;
    }
    *(undefined8 *)(lVar3 + 0x40) = 10;
  }
  else if (*(long *)(lVar3 + 0x38) == lVar5) {
    pvVar4 = CRYPTO_realloc(*(void **)(lVar3 + 0x30),(int)(lVar5 + 10) * 0x28,
                            "crypto/provider_core.c",0x189);
    if (pvVar4 == (void *)0x0) {
      ERR_new();
      uVar7 = 0x18b;
      goto LAB_00aa2a68;
    }
    *(void **)(lVar3 + 0x30) = pvVar4;
    *(long *)(lVar3 + 0x40) = lVar5 + 10;
  }
  else {
    pvVar4 = *(void **)(lVar3 + 0x30);
  }
  plVar8 = (long *)(lVar3 + 0x38);
  plVar6 = (long *)((long)pvVar4 + *plVar8 * 0x28);
  plVar6[4] = param_2[4];
  lVar5 = param_2[2];
  plVar6[3] = param_2[3];
  plVar6[2] = lVar5;
  lVar5 = *param_2;
  uVar7 = 1;
  plVar6[1] = param_2[1];
  *plVar6 = lVar5;
  *plVar8 = *plVar8 + 1;
LAB_00aa2a84:
  CRYPTO_THREAD_unlock(*(undefined8 *)(lVar3 + 0x20));
  return uVar7;
}

