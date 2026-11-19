/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5c808
 */

undefined8 EVP_CIPHER_CTX_set_params(long *param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if ((*param_1 == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0xe0), UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return 0;
  }
  *(undefined4 *)((long)param_1 + 0x6c) = 0xffffffff;
                    /* WARNING: Could not recover jumptable at 0x00a5c828. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(param_1[0x15]);
  return uVar1;
}

