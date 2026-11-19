/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a0c08
 */

/* WebSocketHandshakeKeyGen::static_for<3, WebSocketHandshakeKeyGen::Sha1Loop<3>
   >::TEMPNAMEPLACEHOLDERVALUE(unsigned int*, unsigned int*) */

void __thiscall
WebSocketHandshakeKeyGen::static_for<3,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator()
          (static_for<3,WebSocketHandshakeKeyGen::Sha1Loop<3>> *this,uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = param_2[0xc] ^ param_2[1] ^ param_2[6] ^ param_2[4];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[4] = uVar2;
  uVar1 = param_1[3];
  param_1[3] = uVar1 >> 2 | uVar1 << 0x1e;
  *param_1 = uVar2 + (param_1[2] ^ uVar1 ^ param_1[1]) + *param_1 +
             (param_1[4] >> 0x1b | param_1[4] << 5) + 0x6ed9eba1;
  uVar1 = param_2[0xd] ^ param_2[2] ^ param_2[7] ^ param_2[5];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[5] = uVar2;
  uVar1 = param_1[4];
  param_1[4] = uVar1 >> 2 | uVar1 << 0x1e;
  param_1[1] = uVar2 + (param_1[3] ^ uVar1 ^ param_1[2]) + param_1[1] +
               (*param_1 >> 0x1b | *param_1 << 5) + 0x6ed9eba1;
  uVar1 = param_2[0xe] ^ param_2[3] ^ param_2[8] ^ param_2[6];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[6] = uVar2;
  uVar1 = *param_1;
  param_1[2] = uVar2 + (param_1[4] ^ uVar1 ^ param_1[3]) + param_1[2] +
               (param_1[1] >> 0x1b | param_1[1] << 5) + 0x6ed9eba1;
  *param_1 = uVar1 >> 2 | uVar1 << 0x1e;
  return;
}

