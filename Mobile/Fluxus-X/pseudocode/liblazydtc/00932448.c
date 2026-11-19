/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932448
 */

undefined8 FUN_00932448(long param_1,uint *param_2)

{
  int iVar1;
  undefined8 uVar2;
  int extraout_w1;
  
  uVar2 = thunk_FUN_0097001c(param_1,param_2,4);
  if ((int)uVar2 == 4) {
    if (DAT_00d1ff94 != '\x01') {
      iVar1 = FUN_00941cb8();
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"WARNING: using weak random seed");
      }
      DAT_00d1ff90 = (extraout_w1 + iVar1 + DAT_00d1ff90) * -0x7f82434b + 0xa70427df;
      DAT_00d1ff94 = '\x01';
    }
    DAT_00d1ff90 = DAT_00d1ff90 * 0x41c64e6d + 0x3039;
    uVar2 = 0;
    *param_2 = DAT_00d1ff90 >> 0x10 | DAT_00d1ff90 * 0x10000;
  }
  return uVar2;
}

