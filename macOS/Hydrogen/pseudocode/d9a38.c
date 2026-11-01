
void FUN_000d9a38(long param_1)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x20;
  
  piVar1 = (int *)(unaff_x20 + param_1);
  iVar2 = piVar1[4];
  if (((0 < iVar2) && (iVar2 <= *piVar1)) &&
     (lVar4 = (ulong)(iVar2 - 1) * 0x38, lVar3 = *(long *)(&UNK_00004ad8 + unaff_x20),
     *(int *)(*(long *)(&UNK_00004ae8 + unaff_x20) + lVar4) == *(int *)(lVar3 + lVar4))) {
    uVar5 = (ulong)(iVar2 - 1);
    do {
      uVar6 = uVar5;
      uVar5 = (ulong)((int)uVar6 - 1);
      if ((int)uVar6 < 1) {
        uVar6 = 0;
        if ((*(byte *)(piVar1 + 0x55b) >> 2 & 1) == 0) goto LAB_000d9ac8;
        goto LAB_000d9ab8;
      }
      lVar4 = *(long *)(lVar3 + uVar6 * 0x38 + 8);
    } while (((lVar4 != 0) && ((*(byte *)(lVar4 + 0x17) >> 4 & 1) != 0)) &&
            ((lVar4 = *(long *)(lVar3 + uVar5 * 0x38 + 8), lVar4 != 0 &&
             ((*(byte *)(lVar4 + 0x15) >> 2 & 1) == 0))));
    if ((*(byte *)(piVar1 + 0x55b) >> 2 & 1) != 0) {
LAB_000d9ab8:
      func_0x000bae48("[popup] CloseCurrentPopup %d -> %d\n");
    }
LAB_000d9ac8:
    func_0x000d9868(uVar6,1);
    if (*(long *)(&UNK_00004b18 + unaff_x20) != 0) {
      *(undefined1 *)(*(long *)(&UNK_00004b18 + unaff_x20) + 0x171) = 1;
    }
  }
  return;
}

