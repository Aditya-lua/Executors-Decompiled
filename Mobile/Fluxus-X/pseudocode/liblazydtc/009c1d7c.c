/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1d7c
 */

undefined8 tls1_set_peer_legacy_sigalg(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined4 local_18 [2];
  
  lVar1 = ssl_cert_lookup_by_pkey(param_2,local_18);
  uVar2 = 0;
  if ((lVar1 != 0) && (lVar1 = FUN_009c1dc4(param_1,local_18[0]), uVar2 = 0, lVar1 != 0)) {
    *(long *)(param_1 + 0x3b0) = lVar1;
    uVar2 = 1;
  }
  return uVar2;
}

