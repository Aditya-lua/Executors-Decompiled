/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e34dc
 */

bool FUN_008e34dc(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  
  uVar2 = FUN_008e44ac(*(undefined8 *)(*(long *)(param_1 + 8) + 8));
  *(undefined8 *)(param_1 + 0x10) = uVar2;
  plVar3 = (long *)FUN_008e44ac(0,0);
  *(long **)(param_1 + 0x18) = plVar3;
  FUN_008e3630(*(undefined8 *)(*(long *)(param_1 + 8) + 8),uVar2,plVar3);
  lVar4 = *plVar3;
  if (lVar4 != 0) {
    *(long *)(*(long *)(param_1 + 8) + 0x18) = lVar4;
    memcpy((void *)(*(long *)(param_1 + 8) + 0x30),(void *)**(undefined8 **)(param_1 + 0x10),
           (*(undefined8 **)(param_1 + 0x10))[1]);
    lVar1 = *(long *)(param_1 + 8);
    uVar2 = **(undefined8 **)(param_1 + 0x10);
    *(undefined8 *)(lVar1 + 0x28) = (*(undefined8 **)(param_1 + 0x10))[1];
    *(undefined8 *)(lVar1 + 0x20) = uVar2;
  }
  return lVar4 != 0;
}

