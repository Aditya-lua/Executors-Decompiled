/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51518
 */

bool FUN_00b51518(long param_1,uint param_2)

{
  bool bVar1;
  int iVar2;
  
  iVar2 = ossl_prov_is_running();
  bVar1 = false;
  if ((param_1 != 0) && (iVar2 != 0)) {
    if ((param_2 & 1) == 0) {
      bVar1 = true;
    }
    else {
      bVar1 = *(long *)(param_1 + 0x18) != 0;
    }
  }
  return bVar1;
}

