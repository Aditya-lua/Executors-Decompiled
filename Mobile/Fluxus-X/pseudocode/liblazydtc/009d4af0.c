/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d4af0
 */

undefined8
tls_parse_stoc_sct(long param_1,long *param_2,uint param_3,undefined8 param_4,undefined8 param_5)

{
  void *__dest;
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  ulong __n;
  
  if (param_3 != 0x4000) {
    if (*(long *)(param_1 + 0xb68) == 0) {
      lVar1 = custom_ext_find(*(long *)(param_1 + 0x898) + 0x1d8,(param_3 >> 7 ^ 0xffffffff) & 2,
                              0x12,0);
      if (lVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_clnt.c",0x5c1,"tls_parse_stoc_sct");
        uVar2 = 0x6e;
        uVar3 = 0x6e;
        goto LAB_009d4c44;
      }
      uVar2 = custom_ext_parse(param_1,param_3,0x12,*param_2,param_2[1],param_4,param_5);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    else {
      __n = param_2[1];
      CRYPTO_free(*(void **)(param_1 + 0xa68));
      *(undefined8 *)(param_1 + 0xa68) = 0;
      *(short *)(param_1 + 0xa70) = (short)__n;
      if (__n != 0) {
        __dest = CRYPTO_malloc((int)__n,"ssl/statem/extensions_clnt.c",0x5ab);
        *(void **)(param_1 + 0xa68) = __dest;
        if (__dest == (void *)0x0) {
          *(undefined2 *)(param_1 + 0xa70) = 0;
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_clnt.c",0x5ae,"tls_parse_stoc_sct");
          uVar2 = 0x50;
          uVar3 = 0xc0100;
        }
        else {
          if (__n <= (ulong)param_2[1]) {
            memcpy(__dest,(void *)*param_2,__n);
            *param_2 = *param_2 + __n;
            param_2[1] = param_2[1] - __n;
            return 1;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_clnt.c",0x5b2,"tls_parse_stoc_sct");
          uVar3 = 0xc0103;
          uVar2 = 0x50;
        }
LAB_009d4c44:
        ossl_statem_fatal(param_1,uVar2,uVar3,0);
        return 0;
      }
    }
  }
  return 1;
}

