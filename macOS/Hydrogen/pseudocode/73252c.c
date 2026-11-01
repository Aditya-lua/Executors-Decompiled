
void thunk_FUN_00732570(long param_1,uint param_2,undefined8 param_3,int param_4,byte *param_5,
                       byte *param_6)

{
  uint uVar1;
  long extraout_x1;
  uint uVar2;
  int in_w9;
  int in_w10;
  undefined1 in_w11;
  undefined1 in_w12;
  int in_w13;
  ulong in_x14;
  ulong uVar3;
  ulong in_x15;
  long unaff_x19;
  long unaff_x20;
  long in_stack_00000018;
  
FUN_00732570:
  *(int *)(unaff_x19 + in_x15 * 4) = in_w13;
  *(undefined1 *)(unaff_x19 + in_x15 + 0x18) = in_w11;
LAB_00732488:
  do {
    *(int *)(unaff_x19 + 0x14) = (int)in_x14 + 1;
code_r0x00732490:
    param_1 = param_1 + 1;
    if (((param_1 == 5) ||
        (uVar2 = (uint)param_1, (param_2 >> (ulong)(uVar2 & 0x1f) & 0x10001) == 0)) ||
       (in_w13 = *(int *)(unaff_x20 + param_1 * 4), in_w13 < 0)) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
        return;
      }
      ___stack_chk_fail();
      if (*(uint *)(extraout_x1 + 0x14) != 0) {
        uVar3 = 0;
        do {
          if (*(int *)(extraout_x1 + uVar3 * 4) == param_4) {
            *param_5 = *(byte *)(extraout_x1 + uVar3 + 0x18) & 1;
            *param_6 = *(byte *)(extraout_x1 + uVar3 + 0x18) >> 1 & 1;
            return;
          }
          uVar3 = uVar3 + 1;
        } while (*(uint *)(extraout_x1 + 0x14) != uVar3);
      }
      *param_6 = 0;
      *param_5 = 0;
      return;
    }
    if ((in_w9 << (ulong)(uVar2 & 0x1f) & param_2) == 0) {
      uVar2 = *(uint *)(unaff_x19 + 0x14);
      in_x14 = (ulong)uVar2;
      if (uVar2 == 0) {
        in_x15 = 0;
        goto FUN_00732570;
      }
      uVar3 = 0;
      do {
        if (*(int *)(unaff_x19 + uVar3 * 4) == in_w13) {
          *(byte *)(unaff_x19 + uVar3 + 0x18) = *(byte *)(unaff_x19 + uVar3 + 0x18) | 2;
          goto code_r0x00732490;
        }
        uVar3 = uVar3 + 1;
      } while (in_x14 != uVar3);
      in_x15 = in_x14;
      if (uVar2 < 5) goto FUN_00732570;
      goto code_r0x00732490;
    }
    uVar1 = *(uint *)(unaff_x19 + 0x14);
    in_x14 = (ulong)uVar1;
    if ((in_w10 << (ulong)(uVar2 & 0x1f) & param_2) == 0) {
      uVar3 = 0;
      if (uVar1 != 0) {
        do {
          if (*(int *)(unaff_x19 + uVar3 * 4) == in_w13) {
            *(byte *)(unaff_x19 + uVar3 + 0x18) = *(byte *)(unaff_x19 + uVar3 + 0x18) | 1;
            goto code_r0x00732490;
          }
          uVar3 = uVar3 + 1;
        } while (in_x14 != uVar3);
        uVar3 = in_x14;
        if (4 < uVar1) goto code_r0x00732490;
      }
      *(int *)(unaff_x19 + uVar3 * 4) = in_w13;
      *(char *)(unaff_x19 + uVar3 + 0x18) = (char)in_w9;
      goto LAB_00732488;
    }
    uVar3 = 0;
    if (uVar1 == 0) goto code_r0x0073247c;
    do {
      if (*(int *)(unaff_x19 + uVar3 * 4) == in_w13) {
        *(byte *)(unaff_x19 + uVar3 + 0x18) = *(byte *)(unaff_x19 + uVar3 + 0x18) | 3;
        goto code_r0x00732490;
      }
      uVar3 = uVar3 + 1;
    } while (in_x14 != uVar3);
    uVar3 = in_x14;
    if (4 < uVar1) goto code_r0x00732490;
code_r0x0073247c:
    *(int *)(unaff_x19 + uVar3 * 4) = in_w13;
    *(undefined1 *)(unaff_x19 + uVar3 + 0x18) = in_w12;
  } while( true );
}

