
void FUN_0024404c(long *param_1,long param_2)

{
  ulong uVar1;
  byte *pbVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  ulong in_x9;
  ulong uVar6;
  ulong in_x11;
  ulong *unaff_x19;
  long unaff_x20;
  undefined1 unaff_w22;
  long unaff_x23;
  undefined8 unaff_x24;
  long lVar7;
  undefined7 uStack0000000000000001;
  undefined1 uStack0000000000000008;
  undefined7 uStack0000000000000009;
  undefined1 uStack0000000000000010;
  undefined7 uStack0000000000000011;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined4 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  
  uVar6 = (ulong)*(char *)((long)param_1 + in_x11);
  if (-1 < *(char *)((long)param_1 + in_x11)) {
    lVar7 = *param_1;
    uVar6 = CONCAT17(-(lVar7 < 0),
                     CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar7 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
    uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
    uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
    uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
    uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
    in_x11 = (ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3;
    uVar6 = (ulong)*(byte *)((long)param_1 + in_x11);
  }
  bVar5 = (byte)((ulong)unaff_x24 >> 0x38);
  *(byte *)((long)param_1 + in_x11) = bVar5 >> 1;
  *(byte *)((long)param_1 + (in_x11 - 8 & in_x9) + 8) = bVar5 >> 1;
  *(ulong *)(unaff_x23 + 0x10) = *(long *)(unaff_x23 + 0x10) - (uVar6 & 1);
  *(undefined1 *)(param_1 + in_x11 * -0x1b + -0x1b) = unaff_w22;
  *(undefined4 *)((long)param_1 + in_x11 * -0xd8 + -0xd7) = uStack0000000000000058;
  *(int *)((long)param_1 + in_x11 * -0xd8 + -0xd4) = (int)((ulong)_uStack0000000000000058 >> 0x18);
  param_1[in_x11 * -0x1b + -0x1a] = unaff_x20;
  param_1[in_x11 * -0x1b + -0x18] = in_stack_00000038;
  param_1[in_x11 * -0x1b + -0x19] = in_stack_00000030;
  param_1[in_x11 * -0x1b + -0x17] = 8;
  param_1[in_x11 * -0x1b + -0x16] = param_2;
  param_1[in_x11 * -0x1b + -0x15] = 0;
  param_1[in_x11 * -0x1b + -0x14] = 0;
  param_1[in_x11 * -0x1b + -0x13] = -0x8000000000000000;
  *(undefined2 *)(param_1 + in_x11 * -0x1b + -1) = 0x10;
  *(long *)(unaff_x23 + 0x18) = *(long *)(unaff_x23 + 0x18) + 1;
  func_0x00245520(&uStack0000000000000060,param_1 + in_x11 * -0x1b + -0x17);
  uVar6 = *unaff_x19;
  if ((uVar6 == unaff_x19[3]) && (uVar6 != 0)) {
    uVar4 = unaff_x19[2];
    uVar1 = uVar4 + 1;
    uVar3 = 0;
    if (uVar6 <= uVar1) {
      uVar3 = uVar6;
    }
    unaff_x19[2] = uVar1 - uVar3;
    unaff_x19[3] = uVar6 - 1;
    pbVar2 = (byte *)(unaff_x19[1] + uVar4 * 0x20);
    bVar5 = *pbVar2;
    if (bVar5 != 2) {
      uStack0000000000000011 = (undefined7)((ulong)*(undefined8 *)(pbVar2 + 0x10) >> 8);
      uStack0000000000000009 = (undefined7)*(undefined8 *)(pbVar2 + 9);
      uStack0000000000000010 = (undefined1)((ulong)*(undefined8 *)(pbVar2 + 9) >> 0x38);
      uStack0000000000000001 = (undefined7)*(undefined8 *)(pbVar2 + 1);
      uStack0000000000000008 = (undefined1)((ulong)*(undefined8 *)(pbVar2 + 1) >> 0x38);
      func_0x00203974(&uStack0000000000000060,unaff_x19 + 4);
      func_0x00241ae4(&uStack0000000000000060);
      if ((((bVar5 & 1) == 0) &&
          (lVar7 = CONCAT71(uStack0000000000000009,uStack0000000000000008),
          lVar7 != -0x8000000000000000)) && (lVar7 != 0)) {
        func_0x00187bd4(CONCAT71(uStack0000000000000011,uStack0000000000000010),lVar7,1);
      }
    }
  }
  return;
}

