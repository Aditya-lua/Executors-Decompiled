
void FUN_006c26e8(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  ulong uVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  undefined4 unaff_w20;
  undefined4 unaff_w21;
  undefined1 auVar12 [16];
  undefined4 in_stack_00000040;
  
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w20;
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w20;
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w21;
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w21;
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  __Unwind_Resume();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w21;
  *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040;
  auVar12 = __Unwind_Resume();
  uVar6 = auVar12._8_8_;
  puVar5 = auVar12._0_8_;
  iVar7 = *(int *)(uVar6 + 8);
  if (((iVar7 != iRam0000000000a27a98 && iVar7 != iRam0000000000a27aa8) &&
      iVar7 != iRam0000000000a27ab8) && iVar7 != iRam0000000000a27af8) {
    if ((puVar5[0x22] != 0) && (puVar5[0x23] != uVar6)) {
      uVar8 = 0;
      uVar9 = uVar6 >> 4 ^ uVar6 >> 9;
      do {
        uVar9 = uVar9 & puVar5[0x21] - 1;
        uVar10 = *(ulong *)(puVar5[0x20] + uVar9 * 0x20);
        if (uVar10 == uVar6) {
          if (*(int *)(puVar5[0x20] + uVar9 * 0x20 + 8) != 0) {
            return;
          }
          break;
        }
        uVar8 = uVar8 + 1;
        uVar9 = uVar8 + uVar9;
      } while (uVar10 != puVar5[0x23] && uVar8 <= puVar5[0x21] - 1);
    }
    if (iVar7 != iRam0000000000a27ac8) {
      func_0x006b3160(*puVar5,"expression only compiled for side effects");
      iVar7 = *(int *)(uVar6 + 8);
    }
    uVar3 = *(uint *)((long)puVar5 + 0x484);
    uVar8 = uVar6;
    if ((uVar6 == 0) || (iVar7 != iRam0000000000a27a98)) {
      do {
        if ((iVar7 != iRam0000000000a27a48) && (iVar7 != iRam0000000000a27b38)) goto LAB_006c294c;
        uVar8 = *(ulong *)(uVar8 + 0x20);
        iVar7 = *(int *)(uVar8 + 8);
      } while (uVar8 == 0 || iVar7 != iRam0000000000a27a98);
    }
    if (puVar5[0x13] != 0) {
      uVar8 = *(ulong *)(uVar8 + 0x20);
      if (uVar8 != puVar5[0x14]) {
        uVar9 = 0;
        uVar10 = uVar8 >> 4 ^ uVar8 >> 9;
        do {
          uVar10 = uVar10 & puVar5[0x12] - 1;
          uVar11 = *(ulong *)(puVar5[0x11] + uVar10 * 0x18);
          if (uVar11 == uVar8) {
            if (*(char *)(puVar5[0x11] + uVar10 * 0x18 + 9) != '\0') goto code_r0x006c2980;
            break;
          }
          uVar9 = uVar9 + 1;
          uVar10 = uVar9 + uVar10;
        } while (uVar11 != puVar5[0x14] && uVar9 <= puVar5[0x12] - 1);
      }
    }
LAB_006c294c:
    uVar1 = uVar3 + 1;
    if (0xff < uVar1) {
      func_0x006bc388(uVar6 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6c29dc);
      (*pcVar4)();
    }
    *(uint *)((long)puVar5 + 0x484) = uVar1;
    uVar2 = *(uint *)(puVar5 + 0x91);
    if (*(uint *)(puVar5 + 0x91) <= uVar1) {
      uVar2 = uVar1;
    }
    *(uint *)(puVar5 + 0x91) = uVar2;
    func_0x006c6028(puVar5,uVar6,uVar3 & 0xff,1);
code_r0x006c2980:
    *(uint *)((long)puVar5 + 0x484) = uVar3;
  }
  return;
}

