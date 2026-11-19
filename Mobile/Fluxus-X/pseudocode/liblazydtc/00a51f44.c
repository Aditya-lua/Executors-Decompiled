/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51f44
 */

ENGINE * ENGINE_by_id(char *id)

{
  char *arg;
  undefined4 uVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  char *pcVar5;
  ENGINE *pEVar6;
  ENGINE *pEVar7;
  long lVar8;
  undefined8 uVar9;
  
  if (id == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x17a,"ENGINE_by_id");
    uVar1 = 0xc0102;
  }
  else {
    ENGINE_load_builtin_engines();
    iVar4 = CRYPTO_THREAD_run_once(&engine_lock_init,do_engine_lock_init_ossl_);
    if ((iVar4 != 0) && (do_engine_lock_init_ossl_ret_ != 0)) {
      iVar4 = CRYPTO_THREAD_write_lock(global_engine_lock);
      pEVar6 = DAT_00d219b8;
      if (iVar4 == 0) {
        return (ENGINE *)0x0;
      }
      do {
        if (pEVar6 == (ENGINE *)0x0) {
LAB_00a51fc0:
          CRYPTO_THREAD_unlock(global_engine_lock);
          iVar4 = strcmp(id,"dynamic");
          if (iVar4 == 0) {
            pEVar6 = (ENGINE *)0x0;
          }
          else {
            pcVar5 = (char *)ossl_safe_getenv("OPENSSL_ENGINES");
            arg = "/home/z/my-project/build/stage-arm64/lib/engines-3";
            if (pcVar5 != (char *)0x0) {
              arg = pcVar5;
            }
            pEVar6 = ENGINE_by_id("dynamic");
            if ((((pEVar6 != (ENGINE *)0x0) &&
                 (iVar4 = ENGINE_ctrl_cmd_string(pEVar6,"ID",id,0), iVar4 != 0)) &&
                (iVar4 = ENGINE_ctrl_cmd_string(pEVar6,"DIR_LOAD","2",0), iVar4 != 0)) &&
               (((iVar4 = ENGINE_ctrl_cmd_string(pEVar6,"DIR_ADD",arg,0), iVar4 != 0 &&
                 (iVar4 = ENGINE_ctrl_cmd_string(pEVar6,"LIST_ADD","1",0), iVar4 != 0)) &&
                (iVar4 = ENGINE_ctrl_cmd_string(pEVar6,"LOAD",(char *)0x0,0), iVar4 != 0)))) {
              return pEVar6;
            }
          }
          iVar4 = ENGINE_free(pEVar6);
          ERR_new(iVar4);
          ERR_set_debug("crypto/engine/eng_list.c",0x1b1,"ENGINE_by_id");
          ERR_set_error(0x26,0x74,"id=%s",id);
          return (ENGINE *)0x0;
        }
        iVar4 = strcmp(id,*(char **)pEVar6);
        if (iVar4 == 0) {
          if (((byte)pEVar6[0x98] >> 2 & 1) == 0) {
            pEVar7 = pEVar6 + 0x9c;
            do {
              cVar2 = '\x01';
              bVar3 = (bool)ExclusiveMonitorPass(pEVar7,0x10);
              if (bVar3) {
                *(int *)pEVar7 = *(int *)pEVar7 + 1;
                cVar2 = ExclusiveMonitorsStatus();
              }
            } while (cVar2 != '\0');
            pEVar7 = pEVar6;
LAB_00a5213c:
            CRYPTO_THREAD_unlock(global_engine_lock);
            return pEVar7;
          }
          pEVar7 = ENGINE_new();
          if (pEVar7 != (ENGINE *)0x0) {
            uVar9 = *(undefined8 *)pEVar6;
            *(undefined8 *)(pEVar7 + 8) = *(undefined8 *)(pEVar6 + 8);
            *(undefined8 *)pEVar7 = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x10);
            *(undefined8 *)(pEVar7 + 0x18) = *(undefined8 *)(pEVar6 + 0x18);
            *(undefined8 *)(pEVar7 + 0x10) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x20);
            *(undefined8 *)(pEVar7 + 0x28) = *(undefined8 *)(pEVar6 + 0x28);
            *(undefined8 *)(pEVar7 + 0x20) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x30);
            *(undefined8 *)(pEVar7 + 0x38) = *(undefined8 *)(pEVar6 + 0x38);
            *(undefined8 *)(pEVar7 + 0x30) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x40);
            *(undefined8 *)(pEVar7 + 0x48) = *(undefined8 *)(pEVar6 + 0x48);
            *(undefined8 *)(pEVar7 + 0x40) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x58);
            *(undefined8 *)(pEVar7 + 0x60) = *(undefined8 *)(pEVar6 + 0x60);
            *(undefined8 *)(pEVar7 + 0x58) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x68);
            *(undefined8 *)(pEVar7 + 0x70) = *(undefined8 *)(pEVar6 + 0x70);
            *(undefined8 *)(pEVar7 + 0x68) = uVar9;
            uVar9 = *(undefined8 *)(pEVar6 + 0x78);
            *(undefined8 *)(pEVar7 + 0x80) = *(undefined8 *)(pEVar6 + 0x80);
            *(undefined8 *)(pEVar7 + 0x78) = uVar9;
            *(undefined8 *)(pEVar7 + 0x90) = *(undefined8 *)(pEVar6 + 0x90);
            *(undefined4 *)(pEVar7 + 0x98) = *(undefined4 *)(pEVar6 + 0x98);
            lVar8 = *(long *)(pEVar6 + 0xd8);
            *(long *)(pEVar7 + 0xd8) = lVar8;
            if (lVar8 == 0) goto LAB_00a5213c;
            if (DAT_00d219a8 == (ENGINE *)0x0) {
              if (DAT_00d219b0 != (ENGINE *)0x0) goto LAB_00a5213c;
              DAT_00d219a8 = pEVar7;
              *(undefined8 *)(pEVar7 + 200) = 0;
            }
            else {
              if ((DAT_00d219b0 == (ENGINE *)0x0) || (*(long *)(DAT_00d219b0 + 0xd0) != 0))
              goto LAB_00a5213c;
              *(ENGINE **)(DAT_00d219b0 + 0xd0) = pEVar7;
              *(ENGINE **)(pEVar7 + 200) = DAT_00d219b0;
            }
            DAT_00d219b0 = pEVar7;
            *(undefined8 *)(pEVar7 + 0xd0) = 0;
            goto LAB_00a5213c;
          }
          goto LAB_00a51fc0;
        }
        pEVar6 = *(ENGINE **)(pEVar6 + 0xc0);
      } while( true );
    }
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x180,"ENGINE_by_id");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0x26,uVar1,0);
  return (ENGINE *)0x0;
}

