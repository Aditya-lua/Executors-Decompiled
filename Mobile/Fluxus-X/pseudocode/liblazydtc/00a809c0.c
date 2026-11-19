/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a809c0
 */

long ossl_decode_der_dsa_sig(undefined8 param_1,undefined8 param_2,long *param_3,long param_4)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  char *pcVar4;
  char *local_40;
  ulong local_38;
  
  if ((0 < param_4) && (param_4 != 1)) {
    local_40 = (char *)*param_3;
    if (*local_40 != '0') {
      return 0;
    }
    bVar1 = local_40[1];
    local_38 = (ulong)bVar1;
    if ((char)bVar1 < '\0') {
      if (bVar1 == 0x82) {
        if (param_4 - 2U < 2) {
          return 0;
        }
        local_38 = (ulong)CONCAT11(local_40[2],local_40[3]);
        if (param_4 - 4U < local_38) {
          return 0;
        }
        local_40 = local_40 + 4;
      }
      else {
        if (bVar1 != 0x81) {
          return 0;
        }
        if (param_4 == 2) {
          return 0;
        }
        local_38 = (ulong)(byte)local_40[2];
        if (param_4 - 3U < local_38) {
          return 0;
        }
        local_40 = local_40 + 3;
      }
      pcVar4 = local_40 + local_38;
    }
    else {
      if (param_4 - 2U < local_38) {
        return 0;
      }
      local_40 = local_40 + 2;
      pcVar4 = local_40 + local_38;
    }
    iVar2 = ossl_decode_der_integer(&local_40,param_1);
    if ((iVar2 != 0) && (iVar2 = ossl_decode_der_integer(&local_40,param_2), iVar2 != 0)) {
      if (local_38 == 0) {
        lVar3 = *param_3;
        *param_3 = (long)pcVar4;
        return (long)pcVar4 - lVar3;
      }
      return 0;
    }
  }
  return 0;
}

