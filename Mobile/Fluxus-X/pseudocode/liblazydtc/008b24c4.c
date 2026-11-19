/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b24c4
 */

void FUN_008b24c4(long param_1,long param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  double *pdVar4;
  
  uVar1 = FUN_008bae54(param_1,0,1);
  *(undefined8 *)(param_2 + 0x48) = uVar1;
  lVar2 = FUN_008b4e40(param_1,0,param_3);
  *(code **)(lVar2 + 0x28) = FUN_008b2c78;
  uVar1 = FUN_008b9ff8(param_1,"luaR_constructobject",0x14);
  *(undefined8 *)(lVar2 + 0x18) = uVar1;
  *(undefined8 *)(lVar2 + 0x20) = 0;
  plVar3 = (long *)FUN_008bce4c(param_1,*(undefined8 *)(param_2 + 0x48),
                                *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x358));
  *plVar3 = lVar2;
  lVar2 = *(long *)(param_2 + 0x48);
  *(undefined4 *)((long)plVar3 + 0xc) = 7;
  *(undefined1 *)(lVar2 + 7) = 1;
  lVar2 = FUN_008b4e40(param_1,1,param_3);
  *(code **)(lVar2 + 0x28) = FUN_008b2e4c;
  uVar1 = FUN_008b9ff8(param_1,"luaR_defaultcreateobject",0x18);
  *(undefined8 *)(lVar2 + 0x18) = uVar1;
  *(undefined8 *)(lVar2 + 0x20) = 0;
  *(long *)(lVar2 + 0x30) = param_2;
  *(undefined4 *)(lVar2 + 0x3c) = 0xb;
  uVar1 = FUN_008b9ff8(param_1,"__init",6);
  pdVar4 = (double *)FUN_008bb440(*(undefined8 *)(param_2 + 0x38),uVar1);
  plVar3 = (long *)(*(long *)(param_2 + 0x28) +
                   (ulong)(uint)((int)*pdVar4 - *(int *)(param_2 + 0x58)) * 0x10);
  *plVar3 = lVar2;
  *(undefined4 *)((long)plVar3 + 0xc) = 7;
  return;
}

