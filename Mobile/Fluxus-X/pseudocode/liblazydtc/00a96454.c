/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a96454
 */

void IDEA_encrypt(ulong *param_1,uint *param_2)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  uVar2 = *param_1 >> 0x10 & 0xffff;
  uVar4 = uVar2 * *param_2;
  if (uVar4 == 0) {
    uVar1 = (1 - *param_2) - (int)uVar2;
  }
  else {
    lVar3 = (uVar4 & 0xffff) - (uVar4 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = param_1[1] & 0xffff;
  uVar2 = *param_1 + (ulong)param_2[1];
  uVar6 = uVar5 * param_2[3];
  uVar4 = (param_1[1] >> 0x10) + (ulong)param_2[2];
  if (uVar6 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[3]);
  }
  else {
    uVar5 = (uVar6 & 0xffff) - (uVar6 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar4 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[4];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[4]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar2)) & 0xffff;
  uVar9 = uVar7 * param_2[5];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[5]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[6];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[6]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar4 = (uVar7 ^ uVar4) + (ulong)param_2[7];
  uVar9 = uVar5 * param_2[9];
  uVar2 = (uVar7 + uVar6 ^ uVar2) + (ulong)param_2[8];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[9]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar2 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[10];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[10]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar4)) & 0xffff;
  uVar9 = uVar7 * param_2[0xb];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0xb]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0xc];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0xc]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar2 = (uVar7 ^ uVar2) + (ulong)param_2[0xd];
  uVar9 = uVar5 * param_2[0xf];
  uVar4 = (uVar7 + uVar6 ^ uVar4) + (ulong)param_2[0xe];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0xf]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar4 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x10];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x10]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar2)) & 0xffff;
  uVar9 = uVar7 * param_2[0x11];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x11]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x12];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0x12]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar4 = (uVar7 ^ uVar4) + (ulong)param_2[0x13];
  uVar9 = uVar5 * param_2[0x15];
  uVar2 = (uVar7 + uVar6 ^ uVar2) + (ulong)param_2[0x14];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x15]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar2 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x16];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x16]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar4)) & 0xffff;
  uVar9 = uVar7 * param_2[0x17];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x17]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x18];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0x18]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar2 = (uVar7 ^ uVar2) + (ulong)param_2[0x19];
  uVar9 = uVar5 * param_2[0x1b];
  uVar4 = (uVar7 + uVar6 ^ uVar4) + (ulong)param_2[0x1a];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x1b]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar4 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x1c];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x1c]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar2)) & 0xffff;
  uVar9 = uVar7 * param_2[0x1d];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x1d]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x1e];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0x1e]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar4 = (uVar7 ^ uVar4) + (ulong)param_2[0x1f];
  uVar9 = uVar5 * param_2[0x21];
  uVar2 = (uVar7 + uVar6 ^ uVar2) + (ulong)param_2[0x20];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x21]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar2 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x22];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x22]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar4)) & 0xffff;
  uVar9 = uVar7 * param_2[0x23];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x23]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x24];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0x24]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar2 = (uVar7 ^ uVar2) + (ulong)param_2[0x25];
  uVar9 = uVar5 * param_2[0x27];
  uVar4 = (uVar7 + uVar6 ^ uVar4) + (ulong)param_2[0x26];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x27]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar4 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x28];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x28]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar2)) & 0xffff;
  uVar9 = uVar7 * param_2[0x29];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x29]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x2a];
  if (uVar8 == 0) {
    uVar1 = (1 - param_2[0x2a]) - (int)uVar9;
  }
  else {
    lVar3 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar1 = (int)lVar3 - (int)((ulong)lVar3 >> 0x10);
  }
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar4 = (uVar7 ^ uVar4) + (ulong)param_2[0x2b];
  uVar9 = uVar5 * param_2[0x2d];
  uVar2 = (uVar7 + uVar6 ^ uVar2) + (ulong)param_2[0x2c];
  if (uVar9 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x2d]);
  }
  else {
    uVar5 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  uVar6 = (ulong)((uint)uVar2 ^ uVar1) & 0xffff;
  uVar7 = uVar6 * param_2[0x2e];
  if (uVar7 == 0) {
    uVar6 = (ulong)((1 - (int)uVar6) - param_2[0x2e]);
  }
  else {
    uVar6 = (uVar7 & 0xffff) - (uVar7 >> 0x10);
    uVar6 = uVar6 - (uVar6 >> 0x10);
  }
  uVar7 = (ulong)((int)uVar6 + ((uint)uVar5 ^ (uint)uVar4)) & 0xffff;
  uVar9 = uVar7 * param_2[0x2f];
  if (uVar9 == 0) {
    uVar7 = (ulong)((1 - param_2[0x2f]) - (int)uVar7);
  }
  else {
    uVar7 = (uVar9 & 0xffff) - (uVar9 >> 0x10);
    uVar7 = uVar7 - (uVar7 >> 0x10);
  }
  uVar9 = (ulong)((uint)uVar7 ^ uVar1) & 0xffff;
  uVar8 = uVar9 * param_2[0x30];
  if (uVar8 == 0) {
    uVar9 = (ulong)((1 - param_2[0x30]) - (int)uVar9);
  }
  else {
    uVar9 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar9 = uVar9 - (uVar9 >> 0x10);
  }
  uVar1 = param_2[0x32];
  uVar5 = (uVar7 + uVar6 ^ uVar5) & 0xffff;
  uVar8 = uVar5 * param_2[0x33];
  if (uVar8 == 0) {
    uVar5 = (ulong)((1 - (int)uVar5) - param_2[0x33]);
  }
  else {
    uVar5 = (uVar8 & 0xffff) - (uVar8 >> 0x10);
    uVar5 = uVar5 - (uVar5 >> 0x10);
  }
  *param_1 = (uVar7 + uVar6 ^ uVar4) + (ulong)param_2[0x31] & 0xffff | (uVar9 & 0xffff) << 0x10;
  param_1[1] = uVar5 & 0xffff | ((uVar7 ^ uVar2) + (ulong)uVar1) * 0x10000 & 0xffff0000;
  return;
}

