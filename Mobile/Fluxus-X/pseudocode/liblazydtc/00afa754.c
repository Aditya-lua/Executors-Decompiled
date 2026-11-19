/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa754
 */

undefined8 X509v3_asid_validate_resource_set(long param_1,undefined8 *param_2,int param_3)

{
  undefined8 uVar1;
  
  if (param_2 == (undefined8 *)0x0) {
    uVar1 = 1;
  }
  else {
    if (param_1 != 0) {
      uVar1 = OPENSSL_sk_num(param_1);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      if ((param_3 != 0) ||
         ((((int *)*param_2 == (int *)0x0 || (*(int *)*param_2 != 0)) &&
          (((int *)param_2[1] == (int *)0x0 || (*(int *)param_2[1] != 0)))))) {
        uVar1 = FUN_00afa314(0,param_1,param_2);
        return uVar1;
      }
    }
    uVar1 = 0;
  }
  return uVar1;
}

