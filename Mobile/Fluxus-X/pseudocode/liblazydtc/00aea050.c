/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea050
 */

bool OSSL_STORE_eof(long *param_1)

{
  int iVar1;
  
  if ((param_1[1] == 0) || (iVar1 = (**(code **)(*param_1 + 0xb8))(param_1[2]), param_1[1] == 0)) {
    iVar1 = (**(code **)(*param_1 + 0x40))(param_1[2]);
  }
  return iVar1 != 0;
}

