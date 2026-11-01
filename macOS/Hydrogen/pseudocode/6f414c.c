
void FUN_006f414c(void)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  code *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long lVar4;
  int iVar5;
  long lVar6;
  
  do {
    uVar2 = (ulong)*(int *)(unaff_x21 + 0x24);
    iVar5 = 0;
    if (uVar2 != 0) {
      iVar5 = (int)(((long)*(int *)(unaff_x21 + 0x20) - 0x40U) / uVar2);
    }
    lVar4 = unaff_x21 + 0x40 + (long)*(int *)(unaff_x21 + 0x24) * (long)iVar5;
    if (unaff_x21 + 0x40 + (long)*(int *)(unaff_x21 + 0x30) + uVar2 != lVar4) {
      iVar5 = *(int *)(unaff_x21 + 0x34);
      lVar1 = (long)*(int *)(unaff_x21 + 0x30) + 0x40;
      lVar6 = unaff_x21 + uVar2;
      do {
        if (((*(char *)(lVar6 + lVar1) != '\0') && (iVar3 = (*unaff_x19)(), iVar3 != 0)) &&
           (iVar5 = iVar5 + -1, iVar5 == 0)) break;
        lVar6 = lVar6 + uVar2;
      } while (lVar6 + lVar1 != lVar4);
    }
    if (unaff_x22 == 0) {
      return;
    }
    unaff_x21 = unaff_x22;
    unaff_x22 = *(long *)(unaff_x22 + 0x18);
  } while( true );
}

