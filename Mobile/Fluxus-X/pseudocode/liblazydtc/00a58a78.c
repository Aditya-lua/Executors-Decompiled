/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58a78
 */

int EVP_Q_digest(undefined8 param_1,undefined8 param_2,undefined8 param_3,void *param_4,
                size_t param_5,uchar *param_6,ulong *param_7)

{
  EVP_MD *pEVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  EVP_MD *type;
  uint local_34;
  
  type = (EVP_MD *)
         evp_generic_fetch(param_1,1,param_2,param_3,FUN_00a59084,&LAB_00a59588,&LAB_00a595ac);
  local_34 = 0;
  if (type == (EVP_MD *)0x0) {
    iVar6 = 0;
  }
  else {
    iVar6 = EVP_Digest(param_4,param_5,param_6,&local_34,type,(ENGINE *)0x0);
    if (*(int *)&type->init == 0) {
      pEVar1 = type + 1;
      do {
        iVar2 = pEVar1->type;
        iVar5 = iVar2 + -1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
        if (bVar4) {
          pEVar1->type = iVar5;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (iVar5 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar2) goto joined_r0x00a58b1c;
      evp_md_free_int(type);
    }
  }
joined_r0x00a58b1c:
  if (param_7 != (ulong *)0x0) {
    *param_7 = (ulong)local_34;
  }
  return iVar6;
}

