/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986840
 */

/* ix::DNSLookup::getAddrInfo(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&) */

void ix::DNSLookup::getAddrInfo
               (basic_string_conflict *param_1,int param_2,basic_string_conflict *param_3)

{
  long lVar1;
  addrinfo *paVar2;
  int __ecode;
  char *pcVar3;
  size_t sVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x3;
  undefined8 *in_x8;
  byte *__name;
  addrinfo *local_98;
  byte local_90 [16];
  char *local_80;
  addrinfo local_78;
  long local_48;
  
  pbVar6 = (byte *)(ulong)(uint)param_2;
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_78.ai_socktype = 1;
  local_78.ai_protocol = 0;
  local_78.ai_next = (addrinfo *)0x0;
  local_78.ai_canonname = (char *)0x0;
  local_78.ai_addr = (sockaddr *)0x0;
  local_78.ai_addrlen = 0;
  local_78._20_4_ = 0;
  local_78.ai_flags = 0x408;
  local_78.ai_family = 0;
  std::__ndk1::to_string((__ndk1 *)((ulong)param_3 & 0xffffffff),param_2);
  __name = *(byte **)(pbVar6 + 0x10);
  if ((*pbVar6 & 1) == 0) {
    __name = pbVar6 + 1;
  }
  pcVar3 = (char *)((ulong)local_90 | 1);
  if ((local_90[0] & 1) != 0) {
    pcVar3 = local_80;
  }
                    /* try { // try from 009868c8 to 009868f3 has its CatchHandler @ 00986990 */
  __ecode = getaddrinfo((char *)__name,pcVar3,&local_78,&local_98);
  if (__ecode != 0) {
    pcVar3 = gai_strerror(__ecode);
    sVar4 = strlen(pcVar3);
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign(in_x3,pcVar3,sVar4);
    local_98 = (addrinfo *)0x0;
  }
  paVar2 = local_98;
  *in_x8 = local_98;
                    /* try { // try from 00986908 to 0098690f has its CatchHandler @ 00986970 */
  puVar5 = operator_new(0x28);
  puVar5[2] = 0;
  puVar5[3] = paVar2;
  *puVar5 = &PTR____shared_weak_count_00c51f98;
  puVar5[1] = 0;
  in_x8[1] = puVar5;
  puVar5[4] = freeaddrinfo;
  if ((local_90[0] & 1) != 0) {
    operator_delete(local_80);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

