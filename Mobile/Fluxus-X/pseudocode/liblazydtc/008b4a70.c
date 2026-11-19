/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4a70
 */

void FUN_008b4a70(long param_1,undefined8 *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  
  puVar3 = *(undefined8 **)(param_1 + 0x68);
  puVar3[1] = puVar3[-1];
  *puVar3 = puVar3[-2];
  lVar4 = *(long *)(param_1 + 0x68);
  uVar5 = *param_2;
  *(undefined8 *)(lVar4 + -8) = param_2[1];
  *(undefined8 *)(lVar4 + -0x10) = uVar5;
  lVar4 = *(long *)(param_1 + 0x68);
  if (*(long *)(param_1 + 0x48) - lVar4 < 0x11) {
    iVar1 = *(int *)(param_1 + 0x40);
    iVar2 = iVar1 << 1;
    if (iVar1 < 1) {
      iVar2 = iVar1 + 1;
    }
    FUN_008b3fdc(param_1,iVar2,0);
    lVar4 = *(long *)(param_1 + 0x68);
  }
  *(long *)(param_1 + 0x68) = lVar4 + 0x10;
  FUN_008b4664(param_1,lVar4 + -0x10,1);
  return;
}

