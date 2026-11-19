/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be463c
 */

/* WARNING: Removing unreachable block (ram,0x00be4698) */
/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, unsigned long long) const */

void __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  char *pcVar4;
  char cVar5;
  char *pcVar6;
  locale alStack_a0 [8];
  char *local_98;
  char *pcStack_90;
  char acStack_85 [45];
  char local_58 [24];
  undefined8 local_28;
  
  uVar1 = *(uint *)(param_3 + 8);
  local_28 = 0x25;
  if ((uVar1 >> 9 & 1) == 0) {
    pcVar3 = (char *)((ulong)&local_28 | 1);
  }
  else {
    pcVar3 = (char *)((ulong)&local_28 | 2);
    local_28 = 0x2325;
  }
  cVar5 = 'l';
  pcVar6 = "l";
  do {
    pcVar4 = pcVar3 + 1;
    *pcVar3 = cVar5;
    cVar5 = *pcVar6;
    pcVar3 = pcVar4;
    pcVar6 = pcVar6 + 1;
  } while (cVar5 != '\0');
  if ((uVar1 & 0x4a) == 0x40) {
    cVar5 = 'o';
  }
  else if ((uVar1 & 0x4a) == 8) {
    cVar5 = 'x';
    if ((uVar1 & 0x4000) != 0) {
      cVar5 = 'X';
    }
  }
  else {
    cVar5 = 'u';
  }
  *pcVar4 = cVar5;
  if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00be4818 to 00be482b has its CatchHandler @ 00be4840 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  iVar2 = FUN_00c0cd14(local_58,0x18,DAT_00d270f0,&local_28,param_5);
  uVar1 = *(uint *)(param_3 + 8) & 0xb0;
  pcVar3 = local_58 + iVar2;
  if (uVar1 == 0x20) goto LAB_00be47a0;
  if (uVar1 == 0x10) {
    if ((local_58[0] == '-') || (local_58[0] == '+')) {
      pcVar3 = (char *)((ulong)local_58 | 1);
      goto LAB_00be47a0;
    }
    if (((1 < iVar2) && (local_58[0] == '0')) && ((byte)(local_58[1] | 0x20U) == 0x78)) {
      pcVar3 = (char *)((ulong)local_58 | 2);
      goto LAB_00be47a0;
    }
  }
  pcVar3 = local_58;
LAB_00be47a0:
  ios_base::getloc();
                    /* try { // try from 00be47ac to 00be47cb has its CatchHandler @ 00be4858 */
  __num_put<char>::__widen_and_group_int
            (local_58,pcVar3,local_58 + iVar2,acStack_85,&pcStack_90,&local_98,alStack_a0);
  locale::~locale(alStack_a0);
  FUN_00be5420(param_2,acStack_85,pcStack_90,local_98,param_3,param_4);
  return;
}

