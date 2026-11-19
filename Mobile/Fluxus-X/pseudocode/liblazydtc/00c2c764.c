/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c764
 */

char * FUN_00c2c764(undefined8 param_1,uint *param_2,long *param_3)

{
  byte *pbVar1;
  byte bVar2;
  uint uVar3;
  undefined1 uVar4;
  undefined4 uVar5;
  char *pcVar6;
  long lVar7;
  uint *puVar8;
  byte *pbVar9;
  byte *pbVar10;
  ulong uVar11;
  ulong uVar12;
  byte *pbVar13;
  byte *pbVar14;
  uint uVar15;
  byte *pbVar16;
  byte *local_48;
  
  *(undefined2 *)((long)param_3 + 0x33) = 0;
  param_3[4] = 0;
  param_3[5] = 0;
  *(undefined2 *)(param_3 + 6) = 0;
  *param_3 = (long)param_2;
  *(undefined4 *)(param_3 + 3) = 0xff00;
  puVar8 = param_2 + 1;
  uVar11 = (ulong)*param_2;
  if (*param_2 == 0xffffffff) {
    uVar11 = *(ulong *)(param_2 + 1);
    puVar8 = param_2 + 3;
    pbVar1 = (byte *)(uVar11 + (long)puVar8);
  }
  else {
    pbVar1 = (byte *)((long)puVar8 + uVar11);
  }
  if (uVar11 == 0) {
    pcVar6 = (char *)0x0;
  }
  else if (*puVar8 == 0) {
    uVar3 = puVar8[1];
    if (((byte)uVar3 & 0xfd) == 1) {
      pbVar16 = (byte *)((long)puVar8 + 5);
      pbVar9 = pbVar16;
      do {
        local_48 = pbVar9 + 1;
        bVar2 = *pbVar9;
        pbVar9 = local_48;
      } while (bVar2 != 0);
      uVar5 = FUN_00c2e6c8(&local_48,pbVar1);
      uVar12 = 0;
      uVar11 = 0xfffffffffffffff9;
      *(undefined4 *)(param_3 + 5) = uVar5;
      pbVar9 = local_48;
      pbVar13 = local_48;
      do {
        pbVar10 = pbVar9;
        if (pbVar13 == pbVar1) {
          fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                  "truncated sleb128 expression");
          fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
          abort();
        }
        pbVar14 = pbVar13 + 1;
        bVar2 = *pbVar13;
        uVar11 = uVar11 + 7;
        pbVar9 = pbVar10 + 1;
        uVar12 = ((ulong)bVar2 & 0x7f) << (uVar11 & 0x3f) | uVar12;
        pbVar13 = pbVar14;
      } while ((char)bVar2 < '\0');
      uVar15 = (uint)(-1L << ((ulong)((int)uVar11 + 7) & 0x3f));
      if (0x38 < uVar11 || bVar2 < 0x40) {
        uVar15 = 0;
      }
      *(uint *)((long)param_3 + 0x2c) = (uint)uVar12 | uVar15;
      if ((byte)uVar3 == 1) {
        local_48 = pbVar10 + 2;
        *(byte *)((long)param_3 + 0x32) = *pbVar14;
        bVar2 = *pbVar16;
      }
      else {
        local_48 = pbVar9;
        uVar4 = FUN_00c2e6c8(&local_48,pbVar1);
        *(undefined1 *)((long)param_3 + 0x32) = uVar4;
        bVar2 = *pbVar16;
      }
      if (bVar2 == 0x7a) {
        FUN_00c2e6c8(&local_48,pbVar1);
LAB_00c2c8e4:
        bVar2 = *pbVar16;
        if (bVar2 < 0x50) {
          if (bVar2 < 0x47) {
            if (bVar2 != 0x42) {
              if (bVar2 != 0) goto LAB_00c2c984;
              goto LAB_00c2c9c8;
            }
            *(undefined1 *)((long)param_3 + 0x33) = 1;
            pbVar16 = pbVar16 + 1;
            goto LAB_00c2c8e4;
          }
          if (bVar2 == 0x47) {
            *(undefined1 *)((long)param_3 + 0x34) = 1;
            goto LAB_00c2c984;
          }
          if (bVar2 == 0x4c) {
            pbVar16 = pbVar16 + 1;
            *(byte *)((long)param_3 + 0x19) = *local_48;
            local_48 = local_48 + 1;
            goto LAB_00c2c8e4;
          }
        }
        else if (bVar2 < 0x53) {
          if (bVar2 == 0x50) {
            bVar2 = *local_48;
            *(byte *)((long)param_3 + 0x1a) = bVar2;
            *(char *)((long)param_3 + 0x1b) = (char)(local_48 + 1) - (char)param_2;
            local_48 = local_48 + 1;
            lVar7 = FUN_00c2e33c(param_1,&local_48,pbVar1,bVar2,0);
            param_3[4] = lVar7;
            pbVar16 = pbVar16 + 1;
            goto LAB_00c2c8e4;
          }
          if (bVar2 == 0x52) {
            pbVar16 = pbVar16 + 1;
            *(byte *)(param_3 + 3) = *local_48;
            local_48 = local_48 + 1;
            goto LAB_00c2c8e4;
          }
        }
        else {
          if (bVar2 == 0x53) {
            *(undefined1 *)(param_3 + 6) = 1;
            pbVar16 = pbVar16 + 1;
            goto LAB_00c2c8e4;
          }
          if (bVar2 == 0x7a) {
            *(undefined1 *)((long)param_3 + 0x31) = 1;
            pbVar16 = pbVar16 + 1;
            goto LAB_00c2c8e4;
          }
        }
LAB_00c2c984:
        pbVar16 = pbVar16 + 1;
        goto LAB_00c2c8e4;
      }
LAB_00c2c9c8:
      pcVar6 = (char *)0x0;
      param_3[1] = (long)pbVar1 - *param_3;
      param_3[2] = (long)local_48;
    }
    else {
      pcVar6 = "CIE version is not 1 or 3";
    }
  }
  else {
    pcVar6 = "CIE ID is not zero";
  }
  return pcVar6;
}

