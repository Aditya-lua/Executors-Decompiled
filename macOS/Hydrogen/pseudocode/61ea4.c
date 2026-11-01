
/* WARNING: Removing unreachable block (ram,0x00061ffc) */
/* WARNING: Removing unreachable block (ram,0x00061f2c) */
/* WARNING: Removing unreachable block (ram,0x00061f3c) */
/* WARNING: Removing unreachable block (ram,0x00061fd8) */
/* WARNING: Removing unreachable block (ram,0x0006205c) */

bool FUN_00061ea4(undefined8 *param_1)

{
  int *piVar1;
  byte bVar2;
  undefined5 uVar3;
  undefined3 uVar4;
  undefined5 uVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  long *plVar9;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  bool bVar10;
  ulong uVar11;
  ulong uVar12;
  undefined5 uStack0000000000000000;
  undefined3 uStack0000000000000005;
  undefined5 uStack0000000000000008;
  undefined1 uStack000000000000000d;
  undefined2 uStack000000000000000e;
  long in_stack_00000010;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  
  uStack0000000000000000 = (undefined5)*param_1;
  uVar3 = uStack0000000000000000;
  uStack0000000000000005 = (undefined3)*(undefined8 *)((long)param_1 + 5);
  uVar4 = uStack0000000000000005;
  uStack0000000000000008 = (undefined5)((ulong)*(undefined8 *)((long)param_1 + 5) >> 0x18);
  uVar5 = uStack0000000000000008;
  uStack000000000000000d = 0;
  lVar8 = func_0x00063e9c(unaff_x19 + 0x38);
  if (in_stack_00000010 < 0) {
    __ZdlPv(CONCAT35(uStack0000000000000005,uStack0000000000000000));
  }
  if (lVar8 == 0) {
    uStack000000000000000d = 0;
    uStack0000000000000000 = uVar3;
    uStack0000000000000005 = uVar4;
    uStack0000000000000008 = uVar5;
    func_0x0005dd28();
  }
  if (*(long **)(unaff_x21 + 0x250) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x21 + 0x250) + 0x30))();
  }
  uStack0000000000000000 = 0x9b8350;
  uStack0000000000000005 = 0;
  uStack0000000000000008 = 0;
  uStack000000000000000d = 0;
  uStack000000000000000e = 0;
  lVar8 = func_0x0005d154();
  if (lVar8 != 0) {
    if (*(long **)(unaff_x21 + 0x300) == (long *)0x0) {
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x62178);
      (*pcVar6)();
    }
    lVar8 = (**(code **)(**(long **)(unaff_x21 + 0x300) + 0x30))();
    if (lVar8 != 0) {
      bVar2 = *(byte *)((long)unaff_x20 + 0x17);
      uVar11 = *(ulong *)(unaff_x20 + 2);
      if (-1 < (char)bVar2) {
        uVar11 = (ulong)bVar2;
      }
      if (uVar11 == 4) {
        piVar1 = *(int **)unaff_x20;
        if (-1 < (char)bVar2) {
          piVar1 = unaff_x20;
        }
        if (*piVar1 != 0x44414548) goto LAB_00062040;
        plVar9 = *(long **)(unaff_x21 + 0x290);
joined_r0x000620fc:
        bVar10 = true;
      }
      else {
LAB_00062040:
        bVar2 = *(byte *)(unaff_x19 + 0x77);
        if ((char)bVar2 < '\0') {
          uVar11 = *(ulong *)(unaff_x19 + 0x68);
          if (uVar11 != 0) goto LAB_00062078;
LAB_000620a8:
          if (*(long *)(unaff_x19 + 0xb0) == 0) {
            bVar10 = true;
LAB_00062108:
            plVar9 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
          iVar7 = func_0x00062af0();
          if (iVar7 != 0) {
            *(undefined1 *)(unaff_x19 + 0xd9) = 1;
            plVar9 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
        }
        else {
          uVar11 = (ulong)bVar2;
          if (bVar2 == 0) goto LAB_000620a8;
LAB_00062078:
          uVar12 = 0;
          do {
            bVar10 = uVar11 <= uVar12;
            if (uVar11 <= uVar12) goto LAB_00062108;
            lVar8 = (**(code **)(*unaff_x22 + 0x30))();
            uVar12 = lVar8 + uVar12;
          } while (-1 < lVar8);
        }
        bVar10 = false;
        plVar9 = *(long **)(unaff_x21 + 0x290);
      }
joined_r0x000620fc:
      if (plVar9 != (long *)0x0) {
        (**(code **)(*plVar9 + 0x30))();
      }
      goto LAB_00062124;
    }
  }
  bVar10 = false;
LAB_00062124:
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  if (in_stack_00000068 < 0) {
    __ZdlPv(in_stack_00000058);
  }
  return bVar10;
}

