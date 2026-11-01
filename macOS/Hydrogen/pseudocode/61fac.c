
bool FUN_00061fac(void)

{
  int *piVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  long *plVar5;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  bool bVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  
  uVar7 = 0;
  if (-1 < (long)in_stack_00000018) {
    in_stack_00000010 = in_stack_00000018 >> 0x38;
  }
  do {
    if (in_stack_00000010 <= uVar7) break;
    lVar4 = (**(code **)(*unaff_x22 + 0x30))();
    uVar7 = lVar4 + uVar7;
  } while (-1 < lVar4);
  if ((long)in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  bVar2 = *(byte *)((long)unaff_x20 + 0x17);
  uVar7 = *(ulong *)(unaff_x20 + 2);
  if (-1 < (char)bVar2) {
    uVar7 = (ulong)bVar2;
  }
  if (uVar7 == 4) {
    piVar1 = *(int **)unaff_x20;
    if (-1 < (char)bVar2) {
      piVar1 = unaff_x20;
    }
    if (*piVar1 != 0x44414548) goto LAB_00062040;
    plVar5 = *(long **)(unaff_x21 + 0x290);
joined_r0x000620fc:
    bVar6 = true;
  }
  else {
LAB_00062040:
    bVar2 = *(byte *)(unaff_x19 + 0x77);
    if ((char)bVar2 < '\0') {
      uVar7 = *(ulong *)(unaff_x19 + 0x68);
      if (uVar7 != 0) goto LAB_00062078;
LAB_000620a8:
      if (*(long *)(unaff_x19 + 0xb0) == 0) {
        bVar6 = true;
LAB_00062108:
        plVar5 = *(long **)(unaff_x21 + 0x290);
        goto joined_r0x000620fc;
      }
      iVar3 = func_0x00062af0();
      if (iVar3 != 0) {
        *(undefined1 *)(unaff_x19 + 0xd9) = 1;
        plVar5 = *(long **)(unaff_x21 + 0x290);
        goto joined_r0x000620fc;
      }
    }
    else {
      uVar7 = (ulong)bVar2;
      if (bVar2 == 0) goto LAB_000620a8;
LAB_00062078:
      uVar8 = 0;
      do {
        bVar6 = uVar7 <= uVar8;
        if (uVar7 <= uVar8) goto LAB_00062108;
        lVar4 = (**(code **)(*unaff_x22 + 0x30))();
        uVar8 = lVar4 + uVar8;
      } while (-1 < lVar4);
    }
    bVar6 = false;
    plVar5 = *(long **)(unaff_x21 + 0x290);
  }
joined_r0x000620fc:
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 0x30))();
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  if (in_stack_00000068 < 0) {
    __ZdlPv(in_stack_00000058);
  }
  return bVar6;
}

