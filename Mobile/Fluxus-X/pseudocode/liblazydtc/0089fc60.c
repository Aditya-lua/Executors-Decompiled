/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089fc60
 */

void FUN_0089fc60(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  if (param_2 != param_3) {
    puVar2 = param_2;
    do {
      uVar5 = puVar2[2];
      uVar4 = puVar2[1];
      *param_4 = *puVar2;
      uVar3 = puVar2[3];
      param_4[2] = uVar5;
      param_4[1] = uVar4;
      param_4[3] = uVar3;
      uVar3 = puVar2[4];
      uVar1 = *(undefined1 *)(puVar2 + 6);
      puVar2[2] = 0;
      puVar2[3] = 0;
      puVar2[1] = 0;
      param_4[5] = puVar2[5];
      param_4[4] = uVar3;
      *(undefined1 *)(param_4 + 6) = uVar1;
      param_4 = param_4 + 7;
      *puVar2 = 0;
      puVar2[4] = 0;
      puVar2[5] = 0;
      *(undefined1 *)(puVar2 + 6) = 0x40;
      puVar2 = puVar2 + 7;
    } while (puVar2 != param_3);
    do {
      if ((void *)*param_2 != (void *)0x0) {
        operator_delete((void *)*param_2);
        *param_2 = 0;
        operator_delete((void *)param_2[3]);
        param_2[1] = 0;
        param_2[2] = 0;
        param_2[3] = 0;
        operator_delete((void *)0x0);
        param_2[4] = 0;
        *(undefined1 *)(param_2 + 6) = 0x40;
      }
      operator_delete((void *)param_2[3]);
      param_2 = param_2 + 7;
    } while (param_2 != param_3);
  }
  return;
}

