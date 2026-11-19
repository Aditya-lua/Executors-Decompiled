/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e227c
 */

undefined8 dtls1_set_handshake_header(long param_1,undefined8 param_2,int param_3)

{
  short sVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined1 auStack_18 [8];
  
  if (param_3 == 0x101) {
    lVar4 = *(long *)(param_1 + 0x4b8);
    *(undefined1 *)(lVar4 + 0x138) = 1;
    *(undefined8 *)(lVar4 + 0x140) = 0;
    *(undefined2 *)(lVar4 + 0x10c) = *(undefined2 *)(lVar4 + 0x10e);
    *(undefined2 *)(lVar4 + 0x148) = *(undefined2 *)(lVar4 + 0x10e);
    *(undefined8 *)(lVar4 + 0x150) = 0;
    *(undefined8 *)(lVar4 + 0x158) = 0;
    uVar3 = WPACKET_put_bytes__(param_2,1,1);
    iVar2 = (int)uVar3;
  }
  else {
    lVar4 = *(long *)(param_1 + 0x4b8);
    sVar1 = *(short *)(lVar4 + 0x10e);
    *(char *)(lVar4 + 0x138) = (char)param_3;
    *(undefined8 *)(lVar4 + 0x140) = 0;
    *(short *)(lVar4 + 0x10c) = sVar1;
    *(short *)(lVar4 + 0x148) = sVar1;
    *(short *)(lVar4 + 0x10e) = sVar1 + 1;
    *(undefined8 *)(lVar4 + 0x150) = 0;
    *(undefined8 *)(lVar4 + 0x158) = 0;
    uVar3 = WPACKET_allocate_bytes(param_2,0xc,auStack_18);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
    uVar3 = WPACKET_start_sub_packet(param_2);
    iVar2 = (int)uVar3;
  }
  if (iVar2 != 0) {
    uVar3 = 1;
  }
  return uVar3;
}

