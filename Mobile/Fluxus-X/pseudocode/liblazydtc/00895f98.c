/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00895f98
 */

void FUN_00895f98(undefined8 *param_1,long param_2,int param_3,ulong param_4,uint param_5,
                 uint param_6,uint param_7,undefined4 param_8,uint param_9)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  bool bVar5;
  bool bVar6;
  uint uVar7;
  uint uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong *puVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined4 local_84;
  uint local_78 [4];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar13 = (ulong)param_7;
  lVar12 = *(long *)(param_2 + 0x40);
  if (lVar12 == 1) {
    local_84 = 0x49;
LAB_00895ffc:
    bVar6 = false;
    bVar5 = false;
LAB_00896110:
    local_78[2] = 0;
    local_78[0] = 0;
    local_78[1] = 0;
    uVar7 = FUN_0088df20(param_1,**(undefined8 **)(param_2 + 0x38));
    if ((int)uVar7 < 0) {
      lVar1 = (uVar13 & 0xff) + 1;
      uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
      uVar9 = **(undefined8 **)(param_2 + 0x38);
      *(uint *)((long)param_1 + 0x64c) = ((uint)lVar1 & 0xff) + 1;
                    /* try { // try from 0089614c to 00896157 has its CatchHandler @ 00896468 */
      uVar7 = FUN_00891438(param_1,uVar9,lVar1,0xff);
      *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
    }
    uVar7 = uVar7 & 0xff;
    if (1 < *(ulong *)(param_2 + 0x40)) {
      uVar15 = 1;
      do {
        if (bVar6) {
          uVar8 = FUN_008868ec();
          if ((int)uVar8 < 0) {
            if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
            }
            goto LAB_00896488;
          }
          local_78[uVar15] = uVar8;
        }
        else {
          uVar8 = FUN_0088df20(param_1,*(undefined8 *)(*(long *)(param_2 + 0x38) + uVar15 * 8));
          if ((int)uVar8 < 0) {
            uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
            uVar8 = (int)(uVar13 & 0xff) + (int)uVar15 + 1;
            uVar9 = *(undefined8 *)(*(long *)(param_2 + 0x38) + uVar15 * 8);
            *(uint *)((long)param_1 + 0x64c) = (uVar8 & 0xff) + 1;
                    /* try { // try from 008961dc to 008961e7 has its CatchHandler @ 0089646c */
            uVar8 = FUN_00891438(param_1,uVar9,uVar8,0xff);
            local_78[uVar15] = uVar8 & 0xff;
            *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
          }
          else {
            local_78[uVar15] = uVar8 & 0xff;
          }
        }
        uVar15 = uVar15 + 1;
      } while (uVar15 < *(ulong *)(param_2 + 0x40));
    }
  }
  else {
    if ((int)param_9 < 0) {
      if (lVar12 == 2) {
        if (param_1[0x2e] != 0) {
          uVar15 = *(ulong *)(*(long *)(param_2 + 0x38) + 8);
          uVar14 = ((ulong)(uint)((int)uVar15 << 3) + 8 ^ uVar15 >> 0x20) * -0x622015f714c7d297;
          uVar14 = (uVar15 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
          uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
          if ((*(ulong *)(param_1[0x2c] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
            do {
              puVar11 = (ulong *)(param_1[0x29] + uVar14 * 0x30);
              if (*puVar11 == uVar15) {
                bVar6 = (int)puVar11[1] != 0;
                local_84 = 0x4a;
                if (bVar6) {
                  local_84 = 0x4b;
                }
                goto LAB_00896024;
              }
              uVar14 = uVar14 + 1 & param_1[0x2d] - 1;
            } while ((*(ulong *)(param_1[0x2c] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
            bVar6 = false;
            local_84 = 0x4a;
            goto LAB_00896024;
          }
        }
        local_84 = 0x4a;
        goto LAB_00895ffc;
      }
      bVar6 = false;
      local_84 = 0x3c;
      bVar5 = true;
    }
    else {
      local_84 = 0x4b;
      bVar6 = true;
LAB_00896024:
      bVar5 = false;
    }
    local_78[2] = 0;
    local_78[0] = 0;
    local_78[1] = 0;
    if (lVar12 != 0) goto LAB_00896110;
    uVar7 = 0;
  }
  uVar9 = FUN_00875ec8(*param_1);
  FUN_00875b54(*param_1,local_84,param_8,uVar7,0);
  if (bVar5) {
    uVar10 = *param_1;
    uVar8 = local_78[1] | local_78[2] << 8;
  }
  else {
    if (lVar12 == 1) goto LAB_00896264;
    uVar10 = *param_1;
    uVar8 = local_78[1];
    if (-1 < (int)param_9) {
      uVar8 = param_9;
    }
  }
  FUN_00875d18(uVar10,uVar8);
LAB_00896264:
  uVar15 = *(ulong *)(param_2 + 0x40);
  if (uVar15 != 0) {
    uVar14 = (uVar13 & 0xff) + 1;
    if (uVar14 != uVar7) {
      FUN_00875b54(*param_1,6,uVar14,uVar7,0);
      uVar15 = *(ulong *)(param_2 + 0x40);
    }
    if (1 < uVar15) {
      uVar15 = (uVar13 & 0xff) + 2;
      uVar14 = 1;
      do {
        if (bVar6) {
          uVar7 = local_78[uVar14];
          if ((int)uVar7 < 0x8000) {
            FUN_00875cac(*param_1,5,uVar15 & 0xffffffff,uVar7);
          }
          else {
            FUN_00875cac(*param_1,0x42,uVar15 & 0xffffffff,0);
            FUN_00875d18(*param_1,uVar7);
          }
        }
        else if (uVar15 != local_78[uVar14]) {
          FUN_00875b54(*param_1,6,uVar15 & 0xffffffff,(ulong)local_78[uVar14],0);
        }
        uVar14 = uVar14 + 1;
        uVar15 = uVar15 + 1;
      } while (uVar14 < *(ulong *)(param_2 + 0x40));
    }
  }
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),uVar13,1);
  uVar10 = FUN_00875ec8(*param_1);
  uVar15 = FUN_00876054(*param_1,uVar9,uVar10);
  if ((uVar15 & 1) == 0) {
    if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(*(long *)(param_2 + 0x20) + 0xc,
                   "Exceeded jump distance limit; simplify the code to compile");
    }
  }
  else {
    iVar2 = 0;
    if ((param_6 & 1) == 0) {
      iVar2 = (int)param_4 + 1;
    }
    FUN_00875b54(*param_1,0x15,uVar13,*(byte *)(param_2 + 0x40) + 1,iVar2);
    if (((param_5 & 1) == 0) && ((param_4 & 0xff) != 0)) {
      uVar13 = 0;
      do {
        FUN_00875b54(*param_1,6,param_3 + (int)uVar13,param_7 + (int)uVar13,0);
        uVar13 = uVar13 + 1;
      } while ((param_4 & 0xff) != uVar13);
    }
    if (*(long *)(lVar4 + 0x28) == local_68) {
      return;
    }
  }
LAB_00896488:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

