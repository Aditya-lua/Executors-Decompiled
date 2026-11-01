
void FUN_0063d624(long param_1)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  uint *puVar5;
  code *pcVar6;
  uint *puVar7;
  long lVar8;
  long in_x9;
  uint *in_x10;
  uint *in_x11;
  long in_x12;
  ulong in_x13;
  ulong uVar9;
  ulong in_x14;
  long lVar10;
  uint *puVar11;
  undefined8 *unaff_x19;
  
  do {
    uVar9 = in_x14 + in_x13;
LAB_0063d628:
    in_x14 = uVar9;
    if (in_x14 == 0) {
      if (param_1 == in_x9) {
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
      lVar10 = *(long *)(param_1 + 8);
      lVar4 = *(long *)(param_1 + 0x10) - lVar10;
      if (lVar4 != 0) {
        if (lVar4 < 0) {
          func_0x00017f90(unaff_x19 + 1);
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x63d718);
          (*pcVar6)();
        }
        lVar8 = __Znwm(lVar4);
        unaff_x19[1] = lVar8;
        lVar1 = lVar8 + (lVar4 >> 2) * 4;
        unaff_x19[3] = lVar1;
        _memcpy(lVar8,lVar10,lVar4);
        unaff_x19[2] = lVar1;
      }
      return;
    }
    uVar9 = in_x14 >> 1;
    lVar10 = param_1 + uVar9 * in_x12;
    if (*(uint **)(lVar10 + 8) != *(uint **)(lVar10 + 0x10)) {
      puVar7 = in_x11;
      puVar5 = *(uint **)(lVar10 + 8);
      while (puVar11 = puVar5 + 1, puVar7 != in_x10) {
        uVar2 = *puVar7;
        uVar3 = *puVar5;
        if (uVar2 < uVar3) break;
        puVar7 = puVar7 + 1;
        puVar5 = puVar11;
        if (uVar3 < uVar2 || puVar11 == *(uint **)(lVar10 + 0x10)) goto LAB_0063d61c;
      }
      goto LAB_0063d628;
    }
LAB_0063d61c:
    param_1 = lVar10 + 0x58;
    in_x13 = ~uVar9;
  } while( true );
}

