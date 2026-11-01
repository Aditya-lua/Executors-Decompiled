
void FUN_0062721c(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  *param_2 = param_1 + 0x3f0;
  param_2[1] = param_1 + 0x448;
  uVar2 = param_2[0x5c];
  if ((ulong)param_2[0x5d] <= (ulong)param_2[0x5c]) {
    uVar2 = param_2[0x5d];
  }
  if (((long *)param_2[0x5e] == param_2 + 0x4b) &&
     (*(undefined1 *)(unaff_x19 + 0x2d9) = 0, uVar2 != 0)) {
    do {
      *(undefined8 *)(unaff_x19 + 0x250 + uVar2 * 8) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *(undefined **)(unaff_x19 + 0x1a0) = &UNK_009b2d90;
  uVar2 = *(ulong *)(unaff_x19 + 0x240);
  if (*(ulong *)(unaff_x19 + 0x248) <= *(ulong *)(unaff_x19 + 0x240)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x248);
  }
  *(undefined1 *)(unaff_x19 + 0x239) = 0;
  if (*(long *)(unaff_x19 + 0x250) == unaff_x19 + 0x1b8 && uVar2 != 0) {
    do {
      *(undefined8 *)(unaff_x19 + 0x1b0 + uVar2 * 8) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *(undefined **)(unaff_x19 + 0x168) = &UNK_00a12330;
  *(undefined **)(unaff_x19 + 0x170) = &UNK_00a123f0;
  lVar1 = *(long *)(unaff_x19 + 400);
  uVar2 = *(ulong *)(unaff_x19 + 0x180);
  if (*(ulong *)(unaff_x19 + 0x188) <= *(ulong *)(unaff_x19 + 0x180)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x188);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uVar2 = *(ulong *)(unaff_x19 + 0x150);
  if (*(ulong *)(unaff_x19 + 0x158) <= *(ulong *)(unaff_x19 + 0x150)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x158);
  }
  if ((*(long *)(unaff_x19 + 0x160) == unaff_x19 + 200) &&
     (*(undefined1 *)(unaff_x19 + 0x149) = 0, uVar2 != 0)) {
    do {
      *(undefined8 *)(unaff_x19 + 0xc0 + uVar2 * 8) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *(undefined **)(unaff_x19 + 0x10) = &UNK_009b2d90;
  uVar2 = *(ulong *)(unaff_x19 + 0xb0);
  if (*(ulong *)(unaff_x19 + 0xb8) <= *(ulong *)(unaff_x19 + 0xb0)) {
    uVar2 = *(ulong *)(unaff_x19 + 0xb8);
  }
  *(undefined1 *)(unaff_x19 + 0xa9) = 0;
  if (*(long *)(unaff_x19 + 0xc0) == unaff_x19 + 0x28 && uVar2 != 0) {
    do {
      *(undefined8 *)(unaff_x19 + 0x20 + uVar2 * 8) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  return;
}

