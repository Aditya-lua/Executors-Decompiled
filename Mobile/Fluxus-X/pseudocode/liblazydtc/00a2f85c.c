/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f85c
 */

undefined8 EC_KEY_priv2oct(long param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  long lVar2;
  
  if ((*(long **)(param_1 + 0x18) != (long *)0x0) &&
     (lVar2 = **(long **)(param_1 + 0x18), lVar2 != 0)) {
    UNRECOVERED_JUMPTABLE = *(code **)(lVar2 + 0x130);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a2f874. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*UNRECOVERED_JUMPTABLE)();
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x389,"EC_KEY_priv2oct");
    ERR_set_error(0x10,0xc0101,0);
  }
  return 0;
}

