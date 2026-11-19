/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904584
 */

undefined8 FUN_00904584(long *param_1,ulong param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar2 = param_1[1];
  if (uVar2 < param_2) {
    uVar1 = 0x2b;
  }
  else {
    uVar1 = 0;
    if (uVar2 - param_2 != 0) {
      if (param_2 == 0) {
        if (uVar2 != 0) {
          *(undefined1 *)*param_1 = 0;
        }
        uVar1 = 0;
        param_1[1] = 0;
      }
      else {
        memmove((void *)*param_1,(void *)(*param_1 + (uVar2 - param_2)),param_2);
        uVar1 = 0;
        param_1[1] = param_2;
        *(undefined1 *)(*param_1 + param_2) = 0;
      }
    }
  }
  return uVar1;
}

