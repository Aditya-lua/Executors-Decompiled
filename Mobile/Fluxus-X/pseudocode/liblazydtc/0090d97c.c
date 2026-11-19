/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090d97c
 */

int FUN_0090d97c(long param_1,long param_2,int param_3,uint *param_4)

{
  long lVar1;
  int iVar2;
  uint *puVar3;
  long *plVar4;
  undefined1 auVar5 [16];
  long *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = (long *)0x0;
  FUN_00906f54();
  puVar3 = (uint *)(*(code *)PTR_calloc_00cc4690)(1,0x138);
  if (puVar3 == (uint *)0x0) {
    iVar2 = 0x1b;
    plVar4 = (long *)0x0;
  }
  else {
    *puVar3 = (uint)*(byte *)(param_2 + 0x572);
    puVar3[0x26] = *param_4;
    *(byte *)(puVar3 + 0x4d) = (byte)puVar3[0x4d] & 0xfd;
    iVar2 = FUN_00907328(&local_50,&PTR_s_TCP_ACCEPT_00cc4a88,puVar3);
    if (iVar2 == 0) {
      FUN_0090738c(param_1,param_2,param_3,local_50);
      *(uint *)(param_2 + (long)param_3 * 4 + 0x220) = puVar3[0x26];
      FUN_0090db1c(local_50,param_1);
      *(byte *)(puVar3 + 0x4d) = (byte)puVar3[0x4d] | 8;
      auVar5 = FUN_00941cb8();
      *(undefined1 (*) [16])(puVar3 + 0x44) = auVar5;
      *(byte *)((long)local_50 + 0x24) = *(byte *)((long)local_50 + 0x24) | 1;
      if (param_1 == 0) goto LAB_0090db10;
      iVar2 = 0;
      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0090da3c;
      if (*(long *)(param_1 + 0x12a0) == 0) {
        if (local_50 != (long *)0x0) goto LAB_0090daec;
      }
      else if (local_50 != (long *)0x0) {
        iVar2 = 0;
        if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) goto LAB_0090da3c;
LAB_0090daec:
        if (0 < *(int *)(*local_50 + 0xc)) {
          FUN_00904ddc(param_1,local_50,"Curl_conn_tcp_listen_set(%d)",puVar3[0x26]);
        }
      }
LAB_0090db10:
      iVar2 = 0;
      goto LAB_0090da3c;
    }
    plVar4 = local_50;
  }
  (*(code *)PTR_free_00cc4678)(plVar4);
  local_50 = (long *)0x0;
  (*(code *)PTR_free_00cc4678)(puVar3);
LAB_0090da3c:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

