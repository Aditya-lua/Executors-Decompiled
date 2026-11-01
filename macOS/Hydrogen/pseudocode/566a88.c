
uint FUN_00566a88(long param_1)

{
  bool in_ZR;
  int iVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  long unaff_x19;
  long *plVar6;
  long unaff_x20;
  long *plVar7;
  long lVar8;
  
  if (in_ZR) {
    if (*(long *)(unaff_x20 + 0x18) == *(long *)(unaff_x19 + 0x18)) {
      lVar8 = *(long *)(unaff_x20 + 0x18) + 1;
      plVar6 = *(long **)(unaff_x19 + 0x10);
      plVar7 = *(long **)(unaff_x20 + 0x10);
      do {
        lVar8 = lVar8 + -1;
        uVar2 = (uint)(lVar8 == 0);
        if (lVar8 == 0) {
          return 1;
        }
        if (*plVar7 == 0xc) {
          if (*plVar6 != 0xc) {
            return uVar2;
          }
        }
        else {
          if (*plVar6 == 0xc) {
            return uVar2;
          }
          uVar4 = func_0x005774ac(plVar7,plVar6);
          if ((uVar4 & 1) == 0) {
            return uVar2;
          }
        }
        uVar4 = func_0x005774ac(plVar7 + 8,plVar6 + 8);
        plVar6 = plVar6 + 0x10;
        plVar7 = plVar7 + 0x10;
        if ((uVar4 & 1) == 0) {
          return uVar2;
        }
      } while( true );
    }
  }
  else {
    if (param_1 != 6) {
      uVar3 = func_0x00566a14(*(undefined8 *)(unaff_x20 + 8),*(undefined8 *)(unaff_x19 + 8));
      uVar2 = 0;
      if (*(char *)(unaff_x20 + 0x10) == *(char *)(unaff_x19 + 0x10)) {
        uVar2 = uVar3;
      }
      return uVar2;
    }
    uVar4 = *(ulong *)(unaff_x20 + 8) ^ 0x8000000000000000;
    if (4 < uVar4) {
      uVar4 = 3;
    }
    uVar5 = *(ulong *)(unaff_x19 + 8) ^ 0x8000000000000000;
    if (4 < uVar5) {
      uVar5 = 3;
    }
    if (uVar4 == uVar5) {
      if ((long)uVar4 < 2) {
        if (uVar4 == 0) {
          return 1;
        }
        return (uint)(*(char *)(unaff_x20 + 0x10) == *(char *)(unaff_x19 + 0x10));
      }
      if (uVar4 == 2) {
        return (uint)(*(double *)(unaff_x20 + 0x10) == *(double *)(unaff_x19 + 0x10));
      }
      if (uVar4 == 3) {
        if (*(long *)(unaff_x20 + 0x18) == *(long *)(unaff_x19 + 0x18)) {
          iVar1 = _memcmp(*(undefined8 *)(unaff_x20 + 0x10),*(undefined8 *)(unaff_x19 + 0x10));
          return (uint)(iVar1 == 0);
        }
      }
      else if ((*(float *)(unaff_x20 + 0x10) == *(float *)(unaff_x19 + 0x10)) &&
              (*(float *)(unaff_x20 + 0x14) == *(float *)(unaff_x19 + 0x14))) {
        return (uint)(*(float *)(unaff_x20 + 0x18) == *(float *)(unaff_x19 + 0x18));
      }
    }
  }
  return 0;
}

