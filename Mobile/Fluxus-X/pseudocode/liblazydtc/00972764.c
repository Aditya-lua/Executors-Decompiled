/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972764
 */

/* ix::HttpClient::createRequest(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void ix::HttpClient::createRequest(basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar3;
  undefined8 *puVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x2;
  undefined8 *in_x8;
  
  puVar4 = operator_new(0x150);
  puVar4[2] = 0;
  pbVar3 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (puVar4 + 4);
  *puVar4 = &PTR____shared_ptr_emplace_00c51828;
  puVar4[1] = 0;
  memset(pbVar3,0,0x130);
  *(undefined1 *)(puVar4 + 0x14) = 1;
  *(undefined4 *)((long)puVar4 + 0xa4) = 5;
  puVar4[10] = puVar4 + 0xb;
  puVar4[0x11] = 0;
  puVar4[0x12] = 0;
  puVar4[0xf] = 0;
  puVar4[0x10] = 0;
  puVar4[0xd] = 0;
  puVar4[0xe] = 0;
  *(undefined1 *)((long)puVar4 + 0xaa) = 0;
  puVar4[0x1a] = 0;
  puVar4[0x20] = 0;
  puVar4[0x26] = 0;
  *(undefined2 *)(puVar4 + 0x15) = 0x100;
  puVar4[0x13] = 0x7080000003c;
  *in_x8 = pbVar3;
  in_x8[1] = puVar4;
  if (pbVar3 != (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                param_2) {
    uVar1 = *(ulong *)(param_2 + 8);
    pbVar2 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)*param_2 & 1) == 0) {
      pbVar2 = param_2 + 1;
      uVar1 = (ulong)((byte)*param_2 >> 1);
    }
                    /* try { // try from 00972824 to 00972853 has its CatchHandler @ 00972868 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign(pbVar3,(char *)pbVar2,uVar1);
  }
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)(puVar4 + 7)
      != in_x2) {
    uVar1 = *(ulong *)(in_x2 + 8);
    pbVar3 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (in_x2 + 0x10);
    if (((byte)*in_x2 & 1) == 0) {
      pbVar3 = in_x2 + 1;
      uVar1 = (ulong)((byte)*in_x2 >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (puVar4 + 7),(char *)pbVar3,uVar1);
  }
  return;
}

