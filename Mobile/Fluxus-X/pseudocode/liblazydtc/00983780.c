/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00983780
 */

/* ix::Http::sendResponse(std::__ndk1::shared_ptr<ix::HttpResponse>,
   std::__ndk1::unique_ptr<ix::Socket, std::__ndk1::default_delete<ix::Socket> >&) */

uint ix::Http::sendResponse(long *param_1,undefined8 *param_2)

{
  long *plVar1;
  basic_string_conflict bVar2;
  byte bVar3;
  long lVar4;
  char *pcVar5;
  bool bVar6;
  uint uVar7;
  ulong uVar8;
  basic_ostream *pbVar9;
  basic_string_conflict *pbVar10;
  long lVar11;
  code *pcVar12;
  long *plVar13;
  long *plVar14;
  Socket *pSVar15;
  basic_string_conflict local_1d8 [16];
  void *local_1c8;
  undefined **local_1c0;
  undefined8 uStack_1b8;
  undefined **local_1b0;
  undefined **ppuStack_1a8;
  locale alStack_1a0 [8];
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  ulong local_168;
  undefined8 uStack_160;
  void *local_158;
  undefined8 uStack_150;
  undefined4 local_148;
  undefined **local_140 [17];
  undefined8 local_b8;
  undefined4 local_b0;
  ulong local_a0;
  undefined8 uStack_98;
  void *local_90;
  ulong *local_80;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  local_1b0 = &PTR_FUN_00c4e508;
  local_140[0] = &PTR__basic_istream_00c4e640;
  uStack_1b8 = 0;
  local_1c0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009837f0 to 009837fb has its CatchHandler @ 00983cb8 */
  std::__ndk1::ios_base::init
            ((ios_base *)local_140,
             (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &ppuStack_1a8);
  local_b8 = 0;
  local_b0 = 0xffffffff;
  local_1c0 = &PTR_LAB_00c4e4e0;
  local_140[0] = &PTR_FUN_00c4e530;
  ppuStack_1a8 = &PTR__basic_streambuf_00c4e728;
  local_1b0 = &PTR_FUN_00c4e508;
  std::__ndk1::locale::locale(alStack_1a0);
  uStack_170 = 0;
  local_178 = 0;
  uStack_180 = 0;
  local_188 = 0;
  uStack_190 = 0;
  local_198 = 0;
  uStack_150 = 0;
  local_158 = (void *)0x0;
  uStack_160 = 0;
  local_168 = 0;
  ppuStack_1a8 = &PTR_LAB_00c4e678;
  local_148 = 0x18;
                    /* try { // try from 00983870 to 009838e3 has its CatchHandler @ 00983cc0 */
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1b0,"HTTP/1.1 ",9);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_1b0,*(int *)*param_1);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1b0," ",1);
  lVar11 = *param_1;
  uVar8 = (ulong)(*(byte *)(lVar11 + 8) >> 1);
  pcVar5 = (char *)(lVar11 + 9);
  if ((*(byte *)(lVar11 + 8) & 1) != 0) {
    uVar8 = *(ulong *)(lVar11 + 0x10);
    pcVar5 = *(char **)(lVar11 + 0x18);
  }
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1b0,pcVar5,uVar8);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1b0,"\r\n",2);
  pSVar15 = (Socket *)*param_2;
                    /* try { // try from 009838e8 to 009838f3 has its CatchHandler @ 00983cb4 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
  local_80 = (ulong *)0x0;
                    /* try { // try from 009838f8 to 0098390b has its CatchHandler @ 00983c7c */
  uVar8 = Socket::writeBytes(pSVar15,local_1d8,(function *)&local_a0);
  if (&local_a0 == local_80) {
    pcVar12 = *(code **)(*local_80 + 0x20);
LAB_00983934:
    (*pcVar12)();
  }
  else if (local_80 != (ulong *)0x0) {
    pcVar12 = *(code **)(*local_80 + 0x28);
    goto LAB_00983934;
  }
  if (((byte)local_1d8[0] & 1) != 0) {
    operator_delete(local_1c8);
  }
  uVar7 = 0;
  if ((uVar8 & 1) == 0) goto LAB_00983b80;
  local_a0 = 0;
  uStack_98 = 0;
  local_90 = (void *)0x0;
                    /* try { // try from 00983958 to 00983967 has its CatchHandler @ 00983c64 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &ppuStack_1a8,(basic_string_conflict *)&local_a0);
  if ((local_a0 & 1) != 0) {
    operator_delete(local_90);
  }
                    /* try { // try from 00983978 to 009839b7 has its CatchHandler @ 00983cc0 */
  pbVar9 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_1b0,"Content-Length: ",0x10);
  bVar3 = *(byte *)(*param_1 + 0x40);
  if ((bVar3 & 1) == 0) {
    uVar8 = (ulong)(bVar3 >> 1);
  }
  else {
    uVar8 = *(ulong *)(*param_1 + 0x48);
  }
  pbVar9 = (basic_ostream *)
           std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                     ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar9,uVar8);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar9,"\r\n",2);
  plVar1 = (long *)(*param_1 + 0x30);
  plVar14 = *(long **)(*param_1 + 0x28);
joined_r0x009839c8:
  if (plVar14 != plVar1) {
    do {
      uVar8 = (ulong)(*(byte *)(plVar14 + 4) >> 1);
      pcVar5 = (char *)((long)plVar14 + 0x21);
      if ((*(byte *)(plVar14 + 4) & 1) != 0) {
        uVar8 = plVar14[5];
        pcVar5 = (char *)plVar14[6];
      }
                    /* try { // try from 009839f8 to 00983a37 has its CatchHandler @ 00983cc8 */
      pbVar9 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_1b0,pcVar5,uVar8);
      pbVar9 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar9,": ",2);
      uVar8 = (ulong)(*(byte *)(plVar14 + 7) >> 1);
      pcVar5 = (char *)((long)plVar14 + 0x39);
      if ((*(byte *)(plVar14 + 7) & 1) != 0) {
        uVar8 = plVar14[8];
        pcVar5 = (char *)plVar14[9];
      }
      pbVar9 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar9,pcVar5,uVar8);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar9,"\r\n",2);
      plVar13 = (long *)plVar14[1];
      if ((long *)plVar14[1] == (long *)0x0) {
        plVar13 = plVar14 + 2;
        bVar6 = *(long **)*plVar13 == plVar14;
        plVar14 = (long *)*plVar13;
        if (bVar6) goto joined_r0x009839c8;
        do {
          lVar11 = *plVar13;
          plVar13 = (long *)(lVar11 + 0x10);
          plVar14 = (long *)*plVar13;
        } while (*plVar14 != lVar11);
      }
      else {
        do {
          plVar14 = plVar13;
          plVar13 = (long *)*plVar14;
        } while ((long *)*plVar14 != (long *)0x0);
      }
      if (plVar14 == plVar1) break;
    } while( true );
  }
                    /* try { // try from 00983a94 to 00983aab has its CatchHandler @ 00983cc0 */
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1b0,"\r\n",2);
  pSVar15 = (Socket *)*param_2;
                    /* try { // try from 00983ab0 to 00983abb has its CatchHandler @ 00983c60 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
  local_80 = (ulong *)0x0;
                    /* try { // try from 00983ac0 to 00983ad3 has its CatchHandler @ 00983c40 */
  uVar8 = Socket::writeBytes(pSVar15,local_1d8,(function *)&local_a0);
  if (&local_a0 == local_80) {
    pcVar12 = *(code **)(*local_80 + 0x20);
LAB_00983afc:
    (*pcVar12)();
  }
  else if (local_80 != (ulong *)0x0) {
    pcVar12 = *(code **)(*local_80 + 0x28);
    goto LAB_00983afc;
  }
  if (((byte)local_1d8[0] & 1) != 0) {
    operator_delete(local_1c8);
  }
  uVar7 = 0;
  if ((uVar8 & 1) == 0) goto LAB_00983b80;
  pbVar10 = (basic_string_conflict *)(*param_1 + 0x40);
  bVar2 = *pbVar10;
  if (((byte)bVar2 & 1) == 0) {
    if ((byte)bVar2 >> 1 == 0) {
LAB_00983b6c:
      uVar7 = 1;
      goto LAB_00983b80;
    }
  }
  else if (*(long *)(*param_1 + 0x48) == 0) goto LAB_00983b6c;
  local_80 = (ulong *)0x0;
                    /* try { // try from 00983b38 to 00983b43 has its CatchHandler @ 00983c0c */
  uVar7 = Socket::writeBytes((Socket *)*param_2,pbVar10,(function *)&local_a0);
  if (&local_a0 == local_80) {
    pcVar12 = *(code **)(*local_80 + 0x20);
  }
  else {
    if (local_80 == (ulong *)0x0) goto LAB_00983b80;
    pcVar12 = *(code **)(*local_80 + 0x28);
  }
  (*pcVar12)();
LAB_00983b80:
  local_1c0 = &PTR_LAB_00c4e4e0;
  local_140[0] = &PTR_FUN_00c4e530;
  local_1b0 = &PTR_FUN_00c4e508;
  ppuStack_1a8 = &PTR_LAB_00c4e678;
  if ((local_168 & 1) != 0) {
    operator_delete(local_158);
  }
  ppuStack_1a8 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_1a0);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_140);
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar7 & 1;
}

