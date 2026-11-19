/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa094
 */

bool X509v3_asid_inherits(undefined8 *param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 != (undefined8 *)0x0) {
    if (((int *)*param_1 != (int *)0x0) && (*(int *)*param_1 == 0)) {
      return true;
    }
    if ((int *)param_1[1] == (int *)0x0) {
      return false;
    }
    bVar1 = *(int *)param_1[1] == 0;
  }
  return bVar1;
}

