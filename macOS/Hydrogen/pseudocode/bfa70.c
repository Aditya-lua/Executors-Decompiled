
void FUN_000bfa70(void)

{
  int iVar1;
  long lVar2;
  long unaff_x20;
  int *unaff_x21;
  long unaff_x22;
  long lVar3;
  int iVar4;
  long lVar5;
  
  iVar4 = *(int *)(unaff_x22 + 4) + 1;
  *(int *)(unaff_x22 + 4) = iVar4;
  if (*(int *)(unaff_x22 + 0x14) != 0) {
    lVar3 = *(long *)(&UNK_00005f78 + unaff_x20);
    lVar5 = (long)*(int *)(unaff_x22 + 0x14) * 0x48;
    do {
      (**(code **)(lVar3 + 0x38))();
      lVar3 = lVar3 + 0x48;
      lVar5 = lVar5 + -0x48;
    } while (lVar5 != 0);
    iVar4 = *unaff_x21;
  }
  lVar5 = *(long *)(&UNK_00005f68 + unaff_x20);
  lVar3 = _fopen();
  if (lVar3 == 0) {
    return;
  }
  lVar2 = 0xa334c8;
  if (lVar5 != 0) {
    lVar2 = lVar5;
  }
  iVar1 = 0;
  if (iVar4 != 0) {
    iVar1 = iVar4 + -1;
  }
  _fwrite(lVar2,1,(long)iVar1,lVar3);
                    /* WARNING: Could not recover jumptable at 0x007b33ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__fclose_00a24db8)(lVar3);
  return;
}

