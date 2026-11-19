/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8fd34
 */

void Camellia_DecryptBlock(int param_1)

{
  undefined4 uVar1;
  
  uVar1 = 3;
  if (param_1 != 0x80) {
    uVar1 = 4;
  }
  Camellia_DecryptBlock_Rounds(uVar1);
  return;
}

