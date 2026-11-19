/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be41c0
 */

/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, long long) const */

void __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  char *pcVar4;
  char *pcVar5;
  char cVar6;
  locale alStack_a0 [8];
  char *local_98;
  char *pcStack_90;
  char acStack_85 [45];
  char local_58 [24];
  undefined8 local_28;
  
  uVar1 = *(uint *)(param_3 + 8);
  local_28 = 0x25;
  pcVar3 = (char *)((ulong)&local_28 | 1);
  if ((((uVar1 >> 0xb & 1) != 0) && ((uVar1 & 0x4a) != 8)) && ((uVar1 & 0x4a) != 0x40)) {
    pcVar3 = (char *)((ulong)&local_28 | 2);
    local_28 = 0x2b25;
  }
  pcVar4 = pcVar3;
  if ((uVar1 >> 9 & 1) != 0) {
    pcVar4 = pcVar3 + 1;
    *pcVar3 = '#';
  }
  cVar6 = 'l';
  pcVar3 = "l";
  do {
    pcVar5 = pcVar4 + 1;
    *pcVar4 = cVar6;
    cVar6 = *pcVar3;
    pcVar4 = pcVar5;
    pcVar3 = pcVar3 + 1;
  } while (cVar6 != '\0');
  if ((uVar1 & 0x4a) == 0x40) {
    cVar6 = 'o';
  }
  else if ((uVar1 & 0x4a) == 8) {
    cVar6 = 'x';
    if ((uVar1 & 0x4000) != 0) {
      cVar6 = 'X';
    }
  }
  else {
    cVar6 = 'd';
  }
  *pcVar5 = cVar6;
  if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00be43b8 to 00be43cb has its CatchHandler @ 00be43e0 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  iVar2 = FUN_00c0cd14(local_58,0x18,DAT_00d270f0,&local_28,param_5);
  uVar1 = *(uint *)(param_3 + 8) & 0xb0;
  pcVar3 = local_58 + iVar2;
  if (uVar1 == 0x20) goto LAB_00be4340;
  if (uVar1 == 0x10) {
    if ((local_58[0] == '-') || (local_58[0] == '+')) {
      pcVar3 = (char *)((ulong)local_58 | 1);
      goto LAB_00be4340;
    }
    if (((1 < iVar2) && (local_58[0] == '0')) && ((byte)(local_58[1] | 0x20U) == 0x78)) {
      pcVar3 = (char *)((ulong)local_58 | 2);
      goto LAB_00be4340;
    }
  }
  pcVar3 = local_58;
LAB_00be4340:
  ios_base::getloc();
                    /* try { // try from 00be434c to 00be436b has its CatchHandler @ 00be43f8 */
  __num_put<char>::__widen_and_group_int
            (local_58,pcVar3,local_58 + iVar2,acStack_85,&pcStack_90,&local_98,alStack_a0);
  locale::~locale(alStack_a0);
  FUN_00be5420(param_2,acStack_85,pcStack_90,local_98,param_3,param_4);
  return;
}

