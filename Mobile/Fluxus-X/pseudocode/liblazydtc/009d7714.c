/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d7714
 */

undefined8 tls_parse_ctos_psk_kex_modes(long param_1,long *param_2)

{
  byte bVar1;
  byte *pbVar2;
  long lVar3;
  uint uVar4;
  
  lVar3 = param_2[1];
  if (lVar3 != 0) {
    pbVar2 = (byte *)*param_2;
    bVar1 = *pbVar2;
    if (lVar3 - 1U == (ulong)bVar1) {
      *param_2 = (long)(pbVar2 + lVar3);
      param_2[1] = 0;
      if (bVar1 != 0) {
        lVar3 = 1 - lVar3;
        do {
          pbVar2 = pbVar2 + 1;
          if (*pbVar2 == 0) {
            if ((*(byte *)(param_1 + 0x9e9) >> 2 & 1) != 0) {
              uVar4 = *(uint *)(param_1 + 0xb28) | 1;
              goto LAB_009d7784;
            }
          }
          else if (*pbVar2 == 1) {
            uVar4 = *(uint *)(param_1 + 0xb28) | 2;
LAB_009d7784:
            *(uint *)(param_1 + 0xb28) = uVar4;
          }
          lVar3 = lVar3 + 1;
          if (lVar3 == 0) {
            return 1;
          }
        } while( true );
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_srvr.c",0x225,"tls_parse_ctos_psk_kex_modes");
  ossl_statem_fatal(param_1,0x32,0x6e,0);
  return 0;
}

