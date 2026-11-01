
void FUN_0063d61c(void)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  code *pcVar6;
  uint *puVar7;
  long lVar8;
  long in_x9;
  uint *in_x10;
  uint *in_x11;
  long in_x12;
  ulong in_x13;
  ulong in_x14;
  long in_x15;
  long lVar9;
  uint *puVar10;
  undefined8 *unaff_x19;
  
code_r0x0063d61c:
  do {
    lVar9 = in_x15;
    in_x13 = in_x14 + ~in_x13;
code_r0x0063d628:
    in_x14 = in_x13;
    if (in_x14 == 0) {
      if (lVar9 + 0x58 == in_x9) {
        *unaff_x19 = &UNK_009f6678;
        unaff_x19[1] = 0;
        unaff_x19[2] = 0;
        unaff_x19[3] = 0;
        return;
      }
      unaff_x19[1] = 0;
      *unaff_x19 = &UNK_009f6678;
      unaff_x19[2] = 0;
      unaff_x19[3] = 0;
      lVar2 = *(long *)(lVar9 + 0x60);
      lVar9 = *(long *)(lVar9 + 0x68) - lVar2;
      if (lVar9 != 0) {
        if (lVar9 < 0) {
          func_0x00017f90(unaff_x19 + 1);
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x63d718);
          (*pcVar6)();
        }
        lVar8 = __Znwm(lVar9);
        unaff_x19[1] = lVar8;
        lVar1 = lVar8 + (lVar9 >> 2) * 4;
        unaff_x19[3] = lVar1;
        _memcpy(lVar8,lVar2,lVar9);
        unaff_x19[2] = lVar1;
      }
      return;
    }
    in_x13 = in_x14 >> 1;
    in_x15 = lVar9 + 0x58 + in_x13 * in_x12;
  } while (*(uint **)(in_x15 + 8) == *(uint **)(in_x15 + 0x10));
  puVar7 = in_x11;
  puVar5 = *(uint **)(in_x15 + 8);
  while (puVar10 = puVar5 + 1, puVar7 != in_x10) {
    uVar3 = *puVar7;
    uVar4 = *puVar5;
    if (uVar3 < uVar4) break;
    puVar7 = puVar7 + 1;
    puVar5 = puVar10;
    if (uVar4 < uVar3 || puVar10 == *(uint **)(in_x15 + 0x10)) goto code_r0x0063d61c;
  }
  goto code_r0x0063d628;
}

