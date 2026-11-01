int FUN_180e3e2ec(uint param_1,byte *param_2,longlong param_3,undefined8 param_4,undefined4 param_5)

{
  byte bVar1;
  char cVar2;
  longlong lVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  byte *pbVar6;
  undefined4 *puVar7;
  int iVar8;
  int iVar9;
  byte *pbVar10;
  byte *pbVar11;
  uint uVar12;
  ulonglong uVar13;
  longlong lVar14;
  char acStackX_8 [8];
  int aiStackX_10 [2];
  
  lVar14 = (longlong)(int)param_1 >> 6;
  uVar13 = (ulonglong)(param_1 & 0x3f);
  lVar3 = *(longlong *)(lVar14 * 8 + 0x1810d49f0);
  uVar4 = *(undefined8 *)(lVar3 + 0x28 + uVar13 * 0x48);
  if ((param_3 == 0) || (*param_2 != 10)) {
    pbVar10 = (byte *)(lVar3 + 0x38 + uVar13 * 0x48);
    *pbVar10 = *pbVar10 & 0xfb;
  }
  else {
    pbVar10 = (byte *)(lVar3 + 0x38 + uVar13 * 0x48);
    *pbVar10 = *pbVar10 | 4;
  }
  pbVar10 = param_2;
  pbVar11 = param_2;
  do {
    if (param_2 + param_3 <= pbVar11) {
LAB_180e3e458:
      iVar8 = (int)pbVar10 - (int)param_2;
      if (iVar8 == 0) {
        return 0;
      }
      if (*(char *)(*(longlong *)(lVar14 * 8 + 0x1810d49f0) + 0x39 + uVar13 * 0x48) != '\0') {
        pbVar10 = param_2 + iVar8;
        if ((char)pbVar10[-1] < '\0') {
          uVar13 = 1;
          for (pbVar10 = pbVar10 + -1;
              ((uVar12 = (uint)uVar13, *(char *)((ulonglong)*pbVar10 + 0x1810c1ce0) == '\0' &&
               (uVar12 < 5)) && (param_2 <= pbVar10)); pbVar10 = pbVar10 + -1) {
            uVar13 = (ulonglong)(uVar12 + 1);
          }
          cVar2 = *(char *)((ulonglong)*pbVar10 + 0x1810c1ce0);
          if (cVar2 == '\0') {
            puVar7 = (undefined4 *)FUN_180e1db20();
            *puVar7 = 0x2a;
            return -1;
          }
          if ((int)cVar2 + 1U == uVar12) {
            pbVar10 = pbVar10 + uVar13;
          }
          else {
            lVar3 = *(longlong *)(lVar14 * 8 + 0x1810d49f0);
            if ((*(byte *)(lVar3 + 0x38 + (ulonglong)(param_1 & 0x3f) * 0x48) & 0x48) == 0) {
              FUN_180e3ee10(param_1,(longlong)(int)-uVar12,1);
            }
            else {
              pbVar11 = pbVar10 + 1;
              *(byte *)(lVar3 + 0x3a + (ulonglong)(param_1 & 0x3f) * 0x48) = *pbVar10;
              if (1 < uVar12) {
                bVar1 = *pbVar11;
                pbVar11 = pbVar10 + 2;
                *(byte *)(*(longlong *)(lVar14 * 8 + 0x1810d49f0) + 0x3b +
                         (ulonglong)(param_1 & 0x3f) * 0x48) = bVar1;
              }
              if (uVar12 == 3) {
                bVar1 = *pbVar11;
                pbVar11 = pbVar11 + 1;
                *(byte *)(*(longlong *)(lVar14 * 8 + 0x1810d49f0) + 0x3c +
                         (ulonglong)(param_1 & 0x3f) * 0x48) = bVar1;
              }
              pbVar10 = pbVar11 + -uVar13;
            }
          }
        }
        iVar9 = (int)pbVar10 - (int)param_2;
        iVar8 = func_0x000180e3fcc0(0xfde9,0,param_2,iVar9,param_4,param_5);
        if (iVar8 == 0) {
          uVar5 = GetLastError();
          FUN_180e1dab0(uVar5);
          return -1;
        }
        lVar3 = *(longlong *)(lVar14 * 8 + 0x1810d49f0);
        *(byte *)(lVar3 + 0x3d + (ulonglong)(param_1 & 0x3f) * 0x48) =
             -(iVar8 != iVar9) & 2U |
             *(byte *)(lVar3 + 0x3d + (ulonglong)(param_1 & 0x3f) * 0x48) & 0xfd;
        return iVar8 * 2;
      }
      return iVar8;
    }
    bVar1 = *pbVar11;
    if (bVar1 == 0x1a) {
      lVar3 = *(longlong *)(lVar14 * 8 + 0x1810d49f0);
      bVar1 = *(byte *)(lVar3 + 0x38 + uVar13 * 0x48);
      if ((bVar1 & 0x40) != 0) {
        *pbVar10 = 0x1a;
        goto LAB_180e3e455;
      }
      *(byte *)(lVar3 + 0x38 + uVar13 * 0x48) = bVar1 | 2;
      goto LAB_180e3e458;
    }
    pbVar6 = pbVar11 + 1;
    if (bVar1 == 0xd) {
      if (param_2 + param_3 <= pbVar6) {
        acStackX_8[0] = '\0';
        aiStackX_10[0] = 0;
        iVar8 = ReadFile(uVar4,acStackX_8,1,aiStackX_10,0);
        if ((iVar8 == 0) || (aiStackX_10[0] == 0)) {
          *pbVar10 = 0xd;
        }
        else if ((*(byte *)(*(longlong *)(lVar14 * 8 + 0x1810d49f0) + 0x38 + uVar13 * 0x48) & 0x48)
                 == 0) {
          if ((acStackX_8[0] == '\n') && (pbVar10 == param_2)) goto LAB_180e3e3e6;
          FUN_180e3ee10(param_1,0xffffffffffffffff,1);
          if (acStackX_8[0] == '\n') goto LAB_180e3e458;
          *pbVar10 = 0xd;
        }
        else if (acStackX_8[0] == '\n') {
LAB_180e3e3e6:
          *pbVar10 = 10;
        }
        else {
          *pbVar10 = 0xd;
          *(char *)(*(longlong *)(lVar14 * 8 + 0x1810d49f0) + 0x3a + uVar13 * 0x48) = acStackX_8[0];
        }
LAB_180e3e455:
        pbVar10 = pbVar10 + 1;
        goto LAB_180e3e458;
      }
      if (*pbVar6 != 10) goto LAB_180e3e385;
      pbVar6 = pbVar11 + 2;
      *pbVar10 = 10;
    }
    else {
LAB_180e3e385:
      *pbVar10 = bVar1;
    }
    pbVar10 = pbVar10 + 1;
    pbVar11 = pbVar6;
  } while( true );
}


