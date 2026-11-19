/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a581b4
 */

undefined4 EVP_DigestFinalXOF(EVP_MD_CTX *param_1,undefined8 param_2,ulong param_3)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  ENGINE *pEVar4;
  _func_1088 *p_Var5;
  code *pcVar6;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  ulong local_28;
  
  pEVar4 = param_1->engine;
  local_28 = param_3;
  if (pEVar4 == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x1e0,"EVP_DigestFinalXOF");
    uVar3 = 0xda;
  }
  else if (*(long *)(pEVar4 + 0x70) == 0) {
    if (((param_3 >> 0x1f == 0) && (((uint)*(undefined8 *)(pEVar4 + 0x10) >> 1 & 1) != 0)) &&
       (iVar1 = (**(code **)(pEVar4 + 0x50))(param_1,3,param_3,0), iVar1 != 0)) {
      uVar2 = (**(code **)(param_1->engine + 0x30))(param_1,param_2);
      pEVar4 = param_1->engine;
      if (*(code **)(pEVar4 + 0x40) != (code *)0x0) {
        (**(code **)(pEVar4 + 0x40))(param_1);
        EVP_MD_CTX_set_flags(param_1,2);
        pEVar4 = param_1->engine;
      }
      OPENSSL_cleanse(param_1->pctx,(long)*(int *)(pEVar4 + 0x4c));
      return uVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x1ff,"EVP_DigestFinalXOF");
    uVar3 = 0xb2;
  }
  else {
    if (*(long *)(pEVar4 + 0xa0) != 0) {
      OSSL_PARAM_construct_size_t(&local_a8,"xoflen",&local_28);
      local_60 = local_88;
      uStack_78 = uStack_a0;
      local_80 = local_a8;
      uStack_68 = uStack_90;
      uStack_70 = local_98;
      OSSL_PARAM_construct_end(&local_a8);
      local_38 = local_88;
      uStack_40 = uStack_90;
      local_48 = local_98;
      uStack_50 = uStack_a0;
      local_58 = local_a8;
      p_Var5 = param_1->update;
      if ((((p_Var5 == (_func_1088 *)0x0) || ((*(int *)p_Var5 != 0x100 && (*(int *)p_Var5 != 0x80)))
           ) || (pEVar4 = *(ENGINE **)(p_Var5 + 0x30), pEVar4 == (ENGINE *)0x0)) ||
         (pcVar6 = *(code **)(*(long *)(p_Var5 + 0x28) + 0xe8), pcVar6 == (code *)0x0)) {
        if (param_1->engine == (ENGINE *)0x0) {
          return 0;
        }
        pcVar6 = *(code **)(param_1->engine + 200);
        if (pcVar6 == (code *)0x0) {
          return 0;
        }
        pEVar4 = param_1[1].engine;
      }
      iVar1 = (*pcVar6)(pEVar4,&local_80);
      if (iVar1 < 1) {
        return 0;
      }
      uVar2 = (**(code **)(param_1->engine + 0xa0))(param_1[1].engine,param_2,&local_28,local_28);
      return uVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x1e8,"EVP_DigestFinalXOF");
    uVar3 = 0xbc;
  }
  ERR_set_error(6,uVar3,0);
  return 0;
}

