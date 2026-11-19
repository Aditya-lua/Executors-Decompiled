/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bd16c
 */

ulong * FUN_008bd16c(long param_1,long param_2)

{
  uint uVar1;
  undefined1 uVar2;
  int iVar3;
  ulong *puVar4;
  void *pvVar5;
  void *__src;
  long lVar6;
  ulong __n;
  undefined1 uVar7;
  undefined1 uVar8;
  
  puVar4 = (ulong *)FUN_008b78d0(param_1,0x30,*(undefined1 *)(param_1 + 4),6,0);
  lVar6 = *(long *)(param_1 + 0x60);
  puVar4[4] = 0;
  *(undefined4 *)(puVar4 + 1) = 0;
  uVar2 = *(undefined1 *)(lVar6 + 2);
  uVar7 = *(undefined1 *)(param_1 + 4);
  uVar8 = *(undefined1 *)(param_2 + 6);
  puVar4[2] = *(ulong *)(param_2 + 0x10);
  *puVar4 = (ulong)CONCAT16(uVar8,(uint6)(CONCAT12(uVar2,CONCAT11(uVar7,6)) & 0x3ffff));
  if (((DAT_00d1fc90 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1fc90), iVar3 != 0)) {
                    /* try { // try from 008bd310 to 008bd313 has its CatchHandler @ 008bd368 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  lVar6 = DAT_00d1fc88;
  *(undefined4 *)((long)puVar4 + 0xc) = 0;
  uVar1 = *(uint *)(param_2 + 8);
  puVar4[5] = (long)&DWORD_007f3700 + lVar6;
  if (uVar1 != 0) {
    if ((int)uVar1 < 0) goto LAB_008bd2f0;
    pvVar5 = (void *)FUN_008b7610(param_1,(ulong)uVar1 << 4,*(undefined1 *)((long)puVar4 + 1));
    puVar4[4] = (ulong)pvVar5;
    if (*(int *)((long)puVar4 + 0xc) < 1) {
      if (*(int *)(param_2 + 0xc) < 0) {
        iVar3 = -*(int *)(param_2 + 0xc);
      }
      else {
        iVar3 = *(int *)(param_2 + 8);
      }
      *(int *)((long)puVar4 + 0xc) = -iVar3;
    }
    iVar3 = *(int *)(param_2 + 8);
    __src = *(void **)(param_2 + 0x20);
    *(int *)(puVar4 + 1) = iVar3;
    memcpy(pvVar5,__src,(long)iVar3 << 4);
  }
  lVar6 = *(long *)(param_2 + 0x28);
  if (((DAT_00d1fc90 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1fc90), iVar3 != 0)) {
                    /* try { // try from 008bd348 to 008bd34b has its CatchHandler @ 008bd364 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  if (lVar6 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
    if (*(byte *)(param_2 + 5) == 0x1f) {
LAB_008bd2f0:
                    /* WARNING: Subroutine does not return */
      FUN_008b75fc(param_1);
    }
    uVar1 = 1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f);
    __n = -(ulong)(uVar1 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar1 << 5;
    pvVar5 = (void *)FUN_008b7610(param_1,__n,*(undefined1 *)((long)puVar4 + 1));
    puVar4[5] = (ulong)pvVar5;
    *(undefined2 *)((long)puVar4 + 4) = *(undefined2 *)(param_2 + 4);
    memcpy(pvVar5,*(void **)(param_2 + 0x28),__n);
    *(undefined4 *)((long)puVar4 + 0xc) = *(undefined4 *)(param_2 + 0xc);
  }
  return puVar4;
}

