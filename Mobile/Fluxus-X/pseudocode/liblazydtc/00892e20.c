/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00892e20
 */

ulong FUN_00892e20(long param_1,ulong param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong *puVar5;
  
  do {
    while( true ) {
      while ((iVar1 = *(int *)(param_2 + 8), param_2 != 0 && (iVar1 == DAT_00d1b010))) {
        if (*(long *)(param_1 + 0x138) == 0) {
          return 0;
        }
        uVar2 = *(ulong *)(param_2 + 0x20);
        uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
        uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
        uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
        uVar4 = *(ulong *)(*(long *)(param_1 + 0x128) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f);
        while( true ) {
          if ((uVar4 & 1) == 0) {
            return 0;
          }
          puVar5 = (ulong *)(*(long *)(param_1 + 0x110) + uVar3 * 0x28);
          if (*puVar5 == uVar2) break;
          uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x130) - 1U;
          uVar4 = *(ulong *)(*(long *)(param_1 + 0x128) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f);
        }
        if ((puVar5[4] & 1) != 0) {
          return 0;
        }
        param_2 = puVar5[1];
        if (param_2 == 0) {
          return 0;
        }
      }
      if (((param_2 != 0) && (iVar1 == DAT_00d1b050)) &&
         (((DAT_00d1ec80 & 1) == 0 || ((*(byte *)(param_2 + 0x49) & 1) == 0)))) break;
      if ((param_2 == 0) ||
         ((iVar1 != DAT_00d1afc0 && iVar1 != DAT_00d1b0b0) && iVar1 != DAT_00d1b0e0)) {
        if (iVar1 != DAT_00d1b070) {
          param_2 = 0;
        }
        return param_2;
      }
      param_2 = *(ulong *)(param_2 + 0x20);
    }
    param_2 = FUN_00892fbc();
    if (param_2 == 0) {
      return 0;
    }
  } while( true );
}

