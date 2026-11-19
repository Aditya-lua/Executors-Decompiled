/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e0efc
 */

void blake3_hasher_init_derive_key(undefined8 *param_1,char *param_2)

{
  long lVar1;
  size_t sVar2;
  undefined8 local_7d0;
  undefined8 uStack_7c8;
  undefined8 uStack_7c0;
  undefined8 uStack_7b8;
  undefined8 local_7b0;
  undefined8 uStack_7a8;
  undefined8 uStack_7a0;
  undefined8 uStack_798;
  undefined8 local_790;
  undefined8 uStack_788;
  undefined8 uStack_780;
  undefined8 uStack_778;
  undefined8 local_770;
  undefined8 uStack_768;
  undefined8 uStack_760;
  undefined8 uStack_758;
  undefined8 local_750;
  undefined8 uStack_748;
  undefined8 uStack_740;
  undefined2 uStack_738;
  undefined6 local_736;
  undefined2 uStack_730;
  undefined8 uStack_72e;
  undefined1 local_726;
  undefined1 local_720;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  sVar2 = strlen(param_2);
  local_726 = 0x20;
  uStack_7a8 = 0xa54ff53a3c6ef372;
  local_7b0 = 0xbb67ae856a09e667;
  uStack_798 = 0x5be0cd191f83d9ab;
  uStack_7a0 = 0x9b05688c510e527f;
  uStack_788 = 0xa54ff53a3c6ef372;
  local_790 = 0xbb67ae856a09e667;
  uStack_778 = 0x5be0cd191f83d9ab;
  uStack_780 = 0x9b05688c510e527f;
  uStack_768 = 0;
  local_770 = 0;
  uStack_758 = 0;
  uStack_760 = 0;
  uStack_748 = 0;
  local_750 = 0;
  uStack_738 = 0;
  uStack_740 = 0;
  uStack_72e = 0;
  local_736 = 0;
  uStack_730 = 0;
  local_720 = 0;
  blake3_hasher_update(&local_7b0,param_2,sVar2);
  blake3_hasher_finalize_seek(&local_7b0,0,&local_7d0,0x20);
  param_1[8] = 0;
  *(undefined2 *)(param_1 + 0x11) = 0;
  param_1[1] = uStack_7c8;
  *param_1 = local_7d0;
  param_1[3] = uStack_7b8;
  param_1[2] = uStack_7c0;
  param_1[5] = uStack_7c8;
  param_1[4] = local_7d0;
  param_1[7] = uStack_7b8;
  param_1[6] = uStack_7c0;
  *(undefined1 *)((long)param_1 + 0x8a) = 0x40;
  *(undefined1 *)(param_1 + 0x12) = 0;
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

