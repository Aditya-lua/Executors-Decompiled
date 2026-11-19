/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb5844
 */

ulong HUF_decompress1X1_DCtx_wksp
                (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,ulong param_5
                ,undefined8 param_6,undefined8 param_7,undefined4 param_8)

{
  ulong uVar1;
  
  uVar1 = HUF_readDTableX1_wksp(param_1,param_4,param_5,param_6,param_7,param_8);
  if (uVar1 < 0xffffffffffffff89) {
    if (uVar1 <= param_5 && param_5 - uVar1 != 0) {
      uVar1 = FUN_00bb58e0(param_2,param_3,param_4 + uVar1,param_5 - uVar1,param_1);
      return uVar1;
    }
    uVar1 = 0xffffffffffffffb8;
  }
  return uVar1;
}

