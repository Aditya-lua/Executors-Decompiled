/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008da370
 */

int LZ4_decoderRingBufferSize(uint param_1)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = param_1;
  if (param_1 < 0x11) {
    uVar2 = 0x10;
  }
  iVar1 = 0;
  if (param_1 < 0x7e000001) {
    iVar1 = uVar2 + 0x1000e;
  }
  return iVar1;
}

