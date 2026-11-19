/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bf84
 */

int CONF_modules_load(CONF *cnf,char *appname,ulong flags)

{
  char *section;
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  char *pcVar7;
  stack_st_CONF_VALUE *psVar8;
  char *pcVar9;
  size_t sVar10;
  char *pcVar11;
  DSO *dso;
  DSO_FUNC_TYPE pDVar12;
  DSO_FUNC_TYPE pDVar13;
  long *ptr;
  undefined8 uVar14;
  uint uVar15;
  
  if (cnf != (CONF *)0x0) {
    lVar6 = _CONF_get_number(cnf,(char *)0x0,"config_diagnostics");
    if (lVar6 != 0) {
      flags = flags & 0xffffffffffffffe8;
    }
    ERR_set_mark();
    uVar15 = (uint)flags;
    if ((appname == (char *)0x0) ||
       ((pcVar7 = NCONF_get_string(cnf,(char *)0x0,appname), (uVar15 >> 5 & 1) != 0 &&
        (pcVar7 == (char *)0x0)))) {
      pcVar7 = NCONF_get_string(cnf,(char *)0x0,"openssl_conf");
    }
    if (pcVar7 == (char *)0x0) {
      ERR_pop_to_mark();
    }
    else {
      psVar8 = NCONF_get_section(cnf,pcVar7);
      if (psVar8 == (stack_st_CONF_VALUE *)0x0) {
        if ((uVar15 >> 2 & 1) == 0) {
          ERR_clear_last_mark();
          ERR_new();
          ERR_set_debug("crypto/conf/conf_mod.c",0x98,"CONF_modules_load");
          ERR_set_error(0xe,0x7c,"openssl_conf=%s",pcVar7);
          return 0;
        }
        ERR_pop_to_mark();
        return 0;
      }
      ERR_pop_to_mark();
      iVar2 = OPENSSL_sk_num(psVar8);
      if (0 < iVar2) {
        iVar2 = 0;
        do {
          lVar6 = OPENSSL_sk_value(psVar8,iVar2);
          ERR_set_mark();
          pcVar7 = *(char **)(lVar6 + 8);
          section = *(char **)(lVar6 + 0x10);
          iVar3 = CRYPTO_THREAD_run_once(&DAT_00d21938,FUN_00a0ccac);
          if ((iVar3 == 0) || (DAT_00d2193c == '\0')) {
joined_r0x00a0c304:
            if ((flags & 1) == 0) {
              ERR_clear_last_mark();
              return -1;
            }
          }
          else {
            pcVar9 = strrchr(pcVar7,0x2e);
            if (pcVar9 == (char *)0x0) {
              sVar10 = strlen(pcVar7);
              iVar3 = (int)sVar10;
            }
            else {
              iVar3 = (int)pcVar9 - (int)pcVar7;
            }
            iVar4 = CRYPTO_THREAD_run_once(&DAT_00d21940,FUN_00a0ccd0);
            if (((iVar4 != 0) && (DAT_00d21944 != 0)) &&
               (iVar4 = CRYPTO_THREAD_read_lock(DAT_00d21928), iVar4 != 0)) {
              iVar4 = OPENSSL_sk_num(DAT_00d21930);
              if (0 < iVar4) {
                iVar4 = 0;
                do {
                  lVar6 = OPENSSL_sk_value(DAT_00d21930,iVar4);
                  iVar5 = strncmp(*(char **)(lVar6 + 8),pcVar7,(long)iVar3);
                  if (iVar5 == 0) {
                    CRYPTO_THREAD_unlock(DAT_00d21928);
                    goto joined_r0x00a0c238;
                  }
                  iVar4 = iVar4 + 1;
                  iVar5 = OPENSSL_sk_num(DAT_00d21930);
                } while (iVar4 < iVar5);
              }
              CRYPTO_THREAD_unlock(DAT_00d21928);
            }
            lVar6 = 0;
joined_r0x00a0c238:
            if (((uVar15 >> 3 & 1) == 0) && (lVar6 == 0)) {
              pcVar11 = _CONF_get_string(cnf,section,"path");
              pcVar9 = pcVar7;
              if (pcVar11 != (char *)0x0) {
                pcVar9 = pcVar11;
              }
              dso = DSO_load((DSO *)0x0,pcVar9,(DSO_METHOD *)0x0,0);
              if (dso == (DSO *)0x0) {
                uVar14 = 0x6e;
              }
              else {
                pDVar12 = DSO_bind_func(dso,"OPENSSL_init");
                if (pDVar12 == (DSO_FUNC_TYPE)0x0) {
                  uVar14 = 0x70;
                }
                else {
                  pDVar13 = DSO_bind_func(dso,"OPENSSL_finish");
                  lVar6 = FUN_00a0c990(dso,pcVar7,pDVar12,pDVar13);
                  if (lVar6 != 0) goto LAB_00a0c240;
                  uVar14 = 0;
                }
              }
              iVar3 = DSO_free(dso);
              ERR_new(iVar3);
              ERR_set_debug("crypto/conf/conf_mod.c",0x141,"module_load_dso");
              ERR_set_error(0xe,uVar14,"module=%s, path=%s",pcVar7,pcVar9);
LAB_00a0c2bc:
              if ((uVar15 >> 2 & 1) == 0) {
                ERR_new();
                ERR_set_debug("crypto/conf/conf_mod.c",0x10a,"module_run");
                ERR_set_error(0xe,0x71,"module=%s",pcVar7);
              }
              goto joined_r0x00a0c304;
            }
            if (lVar6 == 0) goto LAB_00a0c2bc;
LAB_00a0c240:
            ptr = CRYPTO_malloc(0x28,"crypto/conf/conf_mod.c",0x19d);
            if (ptr == (long *)0x0) {
LAB_00a0c434:
              if ((uVar15 >> 2 & 1) == 0) {
                ERR_new();
                ERR_set_debug("crypto/conf/conf_mod.c",0x114,"module_run");
                ERR_set_error(0xe,0x6d,"module=%s, value=%s retcode=%-8d",pcVar7,section,0xffffffff)
                ;
              }
              goto joined_r0x00a0c304;
            }
            *ptr = lVar6;
            pcVar9 = CRYPTO_strdup(pcVar7,"crypto/conf/conf_mod.c",0x1a2);
            ptr[1] = (long)pcVar9;
            pcVar9 = CRYPTO_strdup(section,"crypto/conf/conf_mod.c",0x1a3);
            ptr[2] = (long)pcVar9;
            ptr[4] = 0;
            if ((pcVar9 == (char *)0x0) || (ptr[1] == 0)) {
LAB_00a0c400:
              CRYPTO_free((void *)ptr[1]);
              CRYPTO_free((void *)ptr[2]);
              CRYPTO_free(ptr);
              goto LAB_00a0c434;
            }
            if (*(code **)(lVar6 + 0x10) != (code *)0x0) {
              iVar3 = (**(code **)(lVar6 + 0x10))(ptr,cnf);
              bVar1 = true;
              if (0 < iVar3) goto LAB_00a0c310;
LAB_00a0c3ec:
              if ((bVar1) && (*(code **)(lVar6 + 0x18) != (code *)0x0)) {
                (**(code **)(lVar6 + 0x18))(ptr);
              }
              goto LAB_00a0c400;
            }
            bVar1 = false;
LAB_00a0c310:
            iVar3 = CRYPTO_THREAD_run_once(&DAT_00d21940,FUN_00a0ccd0);
            if (((iVar3 == 0) || (DAT_00d21944 == 0)) ||
               (iVar3 = CRYPTO_THREAD_write_lock(DAT_00d21928), iVar3 == 0)) goto LAB_00a0c3ec;
            if ((DAT_00d21948 == 0) && (DAT_00d21948 = OPENSSL_sk_new_null(), DAT_00d21948 == 0)) {
              CRYPTO_THREAD_unlock(DAT_00d21928);
              ERR_new();
              uVar14 = 0x1bc;
LAB_00a0c3c8:
              ERR_set_debug("crypto/conf/conf_mod.c",uVar14,"module_init");
              ERR_set_error(0xe,0xc0100,0);
              goto LAB_00a0c3ec;
            }
            iVar3 = OPENSSL_sk_push(DAT_00d21948,ptr);
            if (iVar3 == 0) {
              CRYPTO_THREAD_unlock(DAT_00d21928);
              ERR_new();
              uVar14 = 0x1c3;
              goto LAB_00a0c3c8;
            }
            *(int *)(lVar6 + 0x20) = *(int *)(lVar6 + 0x20) + 1;
            CRYPTO_THREAD_unlock(DAT_00d21928);
          }
          ERR_pop_to_mark();
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(psVar8);
        } while (iVar2 < iVar3);
      }
    }
  }
  return 1;
}

