/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3b74
 */

void FUN_008b3b74(undefined8 param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar3 = FUN_008be244();
  uVar4 = FUN_008be244(param_1,param_3);
  puVar1 = &DAT_002d2d4f;
  if (param_4 != 0x11) {
    puVar1 = &DAT_002a16b9;
  }
  puVar2 = &DAT_002b524e;
  if (param_4 != 0x10) {
    puVar2 = puVar1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,"attempt to compare %s %s %s",uVar3,puVar2,uVar4);
}

