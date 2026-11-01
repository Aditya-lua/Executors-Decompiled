
void FUN_000e5aa8(void)

{
  uint *puVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  float fVar6;
  
  puVar1 = (uint *)(&UNK_0000497c + unaff_x22);
  uVar5 = *puVar1;
  if ((uVar5 >> 2 & 1) == 0) {
    fVar6 = *(float *)(&UNK_000038e8 + unaff_x22);
    unaff_x20[0x4fc] = (int)fVar6;
    *(float *)(&UNK_000038e8 + unaff_x22) = fVar6 * *(float *)(&UNK_000038ec + unaff_x22);
  }
  uVar5 = uVar5 | 4;
  *puVar1 = uVar5;
  iVar3 = *unaff_x20;
  if (iVar3 == unaff_x20[1]) {
    func_0x000eb9f0();
    iVar3 = *unaff_x20;
    uVar5 = *puVar1;
  }
  *(uint *)(*(long *)(&UNK_00004ab8 + unaff_x22) + (long)iVar3 * 4) = uVar5;
  *unaff_x20 = *unaff_x20 + 1;
  *(short *)(unaff_x20 + 0x4fd) = (short)unaff_x20[0x4fd] + 1;
  func_0x0010adc0("0x%08X \"%s\" Pos (%d,%d) Size (%d,%d) Collapsed=%d");
  if (*(char *)(unaff_x19 + 0xf) != '\0') {
    lVar4 = *(long *)(unaff_x21 + 0x4c0);
    *(short *)(&UNK_00005ea4 + lVar4) = *(short *)(&UNK_00005ea4 + lVar4) + -1;
    uVar5 = *(uint *)(&UNK_0000497c + lVar4);
    iVar3 = *(int *)(&UNK_00004ab0 + lVar4);
    *(int *)(&UNK_00004ab0 + lVar4) = iVar3 + -1;
    uVar2 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar4) + (long)(iVar3 + -2) * 4);
    *(uint *)(&UNK_0000497c + lVar4) = uVar2;
    if (((uVar5 >> 2 & 1) != 0) && ((uVar2 >> 2 & 1) == 0)) {
      *(undefined4 *)(&UNK_000038e8 + lVar4) = *(undefined4 *)(&UNK_00005ea0 + lVar4);
    }
  }
  return;
}

