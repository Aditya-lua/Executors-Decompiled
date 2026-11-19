/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b746fc
 */

void mbedtls_des_key_set_parity(byte *param_1)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  
  bVar1 = (&DAT_0077e7c0)[param_1[1] >> 1];
  bVar2 = (&DAT_0077e7c0)[param_1[2] >> 1];
  bVar3 = (&DAT_0077e7c0)[param_1[3] >> 1];
  bVar4 = (&DAT_0077e7c0)[param_1[4] >> 1];
  bVar5 = (&DAT_0077e7c0)[param_1[5] >> 1];
  bVar6 = (&DAT_0077e7c0)[param_1[6] >> 1];
  bVar7 = (&DAT_0077e7c0)[param_1[7] >> 1];
  *param_1 = (&DAT_0077e7c0)[*param_1 >> 1];
  param_1[1] = bVar1;
  param_1[2] = bVar2;
  param_1[3] = bVar3;
  param_1[4] = bVar4;
  param_1[5] = bVar5;
  param_1[6] = bVar6;
  param_1[7] = bVar7;
  return;
}

