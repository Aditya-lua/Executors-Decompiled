/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ca98
 */

undefined8 EVP_PKEY_eq(int *param_1,int *param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  if (param_1 == param_2) {
    uVar2 = 1;
  }
  else if (param_1 == (int *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if (param_2 != (int *)0x0) {
      if ((*(long *)(param_1 + 0x18) != 0) || (*(long *)(param_2 + 0x18) != 0)) {
        iVar1 = evp_keymgmt_util_has(param_1,2);
        if ((iVar1 == 0) || (iVar1 = evp_keymgmt_util_has(param_2,2), iVar1 == 0)) {
          uVar2 = 7;
        }
        else {
          uVar2 = 6;
        }
        uVar2 = FUN_00a6c90c(param_1,param_2,uVar2);
        return uVar2;
      }
      if (*param_1 == *param_2) {
        lVar3 = *(long *)(param_1 + 2);
        if (lVar3 != 0) {
          if (*(code **)(lVar3 + 0x90) != (code *)0x0) {
            uVar2 = (**(code **)(lVar3 + 0x90))(param_1,param_2);
            if ((int)uVar2 < 1) {
              return uVar2;
            }
            lVar3 = *(long *)(param_1 + 2);
          }
          if (*(code **)(lVar3 + 0x30) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a6cb78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            uVar2 = (**(code **)(lVar3 + 0x30))(param_1,param_2);
            return uVar2;
          }
        }
        uVar2 = 0xfffffffe;
      }
      else {
        uVar2 = 0xffffffff;
      }
    }
  }
  return uVar2;
}

