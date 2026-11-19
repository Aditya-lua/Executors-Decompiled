/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c504
 */

undefined8 EVP_PKEY_parameters_eq(int *param_1,int *param_2)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if ((*(long *)(param_1 + 0x18) != 0) || (*(long *)(param_2 + 0x18) != 0)) {
    uVar1 = FUN_00a6c90c(param_1,param_2,4);
    return uVar1;
  }
  if (*param_1 != *param_2) {
    return 0xffffffff;
  }
  if ((*(long *)(param_1 + 2) == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 2) + 0x90),
     UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return 0xfffffffe;
  }
                    /* WARNING: Could not recover jumptable at 0x00a6c53c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}

