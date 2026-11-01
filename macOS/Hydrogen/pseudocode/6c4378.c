
void FUN_006c4378(uint param_1)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  ulong uVar7;
  long lVar8;
  int iVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar13;
  undefined8 uVar14;
  undefined1 unaff_w24;
  uint uVar15;
  int in_stack_00000028;
  long in_stack_00000050;
  undefined4 in_stack_00000058;
  
  if ((int)param_1 < 0) {
    func_0x006bc388(unaff_x21 + 0xc,"Exceeded constant limit; simplify the code to compile");
code_r0x006c46b0:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x6c46b4);
    (*pcVar3)();
  }
  if (param_1 < 0x100) {
    if (*(uint *)(unaff_x20 + 0x20) < 7) {
      uVar6 = *(undefined4 *)(&UNK_008c6f74 + (long)(int)*(uint *)(unaff_x20 + 0x20) * 4);
    }
    else {
      uVar6 = 0;
    }
    func_0x006b1ccc(*unaff_x19,uVar6,unaff_w24,unaff_w24,param_1 & 0xff);
  }
  else {
    lVar13 = *(long *)(unaff_x20 + 0x30);
    iVar9 = *(int *)(lVar13 + 8);
    lVar8 = lVar13;
    if ((lVar13 == 0) || (iVar9 != iRam0000000000a27a98)) {
      do {
        if ((iVar9 != iRam0000000000a27a48) && (iVar9 != iRam0000000000a27b38)) goto LAB_006c4490;
        lVar8 = *(long *)(lVar8 + 0x20);
        iVar9 = *(int *)(lVar8 + 8);
      } while (lVar8 == 0 || iVar9 != iRam0000000000a27a98);
    }
    if (unaff_x19[0x13] != 0) {
      uVar7 = *(ulong *)(lVar8 + 0x20);
      if (uVar7 != unaff_x19[0x14]) {
        uVar10 = 0;
        lVar8 = unaff_x19[0x11];
        uVar11 = uVar7 >> 4 ^ uVar7 >> 9;
        do {
          uVar11 = uVar11 & unaff_x19[0x12] - 1;
          uVar12 = *(ulong *)(lVar8 + uVar11 * 0x18);
          if (uVar12 == uVar7) {
            if (*(char *)(lVar8 + uVar11 * 0x18 + 9) != '\0') {
              uVar15 = (uint)*(byte *)(lVar8 + uVar11 * 0x18 + 8);
              uVar5 = *unaff_x19;
              uVar1 = *(uint *)(unaff_x20 + 0x20);
              goto joined_r0x006c4510;
            }
            break;
          }
          uVar10 = uVar10 + 1;
          uVar11 = uVar10 + uVar11;
        } while (uVar12 != unaff_x19[0x14] && uVar10 <= unaff_x19[0x12] - 1);
      }
    }
LAB_006c4490:
    uVar15 = *(uint *)((long)unaff_x19 + 0x484);
    uVar1 = uVar15 + 1;
    if (0xff < uVar1) {
      func_0x006bc388(lVar13 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto code_r0x006c46b0;
    }
    *(uint *)((long)unaff_x19 + 0x484) = uVar1;
    uVar2 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
      uVar2 = uVar1;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar2;
    func_0x006c6028();
    uVar5 = *unaff_x19;
    uVar1 = *(uint *)(unaff_x20 + 0x20);
joined_r0x006c4510:
    if (uVar1 < 7) {
      uVar6 = *(undefined4 *)(&UNK_008c6f90 + (long)(int)uVar1 * 4);
    }
    else {
      uVar6 = 0;
    }
    func_0x006b1ccc(uVar5,uVar6,unaff_w24,unaff_w24,uVar15 & 0xff);
    if ((in_stack_00000028 != 0) && (unaff_x19[0x45] != 0)) {
      uVar7 = *(ulong *)(unaff_x20 + 0x28);
      if (unaff_x19[0x46] != uVar7) {
        uVar10 = 0;
        uVar11 = uVar7 >> 4 ^ uVar7 >> 9;
        do {
          uVar11 = uVar11 & unaff_x19[0x44] - 1;
          uVar12 = *(ulong *)(unaff_x19[0x43] + uVar11 * 0x10);
          if (uVar12 == uVar7) {
            iVar9 = *(int *)(unaff_x19[0x43] + uVar11 * 0x10 + 8);
            if (iVar9 != 2) {
              uVar14 = *unaff_x19;
              iVar4 = func_0x006b3150(uVar14);
              uVar5 = func_0x006b3150(*unaff_x19);
              func_0x006b29ec(uVar14,iVar9,unaff_w24,iVar4 + -1,uVar5);
            }
            break;
          }
          uVar10 = uVar10 + 1;
          uVar11 = uVar10 + uVar11;
        } while (uVar12 != unaff_x19[0x46] && uVar10 <= unaff_x19[0x44] - 1);
      }
    }
    func_0x006c9bf0();
  }
  if (in_stack_00000028 != 0) {
    func_0x006ca134();
  }
  *(undefined4 *)(in_stack_00000050 + 0x484) = in_stack_00000058;
  return;
}

