
void FUN_0028f694(void)

{
  char *pcVar1;
  undefined1 *puVar2;
  uint uVar3;
  int iVar4;
  code *pcVar5;
  code *pcVar6;
  long lVar7;
  undefined8 uVar8;
  long unaff_x19;
  code *unaff_x20;
  code *unaff_x21;
  char *unaff_x22;
  undefined1 *unaff_x23;
  char *unaff_x24;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000018;
  
  _snprintf();
  if (unaff_x23 == (undefined1 *)0x0) {
    unaff_x23 = &uStack0000000000000018;
    _snprintf(&uStack0000000000000018,0x20,"reason(%u)");
  }
  uVar3 = _snprintf();
  if (((&MACH_HEADER.cputype < unaff_x20) && (-1 < (int)uVar3)) &&
     (unaff_x20 <= (code *)(ulong)uVar3)) {
    pcVar6 = unaff_x20 + unaff_x19;
    unaff_x20 = pcVar6 + -5;
    pcVar5 = (code *)_strchr();
    uVar8 = 4;
    unaff_x21 = pcVar6;
    if ((pcVar5 != (code *)0x0) && (pcVar5 <= unaff_x20)) {
      unaff_x21 = pcVar6 + -1;
      pcVar5 = (code *)_strchr(pcVar5 + 1,0x3a,4);
      unaff_x20 = pcVar6 + -4;
      uVar8 = 3;
      if ((pcVar5 != (code *)0x0) && (pcVar5 <= unaff_x20)) {
        pcVar5 = (code *)_strchr(pcVar5 + 1,0x3a,3);
        unaff_x20 = pcVar6 + -3;
        uVar8 = 2;
        if ((pcVar5 != (code *)0x0) && (pcVar5 <= unaff_x20)) {
          pcVar5 = (code *)_strchr(pcVar5 + 1,0x3a,2);
          unaff_x20 = pcVar6 + -2;
          uVar8 = 1;
          if ((pcVar5 != (code *)0x0) && (pcVar5 <= unaff_x20)) goto code_r0x0028f644;
        }
      }
    }
    _memset(unaff_x20,0x3a,uVar8);
  }
code_r0x0028f644:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  puVar9 = &_aws_lc_0_24_0_ERR_print_errors_cb;
  auVar10 = ___stack_chk_fail();
  puVar2 = (undefined1 *)register0x00000008;
  do {
    lVar7 = auVar10._8_8_;
    pcVar6 = auVar10._0_8_;
    *(undefined8 *)(puVar2 + -0x50) = unaff_x28;
    *(undefined8 *)(puVar2 + -0x48) = unaff_x27;
    *(char **)(puVar2 + -0x40) = unaff_x24;
    *(undefined1 **)(puVar2 + -0x38) = unaff_x23;
    *(char **)(puVar2 + -0x30) = unaff_x22;
    *(code **)(puVar2 + -0x28) = unaff_x21;
    *(code **)(puVar2 + -0x20) = unaff_x20;
    *(long *)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
    *(undefined **)(puVar2 + -8) = puVar9;
    unaff_x29 = puVar2 + -0x10;
    *(undefined8 *)(puVar2 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    unaff_x21 = (code *)func_0x00373eb8(0);
    if (((unaff_x21 == (code *)0x0) &&
        (unaff_x21 = (code *)_calloc(1,400), unaff_x21 != (code *)0x0)) &&
       (iVar4 = func_0x00373f5c(0,unaff_x21,0x290080), iVar4 == 0)) {
      unaff_x21 = (code *)0x0;
    }
    unaff_x23 = puVar2 + -0xd0;
    unaff_x24 = "";
    unaff_x22 = "%lu:%s:%s:%d:%s\n";
    do {
      uVar8 = func_0x0028ebe8(1,0,puVar2 + -0x4d8,puVar2 + -0x4e4,puVar2 + -0x4e0,puVar2 + -0x4e8);
      if ((int)uVar8 == 0) break;
      func_0x0028f43c(uVar8,puVar2 + -0xd0,0x78);
      pcVar1 = "";
      if ((*(uint *)(puVar2 + -0x4e8) & 1) != 0) {
        pcVar1 = *(char **)(puVar2 + -0x4e0);
      }
      *(ulong *)(puVar2 + -0x4f8) = (ulong)*(uint *)(puVar2 + -0x4e4);
      *(char **)(puVar2 + -0x4f0) = pcVar1;
      *(undefined1 **)(puVar2 + -0x508) = unaff_x23;
      *(undefined8 *)(puVar2 + -0x500) = *(undefined8 *)(puVar2 + -0x4d8);
      *(code **)(puVar2 + -0x510) = unaff_x21;
      _snprintf(puVar2 + -0x4d0,0x400,"%lu:%s:%s:%d:%s\n");
      uVar8 = _strlen(puVar2 + -0x4d0);
      iVar4 = (*pcVar6)(puVar2 + -0x4d0,uVar8,lVar7);
    } while (0 < iVar4);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar2 + -0x58)) {
      return;
    }
    puVar9 = &_aws_lc_0_24_0_ERR_print_errors_fp;
    uVar8 = ___stack_chk_fail();
    auVar10._8_8_ = uVar8;
    auVar10._0_8_ = &DAT_0028f810;
    puVar2 = puVar2 + -0x510;
    unaff_x19 = lVar7;
    unaff_x20 = pcVar6;
  } while( true );
}

