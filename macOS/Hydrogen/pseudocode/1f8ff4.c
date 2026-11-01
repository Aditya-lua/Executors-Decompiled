
/* WARNING: Possible PIC construction at 0x001f90f4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001f90f8) */

void FUN_001f8ff4(byte *param_1)

{
  byte bVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  uint uVar6;
  long lVar7;
  long *plVar8;
  undefined1 *puVar9;
  undefined1 *unaff_x29;
  undefined8 unaff_x30;
  undefined1 auStack_c0 [128];
  
  puVar2 = auStack_c0 + 0x80;
  puVar9 = auStack_c0 + 0xb0;
  bVar1 = *param_1;
  uVar6 = (uint)bVar1;
  if (bVar1 < 6) {
    if (2 < bVar1) {
      if (bVar1 != 3) {
        if (bVar1 == 4) {
          lVar3 = *(long *)(param_1 + 0x10);
          lVar7 = *(long *)(param_1 + 0x18);
          if (lVar7 != 0) {
            plVar8 = (long *)(lVar3 + 8);
            do {
              lVar4 = plVar8[-1];
              if (lVar4 != 0) {
                lVar3 = *plVar8;
                uVar5 = 1;
                unaff_x30 = 0x1f90f8;
                goto code_r0x00187bd4;
              }
              plVar8 = plVar8 + 3;
              lVar7 = lVar7 + -1;
            } while (lVar7 != 0);
          }
          if (*(long *)(param_1 + 8) == 0) {
            return;
          }
          lVar4 = *(long *)(param_1 + 8) * 0x18;
          goto LAB_001f9120;
        }
        if (uVar6 != 5) goto LAB_001f913c;
      }
LAB_001f9080:
      lVar4 = *(long *)(param_1 + 8);
      goto joined_r0x001f9084;
    }
    if (uVar6 - 1 < 2) {
      return;
    }
    if (bVar1 != 0) goto LAB_001f913c;
    if (*(long *)(param_1 + 8) == 0) {
      return;
    }
    lVar3 = *(long *)(param_1 + 0x10);
    lVar4 = *(long *)(param_1 + 8) << 1;
  }
  else {
    if (bVar1 < 0xc) {
      return;
    }
    if (bVar1 < 0xe) {
      if ((bVar1 == 0xc) || (uVar6 == 0xd)) goto LAB_001f9080;
    }
    else {
      if (bVar1 == 0xe) {
        return;
      }
      if (bVar1 == 0xf) {
        lVar3 = *(long *)(param_1 + 0x10);
        lVar7 = *(long *)(param_1 + 0x18) + 1;
        lVar4 = lVar3;
        while (lVar7 = lVar7 + -1, lVar7 != 0) {
          func_0x0016af10(lVar4);
          lVar4 = lVar4 + 0x70;
        }
        if (*(long *)(param_1 + 8) == 0) {
          return;
        }
        lVar4 = *(long *)(param_1 + 8) * 0x70;
LAB_001f9120:
        uVar5 = 8;
        goto LAB_001f9128;
      }
    }
LAB_001f913c:
    lVar4 = *(long *)(param_1 + 8);
    if (lVar4 == -0x8000000000000000) {
      return;
    }
joined_r0x001f9084:
    if (lVar4 == 0) {
      return;
    }
    lVar3 = *(long *)(param_1 + 0x10);
  }
  uVar5 = 1;
LAB_001f9128:
  puVar2 = (undefined1 *)register0x00000008;
  puVar9 = unaff_x29;
code_r0x00187bd4:
  *(undefined1 **)(puVar2 + -0x10) = puVar9;
  *(undefined8 *)(puVar2 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar4,uVar5);
  return;
}

