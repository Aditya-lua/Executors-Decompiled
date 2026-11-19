/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1441c
 */

undefined8 FUN_00c1441c(long *param_1,long *param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  
  pbVar1 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  *param_2 = 0;
  if ((pbVar2 == pbVar1) || (*pbVar1 - 0x3a < 0xfffffff6)) {
    return 1;
  }
  if (*pbVar1 - 0x30 < 10) {
    lVar4 = 0;
    do {
      pbVar3 = pbVar1 + 1;
      *param_1 = (long)pbVar3;
      *param_2 = lVar4 * 10;
      lVar4 = (ulong)*pbVar1 + lVar4 * 10 + -0x30;
      *param_2 = lVar4;
      if (pbVar3 == pbVar2) {
        return 0;
      }
      pbVar1 = pbVar3;
    } while (*pbVar3 - 0x30 < 10);
  }
  return 0;
}

