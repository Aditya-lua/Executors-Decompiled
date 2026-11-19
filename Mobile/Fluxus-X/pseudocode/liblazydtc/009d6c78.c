/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6c78
 */

undefined8 tls_parse_ctos_srp(long param_1,long *param_2)

{
  void *pvVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  byte *pbVar5;
  size_t __n;
  
  lVar4 = param_2[1];
  if (lVar4 != 0) {
    pbVar5 = (byte *)*param_2;
    __n = lVar4 - 1;
    if (__n == *pbVar5) {
      *param_2 = (long)(pbVar5 + lVar4);
      param_2[1] = 0;
      pvVar1 = memchr(pbVar5 + 1,0,__n);
      if (pvVar1 == (void *)0x0) {
        CRYPTO_free(*(void **)(param_1 + 0xbf0));
        lVar4 = CRYPTO_strndup(pbVar5 + 1,__n,"include/internal/packet.h",0x1e6);
        *(long *)(param_1 + 0xbf0) = lVar4;
        if (lVar4 != 0) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0xd7,"tls_parse_ctos_srp");
        uVar2 = 0x50;
        uVar3 = 0xc0103;
        goto LAB_009d6cec;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_srvr.c",0xd2,"tls_parse_ctos_srp");
  uVar2 = 0x32;
  uVar3 = 0x6e;
LAB_009d6cec:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

