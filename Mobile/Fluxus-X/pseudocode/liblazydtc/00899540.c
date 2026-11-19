/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00899540
 */

void FUN_00899540(undefined8 *param_1,undefined8 *param_2,long param_3,undefined8 param_4)

{
  uint uVar1;
  uint uVar2;
  char cVar3;
  undefined1 uVar4;
  int iVar5;
  size_t sVar6;
  undefined8 uVar7;
  undefined4 uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  char *pcVar12;
  long lVar13;
  undefined8 uVar14;
  
  if (0 < *(int *)((long)param_2 + 0xc)) {
    FUN_00876644(*param_2,*(int *)(param_3 + 0xc) + 1);
  }
  iVar5 = *(int *)(param_3 + 8);
  if ((param_3 == 0) || (iVar5 != DAT_00d1b010)) {
    if ((param_3 == 0) || (iVar5 != DAT_00d1b020)) {
      if ((param_3 == 0) || (iVar5 != DAT_00d1b050)) {
        if ((param_3 == 0) || (iVar5 != DAT_00d1b060)) {
          param_1[3] = 0;
          param_1[2] = 0;
          param_1[5] = 0;
          param_1[4] = 0;
          param_1[1] = 0;
          *param_1 = 0;
          return;
        }
        lVar13 = *(long *)(param_3 + 0x20);
        iVar5 = FUN_0088df20(param_2,lVar13);
        if (iVar5 < 0) {
          iVar5 = *(int *)((long)param_2 + 0x64c);
          uVar1 = iVar5 + 1;
          if (0xff < uVar1) goto LAB_008998d0;
          *(uint *)((long)param_2 + 0x64c) = uVar1;
          uVar2 = *(uint *)(param_2 + 0xca);
          if (*(uint *)(param_2 + 0xca) <= uVar1) {
            uVar2 = uVar1;
          }
          *(uint *)(param_2 + 0xca) = uVar2;
          iVar5 = FUN_00891438(param_2,lVar13,iVar5,0xff);
        }
        FUN_00891ba0(param_1,param_2,iVar5,*(undefined8 *)(param_3 + 0x28),param_4);
        return;
      }
      uVar8 = 3;
      if ((DAT_00d1ec80 == '\x01') && (uVar8 = 6, *(char *)(param_3 + 0x49) == '\0')) {
        uVar8 = 3;
      }
      lVar13 = *(long *)(param_3 + 0x20);
      *(undefined4 *)param_1 = uVar8;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined4 *)((long)param_1 + 0x1c) = 0;
      iVar5 = FUN_0088df20(param_2,lVar13);
      if (iVar5 < 0) {
        iVar5 = *(int *)((long)param_2 + 0x64c);
        uVar1 = iVar5 + 1;
        if (0xff < uVar1) {
LAB_008998d0:
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(lVar13 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                       0xff);
        }
        *(uint *)((long)param_2 + 0x64c) = uVar1;
        uVar2 = *(uint *)(param_2 + 0xca);
        if (*(uint *)(param_2 + 0xca) <= uVar1) {
          uVar2 = uVar1;
        }
        *(uint *)(param_2 + 0xca) = uVar2;
        iVar5 = FUN_00891438(param_2,lVar13,iVar5,0xff);
      }
      cVar3 = DAT_00d1ec80;
      *(char *)((long)param_1 + 4) = (char)iVar5;
      if ((cVar3 == '\x01') && (*(char *)(param_3 + 0x49) == '\x01')) {
        param_1[1] = *(undefined8 *)(param_3 + 0x28);
      }
      else {
        pcVar12 = *(char **)(param_3 + 0x28);
        sVar6 = strlen(pcVar12);
        param_1[2] = pcVar12;
        param_1[3] = sVar6;
      }
      uVar7 = *(undefined8 *)(param_3 + 0xc);
      param_1[5] = *(undefined8 *)(param_3 + 0x14);
      param_1[4] = uVar7;
      return;
    }
    pcVar12 = *(char **)(param_3 + 0x20);
    *(undefined8 *)((long)param_1 + 4) = 0;
    *(undefined4 *)param_1 = 2;
    *(undefined4 *)((long)param_1 + 0xc) = 0;
  }
  else {
    if ((DAT_00d1ec40 != '\x01') ||
       (uVar9 = *(ulong *)(param_3 + 0x20), *(char *)(uVar9 + 0x31) != '\x01')) {
LAB_008996d0:
      iVar5 = FUN_0088df20(param_2,param_3);
      if (-1 < iVar5) {
        uVar14 = *(undefined8 *)(param_3 + 0x14);
        uVar7 = *(undefined8 *)(param_3 + 0xc);
        param_1[1] = 0;
        *param_1 = 0;
        param_1[3] = 0;
        param_1[2] = 0;
        *(char *)((long)param_1 + 4) = (char)iVar5;
        param_1[5] = uVar14;
        param_1[4] = uVar7;
        return;
      }
      uVar7 = *(undefined8 *)(param_3 + 0x20);
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined4 *)param_1 = 1;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined4 *)((long)param_1 + 0x1c) = 0;
      uVar4 = FUN_0088dd6c(param_2,uVar7);
      uVar14 = *(undefined8 *)(param_3 + 0x14);
      uVar7 = *(undefined8 *)(param_3 + 0xc);
      *(undefined1 *)((long)param_1 + 5) = uVar4;
      goto LAB_008997e8;
    }
    if ((DAT_00d1f0a8 == '\x01') && (param_2[0x19a] != 0)) {
      uVar11 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
      uVar11 = (uVar9 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
      uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_2 + 0x19b) & 0x3f);
      if ((*(ulong *)(param_2[0x198] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(param_2[0x195] + uVar11 * 8) == uVar9) goto LAB_008996d0;
          uVar11 = uVar11 + 1 & param_2[0x199] - 1;
        } while ((*(ulong *)(param_2[0x198] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
      }
    }
    uVar4 = FUN_0088c318(param_2,param_3);
    puVar10 = *(undefined8 **)(param_3 + 0x20);
    *(undefined8 *)((long)param_1 + 4) = 0;
    *(undefined4 *)((long)param_1 + 0xc) = 0;
    pcVar12 = (char *)*puVar10;
    *(undefined4 *)param_1 = 3;
    *(undefined1 *)((long)param_1 + 4) = uVar4;
  }
  sVar6 = strlen(pcVar12);
  uVar14 = *(undefined8 *)(param_3 + 0x14);
  uVar7 = *(undefined8 *)(param_3 + 0xc);
  param_1[2] = pcVar12;
  param_1[3] = sVar6;
LAB_008997e8:
  param_1[5] = uVar14;
  param_1[4] = uVar7;
  return;
}

