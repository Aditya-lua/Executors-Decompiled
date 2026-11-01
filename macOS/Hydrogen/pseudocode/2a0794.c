
undefined8 FUN_002a0794(void)

{
  code *pcVar1;
  uint uVar2;
  char cVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  ulong uVar7;
  long lVar8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  
  uVar2 = *(uint *)(unaff_x22 + 1);
  uVar7 = (ulong)uVar2;
  lVar8 = uVar7 * 8;
  do {
    lVar8 = lVar8 + -8;
    iVar4 = (int)uVar7;
    uVar7 = (ulong)(iVar4 - 1);
    if (iVar4 < 1) {
      *(uint *)(unaff_x22 + 1) = uVar2 & (int)uVar2 >> 0x1f;
      if (-1 < (int)uVar2) {
        *(undefined4 *)(unaff_x22 + 2) = 0;
      }
      goto LAB_002a07d8;
    }
  } while (*(long *)(*unaff_x22 + lVar8) == 0);
  *(int *)(unaff_x22 + 1) = iVar4;
LAB_002a07d8:
  iVar4 = func_0x0029e4fc(0);
  if (iVar4 == 0) {
LAB_002a083c:
    uVar5 = 0;
    cVar3 = *(char *)(unaff_x19 + 0x28);
  }
  else {
    if (*(int *)(unaff_x21 + 0x10) != 0) {
      pcVar1 = (code *)&_aws_lc_0_24_0_BN_add;
      if (*(int *)(unaff_x20 + 0x10) != 0) {
        pcVar1 = (code *)&_aws_lc_0_24_0_BN_sub;
      }
      iVar4 = (*pcVar1)();
      if (iVar4 == 0) goto LAB_002a083c;
    }
    uVar5 = 1;
    cVar3 = *(char *)(unaff_x19 + 0x28);
  }
  if (cVar3 != '\0') {
    return uVar5;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar8 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar8;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar8 * 8);
    return uVar5;
  }
  plVar6 = (long *)func_0x0079db4c(uVar5);
  uVar5 = func_0x002ac168();
  if ((int)uVar5 != 0) {
    uVar2 = *(uint *)(plVar6 + 1);
    uVar7 = (ulong)uVar2;
    lVar8 = uVar7 * 8;
    do {
      lVar8 = lVar8 + -8;
      iVar4 = (int)uVar7;
      uVar7 = (ulong)(iVar4 - 1);
      if (iVar4 < 1) {
        *(uint *)(plVar6 + 1) = uVar2 & (int)uVar2 >> 0x1f;
        if (-1 < (int)uVar2) {
          *(undefined4 *)(plVar6 + 2) = 0;
        }
        goto LAB_002a0934;
      }
    } while (*(long *)(*plVar6 + lVar8) == 0);
    *(int *)(plVar6 + 1) = iVar4;
LAB_002a0934:
    uVar5 = 1;
  }
  return uVar5;
}

