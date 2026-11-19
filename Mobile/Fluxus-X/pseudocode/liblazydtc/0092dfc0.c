/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092dfc0
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_0092dfc0(long param_1,undefined8 param_2,long param_3,int *param_4)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  int *piVar9;
  undefined8 uVar10;
  uint uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  undefined8 local_78;
  int local_70;
  int local_6c;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  local_78 = param_2;
  if (*(int *)(param_3 + 0x14) == 0) {
    uVar11 = param_4[5];
    uVar12 = 0;
  }
  else {
    uVar14 = 0;
    lVar13 = param_1 + 0xf8;
    do {
      iVar5 = *(int *)(param_3 + uVar14 * 4);
      bVar1 = *(byte *)(param_3 + uVar14 + 0x18);
      local_6c = iVar5;
      if (iVar5 == -1) {
        local_70 = -1;
LAB_0092e0c4:
        lVar7 = (*(code *)PTR_calloc_00cc4690)(1,0x48);
        if (lVar7 != 0) {
          FUN_009164e8(lVar7,0xd,&LAB_0092f720,&LAB_0092f730,&LAB_0092f744);
          lVar8 = FUN_009166f4(lVar13,&local_70,4,lVar7);
          if (lVar8 != 0) goto LAB_0092e178;
          FUN_00916838(lVar7);
          (*(code *)PTR_free_00cc4678)(lVar7);
        }
LAB_0092e3bc:
        uVar10 = 3;
        goto LAB_0092e3c4;
      }
      lVar7 = FUN_009167a8(lVar13,&local_6c,4);
      if (lVar7 == 0) {
        local_70 = iVar5;
        local_6c = iVar5;
        lVar7 = FUN_009167a8(lVar13,&local_6c,4);
        if (lVar7 == 0) goto LAB_0092e0c4;
      }
      else {
        uVar11 = param_4[5];
        if (uVar11 != 0) {
          uVar12 = 0;
          do {
            if (iVar5 == param_4[uVar12 & 0xffffffff]) {
              bVar2 = *(byte *)((long)param_4 + uVar12 + 0x18);
              if (bVar2 != 0) {
                if (bVar2 != bVar1) {
                  if ((bVar2 & 1) != 0) {
                    *(int *)(lVar7 + 0x40) = *(int *)(lVar7 + 0x40) + -1;
                  }
                  if ((bVar2 >> 1 & 1) != 0) {
                    *(int *)(lVar7 + 0x44) = *(int *)(lVar7 + 0x44) + -1;
                  }
                  if ((bVar1 & 1) != 0) {
                    *(int *)(lVar7 + 0x40) = *(int *)(lVar7 + 0x40) + 1;
                  }
                  if ((bVar1 >> 1 & 1) != 0) {
                    *(int *)(lVar7 + 0x44) = *(int *)(lVar7 + 0x44) + 1;
                  }
                }
                bVar4 = true;
                goto LAB_0092e1d4;
              }
              break;
            }
            uVar12 = uVar12 + 1;
          } while ((uint)uVar12 < uVar11);
        }
      }
LAB_0092e178:
      lVar8 = FUN_009167a8(lVar7,&local_78,8);
      if (lVar8 == 0) {
        *(int *)(lVar7 + 0x34) = *(int *)(lVar7 + 0x34) + 1;
        if ((bVar1 & 1) != 0) {
          *(int *)(lVar7 + 0x40) = *(int *)(lVar7 + 0x40) + 1;
        }
        if ((bVar1 >> 1 & 1) != 0) {
          *(int *)(lVar7 + 0x44) = *(int *)(lVar7 + 0x44) + 1;
        }
        lVar8 = FUN_009166f4(lVar7,&local_78,8,local_78);
        if (lVar8 == 0) {
          FUN_00916838(lVar7);
          goto LAB_0092e3bc;
        }
      }
      bVar4 = false;
LAB_0092e1d4:
      uVar11 = 0;
      if (*(int *)(lVar7 + 0x44) != 0) {
        uVar11 = 2;
      }
      uVar11 = uVar11 | *(int *)(lVar7 + 0x40) != 0;
      if ((!bVar4) || (*(uint *)(lVar7 + 0x30) != uVar11)) {
        if (*(code **)(param_1 + 0x80) != (code *)0x0) {
          *(byte *)(param_1 + 0x231) = *(byte *)(param_1 + 0x231) | 4;
          iVar5 = (**(code **)(param_1 + 0x80))
                            (local_78,iVar5,uVar11,*(undefined8 *)(param_1 + 0x88),
                             *(undefined8 *)(lVar7 + 0x38));
          bVar1 = *(byte *)(param_1 + 0x231) & 0xfb;
          *(byte *)(param_1 + 0x231) = bVar1;
          if (iVar5 == -1) {
            *(byte *)(param_1 + 0x231) = bVar1 | 0x10;
            uVar10 = 0xb;
            goto LAB_0092e3c4;
          }
        }
        *(uint *)(lVar7 + 0x30) = uVar11;
      }
      uVar12 = (ulong)*(uint *)(param_3 + 0x14);
      uVar14 = uVar14 + 1;
    } while (uVar14 < uVar12);
    uVar11 = param_4[5];
  }
  if (uVar11 == 0) {
LAB_0092e378:
    uVar10 = 0;
LAB_0092e3c4:
    if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(uVar10);
    }
    return;
  }
  uVar14 = 0;
  iVar5 = *param_4;
  uVar11 = (uint)uVar12;
  do {
    if (uVar11 != 0) {
      lVar13 = 0;
      do {
        if (iVar5 == *(int *)(param_3 + lVar13 * 4)) goto LAB_0092e368;
        lVar13 = lVar13 + 1;
      } while ((uint)lVar13 < (uint)uVar12);
    }
    local_6c = iVar5;
    if ((iVar5 != -1) && (lVar13 = FUN_009167a8(param_1 + 0xf8,&local_6c,4), lVar13 != 0)) {
      bVar1 = *(byte *)((long)param_4 + uVar14 + 0x18);
      iVar6 = *(int *)(lVar13 + 0x34) + -1;
      *(int *)(lVar13 + 0x34) = iVar6;
      if ((bVar1 >> 1 & 1) == 0) {
        if ((bVar1 & 1) == 0) goto LAB_0092e2d8;
LAB_0092e2fc:
        *(int *)(lVar13 + 0x40) = *(int *)(lVar13 + 0x40) + -1;
        if (iVar6 == 0) goto LAB_0092e30c;
LAB_0092e2dc:
        piVar9 = (int *)&local_78;
        uVar10 = 8;
      }
      else {
        *(int *)(lVar13 + 0x44) = *(int *)(lVar13 + 0x44) + -1;
        if ((bVar1 & 1) != 0) goto LAB_0092e2fc;
LAB_0092e2d8:
        if (iVar6 != 0) goto LAB_0092e2dc;
LAB_0092e30c:
        if (*(code **)(param_1 + 0x80) != (code *)0x0) {
          *(byte *)(param_1 + 0x231) = *(byte *)(param_1 + 0x231) | 4;
          iVar6 = (**(code **)(param_1 + 0x80))
                            (local_78,iVar5,4,*(undefined8 *)(param_1 + 0x88),
                             *(undefined8 *)(lVar13 + 0x38));
          bVar1 = *(byte *)(param_1 + 0x231) & 0xfb;
          *(byte *)(param_1 + 0x231) = bVar1;
          if (iVar6 == -1) {
            uVar10 = 0xb;
            *(byte *)(param_1 + 0x231) = bVar1 | 0x10;
            goto LAB_0092e3c4;
          }
        }
        local_6c = iVar5;
        FUN_00916838(lVar13);
        piVar9 = &local_6c;
        uVar10 = 4;
        lVar13 = param_1 + 0xf8;
      }
      FUN_009166fc(lVar13,piVar9,uVar10);
    }
LAB_0092e368:
    uVar14 = uVar14 + 1;
    if ((uint)param_4[5] <= uVar14) goto LAB_0092e378;
    uVar11 = *(uint *)(param_3 + 0x14);
    uVar12 = (ulong)uVar11;
    iVar5 = param_4[uVar14];
  } while( true );
}

