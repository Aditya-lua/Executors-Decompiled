/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b44a48
 */

ulong FUN_00b44a48(undefined8 *param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined1 auStack_a0 [64];
  
  uVar7 = ossl_prov_ctx_get0_libctx(*param_1);
  iVar5 = ossl_prov_is_running();
  if ((iVar5 != 0) && (iVar5 = FUN_00b44c74(param_1,param_4), iVar5 != 0)) {
    lVar8 = ossl_prov_digest_md(param_1 + 2);
    if (lVar8 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/hkdf.c",0xa1,"kdf_hkdf_derive");
      uVar7 = 0x81;
    }
    else {
      lVar10 = param_1[7];
      if (lVar10 != 0) {
        if (param_3 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/kdfs/hkdf.c",0xa9,"kdf_hkdf_derive");
          ERR_set_error(0x39,0x69,0);
          return 0;
        }
        if (*(int *)(param_1 + 1) == 1) {
          uVar9 = FUN_00b451d8(uVar7,lVar8,param_1[5],param_1[6],lVar10,param_1[8],param_2,param_3);
          return uVar9;
        }
        if (*(int *)(param_1 + 1) == 2) {
          uVar9 = FUN_00b452cc(lVar8,lVar10,param_1[8],param_1[0xf],param_1[0x10],param_2,param_3);
          return uVar9;
        }
        uVar1 = param_1[5];
        uVar3 = param_1[6];
        uVar11 = param_1[8];
        uVar2 = param_1[0xf];
        uVar4 = param_1[0x10];
        iVar5 = EVP_MD_get_size(lVar8);
        if (iVar5 < 0) {
          return 0;
        }
        iVar6 = FUN_00b451d8(uVar7,lVar8,uVar1,uVar3,lVar10,uVar11,auStack_a0,(long)iVar5);
        if (iVar6 == 0) {
          return 0;
        }
        uVar9 = FUN_00b452cc(lVar8,auStack_a0,(long)iVar5,uVar2,uVar4,param_2,param_3);
        OPENSSL_cleanse(auStack_a0,0x40);
        return uVar9 & 0xffffffff;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/hkdf.c",0xa5,"kdf_hkdf_derive");
      uVar7 = 0x80;
    }
    ERR_set_error(0x39,uVar7,0);
  }
  return 0;
}

