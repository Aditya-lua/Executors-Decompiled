/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089def0
 */

void FUN_0089def0(long param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  puVar1 = *(undefined8 **)(param_1 + 8);
  if (puVar1 < *(undefined8 **)(param_1 + 0x10)) {
    uVar5 = param_2[2];
    uVar4 = param_2[1];
    puVar2 = puVar1 + 7;
    *puVar1 = *param_2;
    uVar3 = param_2[3];
    puVar1[2] = uVar5;
    puVar1[1] = uVar4;
    puVar1[3] = uVar3;
    uVar4 = param_2[5];
    uVar3 = param_2[4];
    param_2[2] = 0;
    param_2[3] = 0;
    param_2[1] = 0;
    *(undefined1 *)(puVar1 + 6) = *(undefined1 *)(param_2 + 6);
    puVar1[5] = uVar4;
    puVar1[4] = uVar3;
    *param_2 = 0;
    param_2[4] = 0;
    param_2[5] = 0;
    *(undefined1 *)(param_2 + 6) = 0x40;
  }
  else {
    puVar2 = (undefined8 *)FUN_0089f9c8(param_1);
  }
  *(undefined8 **)(param_1 + 8) = puVar2;
  return;
}

