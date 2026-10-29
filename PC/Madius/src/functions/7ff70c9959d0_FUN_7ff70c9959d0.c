/* 7ff70c9959d0 FUN_7ff70c9959d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c9959d0(ulonglong param_1,ulonglong param_2,ulonglong param_3,ulonglong param_4)

{
  ushort uVar1;
  uint uVar2;
  ulonglong uVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  ulonglong uVar7;
  bool bVar8;
  ulonglong uStack_48;
  undefined4 uStack_40;
  
  if ((param_2 & param_1 & param_3) == 0xffffffffffffffff) {
    uVar3 = 0;
    if (param_4 != 0) {
      if ((longlong)param_4 < 0) {
        func_0x7ff70d7a6ebd(0x2726);
        uVar3 = 0xffffffff;
      }
      else {
        uVar3 = 0xfffffffe;
        if (param_4 < 0xfffffffe) {
          uVar3 = param_4;
        }
        (*_DAT_7ff70cb95960)(uVar3);
        uVar3 = 0;
      }
    }
  }
  else {
    bVar8 = param_1 != 0xffffffffffffffff;
    if (bVar8) {
      uStack_40 = 0x700;
      uStack_48 = param_1;
    }
    uVar6 = (uint)bVar8;
    if (param_2 != 0xffffffffffffffff) {
      (&uStack_48)[(ulonglong)bVar8 * 2] = param_2;
      (&uStack_40)[(ulonglong)bVar8 * 4] = 0x700;
      uVar6 = bVar8 + 1;
    }
    if (param_3 != 0xffffffffffffffff) {
      *(ulonglong *)((longlong)&uStack_48 + (ulonglong)(uVar6 << 4)) = param_3;
      *(undefined4 *)((longlong)&uStack_40 + (ulonglong)(uVar6 << 4)) = 0x410;
      uVar6 = uVar6 + 1;
    }
    uVar3 = FUN_7ff70c995b40(&uStack_48,uVar6,param_4);
    if (0 < (int)uVar3) {
      if (param_1 == 0xffffffffffffffff) {
        iVar5 = 0;
        iVar4 = 0;
        uVar3 = 0;
      }
      else {
        bVar8 = (uStack_40 & 0x3030000) != 0;
        uVar3 = (ulonglong)(bVar8 + 4);
        if ((uStack_40 & 0x4040000) == 0) {
          uVar3 = (ulonglong)bVar8;
        }
        iVar4 = 1;
        iVar5 = 1;
      }
      if (param_2 != 0xffffffffffffffff) {
        uVar1 = *(ushort *)((longlong)&uStack_40 + (ulonglong)(uint)(iVar5 << 4) + 2);
        uVar7 = (ulonglong)((int)uVar3 + 8);
        if ((uVar1 & 0x303) == 0) {
          uVar7 = uVar3;
        }
        uVar3 = (ulonglong)((uint)uVar7 | 4);
        if ((uVar1 & 0x404) == 0) {
          uVar3 = uVar7;
        }
        iVar4 = iVar5 + 1;
      }
      if (param_3 != 0xffffffffffffffff) {
        uVar1 = *(ushort *)((longlong)&uStack_40 + (ulonglong)(uint)(iVar4 << 4) + 2);
        uVar2 = (uint)uVar3 | uVar1 >> 3 & 2;
        uVar6 = uVar2 | 4;
        if ((uVar1 & 0x407) == 0) {
          uVar6 = uVar2;
        }
        uVar3 = (ulonglong)uVar6;
      }
    }
  }
  return uVar3;
}


