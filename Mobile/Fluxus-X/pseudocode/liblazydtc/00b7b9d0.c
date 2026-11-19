/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b9d0
 */

long psa_status_to_mbedtls(int param_1,long param_2,ulong param_3,code *UNRECOVERED_JUMPTABLE)

{
  long lVar1;
  short *psVar2;
  ulong uVar3;
  
  if (param_3 != 0) {
    uVar3 = 0;
    psVar2 = (short *)(param_2 + 2);
    do {
      if (psVar2[-1] == param_1) {
        return (long)*psVar2;
      }
      uVar3 = uVar3 + 1;
      psVar2 = psVar2 + 2;
    } while (uVar3 < param_3);
  }
                    /* WARNING: Could not recover jumptable at 0x00b7b9f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar1 = (*UNRECOVERED_JUMPTABLE)();
  return lVar1;
}

