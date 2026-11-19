/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2a30
 */

/* cpr::Session::GetFullRequestUrl() */

void cpr::Session::GetFullRequestUrl(void)

{
  basic_string_conflict *pbVar1;
  ulong uVar2;
  long lVar3;
  char *pcVar4;
  long in_x0;
  undefined8 *puVar5;
  char *in_x2;
  undefined8 *in_x8;
  undefined8 uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_68 [16];
  void *local_58;
  byte local_50 [8];
  ulong local_48;
  char *local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  CurlContainer<cpr::Parameter>::GetContent((CurlHolder *)(in_x0 + 0x48));
  uVar2 = (ulong)(local_50[0] >> 1);
  if ((local_50[0] & 1) != 0) {
    uVar2 = local_48;
  }
  pbVar1 = (basic_string_conflict *)&DAT_002ab32c;
  if (uVar2 != 0) {
    pbVar1 = (basic_string_conflict *)&DAT_002a35cf;
  }
                    /* try { // try from 008f2a9c to 008f2aa3 has its CatchHandler @ 008f2b58 */
  std::__ndk1::operator+((__ndk1 *)(in_x0 + 0x30),pbVar1,in_x2);
  uVar2 = (ulong)(local_50[0] >> 1);
  pcVar4 = (char *)((ulong)local_50 | 1);
  if ((local_50[0] & 1) != 0) {
    uVar2 = local_48;
    pcVar4 = local_40;
  }
                    /* try { // try from 008f2ac0 to 008f2ac7 has its CatchHandler @ 008f2b28 */
  puVar5 = (undefined8 *)
           std::__ndk1::
           basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                     (local_68,pcVar4,uVar2);
  in_x8[2] = puVar5[2];
  uVar6 = *puVar5;
  in_x8[1] = puVar5[1];
  *in_x8 = uVar6;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  if (((byte)local_68[0] & 1) != 0) {
    operator_delete(local_58);
  }
  if ((local_50[0] & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

