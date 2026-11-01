
char * FUN_006f4f00(void)

{
  char *pcVar1;
  undefined8 uVar2;
  char *pcVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong in_x3;
  long *plVar7;
  long unaff_x19;
  undefined8 *puVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined1 uStack0000000000000008;
  
  puVar8 = *(undefined8 **)(unaff_x19 + 8);
  pcVar1 = (char *)_strlen(&uStack0000000000000008);
  uVar2 = func_0x006f6ef8();
  *puVar8 = uVar2;
  *(undefined4 *)((long)puVar8 + 0xc) = 5;
  plVar7 = *(long **)(unaff_x19 + 8);
  if (*(long *)(unaff_x19 + 0x28) - (long)plVar7 < 0x11) {
    func_0x006ee1d4();
    plVar7 = *(long **)(unaff_x19 + 8);
  }
  *(long **)(unaff_x19 + 8) = plVar7 + 2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return (char *)(*plVar7 + 0x18);
  }
  auVar9 = ___stack_chk_fail();
  uVar6 = auVar9._8_8_;
  pcVar3 = auVar9._0_8_;
  if (*pcVar1 == '@') {
    if (uVar6 < in_x3) {
      pcVar3[2] = '.';
      pcVar3[0] = '.';
      pcVar3[1] = '.';
      _memcpy(pcVar3 + 3,pcVar1 + (in_x3 - uVar6) + 4,uVar6 - 4);
      pcVar3[uVar6 - 1] = '\0';
      return pcVar3;
    }
    return pcVar1 + 1;
  }
  if (*pcVar1 == '=') {
    if (uVar6 < in_x3) {
      _memcpy(pcVar3,pcVar1 + 1,uVar6 - 1);
      pcVar3[uVar6 - 1] = '\0';
      return pcVar3;
    }
    return pcVar1 + 1;
  }
  uVar4 = _strcspn(pcVar1,"\n\r");
  if (uVar6 - 0xf <= uVar4) {
    uVar4 = uVar6 - 0xf;
  }
  pcVar3[8] = '\"';
  pcVar3[9] = '\0';
  *(undefined8 *)pcVar3 = s__string___008eb539._0_8_;
  if (pcVar1[uVar4] == '\0') {
    _strcat(pcVar3,pcVar1);
  }
  else {
    _strncat(pcVar3,pcVar1);
    lVar5 = _strlen();
    builtin_strncpy(pcVar3 + lVar5,"...",4);
  }
  lVar5 = _strlen(pcVar3);
  pcVar1 = pcVar3 + lVar5;
  pcVar1[0] = '\"';
  pcVar1[1] = ']';
  pcVar1[2] = '\0';
  return pcVar3;
}

