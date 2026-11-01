
void FUN_006ef8ac(long param_1,ulong param_2)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long *plVar6;
  
  plVar6 = (long *)(param_1 + 0x60);
  lVar2 = *plVar6;
  lVar5 = *(long *)(param_1 + 0x18);
  if ((lVar2 != 0) && (uVar4 = *(ulong *)(lVar2 + 8), param_2 <= uVar4)) {
    do {
      lVar3 = lVar2;
      if (uVar4 == param_2) {
        return;
      }
      lVar2 = *(long *)(lVar3 + 0x20);
    } while ((lVar2 != 0) && (uVar4 = *(ulong *)(lVar2 + 8), param_2 <= uVar4));
    plVar6 = (long *)(lVar3 + 0x20);
  }
  puVar1 = (undefined1 *)func_0x006f3878(param_1,0x28,*(undefined1 *)(param_1 + 4));
  puVar1[1] = *(byte *)(*(long *)(param_1 + 0x18) + 0x20) & 3;
  *puVar1 = 0xc;
  puVar1[2] = *(undefined1 *)(param_1 + 4);
  puVar1[3] = 0;
  *(ulong *)(puVar1 + 8) = param_2;
  *(long *)(puVar1 + 0x20) = *plVar6;
  *plVar6 = (long)puVar1;
  *(long *)(puVar1 + 0x10) = lVar5 + 0x300;
  lVar2 = *(long *)(lVar5 + 0x318);
  *(long *)(puVar1 + 0x18) = lVar2;
  *(undefined1 **)(lVar2 + 0x10) = puVar1;
  *(undefined1 **)(lVar5 + 0x318) = puVar1;
  return;
}

