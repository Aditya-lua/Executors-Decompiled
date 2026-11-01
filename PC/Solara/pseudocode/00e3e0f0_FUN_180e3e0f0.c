int FUN_180e3e0f0(uint param_1,short *param_2,longlong param_3)

{
  byte *pbVar1;
  byte bVar2;
  longlong lVar3;
  undefined8 uVar4;
  short *psVar5;
  int iVar6;
  ulonglong uVar7;
  short *psVar8;
  short sVar9;
  short *psVar10;
  longlong lVar11;
  longlong lVar12;
  short asStackX_8 [4];
  short asStackX_10 [4];
  int aiStackX_18 [2];
  
  lVar11 = 0;
  uVar7 = (ulonglong)(param_1 & 0x3f);
  lVar12 = (longlong)(int)param_1 >> 6;
  lVar3 = *(longlong *)(lVar12 * 8 + 0x1810d49f0);
  uVar4 = *(undefined8 *)(lVar3 + 0x28 + uVar7 * 0x48);
  if ((param_3 == 0) || (*param_2 != 10)) {
    pbVar1 = (byte *)(lVar3 + 0x38 + uVar7 * 0x48);
    *pbVar1 = *pbVar1 & 0xfb;
  }
  else {
    pbVar1 = (byte *)(lVar3 + 0x38 + uVar7 * 0x48);
    *pbVar1 = *pbVar1 | 4;
  }
  psVar10 = param_2;
  psVar5 = param_2;
  do {
    if (param_2 + param_3 <= psVar5) goto LAB_180e3e2ca;
    sVar9 = *psVar5;
    if (sVar9 == 0x1a) {
      lVar3 = *(longlong *)(lVar12 * 8 + 0x1810d49f0);
      bVar2 = *(byte *)(lVar3 + 0x38 + (ulonglong)(param_1 & 0x3f) * 0x48);
      if ((bVar2 & 0x40) != 0) {
        *psVar10 = 0x1a;
        goto LAB_180e3e2c7;
      }
      *(byte *)(lVar3 + 0x38 + (ulonglong)(param_1 & 0x3f) * 0x48) = bVar2 | 2;
      goto LAB_180e3e2ca;
    }
    psVar8 = psVar5 + 1;
    if (sVar9 == 0xd) {
      if (param_2 + param_3 <= psVar8) {
        asStackX_8[0] = 0;
        aiStackX_18[0] = 0;
        iVar6 = ReadFile(uVar4,asStackX_8,2,aiStackX_18,0);
        if ((iVar6 == 0) || (aiStackX_18[0] == 0)) {
LAB_180e3e28e:
          *psVar10 = 0xd;
          goto LAB_180e3e2c7;
        }
        if ((*(byte *)(*(longlong *)(lVar12 * 8 + 0x1810d49f0) + 0x38 + uVar7 * 0x48) & 0x48) == 0)
        {
          if ((asStackX_8[0] != 10) || (psVar10 != param_2)) {
            FUN_180e3ee10(param_1,0xfffffffffffffffe,1);
            if (asStackX_8[0] != 10) goto LAB_180e3e28e;
            goto LAB_180e3e2ca;
          }
        }
        else if (asStackX_8[0] != 10) {
          asStackX_10[0] = asStackX_8[0];
          *psVar10 = 0xd;
          do {
            *(undefined1 *)
             (*(longlong *)(lVar12 * 8 + 0x1810d49f0) + (ulonglong)(param_1 & 0x3f) * 0x48 + 0x3a +
             lVar11) = *(undefined1 *)((longlong)asStackX_10 + lVar11);
            lVar11 = lVar11 + 1;
          } while (lVar11 < 2);
          *(undefined1 *)
           (*(longlong *)(lVar12 * 8 + 0x1810d49f0) + 0x3c + (ulonglong)(param_1 & 0x3f) * 0x48) =
               10;
LAB_180e3e2c7:
          psVar10 = psVar10 + 1;
LAB_180e3e2ca:
          return (int)((longlong)psVar10 - (longlong)param_2 >> 1) * 2;
        }
        *psVar10 = 10;
        goto LAB_180e3e2c7;
      }
      if (*psVar8 == 10) {
        psVar8 = psVar5 + 2;
        sVar9 = 10;
      }
    }
    *psVar10 = sVar9;
    psVar10 = psVar10 + 1;
    psVar5 = psVar8;
  } while( true );
}


