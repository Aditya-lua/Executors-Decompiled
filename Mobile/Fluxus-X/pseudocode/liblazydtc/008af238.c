/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008af238
 */

ulong FUN_008af238(undefined8 param_1,undefined4 param_2,ulong param_3)

{
  int iVar1;
  ulong uVar2;
  
  iVar1 = FUN_008ab0e0();
  if (iVar1 < 1) {
    return param_3 & 0xffffffff;
  }
  iVar1 = FUN_008ab0e0(param_1,param_2);
  if (iVar1 != 1) {
                    /* WARNING: Subroutine does not return */
    FUN_008af05c(param_1,param_2,1);
  }
  uVar2 = FUN_008ab7b0(param_1,param_2);
  return uVar2;
}

