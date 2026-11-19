/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5700
 */

undefined8 tls_parse_stoc_cookie(long param_1,long *param_2)

{
  ulong uVar1;
  long lVar2;
  undefined1 *puVar3;
  
  if (1 < (ulong)param_2[1]) {
    puVar3 = (undefined1 *)*param_2;
    uVar1 = (ulong)CONCAT11(*puVar3,puVar3[1]);
    if (param_2[1] - 2U == uVar1) {
      *param_2 = (long)(puVar3 + 2 + uVar1);
      param_2[1] = 0;
      CRYPTO_free(*(void **)(param_1 + 0xb38));
      *(undefined8 *)(param_1 + 0xb40) = 0;
      *(undefined8 *)(param_1 + 0xb38) = 0;
      if (uVar1 == 0) {
        return 1;
      }
      lVar2 = CRYPTO_memdup(puVar3 + 2,uVar1,"include/internal/packet.h",0x1cf);
      *(long *)(param_1 + 0xb38) = lVar2;
      if (lVar2 != 0) {
        *(ulong *)(param_1 + 0xb40) = uVar1;
        return 1;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_clnt.c",0x75b,"tls_parse_stoc_cookie");
  ossl_statem_fatal(param_1,0x32,0x9f,0);
  return 0;
}

