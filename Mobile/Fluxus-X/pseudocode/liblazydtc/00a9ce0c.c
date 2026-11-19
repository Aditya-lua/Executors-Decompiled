/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ce0c
 */

undefined8 WPACKET_set_max_size(long param_1,ulong param_2)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  uVar5 = 0;
  plVar3 = *(long **)(param_1 + 0x28);
  if (*(long **)(param_1 + 0x28) != (long *)0x0) {
    do {
      plVar2 = plVar3;
      plVar3 = (long *)*plVar2;
    } while (plVar3 != (long *)0x0);
    uVar4 = plVar2[2];
    uVar1 = 8;
    if (uVar4 != 0) {
      uVar1 = uVar4;
    }
    if (((6 < uVar1 - 1) || (uVar5 = 0, param_2 <= (1L << ((uVar1 & 7) << 3)) + (uVar1 - 1))) &&
       (uVar5 = 0, *(ulong *)(param_1 + 0x18) <= param_2)) {
      uVar5 = 1;
      *(ulong *)(param_1 + 0x20) = param_2;
    }
  }
  return uVar5;
}

