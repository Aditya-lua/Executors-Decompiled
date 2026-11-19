/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd9cc
 */

undefined1  [16] FUN_008dd9cc(long param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  bool bVar2;
  ulong *puVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  
  puVar3 = (ulong *)(param_1 + 0x7f8);
  uVar4 = 0x7f;
  do {
    uVar1 = param_2;
    if (0x3f < uVar4) {
      uVar1 = param_3;
    }
    if ((uVar1 >> (uVar4 & 0x3f) & 1) != 0) {
      param_2 = puVar3[-1] ^ param_2;
      param_3 = *puVar3 ^ param_3;
    }
    puVar3 = puVar3 + -2;
    bVar2 = uVar4 != 0;
    uVar4 = uVar4 - 1;
  } while (bVar2);
  auVar5._8_8_ = param_3;
  auVar5._0_8_ = param_2;
  return auVar5;
}

