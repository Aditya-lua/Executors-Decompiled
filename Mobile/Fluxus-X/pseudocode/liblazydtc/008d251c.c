/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d251c
 */

void LZ4_resetStream_fast(void *param_1)

{
  uint uVar1;
  
  if (*(int *)((long)param_1 + 0x4014) == 2) {
    uVar1 = *(uint *)((long)param_1 + 0x4010);
    if (0x40000000 < uVar1) goto LAB_008d255c;
  }
  else {
    if (*(int *)((long)param_1 + 0x4014) != 0) {
LAB_008d255c:
      memset(param_1,0,0x4000);
      *(undefined8 *)((long)param_1 + 0x4010) = 0;
      goto LAB_008d2584;
    }
    uVar1 = *(uint *)((long)param_1 + 0x4010);
  }
  if (uVar1 != 0) {
    *(uint *)((long)param_1 + 0x4010) = uVar1 + 0x10000;
  }
LAB_008d2584:
  *(undefined4 *)((long)param_1 + 0x4018) = 0;
  *(undefined8 *)((long)param_1 + 0x4008) = 0;
  *(undefined8 *)((long)param_1 + 0x4000) = 0;
  return;
}

