/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917cf4
 */

void FUN_00917cf4(long param_1)

{
  char cVar1;
  long lVar2;
  int iVar3;
  char *pcVar4;
  ulong uVar5;
  char *pcVar6;
  char *pcVar7;
  size_t sVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  char *pcVar12;
  ulong uVar13;
  long *plVar14;
  char *__s;
  char *pcVar15;
  long lVar16;
  char *pcVar17;
  long local_1c8;
  char *local_1c0;
  undefined1 auStack_1b8 [64];
  undefined1 auStack_178 [264];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  plVar14 = *(long **)(param_1 + 0x11c8);
  *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xfffeffff;
joined_r0x00917d34:
  do {
    if (plVar14 == (long *)0x0) {
      uVar11 = 0;
      *(undefined8 *)(param_1 + 0x11c8) = 0;
LAB_009181cc:
      if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail(uVar11);
      }
      return;
    }
    pcVar17 = (char *)*plVar14;
    if (pcVar17 == (char *)0x0) {
LAB_00918150:
      plVar14 = (long *)plVar14[1];
      goto joined_r0x00917d34;
    }
    cVar1 = *pcVar17;
    if (cVar1 != '-') {
      pcVar4 = pcVar17;
      if (cVar1 == '+') {
        pcVar4 = pcVar17 + 1;
      }
      pcVar6 = strchr(pcVar4,0x3a);
      if (pcVar6 != (char *)0x0) {
        uVar13 = strtoul(pcVar6 + 1,&local_1c0,10);
        if (((uVar13 >> 0x10 == 0) && (local_1c0 != pcVar6 + 1)) && (*local_1c0 == ':')) {
          lVar16 = 0;
          uVar5 = (long)pcVar6 - (long)pcVar4;
          pcVar6 = local_1c0 + 1;
          local_1c8 = 0;
          pcVar15 = local_1c0;
          do {
            __s = pcVar15 + 1;
            pcVar7 = strchr(__s,0x2c);
            if (pcVar7 == (char *)0x0) {
              sVar8 = strlen(__s);
              pcVar7 = __s + sVar8;
            }
            pcVar12 = pcVar7;
            local_1c0 = pcVar7;
            if (*__s == '[') {
              if ((pcVar7 == __s) || (pcVar12 = pcVar7 + -1, *pcVar12 != ']')) goto LAB_009181ac;
              __s = pcVar15 + 2;
            }
            uVar10 = (long)pcVar12 - (long)__s;
            if (uVar10 != 0) {
              if (0x3f < uVar10) goto LAB_009181ac;
              memcpy(auStack_1b8,__s,uVar10);
              auStack_1b8[uVar10] = 0;
              lVar9 = FUN_0090f6f4(auStack_1b8,uVar13 & 0xffffffff);
              if (lVar9 == 0) {
                if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                   ((*(long *)(param_1 + 0x12a0) == 0 ||
                    (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                  FUN_00904c98(param_1,"Resolve address \'%s\' found illegal",auStack_1b8);
                }
                goto LAB_009181ac;
              }
              if (lVar16 == 0) {
                lVar16 = lVar9;
                local_1c8 = lVar9;
              }
              else {
                *(long *)(lVar16 + 0x28) = lVar9;
                lVar16 = lVar9;
              }
            }
            pcVar15 = pcVar7;
          } while (*pcVar7 != '\0');
          if (local_1c8 != 0) {
            uVar10 = uVar5;
            if (uVar5 == 0) {
              uVar10 = strlen(pcVar4);
            }
            if (0xfe < uVar10) {
              uVar10 = 0xff;
            }
            FUN_00941848(auStack_178,pcVar4,uVar10);
            iVar3 = curl_msnprintf(auStack_178 + uVar10,7,&DAT_002b14f0,uVar13 & 0xffffffff);
            if (*(long *)(param_1 + 0xd0) != 0) {
              FUN_0093f628(param_1,3,2);
            }
            lVar16 = uVar10 + (long)iVar3 + 1;
            lVar9 = FUN_009167a8(*(undefined8 *)(param_1 + 0xb0),auStack_178,lVar16);
            if (lVar9 != 0) {
              if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_1 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                FUN_00904c98(param_1,"RESOLVE %.*s:%d - old addresses discarded",uVar5 & 0xffffffff,
                             pcVar4,uVar13 & 0xffffffff);
              }
              FUN_009166fc(*(undefined8 *)(param_1 + 0xb0),auStack_178,lVar16);
            }
            lVar16 = FUN_00916f7c(param_1,local_1c8,pcVar4,uVar5,uVar13 & 0xffffffff);
            if (lVar16 != 0) {
              if (cVar1 != '+') {
                *(undefined8 *)(lVar16 + 8) = 0;
              }
              *(long *)(lVar16 + 0x10) = *(long *)(lVar16 + 0x10) + -1;
            }
            if (*(long *)(param_1 + 0xd0) != 0) {
              FUN_0093f680(param_1,3);
            }
            if (lVar16 == 0) {
              FUN_0090f270(local_1c8);
              uVar11 = 0x1b;
              goto LAB_009181cc;
            }
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              pcVar15 = " (non-permanent)";
              if (cVar1 != '+') {
                pcVar15 = "";
              }
              FUN_00904c98(param_1,"Added %.*s:%d:%s to DNS cache%s",uVar5 & 0xffffffff,pcVar4,
                           uVar13 & 0xffffffff,pcVar6,pcVar15);
            }
            if ((uVar5 != 1) || (pcVar17[cVar1 == '+'] != '*')) goto LAB_00918150;
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1,"RESOLVE *:%d using wildcard",uVar13 & 0xffffffff);
            }
            *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x10000;
            plVar14 = (long *)plVar14[1];
            goto joined_r0x00917d34;
          }
        }
      }
      local_1c8 = 0;
LAB_009181ac:
      FUN_00904b80(param_1,"Couldn\'t parse CURLOPT_RESOLVE entry \'%s\'",*plVar14);
      FUN_0090f270(local_1c8);
      uVar11 = 0x31;
      goto LAB_009181cc;
    }
    pcVar4 = strchr(pcVar17 + 1,0x3a);
    if (pcVar4 == (char *)0x0) {
LAB_00918120:
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Bad syntax CURLOPT_RESOLVE removal entry \'%s\'",*plVar14);
      }
      goto LAB_00918150;
    }
    uVar13 = (long)pcVar4 - (long)(pcVar17 + 1);
    uVar5 = strtoul(pcVar4 + 1,(char **)0x0,10);
    if ((uVar13 == 0) || (0xffff < uVar5)) goto LAB_00918120;
    if (0xfe < uVar13) {
      uVar13 = 0xff;
    }
    FUN_00941848(auStack_178,*plVar14 + 1,uVar13);
    iVar3 = curl_msnprintf(auStack_178 + uVar13,7,&DAT_002b14f0,uVar5 & 0xffffffff);
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,3,2);
    }
    FUN_009166fc(*(undefined8 *)(param_1 + 0xb0),auStack_178,uVar13 + (long)iVar3 + 1);
    if (*(long *)(param_1 + 0xd0) == 0) goto LAB_00918150;
    FUN_0093f680(param_1,3);
    plVar14 = (long *)plVar14[1];
  } while( true );
}

