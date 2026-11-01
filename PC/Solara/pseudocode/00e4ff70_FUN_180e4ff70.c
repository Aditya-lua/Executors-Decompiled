int FUN_180e4ff70(undefined4 *param_1,uint *param_2,undefined8 param_3,uint param_4,
                 undefined4 param_5,undefined4 param_6)

{
  byte *pbVar1;
  uint uVar2;
  longlong lVar3;
  uint uVar4;
  undefined4 uVar5;
  int iVar6;
  ulonglong *puVar7;
  undefined4 *puVar8;
  int *piVar9;
  longlong lVar10;
  byte bVar11;
  ulonglong uVar12;
  undefined1 auStack_c8 [4];
  undefined4 uStack_c4;
  undefined8 uStack_c0;
  ulonglong uStack_b8;
  ulonglong uStack_b0;
  byte bStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  uint uStack_90;
  undefined4 uStack_8c;
  ulonglong uStack_88;
  ulonglong uStack_80;
  ulonglong uStack_78;
  ulonglong uStack_68;
  ulonglong uStack_60;
  ulonglong uStack_58;
  undefined1 auStack_48 [32];
  
  puVar7 = (ulonglong *)FUN_180e4fb24(auStack_48,param_4,param_5,param_6);
  uStack_c0 = *puVar7;
  uStack_b8 = puVar7[1];
  uStack_b0 = puVar7[2];
  uVar12 = puVar7[1] >> 0x20;
  uStack_88 = uStack_b0;
  uStack_78 = uVar12;
  uStack_68 = uStack_c0;
  uStack_60 = uStack_b8;
  if ((int)(puVar7[1] >> 0x20) == -1) {
    puVar8 = (undefined4 *)FUN_180e1dafc();
    *puVar8 = 0;
    *param_2 = 0xffffffff;
    goto LAB_180e4ffef;
  }
  uVar4 = FUN_180e431d0();
  *param_2 = uVar4;
  if (uVar4 == 0xffffffff) {
    puVar8 = (undefined4 *)FUN_180e1dafc();
    *puVar8 = 0;
    *param_2 = 0xffffffff;
    puVar8 = (undefined4 *)FUN_180e1db20();
    *puVar8 = 0x18;
    goto LAB_180e4ffef;
  }
  uStack_c4 = (undefined4)uStack_60;
  *param_1 = 1;
  uVar4 = (uint)(uStack_b0 >> 0x20) | (uint)uStack_b0;
  uStack_80 = (ulonglong)uVar4;
  uStack_90 = ~(param_4 >> 7) & 1;
  uStack_a0 = 0x18;
  uStack_8c = 0;
  uStack_98 = 0;
  lVar10 = CreateFileW(param_3,uStack_68 >> 0x20,uVar12,&uStack_a0,uStack_c4,uVar4,0);
  if (lVar10 == -1) {
    uVar2 = (uint)(uStack_68 >> 0x20);
    if (((uVar2 & 0xc0000000) == 0xc0000000) && ((param_4 & 1) != 0)) {
      uStack_c0 = CONCAT44(uVar2,(undefined4)uStack_c0) & 0x7fffffffffffffff;
      lVar10 = CreateFileW(param_3,uStack_c0 >> 0x20,uVar12,&uStack_a0,uStack_c4,uVar4,0);
      uVar4 = uVar2 & 0x7fffffff;
      if (lVar10 != -1) goto LAB_180e50129;
    }
    pbVar1 = (byte *)(*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x38 +
                     (ulonglong)(*param_2 & 0x3f) * 0x48);
    *pbVar1 = *pbVar1 & 0xfe;
    uVar5 = GetLastError();
    FUN_180e1dab0(uVar5);
  }
  else {
    uVar4 = uStack_c0._4_4_;
LAB_180e50129:
    iVar6 = GetFileType(lVar10);
    if (iVar6 != 0) {
      if (iVar6 == 2) {
        bVar11 = (byte)uStack_c0 | 0x40;
      }
      else {
        bVar11 = (byte)uStack_c0;
        if (iVar6 == 3) {
          bVar11 = (byte)uStack_c0 | 8;
        }
      }
      FUN_180e430e8(*param_2,lVar10);
      bStack_a8 = bVar11 | 1;
      uStack_c0 = CONCAT71(uStack_c0._1_7_,bVar11) | 1;
      *(byte *)(*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x38 +
               (ulonglong)(*param_2 & 0x3f) * 0x48) = bStack_a8;
      *(undefined1 *)
       (*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x39 +
       (ulonglong)(*param_2 & 0x3f) * 0x48) = 0;
      if (((param_4 & 2) == 0) || (iVar6 = FUN_180e4fd38(*param_2), iVar6 == 0)) {
        uStack_68 = uStack_c0;
        uStack_60 = uStack_b8;
        auStack_c8[0] = 0;
        uStack_58 = uStack_88;
        iVar6 = FUN_180e4f8a4(*param_2,&uStack_68,param_4,auStack_c8);
        uVar2 = *param_2;
        if (iVar6 == 0) {
          *(undefined1 *)
           (*(longlong *)(((longlong)(int)uVar2 >> 6) * 8 + 0x1810d49f0) + 0x39 +
           (ulonglong)(uVar2 & 0x3f) * 0x48) = auStack_c8[0];
          uVar12 = (ulonglong)(*param_2 & 0x3f);
          lVar3 = *(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0);
          pbVar1 = (byte *)(lVar3 + 0x3d + uVar12 * 0x48);
          *pbVar1 = *pbVar1 ^ ((byte)(param_4 >> 0x10) ^ *(byte *)(lVar3 + 0x3d + uVar12 * 0x48)) &
                              1;
          if (((bStack_a8 & 0x48) == 0) && ((param_4 & 8) != 0)) {
            pbVar1 = (byte *)(*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x38
                             + (ulonglong)(*param_2 & 0x3f) * 0x48);
            *pbVar1 = *pbVar1 | 0x20;
          }
          if (((uVar4 & 0xc0000000) == 0xc0000000) && ((param_4 & 1) != 0)) {
            CloseHandle(lVar10);
            uStack_c0 = CONCAT44(uVar4,(undefined4)uStack_c0) & 0x7fffffffffffffff;
            lVar10 = CreateFileW(param_3,uStack_c0 >> 0x20,uStack_78 & 0xffffffff,&uStack_a0,
                                 uStack_c4,(int)uStack_80,0);
            if (lVar10 == -1) {
              uVar5 = GetLastError();
              FUN_180e1dab0(uVar5);
              pbVar1 = (byte *)(*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) +
                                0x38 + (ulonglong)(*param_2 & 0x3f) * 0x48);
              *pbVar1 = *pbVar1 & 0xfe;
              FUN_180e43310(*param_2);
              goto LAB_180e4ffef;
            }
            *(longlong *)
             (*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x28 +
             (ulonglong)(*param_2 & 0x3f) * 0x48) = lVar10;
          }
          return 0;
        }
      }
      else {
        uVar2 = *param_2;
      }
      FUN_180e3c608(uVar2);
      return iVar6;
    }
    iVar6 = GetLastError();
    FUN_180e1dab0(iVar6);
    pbVar1 = (byte *)(*(longlong *)(((longlong)(int)*param_2 >> 6) * 8 + 0x1810d49f0) + 0x38 +
                     (ulonglong)(*param_2 & 0x3f) * 0x48);
    *pbVar1 = *pbVar1 & 0xfe;
    CloseHandle(lVar10);
    if (iVar6 == 0) {
      puVar8 = (undefined4 *)FUN_180e1db20();
      *puVar8 = 0xd;
    }
  }
LAB_180e4ffef:
  piVar9 = (int *)FUN_180e1db20();
  return *piVar9;
}


