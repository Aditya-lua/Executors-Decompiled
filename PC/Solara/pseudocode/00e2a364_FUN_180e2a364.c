undefined8 FUN_180e2a364(longlong param_1,int *param_2)

{
  char cVar1;
  undefined2 uVar2;
  undefined4 *puVar3;
  longlong lVar4;
  undefined8 uVar5;
  int aiStackX_10 [2];
  undefined4 uVar6;
  
  if (param_2 != (int *)0x0) {
    param_2[0] = 0;
    param_2[1] = 0;
    param_2[2] = 0;
    param_2[3] = 0;
    param_2[4] = 0;
    param_2[5] = 0;
    param_2[6] = 0;
    param_2[7] = 0;
    param_2[8] = 0;
    param_2[9] = 0;
    param_2[10] = 0;
    param_2[0xb] = 0;
    if (param_1 != 0) {
      uVar6 = 0;
      lVar4 = CreateFileW(0,0x80,7,0,3,0x2000000,0);
      if (lVar4 == -1) {
        cVar1 = FUN_180e2aa58(param_1);
        if (cVar1 == '\0') {
          FUN_180e1dab0(2);
        }
        else {
          uVar2 = FUN_180e2a8bc(0x10,param_1);
          aiStackX_10[0] = 0;
          *(undefined2 *)((longlong)param_2 + 6) = uVar2;
          *(undefined2 *)(param_2 + 2) = 1;
          cVar1 = FUN_180e2a9f8(param_1,aiStackX_10);
          if (cVar1 != '\0') {
            param_2[4] = aiStackX_10[0] + -1;
            *param_2 = aiStackX_10[0] + -1;
            uVar5 = func_0x000180e42f18(0x7bc,1,1,0,0,0,CONCAT44(uVar6,0xffffffff));
            *(undefined8 *)(param_2 + 8) = uVar5;
            *(undefined8 *)(param_2 + 6) = uVar5;
            *(undefined8 *)(param_2 + 10) = uVar5;
            return 0;
          }
        }
        param_2[0] = 0;
        param_2[1] = 0;
        param_2[2] = 0;
        param_2[3] = 0;
        param_2[4] = 0;
        param_2[5] = 0;
        param_2[6] = 0;
        param_2[7] = 0;
        param_2[8] = 0;
        param_2[9] = 0;
        param_2[10] = 0;
        param_2[0xb] = 0;
        return 0xffffffff;
      }
      cVar1 = FUN_180e2a668(param_1,0xffffffff,lVar4,param_2);
      if (cVar1 == '\0') {
        param_2[0] = 0;
        param_2[1] = 0;
        param_2[2] = 0;
        param_2[3] = 0;
        param_2[4] = 0;
        param_2[5] = 0;
        param_2[6] = 0;
        param_2[7] = 0;
        param_2[8] = 0;
        param_2[9] = 0;
        param_2[10] = 0;
        param_2[0xb] = 0;
        CloseHandle();
        return 0xffffffff;
      }
      CloseHandle(lVar4);
      return 0;
    }
  }
  puVar3 = (undefined4 *)FUN_180e1dafc();
  *puVar3 = 0;
  puVar3 = (undefined4 *)FUN_180e1db20();
  *puVar3 = 0x16;
  FUN_180e2c4e4();
  return 0xffffffff;
}


