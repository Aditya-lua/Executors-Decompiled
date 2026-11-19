/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a679f4
 */

ulong EVP_DigestSignUpdate(EVP_MD_CTX *param_1,void *param_2,size_t param_3)

{
  code cVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  code *UNRECOVERED_JUMPTABLE;
  _func_1088 *p_Var5;
  
  p_Var5 = param_1->update;
  if (p_Var5 != (_func_1088 *)0x0) {
    if (((*(int *)p_Var5 == 0x80) && (*(long *)(p_Var5 + 0x30) != 0)) &&
       (*(long *)(p_Var5 + 0x28) != 0)) {
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(p_Var5 + 0x28) + 0x70);
      if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/m_sigver.c",0x1a2,"EVP_DigestSignUpdate");
        ERR_set_error(6,0xc0101,0);
        return 0;
      }
                    /* WARNING: Could not recover jumptable at 0x00a67a50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*UNRECOVERED_JUMPTABLE)(*(long *)(p_Var5 + 0x30),param_2,param_3);
      return uVar4;
    }
    cVar1 = p_Var5[0xa0];
    if (((byte)cVar1 & 1) != 0) {
      iVar2 = (**(code **)(*(long *)(p_Var5 + 0x78) + 0xf8))(p_Var5,param_1);
      if (iVar2 == 0) {
        return 0;
      }
      cVar1 = p_Var5[0xa0];
    }
    p_Var5[0xa0] = (_func_1088)((byte)cVar1 & 0xfe);
  }
  uVar3 = EVP_DigestUpdate(param_1,param_2,param_3);
  return (ulong)uVar3;
}

