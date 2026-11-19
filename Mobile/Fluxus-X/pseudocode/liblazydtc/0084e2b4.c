/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e2b4
 */

undefined8 FUN_0084e2b4(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  byte *pbVar3;
  byte *pbVar4;
  ulong uVar5;
  long lVar6;
  byte *pbVar7;
  ulong *puVar8;
  long local_68;
  __shared_weak_count *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  FUN_008abd78(param_1,1);
  FUN_0084dce8(&local_68);
  if (local_68 == 0) {
                    /* try { // try from 0084e3f4 to 0084e403 has its CatchHandler @ 0084e464 */
    FUN_008ad0b0(param_1,0,0);
  }
  else {
                    /* try { // try from 0084e300 to 0084e307 has its CatchHandler @ 0084e470 */
    std::__ndk1::mutex::lock((mutex *)(local_68 + 0x550));
    pbVar4 = *(byte **)(local_68 + 0x578);
    pbVar7 = *(byte **)(local_68 + 0x580);
    lVar6 = *(long *)(local_68 + 0x588);
    *(undefined8 *)(local_68 + 0x580) = 0;
    *(undefined8 *)(local_68 + 0x578) = 0;
    *(undefined8 *)(local_68 + 0x588) = 0;
    std::__ndk1::mutex::unlock((mutex *)(local_68 + 0x550));
                    /* try { // try from 0084e334 to 0084e343 has its CatchHandler @ 0084e46c */
    FUN_008ad0b0(param_1,0,0);
    uVar5 = 0;
    puVar8 = (ulong *)(pbVar4 + 8);
    while (uVar5 < (ulong)(((long)pbVar7 - (long)pbVar4 >> 3) * -0x5555555555555555)) {
      uVar1 = (ulong)(byte)((byte)puVar8[-1] >> 1);
      pbVar3 = (byte *)((long)puVar8 + -7);
      if (((byte)puVar8[-1] & 1) != 0) {
        uVar1 = *puVar8;
        pbVar3 = (byte *)puVar8[1];
      }
                    /* try { // try from 0084e384 to 0084e3a3 has its CatchHandler @ 0084e474 */
      FUN_008ac34c(param_1,pbVar3,uVar1);
      uVar5 = uVar5 + 1;
      puVar8 = puVar8 + 3;
      FUN_008ada90(param_1,0xfffffffe,uVar5 & 0xffffffff);
    }
    if (pbVar4 != (byte *)0x0) {
      if (pbVar4 != pbVar7) {
        do {
          pbVar3 = pbVar7 + -0x18;
          if ((*pbVar3 & 1) != 0) {
            operator_delete(*(void **)(pbVar7 + -8),*(ulong *)(pbVar7 + -0x18) & 0xfffffffffffffffe)
            ;
          }
          pbVar7 = pbVar3;
        } while (pbVar3 != pbVar4);
      }
      operator_delete(pbVar4,lVar6 - (long)pbVar4);
    }
  }
  if ((local_60 != (__shared_weak_count *)0x0) &&
     (lVar6 = FUN_00c2bd10(0xffffffffffffffff,local_60 + 8), lVar6 == 0)) {
    (**(code **)(*(long *)local_60 + 0x10))(local_60);
    std::__ndk1::__shared_weak_count::__release_weak(local_60);
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 1;
}

