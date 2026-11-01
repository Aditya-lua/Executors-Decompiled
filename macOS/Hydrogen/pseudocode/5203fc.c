
undefined8 * FUN_005203fc(void)

{
  char *pcVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  long *plVar5;
  undefined8 *puVar6;
  long *unaff_x19;
  undefined8 *puVar7;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long lVar8;
  long unaff_x26;
  undefined8 *puVar9;
  long unaff_x28;
  undefined1 auVar10 [16];
  long in_stack_00000018;
  
  do {
    puVar6 = unaff_x23;
    if (puVar6 == unaff_x24) {
      puVar7 = (undefined8 *)0x0;
      unaff_x23 = puVar6;
LAB_00520554:
      *unaff_x19 = (long)unaff_x23;
      return puVar7;
    }
    unaff_x23 = puVar6 + 2;
    if (unaff_x28 == unaff_x26) {
      *unaff_x19 = (long)unaff_x23;
      auVar10 = func_0x007a23bc(&UNK_009e9bf8);
      plVar5 = auVar10._0_8_;
      puVar6 = (undefined8 *)plVar5[1];
      if ((undefined8 *)*plVar5 == puVar6) {
        return (undefined8 *)0x0;
      }
      uVar3 = *auVar10._8_8_;
      lVar2 = auVar10._8_8_[1];
      puVar7 = (undefined8 *)*plVar5;
      break;
    }
    lVar2 = unaff_x28 + 0x68;
    unaff_x19[2] = lVar2;
    pcVar1 = (char *)(unaff_x28 + 0x61);
    unaff_x28 = lVar2;
    if ((*pcVar1 != '\0') && (*(long *)(in_stack_00000018 + 0x90) != 0)) {
      uVar3 = *puVar6;
      lVar2 = puVar6[1];
      puVar9 = (undefined8 *)(*(long *)(in_stack_00000018 + 0x88) + 0x218);
      lVar8 = *(long *)(in_stack_00000018 + 0x90) * 600;
      do {
        if ((puVar9[1] == lVar2) && (iVar4 = _memcmp(*puVar9,uVar3,lVar2), iVar4 == 0)) {
          puVar7 = puVar6;
          if ((*(byte *)(puVar9 + 7) >> 2 & 1) == 0) goto LAB_00520554;
          break;
        }
        puVar9 = puVar9 + 0x4b;
        lVar8 = lVar8 + -600;
      } while (lVar8 != 0);
    }
  } while( true );
LAB_005205c4:
  puVar9 = puVar7;
  if ((puVar9[1] == lVar2) && (iVar4 = _memcmp(*puVar9,uVar3,lVar2), iVar4 == 0)) {
    puVar6 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    goto LAB_005205f4;
  }
  puVar7 = puVar9 + 2;
  if (puVar9 + 2 == puVar6) {
    puVar6 = (undefined8 *)0x0;
LAB_005205f4:
    *plVar5 = (long)(puVar9 + 2);
    return puVar6;
  }
  goto LAB_005205c4;
}

