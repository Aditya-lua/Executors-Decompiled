/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c9314
 */

void FUN_008c9314(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  
  lVar3 = FUN_008b4cdc();
  lVar4 = param_2[1];
  uVar5 = *(undefined8 *)(lVar4 + 0x68);
  uVar2 = *(undefined4 *)(lVar4 + 0x98);
  *(undefined8 *)(lVar3 + 0x70) = *(undefined8 *)(lVar4 + 0x70);
  *(undefined8 *)(lVar3 + 0x68) = uVar5;
  lVar4 = *param_2;
  *(undefined4 *)(lVar3 + 0x98) = uVar2;
  uVar5 = *(undefined8 *)(lVar4 + 0x28);
  uVar1 = *(undefined8 *)(lVar4 + 0x30);
  param_2[2] = lVar3;
  FUN_008cab38(param_1,lVar4,lVar3,uVar5,uVar1);
  return;
}

