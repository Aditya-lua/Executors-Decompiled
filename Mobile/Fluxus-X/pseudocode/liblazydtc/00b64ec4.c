/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64ec4
 */

undefined8
ossl_cipher_generic_get_params
          (undefined8 param_1,undefined4 param_2,uint param_3,ulong param_4,ulong param_5,
          ulong param_6)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate(param_1,&DAT_002d7a76);
  if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_uint(lVar2,param_2), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate(param_1,&DAT_002c9959);
    if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_3 & 1), iVar1 != 0)) {
      lVar2 = OSSL_PARAM_locate(param_1,"custom-iv");
      if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_3 >> 1 & 1), iVar1 != 0)) {
        lVar2 = OSSL_PARAM_locate(param_1,&DAT_002c5a92);
        if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_3 >> 2 & 1), iVar1 != 0)) {
          lVar2 = OSSL_PARAM_locate(param_1,"tls-multi");
          if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_3 >> 3 & 1), iVar1 != 0)) {
            lVar2 = OSSL_PARAM_locate(param_1,"has-randkey");
            if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_int(lVar2,param_3 >> 4 & 1), iVar1 != 0)) {
              lVar2 = OSSL_PARAM_locate(param_1,"keylen");
              if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_size_t(lVar2,param_4 >> 3), iVar1 != 0)) {
                lVar2 = OSSL_PARAM_locate(param_1,"blocksize");
                if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_set_size_t(lVar2,param_5 >> 3), iVar1 != 0))
                {
                  lVar2 = OSSL_PARAM_locate(param_1,"ivlen");
                  if ((lVar2 == 0) ||
                     (iVar1 = OSSL_PARAM_set_size_t(lVar2,param_6 >> 3), iVar1 != 0)) {
                    return 1;
                  }
                  ERR_new();
                  uVar3 = 0x5e;
                }
                else {
                  ERR_new();
                  uVar3 = 0x59;
                }
              }
              else {
                ERR_new();
                uVar3 = 0x54;
              }
            }
            else {
              ERR_new();
              uVar3 = 0x4f;
            }
          }
          else {
            ERR_new();
            uVar3 = 0x49;
          }
        }
        else {
          ERR_new();
          uVar3 = 0x43;
        }
      }
      else {
        ERR_new();
        uVar3 = 0x3d;
      }
    }
    else {
      ERR_new();
      uVar3 = 0x37;
    }
  }
  else {
    ERR_new();
    uVar3 = 0x31;
  }
  ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                "ossl_cipher_generic_get_params");
  ERR_set_error(0x39,0x68,0);
  return 0;
}

