/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17514
 */

void DES_set_odd_parity(DES_cblock *key)

{
  uchar uVar1;
  uchar uVar2;
  uchar uVar3;
  uchar uVar4;
  uchar uVar5;
  uchar uVar6;
  uchar uVar7;
  
  uVar1 = (&DAT_00752f40)[(*key)[1]];
  uVar2 = (&DAT_00752f40)[(*key)[2]];
  uVar3 = (&DAT_00752f40)[(*key)[3]];
  uVar4 = (&DAT_00752f40)[(*key)[4]];
  uVar5 = (&DAT_00752f40)[(*key)[5]];
  uVar6 = (&DAT_00752f40)[(*key)[6]];
  uVar7 = (&DAT_00752f40)[(*key)[7]];
  (*key)[0] = (&DAT_00752f40)[(*key)[0]];
  (*key)[1] = uVar1;
  (*key)[2] = uVar2;
  (*key)[3] = uVar3;
  (*key)[4] = uVar4;
  (*key)[5] = uVar5;
  (*key)[6] = uVar6;
  (*key)[7] = uVar7;
  return;
}

