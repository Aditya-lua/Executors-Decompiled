/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74088
 */

undefined8 FUN_00a74088(long param_1,undefined4 param_2)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  int *piVar2;
  
  piVar2 = *(int **)(param_1 + 0x88);
  if (piVar2 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_check.c",0x61,"evp_pkey_param_check_combined");
    ERR_set_error(6,0x9a,0);
    uVar1 = 0;
  }
  else {
    uVar1 = FUN_00a741fc(param_1,0x84,param_2);
    if ((int)uVar1 == -1) {
      if (*piVar2 != 0) {
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x78) + 0xf0);
        if ((UNRECOVERED_JUMPTABLE != (code *)0x0) ||
           ((*(long *)(piVar2 + 2) != 0 &&
            (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(piVar2 + 2) + 0xf0),
            UNRECOVERED_JUMPTABLE != (code *)0x0)))) {
                    /* WARNING: Could not recover jumptable at 0x00a740d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar1 = (*UNRECOVERED_JUMPTABLE)(piVar2);
          return uVar1;
        }
      }
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_check.c",0x7a,"evp_pkey_param_check_combined");
      ERR_set_error(6,0x96,0);
      uVar1 = 0xfffffffe;
    }
  }
  return uVar1;
}

