/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b58a14
 */

bool ossl_prov_drbg_instantiate
               (long param_1,uint param_2,undefined4 param_3,char *param_4,ulong param_5)

{
  ulong uVar1;
  char *pcVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  time_t tVar6;
  undefined8 *puVar7;
  void *ptr;
  undefined8 uVar8;
  long lVar9;
  code *pcVar10;
  ulong uVar11;
  undefined8 uVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 local_80;
  void *local_78;
  long local_70;
  long lStack_68;
  
  local_80 = 0;
  local_78 = (void *)0x0;
  uVar13 = *(uint *)(param_1 + 0x80);
  if (uVar13 < param_2) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x172,"ossl_prov_drbg_instantiate");
    uVar8 = 0xb5;
  }
  else {
    uVar1 = 0x1d;
    if (param_4 != (char *)0x0) {
      uVar1 = param_5;
    }
    pcVar2 = "OpenSSL NIST SP 800-90A DRBG";
    if (param_4 != (char *)0x0) {
      pcVar2 = param_4;
    }
    if (*(ulong *)(param_1 + 0xb0) < uVar1) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x17e,"ossl_prov_drbg_instantiate");
      uVar8 = 0xc3;
    }
    else {
      iVar3 = *(int *)(param_1 + 0xf0);
      if (iVar3 == 0) {
        uVar14 = *(ulong *)(param_1 + 0x98);
        lVar9 = *(long *)(param_1 + 0xa0);
        uVar15 = *(ulong *)(param_1 + 0x90);
        *(undefined4 *)(param_1 + 0xf0) = 2;
        if (lVar9 == 0) {
          uVar11 = 0;
          iVar4 = *(int *)(param_1 + 0xd8);
          if (iVar4 == 0) {
            iVar3 = 0;
          }
          else {
LAB_00b58c18:
            iVar3 = 1;
            if (iVar4 != -1) {
              iVar3 = iVar4 + 1;
            }
          }
LAB_00b58c24:
          *(int *)(param_1 + 0xdc) = iVar3;
          uVar5 = FUN_00b58f10(param_1,&local_80,uVar13,uVar15,uVar14,param_3);
          if ((uVar5 < uVar15) || (uVar14 < uVar5)) {
            ERR_new();
            ERR_set_debug("providers/implementations/rands/drbg.c",0x1c8,
                          "ossl_prov_drbg_instantiate");
            uVar8 = 0xbd;
          }
          else {
            iVar3 = (**(code **)(param_1 + 0x10))
                              (param_1,local_80,uVar5,local_78,uVar11,pcVar2,uVar1);
            uVar8 = local_80;
            lVar9 = *(long *)(param_1 + 0x30);
            if (lVar9 == 0) {
              ossl_prov_cleanup_entropy(*(undefined8 *)(param_1 + 8),local_80,uVar5);
            }
            else {
              pcVar10 = *(code **)(param_1 + 0x68);
              if (pcVar10 != (code *)0x0) {
                if (*(code **)(param_1 + 0x40) != (code *)0x0) {
                  iVar4 = (**(code **)(param_1 + 0x40))(lVar9);
                  if (iVar4 == 0) {
                    ERR_new();
                    ERR_set_debug("providers/implementations/rands/drbg.c",0x46,
                                  "ossl_drbg_lock_parent");
                    ERR_set_error(0x39,0xb6,0);
                    goto joined_r0x00b58e44;
                  }
                  pcVar10 = *(code **)(param_1 + 0x68);
                  lVar9 = *(long *)(param_1 + 0x30);
                }
                (*pcVar10)(lVar9,uVar8,uVar5);
                if ((*(long *)(param_1 + 0x30) != 0) && (*(code **)(param_1 + 0x48) != (code *)0x0))
                {
                  (**(code **)(param_1 + 0x48))();
                }
              }
            }
joined_r0x00b58e44:
            if (iVar3 != 0) {
              *(undefined4 *)(param_1 + 0xf0) = 1;
              *(undefined4 *)(param_1 + 0xc0) = 1;
              tVar6 = time((time_t *)0x0);
              *(time_t *)(param_1 + 200) = tVar6;
              *(undefined4 *)(param_1 + 0xd8) = *(undefined4 *)(param_1 + 0xdc);
              goto joined_r0x00b58f08;
            }
            ERR_new();
            ERR_set_debug("providers/implementations/rands/drbg.c",0x1cf,
                          "ossl_prov_drbg_instantiate");
            uVar8 = 0xbc;
          }
        }
        else {
          if (*(code **)(param_1 + 0x58) == (code *)0x0) {
            if (*(long *)(param_1 + 0x30) == 0) {
              uVar12 = *(undefined8 *)(param_1 + 0xa8);
              uVar8 = ossl_prov_ctx_get0_libctx(*(undefined8 *)(param_1 + 8));
              puVar7 = (undefined8 *)ossl_lib_ctx_get_data(uVar8,6,&DAT_00ca4288);
              if (puVar7 == (undefined8 *)0x0) {
                uVar11 = 0;
              }
              else {
                if ((((*(long *)(param_1 + 0x30) != 0) &&
                     (*(code **)(param_1 + 0x58) != (code *)0x0)) &&
                    (uVar11 = (**(code **)(param_1 + 0x58))
                                        (*(long *)(param_1 + 0x30),0,0,
                                         *(undefined8 *)(param_1 + 0xa0),
                                         *(undefined8 *)(param_1 + 0xa8)), uVar11 != 0)) &&
                   (ptr = CRYPTO_malloc((int)uVar11,"providers/implementations/rands/drbg.c",0x14c),
                   ptr != (void *)0x0)) {
                  uVar5 = (**(code **)(param_1 + 0x58))
                                    (*(undefined8 *)(param_1 + 0x30),ptr,0,
                                     *(undefined8 *)(param_1 + 0xa0),*(undefined8 *)(param_1 + 0xa8)
                                    );
                  if (uVar5 == uVar11) {
                    local_78 = ptr;
                    goto LAB_00b58ec0;
                  }
                  CRYPTO_free(ptr);
                }
                lStack_68 = 0;
                local_70 = param_1;
                CRYPTO_atomic_add(puVar7 + 1,1,&lStack_68,*puVar7);
                uVar11 = ossl_prov_get_nonce(*(undefined8 *)(param_1 + 8),&local_78,lVar9,uVar12,
                                             &local_70,0x10);
              }
LAB_00b58ec0:
              if ((uVar11 < *(ulong *)(param_1 + 0xa0)) || (*(ulong *)(param_1 + 0xa8) < uVar11)) {
                ERR_new();
                uVar8 = 0x1b5;
                goto LAB_00b58ef0;
              }
            }
            else {
              uVar11 = 0;
              uVar13 = uVar13 + (uVar13 >> 1);
              uVar15 = lVar9 + uVar15;
              uVar14 = *(long *)(param_1 + 0xa8) + uVar14;
            }
LAB_00b58c10:
            iVar4 = *(int *)(param_1 + 0xd8);
            iVar3 = 0;
            if (iVar4 != 0) goto LAB_00b58c18;
            goto LAB_00b58c24;
          }
          uVar11 = (**(code **)(param_1 + 0x58))
                             (*(long *)(param_1 + 0x30),0,uVar13,lVar9,
                              *(undefined8 *)(param_1 + 0xa8));
          if (uVar11 == 0) {
            ERR_new();
            uVar8 = 0x192;
          }
          else {
            local_78 = CRYPTO_malloc((int)uVar11,"providers/implementations/rands/drbg.c",0x195);
            if (local_78 == (void *)0x0) {
              ERR_new();
              uVar8 = 0x197;
            }
            else {
              uVar5 = (**(code **)(param_1 + 0x58))
                                (*(undefined8 *)(param_1 + 0x30),local_78,
                                 *(undefined4 *)(param_1 + 0x80),*(undefined8 *)(param_1 + 0xa0),
                                 *(undefined8 *)(param_1 + 0xa8));
              if (uVar11 == uVar5) goto LAB_00b58c10;
              ERR_new();
              uVar8 = 0x19e;
            }
          }
LAB_00b58ef0:
          ERR_set_debug("providers/implementations/rands/drbg.c",uVar8,"ossl_prov_drbg_instantiate")
          ;
          uVar8 = 0xbe;
        }
        ERR_set_error(0x39,uVar8,0);
        goto joined_r0x00b58f08;
      }
      ERR_new();
      if (iVar3 == 2) {
        ERR_set_debug("providers/implementations/rands/drbg.c",0x184,"ossl_prov_drbg_instantiate");
        uVar8 = 0xc0;
      }
      else {
        ERR_set_debug("providers/implementations/rands/drbg.c",0x186,"ossl_prov_drbg_instantiate");
        uVar8 = 0xb9;
      }
    }
  }
  ERR_set_error(0x39,uVar8,0);
  uVar11 = 0;
joined_r0x00b58f08:
  if (local_78 != (void *)0x0) {
    ossl_prov_cleanup_nonce(*(undefined8 *)(param_1 + 8),local_78,uVar11);
  }
  return *(int *)(param_1 + 0xf0) == 1;
}

