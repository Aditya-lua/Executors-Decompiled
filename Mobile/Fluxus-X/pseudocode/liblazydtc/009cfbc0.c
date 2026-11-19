/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cfbc0
 */

bool dtls_buffer_listen_record(long param_1,long param_2,undefined8 *param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  memset((void *)(param_1 + 0x12a8),0,0x50);
  *(long *)(param_1 + 0x12b0) = param_2;
  *(undefined4 *)(param_1 + 0x12ac) = 0x16;
  uVar2 = *param_3;
  *(long *)(param_1 + 0x1cb0) = param_2 + 0xd;
  *(undefined8 *)(param_1 + 0x12c0) = param_4;
  *(long *)(param_1 + 0x1ca8) = *(long *)(param_1 + 0xc78);
  *(long *)(param_1 + 0x12c8) = *(long *)(param_1 + 0xc78) + 0xd;
  *(undefined8 *)(param_1 + 0x12f0) = uVar2;
  iVar1 = dtls1_buffer_record(param_1,*(long *)(param_1 + 0x1d10) + 0x38,param_1 + 0x12f0);
  return 0 < iVar1;
}

