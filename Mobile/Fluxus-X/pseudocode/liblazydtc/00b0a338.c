/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a338
 */

undefined8 X509_LOOKUP_by_subject_ex(long param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  long lVar2;
  
  if ((*(int *)(param_1 + 4) != 0) || (lVar2 = *(long *)(param_1 + 8), lVar2 == 0)) {
    return 0;
  }
  UNRECOVERED_JUMPTABLE = *(code **)(lVar2 + 0x50);
  if (*(code **)(lVar2 + 0x30) == (code *)0x0) {
    if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
      return 0;
    }
  }
  else if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00b0a360. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(lVar2 + 0x30))();
    return uVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a368. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}

