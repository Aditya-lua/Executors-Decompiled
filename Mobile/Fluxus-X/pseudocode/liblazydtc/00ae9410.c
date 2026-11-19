/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9410
 */

/* WARNING: Removing unreachable block (ram,0x00ae963c) */

long * OSSL_STORE_open_ex(undefined8 param_1,undefined8 param_2,char *param_3,long param_4,
                         undefined8 param_5,long param_6,long param_7,long param_8)

{
  bool bVar1;
  int iVar2;
  char *pcVar3;
  void *pvVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  void *pvVar8;
  ulong uVar9;
  undefined *puVar10;
  ulong uVar11;
  long *ptr;
  void *local_220;
  void *pvStack_218;
  long local_210;
  undefined8 uStack_208;
  undefined8 local_200;
  void *local_1f8;
  void *pvStack_1f0;
  long lStack_1e8;
  undefined8 local_1e0;
  undefined8 local_1d8 [6];
  undefined *local_1a8 [2];
  char acStack_198 [256];
  void *local_98;
  void *pvStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 local_78;
  
  local_1a8[0] = &DAT_002d74d1;
  OPENSSL_strlcpy(acStack_198,param_1,0x100);
  pcVar3 = strchr(acStack_198,0x3a);
  if (pcVar3 == (char *)0x0) {
LAB_00ae94cc:
    uVar9 = 1;
  }
  else {
    *pcVar3 = '\0';
    iVar2 = OPENSSL_strcasecmp(acStack_198,&DAT_002d74d1);
    if (iVar2 == 0) goto LAB_00ae94cc;
    iVar2 = strncmp(pcVar3 + 1,"//",2);
    uVar9 = 1;
    if (iVar2 != 0) {
      uVar9 = 2;
    }
    local_1a8[iVar2 != 0] = acStack_198;
  }
  ERR_set_mark();
  uVar11 = 0;
  pvVar8 = (void *)0x0;
  bVar1 = true;
  do {
    puVar10 = local_1a8[uVar11];
    pvVar4 = (void *)ossl_store_get0_loader_int(puVar10);
    if (pvVar4 == (void *)0x0) {
      pvVar8 = (void *)OSSL_STORE_LOADER_fetch(param_2,puVar10,param_3);
      if (pvVar8 != (void *)0x0) {
        OSSL_STORE_LOADER_get0_provider(pvVar8);
        uVar6 = OSSL_PROVIDER_get0_provider_ctx();
        lVar5 = (**(code **)((long)pvVar8 + 0x90))(uVar6,param_1);
        if (lVar5 != 0) {
          if ((param_6 == 0) ||
             (iVar2 = (**(code **)((long)pvVar8 + 0xa8))(lVar5,param_6), iVar2 != 0)) {
            if ((param_3 != (char *)0x0) &&
               (lVar7 = OSSL_PARAM_locate_const(param_6,"properties"), lVar7 == 0)) {
              OSSL_PARAM_construct_utf8_string(&local_98,"properties",param_3,0);
              local_200 = local_78;
              pvStack_218 = pvStack_90;
              local_220 = local_98;
              uStack_208 = uStack_80;
              local_210 = lStack_88;
              OSSL_PARAM_construct_end(&local_98);
              local_1d8[0] = local_78;
              pvStack_1f0 = pvStack_90;
              local_1f8 = local_98;
              local_1e0 = uStack_80;
              lStack_1e8 = lStack_88;
              iVar2 = (**(code **)((long)pvVar8 + 0xa8))(lVar5,&local_220);
              if (iVar2 == 0) goto LAB_00ae9640;
            }
            bVar1 = false;
            pvVar4 = pvVar8;
            if (lVar5 == 0) goto LAB_00ae9620;
            break;
          }
LAB_00ae9640:
          (**(code **)((long)pvVar8 + 0xc0))(lVar5);
        }
        OSSL_STORE_LOADER_free(pvVar8);
        pvVar8 = (void *)0x0;
        pvVar4 = (void *)0x0;
        goto joined_r0x00ae9660;
      }
      lVar5 = 0;
      pvVar4 = (void *)0x0;
    }
    else {
      if (*(code **)((long)pvVar4 + 0x58) == (code *)0x0) {
        lVar5 = (**(code **)((long)pvVar4 + 0x10))(pvVar4,param_1,param_4,param_5);
      }
      else {
        lVar5 = (**(code **)((long)pvVar4 + 0x58))(pvVar4,param_1,param_2,param_3,param_4,param_5);
      }
joined_r0x00ae9660:
      bVar1 = false;
      if (lVar5 != 0) break;
    }
LAB_00ae9620:
    uVar11 = uVar11 + 1;
  } while (uVar11 < uVar9);
  if ((lVar5 == 0) || (bVar1)) {
    ptr = (long *)0x0;
    pcVar3 = (char *)0x0;
    ERR_clear_last_mark();
    goto joined_r0x00ae96a4;
  }
  if (param_3 == (char *)0x0) {
    pcVar3 = (char *)0x0;
LAB_00ae96b0:
    ptr = (long *)CRYPTO_zalloc(0x78,"crypto/store/store_lib.c",0xa7);
    if (ptr != (long *)0x0) {
      if (param_4 == 0) {
LAB_00ae96f4:
        *ptr = (long)pvVar4;
        ptr[1] = (long)pvVar8;
        ptr[6] = (long)pcVar3;
        ptr[2] = lVar5;
        ptr[3] = param_7;
        ptr[4] = param_8;
        ERR_pop_to_mark();
        return ptr;
      }
      iVar2 = ossl_pw_set_ui_method(ptr + 9,param_4,param_5);
      if ((iVar2 != 0) && (iVar2 = ossl_pw_enable_passphrase_caching(ptr + 9), iVar2 != 0))
      goto LAB_00ae96f4;
      ERR_new();
      ERR_set_debug("crypto/store/store_lib.c",0xaf,"OSSL_STORE_open_ex");
      ERR_set_error(0x2c,0x8000f,0);
      ERR_clear_last_mark();
      goto joined_r0x00ae96a4;
    }
  }
  else {
    pcVar3 = CRYPTO_strdup(param_3,"crypto/store/store_lib.c",0xa6);
    if (pcVar3 != (char *)0x0) goto LAB_00ae96b0;
  }
  ERR_new();
  ERR_set_debug("crypto/store/store_lib.c",0xa8,"OSSL_STORE_open_ex");
  ERR_set_error(0x2c,0xc0100,0);
  ptr = (long *)0x0;
  ERR_clear_last_mark();
joined_r0x00ae96a4:
  if (lVar5 != 0) {
    memset(&uStack_208,0,0x60);
    local_220 = pvVar4;
    pvStack_218 = pvVar8;
    local_210 = lVar5;
    if ((pvVar8 == (void *)0x0) ||
       ((**(code **)((long)pvVar4 + 0xc0))(lVar5), pvStack_218 == (void *)0x0)) {
      (**(code **)((long)local_220 + 0x50))(local_210);
    }
    pvVar4 = pvStack_218;
    OPENSSL_sk_pop_free(local_1e0,OSSL_STORE_INFO_free);
    OSSL_STORE_LOADER_free(pvVar4);
    CRYPTO_free(pvStack_1f0);
    ossl_pw_clear_passphrase_data(local_1d8);
  }
  OSSL_STORE_LOADER_free(pvVar8);
  CRYPTO_free(pcVar3);
  CRYPTO_free(ptr);
  return (long *)0x0;
}

