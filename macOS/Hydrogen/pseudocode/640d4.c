
undefined8
FUN_000640d4(long param_1,long param_2,long param_3,undefined8 param_4,long *param_5,long *param_6,
            long *param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10,ulong param_11,
            undefined8 param_12,undefined1 param_13)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  long lVar5;
  ulong uVar6;
  long lStack0000000000000028;
  
  lVar2 = *(long *)(param_1 + 0x110);
  lVar3 = *param_6;
  if (*(long *)(param_1 + 0x118) != lVar2) {
    lVar5 = 0;
    uVar6 = 0;
    do {
      *unaff_x19 = lVar3 + 2;
      uVar1 = *(ulong *)(param_2 + 8);
      if (-1 < (char)*(byte *)(param_2 + 0x17)) {
        uVar1 = (ulong)*(byte *)(param_2 + 0x17);
      }
      *param_5 = *param_5 + uVar1;
      lVar4 = *unaff_x19;
      lVar3 = lVar4 + 2;
      *unaff_x19 = lVar3;
      uVar1 = *(ulong *)(param_3 + 8);
      if (-1 < (char)*(byte *)(param_3 + 0x17)) {
        uVar1 = (ulong)*(byte *)(param_3 + 0x17);
      }
      if (uVar1 != 0) {
        *unaff_x19 = lVar4 + 0x10;
        uVar1 = *(ulong *)(param_3 + 8);
        if (-1 < (char)*(byte *)(param_3 + 0x17)) {
          uVar1 = (ulong)*(byte *)(param_3 + 0x17);
        }
        *param_5 = *param_5 + uVar1;
        lVar3 = *unaff_x19 + 2;
        *unaff_x19 = lVar3;
      }
      _param_13 = *(long *)(lVar2 + lVar5);
      lStack0000000000000028 = (((long *)(lVar2 + lVar5))[1] - _param_13) + 1;
      *unaff_x19 = lVar3 + 0xf;
      func_0x00063120(&param_10,&param_13,param_4);
      uVar1 = param_11;
      if (-1 < (char)param_12._7_1_) {
        uVar1 = (ulong)param_12._7_1_;
      }
      *param_5 = *param_5 + uVar1;
      if ((char)param_12._7_1_ < '\0') {
        __ZdlPv(param_10);
      }
      *unaff_x19 = *unaff_x19 + 4;
      *param_7 = *param_7 + lStack0000000000000028;
      lVar3 = *unaff_x19 + 2;
      *unaff_x19 = lVar3;
      uVar6 = uVar6 + 1;
      lVar2 = *(long *)(param_1 + 0x110);
      lVar5 = lVar5 + 0x10;
    } while (uVar6 < (ulong)(*(long *)(param_1 + 0x118) - lVar2 >> 4));
  }
  *unaff_x19 = lVar3 + 2;
  uVar6 = *(ulong *)(param_2 + 8);
  if (-1 < (char)*(byte *)(param_2 + 0x17)) {
    uVar6 = (ulong)*(byte *)(param_2 + 0x17);
  }
  *param_5 = *param_5 + uVar6;
  *unaff_x19 = *unaff_x19 + 2;
  return 1;
}

