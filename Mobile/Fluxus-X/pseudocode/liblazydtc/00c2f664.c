/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2f664
 */

undefined8 FUN_00c2f664(undefined8 param_1,byte *param_2,byte *param_3,undefined8 *param_4)

{
  byte bVar1;
  byte bVar2;
  undefined8 uVar3;
  byte *local_28;
  
  if ((ulong)((long)param_3 - (long)param_2) < 4) {
    if (param_3 == param_2) {
      return 0;
    }
    fprintf((FILE *)sched_yield,
            "libunwind: unsupported .eh_frame_hdr at %lx: need at least 4 bytes of data but only got %zd\n"
            ,(ulong)param_2,(long)param_3 - (long)param_2);
  }
  else {
    if (*param_2 == 1) {
      local_28 = param_2 + 4;
      bVar1 = param_2[2];
      bVar2 = param_2[1];
      *(byte *)(param_4 + 3) = param_2[3];
      uVar3 = FUN_00c2e33c(param_1,&local_28,param_3,bVar2,param_2);
      *param_4 = uVar3;
      if (bVar1 == 0xff) {
        uVar3 = 0;
      }
      else {
        uVar3 = FUN_00c2e33c(param_1,&local_28,param_3,bVar1,param_2);
      }
      param_4[1] = uVar3;
      param_4[2] = local_28;
      return 1;
    }
    fprintf((FILE *)sched_yield,"libunwind: unsupported .eh_frame_hdr version: %u at %lx\n",
            (uint)*param_2,(ulong)param_2);
  }
  fflush((FILE *)sched_yield);
  return 0;
}

