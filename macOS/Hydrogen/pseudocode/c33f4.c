
void FUN_000c33f4(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  uint uVar4;
  long *plVar5;
  int iVar6;
  long unaff_x19;
  long unaff_x20;
  ulong uVar7;
  long unaff_x21;
  long lVar8;
  char *pcStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = *(undefined8 *)(unaff_x20 + 8);
  pcStack0000000000000000 = "<NULL>";
  func_0x000bae48("[focus] FocusWindow(\"%s\", UnlessBelowModal): prevented by \"%s\".\n");
  if (((unaff_x19 == 0) || (*(long *)(unaff_x19 + 0x388) != unaff_x19)) ||
     ((*(byte *)(unaff_x19 + 0x15) >> 5 & 1) != 0)) {
    return;
  }
  lVar8 = *(long *)(unaff_x21 + 0x4c0);
  plVar2 = *(long **)(&UNK_00003fa8 + lVar8);
  plVar3 = plVar2;
  if (*(int *)(&UNK_00003fa0 + lVar8) < 1) {
    uVar4 = 0;
  }
  else {
    plVar5 = plVar2;
    do {
      if (*plVar5 == unaff_x19) break;
      plVar5 = plVar5 + 1;
    } while (plVar5 < plVar2 + *(int *)(&UNK_00003fa0 + lVar8));
    uVar4 = (uint)((ulong)((long)plVar5 - (long)plVar2) >> 3);
    do {
      if (*plVar3 == *(long *)(unaff_x20 + 0x388)) break;
      plVar3 = plVar3 + 1;
    } while (plVar3 < plVar2 + *(int *)(&UNK_00003fa0 + lVar8));
  }
  uVar7 = (long)plVar3 - (long)plVar2;
  iVar6 = (int)(uVar7 >> 3);
  if ((int)uVar4 < iVar6) {
    _memmove(plVar2 + (int)uVar4,plVar2 + (int)uVar4 + 1,
             -(ulong)(iVar6 + ~uVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar6 + ~uVar4) << 3);
    plVar3 = (long *)(*(long *)(&UNK_00003fa8 + lVar8) +
                     ((long)(uVar7 * 0x20000000 + -0x100000000) >> 0x20) * 8);
  }
  else {
    lVar1 = (long)(uVar7 * 0x20000000) >> 0x20;
    _memmove(plVar2 + ((long)(uVar7 * 0x20000000 + 0x100000000) >> 0x20),plVar2 + lVar1,
             -(ulong)(uVar4 - iVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)(uVar4 - iVar6) << 3);
    plVar3 = (long *)(*(long *)(&UNK_00003fa8 + lVar8) + lVar1 * 8);
  }
  *plVar3 = unaff_x19;
  return;
}

