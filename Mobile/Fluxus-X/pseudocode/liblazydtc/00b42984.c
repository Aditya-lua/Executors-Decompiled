/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42984
 */

void ossl_prov_free_key(int *param_1,undefined8 param_2)

{
  int iVar1;
  int *piVar2;
  
  iVar1 = *param_1;
  piVar2 = param_1 + 2;
  while( true ) {
    if (iVar1 == 0) {
      return;
    }
    if (iVar1 == 10) break;
    iVar1 = piVar2[2];
    piVar2 = piVar2 + 4;
  }
  if (*(code **)piVar2 == (code *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00b429b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)piVar2)(param_2);
  return;
}

