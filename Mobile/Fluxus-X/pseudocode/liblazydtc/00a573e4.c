/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a573e4
 */

ulong evp_md_ctx_clear_digest(EVP_MD_CTX *param_1,int param_2,int param_3)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  code *pcVar8;
  
  if (param_1[1].engine != (ENGINE *)0x0) {
    if ((param_1->engine != (ENGINE *)0x0) &&
       (pcVar8 = *(code **)(param_1->engine + 0xb0), pcVar8 != (code *)0x0)) {
      (*pcVar8)();
    }
    param_1[1].engine = (ENGINE *)0x0;
    EVP_MD_CTX_set_flags(param_1,2);
  }
  FUN_00a574a4(param_1,param_2);
  if (param_2 != 0) {
    param_1->engine = (ENGINE *)0x0;
  }
  uVar6 = ENGINE_finish((ENGINE *)param_1->flags);
  param_1->flags = 0;
  if (param_3 != 0) {
    return (ulong)uVar6;
  }
  uVar7 = param_1[1].flags;
  if ((uVar7 != 0) && (*(int *)(uVar7 + 0x18) == 0)) {
    piVar1 = (int *)(uVar7 + 0x78);
    do {
      iVar2 = *piVar1;
      iVar5 = iVar2 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < iVar2) goto LAB_00a5748c;
    uVar7 = evp_md_free_int();
  }
LAB_00a5748c:
  param_1[1].flags = 0;
  param_1->digest = (EVP_MD *)0x0;
  return uVar7;
}

