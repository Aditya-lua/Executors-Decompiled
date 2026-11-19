/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009857b4
 */

/* ix::SelectInterruptPipe::init(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

undefined8 __thiscall
ix::SelectInterruptPipe::init(SelectInterruptPipe *this,basic_string_conflict *param_1)

{
  SelectInterruptPipe *__pipedes;
  long lVar1;
  int iVar2;
  basic_ostream *pbVar3;
  int *piVar4;
  char *pcVar5;
  size_t sVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined **local_180;
  undefined **ppuStack_178;
  locale alStack_170 [8];
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  ulong local_138;
  undefined8 uStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  
  lVar1 = tpidr_el0;
  lVar7 = *(long *)(lVar1 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(this + 0x10));
  __pipedes = this + 8;
                    /* try { // try from 009857f8 to 0098582f has its CatchHandler @ 00985ddc */
  iVar2 = pipe((int *)__pipedes);
  if (iVar2 < 0) {
    local_180 = &PTR_FUN_00c4e508;
    local_110[0] = &PTR__basic_istream_00c4e640;
                    /* try { // try from 0098587c to 00985887 has its CatchHandler @ 00985d20 */
    std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
    local_88 = 0;
    local_80 = 0xffffffff;
    local_110[0] = &PTR_FUN_00c4e530;
    ppuStack_178 = &PTR__basic_streambuf_00c4e728;
    local_180 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_170);
    uStack_140 = 0;
    local_148 = 0;
    uStack_150 = 0;
    local_158 = 0;
    uStack_160 = 0;
    local_168 = 0;
    uStack_130 = 0;
    local_138 = 0;
    ppuStack_178 = &PTR_LAB_00c4e678;
    uStack_120 = 0;
    local_128 = (void *)0x0;
    local_118 = 0x18;
                    /* try { // try from 009858fc to 00985947 has its CatchHandler @ 00985d80 */
    pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       ((basic_ostream *)&local_180,
                        "SelectInterruptPipe::init() failed in pipe() call",0x31);
    pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       (pbVar3," : ",3);
    piVar4 = (int *)__errno();
    pcVar5 = strerror(*piVar4);
    sVar6 = strlen(pcVar5);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar3,pcVar5,sVar6);
                    /* try { // try from 00985948 to 00985953 has its CatchHandler @ 00985d1c */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    if (((byte)*param_1 & 1) == 0) {
      *(undefined2 *)param_1 = 0;
    }
    else {
      **(undefined1 **)(param_1 + 0x10) = 0;
      *(undefined8 *)(param_1 + 8) = 0;
      if (((byte)*param_1 & 1) != 0) {
        operator_delete(*(void **)(param_1 + 0x10));
        *(undefined8 *)param_1 = 0;
      }
    }
    *(undefined8 *)(param_1 + 0x10) = local_198;
    *(undefined8 *)(param_1 + 8) = uStack_1a0;
    *(undefined8 *)param_1 = local_1a8;
    local_180 = &PTR_FUN_00c4e508;
    local_110[0] = &PTR_FUN_00c4e530;
    ppuStack_178 = &PTR_LAB_00c4e678;
    if ((local_138 & 1) != 0) {
      operator_delete(local_128);
    }
    ppuStack_178 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_170);
  }
  else {
    iVar2 = fcntl(*(int *)__pipedes,4,0x800);
    if (iVar2 == -1) {
      local_180 = &PTR_FUN_00c4e508;
      local_110[0] = &PTR__basic_istream_00c4e640;
                    /* try { // try from 009859b0 to 009859bb has its CatchHandler @ 00985d14 */
      std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
      local_88 = 0;
      local_80 = 0xffffffff;
      local_110[0] = &PTR_FUN_00c4e530;
      ppuStack_178 = &PTR__basic_streambuf_00c4e728;
      local_180 = &PTR_FUN_00c4e508;
      std::__ndk1::locale::locale(alStack_170);
      uStack_140 = 0;
      local_148 = 0;
      uStack_150 = 0;
      local_158 = 0;
      uStack_160 = 0;
      local_168 = 0;
      uStack_130 = 0;
      local_138 = 0;
      ppuStack_178 = &PTR_LAB_00c4e678;
      uStack_120 = 0;
      local_128 = (void *)0x0;
      local_118 = 0x18;
                    /* try { // try from 00985a30 to 00985a7b has its CatchHandler @ 00985d2c */
      pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,
                          "SelectInterruptPipe::init() failed in fcntl(..., O_NONBLOCK) call",0x41);
      pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar3," : ",3);
      piVar4 = (int *)__errno();
      pcVar5 = strerror(*piVar4);
      sVar6 = strlen(pcVar5);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                (pbVar3,pcVar5,sVar6);
                    /* try { // try from 00985a7c to 00985a87 has its CatchHandler @ 00985d10 */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
      if (((byte)*param_1 & 1) != 0) goto LAB_00985c3c;
LAB_00985a90:
      *(undefined2 *)param_1 = 0;
    }
    else {
      iVar2 = fcntl(*(int *)(this + 0xc),4,0x800);
      if (iVar2 != -1) {
        uVar8 = 1;
        goto LAB_00985cc8;
      }
      local_180 = &PTR_FUN_00c4e508;
      local_110[0] = &PTR__basic_istream_00c4e640;
                    /* try { // try from 00985b5c to 00985b67 has its CatchHandler @ 00985d0c */
      std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
      local_88 = 0;
      local_80 = 0xffffffff;
      local_110[0] = &PTR_FUN_00c4e530;
      ppuStack_178 = &PTR__basic_streambuf_00c4e728;
      local_180 = &PTR_FUN_00c4e508;
      std::__ndk1::locale::locale(alStack_170);
      uStack_140 = 0;
      local_148 = 0;
      uStack_150 = 0;
      local_158 = 0;
      uStack_160 = 0;
      local_168 = 0;
      uStack_130 = 0;
      local_138 = 0;
      ppuStack_178 = &PTR_LAB_00c4e678;
      uStack_120 = 0;
      local_128 = (void *)0x0;
      local_118 = 0x18;
                    /* try { // try from 00985bdc to 00985c27 has its CatchHandler @ 00985d28 */
      pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,
                          "SelectInterruptPipe::init() failed in fcntl(..., O_NONBLOCK) call",0x41);
      pbVar3 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar3," : ",3);
      piVar4 = (int *)__errno();
      pcVar5 = strerror(*piVar4);
      sVar6 = strlen(pcVar5);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                (pbVar3,pcVar5,sVar6);
                    /* try { // try from 00985c28 to 00985c33 has its CatchHandler @ 00985d08 */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
      if (((byte)*param_1 & 1) == 0) goto LAB_00985a90;
LAB_00985c3c:
      **(undefined1 **)(param_1 + 0x10) = 0;
      *(undefined8 *)(param_1 + 8) = 0;
      if (((byte)*param_1 & 1) != 0) {
        operator_delete(*(void **)(param_1 + 0x10));
        *(undefined8 *)param_1 = 0;
      }
    }
    *(undefined8 *)(param_1 + 0x10) = local_198;
    *(undefined8 *)(param_1 + 8) = uStack_1a0;
    *(undefined8 *)param_1 = local_1a8;
    *(undefined8 *)__pipedes = 0xffffffffffffffff;
    local_110[0] = &PTR_FUN_00c4e530;
    local_180 = &PTR_FUN_00c4e508;
    ppuStack_178 = &PTR_LAB_00c4e678;
    if ((local_138 & 1) != 0) {
      operator_delete(local_128);
    }
    ppuStack_178 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_170);
  }
  std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  uVar8 = 0;
LAB_00985cc8:
  std::__ndk1::mutex::unlock((mutex *)(this + 0x10));
  if (*(long *)(lVar1 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar8;
}

