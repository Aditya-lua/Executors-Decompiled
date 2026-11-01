
void FUN_006e79a4(void)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  
  plVar2 = (long *)func_0x006e644c();
  lVar1 = plVar2[2];
  lVar4 = plVar2[3];
  if (lVar4 != 0) {
    if (*(ulong *)(*(long *)(lVar1 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar1 + 0x18) + 0x48)) {
      func_0x006efe90(lVar1,1);
    }
    lVar5 = *(long *)(lVar1 + 8);
    if (*plVar2 == plVar2[1]) {
      uVar3 = func_0x006f6ca0(lVar1,lVar4);
    }
    else {
      uVar3 = func_0x006f6ef8(lVar1,lVar4 + 0x18,*plVar2 - (lVar4 + 0x18));
    }
    *(undefined8 *)(lVar5 + -0x10) = uVar3;
    *(undefined4 *)(lVar5 + -4) = 5;
    return;
  }
  lVar4 = *plVar2;
  if (*(ulong *)(*(long *)(lVar1 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar1 + 0x18) + 0x48)) {
    func_0x006efe90(lVar1,1);
  }
  if ((*(byte *)(lVar1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(lVar1,lVar1,lVar1 + 0x68);
  }
  puVar6 = *(undefined8 **)(lVar1 + 8);
  uVar3 = func_0x006f6ef8(lVar1,plVar2 + 4,lVar4 - (long)(plVar2 + 4));
  *puVar6 = uVar3;
  *(undefined4 *)((long)puVar6 + 0xc) = 5;
  *(long *)(lVar1 + 8) = *(long *)(lVar1 + 8) + 0x10;
  return;
}

