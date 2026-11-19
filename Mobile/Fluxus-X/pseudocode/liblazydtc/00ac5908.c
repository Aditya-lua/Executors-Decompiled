/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5908
 */

undefined8 ossl_parse_property(undefined8 param_1,char *param_2)

{
  int iVar1;
  long lVar2;
  int *ptr;
  undefined8 uVar3;
  char *pcVar4;
  char *local_48;
  
  uVar3 = 0;
  if (param_2 != (char *)0x0) {
    local_48 = param_2;
    lVar2 = OPENSSL_sk_new(&LAB_00ac5b60);
    if (lVar2 == 0) {
      uVar3 = 0;
    }
    else {
      param_2 = param_2 + -1;
      do {
        param_2 = param_2 + 1;
        iVar1 = ossl_ctype_check(*param_2,8);
      } while (iVar1 != 0);
      local_48 = param_2;
      if (*param_2 == '\0') {
LAB_00ac5ad0:
        uVar3 = FUN_00ac6380(param_1,lVar2);
LAB_00ac5ae0:
        ptr = (int *)0x0;
      }
      else {
        ptr = CRYPTO_malloc(0x18,"crypto/property/property_parse.c",0x169);
        while (ptr != (int *)0x0) {
          ptr[4] = 0;
          ptr[5] = 0;
          *(byte *)(ptr + 3) = *(byte *)(ptr + 3) & 0xfe;
          iVar1 = FUN_00ac5b80(param_1,&local_48,ptr);
          if (iVar1 == 0) break;
          ptr[2] = 0;
          if (*ptr == 0) {
            ERR_new();
            ERR_set_debug("crypto/property/property_parse.c",0x172,"ossl_parse_property");
            pcVar4 = "Unknown name HERE-->%s";
            uVar3 = 0x6c;
LAB_00ac5b14:
            ERR_set_error(0x37,uVar3,pcVar4,param_2);
            break;
          }
          pcVar4 = local_48;
          if (*local_48 == '=') {
            do {
              pcVar4 = pcVar4 + 1;
              iVar1 = ossl_ctype_check(*pcVar4,8);
            } while (iVar1 != 0);
            local_48 = pcVar4;
            iVar1 = FUN_00ac5d30(param_1,&local_48,ptr,1);
            if (iVar1 == 0) {
              ERR_new();
              ERR_set_debug("crypto/property/property_parse.c",0x178,"ossl_parse_property");
              pcVar4 = "HERE-->%s";
              uVar3 = 0x6b;
              goto LAB_00ac5b14;
            }
          }
          else {
            ptr[1] = 0;
            ptr[4] = 1;
          }
          iVar1 = OPENSSL_sk_push(lVar2,ptr);
          pcVar4 = local_48;
          if (iVar1 == 0) break;
          param_2 = local_48;
          if (*local_48 != ',') {
            if (*local_48 == '\0') goto LAB_00ac5ad0;
            ERR_new();
            ERR_set_debug("crypto/property/property_parse.c",0x188,"ossl_parse_property");
            ERR_set_error(0x37,0x6e,"HERE-->%s",pcVar4);
            uVar3 = 0;
            goto LAB_00ac5ae0;
          }
          do {
            param_2 = param_2 + 1;
            iVar1 = ossl_ctype_check(*param_2,8);
          } while (iVar1 != 0);
          local_48 = param_2;
          ptr = CRYPTO_malloc(0x18,"crypto/property/property_parse.c",0x169);
        }
        uVar3 = 0;
      }
      CRYPTO_free(ptr);
      OPENSSL_sk_pop_free(lVar2,&LAB_00ac64d8);
    }
  }
  return uVar3;
}

