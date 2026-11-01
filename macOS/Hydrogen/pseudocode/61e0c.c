
/* WARNING: Removing unreachable block (ram,0x00061ffc) */
/* WARNING: Removing unreachable block (ram,0x00061f2c) */
/* WARNING: Removing unreachable block (ram,0x00061e40) */
/* WARNING: Removing unreachable block (ram,0x00061e08) */
/* WARNING: Removing unreachable block (ram,0x00061e50) */
/* WARNING: Removing unreachable block (ram,0x00061db8) */
/* WARNING: Removing unreachable block (ram,0x00061ed8) */
/* WARNING: Removing unreachable block (ram,0x00061f3c) */
/* WARNING: Removing unreachable block (ram,0x00061fd8) */
/* WARNING: Removing unreachable block (ram,0x0006205c) */

bool FUN_00061e0c(void)

{
  int *piVar1;
  byte bVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  bool bVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 in_stack_00000000;
  undefined1 uStack000000000000000f;
  long in_stack_00000010;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  
  __ZdlPv(in_stack_00000028);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    uVar8 = *(ulong *)(unaff_x19 + 0x68);
    if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
      uVar8 = (ulong)*(byte *)(unaff_x19 + 0x77);
    }
  }
  else {
    uVar8 = *(ulong *)(unaff_x19 + 0x68);
    if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
      uVar8 = (ulong)*(byte *)(unaff_x19 + 0x77);
    }
  }
  if ((((uVar8 == 0) && (*(long *)(unaff_x19 + 0x90) == 0)) && (*(long *)(unaff_x19 + 0xb0) == 0))
     && (lVar5 = func_0x00063e9c(unaff_x19 + 0x38), lVar5 == 0)) {
    func_0x0005dd28();
  }
  bVar2 = *(byte *)((long)unaff_x20 + 0x17);
  uVar8 = *(ulong *)(unaff_x20 + 2);
  if (-1 < (char)bVar2) {
    uVar8 = (ulong)bVar2;
  }
  if (uVar8 == 4) {
    piVar1 = *(int **)unaff_x20;
    if (-1 < (char)bVar2) {
      piVar1 = unaff_x20;
    }
    if ((*piVar1 == 0x44414548) && (lVar5 = func_0x00063e9c(unaff_x19 + 0x38), lVar5 == 0)) {
      func_0x0005dd28();
    }
  }
  if (*(long **)(unaff_x21 + 0x250) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x21 + 0x250) + 0x30))();
  }
  uStack000000000000000f = 0;
  lVar5 = func_0x0005d154();
  if (lVar5 != 0) {
    if (*(long **)(unaff_x21 + 0x300) == (long *)0x0) {
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x62178);
      (*pcVar3)();
    }
    lVar5 = (**(code **)(**(long **)(unaff_x21 + 0x300) + 0x30))();
    if (lVar5 != 0) {
      bVar2 = *(byte *)((long)unaff_x20 + 0x17);
      uVar8 = *(ulong *)(unaff_x20 + 2);
      if (-1 < (char)bVar2) {
        uVar8 = (ulong)bVar2;
      }
      if (uVar8 == 4) {
        piVar1 = *(int **)unaff_x20;
        if (-1 < (char)bVar2) {
          piVar1 = unaff_x20;
        }
        if (*piVar1 != 0x44414548) goto LAB_00062040;
        plVar6 = *(long **)(unaff_x21 + 0x290);
joined_r0x000620fc:
        bVar7 = true;
      }
      else {
LAB_00062040:
        bVar2 = *(byte *)(unaff_x19 + 0x77);
        if ((char)bVar2 < '\0') {
          uVar8 = *(ulong *)(unaff_x19 + 0x68);
          if (uVar8 != 0) goto LAB_00062078;
LAB_000620a8:
          if (*(long *)(unaff_x19 + 0xb0) == 0) {
            bVar7 = true;
LAB_00062108:
            plVar6 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
          iVar4 = func_0x00062af0();
          if (iVar4 != 0) {
            *(undefined1 *)(unaff_x19 + 0xd9) = 1;
            plVar6 = *(long **)(unaff_x21 + 0x290);
            goto joined_r0x000620fc;
          }
        }
        else {
          uVar8 = (ulong)bVar2;
          if (bVar2 == 0) goto LAB_000620a8;
LAB_00062078:
          uVar9 = 0;
          do {
            bVar7 = uVar8 <= uVar9;
            if (uVar8 <= uVar9) goto LAB_00062108;
            lVar5 = (**(code **)(*unaff_x22 + 0x30))();
            uVar9 = lVar5 + uVar9;
          } while (-1 < lVar5);
        }
        bVar7 = false;
        plVar6 = *(long **)(unaff_x21 + 0x290);
      }
joined_r0x000620fc:
      if (plVar6 != (long *)0x0) {
        (**(code **)(*plVar6 + 0x30))();
      }
      goto LAB_00062124;
    }
  }
  bVar7 = false;
LAB_00062124:
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  if (in_stack_00000068 < 0) {
    __ZdlPv(in_stack_00000058);
  }
  return bVar7;
}

