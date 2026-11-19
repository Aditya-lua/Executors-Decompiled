/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00845b2c
 */

void FUN_00845b2c(long param_1,undefined4 *param_2)

{
  char cVar1;
  undefined8 uVar2;
  
  if ((*(undefined1 **)(param_2 + 4) == *(undefined1 **)(param_2 + 6)) ||
     (cVar1 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))
                        (*(long **)(param_1 + 0x18),**(undefined1 **)(param_2 + 4)),
     *(char *)(param_1 + 0x28) != cVar1)) {
    uVar2 = 0;
    *param_2 = 0xfffffc1f;
  }
  else {
    *param_2 = 0xfffffc1d;
    uVar2 = *(undefined8 *)(param_1 + 8);
    *(long *)(param_2 + 4) = *(long *)(param_2 + 4) + 1;
  }
  *(undefined8 *)(param_2 + 0x14) = uVar2;
  return;
}

