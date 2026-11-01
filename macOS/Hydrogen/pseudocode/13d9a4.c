
void FUN_0013d9a4(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  byte bVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w21;
  long *unaff_x22;
  long unaff_x23;
  long lVar5;
  long lVar6;
  long unaff_x24;
  long unaff_x25;
  long *plVar7;
  int unaff_w26;
  int unaff_w27;
  undefined8 uVar8;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000098;
  
  func_0x001377f0(&uStack0000000000000008);
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(in_stack_00000048);
  }
  *(undefined8 *)(unaff_x23 + 0x30) = in_stack_00000010;
  *(undefined8 *)(unaff_x23 + 0x28) = uStack0000000000000008;
  *(undefined8 *)(unaff_x23 + 0x38) = in_stack_00000018;
  bVar4 = *(byte *)(*unaff_x22 + (long)unaff_w27 * 0xc);
  if ((bVar4 & 0xfe) == 0xfc) {
    bVar4 = 5;
  }
  else if ((bVar4 & 0xfc) == 0xf8) {
    bVar4 = 4;
  }
  else if ((bVar4 & 0xf8) == 0xf0) {
    bVar4 = 3;
  }
  else if ((bVar4 & 0xf0) == 0xe0) {
    bVar4 = 2;
  }
  else {
    bVar4 = (bVar4 & 0xe0) == 0xc0;
  }
  plVar7 = (long *)(unaff_x25 + (long)unaff_w26 * 0x18 + 8);
  if (unaff_w27 < (int)((ulong)(*plVar7 - *unaff_x22) >> 2) * -0x55555555) {
    lVar5 = *unaff_x22 + (long)unaff_w27 * 0xc;
    lVar6 = *plVar7 - (lVar5 + 0xc);
    if (lVar6 != 0) {
      _memmove(lVar5,lVar5 + 0xc,lVar6 + -3);
    }
    lVar5 = lVar5 + lVar6;
    *plVar7 = lVar5;
    if ((bVar4 != 0) && (unaff_w27 < (int)((ulong)(lVar5 - *unaff_x22) >> 2) * -0x55555555)) {
      lVar6 = *unaff_x22 + (long)unaff_w27 * 0xc;
      lVar5 = lVar5 - (lVar6 + 0xc);
      if (lVar5 != 0) {
        _memmove(lVar6,lVar6 + 0xc,lVar5 + -3);
      }
      lVar6 = lVar6 + lVar5;
      *plVar7 = lVar6;
      if ((1 < bVar4) && (unaff_w27 < (int)((ulong)(lVar6 - *unaff_x22) >> 2) * -0x55555555)) {
        lVar5 = *unaff_x22 + (long)unaff_w27 * 0xc;
        lVar6 = lVar6 - (lVar5 + 0xc);
        if (lVar6 != 0) {
          _memmove(lVar5,lVar5 + 0xc,lVar6 + -3);
        }
        lVar5 = lVar5 + lVar6;
        *plVar7 = lVar5;
        if ((2 < bVar4) && (unaff_w27 < (int)((ulong)(lVar5 - *unaff_x22) >> 2) * -0x55555555)) {
          lVar6 = *unaff_x22 + (long)unaff_w27 * 0xc;
          lVar5 = lVar5 - (lVar6 + 0xc);
          if (lVar5 != 0) {
            _memmove(lVar6,lVar6 + 0xc,lVar5 + -3);
          }
          lVar6 = lVar6 + lVar5;
          *plVar7 = lVar6;
          if ((3 < bVar4) && (unaff_w27 < (int)((ulong)(lVar6 - *unaff_x22) >> 2) * -0x55555555)) {
            lVar5 = *unaff_x22 + (long)unaff_w27 * 0xc;
            lVar6 = lVar6 - (lVar5 + 0xc);
            if (lVar6 != 0) {
              _memmove(lVar5,lVar5 + 0xc,lVar6 + -3);
            }
            lVar5 = lVar5 + lVar6;
            *plVar7 = lVar5;
            if ((4 < bVar4) && (unaff_w27 < (int)((ulong)(lVar5 - *unaff_x22) >> 2) * -0x55555555))
            {
              lVar6 = *unaff_x22 + (long)unaff_w27 * 0xc;
              lVar5 = lVar5 - (lVar6 + 0xc);
              if (lVar5 != 0) {
                _memmove(lVar6,lVar6 + 0xc,lVar5 + -3);
              }
              *plVar7 = lVar6 + lVar5;
            }
          }
        }
      }
    }
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar2 = unaff_w21 + 1;
  if ((int)uVar3 <= (int)(unaff_w21 + 1)) {
    uVar2 = uVar3;
  }
  uVar3 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)unaff_w21 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar3 = unaff_w21;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar2) {
    uVar1 = uVar2;
  }
  uVar3 = uVar3 & ((int)uVar3 >> 0x1f ^ 0xffffffffU);
  uVar2 = uVar3;
  if ((int)uVar3 <= (int)uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar3;
  *(uint *)(unaff_x19 + 0x70) = uVar2;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  uVar8 = *unaff_x20;
  *(undefined8 *)(unaff_x24 + 0x70) = unaff_x20[1];
  *(undefined8 *)(unaff_x24 + 0x68) = uVar8;
  in_stack_00000098 = unaff_x20[2];
  func_0x00139988();
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  return;
}

