
void FUN_000f21ac(float param_1,float param_2,float param_3,long param_4,undefined8 *param_5,
                 int param_6)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  int iVar6;
  float fVar7;
  float fVar8;
  undefined8 uVar9;
  
  iVar5 = *(int *)(param_4 + 0x78);
  uVar9 = 0x3f000000;
  if (0.5 <= param_1) {
    uVar1 = param_6 + iVar5 + 1;
    if (*(int *)(param_4 + 0x7c) < (int)uVar1) {
      uVar4 = func_0x000b810c(-(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3);
      if (*(long *)(param_4 + 0x80) != 0) {
        _memcpy(uVar4,*(long *)(param_4 + 0x80),(long)*(int *)(param_4 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(param_4 + 0x80));
      }
      *(undefined8 *)(param_4 + 0x80) = uVar4;
      *(uint *)(param_4 + 0x7c) = uVar1;
    }
    if (-1 < param_6) {
      iVar6 = 0;
      iVar5 = *(int *)(param_4 + 0x78);
      do {
        fVar8 = (float)uVar9;
        fVar7 = (float)___sincosf_stret(param_2 + (param_3 - param_2) *
                                                  ((float)iVar6 / (float)param_6));
        uVar4 = *param_5;
        if (iVar5 == *(int *)(param_4 + 0x7c)) {
          iVar2 = iVar5;
          if (iVar5 < 0) {
            iVar2 = iVar5 + 1;
          }
          uVar1 = 8;
          if (iVar5 != 0) {
            uVar1 = iVar5 + (iVar2 >> 1);
          }
          if ((int)uVar1 <= (int)(iVar5 + 1U)) {
            uVar1 = iVar5 + 1U;
          }
          lVar3 = func_0x000b810c(-(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3);
          if (*(long *)(param_4 + 0x80) != 0) {
            _memcpy(lVar3,*(long *)(param_4 + 0x80),(long)*(int *)(param_4 + 0x78) << 3);
            func_0x000b83d4(*(undefined8 *)(param_4 + 0x80));
          }
          *(long *)(param_4 + 0x80) = lVar3;
          *(uint *)(param_4 + 0x7c) = uVar1;
          iVar5 = *(int *)(param_4 + 0x78);
        }
        else {
          lVar3 = *(long *)(param_4 + 0x80);
        }
        uVar9 = CONCAT44(fVar7,fVar8);
        *(ulong *)(lVar3 + (long)iVar5 * 8) =
             CONCAT44((float)((ulong)uVar4 >> 0x20) + param_1 * fVar7,(float)uVar4 + param_1 * fVar8
                     );
        iVar5 = *(int *)(param_4 + 0x78) + 1;
        *(int *)(param_4 + 0x78) = iVar5;
        iVar6 = iVar6 + 1;
      } while (param_6 + 1 != iVar6);
    }
  }
  else {
    if (iVar5 == *(int *)(param_4 + 0x7c)) {
      iVar6 = iVar5;
      if (iVar5 < 0) {
        iVar6 = iVar5 + 1;
      }
      uVar1 = 8;
      if (iVar5 != 0) {
        uVar1 = iVar5 + (iVar6 >> 1);
      }
      if ((int)uVar1 <= (int)(iVar5 + 1U)) {
        uVar1 = iVar5 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3);
      if (*(long *)(param_4 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(param_4 + 0x80),(long)*(int *)(param_4 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(param_4 + 0x80));
      }
      *(long *)(param_4 + 0x80) = lVar3;
      *(uint *)(param_4 + 0x7c) = uVar1;
      iVar5 = *(int *)(param_4 + 0x78);
    }
    else {
      lVar3 = *(long *)(param_4 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar5 * 8) = *param_5;
    *(int *)(param_4 + 0x78) = *(int *)(param_4 + 0x78) + 1;
  }
  return;
}

