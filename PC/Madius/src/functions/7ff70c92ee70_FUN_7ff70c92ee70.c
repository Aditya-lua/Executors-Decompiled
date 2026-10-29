/* 7ff70c92ee70 FUN_7ff70c92ee70 */

ulonglong FUN_7ff70c92ee70(undefined8 *param_1,int param_2,undefined4 param_3,uint param_4,
                          undefined4 param_5)

{
  byte *pbVar1;
  byte bVar2;
  code *pcVar3;
  byte *pbVar4;
  ulonglong uVar5;
  int iVar6;
  uint uVar7;
  
  *(undefined4 *)((longlong)param_1 + 0x6c) = param_3;
  do {
    if (param_4 == 0) {
      return 0;
    }
    bVar2 = *(byte *)((longlong)param_1 + 0x75);
    iVar6 = (int)(char)bVar2;
    if ((param_2 == 8 || 9 < (byte)(bVar2 - 0x30)) && ((param_2 != 8 || ((bVar2 & 0xf8) != 0x30))))
    {
      if (param_2 != 0x10) {
LAB_7ff70c92efa7:
        return (ulonglong)param_4;
      }
      if ((byte)(bVar2 + 0x9f) < 6) {
        uVar7 = iVar6 - 0x57;
      }
      else if (((byte)(bVar2 + 0xb9) < 0xfa) || (uVar7 = iVar6 - 0x37, uVar7 == 0xffffffff))
      goto LAB_7ff70c92efa7;
    }
    else {
      uVar7 = iVar6 - 0x30;
    }
    uVar5 = CONCAT44((int)(uVar7 ^ 0x7fffffff) >> 0x1f,uVar7) ^ 0x7fffffff;
    if ((int)((longlong)uVar5 / (longlong)param_2) < *(int *)((longlong)param_1 + 0x6c)) {
      FUN_7ff70cb12980(param_5,(longlong)uVar5 % (longlong)param_2 & 0xffffffff);
      pcVar3 = (code *)swi(3);
      uVar5 = (*pcVar3)();
      return uVar5;
    }
    *(uint *)((longlong)param_1 + 0x6c) = *(int *)((longlong)param_1 + 0x6c) * param_2 + uVar7;
    pbVar4 = (byte *)*param_1;
    if (pbVar4 != (byte *)param_1[1]) {
      if ((((*pbVar4 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar1 = pbVar4 + 1, pbVar1 != (byte *)param_1[1])) &&
         ((((param_1[0xc] & 8) == 0 && ((*pbVar1 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10) == 0 && ((*pbVar1 == 0x7d || (*pbVar1 == 0x7b)))))))) {
        pbVar4 = pbVar1;
      }
      *param_1 = pbVar4 + 1;
    }
    param_4 = param_4 - 1;
    FUN_7ff70c92d1b0(param_1);
  } while( true );
}


