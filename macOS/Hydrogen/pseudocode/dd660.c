
int * FUN_000dd660(byte *param_1)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int iVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  byte *pbVar8;
  uint uVar9;
  uint uVar10;
  byte *unaff_x19;
  int *unaff_x21;
  int *piVar11;
  long unaff_x22;
  
  if (param_1 != (byte *)0x0) {
    unaff_x19 = param_1;
  }
  uVar5 = _strlen(unaff_x19);
  iVar1 = ((uint)uVar5 & 0xfffffffc) + 0x18;
  iVar4 = *unaff_x21;
  iVar2 = iVar1 + iVar4;
  if (unaff_x21[1] < iVar2) {
    func_0x000ba578();
  }
  *unaff_x21 = iVar2;
  piVar3 = (int *)(*(long *)(&UNK_00005f88 + unaff_x22) + (long)iVar4);
  *piVar3 = iVar1;
  piVar11 = piVar3 + 1;
  piVar11[0] = 0;
  piVar11[1] = 0;
  piVar3[3] = 0;
  piVar3[4] = 0;
  if (uVar5 == 0) {
    if (*unaff_x19 == 0) {
      uVar6 = 0xffffffff;
    }
    else {
      pbVar8 = unaff_x19 + 2;
      uVar6 = 0xffffffff;
      uVar9 = (uint)*unaff_x19;
      do {
        uVar10 = (uint)pbVar8[-1];
        if (((uVar9 == 0x23) && (uVar10 == 0x23)) && (*pbVar8 == 0x23)) {
          uVar6 = 0xffffffff;
        }
        uVar6 = *(uint *)(&UNK_0080c404 + (ulong)(uVar6 & 0xff ^ uVar9) * 4) ^ uVar6 >> 8;
        pbVar8 = pbVar8 + 1;
        uVar9 = uVar10;
      } while (uVar10 != 0);
    }
  }
  else {
    pbVar8 = unaff_x19 + 2;
    uVar6 = 0xffffffff;
    uVar7 = uVar5;
    do {
      uVar7 = uVar7 - 1;
      if (((1 < uVar7) && (pbVar8[-2] == 0x23)) && ((pbVar8[-1] == 0x23 && (*pbVar8 == 0x23)))) {
        uVar6 = 0xffffffff;
      }
      uVar6 = *(uint *)(&UNK_0080c404 + (ulong)(uVar6 & 0xff ^ (uint)pbVar8[-2]) * 4) ^ uVar6 >> 8;
      pbVar8 = pbVar8 + 1;
    } while (uVar7 != 0);
  }
  piVar3[1] = ~uVar6;
  _memcpy(piVar3 + 5,unaff_x19,uVar5 + 1);
  return piVar11;
}

