/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891d80
 */

undefined8 FUN_00891d80(undefined8 *param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  undefined4 uVar2;
  
  if ((param_2 == 0) || (*(int *)(param_2 + 8) != DAT_00d1b040)) {
    if ((param_2 == 0) || (*(int *)(param_2 + 8) != DAT_00d1b030)) {
LAB_00891e5c:
      FUN_0088d1d0(param_1,param_2,param_3,1);
      return 0;
    }
    uVar2 = *(undefined4 *)((long)param_1 + 0x64c);
    *(uint *)((long)param_1 + 0x64c) = (uint)param_3 & 0xff;
    if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00891e2c to 00891e4f has its CatchHandler @ 00891e84 */
      param_3 = param_3 & 0xffffffff;
      FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
    }
    FUN_00875b54(*param_1,0x3f,param_3,0,0);
  }
  else {
    if (1 < *(int *)(param_1 + 1)) {
      param_3 = param_3 & 0xffffffff;
      uVar1 = FUN_00892bc4(param_1);
      if ((uVar1 & 1) == 0) goto LAB_00891e5c;
    }
    uVar2 = *(undefined4 *)((long)param_1 + 0x64c);
    *(uint *)((long)param_1 + 0x64c) = (uint)param_3 & 0xff;
                    /* try { // try from 00891de0 to 00891df3 has its CatchHandler @ 00891e7c */
    FUN_0088888c(param_1,param_2,param_3,0,1,1);
  }
  *(undefined4 *)((long)param_1 + 0x64c) = uVar2;
  return 1;
}

