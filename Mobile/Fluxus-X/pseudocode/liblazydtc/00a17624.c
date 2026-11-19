/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17624
 */

int DES_is_weak_key(const_DES_cblock *key)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  
  lVar3 = 0;
  uVar2 = 0;
  do {
    uVar1 = CRYPTO_memcmp(&DAT_00753040 + lVar3,key,8);
    lVar3 = lVar3 + 8;
    uVar2 = uVar2 | (int)(uVar1 - 1 & (uVar1 ^ 0xffffffff)) >> 0x1f;
  } while (lVar3 != 0x80);
  return uVar2 & 1;
}

