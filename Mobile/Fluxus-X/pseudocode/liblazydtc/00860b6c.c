/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00860b6c
 */

long FUN_00860b6c(long param_1,undefined8 *param_2,undefined4 *param_3,long param_4,
                 undefined8 *param_5,undefined8 *param_6)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  uint uVar6;
  byte bVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined4 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  undefined4 local_74;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  uVar13 = *param_2;
  param_5[1] = param_2[1];
  *param_5 = uVar13;
  bVar7 = *(byte *)(param_6 + 2);
  if (bVar7 == 1) {
    bVar7 = 0;
    *(undefined1 *)(param_6 + 2) = 0;
  }
  uVar6 = DAT_00d1eba0;
  if (*(int *)(param_1 + 0x90) == 0x127) {
    iVar4 = *(int *)(param_1 + 0x124);
    *(undefined1 *)(param_4 + 0x30) = 1;
    uVar1 = iVar4 + 1;
    *(uint *)(param_1 + 0x124) = uVar1;
    if (uVar6 < uVar1) {
      if (*(long *)(lVar5 + 0x28) == local_68) {
        FUN_008578f8(param_1 + 0x94,
                     "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                     "elseif");
      }
      goto LAB_00860d90;
    }
    uVar13 = *(undefined8 *)(param_1 + 0x94);
    param_6[1] = *(undefined8 *)(param_1 + 0x9c);
    *param_6 = uVar13;
    if ((bVar7 & 1) == 0) {
      *(undefined1 *)(param_6 + 2) = 1;
    }
    lVar8 = FUN_0085a024(param_1);
    uVar13 = *(undefined8 *)(lVar8 + 0xc);
    param_5[1] = *(undefined8 *)(lVar8 + 0x14);
    *param_5 = uVar13;
    *(int *)(param_1 + 0x124) = iVar4;
  }
  else {
    if (*(int *)(param_1 + 0x90) == 0x126) {
      *(undefined1 *)(param_4 + 0x30) = 1;
      uVar13 = *(undefined8 *)(param_1 + 0x94);
      param_6[1] = *(undefined8 *)(param_1 + 0x9c);
      *param_6 = uVar13;
      if ((bVar7 & 1) == 0) {
        *(undefined1 *)(param_6 + 2) = 1;
      }
      uVar12 = *(undefined4 *)(param_1 + 0x90);
      uVar13 = *(undefined8 *)(param_1 + 0x94);
      uVar14 = *(undefined8 *)(param_1 + 0x9c);
      FUN_00858f2c(param_1);
      lVar2 = *(long *)(param_1 + 0x1b8);
      lVar3 = *(long *)(param_1 + 0x1c0);
      lVar8 = FUN_00859498(param_1);
      lVar10 = *(long *)(param_1 + 0x1b8);
      uVar15 = (ulong)(lVar3 - lVar2) >> 3 & 0xffffffff;
      uVar11 = *(long *)(param_1 + 0x1c0) - lVar10 >> 3;
      if (uVar15 < uVar11) {
        do {
          lVar2 = uVar11 * 8;
          uVar11 = uVar11 - 1;
          uVar16 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + lVar2 + -8) + 0x18);
          puVar9 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
          *puVar9 = uVar16;
        } while (uVar15 < uVar11);
        lVar10 = *(long *)(param_1 + 0x1b8);
        uVar11 = *(long *)(param_1 + 0x1c0) - lVar10 >> 3;
      }
      if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
        if (uVar15 < uVar11) {
          *(ulong *)(param_1 + 0x1c0) = lVar10 + uVar15 * 8;
        }
      }
      else {
        FUN_00870174(param_1 + 0x1b8,uVar15 - uVar11);
      }
      *(undefined8 *)(lVar8 + 0xc) = uVar14;
    }
    else {
      uVar12 = *param_3;
      uVar13 = *(undefined8 *)(param_3 + 1);
      lVar8 = 0;
    }
    uVar14 = *(undefined8 *)(param_1 + 0x94);
    param_5[1] = *(undefined8 *)(param_1 + 0x9c);
    *param_5 = uVar14;
    local_74 = uVar12;
    local_70 = uVar13;
    bVar7 = FUN_00861094(param_1,0x128,&local_74);
    if (lVar8 == 0) {
      *(byte *)(param_4 + 0x30) = bVar7 & 1;
    }
    else if (*(int *)(lVar8 + 8) == DAT_00d1b0f0) {
      *(byte *)(lVar8 + 0x30) = bVar7 & 1;
    }
  }
  if (*(long *)(lVar5 + 0x28) == local_68) {
    return lVar8;
  }
LAB_00860d90:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

