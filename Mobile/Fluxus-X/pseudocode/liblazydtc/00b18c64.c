/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b18c64
 */

long OSSL_HTTP_exchange(long param_1,undefined8 *param_2)

{
  uint uVar1;
  long lVar2;
  char *param5;
  int iVar3;
  long lVar4;
  char *pcVar5;
  ulong uVar6;
  undefined8 uVar7;
  char *param6;
  uint uVar8;
  char acStack_f8 [200];
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x41d,"OSSL_HTTP_exchange");
    uVar7 = 0xc0102;
  }
  else {
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = 0;
    }
    lVar4 = OSSL_HTTP_REQ_CTX_exchange(param_1);
    if (lVar4 != 0) {
      iVar3 = BIO_up_ref();
      lVar2 = 0;
      if (iVar3 != 0) {
        lVar2 = lVar4;
      }
      return lVar2;
    }
    if (*(char **)(param_1 + 0xb8) == (char *)0x0) {
      uVar6 = ERR_peek_error();
      uVar8 = (uint)uVar6;
      uVar1 = 2;
      if (-1 < (int)uVar8) {
        uVar1 = uVar8 >> 0x17 & 0xff;
      }
      if ((uVar1 != 0x14) && (uVar1 != 0x3d)) {
        uVar8 = ((int)uVar8 >> 0x1f & 0x7f800000U | 0x7fffff) & uVar8;
        if ((uVar1 != 0x3a || uVar8 != 0x93) && (uVar1 != 0x20 || uVar8 != 0x93 && uVar8 != 0x67)) {
          return 0;
        }
      }
      if (*(char **)(param_1 + 0x48) != (char *)0x0) {
        param6 = *(char **)(param_1 + 0x50);
        pcVar5 = "";
        if (*(int *)(param_1 + 0x38) != 0) {
          pcVar5 = "s";
        }
        param5 = ":";
        if (param6 == (char *)0x0) {
          param5 = "";
          param6 = "";
        }
        BIO_snprintf(acStack_f8,200,"server=http%s://%s%s%s",pcVar5,*(char **)(param_1 + 0x48),
                     param5,param6);
        ERR_add_error_data(1,acStack_f8);
      }
      if (*(long *)(param_1 + 0x40) != 0) {
        ERR_add_error_data(2," proxy=");
      }
      if (uVar6 != 0) {
        return 0;
      }
      pcVar5 = ", likely because it requires the use of TLS";
      if (*(int *)(param_1 + 0x38) != 0) {
        pcVar5 = " violating the protocol";
      }
      BIO_snprintf(acStack_f8,200," peer has disconnected%s",pcVar5);
      ERR_add_error_data(1,acStack_f8);
      return 0;
    }
    if (param_2 != (undefined8 *)0x0) {
      pcVar5 = CRYPTO_strdup(*(char **)(param_1 + 0xb8),"crypto/http/http_client.c",0x42b);
      *param_2 = pcVar5;
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x428,"OSSL_HTTP_exchange");
    uVar7 = 0x74;
  }
  ERR_set_error(0x3d,uVar7,0);
  return 0;
}

