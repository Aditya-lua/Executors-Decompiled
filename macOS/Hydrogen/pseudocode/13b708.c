
void FUN_0013b708(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  int iVar4;
  long in_x9;
  long *plVar5;
  int iVar6;
  ulong in_x10;
  int iVar7;
  int iVar8;
  byte bVar9;
  ulong uVar10;
  long unaff_x21;
  uint uVar11;
  
  if ((ulong)(long)(int)param_1 < in_x10) {
    plVar5 = (long *)(in_x9 + (long)(int)param_1 * 0x18);
    lVar1 = *plVar5;
    lVar3 = plVar5[1] - lVar1;
    iVar6 = (int)((ulong)param_1 >> 0x20);
    if (lVar3 == 0 || iVar6 < 1) {
      uVar11 = 0;
    }
    else {
      uVar10 = 0;
      iVar7 = 0;
      do {
        bVar9 = *(byte *)(lVar1 + uVar10 * 0xc);
        iVar4 = (int)uVar10;
        if (bVar9 == 9) {
          iVar8 = *(int *)(unaff_x21 + 0x54);
          iVar2 = 0;
          if (iVar8 != 0) {
            iVar2 = iVar7 / iVar8;
          }
          iVar7 = iVar8 + iVar2 * iVar8;
          bVar9 = 0;
code_r0x0013b8ec:
          iVar8 = 1;
          if ((bVar9 & 0xe0) == 0xc0) {
            iVar8 = 2;
          }
          uVar11 = iVar8 + iVar4;
        }
        else {
          iVar7 = iVar7 + 1;
          if ((bVar9 & 0xfe) == 0xfc) {
            uVar11 = iVar4 + 6;
          }
          else if ((bVar9 & 0xfc) == 0xf8) {
            uVar11 = iVar4 + 5;
          }
          else if ((bVar9 & 0xf8) == 0xf0) {
            uVar11 = iVar4 + 4;
          }
          else {
            if ((bVar9 & 0xf0) != 0xe0) goto code_r0x0013b8ec;
            uVar11 = iVar4 + 3;
          }
        }
        uVar10 = (ulong)uVar11;
      } while ((uVar10 < (ulong)((lVar3 >> 2) * -0x5555555555555555)) && (iVar7 < iVar6));
    }
  }
  else {
    uVar11 = 0xffffffff;
  }
  if (0 < (int)uVar11) {
    do {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
      uVar11 = uVar11 - 1;
    } while (uVar11 != 0);
  }
  return;
}

