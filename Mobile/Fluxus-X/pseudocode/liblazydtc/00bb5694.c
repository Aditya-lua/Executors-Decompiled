/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb5694
 */

bool HUF_selectDecoder(ulong param_1,ulong param_2)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  
  if (param_2 < param_1) {
    uVar3 = 0;
    if (param_1 != 0) {
      uVar3 = (param_2 << 4) / param_1;
    }
    uVar3 = uVar3 & 0xffffffff;
  }
  else {
    uVar3 = 0xf;
  }
  lVar1 = uVar3 * 0x10;
  iVar4 = (int)(param_1 >> 8);
  uVar2 = *(int *)(&DAT_007891b4 + lVar1) + *(int *)(&DAT_007891b8 + lVar1) * iVar4;
  return uVar2 + (uVar2 >> 5) <
         (uint)(*(int *)(&DAT_007891ac + lVar1) + *(int *)(&DAT_007891b0 + lVar1) * iVar4);
}

