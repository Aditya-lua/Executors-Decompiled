/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b668a0
 */

undefined8 ossl_ccm_get_ctx_params(byte *param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate(param_2,"ivlen");
  if ((lVar2 == 0) ||
     (iVar1 = OSSL_PARAM_set_size_t(lVar2,0xf - *(long *)(param_1 + 8)), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate(param_2,"taglen");
    if ((lVar2 == 0) ||
       (iVar1 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x10)), iVar1 != 0)) {
      lVar2 = OSSL_PARAM_locate(param_2,&DAT_002bdad8);
      if (lVar2 != 0) {
        if (0xfU - *(long *)(param_1 + 8) <= *(ulong *)(lVar2 + 0x18)) {
          iVar1 = OSSL_PARAM_set_octet_string(lVar2,param_1 + 0x30);
          if ((iVar1 == 0) &&
             (iVar1 = OSSL_PARAM_set_octet_ptr(lVar2,param_1 + 0x30,*(undefined8 *)(lVar2 + 0x18)),
             iVar1 == 0)) {
            ERR_new();
            uVar3 = 0xb0;
            goto LAB_00b66b78;
          }
          goto LAB_00b66990;
        }
        ERR_new();
        uVar3 = 0xab;
LAB_00b669d8:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",uVar3,
                      "ossl_ccm_get_ctx_params");
        uVar3 = 0x6d;
        goto LAB_00b66b84;
      }
LAB_00b66990:
      lVar2 = OSSL_PARAM_locate(param_2,"updated-iv");
      if (lVar2 != 0) {
        if (*(ulong *)(lVar2 + 0x18) < 0xfU - *(long *)(param_1 + 8)) {
          ERR_new();
          uVar3 = 0xb8;
          goto LAB_00b669d8;
        }
        iVar1 = OSSL_PARAM_set_octet_string(lVar2,param_1 + 0x30);
        if ((iVar1 == 0) &&
           (iVar1 = OSSL_PARAM_set_octet_ptr(lVar2,param_1 + 0x30,*(undefined8 *)(lVar2 + 0x18)),
           iVar1 == 0)) {
          ERR_new();
          uVar3 = 0xbd;
          goto LAB_00b66b78;
        }
      }
      lVar2 = OSSL_PARAM_locate(param_2,"keylen");
      if ((lVar2 == 0) ||
         (iVar1 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x18)), iVar1 != 0)) {
        lVar2 = OSSL_PARAM_locate(param_2,"tlsaadpad");
        if ((lVar2 == 0) ||
           (iVar1 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x28)), iVar1 != 0)) {
          lVar2 = OSSL_PARAM_locate(param_2,&DAT_002c5a75);
          if (lVar2 == 0) {
            return 1;
          }
          if (((*param_1 ^ 0xff) & 9) != 0) {
            ERR_new();
            ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0xd1,
                          "ossl_ccm_get_ctx_params");
            uVar3 = 0x77;
            goto LAB_00b66b84;
          }
          if (*(int *)(lVar2 + 8) == 5) {
            uVar3 = (**(code **)(*(long *)(param_1 + 0x90) + 0x28))
                              (param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18));
            if ((int)uVar3 == 0) {
              return uVar3;
            }
            *param_1 = *param_1 & 0xe3;
            return 1;
          }
          ERR_new();
          uVar3 = 0xd5;
        }
        else {
          ERR_new();
          uVar3 = 0xca;
        }
      }
      else {
        ERR_new();
        uVar3 = 0xc4;
      }
    }
    else {
      ERR_new();
      uVar3 = 0xa3;
    }
  }
  else {
    ERR_new();
    uVar3 = 0x9a;
  }
LAB_00b66b78:
  ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",uVar3,
                "ossl_ccm_get_ctx_params");
  uVar3 = 0x68;
LAB_00b66b84:
  ERR_set_error(0x39,uVar3,0);
  return 0;
}

