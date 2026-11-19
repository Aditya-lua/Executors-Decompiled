/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9888
 */

/* WARNING: Removing unreachable block (ram,0x00ae9940) */
/* WARNING: Heritage AFTER dead removal. Example location: s0xfffffffffffffef0 : 0x00ae9944 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8 OSSL_STORE_ctrl(long *param_1,int param_2,undefined4 *param_3)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined1 local_c0 [44];
  undefined4 local_94;
  
  if (param_1[1] == 0) {
    if (*(code **)(*param_1 + 0x20) != (code *)0x0) {
      uVar1 = (**(code **)(*param_1 + 0x20))(param_1[2],param_2,local_c0 + 0x30);
      return uVar1;
    }
  }
  else {
    pcVar2 = *(code **)(param_1[1] + 0xa8);
    if (pcVar2 != (code *)0x0) {
      memset(local_c0 + 0x30,0,0x50);
      if (param_2 == 1) {
        local_94 = *param_3;
        OSSL_PARAM_construct_int(local_c0,"use_secmem",&local_94);
        pcVar2 = *(code **)(param_1[1] + 0xa8);
      }
      uVar1 = (*pcVar2)(param_1[2],local_c0 + 0x30);
      return uVar1;
    }
  }
  return 1;
}

