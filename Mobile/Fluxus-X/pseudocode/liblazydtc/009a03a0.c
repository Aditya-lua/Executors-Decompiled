/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a03a0
 */

/* WebSocketHandshakeKeyGen::static_for<7, WebSocketHandshakeKeyGen::Sha1Loop<1>
   >::TEMPNAMEPLACEHOLDERVALUE(unsigned int*, unsigned int*) */

void __thiscall
WebSocketHandshakeKeyGen::static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator()
          (static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<1>> *this,uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  
  uVar1 = param_1[2];
  uVar2 = param_1[3];
  uVar3 = param_1[1];
  uVar4 = param_1[4];
  uVar5 = uVar2 >> 2 | uVar2 << 0x1e;
  uVar2 = *param_2 + ((uVar3 ^ uVar1) & uVar2 ^ uVar3) + *param_1 + (uVar4 >> 0x1b | uVar4 << 5) +
          0x5a827999;
  param_1[3] = uVar5;
  *param_1 = uVar2;
  uVar6 = uVar4 >> 2 | uVar4 << 0x1e;
  uVar3 = uVar3 + (uVar4 & (uVar5 ^ uVar1) ^ uVar1) + param_2[1] + (uVar2 >> 0x1b | uVar2 * 0x20) +
          0x5a827999;
  param_1[4] = uVar6;
  param_1[1] = uVar3;
  uVar4 = uVar2 >> 2 | uVar2 * 0x40000000;
  uVar2 = uVar1 + (uVar2 & (uVar6 ^ uVar5) ^ uVar5) + param_2[2] + (uVar3 >> 0x1b | uVar3 * 0x20) +
          0x5a827999;
  *param_1 = uVar4;
  param_1[2] = uVar2;
  uVar7 = uVar3 >> 2 | uVar3 * 0x40000000;
  uVar3 = uVar5 + ((uVar4 ^ uVar6) & uVar3 ^ uVar6) + param_2[3] + (uVar2 >> 0x1b | uVar2 * 0x20) +
          0x5a827999;
  param_1[1] = uVar7;
  param_1[3] = uVar3;
  uVar5 = uVar2 >> 2 | uVar2 * 0x40000000;
  uVar2 = uVar6 + ((uVar7 ^ uVar4) & uVar2 ^ uVar4) + param_2[4] + (uVar3 >> 0x1b | uVar3 * 0x20) +
          0x5a827999;
  param_1[2] = uVar5;
  param_1[4] = uVar2;
  uVar1 = param_2[5];
  uVar6 = uVar3 >> 2 | uVar3 * 0x40000000;
  param_1[3] = uVar6;
  uVar3 = uVar4 + (uVar3 & (uVar5 ^ uVar7) ^ uVar7) + uVar1 + (uVar2 >> 0x1b | uVar2 * 0x20) +
          0x5a827999;
  *param_1 = uVar3;
  param_1[1] = uVar7 + param_2[6] + (uVar2 & (uVar6 ^ uVar5) ^ uVar5) +
               (uVar3 >> 0x1b | uVar3 * 0x20) + 0x5a827999;
  param_1[4] = uVar2 >> 2 | uVar2 * 0x40000000;
  return;
}

