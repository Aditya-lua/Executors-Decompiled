/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0d08
 */

undefined8 ssl_load_groups(undefined8 *param_1)

{
  undefined8 uVar1;
  void *__dest;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  short *psVar5;
  long lVar6;
  short local_54 [18];
  
  uVar1 = OSSL_PROVIDER_do_all(*param_1,FUN_009c0e20,param_1);
  if ((int)uVar1 != 0) {
    uVar3 = param_1[0xc6];
    lVar6 = 0;
    lVar2 = 0;
    do {
      if (uVar3 != 0) {
        uVar4 = 0;
        psVar5 = (short *)(param_1[0xc5] + 0x1c);
        do {
          if (*psVar5 == (&DAT_0074cc10)[lVar2]) {
            local_54[lVar6] = (&DAT_0074cc10)[lVar2];
            lVar6 = lVar6 + 1;
            break;
          }
          uVar4 = uVar4 + 1;
          psVar5 = psVar5 + 0x1c;
        } while (uVar4 < uVar3);
      }
      lVar2 = lVar2 + 1;
    } while (lVar2 != 0x11);
    if (lVar6 != 0) {
      __dest = CRYPTO_malloc((int)(lVar6 << 1),"ssl/t1_lib.c",0x19b);
      param_1[0x51] = __dest;
      if (__dest == (void *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/t1_lib.c",0x19e,"ssl_load_groups");
        ERR_set_error(0x14,0xc0100,0);
        return 0;
      }
      memcpy(__dest,local_54,lVar6 << 1);
      param_1[0x52] = lVar6;
    }
    uVar1 = 1;
  }
  return uVar1;
}

