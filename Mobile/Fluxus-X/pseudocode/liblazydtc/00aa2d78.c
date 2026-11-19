/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2d78
 */

long ossl_provider_new(undefined8 param_1,char *param_2,long param_3)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  
  lVar2 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
LAB_00aa2df0:
    lVar2 = 0;
  }
  else {
    if (param_3 == 0) {
      pcVar3 = "default";
      plVar7 = &DAT_00c6d898;
      do {
        iVar1 = strcmp(pcVar3,param_2);
        if (iVar1 == 0) {
          pcVar3 = (char *)plVar7[-2];
          param_3 = plVar7[-1];
          lVar6 = *plVar7;
          goto LAB_00aa2ea0;
        }
        pcVar3 = (char *)plVar7[2];
        plVar7 = plVar7 + 5;
      } while (pcVar3 != (char *)0x0);
      iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar2 + 0x20));
      if (iVar1 == 0) goto LAB_00aa2df0;
      uVar4 = *(ulong *)(lVar2 + 0x38);
      if (uVar4 == 0) {
        lVar6 = 0;
        param_3 = 0;
        pcVar3 = (char *)0x0;
      }
      else {
        uVar5 = 0;
        plVar7 = (long *)(*(long *)(lVar2 + 0x30) + 0x10);
        do {
          iVar1 = strcmp((char *)plVar7[-2],param_2);
          if (iVar1 == 0) {
            pcVar3 = (char *)plVar7[-1];
            param_3 = *plVar7;
            lVar6 = plVar7[1];
            goto LAB_00aa2e98;
          }
          uVar5 = uVar5 + 1;
          plVar7 = plVar7 + 5;
        } while (uVar5 < uVar4);
        lVar6 = 0;
        param_3 = 0;
        pcVar3 = (char *)0x0;
      }
LAB_00aa2e98:
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar2 + 0x20));
    }
    else {
      lVar6 = 0;
      pcVar3 = (char *)0x0;
    }
LAB_00aa2ea0:
    lVar2 = FUN_00aa2f50(param_2,param_3,lVar6);
    if (lVar2 == 0) {
      return 0;
    }
    CRYPTO_free(*(void **)(lVar2 + 0x30));
    *(undefined8 *)(lVar2 + 0x30) = 0;
    if (pcVar3 != (char *)0x0) {
      pcVar3 = CRYPTO_strdup(pcVar3,"crypto/provider_core.c",0x2f1);
      *(char **)(lVar2 + 0x30) = pcVar3;
      if (pcVar3 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/provider_core.c",0x2f3,"ossl_provider_set_module_path");
        ERR_set_error(0xf,0xc0100,0);
        ossl_provider_free(lVar2);
        goto LAB_00aa2df0;
      }
    }
    *(undefined8 *)(lVar2 + 0x50) = param_1;
    iVar1 = ERR_get_next_error_library();
    *(int *)(lVar2 + 0x60) = iVar1;
  }
  return lVar2;
}

