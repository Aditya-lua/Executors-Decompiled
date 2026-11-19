/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65f7c
 */

undefined8 ossl_cipher_generic_get_ctx_params(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate(param_2,"ivlen");
  if ((lVar2 == 0) ||
     (iVar1 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x50)), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate(param_2,"padding");
    if ((lVar2 == 0) ||
       (iVar1 = OSSL_PARAM_set_uint(lVar2,*(byte *)(param_1 + 0x6c) & 1), iVar1 != 0)) {
      lVar2 = OSSL_PARAM_locate(param_2,&DAT_002bdad8);
      if (((lVar2 == 0) ||
          (iVar1 = OSSL_PARAM_set_octet_ptr(lVar2,param_1,*(undefined8 *)(param_1 + 0x50)),
          iVar1 != 0)) ||
         (iVar1 = OSSL_PARAM_set_octet_string(lVar2,param_1,*(undefined8 *)(param_1 + 0x50)),
         iVar1 != 0)) {
        lVar2 = OSSL_PARAM_locate(param_2,"updated-iv");
        if (lVar2 != 0) {
          iVar1 = OSSL_PARAM_set_octet_ptr(lVar2,param_1 + 0x20,*(undefined8 *)(param_1 + 0x50));
          if ((iVar1 == 0) &&
             (iVar1 = OSSL_PARAM_set_octet_string
                                (lVar2,param_1 + 0x20,*(undefined8 *)(param_1 + 0x50)), iVar1 == 0))
          {
            ERR_new();
            uVar3 = 600;
            goto LAB_00b66180;
          }
        }
        lVar2 = OSSL_PARAM_locate(param_2,&DAT_002aa191);
        if ((lVar2 == 0) ||
           (iVar1 = OSSL_PARAM_set_uint(lVar2,*(undefined4 *)(param_1 + 0xa0)), iVar1 != 0)) {
          lVar2 = OSSL_PARAM_locate(param_2,"keylen");
          if ((lVar2 == 0) ||
             (iVar1 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x48)), iVar1 != 0)) {
            lVar2 = OSSL_PARAM_locate(param_2,"tls-mac");
            if ((lVar2 == 0) ||
               (iVar1 = OSSL_PARAM_set_octet_ptr
                                  (lVar2,*(undefined8 *)(param_1 + 0x78),
                                   *(undefined8 *)(param_1 + 0x88)), iVar1 != 0)) {
              return 1;
            }
            ERR_new();
            uVar3 = 0x268;
          }
          else {
            ERR_new();
            uVar3 = 0x262;
          }
        }
        else {
          ERR_new();
          uVar3 = 0x25d;
        }
      }
      else {
        ERR_new();
        uVar3 = 0x251;
      }
    }
    else {
      ERR_new();
      uVar3 = 0x24a;
    }
  }
  else {
    ERR_new();
    uVar3 = 0x245;
  }
LAB_00b66180:
  ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                "ossl_cipher_generic_get_ctx_params");
  ERR_set_error(0x39,0x68,0);
  return 0;
}

