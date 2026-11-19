/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00898d78
 */

void FUN_00898d78(undefined8 *param_1,long param_2,int param_3,int param_4)

{
  int iVar1;
  long lVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  char *pcVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong *puVar14;
  int iVar15;
  ulong uVar16;
  undefined1 local_84 [4];
  ulong local_80;
  long local_78;
  
  lVar2 = tpidr_el0;
  local_78 = *(long *)(lVar2 + 0x28);
  if (param_1[0x2e] == 0) {
    bVar3 = false;
    uVar16 = 0;
LAB_00898ef8:
    uVar11 = 0;
    bVar4 = false;
    uVar13 = *(ulong *)(param_2 + 0x38);
joined_r0x00898fb4:
    if (uVar13 != 0) {
      if (param_1[0x2e] != 0) goto LAB_00898f20;
      goto LAB_00899030;
    }
    uVar13 = 0x3ff0000000000000;
    bVar5 = true;
    if (!bVar3) goto LAB_00899030;
LAB_00898fdc:
    if (((!bVar4) || (!bVar5)) || (iVar6 = FUN_008a1284(uVar16,uVar11,uVar13), iVar6 < 0))
    goto LAB_00899030;
    if (iVar6 == 0) {
      FUN_008769e0(*param_1,"loop unroll succeeded: empty loop");
      bVar3 = true;
      goto LAB_00899044;
    }
    if (iVar6 <= param_3) {
      uVar11 = *(ulong *)(param_2 + 0x20);
      if (param_1[0x27] != 0) {
        uVar12 = ((ulong)(uint)((int)uVar11 << 3) + 8 ^ uVar11 >> 0x20) * -0x622015f714c7d297;
        uVar12 = (uVar11 >> 0x20 ^ uVar12 >> 0x2f ^ uVar12) * -0x622015f714c7d297;
        uVar12 = (uVar12 ^ uVar12 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
        if ((*(ulong *)(param_1[0x25] + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1) != 0) {
          do {
            puVar14 = (ulong *)(param_1[0x22] + uVar12 * 0x28);
            if (*puVar14 == uVar11) {
              if ((char)puVar14[4] == '\x01') {
                uVar9 = *param_1;
                pcVar10 = "loop unroll failed: mutable loop variable";
                goto LAB_0089903c;
              }
              break;
            }
            uVar12 = uVar12 + 1 & param_1[0x26] - 1;
          } while ((*(ulong *)(param_1[0x25] + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1) != 0);
        }
      }
      local_80 = uVar11;
      uVar9 = FUN_008a0ec8(*(undefined8 *)(param_2 + 0x40),&local_80,1,param_1 + 0x45,param_1 + 0x29
                          );
      local_84[0] = 1;
      iVar7 = FUN_008a11e8(uVar9,local_84,1);
      iVar1 = iVar7 * iVar6;
      iVar8 = FUN_008a11e8(uVar9,0,0);
      iVar15 = param_4;
      if (iVar7 != 0) {
        iVar15 = 0;
        if (iVar1 != 0) {
          iVar15 = ((iVar6 + iVar6 * iVar8) * 100) / iVar1;
        }
        if (param_4 <= iVar15) {
          iVar15 = param_4;
        }
      }
      iVar7 = (iVar15 * param_3) / 100;
      bVar3 = iVar1 <= iVar7;
      if (iVar7 < iVar1) {
        FUN_008769e0((double)iVar15 / 100.0,*param_1,
                     "loop unroll failed: too expensive (iterations %d, cost %d, profit %.2fx)",
                     iVar6,iVar1);
      }
      else {
        FUN_008769e0((double)iVar15 / 100.0,*param_1,
                     "loop unroll succeeded (iterations %d, cost %d, profit %.2fx)",iVar6,iVar1);
        FUN_00899230(uVar16,uVar13,param_1,param_2,iVar6);
      }
      goto LAB_00899044;
    }
    FUN_008769e0(*param_1,"loop unroll failed: too many iterations (%d)",iVar6);
  }
  else {
    uVar11 = *(ulong *)(param_2 + 0x28);
    uVar16 = 0;
    uVar13 = ((ulong)(uint)((int)uVar11 << 3) + 8 ^ uVar11 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar11 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        puVar14 = (ulong *)(param_1[0x29] + uVar13 * 0x30);
        if (*puVar14 == uVar11) {
          uVar16 = puVar14[2];
          bVar3 = (int)puVar14[1] == 3;
          goto LAB_00898e78;
        }
        uVar13 = uVar13 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
    bVar3 = false;
LAB_00898e78:
    uVar11 = *(ulong *)(param_2 + 0x30);
    uVar13 = ((ulong)(uint)((int)uVar11 << 3) + 8 ^ uVar11 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar11 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        puVar14 = (ulong *)(param_1[0x29] + uVar13 * 0x30);
        if (*puVar14 == uVar11) {
          uVar11 = puVar14[2];
          bVar4 = (int)puVar14[1] == 3;
          uVar13 = *(ulong *)(param_2 + 0x38);
          goto joined_r0x00898fb4;
        }
        uVar13 = uVar13 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
      goto LAB_00898ef8;
    }
    uVar13 = *(ulong *)(param_2 + 0x38);
    if (uVar13 != 0) {
      uVar11 = 0;
      bVar4 = false;
LAB_00898f20:
      uVar12 = ((ulong)(uint)((int)uVar13 << 3) + 8 ^ uVar13 >> 0x20) * -0x622015f714c7d297;
      uVar12 = (uVar13 >> 0x20 ^ uVar12 >> 0x2f ^ uVar12) * -0x622015f714c7d297;
      uVar12 = (uVar12 ^ uVar12 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1) != 0) {
        do {
          puVar14 = (ulong *)(param_1[0x29] + uVar12 * 0x30);
          if (*puVar14 == uVar13) {
            uVar13 = puVar14[2];
            bVar5 = (int)puVar14[1] == 3;
            if (bVar3) goto LAB_00898fdc;
            break;
          }
          uVar12 = uVar12 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1) != 0);
      }
    }
LAB_00899030:
    uVar9 = *param_1;
    pcVar10 = "loop unroll failed: invalid iteration count";
LAB_0089903c:
    FUN_008769e0(uVar9,pcVar10);
  }
  bVar3 = false;
LAB_00899044:
  if (*(long *)(lVar2 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar3);
  }
  return;
}

