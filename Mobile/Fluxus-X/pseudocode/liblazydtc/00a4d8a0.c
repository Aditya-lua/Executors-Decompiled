/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d8a0
 */

undefined8 OSSL_DECODER_CTX_add_extra(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  long *plVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 uVar14;
  ulong uVar15;
  ulong local_80;
  uint local_64;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x1e6,"OSSL_DECODER_CTX_add_extra");
    uVar1 = 0xc0102;
LAB_00a4db8c:
    ERR_set_error(0x3c,uVar1,0);
    uVar14 = 0;
  }
  else {
    if (*(long *)(param_1 + 0x18) != 0) {
      lVar5 = OPENSSL_sk_new_null();
      if (lVar5 == 0) {
        ERR_new();
        ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x1f9,"OSSL_DECODER_CTX_add_extra");
        uVar1 = 0xc0100;
        goto LAB_00a4db8c;
      }
      OSSL_DECODER_do_all_provided(param_2,FUN_00a4dbb8,lVar5);
      iVar3 = OPENSSL_sk_num(lVar5);
      iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x18));
      local_80 = 0;
      uVar12 = (long)iVar4;
      uVar13 = 0;
      do {
        uVar11 = uVar12;
        local_64 = 0;
        uVar12 = uVar11;
        do {
          if (uVar13 < uVar11) {
            uVar10 = uVar13;
            do {
              lVar6 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x18));
              if (lVar6 == 0) {
                uVar14 = 0;
              }
              else {
                uVar14 = *(undefined8 *)(lVar6 + 0x10);
              }
              if (iVar3 != 0) {
                uVar15 = 0;
                do {
                  lVar6 = OPENSSL_sk_value(lVar5,uVar15 & 0xffffffff);
                  OSSL_DECODER_get0_provider();
                  uVar7 = OSSL_PROVIDER_get0_provider_ctx();
                  iVar4 = OSSL_DECODER_is_a(lVar6,uVar14);
                  uVar2 = uVar13;
                  if (iVar4 != 0) {
                    for (; uVar2 < uVar12; uVar2 = uVar2 + 1) {
                      plVar8 = (long *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x18),
                                                        uVar2 & 0xffffffff);
                      if (*(long *)(lVar6 + 0x18) == *(long *)(*plVar8 + 0x18)) goto LAB_00a4dacc;
                    }
                    lVar9 = (**(code **)(lVar6 + 0x38))(uVar7);
                    if (lVar9 != 0) {
                      plVar8 = (long *)ossl_decoder_instance_new(lVar6,lVar9);
                      if (plVar8 == (long *)0x0) {
                        (**(code **)(lVar6 + 0x40))(lVar9);
                      }
                      else {
                        if ((local_64 & 0x7fffffff) == 1) {
                          iVar4 = OSSL_DECODER_is_a(lVar6,plVar8[2]);
                          if (iVar4 == 0) goto LAB_00a4da08;
LAB_00a4da54:
                          lVar6 = *plVar8;
                          if (lVar6 != 0) goto LAB_00a4da5c;
LAB_00a4daa8:
                          lVar6 = 0;
                        }
                        else {
                          if (((local_64 & 0x7fffffff) == 0) &&
                             (iVar4 = OSSL_DECODER_is_a(lVar6,plVar8[2]), iVar4 == 0))
                          goto LAB_00a4da54;
LAB_00a4da08:
                          lVar6 = *(long *)(param_1 + 0x18);
                          if (lVar6 != 0) {
LAB_00a4da1c:
                            iVar4 = OPENSSL_sk_push(lVar6,plVar8);
                            if (0 < iVar4) {
                              uVar12 = uVar12 + 1;
                              goto LAB_00a4dacc;
                            }
                            goto LAB_00a4da54;
                          }
                          lVar6 = OPENSSL_sk_new_null();
                          *(long *)(param_1 + 0x18) = lVar6;
                          if (lVar6 != 0) goto LAB_00a4da1c;
                          ERR_new();
                          ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x124,
                                        "ossl_decoder_ctx_add_decoder_inst");
                          ERR_set_error(0x3c,0xc0100,0);
                          lVar6 = *plVar8;
                          if (lVar6 == 0) goto LAB_00a4daa8;
LAB_00a4da5c:
                          (**(code **)(lVar6 + 0x40))(plVar8[1]);
                          lVar6 = *plVar8;
                        }
                        plVar8[1] = 0;
                        OSSL_DECODER_free(lVar6);
                        *plVar8 = 0;
                        CRYPTO_free(plVar8);
                      }
                    }
                  }
LAB_00a4dacc:
                  uVar15 = uVar15 + 1;
                } while (uVar15 < (ulong)(long)iVar3);
              }
              uVar10 = uVar10 + 1;
            } while (uVar10 != uVar11);
          }
          local_64 = local_64 + 1;
        } while (local_64 != 2);
        local_80 = local_80 + 1;
      } while ((local_80 < 0xb) && (uVar13 = uVar11, uVar12 != uVar11));
      OPENSSL_sk_pop_free(lVar5,OSSL_DECODER_free);
    }
    uVar14 = 1;
  }
  return uVar14;
}

