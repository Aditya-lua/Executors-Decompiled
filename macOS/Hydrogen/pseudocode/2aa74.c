
/* WARNING: Possible PIC construction at 0x0002aa78: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0002aa8c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0002aa7c) */
/* WARNING: Removing unreachable block (ram,0x0002aa90) */
/* WARNING: Removing unreachable block (ram,0x0002ac38) */
/* WARNING: Removing unreachable block (ram,0x0002ac4c) */
/* WARNING: Removing unreachable block (ram,0x0002ac54) */
/* WARNING: Removing unreachable block (ram,0x0002ac5c) */
/* WARNING: Removing unreachable block (ram,0x0002ac6c) */
/* WARNING: Removing unreachable block (ram,0x0002aad4) */
/* WARNING: Removing unreachable block (ram,0x0002ab4c) */
/* WARNING: Removing unreachable block (ram,0x0002ab5c) */
/* WARNING: Removing unreachable block (ram,0x0002aaec) */
/* WARNING: Removing unreachable block (ram,0x0002ab80) */
/* WARNING: Removing unreachable block (ram,0x0002aafc) */
/* WARNING: Removing unreachable block (ram,0x0002ab04) */
/* WARNING: Removing unreachable block (ram,0x0002ab88) */
/* WARNING: Removing unreachable block (ram,0x0002ab10) */
/* WARNING: Removing unreachable block (ram,0x0002ab28) */
/* WARNING: Removing unreachable block (ram,0x0002ab40) */
/* WARNING: Removing unreachable block (ram,0x0002ab90) */
/* WARNING: Removing unreachable block (ram,0x0002ab48) */
/* WARNING: Removing unreachable block (ram,0x0002aba0) */
/* WARNING: Removing unreachable block (ram,0x0002abdc) */
/* WARNING: Removing unreachable block (ram,0x0002abe0) */
/* WARNING: Removing unreachable block (ram,0x0002ac04) */
/* WARNING: Removing unreachable block (ram,0x0002ac0c) */
/* WARNING: Removing unreachable block (ram,0x0002ac14) */
/* WARNING: Removing unreachable block (ram,0x0002ac1c) */

void FUN_0002aa74(void)

{
  long lVar1;
  long *in_stack_00000030;
  
  if (in_stack_00000030 != (long *)0x0) {
    LOAcquire();
    lVar1 = in_stack_00000030[1];
    in_stack_00000030[1] = lVar1 + -1;
    LORelease();
    if (lVar1 == 0) {
      (**(code **)(*in_stack_00000030 + 0x10))(in_stack_00000030);
      __ZNSt3__119__shared_weak_count14__release_weakEv(in_stack_00000030);
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b2e48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZNSt3__16localeD1Ev_00a24a40)();
  return;
}

