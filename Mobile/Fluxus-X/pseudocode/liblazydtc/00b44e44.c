/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b44e44
 */

ulong FUN_00b44e44(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  size_t sVar1;
  undefined *puVar2;
  undefined *puVar3;
  undefined8 uVar4;
  size_t sVar5;
  undefined8 uVar6;
  int iVar7;
  EVP_MD *type;
  undefined8 uVar8;
  EVP_MD_CTX *ctx;
  ulong uVar9;
  undefined8 uVar10;
  size_t len;
  long lVar11;
  undefined8 uVar12;
  uchar auStack_e8 [64];
  undefined1 auStack_a8 [72];
  
  iVar7 = ossl_prov_is_running();
  if ((iVar7 != 0) && (iVar7 = FUN_00b45084(param_1,param_4), iVar7 != 0)) {
    type = (EVP_MD *)ossl_prov_digest_md(param_1 + 2);
    if (type == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/hkdf.c",699,"kdf_tls1_3_derive");
      ERR_set_error(0x39,0x81,0);
    }
    else {
      if (*(int *)(param_1 + 1) == 2) {
        uVar9 = FUN_00b4573c(type,param_1[7],param_1[8],param_1[9],param_1[10],param_1[0xb],
                             param_1[0xc],param_1[0xd],param_1[0xe],param_2,param_3);
        return uVar9;
      }
      if (*(int *)(param_1 + 1) != 1) {
        return 0;
      }
      uVar8 = ossl_prov_ctx_get0_libctx(*param_1);
      uVar10 = param_1[9];
      puVar3 = (undefined *)param_1[7];
      sVar5 = param_1[8];
      lVar11 = param_1[5];
      uVar12 = param_1[0xc];
      uVar4 = param_1[10];
      uVar6 = param_1[0xb];
      iVar7 = EVP_MD_get_size(type);
      if (0 < iVar7) {
        len = (size_t)iVar7;
        sVar1 = len;
        if (puVar3 != (undefined *)0x0) {
          sVar1 = sVar5;
        }
        puVar2 = &DAT_0077c150;
        if (puVar3 != (undefined *)0x0) {
          puVar2 = puVar3;
        }
        if (lVar11 == 0) {
          uVar9 = FUN_00b451d8(uVar8,type,&DAT_0077c150,0,puVar2,sVar1,param_2,param_3);
          return uVar9 & 0xffffffff;
        }
        ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
        if (((ctx == (EVP_MD_CTX *)0x0) ||
            (iVar7 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar7 < 1)) ||
           (iVar7 = EVP_DigestFinal_ex(ctx,auStack_e8,(uint *)0x0), iVar7 < 1)) {
          EVP_MD_CTX_free(ctx);
        }
        else {
          EVP_MD_CTX_free(ctx);
          iVar7 = FUN_00b4573c(type,lVar11,len,uVar10,uVar4,uVar6,uVar12,auStack_e8,len,auStack_a8,
                               len);
          if (iVar7 != 0) {
            uVar9 = FUN_00b451d8(uVar8,type,auStack_a8,len,puVar2,sVar1,param_2,param_3);
            OPENSSL_cleanse(auStack_a8,len);
            return uVar9 & 0xffffffff;
          }
        }
      }
    }
  }
  return 0;
}

