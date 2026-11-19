/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6480
 */

bool SSL_CTX_has_client_custom_ext(long param_1,uint param_2)

{
  ushort *puVar1;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = *(ulong *)(*(long *)(param_1 + 0x158) + 0x1e0);
  if (uVar2 != 0) {
    puVar1 = *(ushort **)(*(long *)(param_1 + 0x158) + 0x1d8);
    uVar3 = 0;
    do {
      if ((*puVar1 == param_2) && ((*(uint *)(puVar1 + 2) | 2) == 2)) goto LAB_009d64c4;
      uVar3 = uVar3 + 1;
      puVar1 = puVar1 + 0x1c;
    } while (uVar3 < uVar2);
  }
  puVar1 = (ushort *)0x0;
LAB_009d64c4:
  return puVar1 != (ushort *)0x0;
}

