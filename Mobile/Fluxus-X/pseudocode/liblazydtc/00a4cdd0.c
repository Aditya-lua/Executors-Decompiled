/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4cdd0
 */

int FUN_00a4cdd0(long param_1,undefined8 *param_2)

{
  int iVar1;
  int iVar2;
  long *plVar3;
  BIO *bp;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  int iVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long local_98;
  long local_90;
  long *local_88;
  BIO *local_80;
  ulong uStack_78;
  long local_70;
  ulong local_68;
  
  plVar7 = (long *)*param_2;
  local_98 = 0;
  local_90 = 0;
  *(byte *)(param_2 + 4) = *(byte *)(param_2 + 4) | 1;
  uStack_78 = 0;
  local_80 = (BIO *)0x0;
  local_68 = 0;
  local_70 = param_2[3] + 1;
  local_88 = plVar7;
  if (param_1 == 0) {
    if ((plVar7 == (long *)0x0) || (plVar7[3] == 0)) {
      lVar8 = 0;
    }
    else {
      iVar1 = OPENSSL_sk_num();
      lVar8 = (long)iVar1;
    }
    param_2[2] = lVar8;
    bp = (BIO *)param_2[1];
    lVar6 = 0;
joined_r0x00a4cf60:
    if (lVar8 != 0) {
      lVar8 = BIO_ctrl(bp,0x85,0,(void *)0x0);
      iVar9 = (int)lVar8;
      if (-1 < iVar9) {
        lVar8 = ossl_core_bio_new_from_bio(bp);
        if (lVar8 == 0) {
          ERR_new();
          ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x335,"decoder_process");
          ERR_set_error(0x3c,0xc0100,0);
        }
        else {
          uVar5 = param_2[2];
          if (uVar5 != 0) {
            iVar1 = 0;
            do {
              uVar5 = uVar5 - 1;
              plVar3 = (long *)OPENSSL_sk_value(plVar7[3],uVar5 & 0xffffffff);
              if (plVar3 == (long *)0x0) {
                lVar4 = 0;
                lVar10 = 0;
                lVar12 = 0;
                lVar11 = 0;
                if (lVar6 == 0) goto LAB_00a4cfe8;
LAB_00a4cfc4:
                iVar2 = OSSL_DECODER_is_a(lVar6);
                if (iVar2 != 0) {
LAB_00a4cff8:
                  if (((local_90 == 0) || (iVar2 = OSSL_DECODER_is_a(lVar10), iVar2 != 0)) &&
                     ((local_98 == 0 ||
                      ((lVar11 != 0 && (iVar2 = OPENSSL_strcasecmp(local_98,lVar11), iVar2 == 0)))))
                     ) {
                    if (((*(byte *)(param_2 + 4) >> 2 & 1) == 0) &&
                       ((lVar11 != 0 && (plVar7[1] != 0)))) {
                      *(byte *)(param_2 + 4) = *(byte *)(param_2 + 4) | 4;
                      iVar2 = OPENSSL_strcasecmp(lVar11,plVar7[1]);
                      if (iVar2 != 0) goto LAB_00a4d108;
                    }
                    BIO_ctrl(bp,0x80,(long)iVar9,(void *)0x0);
                    lVar4 = BIO_ctrl(bp,0x85,0,(void *)0x0);
                    if ((long)(int)lVar4 != (long)iVar9) break;
                    ERR_set_mark();
                    local_68 = CONCAT71(local_68._1_7_,
                                        (byte)local_68 & 0xfb | *(byte *)(param_2 + 4) & 4);
                    uStack_78 = uVar5;
                    iVar1 = (**(code **)(lVar10 + 0x70))
                                      (lVar12,lVar8,(int)local_88[2],FUN_00a4cdd0,&local_88,
                                       ossl_pw_passphrase_callback_dec,local_88 + 7);
                    *(byte *)(param_2 + 4) = *(byte *)(param_2 + 4) & 0xfd | (byte)local_68 & 2;
                    if ((iVar1 == 0) || ((local_68 & 2) != 0)) {
                      ERR_clear_last_mark();
                      break;
                    }
                    ERR_pop_to_mark();
                    if ((local_68 & 1) != 0) break;
                  }
                }
              }
              else {
                lVar10 = *plVar3;
                lVar12 = plVar3[1];
                lVar4 = plVar3[2];
                lVar11 = plVar3[3];
                if (lVar6 != 0) goto LAB_00a4cfc4;
LAB_00a4cfe8:
                if ((*plVar7 == 0) || (iVar2 = OPENSSL_strcasecmp(*plVar7,lVar4), iVar2 == 0))
                goto LAB_00a4cff8;
              }
LAB_00a4d108:
            } while (uVar5 != 0);
            goto LAB_00a4d150;
          }
        }
        iVar1 = 0;
        goto LAB_00a4d150;
      }
      ERR_new();
      ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x330,"decoder_process");
      ERR_set_error(0x3c,0x80020,0);
    }
  }
  else {
    plVar3 = (long *)OPENSSL_sk_value(plVar7[3],(int)param_2[2]);
    if (plVar3 == (long *)0x0) {
      lVar6 = 0;
    }
    else {
      lVar6 = *plVar3;
    }
    *(byte *)(param_2 + 4) = *(byte *)(param_2 + 4) & 0xfd;
    if (((code *)plVar7[4] != (code *)0x0) &&
       (iVar1 = (*(code *)plVar7[4])(plVar3,param_1,plVar7[6]), 0 < iVar1)) {
      lVar8 = 0;
      iVar1 = 1;
      *(byte *)(param_2 + 4) = *(byte *)(param_2 + 4) | 2;
      goto LAB_00a4d150;
    }
    lVar8 = OSSL_PARAM_locate_const(param_1,&DAT_002d167a);
    if (((((lVar8 != 0) && (*(int *)(lVar8 + 8) == 5)) &&
         (bp = BIO_new_mem_buf(*(void **)(lVar8 + 0x10),*(int *)(lVar8 + 0x18)), local_80 = bp,
         bp != (BIO *)0x0)) &&
        ((lVar8 = OSSL_PARAM_locate_const(param_1,"data-type"), lVar8 == 0 ||
         (iVar1 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&local_90), iVar1 != 0)))) &&
       ((lVar8 = OSSL_PARAM_locate_const(param_1,"data-structure"), lVar8 == 0 ||
        (iVar1 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&local_98), iVar1 != 0)))) {
      if (((local_90 != 0) && (local_98 != 0)) &&
         (iVar1 = OPENSSL_strcasecmp(local_98,"type-specific"), iVar1 == 0)) {
        local_98 = 0;
      }
      lVar8 = param_2[2];
      goto joined_r0x00a4cf60;
    }
  }
  iVar1 = 0;
  lVar8 = 0;
LAB_00a4d150:
  ossl_core_bio_free(lVar8);
  BIO_free(local_80);
  return iVar1;
}

