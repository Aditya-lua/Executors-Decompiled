/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cd618
 */

void FUN_008cd618(long param_1,double *param_2,long *param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 extraout_x1;
  long lVar4;
  double dVar5;
  
  if (*(int *)((long)param_3 + 0xc) == 5) {
    dVar5 = (double)NEON_ucvtf((ulong)*(uint *)(*param_3 + 0x14));
    goto LAB_008cd6a4;
  }
  if (*(int *)((long)param_3 + 0xc) == 6) {
    lVar2 = *param_3;
    lVar4 = *(long *)(lVar2 + 0x10);
    if ((lVar4 != 0) && ((*(byte *)(lVar4 + 6) >> 6 & 1) == 0)) {
      if ((*(byte *)(lVar4 + 7) >> 1 & 1) != 0) {
        lVar3 = *(long *)(lVar4 + 0x20) + -0x70;
        iVar1 = *(int *)(*(long *)(lVar4 + 0x20) + -100);
        goto joined_r0x008cd72c;
      }
      lVar3 = FUN_008bdfe0(lVar4,6,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x368));
      if (lVar3 != 0) goto LAB_008cd6c8;
    }
    iVar1 = FUN_008bcf64(lVar2);
    dVar5 = (double)iVar1;
LAB_008cd6a4:
    *param_2 = dVar5;
    *(undefined4 *)((long)param_2 + 0xc) = 3;
    return;
  }
  lVar3 = FUN_008be028(param_1,param_3,6);
LAB_008cd6c8:
  iVar1 = *(int *)(lVar3 + 0xc);
joined_r0x008cd72c:
  if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b399c(param_1,param_3,"get length of");
  }
  if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008cd768 to 008cd76b has its CatchHandler @ 008cd79c */
    DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8,extraout_x1,lVar3);
    __cxa_guard_release(&DAT_00d1f1e0);
  }
  lVar3 = FUN_008cb070(param_1,param_2,lVar3,param_3,(long)&DWORD_007f2ef0 + DAT_00d1f1d8);
  if (*(int *)(lVar3 + 0xc) != 3) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"\'__len\' must return a number");
  }
  return;
}

