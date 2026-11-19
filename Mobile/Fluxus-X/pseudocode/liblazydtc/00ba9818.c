/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9818
 */

undefined8
mbedtls_oid_get_oid_by_sig_alg(int param_1,int param_2,undefined8 *param_3,undefined8 *param_4)

{
  uint uVar1;
  undefined **ppuVar2;
  undefined *puVar3;
  ulong uVar4;
  undefined **ppuVar5;
  
  if (param_1 == 6) {
    if (param_2 != 0) {
      return 0xffffffd2;
    }
    ppuVar2 = &PTR_DAT_00cab640;
    puVar3 = &DAT_002cc9bd;
  }
  else {
    if (param_1 == 4) {
      uVar1 = param_2 - 5;
      if (6 < uVar1) {
        return 0xffffffd2;
      }
      if ((0x79U >> (ulong)(uVar1 & 0x1f) & 1) == 0) {
        return 0xffffffd2;
      }
      uVar4 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
      ppuVar2 = &PTR_DAT_00cac4e0;
      ppuVar5 = &PTR_PTR_00cac520;
    }
    else {
      if (param_1 != 1) {
        return 0xffffffd2;
      }
      uVar1 = param_2 - 3;
      if (8 < uVar1) {
        return 0xffffffd2;
      }
      if ((0x1e5U >> (ulong)(uVar1 & 0x1f) & 1) == 0) {
        return 0xffffffd2;
      }
      uVar4 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
      ppuVar2 = &PTR_DAT_00cac440;
      ppuVar5 = &PTR_PTR_00cac490;
    }
    puVar3 = *(undefined **)((long)ppuVar2 + uVar4);
    ppuVar2 = *(undefined ***)((long)ppuVar5 + uVar4);
  }
  *param_3 = puVar3;
  *param_4 = ppuVar2[1];
  return 0;
}

