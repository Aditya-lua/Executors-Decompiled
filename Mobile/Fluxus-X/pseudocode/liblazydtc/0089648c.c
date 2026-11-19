/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089648c
 */

undefined8 FUN_0089648c(long param_1,long param_2,long param_3)

{
  long lVar1;
  long lVar2;
  byte bVar3;
  long lVar4;
  undefined4 *puVar5;
  ulong *puVar6;
  undefined8 uVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar8 = *(ulong *)(param_3 + 0x60);
  if (uVar8 != 0) {
    uVar15 = 0;
    do {
      uVar10 = *(ulong *)(param_2 + 0x40);
      local_70 = *(ulong *)(*(long *)(param_3 + 0x58) + uVar15 * 8);
      if (uVar15 < uVar10) {
        uVar14 = *(ulong *)(*(long *)(param_2 + 0x38) + uVar15 * 8);
      }
      else {
        uVar14 = 0;
      }
      uVar15 = uVar15 + 1;
      if (((uVar15 == uVar10) && (uVar10 < uVar8)) &&
         (uVar8 = FUN_00892bc4(param_1,uVar14), (uVar8 & 1) != 0)) break;
      if (*(long *)(param_1 + 0x138) != 0) {
        uVar8 = ((ulong)(uint)((int)local_70 << 3) + 8 ^ local_70 >> 0x20) * -0x622015f714c7d297;
        uVar8 = (local_70 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
        uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
        if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0)
        {
          do {
            puVar13 = (ulong *)(*(long *)(param_1 + 0x110) + uVar8 * 0x28);
            if (*puVar13 == local_70) {
              if ((puVar13[4] & 1) != 0) goto LAB_00896524;
              break;
            }
            uVar8 = uVar8 + 1 & *(long *)(param_1 + 0x130) - 1U;
          } while ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1)
                   != 0);
        }
      }
      if (uVar14 == 0) {
        puVar5 = (undefined4 *)FUN_008984e0(param_1 + 0x180,&local_70);
        puVar5[9] = 0;
        *puVar5 = 1;
        *(undefined8 *)(puVar5 + 3) = 0;
        *(undefined8 *)(puVar5 + 1) = 0;
        *(undefined8 *)(puVar5 + 7) = 0;
        *(undefined8 *)(puVar5 + 5) = 0;
      }
      else if (*(long *)(param_1 + 0x170) != 0) {
        uVar8 = ((ulong)(uint)((int)uVar14 << 3) + 8 ^ uVar14 >> 0x20) * -0x622015f714c7d297;
        uVar8 = (uVar14 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
        uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x178) & 0x3f);
        if ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0)
        {
          do {
            puVar13 = (ulong *)(*(long *)(param_1 + 0x148) + uVar8 * 0x30);
            if (*puVar13 == uVar14) {
              if ((int)puVar13[1] != 0) {
                puVar6 = (ulong *)FUN_008984e0(param_1 + 0x180,&local_70);
                uVar10 = puVar13[2];
                uVar8 = puVar13[1];
                uVar16 = puVar13[4];
                uVar14 = puVar13[3];
                puVar6[4] = puVar13[5];
                puVar6[1] = uVar10;
                *puVar6 = uVar8;
                puVar6[3] = uVar16;
                puVar6[2] = uVar14;
              }
              break;
            }
            uVar8 = uVar8 + 1 & *(long *)(param_1 + 0x168) - 1U;
          } while ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1)
                   != 0);
        }
      }
LAB_00896524:
      uVar8 = *(ulong *)(param_3 + 0x60);
    } while (uVar15 < uVar8);
  }
  *(undefined8 *)(param_1 + 0x3b8) = *(undefined8 *)(param_1 + 0x3b0);
  uVar7 = *(undefined8 *)(param_3 + 0x90);
  *(undefined8 *)(param_1 + 0x3d0) = *(undefined8 *)(param_1 + 0x3c8);
  FUN_0089c2cc(param_1 + 0x148,param_1 + 0x110,param_1 + 0x180,*(undefined8 *)(param_1 + 0x640),
               *(undefined1 *)(param_1 + 0x648),*(int *)(param_1 + 0x30) == 1,
               *(undefined8 *)(param_1 + 0x58),uVar7,*(undefined8 *)(param_1 + 0x638),
               param_1 + 0x1b8,param_1 + 0x3b0,param_1 + 0x3c8);
  uVar7 = FUN_008a0ec8(*(undefined8 *)(param_3 + 0x90),*(undefined8 *)(param_3 + 0x58),
                       *(undefined8 *)(param_3 + 0x60),param_1 + 0x228,param_1 + 0x148);
  lVar9 = *(long *)(param_3 + 0x60);
  if (lVar9 != 0) {
    lVar1 = *(long *)(param_1 + 0x1a0);
    lVar2 = *(long *)(param_1 + 0x1a8);
    lVar11 = 0;
    bVar3 = *(byte *)(param_1 + 0x1b0);
    lVar12 = *(long *)(param_1 + 0x198);
    do {
      if (lVar2 != 0) {
        uVar8 = *(ulong *)(*(long *)(param_3 + 0x58) + lVar11 * 8);
        uVar15 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar15 = (uVar8 >> 0x20 ^ uVar15 >> 0x2f ^ uVar15) * -0x622015f714c7d297;
        uVar15 = (uVar15 ^ uVar15 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)bVar3 & 0x3f);
        if ((*(ulong *)(lVar12 + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0) {
          do {
            puVar13 = (ulong *)(*(long *)(param_1 + 0x180) + uVar15 * 0x30);
            if (*puVar13 == uVar8) {
              *(undefined4 *)(puVar13 + 1) = 0;
              break;
            }
            uVar15 = uVar15 + 1 & lVar1 - 1U;
          } while ((*(ulong *)(lVar12 + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0);
        }
      }
      lVar11 = lVar11 + 1;
    } while (lVar11 != lVar9);
  }
  FUN_0089be8c(param_1 + 0x148,param_1 + 0x3b0);
  FUN_0089c0d8(param_1 + 0x180,param_1 + 0x3c8);
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar7;
}

