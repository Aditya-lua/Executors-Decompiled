
long FUN_006ec9e4(long param_1,uint param_2,undefined8 param_3)

{
  long *plVar1;
  undefined8 *puVar2;
  long *plVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  
  lVar5 = *(long *)(param_1 + 0x20);
  if ((uint)((int)((ulong)(lVar5 - *(long *)(param_1 + 0x40)) >> 3) * -0x33333333) <= param_2) {
    return 0;
  }
  plVar1 = (long *)(lVar5 + (long)(int)param_2 * -0x28);
  if ((*(byte *)((long)plVar1 + 0x24) >> 2 & 1) == 0) {
    if (((*(int *)(plVar1[1] + 0xc) == 7) &&
        (lVar6 = *(long *)plVar1[1], *(char *)(lVar6 + 3) == '\0')) &&
       (lVar6 = *(long *)(lVar6 + 0x18), lVar6 != 0)) {
      lVar5 = *(long *)(lVar5 + (long)(int)param_2 * -0x28 + 0x18);
      iVar4 = 0;
      if (lVar5 != 0) {
        iVar4 = 0;
        if (lVar5 != *(long *)(lVar6 + 0x10)) {
          iVar4 = (int)((ulong)(lVar5 - *(long *)(lVar6 + 0x10)) >> 2) + -1;
        }
      }
      plVar3 = (long *)func_0x006efb88(lVar6,param_3,iVar4);
      if (plVar3 != (long *)0x0) {
        uVar7 = *(undefined8 *)(*(long *)(param_1 + 8) + -0x10);
        puVar2 = (undefined8 *)(*plVar1 + (ulong)*(byte *)(plVar3 + 2) * 0x10);
        puVar2[1] = *(undefined8 *)(*(long *)(param_1 + 8) + -8);
        *puVar2 = uVar7;
        *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + -0x10;
        return *plVar3 + 0x18;
      }
    }
    *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + -0x10;
  }
  return 0;
}

