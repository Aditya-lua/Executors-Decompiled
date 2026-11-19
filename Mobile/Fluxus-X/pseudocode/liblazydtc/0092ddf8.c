/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ddf8
 */

undefined8 FUN_0092ddf8(long param_1,undefined8 *param_2,undefined1 *param_3,undefined4 *param_4)

{
  long lVar1;
  undefined4 uVar2;
  char *pcVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  lVar1 = FUN_009086d4(param_1,param_2,0);
  if (-1 < lVar1) {
    return 0;
  }
  uVar4 = *(undefined8 *)(param_1 + 0xb50);
  uVar5 = *(undefined8 *)(param_1 + 0xb58);
  if (*(int *)(param_1 + 0x58) == 5) {
    uVar4 = FUN_00941d54(*param_2,param_2[1],uVar4,uVar5);
    pcVar3 = "Connection timed out after %ld milliseconds";
  }
  else {
    if (*(int *)(param_1 + 0x58) != 4) {
      lVar1 = *(long *)(param_1 + 0xd8);
      uVar4 = FUN_00941d54(*param_2,param_2[1],uVar4,uVar5);
      if (lVar1 == -1) {
        FUN_00904b80(param_1,"Operation timed out after %ld milliseconds with %ld bytes received",
                     uVar4,*(undefined8 *)(param_1 + 0xe8));
      }
      else {
        FUN_00904b80(param_1,
                     "Operation timed out after %ld milliseconds with %ld out of %ld bytes received"
                     ,uVar4,*(undefined8 *)(param_1 + 0xe8),*(undefined8 *)(param_1 + 0xd8));
      }
      goto LAB_0092dec4;
    }
    uVar4 = FUN_00941d54(*param_2,param_2[1],uVar4,uVar5);
    pcVar3 = "Resolving timed out after %ld milliseconds";
  }
  FUN_00904b80(param_1,pcVar3,uVar4);
LAB_0092dec4:
  *param_4 = 0x1c;
  if (*(long *)(param_1 + 0x20) != 0) {
    if (*(uint *)(param_1 + 0x58) < 10) {
      uVar2 = 0x1c;
    }
    else {
      FUN_00908c4c(*(long *)(param_1 + 0x20),2);
      *param_3 = 1;
      uVar2 = *param_4;
    }
    FUN_0092b674(param_1,uVar2,1);
  }
  return 1;
}

