/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3888
 */

void ZSTD_decompressStream_simpleArgs
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
               undefined8 param_5,undefined8 param_6,undefined8 *param_7)

{
  long lVar1;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = *param_4;
  local_58 = *param_7;
  local_68 = param_5;
  uStack_60 = param_6;
  local_50 = param_2;
  uStack_48 = param_3;
  ZSTD_decompressStream(param_1,&local_50,&local_68);
  *param_4 = local_40;
  *param_7 = local_58;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

