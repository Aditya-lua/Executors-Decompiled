/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ca6c
 */

undefined8 WPACKET_fill_lengths(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x28);
  if (plVar2 == (long *)0x0) {
    uVar1 = 0;
  }
  else {
    do {
      uVar1 = FUN_00a9cab8(param_1,plVar2,0);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      plVar2 = (long *)*plVar2;
    } while (plVar2 != (long *)0x0);
    uVar1 = 1;
  }
  return uVar1;
}

