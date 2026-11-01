
void FUN_00230e28(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  int in_w8;
  long unaff_x19;
  
  if (in_w8 == 0xf) {
    lVar1 = *(long *)(unaff_x19 + 0x10);
    lVar3 = *(long *)(unaff_x19 + 0x18) + 1;
    lVar2 = lVar1;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0016af10(lVar2);
      lVar2 = lVar2 + 0x70;
    }
    if (*(long *)(unaff_x19 + 8) == 0) {
      return;
    }
    lVar3 = *(long *)(unaff_x19 + 8) * 0x70;
    uVar4 = 8;
  }
  else {
    lVar3 = *(long *)(unaff_x19 + 8);
    if (lVar3 == -0x8000000000000000) {
      return;
    }
    if (lVar3 == 0) {
      return;
    }
    lVar1 = *(long *)(unaff_x19 + 0x10);
    uVar4 = 1;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3,uVar4);
  return;
}

