/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b219a4
 */

undefined4 ossl_digest_md_to_nid(long param_1,long param_2,ulong param_3)

{
  int iVar1;
  undefined8 *puVar2;
  ulong uVar3;
  
  if ((param_1 != 0) && (param_3 != 0)) {
    uVar3 = 0;
    puVar2 = (undefined8 *)(param_2 + 8);
    do {
      iVar1 = EVP_MD_is_a(param_1,*puVar2);
      if (iVar1 != 0) {
        return *(undefined4 *)(puVar2 + -1);
      }
      uVar3 = uVar3 + 1;
      puVar2 = puVar2 + 2;
    } while (uVar3 < param_3);
  }
  return 0;
}

