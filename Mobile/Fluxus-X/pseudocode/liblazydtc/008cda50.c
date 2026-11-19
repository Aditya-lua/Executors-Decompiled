/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cda50
 */

void FUN_008cda50(long param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  puVar1 = (undefined8 *)FUN_008be028(param_1,param_2,4);
  if (*(int *)((long)puVar1 + 0xc) != 7) {
                    /* WARNING: Subroutine does not return */
    FUN_008b399c(param_1,param_2,&DAT_002c8ca6);
  }
  puVar2 = *(undefined8 **)(param_1 + 0x68);
  if (param_2 < puVar2) {
    do {
      puVar3 = puVar2 + -2;
      puVar2[1] = puVar2[-1];
      *puVar2 = puVar2[-2];
      puVar2 = puVar3;
    } while (param_2 < puVar3);
    puVar2 = *(undefined8 **)(param_1 + 0x68);
  }
  *(undefined8 **)(param_1 + 0x68) = puVar2 + 2;
  uVar4 = *puVar1;
  param_2[1] = puVar1[1];
  *param_2 = uVar4;
  return;
}

