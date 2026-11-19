/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00807b44
 */

undefined8 FUN_00807b44(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  FUN_008af088(param_1,1,8);
  puVar1 = (undefined8 *)FUN_008abd78(param_1,1);
  uVar2 = *puVar1;
  FUN_008aca84(param_1,DAT_00d1b360,0);
  FUN_008acdb8(param_1,0xffffd8f0);
  FUN_008aca84(param_1,uVar2,0);
  FUN_008acdb8(param_1,0xfffffffe);
  FUN_008aca84(param_1,uVar2,0);
  FUN_008ac024(param_1);
  FUN_008ad954(param_1,0xfffffffc);
  (*DAT_00d1b360)(param_1,puVar1);
  FUN_008ad4b0(param_1,1);
  FUN_008adbdc(param_1,0xfffffffe);
  FUN_008aca84(param_1,uVar2,0);
  FUN_008aaf04(param_1,0xfffffffe);
  FUN_008ad954(param_1,0xfffffffb);
  return 1;
}

