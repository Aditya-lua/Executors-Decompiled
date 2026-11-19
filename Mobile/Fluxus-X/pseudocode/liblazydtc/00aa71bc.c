/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa71bc
 */

undefined8 MDC2_Final(undefined8 *param_1,uint *param_2)

{
  uint uVar1;
  ulong uVar2;
  
  uVar1 = *param_2;
  if ((uVar1 != 0) || (param_2[7] == 2)) {
    uVar2 = (ulong)uVar1;
    if (param_2[7] == 2) {
      uVar2 = (ulong)(uVar1 + 1);
      *(undefined1 *)((long)param_2 + (ulong)uVar1 + 4) = 0x80;
    }
    memset((void *)((long)(param_2 + 1) + uVar2),0,(ulong)(8 - (int)uVar2));
    FUN_00aa705c(param_2,param_2 + 1,8);
  }
  *param_1 = *(undefined8 *)(param_2 + 3);
  param_1[1] = *(undefined8 *)(param_2 + 5);
  return 1;
}

