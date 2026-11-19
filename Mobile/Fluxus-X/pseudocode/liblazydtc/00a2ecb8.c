/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ecb8
 */

int EC_KEY_check_key(EC_KEY *key)

{
  undefined4 uVar1;
  int iVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  if (((key == (EC_KEY *)0x0) || (*(long **)(key + 0x18) == (long *)0x0)) ||
     (*(long *)(key + 0x20) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x17f,"EC_KEY_check_key");
    uVar1 = 0xc0102;
  }
  else {
    UNRECOVERED_JUMPTABLE = *(code **)(**(long **)(key + 0x18) + 0x150);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a2ece4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar2 = (*UNRECOVERED_JUMPTABLE)();
      return iVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x184,"EC_KEY_check_key");
    uVar1 = 0xc0101;
  }
  ERR_set_error(0x10,uVar1,0);
  return 0;
}

