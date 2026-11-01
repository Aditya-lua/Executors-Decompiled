
ulong FUN_0012a614(byte *param_1,byte *param_2,undefined8 param_3,undefined8 param_4,ulong param_5,
                  int param_6)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  char *pcVar5;
  ulong uVar6;
  ulong extraout_x1;
  ulong uVar7;
  byte *pbVar8;
  long in_x9;
  long in_x10;
  ulong in_x11;
  byte in_w12;
  ulong in_x13;
  long unaff_x29;
  float extraout_s0;
  double dVar9;
  double dVar10;
  float fVar11;
  float fVar12;
  double dVar13;
  double dVar14;
  undefined8 uStack0000000000000000;
  char cStack0000000000000007;
  undefined1 uStack0000000000000008;
  
  while( true ) {
    pbVar8 = param_1;
    if (0x3b < (uint)in_x13 || (in_x10 << (in_x13 & 0x3f) & in_x11) == 0) {
      pbVar8 = param_1 + 1;
      *param_1 = in_w12;
    }
    in_x9 = in_x9 + -1;
    if (in_x9 == 0) break;
    in_w12 = *param_2;
    in_x13 = (ulong)(in_w12 - 0x24);
    param_2 = param_2 + 1;
    param_1 = pbVar8;
  }
  *pbVar8 = 0;
  uStack0000000000000000 = param_4;
  func_0x000b875c(&uStack0000000000000008,0x40,unaff_x29 + -0x38);
  pcVar5 = &cStack0000000000000007;
  do {
    pcVar5 = pcVar5 + 1;
  } while (*pcVar5 == ' ');
  dVar9 = (double)_atof();
  uVar7 = (ulong)(uint)(int)dVar9;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return uVar7;
  }
  uVar6 = ___stack_chk_fail();
  if (param_5 != uVar7) {
    uVar1 = uVar7;
    if ((long)param_5 <= (long)uVar7) {
      uVar1 = param_5;
    }
    uVar2 = uVar7;
    if ((long)uVar7 <= (long)param_5) {
      uVar2 = param_5;
    }
    uVar3 = extraout_x1;
    if ((long)uVar2 <= (long)extraout_x1) {
      uVar3 = uVar2;
    }
    uVar4 = uVar1;
    if ((long)uVar1 <= (long)extraout_x1) {
      uVar4 = uVar3;
    }
    if (param_6 != 0) {
      dVar9 = (double)extraout_s0;
      fVar11 = -extraout_s0;
      fVar12 = fVar11;
      if (-1 < (long)uVar2) {
        fVar12 = extraout_s0;
      }
      dVar10 = (double)fVar12;
      if (dVar9 <= ABS((double)(long)uVar2)) {
        dVar10 = (double)(long)uVar2;
      }
      if ((uVar1 == 0) && ((long)uVar2 < 0)) {
        dVar14 = (double)fVar11;
        dVar13 = dVar10;
        if ((double)(long)uVar4 <= dVar14) {
          return uVar6;
        }
      }
      else {
        fVar12 = fVar11;
        if (-1 < (long)uVar1) {
          fVar12 = extraout_s0;
        }
        dVar13 = (double)fVar11;
        if (-1 < (long)uVar1 || uVar2 != 0) {
          dVar13 = dVar10;
        }
        dVar14 = (double)fVar12;
        if (dVar9 <= ABS((double)(long)uVar1)) {
          dVar14 = (double)(long)uVar1;
        }
        if ((double)(long)uVar4 <= dVar14) {
          return uVar6;
        }
      }
      dVar10 = (double)(long)uVar4;
      if (dVar10 < dVar13) {
        if ((long)(param_5 * uVar7) < 0) {
          if (extraout_x1 != 0) {
            if ((long)extraout_x1 < 0) {
              _log(-dVar10 / dVar9);
              uVar6 = _log(-dVar14 / dVar9);
            }
            else {
              _log(dVar10 / dVar9);
              uVar6 = _log(dVar13 / dVar9);
            }
          }
        }
        else if ((long)(uVar1 | uVar2) < 0) {
          _log(dVar10 / dVar13);
          uVar6 = _log(dVar14 / dVar13);
        }
        else {
          _log(dVar10 / dVar14);
          uVar6 = _log(dVar13 / dVar14);
        }
      }
    }
  }
  return uVar6;
}

