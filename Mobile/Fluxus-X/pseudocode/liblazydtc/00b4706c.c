/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4706c
 */

undefined8 FUN_00b4706c(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong local_30;
  int local_24;
  
  uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    uVar2 = ossl_prov_digest_load_from_params(param_1 + 6,param_2,uVar2);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"pkcs5");
    if (lVar3 != 0) {
      uVar2 = OSSL_PARAM_get_int(lVar3,&local_24);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      *(uint *)(param_1 + 9) = (uint)(local_24 == 0);
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002c3a6a);
    if ((lVar3 != 0) && (uVar2 = FUN_00b47228(param_1 + 1,param_1 + 2,lVar3), (int)uVar2 == 0)) {
      return uVar2;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
    if (lVar3 != 0) {
      if ((*(int *)(param_1 + 9) != 0) && (*(ulong *)(lVar3 + 0x18) < 0x10)) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0xc4,"kdf_pbkdf2_set_ctx_params");
        uVar2 = 0x70;
        goto LAB_00b471c0;
      }
      uVar2 = FUN_00b47228(param_1 + 3,param_1 + 4);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002ac172);
    if (lVar3 != 0) {
      uVar2 = OSSL_PARAM_get_uint64(lVar3,&local_30);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar1 = 1000;
      if (*(int *)(param_1 + 9) == 0) {
        uVar1 = 1;
      }
      if (local_30 < uVar1) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0xd0,"kdf_pbkdf2_set_ctx_params");
        uVar2 = 0x7b;
LAB_00b471c0:
        ERR_set_error(0x39,uVar2,0);
        return 0;
      }
      param_1[5] = local_30;
    }
  }
  return 1;
}

