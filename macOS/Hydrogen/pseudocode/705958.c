
void FUN_00705958(long param_1)

{
  ulong uVar1;
  int iVar2;
  byte bVar3;
  code *pcVar4;
  bool in_ZR;
  int iVar5;
  undefined1 *puVar6;
  undefined1 in_w8;
  long lVar7;
  undefined1 *unaff_x19;
  ulong uVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  undefined1 *in_stack_00000000;
  undefined7 uStack0000000000000008;
  undefined1 uStack000000000000000f;
  undefined7 uStack0000000000000010;
  byte bStack0000000000000017;
  undefined7 uStack0000000000000018;
  undefined1 uStack000000000000001f;
  undefined7 in_stack_00000020;
  long in_stack_00000028;
  
  *unaff_x19 = in_w8;
  iVar2 = iRam0000000000a27a88;
  if ((((in_ZR) && (*(long *)(param_1 + 0x28) != 0)) &&
      (lVar14 = **(long **)(param_1 + 0x20), *(int *)(lVar14 + 8) == iRam0000000000a27b08)) &&
     (lVar9 = *(long *)(lVar14 + 0x28), lVar9 != 0)) {
    lVar13 = 0;
    lVar11 = *(long *)(lVar14 + 0x20);
    do {
      if (*(int *)(lVar11 + lVar13) == 1) {
        lVar7 = *(long *)(lVar11 + lVar13 + 8);
        if (*(int *)(lVar7 + 8) != iVar2) {
          lVar7 = 0;
        }
        iVar5 = _strcmp(*(undefined8 *)(lVar7 + 0x20),"use");
        if (iVar5 == 0) {
          lVar13 = *(long *)(lVar11 + lVar13 + 0x10);
          if (*(int *)(lVar13 + 8) == iVar2) {
            uVar8 = *(ulong *)(lVar13 + 0x28);
            if (0x7ffffffffffffff7 < uVar8) goto LAB_00705c4c;
            uVar10 = *(undefined8 *)(lVar13 + 0x20);
            if (uVar8 < 0x17) {
              bStack0000000000000017 = (byte)uVar8;
              puVar6 = (undefined1 *)register0x00000008;
              if (uVar8 != 0) goto LAB_00705a5c;
            }
            else {
              uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
              if ((uVar8 | 7) != 0x17) {
                uVar1 = uVar8 | 7;
              }
              lVar9 = uVar1 + 1;
              puVar6 = (undefined1 *)__Znwm(lVar9);
              bStack0000000000000017 = (byte)((ulong)lVar9 >> 0x38) | 0x80;
              uStack0000000000000008 = (undefined7)uVar8;
              uStack000000000000000f = (undefined1)(uVar8 >> 0x38);
              uStack0000000000000010 = (undefined7)lVar9;
              in_stack_00000000 = puVar6;
LAB_00705a5c:
              _memmove(puVar6,uVar10,uVar8);
            }
            puVar6[uVar8] = 0;
            bVar3 = bStack0000000000000017;
            puVar6 = in_stack_00000000;
            uStack0000000000000018 = uStack0000000000000008;
            uStack000000000000001f = uStack000000000000000f;
            in_stack_00000020 = uStack0000000000000010;
            if (unaff_x19[0x20] == '\0') {
              *(undefined1 **)(unaff_x19 + 8) = in_stack_00000000;
              *(ulong *)(unaff_x19 + 0x10) = CONCAT17(uStack000000000000000f,uStack0000000000000008)
              ;
              *(ulong *)(unaff_x19 + 0x17) = CONCAT71(uStack0000000000000010,uStack000000000000000f)
              ;
              unaff_x19[0x1f] = bStack0000000000000017;
              unaff_x19[0x20] = 1;
            }
            else {
              if ((char)unaff_x19[0x1f] < '\0') {
                __ZdlPv(*(undefined8 *)(unaff_x19 + 8));
              }
              *(undefined1 **)(unaff_x19 + 8) = puVar6;
              *(ulong *)(unaff_x19 + 0x10) = CONCAT17(uStack000000000000001f,uStack0000000000000018)
              ;
              *(ulong *)(unaff_x19 + 0x17) = CONCAT71(in_stack_00000020,uStack000000000000001f);
              unaff_x19[0x1f] = bVar3;
            }
            lVar11 = *(long *)(lVar14 + 0x20);
            lVar9 = *(long *)(lVar14 + 0x28);
          }
          break;
        }
      }
      lVar13 = lVar13 + 0x18;
    } while (lVar9 * 0x18 != lVar13);
    iVar2 = iRam0000000000a27a88;
    if (lVar9 != 0) {
      plVar12 = (long *)(lVar11 + 0x10);
      lVar9 = lVar9 * 0x18;
      do {
        if ((int)plVar12[-2] == 1) {
          lVar14 = plVar12[-1];
          if (*(int *)(lVar14 + 8) != iVar2) {
            lVar14 = 0;
          }
          iVar5 = _strcmp(*(undefined8 *)(lVar14 + 0x20),"reason");
          if (iVar5 == 0) {
            lVar14 = *plVar12;
            if (*(int *)(lVar14 + 8) == iVar2) {
              uVar8 = *(ulong *)(lVar14 + 0x28);
              if (0x7ffffffffffffff7 < uVar8) {
                func_0x0001748c();
                goto code_r0x00705c60;
              }
              uVar10 = *(undefined8 *)(lVar14 + 0x20);
              if (uVar8 < 0x17) {
                bStack0000000000000017 = (byte)uVar8;
                if (uVar8 != 0) goto LAB_00705b9c;
              }
              else {
                uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
                if ((uVar8 | 7) != 0x17) {
                  uVar1 = uVar8 | 7;
                }
                lVar14 = uVar1 + 1;
                register0x00000008 = (BADSPACEBASE *)__Znwm(lVar14);
                bStack0000000000000017 = (byte)((ulong)lVar14 >> 0x38) | 0x80;
                uStack0000000000000008 = (undefined7)uVar8;
                uStack000000000000000f = (undefined1)(uVar8 >> 0x38);
                uStack0000000000000010 = (undefined7)lVar14;
                in_stack_00000000 = (undefined1 *)register0x00000008;
LAB_00705b9c:
                _memmove(register0x00000008,uVar10,uVar8);
              }
              *(undefined1 *)((long)register0x00000008 + uVar8) = 0;
              bVar3 = bStack0000000000000017;
              puVar6 = in_stack_00000000;
              uStack0000000000000018 = uStack0000000000000008;
              uStack000000000000001f = uStack000000000000000f;
              in_stack_00000020 = uStack0000000000000010;
              if (unaff_x19[0x40] == '\0') {
                *(undefined1 **)(unaff_x19 + 0x28) = in_stack_00000000;
                *(ulong *)(unaff_x19 + 0x30) =
                     CONCAT17(uStack000000000000000f,uStack0000000000000008);
                *(ulong *)(unaff_x19 + 0x37) =
                     CONCAT71(uStack0000000000000010,uStack000000000000000f);
                unaff_x19[0x3f] = bStack0000000000000017;
                unaff_x19[0x40] = 1;
              }
              else {
                if ((char)unaff_x19[0x3f] < '\0') {
                  __ZdlPv(*(undefined8 *)(unaff_x19 + 0x28));
                }
                *(undefined1 **)(unaff_x19 + 0x28) = puVar6;
                *(ulong *)(unaff_x19 + 0x30) =
                     CONCAT17(uStack000000000000001f,uStack0000000000000018);
                *(ulong *)(unaff_x19 + 0x37) = CONCAT71(in_stack_00000020,uStack000000000000001f);
                unaff_x19[0x3f] = bVar3;
              }
            }
            break;
          }
        }
        plVar12 = plVar12 + 3;
        lVar9 = lVar9 + -0x18;
      } while (lVar9 != 0);
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return;
  }
  ___stack_chk_fail();
LAB_00705c4c:
  func_0x0001748c();
code_r0x00705c60:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x705c64);
  (*pcVar4)();
}

