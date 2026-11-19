/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beee2c
 */

/* std::__ndk1::__money_get<char>::__gather_info(bool, std::__ndk1::locale const&,
   std::__ndk1::money_base::pattern&, char&, char&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, int&) */

void std::__ndk1::__money_get<char>::__gather_info
               (bool param_1,locale *param_2,pattern *param_3,char *param_4,char *param_5,
               basic_string_conflict *param_6,basic_string_conflict *param_7,
               basic_string_conflict *param_8,basic_string_conflict *param_9,int *param_10)

{
  long lVar1;
  char cVar2;
  undefined4 uVar3;
  int iVar4;
  ulong *puVar5;
  long lVar6;
  long *plVar7;
  undefined8 *puVar8;
  undefined8 **local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 *local_68;
  undefined8 ***local_48;
  
  lVar6 = *(long *)param_2;
  if (param_1) {
    puVar8 = &moneypunct<char,true>::id;
    local_68 = &moneypunct<char,true>::id;
    if (moneypunct<char,true>::id == -1) goto LAB_00beeee8;
    puVar5 = (ulong *)&moneypunct<char,true>::id;
  }
  else {
    puVar8 = &moneypunct<char,false>::id;
    local_68 = &moneypunct<char,false>::id;
    if (moneypunct<char,false>::id == -1) goto LAB_00beeee8;
    puVar5 = (ulong *)&moneypunct<char,false>::id;
  }
  local_48 = &local_80;
  local_80 = &local_68;
  __call_once(puVar5,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
LAB_00beeee8:
  lVar1 = *(long *)(lVar6 + 0x10);
  if (((ulong)(*(long *)(lVar6 + 0x18) - lVar1 >> 3) <= (long)*(int *)(puVar8 + 1) - 1U) ||
     (plVar7 = *(long **)(lVar1 + ((long)*(int *)(puVar8 + 1) - 1U) * 8), plVar7 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  uVar3 = (**(code **)(*plVar7 + 0x58))(plVar7);
  *(undefined4 *)param_3 = uVar3;
  (**(code **)(*plVar7 + 0x40))(&local_80,plVar7);
  if (((byte)*param_9 & 1) != 0) {
    operator_delete(*(void **)(param_9 + 0x10),*(ulong *)param_9 & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_9 + 8) = uStack_78;
  *(undefined8 ***)param_9 = local_80;
  *(undefined8 *)(param_9 + 0x10) = local_70;
  (**(code **)(*plVar7 + 0x38))(&local_80,plVar7);
  if (((byte)*param_8 & 1) != 0) {
    operator_delete(*(void **)(param_8 + 0x10),*(ulong *)param_8 & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_8 + 8) = uStack_78;
  *(undefined8 ***)param_8 = local_80;
  *(undefined8 *)(param_8 + 0x10) = local_70;
  cVar2 = (**(code **)(*plVar7 + 0x18))(plVar7);
  *param_4 = cVar2;
  cVar2 = (**(code **)(*plVar7 + 0x20))(plVar7);
  *param_5 = cVar2;
  (**(code **)(*plVar7 + 0x28))(&local_80,plVar7);
  if (((byte)*param_6 & 1) != 0) {
    operator_delete(*(void **)(param_6 + 0x10),*(ulong *)param_6 & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_6 + 8) = uStack_78;
  *(undefined8 ***)param_6 = local_80;
  *(undefined8 *)(param_6 + 0x10) = local_70;
  (**(code **)(*plVar7 + 0x30))(&local_80,plVar7);
  if (((byte)*param_7 & 1) != 0) {
    operator_delete(*(void **)(param_7 + 0x10),*(ulong *)param_7 & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_7 + 8) = uStack_78;
  *(undefined8 ***)param_7 = local_80;
  *(undefined8 *)(param_7 + 0x10) = local_70;
  iVar4 = (**(code **)(*plVar7 + 0x48))(plVar7);
  *param_10 = iVar4;
  return;
}

