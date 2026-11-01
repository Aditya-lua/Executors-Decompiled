
long * FUN_006f3720(long param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  uint uVar3;
  ulong unaff_x21;
  long *plVar4;
  long lVar5;
  
  lVar5 = *(long *)(param_1 + 0x18);
  if ((param_2 - 1U < 0x400) && (-1 < (char)*(byte *)(param_2 + 0xa40300))) {
    plVar4 = (long *)(lVar5 + (ulong)*(byte *)(param_2 + 0xa40300) * 8 + 0x60);
    lVar1 = *plVar4;
    if (lVar1 == 0) goto LAB_006f37ac;
    uVar3 = *(uint *)(lVar1 + 0x30);
    if ((int)uVar3 < 0) goto LAB_006f37c8;
LAB_006f3764:
    plVar2 = (long *)(lVar1 + (ulong)uVar3 + 0x40);
    uVar3 = uVar3 - *(int *)(lVar1 + 0x24);
    *(uint *)(lVar1 + 0x30) = uVar3;
    uVar3 = uVar3 >> 0x1f;
  }
  else {
    plVar2 = (long *)(**(code **)(lVar5 + 0x10))(*(undefined8 *)(lVar5 + 0x18),0,0,param_2);
    if ((param_2 == 0) || (plVar2 != (long *)0x0)) goto LAB_006f3814;
    func_0x006edf6c(param_1,4);
    plVar4 = (long *)0x0;
LAB_006f37ac:
    lVar1 = func_0x006f42bc(param_1,lVar5 + 0x60,0);
    uVar3 = *(uint *)(lVar1 + 0x30);
    if (-1 < (int)uVar3) goto LAB_006f3764;
LAB_006f37c8:
    plVar2 = *(long **)(lVar1 + 0x28);
    *(long *)(lVar1 + 0x28) = *plVar2;
    uVar3 = 1;
  }
  *(int *)(lVar1 + 0x34) = *(int *)(lVar1 + 0x34) + 1;
  *plVar2 = lVar1;
  if (*(long *)(lVar1 + 0x28) == 0 && uVar3 != 0) {
    *plVar4 = *(long *)(lVar1 + 8);
    if (*(undefined8 **)(lVar1 + 8) != (undefined8 *)0x0) {
      **(undefined8 **)(lVar1 + 8) = 0;
    }
    *(undefined8 *)(lVar1 + 8) = 0;
  }
  plVar2 = plVar2 + 1;
LAB_006f3814:
  *(long *)(lVar5 + 0x48) = *(long *)(lVar5 + 0x48) + param_2;
  lVar1 = lVar5 + (unaff_x21 & 0xffffffff) * 8;
  *(long *)(lVar1 + 0x560) = *(long *)(lVar1 + 0x560) + param_2;
  if (*(code **)(lVar5 + 0x520) == (code *)0x0) {
    return plVar2;
  }
  (**(code **)(lVar5 + 0x520))(param_1,0,param_2);
  return plVar2;
}

