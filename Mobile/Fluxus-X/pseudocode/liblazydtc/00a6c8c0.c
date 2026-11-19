/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c8c0
 */

int EVP_PKEY_cmp_parameters(EVP_PKEY *a,EVP_PKEY *b)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if ((*(long *)&a[1].save_parameters != 0) || (*(long *)&b[1].save_parameters != 0)) {
    iVar1 = FUN_00a6c90c(a,b,4);
    return iVar1;
  }
  if (a->type != b->type) {
    return -1;
  }
  if ((*(long *)&a->references == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)&a->references + 0x90),
     UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return -2;
  }
                    /* WARNING: Could not recover jumptable at 0x00a6c8f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

