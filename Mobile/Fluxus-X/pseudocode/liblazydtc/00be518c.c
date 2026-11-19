/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be518c
 */

/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, void const*) const */

void __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5)

{
  char *pcVar1;
  uint uVar2;
  char *pcVar3;
  int iVar4;
  long *plVar5;
  char *pcVar6;
  long local_b0;
  char acStack_a1 [37];
  char local_7c [20];
  undefined8 *local_68;
  undefined8 ***local_60;
  undefined8 **local_58;
  
  if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be535c to 00be536f has its CatchHandler @ 00be5384 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  iVar4 = FUN_00c0cd14(local_7c,0x14,DAT_00d270f0,&DAT_002ab219,param_5);
  uVar2 = *(uint *)(param_3 + 8) & 0xb0;
  pcVar1 = local_7c + iVar4;
  pcVar6 = pcVar1;
  if (uVar2 == 0x20) goto LAB_00be5268;
  if (uVar2 == 0x10) {
    if ((local_7c[0] == '-') || (local_7c[0] == '+')) {
      pcVar6 = (char *)((ulong)local_7c | 1);
      goto LAB_00be5268;
    }
    if ((1 < iVar4) && ((local_7c[0] == '0' && ((byte)(local_7c[1] | 0x20U) == 0x78)))) {
      pcVar6 = (char *)((ulong)local_7c | 2);
      goto LAB_00be5268;
    }
  }
  pcVar6 = local_7c;
LAB_00be5268:
  ios_base::getloc();
  local_68 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_58 = &local_68;
    local_60 = &local_58;
                    /* try { // try from 00be529c to 00be52b3 has its CatchHandler @ 00be539c */
    __call_once((ulong *)&ctype<char>::id,&local_60,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_b0 + 0x18) - *(long *)(local_b0 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar5 = *(long **)(*(long *)(local_b0 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar5 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be5348 to 00be534b has its CatchHandler @ 00be539c */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_b0);
  (**(code **)(*plVar5 + 0x40))(plVar5,local_7c,pcVar1,acStack_a1);
  pcVar3 = acStack_a1 + iVar4;
  if (pcVar6 != pcVar1) {
    pcVar3 = pcVar6 + (long)(acStack_a1 + -(long)local_7c);
  }
  FUN_00be5420(param_2,acStack_a1,pcVar3,acStack_a1 + iVar4,param_3,param_4);
  return;
}

