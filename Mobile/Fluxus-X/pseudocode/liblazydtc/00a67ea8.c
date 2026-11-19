/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67ea8
 */

ulong EVP_DigestSign(EVP_MD_CTX *param_1,uchar *param_2,size_t *param_3,undefined8 param_4,
                    undefined8 param_5)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  size_t sVar4;
  code *UNRECOVERED_JUMPTABLE_00;
  _func_1088 *p_Var5;
  
  p_Var5 = param_1->update;
  if ((((p_Var5 == (_func_1088 *)0x0) || (*(int *)p_Var5 != 0x80)) ||
      (*(long *)(p_Var5 + 0x30) == 0)) || (*(long *)(p_Var5 + 0x28) == 0)) {
    if ((*(long *)(p_Var5 + 0x78) != 0) &&
       (UNRECOVERED_JUMPTABLE_00 = *(code **)(*(long *)(p_Var5 + 0x78) + 0xd0),
       UNRECOVERED_JUMPTABLE_00 != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00a67f34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (*UNRECOVERED_JUMPTABLE_00)(param_1,param_2,param_3,param_4,param_5);
      return uVar3;
    }
  }
  else {
    UNRECOVERED_JUMPTABLE_00 = *(code **)(*(long *)(p_Var5 + 0x28) + 0x80);
    if (UNRECOVERED_JUMPTABLE_00 != (code *)0x0) {
      if (param_2 == (uchar *)0x0) {
        sVar4 = 0;
      }
      else {
        sVar4 = *param_3;
      }
                    /* WARNING: Could not recover jumptable at 0x00a67f9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (*UNRECOVERED_JUMPTABLE_00)(*(long *)(p_Var5 + 0x30),param_2,param_3,sVar4);
      return uVar3;
    }
  }
  if ((param_2 == (uchar *)0x0) ||
     (iVar1 = EVP_DigestSignUpdate(param_1,param_4,param_5), 0 < iVar1)) {
    uVar2 = EVP_DigestSignFinal(param_1,param_2,param_3);
    return (ulong)uVar2;
  }
  return 0;
}

