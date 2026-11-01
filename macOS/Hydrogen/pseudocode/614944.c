
/* WARNING: Possible PIC construction at 0x00614c78: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00614c7c) */
/* WARNING: Removing unreachable block (ram,0x00614cf0) */
/* WARNING: Removing unreachable block (ram,0x00614cf8) */
/* WARNING: Removing unreachable block (ram,0x00614d24) */
/* WARNING: Removing unreachable block (ram,0x00614d3c) */
/* WARNING: Removing unreachable block (ram,0x00614d00) */
/* WARNING: Removing unreachable block (ram,0x00614d44) */
/* WARNING: Removing unreachable block (ram,0x00614d08) */
/* WARNING: Removing unreachable block (ram,0x00614d48) */
/* WARNING: Removing unreachable block (ram,0x00614d94) */
/* WARNING: Removing unreachable block (ram,0x00614de0) */
/* WARNING: Removing unreachable block (ram,0x00614df8) */
/* WARNING: Removing unreachable block (ram,0x00614dc0) */
/* WARNING: Removing unreachable block (ram,0x00614dc8) */
/* WARNING: Removing unreachable block (ram,0x00614e00) */
/* WARNING: Removing unreachable block (ram,0x00614e18) */
/* WARNING: Removing unreachable block (ram,0x00614e20) */
/* WARNING: Removing unreachable block (ram,0x00614e2c) */
/* WARNING: Removing unreachable block (ram,0x00614e34) */
/* WARNING: Removing unreachable block (ram,0x00614e44) */
/* WARNING: Removing unreachable block (ram,0x00614e4c) */
/* WARNING: Removing unreachable block (ram,0x00614e78) */
/* WARNING: Removing unreachable block (ram,0x00614e84) */
/* WARNING: Removing unreachable block (ram,0x00614eec) */
/* WARNING: Removing unreachable block (ram,0x00614f0c) */
/* WARNING: Removing unreachable block (ram,0x00614f48) */
/* WARNING: Removing unreachable block (ram,0x00614f7c) */
/* WARNING: Removing unreachable block (ram,0x00614f90) */
/* WARNING: Removing unreachable block (ram,0x00614e8c) */
/* WARNING: Removing unreachable block (ram,0x00614e64) */
/* WARNING: Removing unreachable block (ram,0x00615028) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00614944(code *param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  byte *pbVar6;
  undefined8 *puVar7;
  undefined8 extraout_x1;
  byte *pbVar8;
  uint uVar9;
  long *unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  long *in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  long *in_stack_000000b0;
  undefined1 in_stack_000000b8;
  undefined1 uStack00000000000000b9;
  ulong uStack_140;
  char cStack_131;
  undefined *puStack_70;
  undefined *puStack_68;
  undefined4 uStack_58;
  undefined1 uStack_54;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined1 uStack_40;
  undefined8 uStack_38;
  
  (*param_1)();
  uStack00000000000000b9 = 1;
  uVar3 = func_0x00698d50(&uStack0000000000000068);
  uStack0000000000000010 = (undefined *)CONCAT71(uStack0000000000000010._1_7_,in_stack_000000b8);
  (**(code **)(*in_stack_000000b0 + 0x38))(in_stack_000000b0,&uStack0000000000000010,1,0,1);
  func_0x00611648(in_stack_000000b0,uVar3);
  uStack0000000000000010 = (undefined *)0xffffffffffffffff;
  (**(code **)(uStack0000000000000068 + 0x118))
            (&uStack0000000000000068,in_stack_000000b0,&uStack0000000000000010,&UNK_008ba5c8,1);
  func_0x0069862c(&uStack0000000000000010,0);
  uStack0000000000000010 = &UNK_009f6a68;
  in_stack_00000018 = &UNK_009f6bf8;
  in_stack_00000058 = (long *)(unaff_x29 + -0x90);
  _uStack0000000000000060 = 3;
  uStack0000000000000008 = uStack0000000000000008 & 0xffffffffffffff00;
  func_0x00698dbc(&uStack0000000000000010,&uStack0000000000000008,1,0,1);
  (**(code **)(*unaff_x19 + 0x58))();
  _uStack0000000000000060 = CONCAT11(1,uStack0000000000000060);
  uVar3 = func_0x00698d50(&uStack0000000000000010);
  uStack0000000000000008 = CONCAT71(uStack0000000000000008._1_7_,uStack0000000000000060);
  (**(code **)(*in_stack_00000058 + 0x38))(in_stack_00000058,&uStack0000000000000008,1,0,1);
  func_0x00611648(in_stack_00000058,uVar3);
  uStack0000000000000008 = 0xffffffffffffffff;
  (**(code **)(uStack0000000000000010 + 0x118))
            (&uStack0000000000000010,in_stack_00000058,&uStack0000000000000008,&UNK_008ba5c8,1);
  *(undefined1 *)(unaff_x29 + -0x3f) = 1;
  uVar3 = func_0x00698d50(unaff_x29 + -0x90);
  uStack0000000000000008 = CONCAT71(uStack0000000000000008._1_7_,*(undefined1 *)(unaff_x29 + -0x40))
  ;
  (**(code **)(**(long **)(unaff_x29 + -0x48) + 0x38))
            (*(long **)(unaff_x29 + -0x48),&uStack0000000000000008,1,0,1);
  func_0x00611648(*(undefined8 *)(unaff_x29 + -0x48),uVar3);
  uStack0000000000000008 = 0xffffffffffffffff;
  (**(code **)(*(long *)(unaff_x29 + -0x90) + 0x118))
            (unaff_x29 + -0x90,*(undefined8 *)(unaff_x29 + -0x48),&uStack0000000000000008,
             &UNK_008ba5c8,1);
  func_0x006143a8(&uStack0000000000000010);
  func_0x006143a8(&uStack0000000000000068);
  func_0x006143a8(unaff_x29 + -0x90);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  uVar3 = ___stack_chk_fail();
  func_0x006143a8(&uStack0000000000000068);
  func_0x006143a8(unaff_x29 + -0x90);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x006143a8(&uStack0000000000000010);
  func_0x006143a8(&uStack0000000000000068);
  func_0x006143a8(unaff_x29 + -0x90);
  __Unwind_Resume(uVar3);
  uStack_38 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uVar3 = func_0x005edf2c(&puStack_70,0);
  uStack_58 = 0xffffffff;
  uStack_54 = 0;
  puStack_70 = &UNK_009f68a0;
  puStack_68 = &UNK_009f6a38;
  uStack_48 = 0;
  uStack_40 = 0;
  uStack_50 = extraout_x1;
  func_0x00613e90(uVar3,0x30);
  puStack_70 = &UNK_009f6498;
  puStack_68 = &UNK_009f6630;
  lVar4 = (*_UNK_009f6540)(&puStack_70,&cStack_131);
  if ((((lVar4 == 0 || cStack_131 != '\x02') ||
       (uVar5 = func_0x006118e8(&puStack_70,&uStack_140), uVar1 = uStack_140, (uVar5 & 1) == 0)) ||
      (uVar5 = (**(code **)(puStack_70 + 0x98))(&puStack_70), uVar5 < uVar1)) || (uVar1 == 0)) {
    puVar7 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar7 + 1) = 1;
    puVar7[2] = 0x6f63656420524542;
    puVar7[3] = 0x726f727265206564;
    *(undefined1 *)(puVar7 + 4) = 0;
    *(undefined1 *)((long)puVar7 + 0x27) = 0x10;
    *puVar7 = &UNK_009f60b8;
    ___cxa_throw(puVar7,&UNK_009f6090,&DAT_0060f08c);
  }
  else {
    if (uVar1 == 0) {
      pbVar6 = (byte *)0x0;
    }
    else {
      pbVar6 = (byte *)func_0x006115d0(uVar1);
    }
    uVar5 = (**(code **)(puStack_70 + 0xb0))(&puStack_70,pbVar6,uVar1);
    if (uVar1 == uVar5) {
      if (uVar1 < 5) {
        pbVar8 = pbVar6;
        uVar5 = uVar1;
        if (uVar1 == 0) goto code_r0x006150f8;
      }
      else {
        pbVar8 = pbVar6;
        uVar5 = uVar1;
        do {
          if (*pbVar8 != 0) goto LAB_00615140;
          uVar5 = uVar5 - 1;
          pbVar8 = pbVar8 + 1;
        } while (4 < uVar5);
        uStack_140 = 4;
        pbVar8 = pbVar6 + (uVar1 - 4);
        uVar5 = 4;
      }
      uVar9 = 0;
      do {
        uVar9 = (uint)*pbVar8 | uVar9 << 8;
        uVar5 = uVar5 - 1;
        pbVar8 = pbVar8 + 1;
      } while (uVar5 != 0);
      if (uVar9 == 0) {
code_r0x006150f8:
        if (pbVar6 != (byte *)0x0) {
          for (; uVar1 != 0; uVar1 = uVar1 - 1) {
            pbVar6[uVar1 - 1] = 0;
          }
          func_0x00611644(pbVar6);
        }
        return;
      }
LAB_00615140:
      puVar7 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar7 + 1) = 1;
      puVar7[2] = 0x6f63656420524542;
      puVar7[3] = 0x726f727265206564;
      *(undefined1 *)(puVar7 + 4) = 0;
      *(undefined1 *)((long)puVar7 + 0x27) = 0x10;
      *puVar7 = &UNK_009f60b8;
      ___cxa_throw(puVar7,&UNK_009f6090,&DAT_0060f08c);
      goto LAB_00615264;
    }
  }
  puVar7 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar7 + 1) = 1;
  puVar7[2] = 0x6f63656420524542;
  puVar7[3] = 0x726f727265206564;
  *(undefined1 *)(puVar7 + 4) = 0;
  *(undefined1 *)((long)puVar7 + 0x27) = 0x10;
  *puVar7 = &UNK_009f60b8;
  ___cxa_throw(puVar7,&UNK_009f6090,&DAT_0060f08c);
LAB_00615264:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x615268);
  (*pcVar2)();
}

