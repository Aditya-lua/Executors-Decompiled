/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a2d0
 */

undefined8 X509_LOOKUP_ctrl_ex(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 8);
  if (lVar2 == 0) {
    return 0xffffffff;
  }
  if (*(code **)(lVar2 + 0x58) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00b0a2e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(lVar2 + 0x58))();
    return uVar1;
  }
  if (*(code **)(lVar2 + 0x28) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a2f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(lVar2 + 0x28))();
  return uVar1;
}

