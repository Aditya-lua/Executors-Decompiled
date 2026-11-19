/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c10abc
 */

undefined1  [16] FUN_00c10abc(long *param_1,ulong param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined1 auVar3 [16];
  
  auVar3._0_8_ = (byte *)*param_1;
  pbVar1 = (byte *)param_1[1];
  pbVar2 = auVar3._0_8_;
  if ((((param_2 & 1) != 0) && (auVar3._0_8_ != pbVar1)) && (*auVar3._0_8_ == 0x6e)) {
    pbVar2 = auVar3._0_8_ + 1;
    *param_1 = (long)pbVar2;
  }
  if ((pbVar1 == pbVar2) || (*pbVar2 - 0x3a < 0xfffffff6)) {
    return ZEXT816(0);
  }
  do {
    if (*pbVar2 - 0x3a < 0xfffffff6) goto LAB_00c10b40;
    pbVar2 = pbVar2 + 1;
    *param_1 = (long)pbVar2;
  } while (pbVar2 != pbVar1);
  pbVar2 = pbVar1;
LAB_00c10b40:
  auVar3._8_8_ = (long)pbVar2 - (long)auVar3._0_8_;
  return auVar3;
}

