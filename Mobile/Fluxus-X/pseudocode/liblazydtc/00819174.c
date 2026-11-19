/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00819174
 */

undefined8 FUN_00819174(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  char *__s;
  size_t __n;
  undefined8 *puVar3;
  ulong uVar4;
  void *pvVar5;
  void *__dest;
  undefined8 local_2e0;
  ulong local_2d8;
  void *local_2d0;
  byte local_2c8;
  undefined7 uStack_2c7;
  ulong local_2c0;
  void *local_2b8;
  pointer_____offset_0x18___ local_2b0;
  undefined **local_2a8;
  locale alStack_2a0 [8];
  undefined8 local_298 [2];
  ulong local_288;
  undefined8 uStack_280;
  ulong local_278;
  byte local_268;
  undefined7 uStack_267;
  void *local_258;
  ulong local_250;
  uint local_248;
  undefined **appuStack_240 [19];
  pointer_____offset_0x18___ local_1a8;
  size_t local_1a0;
  void *local_198 [15];
  long local_120;
  undefined **appuStack_f0 [19];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  __s = (char *)FUN_008aefa4(param_1,1,0);
  __n = strlen(__s);
  if (0xfffffffffffffff7 < __n) {
    if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    goto LAB_00819558;
  }
  if (__n < 0x17) {
    pvVar5 = (void *)((ulong)&local_1a8 | 1);
    local_1a8 = (pointer_____offset_0x18___)CONCAT71(local_1a8._1_7_,(char)((int)__n << 1));
    if (__n != 0) goto LAB_00819208;
  }
  else {
    uVar4 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar4 = (__n | 7) + 1;
    }
    pvVar5 = operator_new(uVar4);
    local_1a8 = (pointer_____offset_0x18___)(uVar4 | 1);
    local_1a0 = __n;
    local_198[0] = pvVar5;
LAB_00819208:
    memmove(pvVar5,__s,__n);
  }
  *(undefined1 *)((long)pvVar5 + __n) = 0;
                    /* try { // try from 0081921c to 00819227 has its CatchHandler @ 00819524 */
  FUN_0081e9b8(&local_2c8,&local_1a8);
  if (((ulong)local_1a8 & 1) != 0) {
    operator_delete(local_198[0],(ulong)local_1a8 & 0xfffffffffffffffe);
  }
  uVar4 = (ulong)(local_2c8 >> 1);
  if ((local_2c8 & 1) != 0) {
    uVar4 = local_2c0;
  }
  if (uVar4 == 0) {
                    /* try { // try from 008192a8 to 008192af has its CatchHandler @ 008194c4 */
    FUN_008ac024(param_1);
  }
  else {
                    /* try { // try from 00819258 to 00819267 has its CatchHandler @ 0081950c */
    FUN_0081ec44(&local_1a8,&local_2c8,8);
    if (local_120 == 0) {
                    /* try { // try from 008192f8 to 008192ff has its CatchHandler @ 008194c0 */
      FUN_008ac024(param_1);
    }
    else {
                    /* try { // try from 00819270 to 00819277 has its CatchHandler @ 008194ec */
      FUN_0081ed5c(&local_2b0);
                    /* try { // try from 0081927c to 00819287 has its CatchHandler @ 008194e8 */
      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_2b0,
                 (basic_streambuf *)local_198);
      if ((local_248 >> 4 & 1) == 0) {
        if ((local_248 >> 3 & 1) != 0) {
          puVar3 = local_298;
          goto LAB_00819334;
        }
        uVar4 = 0;
        local_2e0 = (ulong)local_2e0._1_7_ << 8;
        __dest = (void *)((ulong)&local_2e0 | 1);
      }
      else {
        if (local_250 < local_278) {
          local_250 = local_278;
        }
        puVar3 = &uStack_280;
        local_288 = local_250;
LAB_00819334:
        pvVar5 = (void *)*puVar3;
        uVar4 = local_288 - (long)pvVar5;
        if (0xfffffffffffffff7 < uVar4) {
          if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008194bc to 008194bf has its CatchHandler @ 008194f4 */
            FUN_007fe124();
          }
          goto LAB_00819558;
        }
        if (uVar4 < 0x17) {
          __dest = (void *)((ulong)&local_2e0 | 1);
          local_2e0 = CONCAT71(local_2e0._1_7_,(char)((int)uVar4 << 1));
          if (uVar4 == 0) goto LAB_0081939c;
        }
        else {
          uVar1 = 0x1a;
          if ((uVar4 | 7) != 0x17) {
            uVar1 = (uVar4 | 7) + 1;
          }
                    /* try { // try from 00819374 to 0081937b has its CatchHandler @ 008194f4 */
          __dest = operator_new(uVar1);
          local_2e0 = uVar1 | 1;
          local_2d8 = uVar4;
          local_2d0 = __dest;
        }
        memmove(__dest,pvVar5,uVar4);
      }
LAB_0081939c:
      *(undefined1 *)((long)__dest + uVar4) = 0;
      if ((local_2e0 & 1) == 0) {
        uVar4 = local_2e0 >> 1 & 0x7f;
        pvVar5 = (void *)((long)&local_2e0 + 1);
      }
      else {
        uVar4 = local_2d8;
        pvVar5 = local_2d0;
      }
                    /* try { // try from 008193bc to 008193c3 has its CatchHandler @ 008194c8 */
      FUN_008ac34c(param_1,pvVar5,uVar4);
      if ((local_2e0 & 1) != 0) {
        operator_delete(local_2d0,local_2e0 & 0xfffffffffffffffe);
      }
      local_2b0 = (pointer_____offset_0x18___)&PTR_FUN_00c51770;
      appuStack_240[0] = &PTR_FUN_00c51798;
      local_2a8 = &PTR_LAB_00c4e678;
      if ((local_268 & 1) != 0) {
        operator_delete(local_258,CONCAT71(uStack_267,local_268) & 0xfffffffffffffffe);
      }
      local_2a8 = &PTR__basic_streambuf_00c4e728;
      std::__ndk1::locale::~locale(alStack_2a0);
      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream
                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_2b0);
      std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
                ((basic_ios<char,std::__ndk1::char_traits<char>> *)appuStack_240);
    }
    local_1a8 = (pointer_____offset_0x18___)&PTR_FUN_00c51bf0;
    appuStack_f0[0] = &PTR_LAB_00c51c18;
    std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
              ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)local_198);
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::~basic_istream
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1a8);
    std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
              ((basic_ios<char,std::__ndk1::char_traits<char>> *)appuStack_f0);
  }
  if ((local_2c8 & 1) != 0) {
    operator_delete(local_2b8,CONCAT71(uStack_2c7,local_2c8) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return 1;
  }
LAB_00819558:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

