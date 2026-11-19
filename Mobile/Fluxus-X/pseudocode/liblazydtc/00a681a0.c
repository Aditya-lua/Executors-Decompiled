/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a681a0
 */

ulong EVP_DigestVerify(EVP_MD_CTX *param_1,uchar *param_2,size_t param_3,undefined8 param_4,
                      undefined8 param_5)

{
  int iVar1;
  uint uVar2;
  EVP_MD_CTX *pEVar3;
  ulong uVar4;
  code *UNRECOVERED_JUMPTABLE;
  _func_1088 *p_Var5;
  
  p_Var5 = param_1->update;
  if ((((p_Var5 == (_func_1088 *)0x0) || (*(int *)p_Var5 != 0x100)) ||
      (*(EVP_MD_CTX **)(p_Var5 + 0x30) == (EVP_MD_CTX *)0x0)) || (*(long *)(p_Var5 + 0x28) == 0)) {
    if ((*(long *)(p_Var5 + 0x78) != 0) &&
       (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(p_Var5 + 0x78) + 0xd8),
       UNRECOVERED_JUMPTABLE != (code *)0x0)) {
      pEVar3 = param_1;
      goto LAB_00a68200;
    }
  }
  else {
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(p_Var5 + 0x28) + 0xa0);
    pEVar3 = *(EVP_MD_CTX **)(p_Var5 + 0x30);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
LAB_00a68200:
                    /* WARNING: Could not recover jumptable at 0x00a68214. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*UNRECOVERED_JUMPTABLE)(pEVar3,param_2,param_3);
      return uVar4;
    }
  }
  iVar1 = EVP_DigestVerifyUpdate(param_1,param_4,param_5);
  if (iVar1 < 1) {
    return 0xffffffff;
  }
  uVar2 = EVP_DigestVerifyFinal(param_1,param_2,param_3);
  return (ulong)uVar2;
}

