/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008286bc
 */

void FUN_008286bc(Url *param_1,map *param_2)

{
  long lVar1;
  Session aSStack_300 [696];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  cpr::Session::Session(aSStack_300);
                    /* try { // try from 008286f8 to 00828727 has its CatchHandler @ 00828758 */
  cpr::Session::SetOption(aSStack_300,param_1);
  cpr::Session::SetOption(aSStack_300,param_2);
  cpr::Session::SetOption((SslOptions *)aSStack_300);
  cpr::Session::Get();
  FUN_00826308(aSStack_300);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

