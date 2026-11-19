/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09b70
 */

undefined8 X509_CRL_check_suiteb(long param_1,undefined8 param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  ulong local_18;
  
  if ((param_3 & 0x30000) == 0) {
    uVar2 = 0;
  }
  else {
    local_18 = param_3;
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 8));
    uVar2 = FUN_00b09a98(param_2,iVar1,&local_18);
  }
  return uVar2;
}

