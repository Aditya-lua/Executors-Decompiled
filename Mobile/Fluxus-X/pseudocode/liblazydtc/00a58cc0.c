/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58cc0
 */

undefined8 EVP_MD_CTX_get_params(long param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  int *piVar2;
  
  piVar2 = *(int **)(param_1 + 0x28);
  if (((piVar2 != (int *)0x0) &&
      (((*piVar2 == 0x100 || (*piVar2 == 0x80)) && (*(long *)(piVar2 + 0xc) != 0)))) &&
     (*(code **)(*(long *)(piVar2 + 10) + 0xd8) != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00a58cf4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*(long *)(piVar2 + 10) + 0xd8))(*(long *)(piVar2 + 0xc));
    return uVar1;
  }
  if ((*(long *)(param_1 + 8) == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 8) + 0xd0),
     UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a58d0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(*(undefined8 *)(param_1 + 0x38));
  return uVar1;
}

