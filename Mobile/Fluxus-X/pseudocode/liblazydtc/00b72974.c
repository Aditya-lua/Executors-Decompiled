/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b72974
 */

undefined8
mbedtls_camellia_crypt_ctr
          (undefined8 param_1,long param_2,ulong *param_3,long param_4,long param_5,byte *param_6,
          byte *param_7)

{
  byte *pbVar1;
  char cVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  
  uVar5 = *param_3;
  if (uVar5 < 0x10) {
    while (param_2 != 0) {
      param_2 = param_2 + -1;
      if (uVar5 == 0) {
        mbedtls_camellia_crypt_ecb(param_1,1,param_4,param_5);
        lVar4 = 0xf;
        do {
          if (lVar4 == -1) break;
          cVar2 = *(char *)(param_4 + lVar4) + '\x01';
          *(char *)(param_4 + lVar4) = cVar2;
          lVar4 = lVar4 + -1;
        } while (cVar2 == '\0');
      }
      pbVar1 = (byte *)(param_5 + uVar5);
      uVar5 = (ulong)((int)uVar5 + 1) & 0xf;
      *param_7 = *pbVar1 ^ *param_6;
      param_7 = param_7 + 1;
      param_6 = param_6 + 1;
    }
    uVar3 = 0;
    *param_3 = uVar5;
  }
  else {
    uVar3 = 0xffffffdc;
  }
  return uVar3;
}

