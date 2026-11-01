/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e32ab0(longlong *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  uint uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  byte *pbVar9;
  longlong lVar10;
  undefined8 uStack_40;
  
  uStack_40 = 0x180e32aca;
  lVar4 = FUN_180e15b20();
  lVar4 = -lVar4;
  *(ulonglong *)(&stack0x00001008 + lVar4) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffc8 + lVar4);
  *(undefined8 *)((longlong)&uStack_40 + lVar4) = 0x180e32aed;
  uVar2 = FUN_180e326e0();
  lVar10 = 0;
  if ((int)param_1[2] != 0) {
    uVar8 = (ulonglong)(uVar2 & 0x3f);
    lVar5 = (*param_1 - param_1[1]) / 2;
    uVar1 = *(undefined8 *)
             (*(longlong *)(((longlong)(int)uVar2 >> 6) * 8 + 0x1810d49f0) + 0x30 + uVar8 * 0x48);
    *(undefined8 *)((longlong)&uStack_40 + lVar4) = 0x180e32b44;
    lVar6 = func_0x000180e3ee08(uVar2,uVar1,0,param_3);
    lVar7 = *(longlong *)(((longlong)(int)uVar2 >> 6) * 8 + 0x1810d49f0);
    if (lVar6 == *(longlong *)(lVar7 + 0x30 + uVar8 * 0x48)) {
      *(undefined4 *)(&stack0xfffffffffffffff8 + lVar4) = 0;
      uVar1 = *(undefined8 *)(lVar7 + 0x28 + uVar8 * 0x48);
      *(undefined8 *)(&stack0xffffffffffffffe8 + lVar4) = 0;
      *(undefined8 *)((longlong)&uStack_40 + lVar4) = 0x180e32b85;
      iVar3 = ReadFile(uVar1,&stack0x00000008 + lVar4,0x1000,&stack0xfffffffffffffff8 + lVar4);
      if (iVar3 != 0) {
        *(undefined8 *)((longlong)&uStack_40 + lVar4) = 0x180e32b9a;
        lVar7 = func_0x000180e3ee08(uVar2,param_2,0,param_3);
        if ((-1 < lVar7) &&
           (lVar5 <= (longlong)(ulonglong)*(uint *)(&stack0xfffffffffffffff8 + lVar4))) {
          pbVar9 = &stack0x00000008 + lVar4;
          if (lVar5 != 0) {
            do {
              if (&stack0x00000008 + (ulonglong)*(uint *)(&stack0xfffffffffffffff8 + lVar4) + lVar4
                  <= pbVar9) break;
              if (*pbVar9 == 0xd) {
                if ((pbVar9 < &stack0x00000008 +
                              (ulonglong)*(uint *)(&stack0xfffffffffffffff8 + lVar4) + lVar4 + -1)
                   && (pbVar9[1] == 10)) {
                  pbVar9 = pbVar9 + 1;
                }
              }
              else {
                pbVar9 = pbVar9 + *(char *)((ulonglong)*pbVar9 + 0x1810c1ce0);
              }
              lVar10 = lVar10 + 1;
              pbVar9 = pbVar9 + 1;
            } while (lVar10 != lVar5);
          }
        }
      }
    }
  }
  *(undefined8 *)((longlong)&uStack_40 + lVar4) = 0x180e32c1b;
  FUN_180e155e0(*(ulonglong *)(&stack0x00001008 + lVar4) ^
                (ulonglong)(&stack0xffffffffffffffc8 + lVar4));
  return;
}


