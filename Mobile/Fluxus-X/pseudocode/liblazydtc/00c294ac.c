/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c294ac
 */

void FUN_00c294ac(int param_1,long param_2)

{
  long lVar1;
  
  if (param_1 != 1) {
    FUN_00c0d774(*(undefined8 *)(param_2 + -0x38));
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c294e4 with catch @ 00c2950c
                        */
    FUN_007fe114();
  }
  lVar1 = FUN_00c2bd10(0xffffffffffffffff,param_2 + -0x58);
  if (lVar1 == 1) {
    if (*(code **)(param_2 + -0x48) != (code *)0x0) {
                    /* try { // try from 00c294e4 to 00c294eb has its CatchHandler @ 00c2950c */
      (**(code **)(param_2 + -0x48))(param_2 + 0x20);
    }
                    /* try { // try from 00c294f0 to 00c294f3 has its CatchHandler @ 00c29510 */
    FUN_00c29ce0(param_2 + -0x60);
  }
  return;
}

