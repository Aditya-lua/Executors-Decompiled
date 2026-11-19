/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61b40
 */

undefined4 FUN_00a61b40(long *param_1)

{
  bool bVar1;
  int iVar2;
  undefined4 uVar3;
  long *plVar4;
  BIO_METHOD *type;
  BIO *bp;
  long lVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  BIO *pBVar10;
  long **pplVar11;
  long **pplVar12;
  int iVar13;
  long *local_228;
  long *plStack_220;
  long *local_218;
  long *plStack_210;
  long *local_208;
  long *local_200;
  long *plStack_1f8;
  undefined8 uStack_1f0;
  long *local_1e8;
  long *local_1e0;
  long *local_1d8;
  long *plStack_1d0;
  long *plStack_1c8;
  long *plStack_1c0;
  long *local_1b8;
  long *local_1b0 [42];
  
  bVar1 = param_1[3] == 0;
  if (bVar1) {
    *(uint *)(param_1 + 4) = -(uint)(*(long *)(*param_1 + 0x10) == 0);
  }
  if ((int)param_1[2] < 1) {
    lVar9 = 0;
    bp = (BIO *)0x0;
    uVar3 = 0xffffffff;
  }
  else {
    iVar13 = (int)param_1[2] + 1;
    do {
      uVar8 = 0;
      if (!bVar1) {
        if ((undefined8 *)param_1[3] == (undefined8 *)0x0) {
          uVar8 = 0;
        }
        else {
          uVar8 = *(undefined8 *)param_1[3];
        }
      }
      plVar4 = (long *)OPENSSL_sk_value(*(undefined8 *)(*param_1 + 0x18),iVar13 + -2);
      if (plVar4 == (long *)0x0) {
        lVar9 = 0;
        lVar7 = 0;
        lVar6 = 0;
        lVar5 = 0;
      }
      else {
        lVar7 = *plVar4;
        lVar6 = plVar4[1];
        lVar9 = plVar4[2];
        lVar5 = plVar4[3];
      }
      plStack_1d0 = (long *)0x0;
      local_1d8 = (long *)0x0;
      plStack_1c0 = (long *)0x0;
      plStack_1c8 = (long *)0x0;
      plStack_1f8 = (long *)0x0;
      local_200 = (long *)*param_1;
      local_1e0 = (long *)(ulong)*(uint *)(param_1 + 4);
      uStack_1f0 = (long *)CONCAT44(*(int *)((long)param_1 + 0x14) + 1,iVar13 + -2);
      local_1e8 = plVar4;
      if (bVar1) {
        if ((local_200[1] == 0) || (iVar2 = OPENSSL_strcasecmp(lVar9), iVar2 == 0)) {
LAB_00a61c40:
          if ((lVar5 != 0) && (*(long *)(*param_1 + 0x10) != 0)) {
            iVar2 = OPENSSL_strcasecmp(*(long *)(*param_1 + 0x10),lVar5);
            if (iVar2 != 0) goto LAB_00a61c98;
            *(int *)(param_1 + 4) = (int)param_1[4] + 1;
          }
          iVar2 = FUN_00a61b40(&local_200);
          param_1[5] = (long)local_1d8;
          param_1[7] = (long)plStack_1c8;
          param_1[6] = (long)plStack_1d0;
          if (iVar2 != 0) {
            if (iVar2 == -1) {
              if ((int)param_1[4] == 0) {
                return 0;
              }
              lVar9 = (**(code **)(*param_1 + 0x20))(plVar4,*(undefined8 *)(*param_1 + 0x30));
              lVar5 = OSSL_ENCODER_get0_name(lVar7);
              param_1[8] = lVar5;
              if (lVar9 == 0) {
                uVar3 = 0;
                bp = (BIO *)0x0;
                goto LAB_00a61eb0;
              }
LAB_00a61d2c:
              pplVar12 = (long **)0x0;
              if (!bVar1) goto LAB_00a61e4c;
LAB_00a61d34:
              bp = (BIO *)param_1[1];
              pBVar10 = (BIO *)0x0;
LAB_00a61e5c:
              lVar5 = ossl_core_bio_new_from_bio(bp);
              bp = pBVar10;
              if (lVar5 == 0) goto LAB_00a61e9c;
              uVar3 = (**(code **)(lVar7 + 0x70))
                                (lVar6,lVar5,lVar9,pplVar12,*(undefined4 *)*param_1,
                                 ossl_pw_passphrase_callback_enc,(undefined4 *)*param_1 + 0xe);
            }
            else {
              if (iVar2 != 1) {
                lVar9 = 0;
                goto LAB_00a61d2c;
              }
              if (plStack_1d0 == (long *)0x0) {
                ERR_new();
                ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x24b,"encoder_process");
                ERR_set_error(0x3b,0xc0103,0);
                uVar3 = 0;
                lVar9 = 0;
                bp = (BIO *)0x0;
                goto LAB_00a61eb0;
              }
              if (local_1d8 == (long *)0x0) {
                lVar9 = 0;
              }
              else {
                lVar9 = local_1d8[3];
              }
              pplVar11 = &local_1d8;
              OSSL_PARAM_construct_utf8_string(&local_228,"data-type",param_1[8],0);
              local_1e0 = local_208;
              plStack_1f8 = plStack_220;
              local_200 = local_228;
              local_1e8 = plStack_210;
              uStack_1f0 = local_218;
              if (lVar9 != 0) {
                pplVar11 = local_1b0;
                OSSL_PARAM_construct_utf8_string(&local_228,"data-structure",lVar9,0);
                local_1b8 = local_208;
                plStack_1d0 = plStack_220;
                local_1d8 = local_228;
                plStack_1c0 = plStack_210;
                plStack_1c8 = local_218;
              }
              pplVar12 = &local_200;
              OSSL_PARAM_construct_octet_string(&local_228,&DAT_002d167a,param_1[6],param_1[7]);
              pplVar11[4] = local_208;
              pplVar11[1] = plStack_220;
              *pplVar11 = local_228;
              pplVar11[3] = plStack_210;
              pplVar11[2] = local_218;
              OSSL_PARAM_construct_end(&local_228);
              lVar9 = 0;
              pplVar11[9] = local_208;
              pplVar11[8] = plStack_210;
              pplVar11[7] = local_218;
              pplVar11[6] = plStack_220;
              pplVar11[5] = local_228;
              if (bVar1) goto LAB_00a61d34;
LAB_00a61e4c:
              type = BIO_s_mem();
              bp = BIO_new(type);
              pBVar10 = bp;
              if (bp != (BIO *)0x0) goto LAB_00a61e5c;
              lVar5 = 0;
LAB_00a61e9c:
              uVar3 = 0;
            }
            ossl_core_bio_free(lVar5);
            param_1[5] = (long)plVar4;
            goto LAB_00a61eb0;
          }
        }
      }
      else {
        iVar2 = OSSL_ENCODER_is_a(uVar8,lVar9);
        if (iVar2 != 0) goto LAB_00a61c40;
      }
LAB_00a61c98:
      iVar13 = iVar13 + -1;
    } while (1 < iVar13);
    lVar9 = 0;
    bp = (BIO *)0x0;
    uVar3 = 0xffffffff;
  }
LAB_00a61eb0:
  plVar4 = param_1 + 6;
  CRYPTO_free((void *)*plVar4);
  *plVar4 = 0;
  if (bp != (BIO *)0x0) {
    BIO_ctrl(bp,0x73,0,&local_228);
    *plVar4 = local_228[1];
    param_1[7] = *local_228;
    local_228[1] = 0;
    *local_228 = 0;
    local_228[3] = 0;
    local_228[2] = 0;
  }
  BIO_free(bp);
  if (lVar9 != 0) {
    (**(code **)(*param_1 + 0x28))(*(undefined8 *)(*param_1 + 0x30));
  }
  return uVar3;
}

