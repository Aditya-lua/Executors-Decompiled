/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a0148
 */

/* WebSocketHandshakeKeyGen::static_for<15, WebSocketHandshakeKeyGen::Sha1Loop<1>
   >::TEMPNAMEPLACEHOLDERVALUE(unsigned int*, unsigned int*) */

void __thiscall
WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator()
          (static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<1>> *this,uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<1>> asStack_40 [8];
  long local_38;
  
  lVar7 = tpidr_el0;
  local_38 = *(long *)(lVar7 + 0x28);
  static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator()(asStack_40,param_1,param_2);
  uVar1 = param_1[3];
  uVar2 = param_1[4];
  uVar3 = param_1[2];
  uVar4 = *param_1;
  uVar5 = uVar2 >> 2 | uVar2 << 0x1e;
  uVar2 = param_2[0xb] + ((uVar3 ^ uVar1) & uVar2 ^ uVar3) + param_1[1] +
          (uVar4 >> 0x1b | uVar4 << 5) + 0x5a827999;
  param_1[4] = uVar5;
  param_1[1] = uVar2;
  uVar6 = uVar4 >> 2 | uVar4 << 0x1e;
  uVar3 = uVar3 + (uVar4 & (uVar5 ^ uVar1) ^ uVar1) + param_2[0xc] + (uVar2 >> 0x1b | uVar2 * 0x20)
          + 0x5a827999;
  *param_1 = uVar6;
  param_1[2] = uVar3;
  uVar4 = uVar2 >> 2 | uVar2 * 0x40000000;
  uVar2 = uVar1 + (uVar2 & (uVar6 ^ uVar5) ^ uVar5) + param_2[0xd] + (uVar3 >> 0x1b | uVar3 * 0x20)
          + 0x5a827999;
  param_1[1] = uVar4;
  param_1[3] = uVar2;
  uVar1 = param_2[0xe];
  param_1[2] = uVar3 >> 2 | uVar3 * 0x40000000;
  param_1[4] = uVar5 + ((uVar4 ^ uVar6) & uVar3 ^ uVar6) + uVar1 + (uVar2 >> 0x1b | uVar2 * 0x20) +
               0x5a827999;
  if (*(long *)(lVar7 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

