/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b60a8
 */

undefined8 SSL_set_alpn_protos(long param_1,long param_2,uint param_3)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  
  if ((param_2 == 0) || (param_3 == 0)) {
    CRYPTO_free(*(void **)(param_1 + 0xb08));
    uVar3 = 0;
    *(undefined8 *)(param_1 + 0xb10) = 0;
    *(undefined8 *)(param_1 + 0xb08) = 0;
  }
  else {
    if (1 < param_3) {
      uVar4 = 0;
      do {
        if (*(byte *)(param_2 + uVar4) == 0) goto LAB_009b6188;
        uVar1 = (int)uVar4 + (uint)*(byte *)(param_2 + uVar4) + 1;
        uVar4 = (ulong)uVar1;
      } while (uVar1 < param_3);
      if (uVar1 == param_3) {
        lVar2 = CRYPTO_memdup(param_2,(ulong)param_3,"ssl/ssl_lib.c",0xc26);
        if (lVar2 != 0) {
          CRYPTO_free(*(void **)(param_1 + 0xb08));
          *(long *)(param_1 + 0xb08) = lVar2;
          *(ulong *)(param_1 + 0xb10) = (ulong)param_3;
          return 0;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0xc28,"SSL_set_alpn_protos");
        ERR_set_error(0x14,0xc0100,0);
      }
    }
LAB_009b6188:
    uVar3 = 1;
  }
  return uVar3;
}

