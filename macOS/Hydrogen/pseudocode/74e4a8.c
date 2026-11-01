
char * FUN_0074e4a8(long param_1,byte param_2,int param_3,long param_4)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  
  if (param_3 <= *(int *)(param_1 + 0xc60)) {
    iVar1 = *(int *)(param_1 + 0xc60);
    if (param_3 != -1) {
      iVar1 = param_3;
    }
    if (param_4 == 0) {
      lVar3 = func_0x00740a58((long)&dylib_command_00001200.cmd + param_1);
    }
    else {
      if (*(long *)(param_4 + 0x28) == 0) {
        return (char *)0x0;
      }
      lVar3 = func_0x006f4058();
    }
    if (lVar3 != 0) {
      while ((lVar4 = func_0x00156654(lVar3), (*(byte *)(lVar4 + 0x34) & param_2) == 0 ||
             (*(int *)(lVar4 + 0x30) != iVar1))) {
        lVar3 = func_0x006f4058(lVar3);
        if (lVar3 == 0) {
          return (char *)0x0;
        }
      }
      lVar4 = func_0x00156654(lVar3);
      lVar5 = func_0x00740a58((long)&dylib_command_00001200.cmd + param_1);
      if (lVar5 == 0) {
        lVar8 = 0;
        lVar6 = 0;
      }
      else {
        lVar8 = 0;
        lVar7 = 0;
        do {
          lVar6 = func_0x00156654(lVar5);
          iVar2 = func_0x0077e6f8(*(undefined8 *)(lVar4 + 0x20),*(undefined8 *)(lVar6 + 0x20));
          if (((iVar2 != 0) && (*(int *)(lVar6 + 0x30) == iVar1)) &&
             ((*(byte *)(lVar6 + 0x34) & param_2) != 0)) {
            lVar8 = lVar8 + 1;
          }
          lVar6 = lVar8 + -1;
          if (lVar5 != lVar3) {
            lVar6 = lVar7;
          }
          lVar5 = func_0x006f4058(lVar5);
          lVar7 = lVar6;
        } while (lVar5 != 0);
      }
      uVar9 = *(undefined8 *)(lVar4 + 0x20);
      *(undefined8 *)("/usr/lib/libSystem.B.dylib" + param_1 + 0x10) = *(undefined8 *)(lVar4 + 0x28)
      ;
      *(undefined8 *)("/usr/lib/libSystem.B.dylib" + param_1 + 8) = uVar9;
      *(long *)("/usr/lib/libSystem.B.dylib" + param_1 + 0x18) = lVar8;
      *(long *)((long)&dylib_command_00001268.cmd + param_1) = lVar6;
      *(uint *)((long)&dylib_command_00001268.dylib.name.offset + param_1) =
           *(byte *)(lVar4 + 0x34) | 0x8000000;
      *(long *)((long)&dylib_command_00001268.dylib.current_version + param_1) = lVar3;
      return "/usr/lib/libSystem.B.dylib" + param_1 + 8;
    }
  }
  return (char *)0x0;
}

