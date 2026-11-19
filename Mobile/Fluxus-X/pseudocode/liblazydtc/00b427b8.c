/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b427b8
 */

undefined8 ossl_prov_get_keymgmt_new(int *param_1)

{
  int iVar1;
  int *piVar2;
  
  iVar1 = *param_1;
  piVar2 = param_1 + 2;
  while( true ) {
    if (iVar1 == 0) {
      return 0;
    }
    if (iVar1 == 1) break;
    iVar1 = piVar2[2];
    piVar2 = piVar2 + 4;
  }
  return *(undefined8 *)piVar2;
}

