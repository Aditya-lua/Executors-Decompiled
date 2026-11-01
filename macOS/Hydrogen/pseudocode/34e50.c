
/* WARNING: Removing unreachable block (ram,0x00035068) */
/* WARNING: Removing unreachable block (ram,0x00035080) */

undefined8 FUN_00034e50(void)

{
  undefined8 *puVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  code *pcVar5;
  bool bVar6;
  bool bVar7;
  long *plVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *puVar13;
  undefined8 *puVar12;
  long unaff_x21;
  long lVar14;
  int *piVar15;
  long unaff_x23;
  int unaff_w24;
  ulong unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  long *in_stack_00000008;
  undefined4 uStack0000000000000024;
  long in_stack_00000040;
  
  do {
    unaff_x20 = unaff_x20 + 1;
    lVar14 = *unaff_x20;
    do {
      if (lVar14 == unaff_x23) {
        puVar12 = *(undefined8 **)(unaff_x29 + -0x88);
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        uVar11 = *(long *)(unaff_x29 + -0x80) - (long)puVar12;
        while (0x10 < uVar11) {
          __ZdlPv(*puVar12);
          puVar12 = (undefined8 *)(*(long *)(unaff_x29 + -0x88) + 8);
          *(undefined8 **)(unaff_x29 + -0x88) = puVar12;
          uVar11 = *(long *)(unaff_x29 + -0x80) - (long)puVar12;
        }
        if (uVar11 >> 3 == 1) {
          uVar9 = 0x15;
code_r0x00034f6c:
          *(undefined8 *)(unaff_x29 + -0x70) = uVar9;
        }
        else if (uVar11 >> 3 == 2) {
          uVar9 = 0x2a;
          goto code_r0x00034f6c;
        }
        uStack0000000000000024 = 1;
        if (*(long *)(unaff_x29 + -0x68) != 0) {
          uVar2 = unaff_w24 + 1U >> 0xc;
          bVar6 = true;
          bVar7 = false;
          if ((unaff_w24 + 1U & 0xfff) == 0) {
            bVar7 = SBORROW4(uVar2,(int)unaff_x27);
            bVar6 = (int)(uVar2 - (int)unaff_x27) < 0;
          }
          if (bVar6 == bVar7) {
            func_0x0002d458();
          }
          else {
            uVar11 = (*(long *)(unaff_x29 + -0x68) + *(long *)(unaff_x29 + -0x70)) - 1;
            auVar3._8_8_ = 0;
            auVar3._0_8_ = uVar11 >> 1;
            auVar4._8_8_ = 0;
            auVar4._0_8_ = unaff_x25;
            uVar10 = SUB168(auVar3 * auVar4,8) >> 4;
            piVar15 = (int *)(*(long *)(*(long *)(unaff_x29 + -0x88) + uVar10 * 8) +
                             (uVar11 - uVar10 * unaff_x26) * unaff_x19);
            plVar8 = *(long **)(piVar15 + 0x14);
            if (plVar8 != (long *)0x0) {
              (**(code **)(*plVar8 + 0x10))(plVar8,piVar15);
            }
            if (*piVar15 + 1000U < 10) {
                    /* WARNING: Could not recover jumptable at 0x00034ab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              uVar9 = (*(code *)(&UNK_00034a30 +
                                (ulong)*(ushort *)(unaff_x21 + (ulong)(*piVar15 + 1000U) * 2) * 4))
                                ();
              return uVar9;
            }
            func_0x0002d4a4();
          }
                    /* WARNING: Does not return */
          pcVar5 = (code *)SoftwareBreakpoint(1,0x35094);
          (*pcVar5)();
        }
        in_stack_00000008 = (long *)*in_stack_00000008;
        *in_stack_00000008 = in_stack_00000040;
        in_stack_00000008[1] = in_stack_00000040 + unaff_x27;
        *(undefined1 *)(in_stack_00000008 + 2) = 1;
        puVar12 = *(undefined8 **)(unaff_x29 + -0x88);
        puVar1 = *(undefined8 **)(unaff_x29 + -0x80);
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        uVar11 = (long)puVar1 - (long)puVar12;
        while (0x10 < uVar11) {
          __ZdlPv(*puVar12);
          puVar1 = *(undefined8 **)(unaff_x29 + -0x80);
          puVar12 = (undefined8 *)(*(long *)(unaff_x29 + -0x88) + 8);
          *(undefined8 **)(unaff_x29 + -0x88) = puVar12;
          uVar11 = (long)puVar1 - (long)puVar12;
        }
        if (uVar11 >> 3 == 1) {
          uVar9 = 0x15;
        }
        else {
          if (uVar11 >> 3 != 2) goto code_r0x00035000;
          uVar9 = 0x2a;
        }
        *(undefined8 *)(unaff_x29 + -0x70) = uVar9;
code_r0x00035000:
        if (puVar12 != puVar1) {
          do {
            puVar13 = puVar12 + 1;
            __ZdlPv(*puVar12);
            puVar12 = puVar13;
          } while (puVar13 != puVar1);
          lVar14 = *(long *)(unaff_x29 + -0x80);
          if (lVar14 != *(long *)(unaff_x29 + -0x88)) {
            *(ulong *)(unaff_x29 + -0x80) =
                 lVar14 + ((*(long *)(unaff_x29 + -0x88) - lVar14) + 7U & 0xfffffffffffffff8);
          }
        }
        if (*(long *)(unaff_x29 + -0x90) != 0) {
          __ZdlPv();
        }
        return 1;
      }
      if (*(long *)(lVar14 + 0x38) != 0) {
        *(long *)(lVar14 + 0x40) = *(long *)(lVar14 + 0x38);
        __ZdlPv();
      }
      if (*(long *)(lVar14 + 0x20) != 0) {
        *(long *)(lVar14 + 0x28) = *(long *)(lVar14 + 0x20);
        __ZdlPv();
      }
      lVar14 = lVar14 + 0x60;
    } while (lVar14 - *unaff_x20 != 0xfc0);
  } while( true );
}

