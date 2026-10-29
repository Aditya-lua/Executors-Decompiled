/* 7ff70c79f4f0 FUN_7ff70c79f4f0 */

void FUN_7ff70c79f4f0(longlong param_1,undefined4 *param_2)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  char cVar4;
  undefined4 uVar5;
  
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x34,*(undefined1 *)(param_2 + 1));
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x44,*param_2);
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x69,*(undefined1 *)((longlong)param_2 + 5));
  uVar5 = FUN_7ff70c8f5610(*(undefined1 *)((longlong)param_2 + 6),1);
  bVar3 = FUN_7ff70c8f5670(uVar5);
  uVar5 = FUN_7ff70c8f5610(*(undefined1 *)((longlong)param_2 + 6),2);
  cVar4 = FUN_7ff70c8f5670(uVar5);
  uVar1 = bVar3 + 2;
  if (cVar4 == '\0') {
    uVar1 = (uint)bVar3;
  }
  uVar5 = FUN_7ff70c8f5610(*(undefined1 *)((longlong)param_2 + 6),4);
  cVar4 = FUN_7ff70c8f5670(uVar5);
  uVar2 = uVar1 + 4;
  if (cVar4 == '\0') {
    uVar2 = uVar1;
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xa1,uVar2);
  return;
}


