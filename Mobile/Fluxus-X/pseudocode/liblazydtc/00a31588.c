/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31588
 */

int EC_POINT_set_to_infinity(EC_GROUP *group,EC_POINT *point)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0x70);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x32e,"EC_POINT_set_to_infinity");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)group == *(long *)point) {
                    /* WARNING: Could not recover jumptable at 0x00a31610. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar1 = (*UNRECOVERED_JUMPTABLE)();
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x332,"EC_POINT_set_to_infinity");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

