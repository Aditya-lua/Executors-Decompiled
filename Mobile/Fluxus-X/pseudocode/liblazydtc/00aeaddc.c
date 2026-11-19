/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeaddc
 */

long * OSSL_STORE_attach(undefined8 param_1,undefined *param_2,undefined8 param_3,long param_4,
                        long param_5,undefined8 param_6,long param_7,long param_8,long param_9)

{
  undefined *puVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long *ptr;
  long lVar7;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  puVar1 = &DAT_002d74d1;
  if (param_2 != (undefined *)0x0) {
    puVar1 = param_2;
  }
  ERR_set_mark();
  lVar3 = ossl_store_get0_loader_int(puVar1);
  if (lVar3 == 0) {
    lVar7 = OSSL_STORE_LOADER_fetch(param_3,puVar1,param_4);
    if (lVar7 == 0) goto LAB_00aeafc0;
    OSSL_STORE_LOADER_get0_provider();
    uVar5 = OSSL_PROVIDER_get0_provider_ctx();
    lVar3 = ossl_core_bio_new_from_bio(param_1);
    if (lVar3 == 0) {
      lVar4 = 0;
LAB_00aeaf58:
      OSSL_STORE_LOADER_free(lVar7);
      lVar7 = 0;
    }
    else {
      lVar4 = (**(code **)(lVar7 + 0x98))(uVar5,lVar3);
      if (lVar4 == 0) goto LAB_00aeaf58;
      if ((param_7 != 0) && (iVar2 = (**(code **)(lVar7 + 0xa8))(lVar4,param_7), iVar2 == 0)) {
LAB_00aeaf44:
        (**(code **)(lVar7 + 0xc0))(lVar4);
        goto LAB_00aeaf58;
      }
      if ((param_4 != 0) && (lVar6 = OSSL_PARAM_locate_const(param_7,"properties"), lVar6 == 0)) {
        OSSL_PARAM_construct_utf8_string(&local_d8,"properties",param_4,0);
        local_90 = local_b8;
        uStack_a8 = uStack_d0;
        local_b0 = local_d8;
        uStack_98 = uStack_c0;
        uStack_a0 = local_c8;
        OSSL_PARAM_construct_end(&local_d8);
        local_68 = local_b8;
        uStack_70 = uStack_c0;
        local_78 = local_c8;
        uStack_80 = uStack_d0;
        local_88 = local_d8;
        iVar2 = (**(code **)(lVar7 + 0xa8))(lVar4,&local_b0);
        if (iVar2 == 0) goto LAB_00aeaf44;
      }
    }
    ossl_core_bio_free(lVar3);
    lVar3 = lVar7;
  }
  else {
    lVar4 = (**(code **)(lVar3 + 0x18))(lVar3,param_1,param_3,param_4,param_5,param_6);
    lVar7 = 0;
  }
  if (lVar4 != 0) {
    ptr = (long *)CRYPTO_zalloc(0x78,"crypto/store/store_lib.c",0x3f4);
    if (ptr == (long *)0x0) {
      ERR_clear_last_mark();
      ERR_new();
      ERR_set_debug("crypto/store/store_lib.c",0x3f6,"OSSL_STORE_attach");
      ERR_set_error(0x2c,0xc0100,0);
      return (long *)0x0;
    }
    if ((param_5 == 0) || (iVar2 = ossl_pw_set_ui_method(ptr + 9,param_5,param_6), iVar2 != 0)) {
      *ptr = lVar3;
      ptr[1] = lVar7;
      ptr[2] = lVar4;
      ptr[3] = param_8;
      ptr[4] = param_9;
      ERR_pop_to_mark();
      return ptr;
    }
    ERR_clear_last_mark();
    CRYPTO_free(ptr);
    return (long *)0x0;
  }
LAB_00aeafc0:
  ERR_clear_last_mark();
  return (long *)0x0;
}

