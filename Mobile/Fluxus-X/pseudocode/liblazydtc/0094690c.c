/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094690c
 */

undefined8 FUN_0094690c(long param_1)

{
  ulong *puVar1;
  int iVar2;
  
  puVar1 = (ulong *)(param_1 + 0xa82);
  *(code **)(param_1 + 0x228) = fwrite;
  *(code **)(param_1 + 0x240) = fread;
  *(code **)(param_1 + 0x1b8) = sched_yield;
  *(undefined **)(param_1 + 0x1d8) = &__sF;
  *(code **)(param_1 + 0x1d0) = mprotect;
  *(undefined8 *)(param_1 + 0x310) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0x218) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0x1f8) = 1;
  *(undefined8 *)(param_1 + 0x200) = 0x1e;
  *(undefined4 *)(param_1 + 0x6e0) = 0x3c;
  *(undefined4 *)(param_1 + 0x9e0) = 1;
  *(undefined1 *)(param_1 + 0x710) = 1;
  *(undefined8 *)(param_1 + 0x1f0) = 1;
  *(undefined4 *)(param_1 + 0x6d8) = 0x15180;
  *(undefined8 *)(param_1 + 0x2a8) = 0;
  *(undefined1 *)(param_1 + 0x529) = 0;
  *(undefined8 *)(param_1 + 0x6d0) = 5;
  *(undefined2 *)(param_1 + 0x6c8) = 0;
  *(undefined1 *)(param_1 + 0x6ca) = 0;
  *(undefined1 *)(param_1 + 0x6cb) = 5;
  *puVar1 = *puVar1 & 0xfffffffffffa1ffd | 0x56000;
  FUN_00925f84(param_1 + 0x350);
  FUN_009679d4(param_1);
  *puVar1 = *puVar1 | 0x6000000000000;
  *(undefined4 *)(param_1 + 0x734) = 0x1a4;
  *(undefined8 *)(param_1 + 0x9cc) = 0xfffffffff;
  iVar2 = FUN_009682bc();
  if (iVar2 != 8) {
    FUN_009682bc();
  }
  *(undefined8 *)(param_1 + 0x9f0) = 0;
  *(undefined8 *)(param_1 + 0x9e8) = 0;
  *(undefined8 *)(param_1 + 0x9f8) = 0;
  *(undefined8 *)(param_1 + 0xa14) = 0x3c0000003c;
  *(undefined4 *)(param_1 + 0xa1c) = 9;
  *(undefined8 *)(param_1 + 0xa20) = 1000;
  *(undefined8 *)(param_1 + 0x6e4) = 0x1000000004000;
  *(undefined4 *)(param_1 + 0x2e8) = 200;
  *(undefined8 *)(param_1 + 0xa38) = 60000;
  *(undefined4 *)(param_1 + 0xa7c) = 5;
  *(undefined8 *)(param_1 + 0x300) = 0;
  *(undefined8 *)(param_1 + 0x2f8) = 0x76;
  *(undefined1 *)(param_1 + 0x52a) = 2;
  *puVar1 = *puVar1 & 0xffeffe3efffdffb7 | 0x10100000008;
  return 0;
}

