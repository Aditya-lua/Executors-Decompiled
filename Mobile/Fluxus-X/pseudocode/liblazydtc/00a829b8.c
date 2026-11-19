/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a829b8
 */

int ossl_namemap_add_names(long param_1,int param_2,byte *param_3,byte param_4)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  byte bVar5;
  byte *__s;
  size_t sVar6;
  void *local_70;
  undefined4 local_68;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/core_namemap.c",0x137,"ossl_namemap_add_names");
    ERR_set_error(0xf,0xc0102,0);
  }
  else {
    iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 8));
    if (iVar1 != 0) {
      if (*param_3 != 0) {
        __s = param_3;
        do {
          pcVar3 = strchr((char *)__s,(uint)param_4);
          if (pcVar3 == (char *)0x0) {
            sVar6 = strlen((char *)__s);
          }
          else {
            sVar6 = (long)pcVar3 - (long)__s;
          }
          local_70 = (void *)CRYPTO_strndup(__s,sVar6,"crypto/core_namemap.c",0xb6);
          if (local_70 == (void *)0x0) {
            iVar1 = 0;
            bVar5 = *__s;
            if (bVar5 != 0) goto LAB_00a82a8c;
LAB_00a82b90:
            ERR_new();
            ERR_set_debug("crypto/core_namemap.c",0x14c,"ossl_namemap_add_names");
            ERR_set_error(0xf,0x75,0);
            goto LAB_00a82c44;
          }
          local_68 = 0;
          lVar4 = OPENSSL_LH_retrieve(*(undefined8 *)(param_1 + 0x10),&local_70);
          CRYPTO_free(local_70);
          iVar1 = 0;
          if (lVar4 != 0) {
            iVar1 = *(int *)(lVar4 + 8);
          }
          bVar5 = *__s;
          if (bVar5 == 0) goto LAB_00a82b90;
LAB_00a82a8c:
          if (bVar5 == param_4) goto LAB_00a82b90;
          iVar2 = iVar1;
          if (((param_2 != 0) && (iVar2 = param_2, iVar1 != 0)) && (iVar1 != param_2)) {
            ERR_new();
            ERR_set_debug("crypto/core_namemap.c",0x152,"ossl_namemap_add_names");
            ERR_set_error(0xf,0x76,"\"%.*s\" has an existing different identity %d (from \"%s\")",
                          sVar6,__s,iVar1,param_3);
            goto LAB_00a82c44;
          }
          param_2 = iVar2;
          __s = __s + sVar6;
          if (pcVar3 != (char *)0x0) {
            __s = (byte *)(pcVar3 + 1);
          }
        } while (*__s != 0);
        if (*param_3 != 0) {
          do {
            pcVar3 = strchr((char *)param_3,(uint)param_4);
            if (pcVar3 == (char *)0x0) {
              sVar6 = strlen((char *)param_3);
            }
            else {
              sVar6 = (long)pcVar3 - (long)param_3;
            }
            iVar2 = FUN_00a827e8(param_1,param_2,param_3,sVar6);
            iVar1 = iVar2;
            if ((param_2 != 0) && (iVar1 = param_2, iVar2 != param_2)) {
              ERR_new();
              ERR_set_debug("crypto/core_namemap.c",0x166,"ossl_namemap_add_names");
              ERR_set_error(0xf,0xc0103,"Got number %d when expecting %d",iVar2,param_2);
LAB_00a82c44:
              CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
              return 0;
            }
            param_2 = iVar1;
            param_3 = param_3 + sVar6;
            if (pcVar3 != (char *)0x0) {
              param_3 = (byte *)(pcVar3 + 1);
            }
          } while (*param_3 != 0);
        }
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
      return param_2;
    }
  }
  return 0;
}

