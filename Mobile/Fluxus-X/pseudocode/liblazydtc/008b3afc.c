/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3afc
 */

void FUN_008b3afc(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  long lVar1;
  long lVar2;
  
  lVar1 = FUN_008be244();
  lVar2 = FUN_008be244(param_1,param_3);
  if (lVar1 == lVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"attempt to perform arithmetic (%s) on %s",
                 (&PTR_s___index_00c4d1d0)[param_4 & 0xffffffff] + 2,lVar1);
  }
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,"attempt to perform arithmetic (%s) on %s and %s",
               (&PTR_s___index_00c4d1d0)[param_4 & 0xffffffff] + 2,lVar1,lVar2);
}

