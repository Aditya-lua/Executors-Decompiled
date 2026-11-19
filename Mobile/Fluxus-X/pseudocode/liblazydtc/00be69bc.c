/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be69bc
 */

/* std::__ndk1::num_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, void const*) const */

void __thiscall
std::__ndk1::
num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put
          (undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5)

{
  char *pcVar1;
  uint uVar2;
  undefined1 *puVar3;
  int iVar4;
  long *plVar5;
  char *pcVar6;
  long local_120;
  undefined1 auStack_118 [148];
  char local_84 [20];
  undefined8 *local_70;
  undefined8 ***local_68;
  undefined8 **local_48;
  
  if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be6b98 to 00be6bab has its CatchHandler @ 00be6bc0 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  iVar4 = FUN_00c0cd14(local_84,0x14,DAT_00d270f0,&DAT_002ab219,param_5);
  uVar2 = *(uint *)(param_3 + 8) & 0xb0;
  pcVar1 = local_84 + iVar4;
  pcVar6 = pcVar1;
  if (uVar2 == 0x20) goto LAB_00be6a9c;
  if (uVar2 == 0x10) {
    if ((local_84[0] == '-') || (local_84[0] == '+')) {
      pcVar6 = (char *)((ulong)local_84 | 1);
      goto LAB_00be6a9c;
    }
    if ((1 < iVar4) && ((local_84[0] == '0' && ((byte)(local_84[1] | 0x20U) == 0x78)))) {
      pcVar6 = (char *)((ulong)local_84 | 2);
      goto LAB_00be6a9c;
    }
  }
  pcVar6 = local_84;
LAB_00be6a9c:
  ios_base::getloc();
  local_70 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_48 = &local_70;
    local_68 = &local_48;
                    /* try { // try from 00be6ad4 to 00be6aeb has its CatchHandler @ 00be6bd8 */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_120 + 0x18) - *(long *)(local_120 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar5 = *(long **)(*(long *)(local_120 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar5 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be6b84 to 00be6b87 has its CatchHandler @ 00be6bd8 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_120);
  (**(code **)(*plVar5 + 0x60))(plVar5,local_84,pcVar1,auStack_118);
  puVar3 = auStack_118 + (long)iVar4 * 4;
  if (pcVar6 != pcVar1) {
    puVar3 = auStack_118 + ((long)pcVar6 - (long)local_84) * 4;
  }
  FUN_00be6bec(param_2,auStack_118,puVar3,auStack_118 + (long)iVar4 * 4,param_3,param_4);
  return;
}

