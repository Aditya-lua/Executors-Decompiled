/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2ad0c
 */

undefined8 FUN_00b2ad0c(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  size_t __n;
  long lVar4;
  long local_38;
  
  if (param_2 == 0) {
LAB_00b2af1c:
    uVar3 = 1;
  }
  else {
    lVar4 = *(long *)(param_1 + 0xa8);
    lVar2 = OSSL_PARAM_locate_const(param_2,"keylen");
    if (lVar2 == 0) {
LAB_00b2ad5c:
      lVar2 = OSSL_PARAM_locate_const(param_2,"ivlen");
      if (lVar2 == 0) {
LAB_00b2ad88:
        lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c5a75);
        if (lVar2 == 0) {
LAB_00b2aea8:
          lVar2 = OSSL_PARAM_locate_const(param_2,"tlsaad");
          if (lVar2 != 0) {
            if (*(int *)(lVar2 + 8) != 5) {
              ERR_new();
              uVar3 = 0xdb;
              goto LAB_00b2af58;
            }
            iVar1 = (**(code **)(lVar4 + 0x28))
                              (param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18));
            local_38 = (long)iVar1;
            if (iVar1 == 0) {
              ERR_new();
              ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",0xe0,
                            "chacha20_poly1305_set_ctx_params");
              uVar3 = 0x73;
              goto LAB_00b2af64;
            }
            *(long *)(param_1 + 0x348) = local_38;
          }
          lVar2 = OSSL_PARAM_locate_const(param_2,"tlsivfixed");
          if (lVar2 != 0) {
            if (*(int *)(lVar2 + 8) != 5) {
              ERR_new();
              uVar3 = 0xe9;
              goto LAB_00b2af58;
            }
            iVar1 = (**(code **)(lVar4 + 0x30))
                              (param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18));
            if (iVar1 == 0) {
              ERR_new();
              uVar3 = 0xed;
              goto LAB_00b2ae5c;
            }
          }
          goto LAB_00b2af1c;
        }
        if (*(int *)(lVar2 + 8) != 5) {
          ERR_new();
          uVar3 = 199;
          goto LAB_00b2af58;
        }
        __n = *(size_t *)(lVar2 + 0x18);
        if (__n - 1 < 0x10) {
          if (*(void **)(lVar2 + 0x10) != (void *)0x0) {
            if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) != 0) {
              ERR_new();
              ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",0xd0,
                            "chacha20_poly1305_set_ctx_params");
              uVar3 = 0x78;
              goto LAB_00b2af64;
            }
            memcpy((void *)(param_1 + 0x2fc),*(void **)(lVar2 + 0x10),__n);
            __n = *(size_t *)(lVar2 + 0x18);
          }
          *(size_t *)(param_1 + 0x338) = __n;
          goto LAB_00b2aea8;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",0xcb,
                      "chacha20_poly1305_set_ctx_params");
        uVar3 = 0x76;
      }
      else {
        iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_38);
        if (iVar1 == 0) {
          ERR_new();
          uVar3 = 0xbb;
          goto LAB_00b2af58;
        }
        if (local_38 == 0xc) goto LAB_00b2ad88;
        ERR_new();
        uVar3 = 0xbf;
LAB_00b2ae5c:
        ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",uVar3,
                      "chacha20_poly1305_set_ctx_params");
        uVar3 = 0x6d;
      }
    }
    else {
      iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_38);
      if (iVar1 != 0) {
        if (local_38 == 0x20) goto LAB_00b2ad5c;
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",0xb4,
                      "chacha20_poly1305_set_ctx_params");
        uVar3 = 0x69;
        goto LAB_00b2af64;
      }
      ERR_new();
      uVar3 = 0xb0;
LAB_00b2af58:
      ERR_set_debug("providers/implementations/ciphers/cipher_chacha20_poly1305.c",uVar3,
                    "chacha20_poly1305_set_ctx_params");
      uVar3 = 0x67;
    }
LAB_00b2af64:
    ERR_set_error(0x39,uVar3,0);
    uVar3 = 0;
  }
  return uVar3;
}

