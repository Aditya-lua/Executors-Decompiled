/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ff378
 */

/* cpr::util::isTrue(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

bool cpr::util::isTrue(basic_string_conflict *param_1)

{
  byte bVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  byte *pbVar6;
  byte *pbVar7;
  void *__src;
  byte *pbVar8;
  ulong uVar9;
  ulong local_60;
  ulong uStack_58;
  byte *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uStack_58 = 0;
  local_50 = (byte *)0x0;
  local_60 = 0;
  if (((byte)*param_1 & 1) == 0) {
    local_50 = *(byte **)(param_1 + 0x10);
    uStack_58 = *(ulong *)(param_1 + 8);
    local_60 = *(ulong *)param_1;
    goto joined_r0x008ff43c;
  }
  uVar5 = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x10);
  if (uVar5 < 0x17) {
    pbVar8 = (byte *)((ulong)&local_60 | 1);
    local_60 = (ulong)(byte)((int)uVar5 << 1);
    if (uVar5 != 0) goto LAB_008ff424;
  }
  else {
    uVar9 = uVar5 + 0x10 & 0xfffffffffffffff0;
    pbVar8 = operator_new(uVar9);
    local_60 = uVar9 | 1;
    uStack_58 = uVar5;
    local_50 = pbVar8;
LAB_008ff424:
    memcpy(pbVar8,__src,uVar5);
  }
  pbVar8[uVar5] = 0;
joined_r0x008ff43c:
  if ((local_60 & 1) == 0) {
    uVar5 = (ulong)((byte)local_60 >> 1);
    pbVar8 = (byte *)((ulong)&local_60 | 1);
  }
  else {
    uVar5 = uStack_58;
    pbVar8 = local_50;
  }
  pbVar6 = pbVar8;
  bVar1 = (byte)local_60;
  if (pbVar8 != pbVar8 + uVar5) {
    do {
      iVar4 = tolower((uint)*pbVar6);
      pbVar7 = pbVar6 + 1;
      *pbVar6 = (byte)iVar4;
      pbVar6 = pbVar7;
    } while (pbVar8 + uVar5 != pbVar7);
    bVar1 = (byte)local_60;
  }
  uVar5 = (ulong)(bVar1 >> 1);
  if ((bVar1 & 1) != 0) {
    uVar5 = uStack_58;
  }
  bVar3 = false;
  if (uVar5 == 4) {
    pbVar8 = (byte *)((ulong)&local_60 | 1);
    if ((bVar1 & 1) != 0) {
      pbVar8 = local_50;
    }
    bVar3 = *(int *)pbVar8 == 0x65757274;
  }
  if ((bVar1 & 1) != 0) {
    operator_delete(local_50);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return bVar3;
}

