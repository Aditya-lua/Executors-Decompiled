/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d47ec
 */

undefined8 tls_parse_stoc_ec_pt_formats(long param_1,long *param_2)

{
  byte bVar1;
  void *__dest;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  byte *pbVar5;
  size_t __n;
  
  lVar4 = param_2[1];
  if (lVar4 != 0) {
    pbVar5 = (byte *)*param_2;
    __n = lVar4 - 1;
    bVar1 = *pbVar5;
    if (__n == bVar1) {
      *param_2 = (long)(pbVar5 + lVar4);
      param_2[1] = 0;
      if (*(int *)(param_1 + 0x4d0) != 0) {
        return 1;
      }
      if (bVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_clnt.c",0x538,"tls_parse_stoc_ec_pt_formats");
        uVar2 = 0x32;
        uVar3 = 0x10f;
      }
      else {
        *(undefined8 *)(param_1 + 0xab0) = 0;
        CRYPTO_free(*(void **)(param_1 + 0xab8));
        __dest = CRYPTO_malloc((int)__n,"ssl/statem/extensions_clnt.c",0x53e);
        *(void **)(param_1 + 0xab8) = __dest;
        if (__dest != (void *)0x0) {
          *(size_t *)(param_1 + 0xab0) = __n;
          memcpy(__dest,pbVar5 + 1,__n);
          return 1;
        }
        *(undefined8 *)(param_1 + 0xab0) = 0;
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_clnt.c",0x541,"tls_parse_stoc_ec_pt_formats");
        uVar2 = 0x50;
        uVar3 = 0xc0103;
      }
      goto LAB_009d485c;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_clnt.c",0x532,"tls_parse_stoc_ec_pt_formats");
  uVar2 = 0x32;
  uVar3 = 0x6e;
LAB_009d485c:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

