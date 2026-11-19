/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b718
 */

undefined8 FUN_00b5b718(long param_1,void *param_2,ulong param_3,uint param_4)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_4 <= *(uint *)(param_1 + 0xc)) {
    uVar1 = 0;
    if (param_3 <= (ulong)(*(long *)(param_1 + 0x28) - *(long *)(param_1 + 0x30))) {
      memcpy(param_2,(void *)(*(long *)(param_1 + 0x18) + *(long *)(param_1 + 0x30)),param_3);
      uVar1 = 1;
      *(ulong *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + param_3;
    }
  }
  return uVar1;
}

