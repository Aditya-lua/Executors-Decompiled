/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008949bc
 */

void FUN_008949bc(undefined8 *param_1,long param_2,ulong param_3,undefined8 param_4,
                 undefined8 param_5)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  
  lVar4 = param_1[0xf7];
  if (param_3 < (ulong)(param_1[0xf8] - lVar4 >> 4)) {
    lVar5 = param_3 << 4;
    do {
      if (*(int *)(lVar4 + lVar5) == 1) {
        uVar2 = *param_1;
        uVar3 = param_5;
LAB_00894a0c:
        uVar1 = FUN_00875ed8(uVar2,*(undefined8 *)(lVar4 + lVar5 + 8),uVar3);
        if ((uVar1 & 1) == 0) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
        }
      }
      else if (*(int *)(lVar4 + lVar5) == 0) {
        uVar2 = *param_1;
        uVar3 = param_4;
        goto LAB_00894a0c;
      }
      lVar4 = param_1[0xf7];
      param_3 = param_3 + 1;
      lVar5 = lVar5 + 0x10;
    } while (param_3 < (ulong)(param_1[0xf8] - lVar4 >> 4));
  }
  return;
}

