/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58d68
 */

undefined8 EVP_MD_CTX_gettable_params(long param_1)

{
  undefined8 uVar1;
  int *piVar2;
  
  if (param_1 != 0) {
    piVar2 = *(int **)(param_1 + 0x28);
    if ((piVar2 != (int *)0x0) &&
       (((*piVar2 == 0x100 || (*piVar2 == 0x80)) && (*(long *)(piVar2 + 0xc) != 0)))) {
      if (*(code **)(*(long *)(piVar2 + 10) + 0xe0) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a58db4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar1 = (**(code **)(*(long *)(piVar2 + 10) + 0xe0))();
        return uVar1;
      }
    }
    if ((*(long *)(param_1 + 8) != 0) && (*(long *)(*(long *)(param_1 + 8) + 0xe8) != 0)) {
      EVP_MD_get0_provider();
      uVar1 = ossl_provider_ctx();
                    /* WARNING: Could not recover jumptable at 0x00a58dec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*(long *)(param_1 + 8) + 0xe8))(*(undefined8 *)(param_1 + 0x38),uVar1);
      return uVar1;
    }
  }
  return 0;
}

