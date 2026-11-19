/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099b348
 */

/* ix::WebSocketHandshake::sendErrorResponse(int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void ix::WebSocketHandshake::sendErrorResponse(int param_1,basic_string_conflict *param_2)

{
  byte *pbVar1;
  long lVar2;
  char *pcVar3;
  basic_ostream *pbVar4;
  ulong uVar5;
  byte *in_x2;
  atomic *paVar6;
  code *pcVar7;
  long lVar8;
  Socket *this;
  __tree_node **local_238;
  __tree_node *local_230;
  undefined8 uStack_228;
  ulong local_220;
  undefined8 uStack_218;
  void *local_210;
  __tree_node **pp_Stack_208;
  __tree_node *local_200;
  undefined8 uStack_1f8;
  ulong local_1f0 [2];
  char *local_1e0;
  undefined **local_1d0;
  undefined8 uStack_1c8;
  undefined **local_1c0;
  undefined **ppuStack_1b8;
  locale alStack_1b0 [8];
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  ulong local_178;
  undefined8 uStack_170;
  void *local_168;
  undefined8 uStack_160;
  undefined4 local_158;
  undefined **local_150 [17];
  undefined8 local_c8;
  undefined4 local_c0;
  function local_b0 [8];
  ulong local_a8;
  char *local_a0;
  function *local_90;
  
  lVar2 = tpidr_el0;
  lVar8 = *(long *)(lVar2 + 0x28);
  local_1c0 = &PTR_FUN_00c4e508;
  local_150[0] = &PTR__basic_istream_00c4e640;
  uStack_1c8 = 0;
  local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0099b3c0 to 0099b3cb has its CatchHandler @ 0099b7b8 */
  std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
  local_c8 = 0;
  local_c0 = 0xffffffff;
  local_1d0 = &PTR_LAB_00c4e4e0;
  local_150[0] = &PTR_FUN_00c4e530;
  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
  local_1c0 = &PTR_FUN_00c4e508;
  std::__ndk1::locale::locale(alStack_1b0);
  uStack_180 = 0;
  local_188 = 0;
  uStack_190 = 0;
  local_198 = 0;
  uStack_1a0 = 0;
  local_1a8 = 0;
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  uStack_160 = 0;
  local_168 = (void *)0x0;
  uStack_170 = 0;
  local_178 = 0;
  local_158 = 0x18;
                    /* try { // try from 0099b440 to 0099b4bb has its CatchHandler @ 0099b7d8 */
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1c0,"HTTP/1.1 ",9);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_1c0,(int)param_2);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1c0," ",1);
  uVar5 = *(ulong *)(in_x2 + 8);
  pbVar1 = *(byte **)(in_x2 + 0x10);
  if ((*in_x2 & 1) == 0) {
    pbVar1 = in_x2 + 1;
    uVar5 = (ulong)(*in_x2 >> 1);
  }
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1c0,(char *)pbVar1,uVar5);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1c0,"\r\n",2);
  pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_1c0,"Server: ",8);
                    /* try { // try from 0099b4c0 to 0099b4cb has its CatchHandler @ 0099b7b4 */
  userAgent();
  uVar5 = (ulong)((byte)local_b0[0] >> 1);
  pcVar3 = (char *)((ulong)local_b0 | 1);
  if (((byte)local_b0[0] & 1) != 0) {
    uVar5 = local_a8;
    pcVar3 = local_a0;
  }
                    /* try { // try from 0099b4e8 to 0099b4ff has its CatchHandler @ 0099b7c0 */
  pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar4,pcVar3,uVar5);
  paVar6 = (atomic *)0x2;
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar4,"\r\n",2);
  if (((byte)local_b0[0] & 1) != 0) {
    operator_delete(local_a0);
  }
                    /* try { // try from 0099b510 to 0099b523 has its CatchHandler @ 0099b7b0 */
  makeCancellationRequestWithTimeout((ix *)0x1,0xd21848,paVar6);
  this = (Socket *)**(undefined8 **)((ulong)(uint)param_1 + 8);
                    /* try { // try from 0099b52c to 0099b537 has its CatchHandler @ 0099b77c */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
                    /* try { // try from 0099b538 to 0099b547 has its CatchHandler @ 0099b764 */
  uVar5 = Socket::writeBytes(this,(basic_string_conflict *)local_1f0,local_b0);
  if (((byte)local_1f0[0]._0_1_ & 1) != 0) {
    operator_delete(local_1e0);
  }
  if ((uVar5 & 1) == 0) {
    local_1f0[0] = 0;
    local_1f0[1] = 0;
    local_1e0 = (char *)0x0;
                    /* try { // try from 0099b5c8 to 0099b5cf has its CatchHandler @ 0099b73c */
    local_1e0 = operator_new(0x30);
    local_1f0[1] = 0x26;
    local_1f0[0] = 0x31;
    builtin_strncpy(local_1e0,"Timed out while sending error response",0x27);
    pp_Stack_208 = &local_200;
    local_200 = (__tree_node *)0x0;
    uStack_1f8 = 0;
    local_220 = 0;
    uStack_218 = 0;
    local_210 = (void *)0x0;
                    /* try { // try from 0099b610 to 0099b62b has its CatchHandler @ 0099b710 */
    WebSocketInitResult::WebSocketInitResult();
    if ((local_220 & 1) != 0) {
      operator_delete(local_210);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&pp_Stack_208,local_200);
    if ((local_1f0[0] & 1) != 0) {
      operator_delete(local_1e0);
    }
  }
  else {
    local_238 = &local_230;
    local_230 = (__tree_node *)0x0;
    uStack_228 = 0;
    local_1f0[0] = 0;
    local_1f0[1] = 0;
    local_1e0 = (char *)0x0;
                    /* try { // try from 0099b578 to 0099b593 has its CatchHandler @ 0099b740 */
    WebSocketInitResult::WebSocketInitResult();
    if ((local_1f0[0] & 1) != 0) {
      operator_delete(local_1e0);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&local_238,local_230);
  }
  if (local_b0 == local_90) {
    pcVar7 = *(code **)(*(long *)local_90 + 0x20);
  }
  else {
    if (local_90 == (function *)0x0) goto LAB_0099b690;
    pcVar7 = *(code **)(*(long *)local_90 + 0x28);
  }
  (*pcVar7)();
LAB_0099b690:
  local_1d0 = &PTR_LAB_00c4e4e0;
  local_150[0] = &PTR_FUN_00c4e530;
  local_1c0 = &PTR_FUN_00c4e508;
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  if ((local_178 & 1) != 0) {
    operator_delete(local_168);
  }
  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_1b0);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
  if (*(long *)(lVar2 + 0x28) != lVar8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

