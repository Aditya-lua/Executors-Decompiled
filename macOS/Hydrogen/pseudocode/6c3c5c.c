
void FUN_006c3c5c(void)

{
  uint uVar1;
  ulong uVar2;
  char cVar3;
  uint uVar4;
  char cVar5;
  code *pcVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  char *pcVar10;
  int iVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *unaff_x19;
  long unaff_x20;
  int *piVar14;
  long *unaff_x21;
  int *piVar15;
  long lVar16;
  long lVar17;
  uint uVar18;
  ulong uVar19;
  ulong uVar20;
  int *in_stack_00000010;
  int *in_stack_00000018;
  long in_stack_00000050;
  undefined4 in_stack_00000058;
  
  func_0x006cf560();
  uVar19 = *(ulong *)(unaff_x20 + 0x28);
  if (uVar19 != 0) {
    lVar16 = 0;
    lVar17 = 0x89;
    uVar20 = 0;
    do {
      uVar8 = *(ulong *)(unaff_x20 + 0x38);
      if (uVar8 <= uVar20) break;
      lVar7 = *(long *)(*unaff_x21 + uVar20 * 8);
      uVar2 = uVar20 + 1;
      if ((uVar2 == uVar8 && uVar8 <= uVar19) && (uVar2 != uVar8 || uVar19 != uVar8)) {
        iVar11 = *(int *)((long)unaff_x19 + 0x484);
        uVar18 = iVar11 + (((int)uVar19 - (int)uVar8) + 1U & 0xff);
        if (0xff < uVar18) {
          func_0x006bc388(unaff_x20 + 0xc,
                          "Out of registers when trying to allocate %d registers: exceeded limit %d"
                         );
code_r0x006c4140:
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x6c4144);
          (*pcVar6)();
        }
        *(uint *)((long)unaff_x19 + 0x484) = uVar18;
        uVar1 = *(uint *)(unaff_x19 + 0x91);
        if (*(uint *)(unaff_x19 + 0x91) <= uVar18) {
          uVar1 = uVar18;
        }
        *(uint *)(unaff_x19 + 0x91) = uVar1;
        func_0x006cbbf4();
        uVar8 = *(ulong *)(unaff_x20 + 0x28);
        uVar19 = uVar8 - uVar20;
        if (uVar20 <= uVar8 && uVar19 != 0) {
          cVar3 = (char)iVar11;
          if (3 < uVar19) {
            uVar12 = 0;
            uVar20 = uVar20 + (uVar19 & 0xfffffffffffffffc);
            pcVar10 = (char *)((long)in_stack_00000010 + lVar17);
            do {
              cVar5 = (char)uVar12 + cVar3;
              pcVar10[-0x60] = cVar5;
              pcVar10[-0x30] = cVar5 + '\x01';
              *pcVar10 = cVar5 + '\x02';
              pcVar10[0x30] = cVar5 + '\x03';
              uVar12 = uVar12 + 4;
              pcVar10 = pcVar10 + 0xc0;
            } while ((uVar8 + lVar16 & 0xfffffffffffffffc) != uVar12);
            if (uVar19 == (uVar19 & 0xfffffffffffffffc)) goto LAB_006c3cb4;
          }
          pcVar10 = (char *)((long)in_stack_00000010 + uVar20 * 0x30 + 0x29);
          do {
            *pcVar10 = (char)lVar16 + (char)uVar20 + cVar3;
            uVar20 = uVar20 + 1;
            pcVar10 = pcVar10 + 0x30;
          } while (uVar8 != uVar20);
        }
      }
      else if (in_stack_00000010[uVar20 * 0xc] == 0) {
        cVar3 = (char)(in_stack_00000010 + uVar20 * 0xc)[1];
        if ((char)in_stack_00000010[uVar20 * 0xc + 10] != -1) {
          cVar3 = (char)in_stack_00000010[uVar20 * 0xc + 10];
        }
        *(char *)((long)in_stack_00000010 + uVar20 * 0x30 + 0x29) = cVar3;
        func_0x006c6028();
      }
      else {
        iVar11 = *(int *)(lVar7 + 8);
        lVar9 = lVar7;
        if (lVar7 == 0 || iVar11 != iRam0000000000a27a98) {
          do {
            if ((iVar11 != iRam0000000000a27a48) && (iVar11 != iRam0000000000a27b38))
            goto LAB_006c3e80;
            lVar9 = *(long *)(lVar9 + 0x20);
            iVar11 = *(int *)(lVar9 + 8);
          } while (lVar9 == 0 || iVar11 != iRam0000000000a27a98);
        }
        if (unaff_x19[0x13] != 0) {
          uVar19 = *(ulong *)(lVar9 + 0x20);
          if (uVar19 != unaff_x19[0x14]) {
            uVar8 = 0;
            lVar9 = unaff_x19[0x11];
            uVar12 = uVar19 >> 4 ^ uVar19 >> 9;
            do {
              uVar12 = uVar12 & unaff_x19[0x12] - 1;
              uVar13 = *(ulong *)(lVar9 + uVar12 * 0x18);
              if (uVar13 == uVar19) {
                if (*(char *)(lVar9 + uVar12 * 0x18 + 9) != '\0') {
                  uVar18 = (uint)*(byte *)(lVar9 + uVar12 * 0x18 + 8);
                  goto LAB_006c3eb8;
                }
                break;
              }
              uVar8 = uVar8 + 1;
              uVar12 = uVar8 + uVar12;
            } while (uVar13 != unaff_x19[0x14] && uVar8 <= unaff_x19[0x12] - 1);
          }
        }
LAB_006c3e80:
        uVar18 = *(uint *)((long)unaff_x19 + 0x484);
        uVar1 = uVar18 + 1;
        if (0xff < uVar1) {
          func_0x006bc388(lVar7 + 0xc,
                          "Out of registers when trying to allocate %d registers: exceeded limit %d"
                         );
          goto code_r0x006c4140;
        }
        *(uint *)((long)unaff_x19 + 0x484) = uVar1;
        uVar4 = *(uint *)(unaff_x19 + 0x91);
        if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
          uVar4 = uVar1;
        }
        *(uint *)(unaff_x19 + 0x91) = uVar4;
        func_0x006c6028();
LAB_006c3eb8:
        *(char *)((long)in_stack_00000010 + uVar20 * 0x30 + 0x29) = (char)uVar18;
      }
LAB_006c3cb4:
      uVar19 = *(ulong *)(unaff_x20 + 0x28);
      lVar16 = lVar16 + -1;
      lVar17 = lVar17 + 0x30;
      uVar20 = uVar2;
    } while (uVar2 < uVar19);
  }
  for (; uVar19 < *(ulong *)(unaff_x20 + 0x38); uVar19 = uVar19 + 1) {
    func_0x006c27d4();
  }
  piVar14 = in_stack_00000010;
  if (in_stack_00000010 != in_stack_00000018) {
    do {
      if (*piVar14 != 0) {
        if (0 < *(int *)((long)unaff_x19 + 0xc)) {
          func_0x006b2e98(*unaff_x19,piVar14[6] + 1);
        }
        func_0x006ca134();
      }
      piVar14 = piVar14 + 0xc;
    } while (piVar14 != in_stack_00000018);
    piVar14 = in_stack_00000018;
    piVar15 = in_stack_00000010;
    if (in_stack_00000010 != in_stack_00000018) {
      do {
        if (*piVar15 == 0) {
          if (*(char *)((long)piVar15 + 0x29) != (char)piVar15[1]) {
            func_0x006b1ccc(*unaff_x19,6,(char)piVar15[1],*(char *)((long)piVar15 + 0x29),0);
          }
        }
        piVar15 = piVar15 + 0xc;
      } while (piVar15 != in_stack_00000018);
      piVar14 = in_stack_00000010;
    }
  }
  if (piVar14 != (int *)0x0) {
    __ZdlPv(piVar14);
  }
  *(undefined4 *)(in_stack_00000050 + 0x484) = in_stack_00000058;
  return;
}

