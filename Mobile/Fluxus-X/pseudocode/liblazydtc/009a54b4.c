/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a54b4
 */

/* ix::SocketTLSOptions::isValid() const */

void ix::SocketTLSOptions::isValid(void)

{
  uint uVar1;
  byte bVar2;
  long lVar3;
  undefined *puVar4;
  int iVar5;
  byte *in_x0;
  undefined8 uVar6;
  basic_string_conflict *pbVar7;
  char *this;
  basic_string_conflict *in_x2;
  basic_string_conflict *__n;
  long lVar8;
  byte *pbVar9;
  ulong uVar10;
  ulong uVar11;
  byte *pbVar12;
  undefined8 local_468;
  undefined8 uStack_460;
  undefined8 local_458;
  undefined **local_450;
  undefined8 uStack_448;
  basic_filebuf<char,std::__ndk1::char_traits<char>> abStack_440 [16];
  uint auStack_430 [26];
  FILE *local_3c8;
  undefined4 local_3a8;
  undefined **local_398 [17];
  undefined8 local_310;
  undefined4 local_308;
  undefined **local_300;
  undefined8 uStack_2f8;
  basic_filebuf<char,std::__ndk1::char_traits<char>> abStack_2f0 [16];
  uint auStack_2e0 [26];
  FILE *local_278;
  undefined4 local_258;
  undefined **local_248 [17];
  undefined8 local_1c0;
  undefined4 local_1b8;
  undefined **local_1b0;
  undefined8 uStack_1a8;
  basic_filebuf<char,std::__ndk1::char_traits<char>> abStack_1a0 [16];
  uint auStack_190 [26];
  FILE *local_128;
  undefined4 local_108;
  undefined **local_f8 [17];
  undefined8 local_70;
  undefined4 local_68;
  
  lVar3 = tpidr_el0;
  lVar8 = *(long *)(lVar3 + 0x28);
  if (in_x0[0x80] != 0) {
    uVar6 = 1;
    goto LAB_009a5958;
  }
  if ((*in_x0 & 1) != 0) {
    if (*(long *)(in_x0 + 8) == 0) goto LAB_009a5620;
LAB_009a5514:
    local_f8[0] = &PTR__basic_istream_00c51c70;
    uStack_1a8 = 0;
    local_1b0 = &PTR__basic_istream_00c51c48;
                    /* try { // try from 009a5540 to 009a554b has its CatchHandler @ 009a5a68 */
    std::__ndk1::ios_base::init((ios_base *)local_f8,abStack_1a0);
    local_70 = 0;
    local_68 = 0xffffffff;
    local_1b0 = &PTR_FUN_00c51bf0;
    local_f8[0] = &PTR_LAB_00c51c18;
                    /* try { // try from 009a5570 to 009a5577 has its CatchHandler @ 009a5a64 */
    std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf(abStack_1a0);
    if (local_128 == (FILE *)0x0) {
      pbVar12 = *(byte **)(in_x0 + 0x10);
      if ((*in_x0 & 1) == 0) {
        pbVar12 = in_x0 + 1;
      }
      local_128 = fopen((char *)pbVar12,"r");
      if (local_128 == (FILE *)0x0) goto LAB_009a5580;
      local_108 = 8;
    }
    else {
LAB_009a5580:
                    /* try { // try from 009a5598 to 009a559b has its CatchHandler @ 009a5a54 */
      std::__ndk1::ios_base::clear
                ((ios_base *)((long)&local_1b0 + (long)local_1b0[-3]),
                 *(uint *)((long)auStack_190 + (long)local_1b0[-3]) | 4);
    }
    uVar1 = *(uint *)((long)auStack_190 + (long)local_1b0[-3]);
    local_1b0 = &PTR_FUN_00c51bf0;
    local_f8[0] = &PTR_LAB_00c51c18;
    std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf(abStack_1a0);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_f8);
    if ((uVar1 & 5) == 0) goto LAB_009a5620;
    this = "certFile not found: ";
    pbVar12 = in_x0;
LAB_009a590c:
    std::__ndk1::operator+((__ndk1 *)this,(char *)pbVar12,in_x2);
    pbVar12 = in_x0 + 0x68;
    if ((*pbVar12 & 1) == 0) {
      pbVar12[0] = 0;
      pbVar12[1] = 0;
    }
    else {
      **(undefined1 **)(in_x0 + 0x78) = 0;
      in_x0[0x70] = 0;
      in_x0[0x71] = 0;
      in_x0[0x72] = 0;
      in_x0[0x73] = 0;
      in_x0[0x74] = 0;
      in_x0[0x75] = 0;
      in_x0[0x76] = 0;
      in_x0[0x77] = 0;
      if ((in_x0[0x68] & 1) != 0) {
        operator_delete(*(void **)(in_x0 + 0x78));
        in_x0[0x68] = 0;
        in_x0[0x69] = 0;
        in_x0[0x6a] = 0;
        in_x0[0x6b] = 0;
        in_x0[0x6c] = 0;
        in_x0[0x6d] = 0;
        in_x0[0x6e] = 0;
        in_x0[0x6f] = 0;
      }
    }
    uVar6 = 0;
    *(undefined8 *)(in_x0 + 0x78) = local_458;
    *(undefined8 *)(in_x0 + 0x70) = uStack_460;
    *(undefined8 *)pbVar12 = local_468;
    goto LAB_009a5958;
  }
  if (*in_x0 >> 1 != 0) goto LAB_009a5514;
LAB_009a5620:
  pbVar12 = in_x0 + 0x18;
  if ((*pbVar12 & 1) == 0) {
    if (*pbVar12 >> 1 != 0) {
LAB_009a5640:
      local_248[0] = &PTR__basic_istream_00c51c70;
      uStack_2f8 = 0;
      local_300 = &PTR__basic_istream_00c51c48;
                    /* try { // try from 009a566c to 009a5677 has its CatchHandler @ 009a5a48 */
      std::__ndk1::ios_base::init((ios_base *)local_248,abStack_2f0);
      local_1c0 = 0;
      local_1b8 = 0xffffffff;
      local_300 = &PTR_FUN_00c51bf0;
      local_248[0] = &PTR_LAB_00c51c18;
                    /* try { // try from 009a569c to 009a56a3 has its CatchHandler @ 009a5a44 */
      std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf(abStack_2f0);
      if (local_278 == (FILE *)0x0) {
        pbVar9 = *(byte **)(in_x0 + 0x28);
        if ((in_x0[0x18] & 1) == 0) {
          pbVar9 = in_x0 + 0x19;
        }
        local_278 = fopen((char *)pbVar9,"r");
        if (local_278 == (FILE *)0x0) goto LAB_009a56ac;
        local_258 = 8;
      }
      else {
LAB_009a56ac:
                    /* try { // try from 009a56c4 to 009a56c7 has its CatchHandler @ 009a5a30 */
        std::__ndk1::ios_base::clear
                  ((ios_base *)((long)&local_300 + (long)local_300[-3]),
                   *(uint *)((long)auStack_2e0 + (long)local_300[-3]) | 4);
      }
      uVar1 = *(uint *)((long)auStack_2e0 + (long)local_300[-3]);
      local_300 = &PTR_FUN_00c51bf0;
      local_248[0] = &PTR_LAB_00c51c18;
      std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf(abStack_2f0);
      std::__ndk1::ios_base::~ios_base((ios_base *)local_248);
      if ((uVar1 & 5) != 0) {
        this = "keyFile not found: ";
        goto LAB_009a590c;
      }
    }
  }
  else if (*(long *)(in_x0 + 0x20) != 0) goto LAB_009a5640;
  puVar4 = kTLSCAFileDisableVerify;
  bVar2 = in_x0[0x30];
  if ((bVar2 & 1) == 0) {
    if (bVar2 >> 1 != 0) {
LAB_009a576c:
      in_x2 = (basic_string_conflict *)strlen(kTLSCAFileDisableVerify);
      __n = (basic_string_conflict *)(ulong)(bVar2 >> 1);
      if ((bVar2 & 1) != 0) {
        __n = *(basic_string_conflict **)(in_x0 + 0x38);
      }
      if (in_x2 == __n) {
        if (in_x2 != (basic_string_conflict *)0x0) {
          if (in_x2 == (basic_string_conflict *)0xffffffffffffffff) {
                    /* try { // try from 009a59f4 to 009a59fb has its CatchHandler @ 009a5a08 */
            std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
            goto LAB_009a59fc;
          }
          pbVar9 = *(byte **)(in_x0 + 0x40);
          if ((bVar2 & 1) == 0) {
            pbVar9 = in_x0 + 0x31;
          }
          iVar5 = memcmp(pbVar9,puVar4,(size_t)in_x2);
          if (iVar5 != 0) goto LAB_009a57c0;
        }
      }
      else {
LAB_009a57c0:
        puVar4 = kTLSCAFileUseSystemDefaults;
        pbVar7 = (basic_string_conflict *)strlen(kTLSCAFileUseSystemDefaults);
        if (pbVar7 == __n) {
          if (__n != (basic_string_conflict *)0x0) {
            if (__n == (basic_string_conflict *)0xffffffffffffffff) {
LAB_009a59fc:
                    /* try { // try from 009a59fc to 009a5a03 has its CatchHandler @ 009a5a04 */
              std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 009a59fc with catch @ 009a5a04
                        */
              FUN_007fe114();
            }
            pbVar9 = *(byte **)(in_x0 + 0x40);
            if ((bVar2 & 1) == 0) {
              pbVar9 = in_x0 + 0x31;
            }
            iVar5 = memcmp(pbVar9,puVar4,(size_t)__n);
            in_x2 = __n;
            if (iVar5 != 0) goto LAB_009a5804;
          }
        }
        else {
LAB_009a5804:
          local_398[0] = &PTR__basic_istream_00c51c70;
          uStack_448 = 0;
          local_450 = &PTR__basic_istream_00c51c48;
                    /* try { // try from 009a5830 to 009a583b has its CatchHandler @ 009a5a24 */
          std::__ndk1::ios_base::init((ios_base *)local_398,abStack_440);
          local_310 = 0;
          local_308 = 0xffffffff;
          local_450 = &PTR_FUN_00c51bf0;
          local_398[0] = &PTR_LAB_00c51c18;
                    /* try { // try from 009a5860 to 009a5867 has its CatchHandler @ 009a5a20 */
          std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
                    (abStack_440);
          if (local_3c8 == (FILE *)0x0) {
            pbVar9 = *(byte **)(in_x0 + 0x40);
            if ((in_x0[0x30] & 1) == 0) {
              pbVar9 = in_x0 + 0x31;
            }
            local_3c8 = fopen((char *)pbVar9,"r");
            if (local_3c8 == (FILE *)0x0) goto LAB_009a5870;
            local_3a8 = 8;
          }
          else {
LAB_009a5870:
                    /* try { // try from 009a5888 to 009a588b has its CatchHandler @ 009a5a0c */
            std::__ndk1::ios_base::clear
                      ((ios_base *)((long)&local_450 + (long)local_450[-3]),
                       *(uint *)((long)auStack_430 + (long)local_450[-3]) | 4);
          }
          uVar1 = *(uint *)((long)auStack_430 + (long)local_450[-3]);
          local_450 = &PTR_FUN_00c51bf0;
          local_398[0] = &PTR_LAB_00c51c18;
          std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
                    (abStack_440);
          std::__ndk1::ios_base::~ios_base((ios_base *)local_398);
          if ((uVar1 & 5) != 0) {
            this = "caFile not found: ";
            pbVar12 = in_x0 + 0x30;
            goto LAB_009a590c;
          }
        }
      }
    }
  }
  else if (*(long *)(in_x0 + 0x38) != 0) goto LAB_009a576c;
  if ((*in_x0 & 1) == 0) {
    uVar10 = (ulong)(*in_x0 >> 1);
    bVar2 = *pbVar12;
    if ((bVar2 & 1) == 0) goto LAB_009a59ac;
LAB_009a5998:
    uVar11 = *(ulong *)(in_x0 + 0x20);
  }
  else {
    uVar10 = *(ulong *)(in_x0 + 8);
    bVar2 = *pbVar12;
    if ((bVar2 & 1) != 0) goto LAB_009a5998;
LAB_009a59ac:
    uVar11 = (ulong)(bVar2 >> 1);
  }
  if ((uVar10 == 0) == (uVar11 == 0)) {
    uVar6 = 1;
    in_x0[0x80] = 1;
  }
  else {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (in_x0 + 0x68),"certFile and keyFile must be both present, or both absent",0x39);
    uVar6 = 0;
  }
LAB_009a5958:
  if (*(long *)(lVar3 + 0x28) != lVar8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

