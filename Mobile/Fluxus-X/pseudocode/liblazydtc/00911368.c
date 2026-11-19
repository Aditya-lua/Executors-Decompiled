/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00911368
 */

undefined8 FUN_00911368(long param_1,long param_2,undefined4 param_3,undefined4 *param_4)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  
  lVar5 = *(long *)(param_1 + 0x20);
  *param_4 = 0;
  plVar2 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x488);
  *(long **)(param_1 + 0x1a8) = plVar2;
  if (plVar2 == (long *)0x0) {
    return 0;
  }
  *(ulong *)(lVar5 + 0x3a0) = *(ulong *)(lVar5 + 0x3a0) | 0x2000000;
  plVar2[0x90] = param_2;
  *(undefined4 *)((long)plVar2 + 0x47c) = param_3;
  lVar3 = curl_slist_append(0,"Content-Type: application/dns-message");
  *plVar2 = lVar3;
  if ((lVar3 == 0) ||
     (iVar1 = FUN_00911488(param_1,plVar2 + 1,1,param_2,*(undefined8 *)(param_1 + 0x930),
                           *(undefined8 *)(param_1 + 0xc0),lVar3), iVar1 != 0)) {
LAB_00911408:
    FUN_00911d38(param_1);
  }
  else {
    *(int *)(plVar2 + 0x8f) = (int)plVar2[0x8f] + 1;
    if ((*(char *)(lVar5 + 0x573) != '\x01') && (uVar4 = FUN_0091724c(param_1), (uVar4 & 1) != 0)) {
      iVar1 = FUN_00911488(param_1,plVar2 + 0x48,0x1c,param_2,*(undefined8 *)(param_1 + 0x930),
                           *(undefined8 *)(param_1 + 0xc0),*plVar2);
      if (iVar1 != 0) goto LAB_00911408;
      *(int *)(plVar2 + 0x8f) = (int)plVar2[0x8f] + 1;
    }
    *param_4 = 1;
  }
  return 0;
}

