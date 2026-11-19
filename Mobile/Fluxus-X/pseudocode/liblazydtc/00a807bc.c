/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a807bc
 */

undefined8 ossl_decode_der_length(long *param_1,undefined8 *param_2)

{
  byte bVar1;
  byte *pbVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  
  lVar3 = param_1[1];
  if (lVar3 == 0) {
    return 0;
  }
  pbVar2 = (byte *)*param_1;
  uVar6 = lVar3 - 1;
  bVar1 = *pbVar2;
  uVar5 = (ulong)bVar1;
  *param_1 = (long)(pbVar2 + 1);
  param_1[1] = uVar6;
  if ((char)bVar1 < '\0') {
    if (bVar1 == 0x82) {
      if (uVar6 < 2) {
        return 0;
      }
      uVar5 = (ulong)CONCAT11(pbVar2[1],pbVar2[2]);
      lVar4 = (lVar3 - 3U) - uVar5;
      if (lVar3 - 3U < uVar5) {
        return 0;
      }
      pbVar2 = pbVar2 + 3;
    }
    else {
      if (bVar1 != 0x81) {
        return 0;
      }
      if (uVar6 == 0) {
        return 0;
      }
      uVar5 = (ulong)pbVar2[1];
      lVar4 = (lVar3 - 2U) - uVar5;
      if (lVar3 - 2U < uVar5) {
        return 0;
      }
      pbVar2 = pbVar2 + 2;
    }
    *param_1 = (long)(pbVar2 + uVar5);
    param_1[1] = lVar4;
    *param_2 = pbVar2;
    param_2[1] = uVar5;
  }
  else {
    if (uVar6 < uVar5) {
      return 0;
    }
    *param_2 = pbVar2 + 1;
    param_2[1] = uVar5;
    *param_1 = *param_1 + uVar5;
    param_1[1] = param_1[1] - uVar5;
  }
  return 1;
}

