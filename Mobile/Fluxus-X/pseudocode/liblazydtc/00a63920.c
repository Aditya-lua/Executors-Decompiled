/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63920
 */

undefined8 EVP_PKEY_derive_set_peer_ex(int *param_1,EVP_PKEY *param_2,int param_3)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long local_38;
  
  local_38 = 0;
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/exchange.c",0x182,"EVP_PKEY_derive_set_peer_ex");
    uVar2 = 0xc0102;
LAB_00a63a1c:
    ERR_set_error(6,uVar2,0);
    uVar2 = 0xffffffff;
  }
  else {
    if ((*param_1 == 0x800) && (*(long *)(param_1 + 0xc) != 0)) {
      lVar4 = *(long *)(param_1 + 10);
      if (*(long *)(lVar4 + 0x40) != 0) {
        if (param_3 != 0) {
          ctx = (EVP_PKEY_CTX *)
                EVP_PKEY_CTX_new_from_pkey
                          (*(undefined8 *)(param_1 + 2),param_2,*(undefined8 *)(param_1 + 4));
          if (ctx == (EVP_PKEY_CTX *)0x0) {
            return 0xffffffff;
          }
          iVar1 = EVP_PKEY_public_check();
          EVP_PKEY_CTX_free(ctx);
          if (iVar1 < 1) {
            return 0xffffffff;
          }
          lVar4 = *(long *)(param_1 + 10);
        }
        uVar5 = *(undefined8 *)(lVar4 + 0x18);
        uVar2 = EVP_KEYMGMT_get0_name(*(undefined8 *)(param_1 + 8));
        lVar4 = evp_keymgmt_fetch_from_prov(uVar5,uVar2,*(undefined8 *)(param_1 + 4));
        local_38 = lVar4;
        if (lVar4 == 0) {
          EVP_KEYMGMT_free();
        }
        else {
          lVar3 = evp_pkey_export_to_provider
                            (param_2,*(undefined8 *)(param_1 + 2),&local_38,
                             *(undefined8 *)(param_1 + 4));
          EVP_KEYMGMT_free(lVar4);
          if (lVar3 != 0) {
            uVar2 = (**(code **)(*(long *)(param_1 + 10) + 0x40))
                              (*(undefined8 *)(param_1 + 0xc),lVar3);
            return uVar2;
          }
        }
        goto LAB_00a63a54;
      }
      ERR_new();
      uVar2 = 0x18a;
    }
    else {
LAB_00a63a54:
      lVar4 = *(long *)(param_1 + 0x1e);
      if ((lVar4 != 0) &&
         ((((*(long *)(lVar4 + 0xb8) != 0 || (*(long *)(lVar4 + 0x98) != 0)) ||
           (*(long *)(lVar4 + 0xa8) != 0)) && (*(code **)(lVar4 + 0xc0) != (code *)0x0)))) {
        iVar1 = *param_1;
        if (((iVar1 == 0x200) || (iVar1 == 0x400)) || (iVar1 == 0x800)) {
          uVar2 = (**(code **)(lVar4 + 0xc0))(param_1,2,0,param_2);
          if ((int)uVar2 < 1) {
            return uVar2;
          }
          if ((int)uVar2 == 2) {
            return 1;
          }
          if (*(int **)(param_1 + 0x22) == (int *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/evp/exchange.c",0x1cf,"EVP_PKEY_derive_set_peer_ex");
            uVar2 = 0x9a;
          }
          else if (**(int **)(param_1 + 0x22) == param_2->type) {
            iVar1 = EVP_PKEY_missing_parameters(param_2);
            if ((iVar1 != 0) ||
               (iVar1 = EVP_PKEY_parameters_eq(*(undefined8 *)(param_1 + 0x22),param_2), iVar1 != 0)
               ) {
              EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0x24));
              *(EVP_PKEY **)(param_1 + 0x24) = param_2;
              uVar2 = (**(code **)(*(long *)(param_1 + 0x1e) + 0xc0))(param_1,2,1,param_2);
              if ((int)uVar2 < 1) {
                param_1[0x24] = 0;
                param_1[0x25] = 0;
                return uVar2;
              }
              EVP_PKEY_up_ref(param_2);
              return 1;
            }
            ERR_new();
            ERR_set_debug("crypto/evp/exchange.c",0x1e1,"EVP_PKEY_derive_set_peer_ex");
            uVar2 = 0x99;
          }
          else {
            ERR_new();
            ERR_set_debug("crypto/evp/exchange.c",0x1d4,"EVP_PKEY_derive_set_peer_ex");
            uVar2 = 0x65;
          }
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/evp/exchange.c",0x1c2,"EVP_PKEY_derive_set_peer_ex");
          uVar2 = 0x97;
        }
        goto LAB_00a63a1c;
      }
      ERR_new();
      uVar2 = 0x1bc;
    }
    ERR_set_debug("crypto/evp/exchange.c",uVar2,"EVP_PKEY_derive_set_peer_ex");
    ERR_set_error(6,0x96,0);
    uVar2 = 0xfffffffe;
  }
  return uVar2;
}

