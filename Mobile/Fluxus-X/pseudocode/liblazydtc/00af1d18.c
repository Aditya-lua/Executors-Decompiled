/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af1d18
 */

undefined8 FUN_00af1d18(long param_1,char *param_2,undefined4 param_3)

{
  char cVar1;
  size_t __n;
  char *pcVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  size_t sVar6;
  long lVar7;
  undefined8 uVar8;
  void *ptr;
  char *__s;
  
  if ((param_2 == (char *)0x0) || (cVar1 = *param_2, pcVar2 = param_2, cVar1 == '\0')) {
    ERR_new();
    ERR_set_debug("crypto/x509/by_dir.c",0xaf,"add_cert_dir");
    uVar8 = 0x71;
LAB_00af1ec4:
    ERR_set_error(0xb,uVar8,0);
    return 0;
  }
  do {
    if ((cVar1 == '\0') || (cVar1 == ':')) {
      __n = (long)pcVar2 - (long)param_2;
      if (__n != 0) {
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
        if (iVar3 < 1) {
          iVar3 = 0;
        }
        else {
          iVar3 = 0;
          do {
            puVar5 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 8),iVar3);
            __s = (char *)*puVar5;
            sVar6 = strlen(__s);
            if ((sVar6 == __n) && (iVar4 = strncmp(__s,param_2,__n), iVar4 == 0)) break;
            iVar3 = iVar3 + 1;
            iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
          } while (iVar3 < iVar4);
        }
        iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
        if (iVar4 <= iVar3) {
          if (*(long *)(param_1 + 8) == 0) {
            lVar7 = OPENSSL_sk_new_null();
            *(long *)(param_1 + 8) = lVar7;
            if (lVar7 != 0) goto LAB_00af1e30;
            ERR_new();
            uVar8 = 200;
          }
          else {
LAB_00af1e30:
            puVar5 = CRYPTO_malloc(0x18,"crypto/x509/by_dir.c",0xcc);
            if (puVar5 == (undefined8 *)0x0) {
              ERR_new();
              uVar8 = 0xce;
            }
            else {
              *(undefined4 *)(puVar5 + 1) = param_3;
              uVar8 = OPENSSL_sk_new(&LAB_00af1fbc);
              puVar5[2] = uVar8;
              ptr = (void *)CRYPTO_strndup(param_2,__n,"crypto/x509/by_dir.c",0xd3);
              *puVar5 = ptr;
              if ((ptr == (void *)0x0) || (puVar5[2] == 0)) {
                CRYPTO_free(ptr);
                OPENSSL_sk_pop_free(puVar5[2],&LAB_00af1d08);
                CRYPTO_free(puVar5);
                return 0;
              }
              iVar3 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 8),puVar5);
              if (iVar3 != 0) {
                cVar1 = *pcVar2;
                param_2 = pcVar2 + 1;
                goto joined_r0x00af1e14;
              }
              CRYPTO_free((void *)*puVar5);
              OPENSSL_sk_pop_free(puVar5[2],&LAB_00af1d08);
              CRYPTO_free(puVar5);
              ERR_new();
              uVar8 = 0xda;
            }
          }
          ERR_set_debug("crypto/x509/by_dir.c",uVar8,"add_cert_dir");
          uVar8 = 0xc0100;
          goto LAB_00af1ec4;
        }
      }
      cVar1 = *pcVar2;
      param_2 = pcVar2 + 1;
    }
    else {
      cVar1 = *pcVar2;
    }
joined_r0x00af1e14:
    if (cVar1 == '\0') {
      return 1;
    }
    cVar1 = pcVar2[1];
    pcVar2 = pcVar2 + 1;
  } while( true );
}

