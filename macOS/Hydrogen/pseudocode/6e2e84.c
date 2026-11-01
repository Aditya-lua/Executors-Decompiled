
long FUN_006e2e84(long *param_1)

{
  int iVar1;
  short sVar2;
  long lVar3;
  code *pcVar4;
  long *in_x10;
  int *unaff_x19;
  long unaff_x20;
  
  if (param_1 < in_x10) {
    iVar1 = *(int *)((long)param_1 + 0xc);
  }
  else {
    lVar3 = __dyld_get_image_header(0);
    param_1 = (long *)(lVar3 + 0x4e8dd08);
    iVar1 = *(int *)(lVar3 + 0x4e8dd14);
  }
  if (iVar1 != 5) {
    return 0;
  }
  lVar3 = *param_1;
  if (unaff_x19 != (int *)0x0) {
    sVar2 = *(short *)(lVar3 + 4);
    if (sVar2 == -0x8000) {
      pcVar4 = *(code **)(*(long *)(unaff_x20 + 0x18) + 0x4f8);
      if (pcVar4 != (code *)0x0) {
        (*pcVar4)(lVar3 + 0x18,*(undefined4 *)(lVar3 + 0x14));
      }
      *(undefined4 *)(lVar3 + 4) = 0xffff8000;
    }
    *unaff_x19 = (int)sVar2;
  }
  return lVar3 + 0x18;
}

