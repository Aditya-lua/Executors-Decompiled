/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17580
 */

int DES_check_key_parity(const_DES_cblock *key)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  
  bVar1 = (*key)[0] ^ (*key)[0] >> 4;
  bVar2 = (*key)[1] ^ (*key)[1] >> 4;
  bVar1 = bVar1 ^ bVar1 >> 2;
  bVar2 = bVar2 ^ bVar2 >> 2;
  bVar3 = (*key)[2] ^ (*key)[2] >> 4;
  bVar3 = bVar3 ^ bVar3 >> 2;
  bVar4 = (*key)[3] ^ (*key)[3] >> 4;
  bVar4 = bVar4 ^ bVar4 >> 2;
  bVar5 = (*key)[4] ^ (*key)[4] >> 4;
  bVar5 = bVar5 ^ bVar5 >> 2;
  bVar6 = (*key)[5] ^ (*key)[5] >> 4;
  bVar6 = bVar6 ^ bVar6 >> 2;
  bVar7 = (*key)[6] ^ (*key)[6] >> 4;
  bVar8 = (*key)[7] ^ (*key)[7] >> 4;
  bVar7 = bVar7 ^ bVar7 >> 2;
  bVar8 = bVar8 ^ bVar8 >> 2;
  return (byte)((bVar7 ^ bVar7 >> 1) &
                (bVar6 ^ bVar6 >> 1) &
                (bVar5 ^ bVar5 >> 1) &
                (bVar3 ^ bVar3 >> 1) & (bVar2 ^ bVar2 >> 1) & (bVar1 ^ bVar1 >> 1) &
                (bVar4 ^ bVar4 >> 1) & (bVar8 ^ bVar8 >> 1)) & 1;
}

