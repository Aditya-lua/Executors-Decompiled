/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824bec
 */

void FUN_00824bec(Url *param_1,Body *param_2,map *param_3)

{
  long lVar1;
  Session aSStack_310 [696];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  cpr::Session::Session(aSStack_310);
                    /* try { // try from 00824c30 to 00824c6b has its CatchHandler @ 00824ca0 */
  cpr::Session::SetOption(aSStack_310,param_1);
  cpr::Session::SetOption(aSStack_310,param_2);
  cpr::Session::SetOption(aSStack_310,param_3);
  cpr::Session::SetOption((SslOptions *)aSStack_310);
  cpr::Session::Patch();
  FUN_00826308(aSStack_310);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

