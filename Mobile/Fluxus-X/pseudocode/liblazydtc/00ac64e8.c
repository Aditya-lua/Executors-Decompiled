/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac64e8
 */

undefined8 ossl_parse_query(undefined8 param_1,char *param_2,undefined4 param_3)

{
  int iVar1;
  long lVar2;
  void *ptr;
  byte bVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  char *pcVar6;
  char *local_58;
  
  if ((param_2 == (char *)0x0) ||
     (local_58 = param_2, lVar2 = OPENSSL_sk_new(&LAB_00ac5b60), lVar2 == 0)) {
    uVar5 = 0;
  }
  else {
    param_2 = param_2 + -1;
    do {
      param_2 = param_2 + 1;
      iVar1 = ossl_ctype_check(*param_2,8);
    } while (iVar1 != 0);
    local_58 = param_2;
    if (*param_2 == '\0') {
LAB_00ac66f8:
      uVar5 = FUN_00ac6380(param_1,lVar2);
LAB_00ac6708:
      ptr = (void *)0x0;
    }
    else {
      ptr = CRYPTO_malloc(0x18,"crypto/property/property_parse.c",0x1a2);
      while (ptr != (void *)0x0) {
        *(undefined8 *)((long)ptr + 0x10) = 0;
        if (*param_2 == '-') {
          do {
            param_2 = param_2 + 1;
            iVar1 = ossl_ctype_check(*param_2,8);
          } while (iVar1 != 0);
          *(undefined4 *)((long)ptr + 8) = 2;
          *(byte *)((long)ptr + 0xc) = *(byte *)((long)ptr + 0xc) & 0xfe;
          local_58 = param_2;
          iVar1 = FUN_00ac5b80(param_1,&local_58,ptr);
          if (iVar1 == 0) break;
        }
        else {
          bVar3 = 0;
          if (*param_2 == '?') {
            do {
              param_2 = param_2 + 1;
              iVar1 = ossl_ctype_check(*param_2,8);
            } while (iVar1 != 0);
            bVar3 = 1;
            local_58 = param_2;
          }
          *(byte *)((long)ptr + 0xc) = *(byte *)((long)ptr + 0xc) & 0xfe | bVar3;
          iVar1 = FUN_00ac5b80(param_1,&local_58,ptr);
          pcVar6 = local_58;
          if (iVar1 == 0) break;
          if (*local_58 == '=') {
            do {
              pcVar6 = pcVar6 + 1;
              iVar1 = ossl_ctype_check(*pcVar6,8);
            } while (iVar1 != 0);
            uVar4 = 0;
          }
          else {
            iVar1 = OPENSSL_strncasecmp(local_58,&DAT_002b85e7,2);
            if (iVar1 != 0) {
              *(undefined4 *)((long)ptr + 4) = 0;
              *(undefined4 *)((long)ptr + 8) = 0;
              *(undefined4 *)((long)ptr + 0x10) = 1;
              goto LAB_00ac6698;
            }
            pcVar6 = pcVar6 + 1;
            do {
              pcVar6 = pcVar6 + 1;
              iVar1 = ossl_ctype_check(*pcVar6,8);
            } while (iVar1 != 0);
            uVar4 = 1;
          }
          *(undefined4 *)((long)ptr + 8) = uVar4;
          local_58 = pcVar6;
          iVar1 = FUN_00ac5d30(param_1,&local_58,ptr,param_3);
          if (iVar1 == 0) {
            *(undefined4 *)((long)ptr + 4) = 2;
          }
        }
LAB_00ac6698:
        iVar1 = OPENSSL_sk_push(lVar2,ptr);
        pcVar6 = local_58;
        if (iVar1 == 0) break;
        param_2 = local_58;
        if (*local_58 != ',') {
          if (*local_58 == '\0') goto LAB_00ac66f8;
          ERR_new();
          ERR_set_debug("crypto/property/property_parse.c",0x1c7,"ossl_parse_query");
          ERR_set_error(0x37,0x6e,"HERE-->%s",pcVar6);
          uVar5 = 0;
          goto LAB_00ac6708;
        }
        do {
          param_2 = param_2 + 1;
          iVar1 = ossl_ctype_check(*param_2,8);
        } while (iVar1 != 0);
        local_58 = param_2;
        ptr = CRYPTO_malloc(0x18,"crypto/property/property_parse.c",0x1a2);
      }
      uVar5 = 0;
    }
    CRYPTO_free(ptr);
    OPENSSL_sk_pop_free(lVar2,&LAB_00ac64d8);
  }
  return uVar5;
}

