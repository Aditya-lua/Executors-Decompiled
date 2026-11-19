/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bc2bc
 */

long FUN_008bc2bc(undefined8 param_1,undefined8 param_2,long param_3,undefined8 *param_4,int param_5
                 )

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  
  uVar5 = (uint)((ulong)param_1 >> 0x20) & 0x7fffffff;
  uVar1 = ((uint)param_1 ^ uVar5 >> 0x12) * 0x5bd1e995;
  uVar2 = (uVar5 ^ uVar1 >> 0x16) * 0x5bd1e995;
  uVar5 = *(uint *)(param_3 + 8);
  do {
    if (param_5 != uVar5 + 1) {
      lVar4 = *(long *)(param_3 + 0x28) +
              (ulong)((uVar2 ^ (uVar1 ^ uVar2 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                     (-1 << (ulong)(*(byte *)(param_3 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
      if (*(int *)(lVar4 + 0xc) == 0) {
        if (((DAT_00d1fc90 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1fc90), iVar3 != 0)) {
                    /* try { // try from 008bc3e8 to 008bc3eb has its CatchHandler @ 008bc45c */
          DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
          __cxa_guard_release(&DAT_00d1fc90);
        }
        if (lVar4 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
LAB_008bc40c:
          *(undefined8 *)(lVar4 + 0x10) = *param_4;
          *(undefined4 *)(lVar4 + 0x18) = *(undefined4 *)(param_4 + 1);
          *(uint *)(lVar4 + 0x1c) =
               *(uint *)(lVar4 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_4 + 0xc) & 0xf;
          return lVar4;
        }
      }
      uVar5 = *(uint *)(param_3 + 0xc);
      while (0 < (int)uVar5) {
        uVar5 = uVar5 - 1;
        *(uint *)(param_3 + 0xc) = uVar5;
        if ((*(byte *)(*(long *)(param_3 + 0x28) + (ulong)uVar5 * 0x20 + 0x1c) & 0xf) == 0) {
          lVar4 = FUN_008bda50(param_3);
          goto LAB_008bc40c;
        }
      }
    }
    FUN_008bdb7c(param_2,param_3,param_5);
    uVar5 = *(uint *)(param_3 + 8);
    if (param_5 - 1U < uVar5) {
      return *(long *)(param_3 + 0x20) + (long)(int)(param_5 - 1U) * 0x10;
    }
  } while( true );
}

