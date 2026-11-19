/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a9e4
 */

undefined8 FUN_00b5a9e4(long param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  long *plVar6;
  
  plVar6 = *(long **)(param_1 + 0xf8);
  uVar4 = ossl_prov_ctx_get0_libctx(*(undefined8 *)(param_1 + 8));
  iVar1 = ossl_prov_digest_load_from_params(plVar6 + 1,param_2,uVar4);
  if (iVar1 != 0) {
    lVar5 = ossl_prov_digest_md(plVar6 + 1);
    if ((lVar5 == 0) || (uVar2 = EVP_MD_get_flags(lVar5), (uVar2 >> 1 & 1) == 0)) {
      iVar1 = ossl_prov_macctx_load_from_params(plVar6,param_2,0,0,0,uVar4);
      if (iVar1 != 0) {
        if (*plVar6 != 0) {
          uVar3 = EVP_MD_get_size(lVar5);
          uVar2 = (uVar3 & 0x1ffffff8) << 3;
          plVar6[4] = (long)(int)uVar3;
          *(long *)(param_1 + 0xe8) = (long)(int)uVar3;
          if (0xff < uVar2) {
            uVar2 = 0x100;
          }
          *(uint *)(param_1 + 0x80) = uVar2;
          *(ulong *)(param_1 + 0x90) = (ulong)(uVar2 >> 3);
          *(ulong *)(param_1 + 0xa0) = (ulong)(uVar2 >> 4);
        }
        uVar4 = ossl_drbg_set_ctx_params(param_1,param_2);
        return uVar4;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg_hmac.c",0x176,"drbg_hmac_set_ctx_params");
      ERR_set_error(0x39,0xb7,0);
    }
  }
  return 0;
}

