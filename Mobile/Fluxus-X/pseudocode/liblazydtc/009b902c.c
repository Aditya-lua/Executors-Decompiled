/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b902c
 */

undefined8
bytes_to_cipher_list
          (undefined8 param_1,long *param_2,long *param_3,long *param_4,int param_5,int param_6)

{
  ulong __n;
  char *pcVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  int *piVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  void *__src;
  char local_64 [4];
  
  uVar9 = param_2[1];
  if (uVar9 == 0) {
    ERR_new();
    if (param_6 == 0) {
      ERR_set_debug("ssl/ssl_lib.c",0x1643,"bytes_to_cipher_list");
      uVar7 = 0xb7;
      goto LAB_009b9208;
    }
    ERR_set_debug("ssl/ssl_lib.c",0x1641,"bytes_to_cipher_list");
    uVar7 = 0x2f;
    uVar8 = 0xb7;
  }
  else {
    __n = 2;
    if (param_5 != 0) {
      __n = 3;
    }
    uVar2 = 0;
    if (__n != 0) {
      uVar2 = uVar9 / __n;
    }
    if (uVar9 == uVar2 * __n) {
      lVar4 = OPENSSL_sk_new_null();
      lVar5 = OPENSSL_sk_new_null();
      if ((lVar4 == 0) || (lVar5 == 0)) {
        ERR_new();
        if (param_6 == 0) {
          ERR_set_debug("ssl/ssl_lib.c",0x1656,"bytes_to_cipher_list");
          ERR_set_error(0x14,0xc0100,0);
        }
        else {
          ERR_set_debug("ssl/ssl_lib.c",0x1654,"bytes_to_cipher_list");
          ossl_statem_fatal(param_1,0x50,0xc0100,0);
        }
      }
      else {
        uVar9 = param_2[1];
        if (__n <= uVar9) {
          pcVar1 = (char *)((ulong)local_64 | 1);
          if (param_5 == 0) {
            pcVar1 = local_64;
          }
          do {
            __src = (void *)*param_2;
            memcpy(local_64,__src,__n);
            *param_2 = (long)__src + __n;
            param_2[1] = uVar9 - __n;
            if ((local_64[0] == '\0' || param_5 == 0) &&
               (piVar6 = (int *)ssl_get_cipher_by_char(param_1,pcVar1,1), piVar6 != (int *)0x0)) {
              if (*piVar6 == 0) {
LAB_009b9198:
                iVar3 = OPENSSL_sk_push(lVar5,piVar6);
                if (iVar3 != 0) goto LAB_009b91a8;
              }
              else {
                iVar3 = OPENSSL_sk_push(lVar4,piVar6);
                if (iVar3 != 0) {
                  if (*piVar6 != 0) goto LAB_009b91a8;
                  goto LAB_009b9198;
                }
              }
              ERR_new();
              if (param_6 != 0) {
                ERR_set_debug("ssl/ssl_lib.c",0x1669,"bytes_to_cipher_list");
                uVar7 = 0x50;
                uVar8 = 0xc0100;
                goto LAB_009b92d0;
              }
              ERR_set_debug("ssl/ssl_lib.c",0x166b,"bytes_to_cipher_list");
              uVar7 = 0xc0100;
              goto LAB_009b9310;
            }
LAB_009b91a8:
            uVar9 = param_2[1];
          } while (__n <= uVar9);
        }
        if (uVar9 == 0) {
          if (param_3 == (long *)0x0) {
            OPENSSL_sk_free(lVar4);
          }
          else {
            *param_3 = lVar4;
          }
          if (param_4 == (long *)0x0) {
            OPENSSL_sk_free();
            return 1;
          }
          *param_4 = lVar5;
          return 1;
        }
        ERR_new();
        if (param_6 == 0) {
          ERR_set_debug("ssl/ssl_lib.c",0x1674,"bytes_to_cipher_list");
          uVar7 = 0x10f;
LAB_009b9310:
          ERR_set_error(0x14,uVar7,0);
        }
        else {
          ERR_set_debug("ssl/ssl_lib.c",0x1672,"bytes_to_cipher_list");
          uVar7 = 0x32;
          uVar8 = 0x10f;
LAB_009b92d0:
          ossl_statem_fatal(param_1,uVar7,uVar8,0);
        }
      }
      OPENSSL_sk_free(lVar4);
      OPENSSL_sk_free(lVar5);
      return 0;
    }
    ERR_new();
    if (param_6 == 0) {
      ERR_set_debug("ssl/ssl_lib.c",0x164c,"bytes_to_cipher_list");
      uVar7 = 0x97;
LAB_009b9208:
      ERR_set_error(0x14,uVar7,0);
      return 0;
    }
    ERR_set_debug("ssl/ssl_lib.c",0x164a,"bytes_to_cipher_list");
    uVar7 = 0x32;
    uVar8 = 0x97;
  }
  ossl_statem_fatal(param_1,uVar7,uVar8,0);
  return 0;
}

