/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085cb14
 */

long FUN_0085cb14(long param_1,ulong param_2)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  bool bVar6;
  long lVar7;
  long lVar8;
  int *piVar9;
  undefined8 uVar10;
  char *pcVar11;
  char *local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  piVar9 = (int *)(param_1 + 0x94);
  uVar10 = *(undefined8 *)piVar9;
  lVar7 = FUN_0086b498();
  uVar2 = *(undefined4 *)(param_1 + 0x124);
  do {
    iVar3 = *(int *)(param_1 + 0x90);
    if (iVar3 < 0x5b) {
      if (iVar3 == 0x28) {
        if (((param_2 & 1) == 0) && (*(int *)(lVar7 + 0x14) != *piVar9)) {
          FUN_0086bc9c(param_1);
          goto LAB_0085cd58;
        }
        goto LAB_0085cb6c;
      }
      if (iVar3 == 0x2e) {
        local_70 = *(undefined8 *)(param_1 + 0x94);
        FUN_00858f2c(param_1);
        if (*(int *)(param_1 + 0x90) == 0x119) {
          uStack_90 = *(undefined8 *)(param_1 + 0x9c);
          local_98 = *(undefined8 *)piVar9;
          pcVar11 = *(char **)(param_1 + 0xa8);
          FUN_00858f2c(param_1);
          local_a0 = pcVar11;
        }
        else {
          FUN_0086e040(param_1,0);
          if ((*(int *)(param_1 + 0x90) - 0x123U < 0x15) && (*piVar9 == (int)local_70)) {
            local_a0 = *(char **)(param_1 + 0xa8);
            uStack_90 = *(undefined8 *)(param_1 + 0x9c);
            local_98 = *(undefined8 *)piVar9;
            FUN_00858f2c(param_1);
          }
          else {
            local_a0 = *(char **)(param_1 + 0x138);
            local_98 = *(undefined8 *)(param_1 + 0x94);
            uStack_90 = local_98;
          }
        }
        uStack_78 = uStack_90;
        if (((*(char *)(param_1 + 0x178) == '\x01') && (local_a0 != (char *)0x0)) &&
           (*local_a0 == '_')) {
          bVar6 = local_a0[1] != '_';
        }
        else {
          bVar6 = false;
        }
        local_80 = uVar10;
        lVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x50);
        FUN_0084eea4(lVar8,&local_80,lVar7,&local_a0,&local_98,&local_70,0x2e,bVar6);
      }
      else {
        if (iVar3 != 0x3a) goto LAB_0085cbec;
        lVar8 = FUN_0086b9c0(param_1,uVar10,lVar7);
      }
    }
    else {
      if (1 < iVar3 - 0x116U) {
        if (iVar3 == 0x5b) {
          lVar8 = FUN_0086b888(param_1,uVar10,lVar7);
          goto LAB_0085cb80;
        }
        if (iVar3 != 0x7b) {
LAB_0085cbec:
          if (iVar3 == 0x3c) {
            FUN_00853d20(&local_a0,param_1 + 0x70);
            if ((int)local_a0 == 0x3c) {
              lVar8 = FUN_0086c2c8(param_1,uVar10,lVar7);
              goto LAB_0085cb80;
            }
          }
LAB_0085cd58:
          *(undefined4 *)(param_1 + 0x124) = uVar2;
          if (*(long *)(lVar4 + 0x28) == local_68) {
            return lVar7;
          }
          goto LAB_0085cdbc;
        }
      }
LAB_0085cb6c:
      lVar8 = FUN_0086bcac(param_1,lVar7,0);
    }
LAB_0085cb80:
    uVar5 = DAT_00d1eba0;
    uVar1 = *(int *)(param_1 + 0x124) + 1;
    *(uint *)(param_1 + 0x124) = uVar1;
    lVar7 = lVar8;
    if (uVar5 < uVar1) {
      if (*(long *)(lVar4 + 0x28) == local_68) {
        FUN_008578f8(piVar9,
                     "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                     "expression");
      }
LAB_0085cdbc:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
  } while( true );
}

