/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63e10
 */

bool EVP_KEYEXCH_is_a(undefined4 *param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  
  bVar1 = false;
  if (param_1 != (undefined4 *)0x0) {
    iVar2 = evp_is_a(*(undefined8 *)(param_1 + 6),*param_1,0,param_2);
    bVar1 = iVar2 != 0;
  }
  return bVar1;
}

