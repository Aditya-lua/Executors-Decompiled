/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00807cc0
 */

undefined8 FUN_00807cc0(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  FUN_008af088(param_1,1,8);
  FUN_008aca84(param_1,DAT_00d1b360,0);
  FUN_008acdb8(param_1,0xffffd8f0);
  puVar1 = (undefined8 *)FUN_008abd78(param_1,1);
  if (puVar1 == (undefined8 *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = *puVar1;
  }
  FUN_008aca84(param_1,uVar2,0);
  FUN_008ac024(param_1);
  FUN_008ad954(param_1,0xfffffffd);
  return 0;
}

