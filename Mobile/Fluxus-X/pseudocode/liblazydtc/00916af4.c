/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916af4
 */

undefined8 FUN_00916af4(long param_1,int param_2,long param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  *(int *)(param_1 + 0xdb4) = param_2;
  if (param_2 == 0) {
    if (param_3 == 0) {
      lVar2 = 0;
    }
    else {
      if (*(long *)(param_1 + 0xd0) != 0) {
        FUN_0093f628(param_1,3,2);
      }
      lVar2 = FUN_00916f7c(param_1,param_3,*(undefined8 *)(param_1 + 0xd90),0,
                           *(undefined4 *)(param_1 + 0xdb0));
      if (*(long *)(param_1 + 0xd0) != 0) {
        FUN_0093f680(param_1,3);
      }
      uVar1 = 0;
      if (lVar2 != 0) goto LAB_00916b88;
      FUN_0090f270(param_3);
    }
    uVar1 = 0x1b;
  }
  else {
    lVar2 = 0;
    uVar1 = 0;
  }
LAB_00916b88:
  *(long *)(param_1 + 0xd98) = lVar2;
  *(byte *)(param_1 + 0xdb8) = *(byte *)(param_1 + 0xdb8) | 1;
  return uVar1;
}

