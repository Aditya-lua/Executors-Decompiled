/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a16bfc
 */

void DES_encrypt3(uint *data,DES_key_schedule *ks1,DES_key_schedule *ks2,DES_key_schedule *ks3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  
  uVar1 = (*data ^ data[1] >> 4) & 0xf0f0f0f;
  uVar2 = data[1] ^ uVar1 << 4;
  uVar1 = uVar1 ^ *data;
  uVar3 = uVar2 & 0xffff ^ uVar1 >> 0x10;
  uVar2 = uVar3 ^ uVar2;
  uVar1 = uVar1 ^ uVar3 << 0x10;
  uVar3 = (uVar1 ^ uVar2 >> 2) & 0x33333333;
  uVar1 = uVar3 ^ uVar1;
  uVar2 = uVar2 ^ uVar3 << 2;
  uVar3 = (uVar2 ^ uVar1 >> 8) & 0xff00ff;
  uVar2 = uVar3 ^ uVar2;
  uVar1 = uVar1 ^ uVar3 << 8;
  uVar3 = (uVar1 ^ uVar2 >> 1) & 0x55555555;
  *data = uVar3 ^ uVar1;
  data[1] = uVar2 ^ uVar3 << 1;
  DES_encrypt2(data,ks1,1);
  DES_encrypt2(data,ks2,0);
  DES_encrypt2(data,ks3,1);
  uVar1 = (*data ^ data[1] >> 1) & 0x55555555;
  uVar3 = uVar1 ^ *data;
  uVar2 = data[1] ^ uVar1 << 1;
  uVar1 = (uVar2 ^ uVar3 >> 8) & 0xff00ff;
  uVar2 = uVar1 ^ uVar2;
  uVar3 = uVar3 ^ uVar1 << 8;
  uVar1 = (uVar3 ^ uVar2 >> 2) & 0x33333333;
  uVar2 = uVar2 ^ uVar1 << 2;
  uVar1 = uVar1 ^ uVar3;
  uVar3 = uVar2 & 0xffff ^ uVar1 >> 0x10;
  uVar2 = uVar3 ^ uVar2;
  uVar1 = uVar1 ^ uVar3 << 0x10;
  uVar3 = (uVar1 ^ uVar2 >> 4) & 0xf0f0f0f;
  *data = uVar3 ^ uVar1;
  data[1] = uVar2 ^ uVar3 << 4;
  return;
}

