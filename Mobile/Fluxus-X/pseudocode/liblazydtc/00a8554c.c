/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8554c
 */

bool FUN_00a8554c(ENGINE *param_1,undefined4 param_2,ulong param_3,char *param_4)

{
  int iVar1;
  int iVar2;
  long *plVar3;
  long *arg;
  long lVar4;
  DSO *pDVar5;
  DSO_FUNC_TYPE pDVar6;
  ulong uVar7;
  undefined8 uVar8;
  char *pcVar9;
  bool bVar10;
  void *local_168;
  m *pmStack_160;
  r *prStack_158;
  f *pfStack_150;
  undefined1 auStack_148 [232];
  
  if (DAT_00cc8f28 < 0) {
    iVar2 = CRYPTO_get_ex_new_index
                      (10,0,(void *)0x0,(undefined1 *)0x0,(undefined1 *)0x0,FUN_00a85d40);
    if (iVar2 == -1) {
      ERR_new();
      ERR_set_debug("crypto/engine/eng_dyn.c",0xd7,"dynamic_get_data_ctx");
      uVar8 = 0x90;
LAB_00a85730:
      ERR_set_error(0x26,uVar8,0);
    }
    else {
      iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
      if (iVar1 != 0) {
        if (DAT_00cc8f28 < 0) {
          DAT_00cc8f28 = iVar2;
        }
        CRYPTO_THREAD_unlock(global_engine_lock);
        goto LAB_00a85588;
      }
    }
LAB_00a85790:
    ERR_new();
    ERR_set_debug("crypto/engine/eng_dyn.c",0x12f,"dynamic_ctrl");
    uVar8 = 0x70;
    goto LAB_00a857b4;
  }
LAB_00a85588:
  plVar3 = ENGINE_get_ex_data(param_1,DAT_00cc8f28);
  if (plVar3 == (long *)0x0) {
    arg = (long *)CRYPTO_zalloc(0x58,"crypto/engine/eng_dyn.c",0x9f);
    if (arg == (long *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/engine/eng_dyn.c",0xa3,"dynamic_set_data_ctx");
      uVar8 = 0xc0100;
      goto LAB_00a85730;
    }
    lVar4 = OPENSSL_sk_new_null();
    arg[10] = lVar4;
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("crypto/engine/eng_dyn.c",0xa8,"dynamic_set_data_ctx");
      ERR_set_error(0x26,0xc0100,0);
      bVar10 = true;
    }
    else {
      bVar10 = true;
      *(undefined4 *)(arg + 9) = 1;
      arg[8] = (long)"bind_engine";
      arg[7] = (long)"v_check";
      iVar2 = CRYPTO_THREAD_write_lock(global_engine_lock);
      if (iVar2 != 0) {
        plVar3 = ENGINE_get_ex_data(param_1,DAT_00cc8f28);
        if ((plVar3 == (long *)0x0) &&
           (iVar2 = ENGINE_set_ex_data(param_1,DAT_00cc8f28,arg), iVar2 != 0)) {
          CRYPTO_THREAD_unlock(global_engine_lock);
          CRYPTO_free((void *)0x0);
          plVar3 = arg;
          goto joined_r0x00a85814;
        }
        CRYPTO_THREAD_unlock(global_engine_lock);
        bVar10 = false;
      }
    }
    OPENSSL_sk_free(arg[10]);
    CRYPTO_free(arg);
    if (bVar10) goto LAB_00a85790;
  }
joined_r0x00a85814:
  if (plVar3 == (long *)0x0) goto LAB_00a85790;
  if (*plVar3 != 0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_dyn.c",0x135,"dynamic_ctrl");
    uVar8 = 100;
    goto LAB_00a857b4;
  }
  switch(param_2) {
  case 200:
    if (param_4 == (char *)0x0) {
      pcVar9 = (char *)0x0;
    }
    else {
      pcVar9 = (char *)0x0;
      if (*param_4 != '\0') {
        pcVar9 = param_4;
      }
    }
    CRYPTO_free((void *)plVar3[3]);
    if (pcVar9 == (char *)0x0) {
      pcVar9 = (char *)0x0;
    }
    else {
      pcVar9 = CRYPTO_strdup(pcVar9,"crypto/engine/eng_dyn.c",0x13f);
    }
    plVar3[3] = (long)pcVar9;
    goto LAB_00a85a80;
  case 0xc9:
    *(uint *)(plVar3 + 4) = (uint)(param_3 != 0);
    return true;
  case 0xca:
    if (param_4 == (char *)0x0) {
      pcVar9 = (char *)0x0;
    }
    else {
      pcVar9 = (char *)0x0;
      if (*param_4 != '\0') {
        pcVar9 = param_4;
      }
    }
    CRYPTO_free((void *)plVar3[5]);
    if (pcVar9 == (char *)0x0) {
      pcVar9 = (char *)0x0;
      plVar3[5] = 0;
    }
    else {
      pcVar9 = CRYPTO_strdup(pcVar9,"crypto/engine/eng_dyn.c",0x14c);
      plVar3[5] = (long)pcVar9;
    }
LAB_00a85a80:
    return pcVar9 != (char *)0x0;
  case 0xcb:
    if (param_3 < 3) {
      *(int *)(plVar3 + 6) = (int)param_3;
      return true;
    }
    ERR_new();
    uVar8 = 0x152;
    break;
  case 0xcc:
    if (param_3 < 3) {
      *(int *)(plVar3 + 9) = (int)param_3;
      return true;
    }
    ERR_new();
    uVar8 = 0x15b;
    break;
  case 0xcd:
    if ((param_4 != (char *)0x0) && (*param_4 != '\0')) {
      pcVar9 = CRYPTO_strdup(param_4,"crypto/engine/eng_dyn.c",0x167);
      if (pcVar9 == (char *)0x0) {
        ERR_new();
        uVar8 = 0x169;
      }
      else {
        iVar2 = OPENSSL_sk_push(plVar3[10],pcVar9);
        if (iVar2 != 0) {
          return true;
        }
        CRYPTO_free(pcVar9);
        ERR_new();
        uVar8 = 0x16e;
      }
      ERR_set_debug("crypto/engine/eng_dyn.c",uVar8,"dynamic_ctrl");
      uVar8 = 0xc0100;
      goto LAB_00a857b4;
    }
    ERR_new();
    uVar8 = 0x163;
    break;
  case 0xce:
    pDVar5 = (DSO *)DSO_new();
    *plVar3 = (long)pDVar5;
    if (pDVar5 == (DSO *)0x0) {
      return false;
    }
    pcVar9 = (char *)plVar3[3];
    if (pcVar9 == (char *)0x0) {
      if (plVar3[5] == 0) {
        return false;
      }
      DSO_ctrl(pDVar5,2,2,(void *)0x0);
      pcVar9 = DSO_convert_filename((DSO *)*plVar3,(char *)plVar3[5]);
      plVar3[3] = (long)pcVar9;
    }
    if ((int)plVar3[9] != 2) {
      pDVar5 = DSO_load((DSO *)*plVar3,pcVar9,(DSO_METHOD *)0x0,0);
      if (pDVar5 != (DSO *)0x0) {
LAB_00a85b58:
        pDVar6 = DSO_bind_func((DSO *)*plVar3,(char *)plVar3[8]);
        plVar3[2] = (long)pDVar6;
        if (pDVar6 == (DSO_FUNC_TYPE)0x0) {
          plVar3[2] = 0;
          iVar2 = DSO_free((DSO *)*plVar3);
          *plVar3 = 0;
          ERR_new(iVar2);
          ERR_set_debug("crypto/engine/eng_dyn.c",0x1c7,"dynamic_load");
          uVar8 = 0x68;
          goto LAB_00a857b4;
        }
        if ((int)plVar3[4] == 0) {
          pDVar6 = DSO_bind_func((DSO *)*plVar3,(char *)plVar3[7]);
          plVar3[1] = (long)pDVar6;
          if ((pDVar6 != (DSO_FUNC_TYPE)0x0) && (uVar7 = (*pDVar6)(0x30000), 0x2ffff < uVar7)) {
            ERR_set_mark();
            pDVar6 = DSO_bind_func((DSO *)*plVar3,"EVP_PKEY_base_id");
            ERR_pop_to_mark();
            if (pDVar6 == (DSO_FUNC_TYPE)0x0) goto LAB_00a85b74;
          }
          plVar3[1] = 0;
          plVar3[2] = 0;
          iVar2 = DSO_free((DSO *)*plVar3);
          *plVar3 = 0;
          ERR_new(iVar2);
          ERR_set_debug("crypto/engine/eng_dyn.c",0x1e1,"dynamic_load");
          uVar8 = 0x91;
        }
        else {
LAB_00a85b74:
          memcpy(auStack_148,param_1,0xe0);
          local_168 = ENGINE_get_static_state();
          CRYPTO_get_mem_functions(&pmStack_160,&prStack_158,&pfStack_150);
          engine_set_all_null(param_1);
          iVar2 = engine_add_dynamic_id(param_1,plVar3[2],1);
          if ((iVar2 == 0) ||
             (iVar2 = (*(code *)plVar3[2])(param_1,plVar3[5],&local_168), iVar2 == 0)) {
            engine_remove_dynamic_id(param_1,1);
            plVar3[1] = 0;
            plVar3[2] = 0;
            iVar2 = DSO_free((DSO *)*plVar3);
            *plVar3 = 0;
            ERR_new(iVar2);
            ERR_set_debug("crypto/engine/eng_dyn.c",0x202,"dynamic_load");
            ERR_set_error(0x26,0x6d,0);
            memcpy(param_1,auStack_148,0xe0);
            return false;
          }
          if (((int)plVar3[6] < 1) || (iVar2 = ENGINE_add(param_1), iVar2 != 0)) {
            return true;
          }
          if ((int)plVar3[6] < 2) {
            ERR_clear_error();
            return true;
          }
          ERR_new();
          ERR_set_debug("crypto/engine/eng_dyn.c",0x212,"dynamic_load");
          uVar8 = 0x67;
        }
        goto LAB_00a857b4;
      }
      if ((int)plVar3[9] == 0) goto LAB_00a85aa8;
    }
    iVar2 = OPENSSL_sk_num(plVar3[10]);
    if (0 < iVar2) {
      iVar1 = 0;
      do {
        pcVar9 = (char *)OPENSSL_sk_value(plVar3[10],iVar1);
        pcVar9 = DSO_merge((DSO *)*plVar3,(char *)plVar3[3],pcVar9);
        if (pcVar9 == (char *)0x0) break;
        pDVar5 = DSO_load((DSO *)*plVar3,pcVar9,(DSO_METHOD *)0x0,0);
        if (pDVar5 != (DSO *)0x0) {
          CRYPTO_free(pcVar9);
          goto LAB_00a85b58;
        }
        CRYPTO_free(pcVar9);
        iVar1 = iVar1 + 1;
      } while (iVar1 < iVar2);
    }
LAB_00a85aa8:
    ERR_new();
    ERR_set_debug("crypto/engine/eng_dyn.c",0x1ba,"dynamic_load");
    ERR_set_error(0x26,0x84,0);
    DSO_free((DSO *)*plVar3);
    *plVar3 = 0;
    return false;
  default:
    ERR_new();
    ERR_set_debug("crypto/engine/eng_dyn.c",0x176,"dynamic_ctrl");
    uVar8 = 0x77;
    goto LAB_00a857b4;
  }
  ERR_set_debug("crypto/engine/eng_dyn.c",uVar8,"dynamic_ctrl");
  uVar8 = 0x8f;
LAB_00a857b4:
  ERR_set_error(0x26,uVar8,0);
  return false;
}

