
void FUN_0065bbcc(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined1 uStack0000000000000068;
  undefined1 auStack_e0 [8];
  undefined1 auStack_d8 [32];
  undefined1 auStack_b8 [32];
  undefined1 uStack_98;
  undefined1 auStack_90 [48];
  
  func_0x00087574(&uStack0000000000000068);
  lVar2 = __Unwind_Resume();
  if (1 < param_3) {
    uVar8 = param_3 - 2U >> 1;
    if (param_4 - lVar2 >> 7 <= (long)uVar8) {
      uVar4 = param_4 - lVar2 >> 6;
      uVar9 = uVar4 | 1;
      lVar7 = lVar2 + uVar9 * 0x80;
      uVar4 = uVar4 + 2;
      uVar10 = uVar9;
      if ((long)uVar4 < param_3) {
        uVar3 = func_0x00609ec8(lVar7 + 0x50,lVar7 + 0xd0);
        lVar7 = lVar7 + (uVar3 >> 0x1f & 1) * 0x80;
        uVar10 = uVar4;
        if (-1 < (int)uVar3) {
          uVar10 = uVar9;
        }
      }
      iVar1 = func_0x00609ec8(lVar7 + 0x50,param_4 + 0x50);
      if (-1 < iVar1) {
        func_0x00650c94(auStack_e0,param_4);
        do {
          lVar6 = lVar7;
          func_0x00677180(param_4 + 8,lVar6 + 8);
          func_0x00677180(param_4 + 0x28,lVar6 + 0x28);
          *(undefined1 *)(param_4 + 0x48) = *(undefined1 *)(lVar6 + 0x48);
          func_0x005ffccc(param_4 + 0x50,lVar6 + 0x50);
          if ((long)uVar8 < (long)uVar10) break;
          lVar5 = uVar10 * 2;
          uVar10 = uVar10 << 1 | 1;
          lVar7 = lVar2 + uVar10 * 0x80;
          uVar4 = lVar5 + 2;
          if ((long)uVar4 < param_3) {
            uVar9 = func_0x00609ec8(lVar7 + 0x50,lVar7 + 0xd0);
            lVar7 = lVar7 + (uVar9 >> 0x1f & 1) * 0x80;
            if (-1 < (int)uVar9) {
              uVar4 = uVar10;
            }
            uVar10 = uVar4;
          }
          iVar1 = func_0x00609ec8(lVar7 + 0x50,auStack_90);
          param_4 = lVar6;
        } while (-1 < iVar1);
        func_0x00677180(lVar6 + 8,auStack_d8);
        func_0x00677180(lVar6 + 0x28,auStack_b8);
        *(undefined1 *)(lVar6 + 0x48) = uStack_98;
        func_0x005ffccc(lVar6 + 0x50,auStack_90);
        func_0x00650db0(auStack_e0);
      }
    }
  }
  return;
}

