
void FUN_006eda18(long param_1)

{
  int iVar1;
  long in_x9;
  long *in_x10;
  ulong in_x11;
  ulong uVar2;
  uint in_w13;
  code *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  int unaff_w24;
  long lVar3;
  
  do {
    uVar2 = 0;
    if (*in_x10 - (long)in_x10 != 0) {
      uVar2 = (ulong)(*(int *)((*(ulong *)(unaff_x23 + 0x40) ^ in_x11) +
                              (ulong)((uint)param_1 >> (ulong)(*(uint *)(unaff_x23 + 0xa0) & 0x1f))
                              * 4) + (uint)*(byte *)((*in_x10 - (long)in_x10) + param_1));
    }
    uVar2 = -(uVar2 >> 0x1f) & 0xfffffffc00000000 | uVar2 << 2;
    iVar1 = *(int *)(unaff_x22 + uVar2);
    if (iVar1 <= (int)in_w13 >> 8) {
      iVar1 = (int)in_w13 >> 8;
    }
    *(int *)(unaff_x22 + uVar2) = iVar1;
    do {
      param_1 = param_1 + 1;
      if (*(int *)(unaff_x23 + 0x88) <= param_1) {
        (*unaff_x19)();
        if (0 < *(int *)(unaff_x23 + 0x8c)) {
          lVar3 = 0;
          do {
            func_0x006ed980(*(undefined8 *)(*(long *)(unaff_x23 + 0x18) + lVar3 * 8),unaff_w24 + 1);
            lVar3 = lVar3 + 1;
          } while (lVar3 < *(int *)(unaff_x23 + 0x8c));
        }
        return;
      }
      in_w13 = *(uint *)(in_x9 + param_1 * 4);
    } while ((in_w13 & 0xff) != 0x45);
  } while( true );
}

