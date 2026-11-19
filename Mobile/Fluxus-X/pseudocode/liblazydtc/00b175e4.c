/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b175e4
 */

undefined8
OSSL_HTTP_REQ_CTX_set_expected(uint *param_1,char *param_2,uint param_3,int param_4,uint param_5)

{
  undefined4 uVar1;
  char *pcVar2;
  time_t tVar3;
  long lVar4;
  
  if (param_1 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0xf8,"OSSL_HTTP_REQ_CTX_set_expected");
    uVar1 = 0xc0102;
  }
  else {
    if ((param_5 == 0) || ((*param_1 & 0xfffffffe) == 0x1000)) {
      CRYPTO_free(*(void **)(param_1 + 0x1c));
      param_1[0x1c] = 0;
      param_1[0x1d] = 0;
      if (param_2 != (char *)0x0) {
        pcVar2 = CRYPTO_strdup(param_2,"crypto/http/http_client.c",0x105);
        *(char **)(param_1 + 0x1c) = pcVar2;
        if (pcVar2 == (char *)0x0) {
          return 0;
        }
      }
      param_1[0x1e] = param_3;
      if (param_4 < 0) {
        lVar4 = *(long *)(param_1 + 0x2c);
      }
      else if (param_4 == 0) {
        lVar4 = 0;
      }
      else {
        tVar3 = time((time_t *)0x0);
        lVar4 = tVar3 + param_4;
      }
      *(long *)(param_1 + 0x2a) = lVar4;
      param_1[0x28] = param_5;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0xfe,"OSSL_HTTP_REQ_CTX_set_expected");
    uVar1 = 0xc0101;
  }
  ERR_set_error(0x3d,uVar1,0);
  return 0;
}

