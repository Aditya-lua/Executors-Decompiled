
void FUN_0028f4d8(void)

{
  char *pcVar1;
  undefined1 *puVar2;
  uint uVar3;
  int iVar4;
  undefined1 *puVar5;
  code *pcVar6;
  code *pcVar7;
  long lVar8;
  undefined8 uVar9;
  long unaff_x19;
  code *unaff_x20;
  code *unaff_x21;
  char *unaff_x22;
  char *unaff_x24;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar10;
  undefined1 auVar11 [16];
  undefined8 in_stack_00000000;
  undefined1 uStack0000000000000018;
  char cStack0000000000000038;
  
  puVar5 = (undefined1 *)_strerror();
  if (unaff_x24 == (char *)0x0) {
    unaff_x24 = &cStack0000000000000038;
    _snprintf(&cStack0000000000000038,0x20,"lib(%u)");
  }
  if (puVar5 == (undefined1 *)0x0) {
    puVar5 = &uStack0000000000000018;
    _snprintf(&uStack0000000000000018,0x20,"reason(%u)");
  }
  uVar3 = _snprintf();
  if (((&MACH_HEADER.cputype < unaff_x20) && (-1 < (int)uVar3)) &&
     (unaff_x20 <= (code *)(ulong)uVar3)) {
    pcVar7 = unaff_x20 + unaff_x19;
    unaff_x20 = pcVar7 + -5;
    pcVar6 = (code *)_strchr();
    uVar9 = 4;
    unaff_x21 = pcVar7;
    if ((pcVar6 != (code *)0x0) && (pcVar6 <= unaff_x20)) {
      unaff_x21 = pcVar7 + -1;
      pcVar6 = (code *)_strchr(pcVar6 + 1,0x3a,4);
      unaff_x20 = pcVar7 + -4;
      uVar9 = 3;
      if ((pcVar6 != (code *)0x0) && (pcVar6 <= unaff_x20)) {
        pcVar6 = (code *)_strchr(pcVar6 + 1,0x3a,3);
        unaff_x20 = pcVar7 + -3;
        uVar9 = 2;
        if ((pcVar6 != (code *)0x0) && (pcVar6 <= unaff_x20)) {
          pcVar6 = (code *)_strchr(pcVar6 + 1,0x3a,2);
          unaff_x20 = pcVar7 + -2;
          uVar9 = 1;
          if ((pcVar6 != (code *)0x0) && (pcVar6 <= unaff_x20)) goto LAB_0028f644;
        }
      }
    }
    _memset(unaff_x20,0x3a,uVar9);
  }
LAB_0028f644:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  puVar10 = &_aws_lc_0_24_0_ERR_print_errors_cb;
  auVar11 = ___stack_chk_fail();
  puVar2 = (undefined1 *)register0x00000008;
  do {
    lVar8 = auVar11._8_8_;
    pcVar7 = auVar11._0_8_;
    *(undefined8 *)(puVar2 + -0x50) = unaff_x28;
    *(undefined8 *)(puVar2 + -0x48) = unaff_x27;
    *(char **)(puVar2 + -0x40) = unaff_x24;
    *(undefined1 **)(puVar2 + -0x38) = puVar5;
    *(char **)(puVar2 + -0x30) = unaff_x22;
    *(code **)(puVar2 + -0x28) = unaff_x21;
    *(code **)(puVar2 + -0x20) = unaff_x20;
    *(long *)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
    *(undefined **)(puVar2 + -8) = puVar10;
    unaff_x29 = puVar2 + -0x10;
    *(undefined8 *)(puVar2 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    unaff_x21 = (code *)func_0x00373eb8(0);
    if (((unaff_x21 == (code *)0x0) &&
        (unaff_x21 = (code *)_calloc(1,400), unaff_x21 != (code *)0x0)) &&
       (iVar4 = func_0x00373f5c(0,unaff_x21,&DAT_00290080), iVar4 == 0)) {
      unaff_x21 = (code *)0x0;
    }
    puVar5 = puVar2 + -0xd0;
    unaff_x24 = "";
    unaff_x22 = "%lu:%s:%s:%d:%s\n";
    do {
      uVar9 = func_0x0028ebe8(1,0,puVar2 + -0x4d8,puVar2 + -0x4e4,puVar2 + -0x4e0,puVar2 + -0x4e8);
      if ((int)uVar9 == 0) break;
      func_0x0028f43c(uVar9,puVar2 + -0xd0,0x78);
      pcVar1 = "";
      if ((*(uint *)(puVar2 + -0x4e8) & 1) != 0) {
        pcVar1 = *(char **)(puVar2 + -0x4e0);
      }
      *(ulong *)(puVar2 + -0x4f8) = (ulong)*(uint *)(puVar2 + -0x4e4);
      *(char **)(puVar2 + -0x4f0) = pcVar1;
      *(undefined1 **)(puVar2 + -0x508) = puVar5;
      *(undefined8 *)(puVar2 + -0x500) = *(undefined8 *)(puVar2 + -0x4d8);
      *(code **)(puVar2 + -0x510) = unaff_x21;
      _snprintf(puVar2 + -0x4d0,0x400,"%lu:%s:%s:%d:%s\n");
      uVar9 = _strlen(puVar2 + -0x4d0);
      iVar4 = (*pcVar7)(puVar2 + -0x4d0,uVar9,lVar8);
    } while (0 < iVar4);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar2 + -0x58)) {
      return;
    }
    puVar10 = (undefined *)0x28f800;
    uVar9 = ___stack_chk_fail();
    auVar11._8_8_ = uVar9;
    auVar11._0_8_ = &DAT_0028f810;
    puVar2 = puVar2 + -0x510;
    unaff_x19 = lVar8;
    unaff_x20 = pcVar7;
  } while( true );
}

