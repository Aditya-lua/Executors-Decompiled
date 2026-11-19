/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a1788
 */

/* WebSocketHandshakeKeyGen::static_for<15, WebSocketHandshakeKeyGen::Sha1Loop<5>
   >::TEMPNAMEPLACEHOLDERVALUE(unsigned int*, unsigned int*) */

void __thiscall
WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator()
          (static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<5>> *this,uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<5>> asStack_40 [8];
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator()(asStack_40,param_1,param_2);
  uVar1 = param_2[0xf] ^ param_2[4] ^ param_2[9] ^ param_2[7];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[7] = uVar2;
  uVar1 = param_1[4];
  param_1[4] = uVar1 >> 2 | uVar1 << 0x1e;
  param_1[1] = uVar2 + (param_1[3] ^ uVar1 ^ param_1[2]) + param_1[1] +
               (*param_1 >> 0x1b | *param_1 << 5) + 0xca62c1d6;
  uVar1 = *param_2 ^ param_2[5] ^ param_2[10] ^ param_2[8];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[8] = uVar2;
  uVar1 = *param_1;
  *param_1 = uVar1 >> 2 | uVar1 << 0x1e;
  param_1[2] = uVar2 + (param_1[4] ^ uVar1 ^ param_1[3]) + param_1[2] +
               (param_1[1] >> 0x1b | param_1[1] << 5) + 0xca62c1d6;
  uVar1 = param_2[1] ^ param_2[6] ^ param_2[0xb] ^ param_2[9];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[9] = uVar2;
  uVar1 = param_1[1];
  param_1[1] = uVar1 >> 2 | uVar1 << 0x1e;
  param_1[3] = uVar2 + (*param_1 ^ uVar1 ^ param_1[4]) + param_1[3] +
               (param_1[2] >> 0x1b | param_1[2] << 5) + 0xca62c1d6;
  uVar1 = param_2[2] ^ param_2[7] ^ param_2[0xc] ^ param_2[10];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[10] = uVar2;
  uVar1 = param_1[2];
  param_1[2] = uVar1 >> 2 | uVar1 << 0x1e;
  param_1[4] = uVar2 + (param_1[1] ^ uVar1 ^ *param_1) + param_1[4] +
               (param_1[3] >> 0x1b | param_1[3] << 5) + 0xca62c1d6;
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

