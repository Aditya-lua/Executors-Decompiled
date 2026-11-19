/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093566c
 */

undefined8
FUN_0093566c(undefined8 param_1,long *param_2,undefined8 param_3,undefined8 param_4,
            undefined8 *param_5,undefined1 *param_6)

{
  undefined8 uVar1;
  
  *param_5 = 0;
  *param_6 = 0;
  if (param_2 == (long *)0x0) {
    return 0x1a;
  }
                    /* WARNING: Could not recover jumptable at 0x00935680. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_2 + 0x10))();
  return uVar1;
}

