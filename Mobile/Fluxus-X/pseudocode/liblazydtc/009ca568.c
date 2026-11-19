/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca568
 */

undefined8 dtls1_record_replay_check(long param_1,ulong *param_2)

{
  int iVar1;
  
  iVar1 = FUN_009ca5f0(param_1 + 0x1cf8,param_2 + 1);
  if (iVar1 < 1) {
    if (0x3f < (uint)-iVar1) {
      return 0;
    }
    if ((*param_2 & 1L << ((ulong)(uint)-iVar1 & 0x3f)) != 0) {
      return 0;
    }
  }
  SSL3_RECORD_set_seq_num(param_1 + 0x12a8,param_1 + 0x1cf8);
  return 1;
}

