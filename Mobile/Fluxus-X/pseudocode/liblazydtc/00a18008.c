/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18008
 */

ulong FUN_00a18008(long param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = ossl_ffc_params_cmp(*(long *)(param_1 + 0x20) + 8,*(long *)(param_2 + 0x20) + 8,
                              *(undefined1 **)(param_1 + 8) != ossl_dhx_asn1_meth);
  if ((int)uVar2 != 0) {
    iVar1 = BN_cmp(*(BIGNUM **)(*(long *)(param_2 + 0x20) + 0x70),
                   *(BIGNUM **)(*(long *)(param_1 + 0x20) + 0x70));
    uVar2 = (ulong)(iVar1 == 0);
  }
  return uVar2;
}

