/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925e04
 */

void FUN_00925e04(long *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  
  if (param_1 != (long *)0x0) {
    lVar2 = param_1[3];
    while (lVar2 != 0) {
      puVar3 = (undefined8 *)param_1[1];
      if (puVar3 != (undefined8 *)0x0) {
        if ((undefined8 *)*param_1 == puVar3) {
          lVar4 = puVar3[2];
          *param_1 = lVar4;
          if (lVar4 == 0) {
            param_1[1] = 0;
          }
          else {
            *(undefined8 *)(lVar4 + 8) = 0;
          }
        }
        else {
          lVar4 = puVar3[1];
          if (lVar4 != 0) {
            *(undefined8 *)(lVar4 + 0x10) = puVar3[2];
          }
          if (puVar3[2] == 0) {
            param_1[1] = lVar4;
          }
          else {
            *(long *)(puVar3[2] + 8) = lVar4;
          }
        }
        uVar1 = *puVar3;
        puVar3[1] = 0;
        puVar3[2] = 0;
        *puVar3 = 0;
        lVar2 = lVar2 + -1;
        param_1[3] = lVar2;
        if ((code *)param_1[2] != (code *)0x0) {
          (*(code *)param_1[2])(param_2,uVar1);
          lVar2 = param_1[3];
        }
      }
    }
  }
  return;
}

