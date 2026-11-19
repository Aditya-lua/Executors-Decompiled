/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e44d8
 */

long * FUN_008e44d8(long *param_1)

{
  undefined4 uVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  long *plVar5;
  undefined8 uVar6;
  
  plVar3 = (long *)FUN_008e47b0();
  lVar4 = (**(code **)*param_1)(param_1);
  if (lVar4 == 0) {
    iVar2 = FUN_008e4594(*plVar3);
    plVar5 = (long *)FUN_008e473c(iVar2 + 4);
    if (plVar5 == (long *)0x0) {
      return (long *)0x0;
    }
    lVar4 = *plVar5;
    (**(code **)(*param_1 + 8))(param_1,lVar4);
  }
  else {
    uVar1 = FUN_008e4594(*plVar3);
    plVar5 = (long *)FUN_008e44ac(lVar4,uVar1);
  }
  uVar6 = (**(code **)(*plVar3 + 0x38))(plVar3);
  uVar1 = FUN_008e4594(*plVar3);
  CodePatch(lVar4,uVar6,uVar1);
  return plVar5;
}

