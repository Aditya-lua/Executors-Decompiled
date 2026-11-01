
long FUN_006e3050(long param_1,int *param_2)

{
  short sVar1;
  code *pcVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x70);
  if (lVar3 == 0) {
    return 0;
  }
  if (param_2 != (int *)0x0) {
    sVar1 = *(short *)(lVar3 + 4);
    if (sVar1 == -0x8000) {
      pcVar2 = *(code **)(*(long *)(param_1 + 0x18) + 0x4f8);
      if (pcVar2 != (code *)0x0) {
        (*pcVar2)(lVar3 + 0x18,*(undefined4 *)(lVar3 + 0x14));
      }
      *(undefined4 *)(lVar3 + 4) = 0xffff8000;
    }
    *param_2 = (int)sVar1;
  }
  return lVar3 + 0x18;
}

