/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed088
 */

undefined8
FUN_009ed088(code *param_1,undefined8 param_2,undefined8 param_3,uint param_4,ulong param_5)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  uint uVar4;
  
  if (0 < (int)param_4) {
    uVar4 = 0;
    do {
      iVar1 = (*param_1)(param_2,&DAT_002a19a2,1);
      if (iVar1 == 0) {
        return 0xffffffff;
      }
      uVar4 = uVar4 + 1;
    } while (uVar4 < (param_4 & ((int)param_4 >> 0x1f ^ 0xffffffffU)));
  }
  uVar3 = (param_5 & 0xf0000) - 0x10000 >> 0x10;
  if (uVar3 < 4) {
                    /* WARNING: Jumptable with 0 entries at 0x009ed134 */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (*(code *)(&DAT_0074dd50 + *(int *)(&DAT_0074dd50 + uVar3 * 4)))();
    return uVar2;
  }
  return 0xffffffff;
}

