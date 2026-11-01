/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e3d4b8(undefined8 *param_1,uint param_2,char *param_3,ulonglong param_4)

{
  char cVar1;
  uint uVar2;
  undefined8 uVar3;
  int iVar4;
  undefined4 uVar5;
  longlong lVar6;
  uint uVar7;
  char *pcVar8;
  char *pcVar9;
  undefined8 uStack_20;
  
  uStack_20 = 0x180e3d4d0;
  lVar6 = FUN_180e15b20();
  lVar6 = -lVar6;
  *(ulonglong *)(&stack0x00001428 + lVar6) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffe8 + lVar6);
  pcVar9 = param_3 + (param_4 & 0xffffffff);
  uVar3 = *(undefined8 *)
           (*(longlong *)(((longlong)(int)param_2 >> 6) * 8 + 0x1810d49f0) + 0x28 +
           (ulonglong)(param_2 & 0x3f) * 0x48);
  *param_1 = 0;
  *(undefined4 *)(param_1 + 1) = 0;
  do {
    if (pcVar9 <= param_3) break;
    pcVar8 = &stack0x00000028 + lVar6;
    do {
      if (pcVar9 <= param_3) break;
      cVar1 = *param_3;
      param_3 = param_3 + 1;
      if (cVar1 == '\n') {
        *(int *)(param_1 + 1) = *(int *)(param_1 + 1) + 1;
        *pcVar8 = '\r';
        pcVar8 = pcVar8 + 1;
      }
      *pcVar8 = cVar1;
      pcVar8 = pcVar8 + 1;
    } while (pcVar8 < &stack0x00001427 + lVar6);
    *(undefined4 *)(&stack0x00000018 + lVar6) = 0;
    *(undefined8 *)(&stack0x00000008 + lVar6) = 0;
    uVar7 = (int)pcVar8 - ((int)&stack0x00000028 + (int)lVar6);
    *(undefined8 *)((longlong)&uStack_20 + lVar6) = 0x180e3d576;
    iVar4 = WriteFile(uVar3,&stack0x00000028 + lVar6,uVar7,&stack0x00000018 + lVar6);
    if (iVar4 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar6) = 0x180e3d592;
      uVar5 = GetLastError();
      *(undefined4 *)param_1 = uVar5;
      break;
    }
    uVar2 = *(uint *)(&stack0x00000018 + lVar6);
    *(int *)((longlong)param_1 + 4) = *(int *)((longlong)param_1 + 4) + uVar2;
  } while (uVar7 <= uVar2);
  *(undefined8 *)((longlong)&uStack_20 + lVar6) = 0x180e3d5a7;
  FUN_180e155e0(*(ulonglong *)(&stack0x00001428 + lVar6) ^
                (ulonglong)(&stack0xffffffffffffffe8 + lVar6));
  return;
}


