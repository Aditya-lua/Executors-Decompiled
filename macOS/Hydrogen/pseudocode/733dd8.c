
/* WARNING: Removing unreachable block (ram,0x00733da0) */

void FUN_00733dd8(int param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  uint unaff_w24;
  long unaff_x25;
  int unaff_w26;
  ulong unaff_x27;
  long unaff_x28;
  ulong in_stack_00000010;
  
  do {
    if (param_1 != 0) {
      uVar4 = (ulong)(long)(int)unaff_w24 >> 3 & 0x1ffffffffffffffc;
      *(uint *)(unaff_x22 + uVar4) =
           *(uint *)(unaff_x22 + uVar4) | unaff_w26 << (ulong)(unaff_w24 & 0x1f);
    }
    do {
      if ((*(byte *)(unaff_x28 + 0x18) >> 1 & 1) != 0) {
        uVar1 = *(uint *)(unaff_x25 + unaff_x27 * 4);
        iVar2 = ___darwin_check_fd_set_overflow(uVar1);
        if (iVar2 != 0) {
          uVar4 = (ulong)(long)(int)uVar1 >> 3 & 0x1ffffffffffffffc;
          *(uint *)(unaff_x21 + uVar4) =
               *(uint *)(unaff_x21 + uVar4) | unaff_w26 << (ulong)(uVar1 & 0x1f);
        }
      }
      if (((*(byte *)(unaff_x28 + 0x18) & 3) != 0) &&
         (iVar2 = *(int *)(unaff_x25 + unaff_x27 * 4), *unaff_x20 < iVar2)) {
        *unaff_x20 = iVar2;
      }
      unaff_x27 = unaff_x27 + 1;
      if (in_stack_00000010 >> 0x20 <= unaff_x27) {
        while (unaff_x23 = func_0x006f4058(unaff_x23), unaff_x23 != 0) {
          uVar3 = func_0x00156654(unaff_x23);
          func_0x00768a04(*(undefined8 *)(unaff_x19 + 0x78),uVar3);
          func_0x007317f8(*(undefined8 *)(unaff_x19 + 0x78));
          func_0x0076891c(*(undefined8 *)(unaff_x19 + 0x78));
        }
        if (unaff_x19 != 0) {
          *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
          if ((*(long *)(unaff_x19 + 0x88) != 0) &&
             ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
            func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
          }
        }
        return;
      }
      unaff_x28 = unaff_x25 + unaff_x27;
    } while ((*(byte *)(unaff_x28 + 0x18) & 1) == 0);
    unaff_w24 = *(uint *)(unaff_x25 + unaff_x27 * 4);
    param_1 = ___darwin_check_fd_set_overflow(unaff_w24);
  } while( true );
}

