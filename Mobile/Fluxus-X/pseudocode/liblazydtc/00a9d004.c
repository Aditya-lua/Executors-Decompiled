/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d004
 */

undefined8 WPACKET_get_length(long param_1,long *param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 != (long *)0x0) && (*(long *)(param_1 + 0x28) != 0)) {
    uVar1 = 1;
    *param_2 = *(long *)(param_1 + 0x18) - *(long *)(*(long *)(param_1 + 0x28) + 0x18);
  }
  return uVar1;
}

