/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a596a0
 */

ulong ossl_ec_curve_name2nid(long param_1)

{
  int iVar1;
  ulong uVar2;
  uint *puVar3;
  
  uVar2 = 0;
  if ((param_1 != 0) && (uVar2 = ossl_ec_curve_nist2nid_int(), (int)uVar2 == 0)) {
    uVar2 = 0;
    puVar3 = &DAT_00c5d078;
    do {
      iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(puVar3 + -2),param_1);
      if (iVar1 == 0) {
        return (ulong)*puVar3;
      }
      uVar2 = uVar2 + 1;
      puVar3 = puVar3 + 4;
    } while (uVar2 < 0x52);
    uVar2 = 0;
  }
  return uVar2;
}

