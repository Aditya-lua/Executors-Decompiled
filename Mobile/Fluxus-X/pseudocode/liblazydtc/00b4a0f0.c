/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4a0f0
 */

undefined8 FUN_00b4a0f0(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined *puVar6;
  long lVar7;
  long local_48;
  long local_38;
  
  uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    lVar3 = OSSL_PARAM_locate_const(param_2,"digest");
    if (lVar3 != 0) {
      iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(lVar3 + 0x10),"MD5-SHA1");
      if (iVar1 == 0) {
        uVar4 = ossl_prov_macctx_load_from_params
                          (param_1 + 1,param_2,&DAT_002c35d3,0,&DAT_002d53fd,uVar2);
        if ((int)uVar4 == 0) {
          return uVar4;
        }
        puVar5 = param_1 + 2;
        puVar6 = &DAT_002d142e;
      }
      else {
        EVP_MAC_CTX_free(param_1[2]);
        puVar5 = param_1 + 1;
        puVar6 = (undefined *)0x0;
      }
      uVar2 = ossl_prov_macctx_load_from_params(puVar5,param_2,&DAT_002c35d3,0,puVar6,uVar2);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"secret");
    if (lVar3 != 0) {
      puVar5 = param_1 + 3;
      CRYPTO_clear_free(*puVar5,param_1[4],"providers/implementations/kdfs/tls1_prf.c",0xc3);
      *puVar5 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar5,0,param_1 + 4);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
    if (lVar3 != 0) {
      do {
        lVar7 = param_1[0x85];
        local_48 = 0;
        local_38 = (long)param_1 + lVar7 + 0x28;
        if ((*(long *)(lVar3 + 0x18) != 0) && (*(long *)(lVar3 + 0x10) != 0)) {
          uVar2 = OSSL_PARAM_get_octet_string(lVar3,&local_38,0x400 - lVar7,&local_48);
          if ((int)uVar2 == 0) {
            return uVar2;
          }
          lVar7 = param_1[0x85];
        }
        param_1[0x85] = lVar7 + local_48;
        lVar3 = OSSL_PARAM_locate_const(lVar3 + 0x28,&DAT_002bb864);
      } while (lVar3 != 0);
    }
  }
  return 1;
}

