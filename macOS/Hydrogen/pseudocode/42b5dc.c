
/* WARNING: Possible PIC construction at 0x0042b810: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0042b85c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0042b6d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0042b6d4) */

void FUN_0042b5dc(void)

{
  char cVar1;
  ushort *puVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  undefined8 *puVar6;
  long *plVar7;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined8 unaff_x29;
  long lVar11;
  long lVar12;
  long lVar13;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long *in_stack_00000060;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000110;
  undefined *in_stack_00000118;
  undefined1 uStack0000000000000120;
  
  *(undefined1 *)((long)unaff_x21 + 0x19) = 1;
  if ((*(byte *)(unaff_x21 + 3) & 1) == 0) {
    uStack0000000000000030 = -0x8000000000000000;
    uStack0000000000000080 = unaff_x19;
    in_stack_00000088 = unaff_x20;
    in_stack_00000090 = unaff_x19;
    func_0x00400bec(&uStack0000000000000018);
    if (uStack0000000000000018 < -0x7ffffffffffffffe) {
      return;
    }
    if (uStack0000000000000018 == 0) {
      return;
    }
    in_stack_00000118 = (undefined *)0x42b6d4;
    in_stack_00000110 = unaff_x29;
  }
  else {
    lVar5 = *unaff_x21;
    in_stack_00000008 = lVar5;
    if (lVar5 != 0) {
      lVar9 = unaff_x21[1];
      in_stack_00000000 = lVar9;
LAB_0042b604:
      uVar10 = (ulong)*(ushort *)(lVar5 + 0x21a);
      lVar8 = uVar10 * 0x18;
      lVar11 = lVar5 + 8;
      lVar12 = 0x43;
      do {
        lVar13 = lVar12;
        if (lVar8 == 0) goto LAB_0042b66c;
        lVar12 = *(long *)(lVar11 + 0x10);
        iVar4 = _memcmp();
        lVar12 = unaff_x19 - lVar12;
        if (iVar4 != 0) {
          lVar12 = (long)iVar4;
        }
        cVar1 = 0 < lVar12;
        if (lVar12 < 0) {
          cVar1 = -1;
        }
        lVar8 = lVar8 + -0x18;
        lVar11 = lVar11 + 0x18;
        lVar12 = lVar13 + 1;
      } while (cVar1 == '\x01');
      if (cVar1 == '\0') {
        uStack0000000000000010._7_1_ = '\0';
        if (lVar9 == 0) {
          in_stack_00000090 = lVar13 + -0x43;
          in_stack_00000088 = 0;
          uStack0000000000000080 = lVar5;
          func_0x00402cd4(&uStack0000000000000030,&uStack0000000000000080,
                          (long)&uStack0000000000000010 + 7);
        }
        else {
          uStack0000000000000018 = *(long *)(lVar5 + (lVar13 + 1) * 8);
          while (lVar9 = lVar9 + -1, lVar9 != 0) {
            uStack0000000000000018 =
                 *(long *)(uStack0000000000000018 +
                           (ulong)*(ushort *)(uStack0000000000000018 + 0x21a) * 8 + 0x220);
          }
          in_stack_00000028 = (ulong)*(ushort *)(uStack0000000000000018 + 0x21a) - 1;
          in_stack_00000020 = 0;
          func_0x00402cd4(&uStack0000000000000030,&uStack0000000000000018,
                          (long)&uStack0000000000000010 + 7);
          plVar7 = in_stack_00000060;
          uVar10 = in_stack_00000070;
          if (*(ushort *)((long)in_stack_00000060 + 0x21a) <= in_stack_00000070) {
            do {
              puVar2 = (ushort *)(plVar7 + 0x43);
              uVar10 = (ulong)*puVar2;
              plVar7 = (long *)*plVar7;
            } while (*(ushort *)((long)plVar7 + 0x21a) <= *puVar2);
          }
          lVar9 = plVar7[uVar10 * 3 + 3];
          lVar12 = plVar7[uVar10 * 3 + 2];
          lVar11 = plVar7[uVar10 * 3 + 1];
          plVar7[uVar10 * 3 + 1] = uStack0000000000000030;
          plVar7[uVar10 * 3 + 2] = in_stack_00000038;
          plVar7[uVar10 * 3 + 3] = in_stack_00000040;
          lVar13 = plVar7[uVar10 * 3 + 0x23];
          lVar8 = plVar7[uVar10 * 3 + 0x22];
          lVar5 = plVar7[uVar10 * 3 + 0x24];
          plVar7[uVar10 * 3 + 0x22] = in_stack_00000048;
          plVar7[uVar10 * 3 + 0x23] = in_stack_00000050;
          plVar7[uVar10 * 3 + 0x24] = in_stack_00000058;
          uStack0000000000000030 = lVar11;
          in_stack_00000038 = lVar12;
          in_stack_00000040 = lVar9;
          in_stack_00000048 = lVar8;
          in_stack_00000050 = lVar13;
          in_stack_00000058 = lVar5;
        }
        lVar5 = in_stack_00000048;
        in_stack_00000088 = in_stack_00000038;
        uStack0000000000000080 = uStack0000000000000030;
        in_stack_00000090 = in_stack_00000040;
        unaff_x21[2] = unaff_x21[2] + -1;
        if (uStack0000000000000010._7_1_ == '\x01') {
          if (in_stack_00000000 == 0) {
            func_0x007a247c(&UNK_00885311,0x21,&UNK_009d9530);
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x42b8cc);
            (*pcVar3)();
          }
          puVar6 = *(undefined8 **)(in_stack_00000008 + 0x220);
          *unaff_x21 = (long)puVar6;
          unaff_x21[1] = in_stack_00000000 + -1;
          *puVar6 = 0;
          in_stack_00000118 = &UNK_0042b814;
          in_stack_00000110 = unaff_x29;
          goto code_r0x00187bd4;
        }
        if (uStack0000000000000030 != -0x8000000000000000) {
          if (uStack0000000000000030 != 0) {
            func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
          }
          if ((-0x7fffffffffffffff < lVar5) && (lVar5 != 0)) {
            in_stack_00000118 = &LAB_0042b860;
            in_stack_00000110 = unaff_x29;
            goto code_r0x00187bd4;
          }
        }
      }
      else {
        uVar10 = lVar13 - 0x43;
LAB_0042b66c:
        if (lVar9 != 0) goto code_r0x0042b670;
      }
    }
    if (unaff_x19 == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000120;
  }
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = in_stack_00000110;
  *(undefined **)((long)register0x00000008 + -8) = in_stack_00000118;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
code_r0x0042b670:
  lVar5 = *(long *)(lVar5 + uVar10 * 8 + 0x220);
  lVar9 = lVar9 + -1;
  goto LAB_0042b604;
}

