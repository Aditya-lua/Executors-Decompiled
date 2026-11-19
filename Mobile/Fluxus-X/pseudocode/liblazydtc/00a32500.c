/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32500
 */

undefined8 ossl_ec_group_set_params(long param_1,undefined8 param_2)

{
  void *__src;
  size_t __n;
  int iVar1;
  long lVar2;
  void *__dest;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined4 local_38;
  undefined4 local_34;
  
  local_38 = 0xffffffff;
  local_34 = 0xffffffff;
  lVar2 = OSSL_PARAM_locate_const(param_2,"point-format");
  if (lVar2 == 0) {
LAB_00a3254c:
    lVar2 = OSSL_PARAM_locate_const(param_2,"encoding");
    if (lVar2 != 0) {
      iVar1 = ossl_ec_encoding_param2id(lVar2,&local_34);
      if (iVar1 == 0) {
        ERR_new();
        uVar3 = 0x5ef;
        goto LAB_00a32630;
      }
      *(undefined4 *)(param_1 + 0x24) = local_34;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
    if (lVar2 == 0) {
      return 1;
    }
    if (*(int *)(lVar2 + 8) == 5) {
      __src = *(void **)(lVar2 + 0x10);
      __n = *(size_t *)(lVar2 + 0x18);
      puVar4 = (undefined8 *)(param_1 + 0x30);
      CRYPTO_free((void *)*puVar4);
      *puVar4 = 0;
      *(undefined8 *)(param_1 + 0x38) = 0;
      if (__src == (void *)0x0) {
        return 1;
      }
      if (__n == 0) {
        return 1;
      }
      __dest = CRYPTO_malloc((int)__n,"crypto/ec/ec_lib.c",0x217);
      *puVar4 = __dest;
      if (__dest != (void *)0x0) {
        memcpy(__dest,__src,__n);
        *(size_t *)(param_1 + 0x38) = __n;
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x218,"EC_GROUP_set_seed");
      ERR_set_error(0x10,0xc0100,0);
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x5fa,"ossl_ec_group_set_params");
    uVar3 = 0xaf;
  }
  else {
    iVar1 = ossl_ec_pt_format_param2id(lVar2,&local_38);
    if (iVar1 != 0) {
      *(undefined4 *)(param_1 + 0x2c) = local_38;
      goto LAB_00a3254c;
    }
    ERR_new();
    uVar3 = 0x5e6;
LAB_00a32630:
    ERR_set_debug("crypto/ec/ec_lib.c",uVar3,"ossl_ec_group_set_params");
    uVar3 = 0x68;
  }
  ERR_set_error(0x10,uVar3,0);
  return 0;
}

