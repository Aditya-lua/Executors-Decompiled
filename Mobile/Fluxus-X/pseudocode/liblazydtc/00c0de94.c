/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0de94
 */

void FUN_00c0de94(char *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined1 auStack_f0 [8];
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined1 *local_b0;
  undefined1 **ppuStack_a8;
  undefined1 *puStack_a0;
  undefined8 uStack_98;
  undefined1 *local_90;
  undefined1 **ppuStack_88;
  undefined1 *puStack_80;
  undefined8 uStack_78;
  char *local_38;
  
  local_e8 = param_2;
  uStack_e0 = param_3;
  local_d8 = param_4;
  uStack_d0 = param_5;
  local_c8 = param_6;
  uStack_c0 = param_7;
  local_b8 = param_8;
  fwrite("libc++abi: ",0xb,1,(FILE *)sched_yield);
  uStack_78 = 0xffffff80ffffffc8;
  local_90 = (undefined1 *)register0x00000008;
  ppuStack_88 = &local_b0;
  puStack_80 = auStack_f0;
  vfprintf((FILE *)sched_yield,param_1,&local_90);
  fputc(10,(FILE *)sched_yield);
  uStack_98 = 0xffffff80ffffffc8;
  local_b0 = (undefined1 *)register0x00000008;
  ppuStack_a8 = &local_b0;
  puStack_a0 = auStack_f0;
  vasprintf(&local_38,param_1,&local_b0);
  android_set_abort_message(local_38);
  openlog("libc++abi",0,0);
  syslog(2,"%s",local_38);
  closelog();
                    /* WARNING: Subroutine does not return */
  abort();
}

