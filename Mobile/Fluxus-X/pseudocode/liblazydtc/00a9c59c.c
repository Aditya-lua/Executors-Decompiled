/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c59c
 */

undefined8 WPACKET_close(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x28);
  if ((plVar2 == (long *)0x0) || (*plVar2 == 0)) {
    return 0;
  }
  uVar1 = FUN_00a9cab8(param_1,plVar2,1);
  return uVar1;
}

