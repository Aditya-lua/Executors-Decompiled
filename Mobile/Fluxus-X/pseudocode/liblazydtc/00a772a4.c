/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a772a4
 */

undefined8
FUN_00a772a4(uint *param_1,int param_2,uint param_3,int param_4,char *param_5,undefined8 param_6,
            long param_7)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  uint *puVar7;
  
  if ((param_4 == -1) && (param_5 != (char *)0x0)) {
    iVar1 = strcmp(param_5,"distid");
    if ((iVar1 != 0) && (iVar1 = strcmp(param_5,"hexdistid"), iVar1 != 0)) {
LAB_00a77308:
      ERR_new();
      uVar6 = 0x5f6;
      goto LAB_00a77320;
    }
  }
  else if (param_4 != 0xf) goto LAB_00a77308;
  if (param_2 != -1) {
    uVar2 = evp_pkey_ctx_state(param_1);
    if (uVar2 < 2) {
      if (*(int **)(param_1 + 0x1e) == (int *)0x0) {
        ERR_new();
        uVar6 = 0x60a;
LAB_00a77320:
        ERR_set_debug("crypto/evp/pmeth_lib.c",uVar6,"evp_pkey_ctx_store_cached_data");
        ERR_set_error(6,0x93,0);
        return 0xfffffffe;
      }
      iVar1 = EVP_PKEY_type(**(int **)(param_1 + 0x1e));
      iVar3 = EVP_PKEY_type(param_2);
      if (iVar1 != iVar3) {
        ERR_new();
        uVar6 = 0x60e;
        goto LAB_00a7747c;
      }
    }
    else if (uVar2 == 2) {
      lVar5 = *(long *)(param_1 + 8);
      if (lVar5 == 0) {
        ERR_new();
        uVar6 = 0x5fe;
        goto LAB_00a77320;
      }
      uVar6 = evp_pkey_type2name(param_2);
      iVar1 = EVP_KEYMGMT_is_a(lVar5,uVar6);
      if (iVar1 == 0) {
        ERR_new();
        uVar6 = 0x603;
        goto LAB_00a7747c;
      }
    }
  }
  if ((param_3 != 0xffffffff) && ((*param_1 & param_3) == 0)) {
    ERR_new();
    uVar6 = 0x615;
LAB_00a7747c:
    ERR_set_debug("crypto/evp/pmeth_lib.c",uVar6,"evp_pkey_ctx_store_cached_data");
    ERR_set_error(6,0x94,0);
    return 0xffffffff;
  }
  CRYPTO_free(*(void **)(param_1 + 0x10));
  puVar7 = param_1 + 0xe;
  CRYPTO_free(*(void **)puVar7);
  param_1[0x10] = 0;
  param_1[0x11] = 0;
  puVar7[0] = 0;
  puVar7[1] = 0;
  if (param_5 != (char *)0x0) {
    pcVar4 = CRYPTO_strdup(param_5,"crypto/evp/pmeth_lib.c",0x61d);
    *(char **)puVar7 = pcVar4;
    if (pcVar4 == (char *)0x0) {
      ERR_new();
      uVar6 = 0x61f;
      goto LAB_00a774e8;
    }
  }
  if (param_7 != 0) {
    lVar5 = CRYPTO_memdup(param_6,param_7,"crypto/evp/pmeth_lib.c",0x624);
    *(long *)(param_1 + 0x10) = lVar5;
    if (lVar5 == 0) {
      ERR_new();
      uVar6 = 0x626;
LAB_00a774e8:
      ERR_set_debug("crypto/evp/pmeth_lib.c",uVar6,"evp_pkey_ctx_store_cached_data");
      ERR_set_error(6,0xc0100,0);
      return 0;
    }
  }
  *(long *)(param_1 + 0x12) = param_7;
  *(byte *)(param_1 + 0x14) = (byte)param_1[0x14] | 1;
  return 1;
}

