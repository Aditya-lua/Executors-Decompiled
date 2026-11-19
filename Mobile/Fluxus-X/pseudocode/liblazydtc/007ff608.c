/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff608
 */

void Java_com_lazyexec_exe_MainActivity_nativeInit
               (long *param_1,undefined8 param_2,undefined8 param_3)

{
  (**(code **)(*param_1 + 0x6d8))(param_1,&DAT_00ccabb8);
  DAT_00ccabc0 = (**(code **)(*param_1 + 0xa8))(param_1,param_3);
  return;
}

