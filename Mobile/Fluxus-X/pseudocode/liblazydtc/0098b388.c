/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098b388
 */

/* ix::CaseInsensitiveLess::cmp(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

undefined8
ix::CaseInsensitiveLess::cmp(basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  basic_string_conflict *pbVar3;
  basic_string_conflict bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  
  pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
  bVar5 = ((byte)*param_1 & 1) == 0;
  if (bVar5) {
    pbVar2 = param_1 + 1;
  }
  uVar1 = *(ulong *)(param_2 + 8);
  pbVar3 = *(basic_string_conflict **)(param_2 + 0x10);
  uVar8 = (ulong)((byte)*param_1 >> 1);
  if (!bVar5) {
    uVar8 = *(ulong *)(param_1 + 8);
  }
  if (((byte)*param_2 & 1) == 0) {
    pbVar3 = param_2 + 1;
    uVar1 = (ulong)((byte)*param_2 >> 1);
  }
  while( true ) {
    if (uVar1 == 0) {
      return 0;
    }
    if (uVar8 == 0) {
      return 1;
    }
    bVar4 = *pbVar3;
    iVar6 = tolower((uint)(byte)*pbVar2);
    iVar7 = tolower((uint)(byte)bVar4);
    if (iVar6 < iVar7) {
      return 1;
    }
    if (iVar7 < iVar6) break;
    pbVar2 = pbVar2 + 1;
    pbVar3 = pbVar3 + 1;
    uVar8 = uVar8 - 1;
    uVar1 = uVar1 - 1;
  }
  return 0;
}

