/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1074
 */

int ossl_pw_get_passphrase
              (void *param_1,size_t param_2,size_t *param_3,undefined8 param_4,int param_5,
              int *param_6)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  UI_METHOD *ui_method;
  UI *ui;
  char *result_buf;
  void *pvVar5;
  ulong uVar6;
  undefined8 uVar7;
  size_t __n;
  ulong *puVar8;
  char *pcVar9;
  UI_METHOD *meth;
  char *local_70;
  
  if (*param_6 == 1) {
    pvVar5 = *(void **)(param_6 + 2);
    if (pvVar5 != (void *)0x0) {
      puVar8 = (ulong *)(param_6 + 4);
      goto LAB_00aa10d8;
    }
LAB_00aa1144:
    lVar4 = OSSL_PARAM_locate_const(param_4,&DAT_0029e225);
    if (lVar4 == 0) {
      pcVar9 = (char *)0x0;
LAB_00aa1170:
      if (*param_6 == 4) {
        meth = *(UI_METHOD **)(param_6 + 2);
        if (meth == (UI_METHOD *)0x0) goto LAB_00aa12f8;
        ui_method = (UI_METHOD *)0x0;
LAB_00aa11f8:
        if (((param_1 == (void *)0x0) || (param_2 == 0)) || (param_3 == (size_t *)0x0)) {
          ERR_new();
          ERR_set_debug("crypto/passphrase.c",0x80,"do_ui_passphrase");
          uVar1 = 0xc0102;
LAB_00aa1434:
          ERR_set_error(0xf,uVar1,0);
          iVar2 = 0;
        }
        else {
          pvVar5 = *(void **)(param_6 + 4);
          ui = UI_new();
          if (ui == (UI *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/passphrase.c",0x85,"do_ui_passphrase");
            uVar1 = 0xc0100;
            goto LAB_00aa1434;
          }
          UI_set_method(ui,meth);
          if (pvVar5 != (void *)0x0) {
            UI_add_user_data(ui,pvVar5);
          }
          pcVar9 = UI_construct_prompt(ui,"pass phrase",pcVar9);
          if (pcVar9 == (char *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/passphrase.c",0x92,"do_ui_passphrase");
            ERR_set_error(0xf,0xc0100,0);
            result_buf = (char *)0x0;
            local_70 = (char *)0x0;
            iVar2 = 0;
          }
          else {
            result_buf = (char *)CRYPTO_zalloc(param_2 + 1,"crypto/passphrase.c",0x97);
            if (result_buf == (char *)0x0) {
              ERR_new();
              ERR_set_debug("crypto/passphrase.c",0x99,"do_ui_passphrase");
              ERR_set_error(0xf,0xc0100,0);
            }
            else {
              iVar2 = UI_add_input_string(ui,pcVar9,2,result_buf,0,(int)param_2);
              if (iVar2 < 1) {
                ERR_new();
                ERR_set_debug("crypto/passphrase.c",0xa1,"do_ui_passphrase");
                uVar1 = 0x80028;
              }
              else {
                if (param_5 == 0) {
                  local_70 = (char *)0x0;
LAB_00aa14ec:
                  iVar3 = UI_process(ui);
                  if (iVar3 == -1) {
                    ERR_new();
                    uVar7 = 0xbb;
LAB_00aa15d4:
                    ERR_set_debug("crypto/passphrase.c",uVar7,"do_ui_passphrase");
                    uVar1 = 0x80028;
                  }
                  else {
                    if (iVar3 != -2) {
                      iVar2 = UI_get_result_length(ui,iVar2 + -1);
                      if (-1 < iVar2) {
                        *param_3 = (long)iVar2;
                        memcpy(param_1,result_buf,(long)iVar2);
                        iVar2 = 1;
                        goto LAB_00aa15f4;
                      }
                      ERR_new();
                      uVar7 = 0xc0;
                      goto LAB_00aa15d4;
                    }
                    ERR_new();
                    ERR_set_debug("crypto/passphrase.c",0xb8,"do_ui_passphrase");
                    uVar1 = 0x80109;
                  }
                  ERR_set_error(0xf,uVar1,0);
                  iVar2 = 0;
                  goto LAB_00aa15f4;
                }
                local_70 = (char *)CRYPTO_zalloc(param_2 + 1,"crypto/passphrase.c",0xa7);
                if (local_70 != (char *)0x0) {
                  iVar3 = UI_add_verify_string(ui,pcVar9,2,local_70,0,(int)param_2,result_buf);
                  if (0 < iVar3) goto LAB_00aa14ec;
                  ERR_new();
                  uVar7 = 0xb1;
                  goto LAB_00aa15d4;
                }
                ERR_new();
                ERR_set_debug("crypto/passphrase.c",0xa9,"do_ui_passphrase");
                uVar1 = 0xc0100;
              }
              ERR_set_error(0xf,uVar1,0);
            }
            local_70 = (char *)0x0;
            iVar2 = 0;
          }
LAB_00aa15f4:
          CRYPTO_clear_free(local_70,param_2 + 1,"crypto/passphrase.c",0xca);
          CRYPTO_clear_free(result_buf,param_2 + 1,"crypto/passphrase.c",0xcb);
          CRYPTO_free(pcVar9);
          UI_free(ui);
        }
        UI_destroy_method(ui_method);
        goto joined_r0x00aa111c;
      }
      if (*param_6 != 2) {
LAB_00aa12f8:
        ERR_new();
        ERR_set_debug("crypto/passphrase.c",0x119,"ossl_pw_get_passphrase");
        pcVar9 = "No password method specified";
        goto LAB_00aa1328;
      }
      ui_method = (UI_METHOD *)UI_UTIL_wrap_read_pem_callback(*(undefined8 *)(param_6 + 2),param_5);
      meth = ui_method;
      if (ui_method != (UI_METHOD *)0x0) goto LAB_00aa11f8;
      ERR_new();
      uVar7 = 0x110;
LAB_00aa13f4:
      ERR_set_debug("crypto/passphrase.c",uVar7,"ossl_pw_get_passphrase");
      uVar1 = 0xc0100;
      pcVar9 = (char *)0x0;
    }
    else {
      if (*(int *)(lVar4 + 8) == 4) {
        pcVar9 = *(char **)(lVar4 + 0x10);
        goto LAB_00aa1170;
      }
      ERR_new();
      ERR_set_debug("crypto/passphrase.c",0x100,"ossl_pw_get_passphrase");
      pcVar9 = "Prompt info data type incorrect";
LAB_00aa1328:
      uVar1 = 0x80106;
    }
    ERR_set_error(0xf,uVar1,pcVar9);
    iVar2 = 0;
  }
  else {
    if (((*(byte *)(param_6 + 6) & 1) != 0) &&
       (pvVar5 = *(void **)(param_6 + 8), pvVar5 != (void *)0x0)) {
      puVar8 = (ulong *)(param_6 + 10);
LAB_00aa10d8:
      if (*puVar8 <= param_2) {
        param_2 = *puVar8;
      }
      memcpy(param_1,pvVar5,param_2);
      *param_3 = param_2;
      return 1;
    }
    if (*param_6 != 3) goto LAB_00aa1144;
    iVar2 = (**(code **)(param_6 + 2))(param_1,param_2,param_3,param_4,*(undefined8 *)(param_6 + 4))
    ;
joined_r0x00aa111c:
    if (iVar2 == 0) {
      return 0;
    }
    if ((*(byte *)(param_6 + 6) & 1) == 0) {
      return iVar2;
    }
    pvVar5 = *(void **)(param_6 + 8);
    if (pvVar5 == (void *)0x0) {
      uVar6 = *(ulong *)(param_6 + 10);
      __n = *param_3;
LAB_00aa1390:
      pvVar5 = (void *)CRYPTO_clear_realloc(pvVar5,uVar6,__n + 1,"crypto/passphrase.c",0x12a);
      if (pvVar5 == (void *)0x0) {
        OPENSSL_cleanse(param_1,*param_3);
        ERR_new();
        uVar7 = 0x12e;
        goto LAB_00aa13f4;
      }
      *(void **)(param_6 + 8) = pvVar5;
      __n = *param_3;
    }
    else {
      __n = *param_3;
      uVar6 = *(ulong *)(param_6 + 10);
      if (uVar6 < __n) goto LAB_00aa1390;
    }
    memcpy(pvVar5,param_1,__n);
    *(undefined1 *)(*(long *)(param_6 + 8) + *param_3) = 0;
    *(size_t *)(param_6 + 10) = *param_3;
  }
  return iVar2;
}

