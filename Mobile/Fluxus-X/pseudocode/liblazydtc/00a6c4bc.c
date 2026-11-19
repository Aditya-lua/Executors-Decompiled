/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c4bc
 */

int EVP_PKEY_missing_parameters(EVP_PKEY *pkey)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if (pkey != (EVP_PKEY *)0x0) {
    if (*(long *)&pkey[1].save_parameters != 0) {
      iVar1 = evp_keymgmt_util_has(pkey,4);
      return (int)(iVar1 == 0);
    }
    if ((*(long *)&pkey->references != 0) &&
       (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)&pkey->references + 0x80),
       UNRECOVERED_JUMPTABLE != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00a6c4f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar1 = (*UNRECOVERED_JUMPTABLE)();
      return iVar1;
    }
  }
  return 0;
}

