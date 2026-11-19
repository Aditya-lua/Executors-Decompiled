/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096836c
 */

undefined8 FUN_0096836c(void)

{
  undefined8 uVar1;
  
  if ((DAT_00d20180 & 1) == 0) {
    DAT_00d20180 = 1;
    uVar1 = (**(code **)(PTR_DAT_00cc4d08 + 0x20))();
    return uVar1;
  }
  return 1;
}

