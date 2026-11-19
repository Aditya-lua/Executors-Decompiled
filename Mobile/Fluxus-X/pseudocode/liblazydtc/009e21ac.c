/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e21ac
 */

void dtls1_set_message_header
               (long param_1,undefined1 param_2,undefined8 param_3,long param_4,undefined8 param_5)

{
  long lVar1;
  short sVar2;
  
  lVar1 = *(long *)(param_1 + 0x4b8);
  if (param_4 == 0) {
    sVar2 = *(short *)(lVar1 + 0x10e);
    *(short *)(lVar1 + 0x10c) = sVar2;
    *(short *)(lVar1 + 0x10e) = sVar2 + 1;
  }
  else {
    sVar2 = *(short *)(lVar1 + 0x10c);
  }
  *(undefined1 *)(lVar1 + 0x138) = param_2;
  *(undefined8 *)(lVar1 + 0x140) = param_3;
  *(short *)(lVar1 + 0x148) = sVar2;
  *(long *)(lVar1 + 0x150) = param_4;
  *(undefined8 *)(lVar1 + 0x158) = param_5;
  return;
}

