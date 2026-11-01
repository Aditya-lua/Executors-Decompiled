/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1802b8450(undefined8 param_1)

{
  undefined4 uVar1;
  int iVar2;
  longlong lVar3;
  undefined8 uVar4;
  undefined1 auStack_68 [32];
  undefined4 *puStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined4 uStack_28;
  undefined8 uStack_24;
  undefined4 uStack_1c;
  ulonglong uStack_18;
  
  uStack_18 = _DAT_1810c1700 ^ (ulonglong)auStack_68;
  SetUnhandledExceptionFilter(0);
  CreateDirectoryA(&UNK_180f475bc,0);
  uStack_38 = 0;
  uStack_40 = CONCAT44(uStack_40._4_4_,0x80);
  puStack_48 = (undefined4 *)CONCAT44(puStack_48._4_4_,2);
  lVar3 = CreateFileA(&UNK_180f4e3e0,0x40000000,0,0);
  if (lVar3 != -1) {
    uStack_28 = GetCurrentThreadId();
    uStack_1c = 0;
    uStack_24 = param_1;
    uVar1 = GetCurrentProcessId();
    uVar4 = GetCurrentProcess();
    uStack_38 = 0;
    uStack_40 = 0;
    puStack_48 = &uStack_28;
    iVar2 = func_0x000180e166a0(uVar4,uVar1,lVar3,0);
    CloseHandle(lVar3);
    if (iVar2 != 0) {
      MessageBoxA(0,&UNK_180f4e400,&UNK_180f4e3f0,0x10);
    }
  }
  FUN_180e155e0(uStack_18 ^ (ulonglong)auStack_68);
  return;
}


