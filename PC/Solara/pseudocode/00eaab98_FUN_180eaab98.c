undefined8 FUN_180eaab98(void)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  
  iVar1 = DeleteFileW();
  if (iVar1 == 0) {
    uVar2 = GetLastError();
    FUN_180e1dab0(uVar2);
    uVar3 = 0xffffffff;
  }
  else {
    uVar3 = 0;
  }
  return uVar3;
}


