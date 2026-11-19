/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be59f0
 */

/* std::__ndk1::num_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, long long) const */

void __thiscall
std::__ndk1::
num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put
          (undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  char *pcVar4;
  char *pcVar5;
  char cVar6;
  locale alStack_130 [8];
  wchar_t *local_128;
  wchar_t *pwStack_120;
  wchar_t awStack_114 [45];
  char local_60 [24];
  undefined8 local_48;
  
  uVar1 = *(uint *)(param_3 + 8);
  local_48 = 0x25;
  pcVar3 = (char *)((ulong)&local_48 | 1);
  if ((((uVar1 >> 0xb & 1) != 0) && ((uVar1 & 0x4a) != 8)) && ((uVar1 & 0x4a) != 0x40)) {
    pcVar3 = (char *)((ulong)&local_48 | 2);
    local_48 = 0x2b25;
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
                    /* try { // try from 00be5be8 to 00be5bfb has its CatchHandler @ 00be5c10 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  iVar2 = FUN_00c0cd14(local_60,0x18,DAT_00d270f0,&local_48,param_5);
  uVar1 = *(uint *)(param_3 + 8) & 0xb0;
  pcVar3 = local_60 + iVar2;
  if (uVar1 == 0x20) goto LAB_00be5b70;
  if (uVar1 == 0x10) {
    if ((local_60[0] == '-') || (local_60[0] == '+')) {
      pcVar3 = (char *)((ulong)local_60 | 1);
      goto LAB_00be5b70;
    }
    if (((1 < iVar2) && (local_60[0] == '0')) && ((byte)(local_60[1] | 0x20U) == 0x78)) {
      pcVar3 = (char *)((ulong)local_60 | 2);
      goto LAB_00be5b70;
    }
  }
  pcVar3 = local_60;
LAB_00be5b70:
  ios_base::getloc();
                    /* try { // try from 00be5b7c to 00be5b9b has its CatchHandler @ 00be5c28 */
  __num_put<wchar_t>::__widen_and_group_int
            (local_60,pcVar3,local_60 + iVar2,awStack_114,&pwStack_120,&local_128,alStack_130);
  locale::~locale(alStack_130);
  FUN_00be6bec(param_2,awStack_114,pwStack_120,local_128,param_3,param_4);
  return;
}

