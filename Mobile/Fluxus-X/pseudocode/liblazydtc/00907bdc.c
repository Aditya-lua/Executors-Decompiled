/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907bdc
 */

undefined8
FUN_00907bdc(long *param_1,undefined8 param_2,byte param_3,undefined4 param_4,undefined4 param_5,
            undefined8 param_6)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != (long *)0x0) {
    uVar1 = 0;
    do {
      if ((*(code **)(*param_1 + 0x58) != (code *)&LAB_00907bd4) &&
         (uVar1 = (**(code **)(*param_1 + 0x58))(param_1,param_2,param_4,param_5,param_6),
         ((int)uVar1 != 0 & (param_3 ^ 1)) != 0)) {
        return uVar1;
      }
      param_1 = (long *)param_1[1];
    } while (param_1 != (long *)0x0);
  }
  return uVar1;
}

