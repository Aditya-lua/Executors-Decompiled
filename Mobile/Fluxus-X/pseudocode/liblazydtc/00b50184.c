/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50184
 */

bool FUN_00b50184(long param_1,uint param_2)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  
  iVar3 = ossl_prov_is_running();
  bVar2 = false;
  if ((param_1 != 0) && (iVar3 != 0)) {
    if ((param_2 >> 1 & 1) == 0) {
      bVar2 = true;
    }
    else {
      bVar2 = (bool)(*(byte *)(param_1 + 0x10) & 1);
    }
    if (((param_2 & 1) != 0) && (bVar1 = bVar2 != false, bVar2 = false, bVar1)) {
      bVar2 = *(long *)(param_1 + 0x50) != 0;
    }
  }
  return bVar2;
}

