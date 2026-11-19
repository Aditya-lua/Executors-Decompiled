/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085eb28
 */

void FUN_0085eb28(long param_1,undefined8 *param_2,undefined8 param_3,long param_4,
                 undefined8 param_5)

{
  void *pvVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  ulong *puVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  char *pcVar10;
  undefined8 *puVar11;
  ulong *puVar12;
  undefined8 local_c0;
  undefined8 uStack_b8;
  char *local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  void *local_90;
  ulong local_80;
  undefined8 uStack_78;
  long *local_70;
  long local_68;
  long local_60;
  long local_58;
  
  puVar11 = &local_c0;
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if ((*(long *)(param_1 + 0x160) - *(long *)(param_1 + 0x158) != 8) ||
     (*(int *)(param_1 + 0x124) != 1)) {
    FUN_00860ecc(param_1,param_2,"\'export\' may only be applied to top-level statements");
  }
  if (*(char *)(param_1 + 0x238) == '\x01') {
    FUN_00860ecc(param_1,param_2,
                 "Exporting values is not compatible with top-level return (export/return conflict)"
                );
  }
  local_70 = &local_60;
  local_68 = param_1;
  local_60 = param_1;
  if ((*(long *)(param_4 + 8) != 0) && (*(int *)(param_1 + 0x90) != 299)) {
    FUN_008521fc(&local_a0);
    pvVar1 = local_90;
    if ((local_a0 & 1) == 0) {
      pvVar1 = (void *)((long)&local_a0 + 1);
    }
                    /* try { // try from 0085ebf4 to 0085ec07 has its CatchHandler @ 0085f0f8 */
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Expected \'function\' after export declaration with attribute, but got %s instead"
                 ,pvVar1);
    if ((local_a0 & 1) != 0) {
      operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
    }
  }
  iVar4 = *(int *)(param_1 + 0x90);
  if (iVar4 == 0x119) {
    if ((*(char **)(param_1 + 0xa8) == (char *)0x0) ||
       (iVar4 = strcmp(*(char **)(param_1 + 0xa8),"const"), iVar4 != 0)) {
LAB_0085ed98:
      pcVar10 = "\'export\' must be followed by an identifier or \'function\'";
      if (DAT_00d1ec80 == 1) {
        uVar5 = FUN_00863160(param_1);
        if ((uVar5 & 1) != 0) {
          pcVar10 = *(char **)(param_1 + 0xa8);
          bVar3 = pcVar10 != (char *)0x0;
          if (pcVar10 == (char *)0x0) {
LAB_0085ef74:
            FUN_00858f2c(param_1);
          }
          else {
            iVar4 = strcmp(pcVar10,"open");
            FUN_00858f2c(param_1);
            if (iVar4 == 0) {
              if (((*(int *)(param_1 + 0x90) != 0x119) ||
                  (*(char **)(param_1 + 0xa8) == (char *)0x0)) ||
                 (iVar4 = strcmp(*(char **)(param_1 + 0xa8),"class"), iVar4 != 0)) {
                pcVar10 = "Incomplete statement: expected a class definition after \'open\'";
                goto LAB_0085ee94;
              }
              goto LAB_0085ef74;
            }
            bVar3 = false;
          }
          lVar6 = FUN_0085da04(param_1,param_2,3,bVar3);
          if ((lVar6 != 0) && (*(int *)(lVar6 + 8) == DAT_00d1b220)) {
            puVar12 = *(ulong **)(lVar6 + 0x20);
            local_a0 = *puVar12;
            if (*(long *)(local_60 + 0x228) != 0) {
              uVar5 = (local_a0 >> 4 ^ local_a0 >> 9) * -0x61c8864680b583eb >>
                      ((ulong)*(byte *)(local_60 + 0x230) & 0x3f);
              if ((*(ulong *)(*(long *)(local_60 + 0x218) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1)
                  != 0) {
                do {
                  if (*(ulong *)(*(long *)(local_60 + 0x200) + uVar5 * 0x18) == local_a0) {
                    FUN_00860ecc(param_1,puVar12 + 1,"Duplicate exported identifier \'%s\'");
                    goto LAB_0085f04c;
                  }
                  uVar5 = uVar5 + 1 & *(long *)(local_60 + 0x220) - 1U;
                } while ((*(ulong *)(*(long *)(local_60 + 0x218) + (uVar5 >> 6) * 8) >>
                          (uVar5 & 0x3f) & 1) != 0);
              }
            }
            puVar7 = (ulong *)FUN_0086fd10(local_60 + 0x200,&local_a0);
            uVar5 = puVar12[1];
            puVar7[1] = puVar12[2];
            *puVar7 = uVar5;
LAB_0085f04c:
            *(undefined1 *)((long)puVar12 + 0x31) = 1;
          }
          goto LAB_0085f058;
        }
        pcVar10 = 
        "\'export\' must be followed by an identifier, \'function\', or a class declaration";
        if ((DAT_00d1ec80 & 1) == 0) {
          pcVar10 = "\'export\' must be followed by an identifier or \'function\'";
        }
      }
LAB_0085ee94:
      local_a0 = 0;
      uStack_98 = 0;
      local_c0 = 0;
      uStack_b8 = 0;
      lVar6 = FUN_0085e984(param_1,param_2,&local_a0,&local_c0,pcVar10);
      goto LAB_0085f058;
    }
    uStack_98 = *(undefined8 *)(param_1 + 0x9c);
    local_a0 = *(ulong *)(param_1 + 0x94);
    FUN_00858f2c(param_1);
    if ((DAT_00d1ec80 == 1) && (uVar5 = FUN_00863160(param_1), (uVar5 & 1) != 0)) {
      pcVar10 = 
      "\'export\' must be followed by an identifier, \'function\', or a class declaration; try removing \'const\'"
      ;
    }
    else {
      if (*(int *)(param_1 + 0x90) != 299) {
        local_c0 = 0;
        uStack_b8 = 0;
        lVar6 = FUN_0085b410(param_1,*param_2,param_2[1],local_a0,&local_c0,1,0);
        puVar12 = &local_a0;
LAB_0085ee5c:
        FUN_00865adc(&local_70,lVar6,puVar12);
        goto LAB_0085f058;
      }
      pcVar10 = 
      "\'export\' must be followed by an identifier, \'function\', or a class declaration; try removing \'const\'"
      ;
      if (DAT_00d1ec80 == 0) {
        pcVar10 = "\'export\' must be followed by an identifier or \'function\'";
      }
    }
    FUN_00860ecc(param_1,param_2,pcVar10);
    uVar8 = *param_2;
    uVar9 = param_2[1];
    local_c0 = 0;
    uStack_b8 = 0;
    uVar5 = local_a0;
  }
  else {
    if (iVar4 == 299) {
      lVar6 = FUN_0085b410(param_1,*param_2,param_2[1],param_3,param_4,1,param_5);
      if (*(int *)(lVar6 + 8) == DAT_00d1b1d0) {
        puVar12 = *(ulong **)(lVar6 + 0x20);
        local_a0 = *puVar12;
        if (*(long *)(local_60 + 0x228) != 0) {
          uVar5 = (local_a0 >> 4 ^ local_a0 >> 9) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(local_60 + 0x230) & 0x3f);
          if ((*(ulong *)(*(long *)(local_60 + 0x218) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) !=
              0) {
            do {
              if (*(ulong *)(*(long *)(local_60 + 0x200) + uVar5 * 0x18) == local_a0) {
                FUN_00860ecc(param_1,puVar12 + 1,"Duplicate exported identifier \'%s\'");
                goto LAB_0085ed6c;
              }
              uVar5 = uVar5 + 1 & *(long *)(local_60 + 0x220) - 1U;
            } while ((*(ulong *)(*(long *)(local_60 + 0x218) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) &
                     1) != 0);
          }
        }
        puVar7 = (ulong *)FUN_0086fd10(local_60 + 0x200,&local_a0);
        uVar5 = puVar12[1];
        puVar7[1] = puVar12[2];
        *puVar7 = uVar5;
LAB_0085ed6c:
        *(undefined2 *)(*(long *)(lVar6 + 0x20) + 0x30) = 0x101;
      }
      goto LAB_0085f058;
    }
    if (iVar4 != 0x12e) goto LAB_0085ed98;
    uStack_78 = *(undefined8 *)(param_1 + 0x9c);
    local_80 = *(ulong *)(param_1 + 0x94);
    FUN_00853d20(&local_a0,param_1 + 0x70);
    if ((int)local_a0 == 299) {
      pcVar10 = 
      "\'export\' must be followed by an identifier, \'function\', or a class declaration; try removing \'local\'"
      ;
      if (DAT_00d1ec80 == 0) {
        pcVar10 = 
        "\'export\' must be followed by an identifier or \'function\'; try removing \'local\'";
      }
    }
    else {
      if (((DAT_00d1ec80 == 0) || (FUN_00853d20(&local_a0,param_1 + 0x70), (int)local_a0 != 0x119))
         || ((FUN_00853d20(&local_c0,param_1 + 0x70), local_a8 == (char *)0x0 ||
             (iVar4 = strcmp(local_a8,"class"), iVar4 != 0)))) {
        local_a0 = 0;
        uStack_98 = 0;
        lVar6 = FUN_0085b410(param_1,*param_2,param_2[1],param_3,&local_a0,0,0);
        puVar12 = &local_80;
        goto LAB_0085ee5c;
      }
      pcVar10 = 
      "\'export\' must be followed by an identifier, \'function\', or a class declaration; try removing \'local\'"
      ;
    }
    FUN_00860ecc(param_1,param_2,pcVar10);
    uVar8 = *param_2;
    uVar9 = param_2[1];
    puVar11 = &local_a0;
    local_a0 = 0;
    uStack_98 = 0;
    uVar5 = local_80;
  }
  lVar6 = FUN_0085b410(param_1,uVar8,uVar9,uVar5,puVar11,1,0);
LAB_0085f058:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar6);
  }
  return;
}

