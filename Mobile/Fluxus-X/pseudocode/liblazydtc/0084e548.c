/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e548
 */

undefined8 FUN_0084e548(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  byte bVar3;
  long local_48;
  __shared_weak_count *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  bVar3 = 1;
  FUN_008abd78(param_1,1);
  FUN_0084dce8(&local_48);
  if (local_48 != 0) {
    bVar3 = *(byte *)(local_48 + 0x590) & 1;
  }
                    /* try { // try from 0084e594 to 0084e59f has its CatchHandler @ 0084e5f8 */
  FUN_008ac964(param_1,bVar3);
  if ((local_40 != (__shared_weak_count *)0x0) &&
     (lVar2 = FUN_00c2bd10(0xffffffffffffffff,local_40 + 8), lVar2 == 0)) {
    (**(code **)(*(long *)local_40 + 0x10))(local_40);
    std::__ndk1::__shared_weak_count::__release_weak(local_40);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 1;
}

