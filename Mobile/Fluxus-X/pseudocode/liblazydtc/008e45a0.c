/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e45a0
 */

long * FUN_008e45a0(int param_1,int param_2)

{
  int iVar1;
  void *pvVar2;
  long *plVar3;
  long lVar4;
  void *pvVar5;
  long *plVar6;
  long lVar7;
  undefined **local_58 [3];
  
  if (DAT_00d1fec0 == (void *)0x0) {
    pvVar2 = operator_new(0x20);
    FUN_008e5188(pvVar2,8);
    DAT_00d1fec0 = pvVar2;
  }
  FUN_008e4728(local_58,DAT_00d1fec0);
  lVar7 = (long)param_1;
  do {
    plVar3 = (long *)FUN_008e5058(local_58);
    if (plVar3 == (long *)0x0) {
      iVar1 = FUN_008e4b0c();
      lVar4 = FUN_008e4b20(0,iVar1,param_2);
      if (lVar4 == 0) {
        log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","MemoryArena.cc",0x22,"AllocateChunk");
        log_internal_impl(0xffffffff,"[!] Failed to alloc page\n");
        plVar6 = (long *)0x0;
        goto LAB_008e46f0;
      }
      plVar3 = operator_new(0x28);
      plVar3[1] = (long)iVar1;
      plVar3[2] = lVar4;
      *plVar3 = lVar4;
      *(int *)(plVar3 + 3) = param_2;
      pvVar5 = operator_new(0x20);
      FUN_008e5188(pvVar5,8);
      pvVar2 = DAT_00d1fec0;
      plVar3[4] = (long)pvVar5;
      FUN_008e4744(pvVar2,plVar3);
      break;
    }
  } while (((int)plVar3[3] != param_2) ||
          ((ulong)(plVar3[1] + *plVar3) <= (ulong)(plVar3[2] + lVar7)));
  plVar6 = operator_new(0x10);
  *plVar6 = plVar3[2];
  plVar6[1] = lVar7;
  FUN_008e4744(plVar3[4],plVar6);
  plVar3[2] = plVar3[2] + lVar7;
LAB_008e46f0:
  local_58[0] = &PTR_LAB_00c4e3e0;
  FUN_008e5080(local_58);
  return plVar6;
}

