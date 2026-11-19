/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9a50
 */

bool FUN_009b9a50(long param_1,undefined8 *param_2,char *param_3,int param_4)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  long lVar9;
  undefined8 local_68;
  undefined8 local_60;
  ulong local_58;
  undefined8 local_50;
  char *local_48;
  
  local_48 = param_3;
  if ((param_1 == 0) && (param_2 == (undefined8 *)0x0)) {
    ERR_new();
    ERR_set_debug("ssl/ssl_mcnf.c",0x23,"ssl_do_config");
    ERR_set_error(0x14,0xc0102,0);
    bVar1 = false;
    lVar6 = 0;
    uVar7 = 0;
  }
  else {
    if ((param_3 == (char *)0x0) && (param_4 != 0)) {
      local_48 = "system_default";
    }
    iVar2 = conf_ssl_name_find(local_48,&local_50);
    if (iVar2 == 0) {
      if (param_4 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_mcnf.c",0x2b,"ssl_do_config");
        ERR_set_error(0x14,0x71,"name=%s",local_48);
      }
      bVar1 = false;
      uVar7 = 0;
      lVar6 = 0;
    }
    else {
      uVar4 = conf_ssl_get(local_50,&local_48,&local_58);
      lVar6 = SSL_CONF_CTX_new();
      if (lVar6 == 0) {
        bVar1 = false;
        uVar7 = 0;
      }
      else {
        uVar5 = 2;
        if (param_4 == 0) {
          uVar5 = 0x62;
        }
        if (param_1 == 0) {
          lVar9 = param_2[1];
          SSL_CONF_CTX_set_ssl_ctx(lVar6,param_2);
        }
        else {
          lVar9 = *(long *)(param_1 + 8);
          SSL_CONF_CTX_set_ssl(lVar6,param_1);
          param_2 = *(undefined8 **)(param_1 + 0x9a8);
        }
        uVar7 = *param_2;
        if (*(code **)(lVar9 + 0x28) != ssl_undefined_function) {
          uVar5 = uVar5 | 8;
        }
        if (*(code **)(lVar9 + 0x30) != ssl_undefined_function) {
          uVar5 = uVar5 | 4;
        }
        SSL_CONF_CTX_set_flags(lVar6,uVar5);
        uVar7 = OSSL_LIB_CTX_set0_default(uVar7);
        if (local_58 == 0) {
          iVar2 = 0;
        }
        else {
          uVar8 = 0;
          iVar2 = 0;
          do {
            conf_ssl_get_cmd(uVar4,uVar8,&local_60,&local_68);
            iVar3 = SSL_CONF_cmd(lVar6,local_60,local_68);
            uVar8 = uVar8 + 1;
            if (iVar3 < 1) {
              iVar2 = iVar2 + 1;
            }
          } while (uVar8 < local_58);
        }
        iVar3 = SSL_CONF_CTX_finish(lVar6);
        bVar1 = iVar2 == -(uint)(iVar3 == 0);
      }
    }
  }
  OSSL_LIB_CTX_set0_default(uVar7);
  SSL_CONF_CTX_free(lVar6);
  return bVar1;
}

