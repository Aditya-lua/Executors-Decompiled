/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55980
 */

bool FUN_00b55980(long param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    *(undefined4 *)(param_1 + 8) = 1;
    Poly1305_Final(param_1 + 0x10,param_2);
    *param_3 = 0x10;
  }
  return iVar1 != 0;
}

