/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00982964
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x00982cbc */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::Http::parseRequest(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >&, int) */

void ix::Http::parseRequest(unique_ptr *param_1,int param_2)

{
  byte bVar1;
  undefined1 uVar2;
  char cVar3;
  long lVar4;
  undefined8 uVar5;
  function *pfVar6;
  bool bVar7;
  function *pfVar8;
  ulong uVar9;
  char *pcVar10;
  char *pcVar11;
  undefined8 *puVar12;
  __shared_weak_count *this;
  basic_string_conflict *extraout_x1;
  basic_string_conflict *pbVar13;
  basic_string_conflict *extraout_x1_00;
  __tree_node_base *p_Var14;
  atomic *in_x2;
  undefined1 *in_x8;
  long lVar15;
  __tree_node *p_Var16;
  undefined8 uVar17;
  undefined8 uVar18;
  code *pcVar19;
  long lVar20;
  int *piVar21;
  __shared_weak_count *p_Var22;
  function *pfVar23;
  __tree_node *p_Var24;
  __tree_node_base *p_Var25;
  char local_260 [8];
  byte local_258;
  char acStack_257 [7];
  ulong local_250;
  char *local_248;
  ulong local_240;
  undefined8 uStack_238;
  void *local_230;
  __tree_node_base *local_228;
  __tree_node_base *local_220;
  long local_218;
  char local_210;
  __tree_node *local_208;
  __tree_node *local_200 [2];
  ulong local_1f0;
  atomic *paStack_1e8;
  function *local_1e0;
  ulong local_1d0;
  atomic *paStack_1c8;
  function *local_1c0;
  ulong local_1b0;
  atomic *paStack_1a8;
  function *local_1a0;
  byte local_198;
  undefined7 uStack_197;
  atomic *paStack_190;
  function *local_188;
  byte local_180;
  undefined7 uStack_17f;
  atomic *paStack_178;
  function *local_170;
  byte local_168;
  undefined7 uStack_167;
  atomic *paStack_160;
  function *local_158;
  ulong local_150;
  atomic *paStack_148;
  function *local_140;
  char local_138;
  byte local_130;
  undefined7 uStack_12f;
  atomic *paStack_128;
  function *local_120;
  undefined1 local_118 [8];
  undefined8 local_110;
  undefined7 uStack_108;
  undefined1 uStack_101;
  char *local_100;
  long *local_f0;
  basic_string_conflict local_e0;
  undefined6 uStack_df;
  undefined1 uStack_d9;
  undefined1 uStack_d8;
  undefined6 uStack_d7;
  undefined1 uStack_d1;
  undefined1 uStack_d0;
  undefined1 uStack_cf;
  undefined6 uStack_ce;
  basic_string_conflict *local_c0;
  long alStack_b0 [4];
  long *local_90;
  
  lVar4 = tpidr_el0;
  lVar15 = *(long *)(lVar4 + 0x28);
  local_118[0] = 0;
                    /* try { // try from 009829a0 to 009829af has its CatchHandler @ 009836ac */
  makeCancellationRequestWithTimeout((ix *)(ulong)(uint)param_2,(int)local_118,in_x2);
  pfVar8 = *(function **)param_1;
                    /* try { // try from 009829b4 to 009829c3 has its CatchHandler @ 009836a4 */
  Socket::readLine(pfVar8);
  pfVar6 = local_120;
  local_150 = 0;
  paStack_148 = (atomic *)0x0;
  local_140 = (function *)0x0;
  if ((local_130 & 1) == 0) {
    local_150 = CONCAT71(uStack_12f,local_130);
    paStack_148 = paStack_128;
    local_140 = local_120;
joined_r0x00982a54:
    pbVar13 = extraout_x1;
    if (local_138 != '\0') goto LAB_009829f0;
LAB_00982a58:
    *in_x8 = 0;
    *(undefined8 *)(in_x8 + 0x10) = 0;
    *(undefined8 *)(in_x8 + 0x18) = 0;
    *(undefined8 *)(in_x8 + 8) = 0;
                    /* try { // try from 00982a64 to 00982a6b has its CatchHandler @ 00983680 */
    pcVar10 = operator_new(0x20);
    this = (__shared_weak_count *)0x0;
    pcVar10[0x1f] = '\0';
    *(undefined8 *)(in_x8 + 0x20) = 0;
    *(undefined8 *)(in_x8 + 0x28) = 0;
    *(undefined8 *)(in_x8 + 0x10) = 0x1f;
    *(undefined8 *)(in_x8 + 8) = 0x21;
    builtin_strncpy(pcVar10,"Error reading HTTP request line",0x1f);
    *(char **)(in_x8 + 0x18) = pcVar10;
  }
  else {
    if ((atomic *)0xffffffffffffffef < paStack_128) {
                    /* try { // try from 009834cc to 009834d3 has its CatchHandler @ 00983670 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (paStack_128 < (atomic *)0x17) {
      pfVar23 = (function *)((ulong)&local_150 | 1);
      local_150 = (ulong)(byte)((int)paStack_128 << 1);
      if (paStack_128 == (atomic *)0x0) {
        *pfVar23 = (function)0x0;
        goto joined_r0x00982a54;
      }
    }
    else {
                    /* try { // try from 00982ae4 to 00982aeb has its CatchHandler @ 00983670 */
      pfVar23 = operator_new((ulong)(paStack_128 + 0x10) & 0xfffffffffffffff0);
      local_150 = (ulong)(paStack_128 + 0x10) & 0xfffffffffffffff0 | 1;
      paStack_148 = paStack_128;
      local_140 = pfVar23;
      pfVar8 = pfVar23;
    }
    in_x2 = paStack_128;
    memcpy(pfVar23,pfVar6,(size_t)paStack_128);
    pfVar23[(long)paStack_128] = (function)0x0;
    pbVar13 = extraout_x1_00;
    if (local_138 == '\0') goto LAB_00982a58;
LAB_009829f0:
                    /* try { // try from 009829f0 to 009829fb has its CatchHandler @ 00983694 */
    parseRequestLine((Http *)&local_150,pbVar13);
    pfVar6 = local_188;
    local_1b0 = 0;
    paStack_1a8 = (atomic *)0x0;
    local_1a0 = (function *)0x0;
    if ((local_198 & 1) == 0) {
      local_1b0 = CONCAT71(uStack_197,local_198);
      local_1a0 = local_188;
      paStack_1a8 = paStack_190;
    }
    else {
      if ((atomic *)0xffffffffffffffef < paStack_190) {
                    /* try { // try from 009834d4 to 009834db has its CatchHandler @ 00983660 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (paStack_190 < (atomic *)0x17) {
        pfVar23 = (function *)((ulong)&local_1b0 | 1);
        local_1b0 = (ulong)(byte)((int)paStack_190 << 1);
        if (paStack_190 != (atomic *)0x0) goto LAB_00982b38;
      }
      else {
                    /* try { // try from 00982b20 to 00982b27 has its CatchHandler @ 00983660 */
        pfVar23 = operator_new((ulong)(paStack_190 + 0x10) & 0xfffffffffffffff0);
        local_1b0 = (ulong)(paStack_190 + 0x10) & 0xfffffffffffffff0 | 1;
        paStack_1a8 = paStack_190;
        local_1a0 = pfVar23;
        pfVar8 = pfVar23;
LAB_00982b38:
        in_x2 = paStack_190;
        memcpy(pfVar23,pfVar6,(size_t)paStack_190);
      }
      pfVar23[(long)paStack_190] = (function)0x0;
    }
    pfVar6 = local_170;
    local_1d0 = 0;
    paStack_1c8 = (atomic *)0x0;
    local_1c0 = (function *)0x0;
    if ((local_180 & 1) == 0) {
      local_1d0 = CONCAT71(uStack_17f,local_180);
      local_1c0 = local_170;
      paStack_1c8 = paStack_178;
    }
    else {
      if ((atomic *)0xffffffffffffffef < paStack_178) {
                    /* try { // try from 009834dc to 009834e3 has its CatchHandler @ 00983650 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (paStack_178 < (atomic *)0x17) {
        pfVar23 = (function *)((ulong)&local_1d0 | 1);
        local_1d0 = (ulong)(byte)((int)paStack_178 << 1);
        if (paStack_178 != (atomic *)0x0) goto LAB_00982bc8;
      }
      else {
                    /* try { // try from 00982bb0 to 00982bb7 has its CatchHandler @ 00983650 */
        pfVar23 = operator_new((ulong)(paStack_178 + 0x10) & 0xfffffffffffffff0);
        local_1d0 = (ulong)(paStack_178 + 0x10) & 0xfffffffffffffff0 | 1;
        paStack_1c8 = paStack_178;
        local_1c0 = pfVar23;
        pfVar8 = pfVar23;
LAB_00982bc8:
        in_x2 = paStack_178;
        memcpy(pfVar23,pfVar6,(size_t)paStack_178);
      }
      pfVar23[(long)paStack_178] = (function)0x0;
    }
    pfVar6 = local_158;
    local_1f0 = 0;
    paStack_1e8 = (atomic *)0x0;
    local_1e0 = (function *)0x0;
    if ((local_168 & 1) == 0) {
      local_1f0 = CONCAT71(uStack_167,local_168);
      local_1e0 = local_158;
      paStack_1e8 = paStack_160;
    }
    else {
      if ((atomic *)0xffffffffffffffef < paStack_160) {
                    /* try { // try from 009834e4 to 009834eb has its CatchHandler @ 009835e0 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (paStack_160 < (atomic *)0x17) {
        pfVar23 = (function *)((ulong)&local_1f0 | 1);
        local_1f0 = (ulong)(byte)((int)paStack_160 << 1);
        if (paStack_160 != (atomic *)0x0) goto LAB_00982c58;
      }
      else {
                    /* try { // try from 00982c40 to 00982c47 has its CatchHandler @ 009835e0 */
        pfVar23 = operator_new((ulong)(paStack_160 + 0x10) & 0xfffffffffffffff0);
        local_1f0 = (ulong)(paStack_160 + 0x10) & 0xfffffffffffffff0 | 1;
        paStack_1e8 = paStack_160;
        local_1e0 = pfVar23;
        pfVar8 = pfVar23;
LAB_00982c58:
        in_x2 = paStack_160;
        memcpy(pfVar23,pfVar6,(size_t)paStack_160);
      }
      pfVar23[(long)paStack_160] = (function)0x0;
    }
                    /* try { // try from 00982c6c to 00982c7f has its CatchHandler @ 00983684 */
    parseHttpHeaders((ix *)param_1,(unique_ptr *)alStack_b0,(function *)in_x2);
    local_220 = (__tree_node_base *)0x0;
    local_218 = 0;
    local_228 = (__tree_node_base *)&local_220;
    p_Var24 = local_208;
joined_r0x00982ca0:
    if (p_Var24 != (__tree_node *)local_200) {
      do {
                    /* try { // try from 00982ca8 to 00982ce7 has its CatchHandler @ 009836dc */
        pfVar8 = (function *)
                 std::__ndk1::
                 __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 ::
                 __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                           ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                             *)pfVar8,(__tree_node_base *)&local_220,&local_110,local_260,
                            p_Var24 + 0x20);
        if (*(long *)pfVar8 == 0) {
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::
          __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                    ((pair *)&local_228);
          p_Var14 = (__tree_node_base *)CONCAT17(uStack_d9,CONCAT61(uStack_df,local_e0));
          *(undefined8 *)p_Var14 = 0;
          *(undefined8 *)(p_Var14 + 8) = 0;
          *(ulong *)(p_Var14 + 0x10) = CONCAT17(local_110._7_1_,(undefined7)local_110);
          *(__tree_node_base **)pfVar8 = p_Var14;
          if (*(__tree_node_base **)local_228 != (__tree_node_base *)0x0) {
            p_Var14 = *(__tree_node_base **)pfVar8;
            local_228 = *(__tree_node_base **)local_228;
          }
          std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                    (local_220,p_Var14);
          local_218 = local_218 + 1;
          p_Var16 = *(__tree_node **)(p_Var24 + 8);
          if (*(__tree_node **)(p_Var24 + 8) != (__tree_node *)0x0) goto LAB_00982d2c;
LAB_00982d3c:
          p_Var16 = p_Var24 + 0x10;
          bVar7 = *(__tree_node **)*(__tree_node **)p_Var16 == p_Var24;
          p_Var24 = *(__tree_node **)p_Var16;
          if (bVar7) goto joined_r0x00982ca0;
          do {
            lVar20 = *(long *)p_Var16;
            p_Var16 = (__tree_node *)(lVar20 + 0x10);
            p_Var24 = *(__tree_node **)p_Var16;
          } while (*(long *)p_Var24 != lVar20);
        }
        else {
          p_Var16 = *(__tree_node **)(p_Var24 + 8);
          if (*(__tree_node **)(p_Var24 + 8) == (__tree_node *)0x0) goto LAB_00982d3c;
LAB_00982d2c:
          do {
            p_Var24 = p_Var16;
            p_Var16 = *(__tree_node **)p_Var24;
          } while (*(__tree_node **)p_Var24 != (__tree_node *)0x0);
        }
        if (p_Var24 == (__tree_node *)local_200) break;
      } while( true );
    }
    if (local_210 == '\0') {
      *in_x8 = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      *(undefined8 *)(in_x8 + 0x18) = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
                    /* try { // try from 00982ea4 to 00982eab has its CatchHandler @ 009835d8 */
      pcVar10 = operator_new(0x20);
      this = (__shared_weak_count *)0x0;
      pcVar10[0x1a] = '\0';
      *(undefined8 *)(in_x8 + 0x20) = 0;
      *(undefined8 *)(in_x8 + 0x28) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0x1a;
      *(undefined8 *)(in_x8 + 8) = 0x21;
      builtin_strncpy(pcVar10,"Error parsing HTTP headers",0x1a);
      *(char **)(in_x8 + 0x18) = pcVar10;
    }
    else {
      local_240 = 0;
      uStack_238 = 0;
      local_230 = (void *)0x0;
      uStack_d0 = 0;
      uStack_cf = 0;
      uStack_ce = 0;
      local_e0 = (basic_string_conflict)0x1c;
      uStack_df = 0x6e65746e6f43;
      uStack_d9 = 0x74;
      uStack_d8 = 0x2d;
      uStack_d7 = 0x6874676e654c;
      uStack_d1 = 0;
      if (local_220 == (__tree_node_base *)0x0) {
LAB_00982e10:
        p_Var14 = (__tree_node_base *)&local_220;
        if (((byte)local_e0 & 1) != 0) goto LAB_00982e1c;
LAB_00982e38:
        if (p_Var14 != (__tree_node_base *)&local_220) goto LAB_00982e40;
LAB_00983178:
        uStack_ce = 0;
        local_e0 = (basic_string_conflict)0x20;
        uStack_d7 = 0x69646f636e45;
        uStack_d1 = 0x6e;
        uStack_d0 = 0x67;
        uStack_df = 0x6e65746e6f43;
        uStack_d9 = 0x74;
        uStack_d8 = 0x2d;
        uStack_cf = 0;
        local_110._0_7_ = SUB87(&local_e0,0);
        local_110._7_1_ = (undefined1)((ulong)&local_e0 >> 0x38);
                    /* try { // try from 009831a4 to 009831bf has its CatchHandler @ 009835c0 */
        lVar20 = std::__ndk1::
                 __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 ::
                 __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                           ((basic_string_conflict *)&local_228,(piecewise_construct_t *)&local_e0,
                            (tuple *)&DAT_00749ccd,(tuple *)&local_110);
        bVar1 = *(byte *)(lVar20 + 0x38);
        bVar7 = false;
        uVar9 = (ulong)(bVar1 >> 1);
        if ((bVar1 & 1) != 0) {
          uVar9 = *(ulong *)(lVar20 + 0x40);
        }
        if (uVar9 == 4) {
          piVar21 = *(int **)(lVar20 + 0x48);
          if ((bVar1 & 1) == 0) {
            piVar21 = (int *)(lVar20 + 0x39);
          }
          bVar7 = *piVar21 == 0x70697a67;
          if (((byte)local_e0 & 1) != 0) goto LAB_0098320c;
LAB_00983224:
          if (bVar7) {
LAB_00983228:
            local_e0 = (basic_string_conflict)0x0;
            uStack_df = 0;
            uStack_d9 = 0;
            uStack_d8 = 0;
            uStack_d7 = 0;
            uStack_d1 = 0;
            uStack_d0 = 0;
            uStack_cf = 0;
            uStack_ce = 0;
                    /* try { // try from 00983230 to 00983267 has its CatchHandler @ 009835bc */
            uVar9 = gzipDecompress((basic_string_conflict *)&local_240,&local_e0);
            if ((uVar9 & 1) == 0) {
              local_110._0_7_ = 0;
              local_110._7_1_ = 0;
              uStack_108 = 0;
              uStack_101 = 0;
              local_100 = (char *)0x0;
                    /* try { // try from 0098345c to 00983463 has its CatchHandler @ 00983528 */
              local_100 = operator_new(0x30);
              uStack_108 = 0x2b;
              uStack_101 = 0;
              local_110._0_7_ = 0x31;
              local_110._7_1_ = 0;
              builtin_strncpy(local_100,"Error during gzip decompression of the body",0x2c);
              *in_x8 = 0;
              *(undefined8 *)(in_x8 + 0x20) = 0;
              *(undefined8 *)(in_x8 + 0x28) = 0;
              *(undefined8 *)(in_x8 + 0x10) = 0x2b;
              *(undefined8 *)(in_x8 + 8) = 0x31;
              *(char **)(in_x8 + 0x18) = local_100;
              if (((byte)local_e0 & 1) != 0) {
                operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
              }
              this = (__shared_weak_count *)0x0;
              goto joined_r0x009834c0;
            }
            uVar9 = (ulong)((byte)local_e0 >> 1);
            pcVar10 = (char *)((ulong)&local_e0 | 1);
            if (((byte)local_e0 & 1) != 0) {
              uVar9 = CONCAT17(uStack_d1,CONCAT61(uStack_d7,uStack_d8));
              pcVar10 = (char *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0));
            }
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                      ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_240,pcVar10,uVar9);
            if (((byte)local_e0 & 1) != 0) {
              operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
            }
          }
        }
        else {
          if (((byte)local_e0 & 1) == 0) goto LAB_00983224;
LAB_0098320c:
          operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
          if (bVar7) goto LAB_00983228;
        }
                    /* try { // try from 00983278 to 0098327f has its CatchHandler @ 009835b8 */
        this = operator_new(0x90);
        *(undefined8 *)(this + 0x10) = 0;
        p_Var22 = this + 8;
        *(long *)p_Var22 = 0;
        *(undefined ***)this = &PTR____shared_ptr_emplace_00c51dd8;
                    /* try { // try from 009832a4 to 009832bf has its CatchHandler @ 00983598 */
        HttpRequest::HttpRequest
                  ((HttpRequest *)(this + 0x18),(basic_string_conflict *)&local_1d0,
                   (basic_string_conflict *)&local_1b0,(basic_string_conflict *)&local_1f0,
                   (basic_string_conflict *)&local_240,(map *)&local_228);
        do {
          cVar3 = '\x01';
          bVar7 = (bool)ExclusiveMonitorPass(p_Var22,0x10);
          if (bVar7) {
            *(long *)p_Var22 = *(long *)p_Var22 + 1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        *(undefined8 *)(in_x8 + 8) = 0;
        *(undefined8 *)(in_x8 + 0x10) = 0;
        *(undefined8 *)(in_x8 + 0x18) = 0;
        *(HttpRequest **)(in_x8 + 0x20) = (HttpRequest *)(this + 0x18);
        *in_x8 = 1;
        *(__shared_weak_count **)(in_x8 + 0x28) = this;
      }
      else {
        p_Var14 = (__tree_node_base *)&local_220;
        p_Var25 = local_220;
        do {
                    /* try { // try from 00982dd0 to 00982ddb has its CatchHandler @ 009836b0 */
          uVar9 = CaseInsensitiveLess::operator()
                            ((CaseInsensitiveLess *)&local_218,
                             (basic_string_conflict *)(p_Var25 + 0x20),&local_e0);
          lVar20 = 8;
          if ((uVar9 & 1) == 0) {
            lVar20 = 0;
            p_Var14 = p_Var25;
          }
          p_Var25 = *(__tree_node_base **)(p_Var25 + lVar20);
        } while (p_Var25 != (__tree_node_base *)0x0);
                    /* try { // try from 00982e00 to 00982e0b has its CatchHandler @ 00983594 */
        if ((p_Var14 == (__tree_node_base *)&local_220) ||
           (uVar9 = CaseInsensitiveLess::operator()
                              ((CaseInsensitiveLess *)&local_218,&local_e0,
                               (basic_string_conflict *)(p_Var14 + 0x20)), (uVar9 & 1) != 0))
        goto LAB_00982e10;
        if (((byte)local_e0 & 1) == 0) goto LAB_00982e38;
LAB_00982e1c:
        operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
        if (p_Var14 == (__tree_node_base *)&local_220) goto LAB_00983178;
LAB_00982e40:
        uStack_d0 = 0;
        uStack_cf = 0;
        uStack_ce = 0;
        local_e0 = (basic_string_conflict)0x1c;
        uStack_df = 0x6e65746e6f43;
        uStack_d9 = 0x74;
        uStack_d8 = 0x2d;
        uStack_d7 = 0x6874676e654c;
        uStack_d1 = 0;
        local_110._0_7_ = SUB87(&local_e0,0);
        local_110._7_1_ = (undefined1)((ulong)&local_e0 >> 0x38);
                    /* try { // try from 00982e60 to 00982e7b has its CatchHandler @ 009835d4 */
        lVar20 = std::__ndk1::
                 __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 ::
                 __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                           ((basic_string_conflict *)&local_228,(piecewise_construct_t *)&local_e0,
                            (tuple *)&DAT_00749ccd,(tuple *)&local_110);
        if ((*(byte *)(lVar20 + 0x38) & 1) == 0) {
          pcVar10 = (char *)(lVar20 + 0x39);
        }
        else {
          pcVar10 = *(char **)(lVar20 + 0x48);
        }
        if (((byte)local_e0 & 1) != 0) {
          operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
        }
        local_e0 = (basic_string_conflict)0x0;
        uStack_df = 0;
        uStack_d9 = 0;
        piVar21 = (int *)__errno();
        *piVar21 = 0;
        lVar20 = strtol(pcVar10,(char **)&local_e0,10);
        if ((((char *)CONCAT17(uStack_d9,CONCAT61(uStack_df,local_e0)) == pcVar10) ||
            (lVar20 + 0x80000000U >> 0x20 != 0)) || (*piVar21 == 0x22)) {
          *in_x8 = 0;
          *(undefined8 *)(in_x8 + 0x10) = 0;
          *(undefined8 *)(in_x8 + 0x18) = 0;
          *(undefined8 *)(in_x8 + 8) = 0;
                    /* try { // try from 00982f98 to 00982f9f has its CatchHandler @ 009835c4 */
          pcVar10 = operator_new(0x30);
          pcVar10[0x2a] = '\0';
          *(undefined8 *)(in_x8 + 0x28) = 0;
          *(undefined8 *)(in_x8 + 0x10) = 0x2a;
          *(undefined8 *)(in_x8 + 8) = 0x31;
          builtin_strncpy(pcVar10,"Error parsing HTTP Header \'Content-Length\'",0x2a);
LAB_00982fd0:
          this = (__shared_weak_count *)0x0;
          *(char **)(in_x8 + 0x18) = pcVar10;
          *(undefined8 *)(in_x8 + 0x20) = 0;
        }
        else {
          if ((int)lVar20 < 0) {
            *in_x8 = 0;
            *(undefined8 *)(in_x8 + 0x10) = 0;
            *(undefined8 *)(in_x8 + 0x18) = 0;
            *(undefined8 *)(in_x8 + 8) = 0;
                    /* try { // try from 00982fec to 00982ff3 has its CatchHandler @ 00983510 */
            pcVar10 = operator_new(0x40);
            *(undefined8 *)(in_x8 + 0x10) = 0x34;
            *(undefined8 *)(in_x8 + 8) = 0x41;
            builtin_strncpy(pcVar10 + 0x10,"Length\' should be a positive integer",0x25);
            *(undefined8 *)(in_x8 + 0x28) = 0;
            builtin_strncpy(pcVar10,"Error: \'Content-",0x10);
            goto LAB_00982fd0;
          }
          local_c0 = (basic_string_conflict *)0x0;
          local_f0 = (long *)0x0;
                    /* try { // try from 00982f54 to 00982f6f has its CatchHandler @ 0098352c */
          Socket::readBytes(*(ulong *)param_1,(function *)(long)(int)lVar20,(function *)&local_e0,
                            (function *)&local_110);
          if (&local_110 == local_f0) {
            pcVar19 = *(code **)(*local_f0 + 0x20);
LAB_0098303c:
            (*pcVar19)();
          }
          else if (local_f0 != (long *)0x0) {
            pcVar19 = *(code **)(*local_f0 + 0x28);
            goto LAB_0098303c;
          }
          if (&local_e0 == local_c0) {
            pcVar19 = *(code **)(*(long *)local_c0 + 0x20);
LAB_00983068:
            (*pcVar19)();
          }
          else if (local_c0 != (basic_string_conflict *)0x0) {
            pcVar19 = *(code **)(*(long *)local_c0 + 0x28);
            goto LAB_00983068;
          }
          if (local_260[0] == '\0') {
            local_e0 = (basic_string_conflict)0x0;
            uStack_df = 0;
            uStack_d9 = 0;
            uStack_d8 = 0;
            uStack_d7 = 0;
            uStack_d1 = 0;
            uStack_d0 = 0;
            uStack_cf = 0;
            uStack_ce = 0;
                    /* try { // try from 009830ac to 009830b3 has its CatchHandler @ 0098350c */
            pcVar11 = operator_new(0x20);
            uStack_d8 = 0x17;
            uStack_d7 = 0;
            uStack_d1 = 0;
            local_e0 = (basic_string_conflict)0x21;
            uStack_df = 0;
            uStack_d9 = 0;
            builtin_strncpy(pcVar11 + 0xf,"equest: ",8);
            bVar7 = (local_258 & 1) != 0;
            pcVar10 = acStack_257;
            if (bVar7) {
              pcVar10 = local_248;
            }
            uStack_d0 = SUB81(pcVar11,0);
            uStack_cf = (undefined1)((ulong)pcVar11 >> 8);
            uStack_ce = (undefined6)((ulong)pcVar11 >> 0x10);
            pcVar11[0x17] = '\0';
            builtin_strncpy(pcVar11,"Error reading re",0x10);
            uVar9 = (ulong)(local_258 >> 1);
            if (bVar7) {
              uVar9 = local_250;
            }
                    /* try { // try from 00983100 to 00983107 has its CatchHandler @ 009834ec */
            puVar12 = (undefined8 *)
                      std::__ndk1::
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                *)&local_e0,pcVar10,uVar9);
            uVar2 = *(undefined1 *)puVar12;
            uStack_108 = (undefined7)((ulong)puVar12[1] >> 8);
            uVar17 = *(undefined8 *)((long)puVar12 + 1);
            local_110._7_1_ = (undefined1)((ulong)uVar17 >> 0x38);
            *puVar12 = 0;
            puVar12[1] = 0;
            uVar18 = puVar12[2];
            puVar12[2] = 0;
            in_x8[8] = uVar2;
            uVar5 = CONCAT71(uStack_108,local_110._7_1_);
            *in_x8 = 0;
            uStack_108 = 0;
            local_110._0_7_ = 0;
            local_110._7_1_ = 0;
            *(undefined8 *)(in_x8 + 0x10) = uVar5;
            *(undefined8 *)(in_x8 + 0x18) = uVar18;
            *(undefined8 *)(in_x8 + 9) = uVar17;
            *(undefined8 *)(in_x8 + 0x20) = 0;
            *(undefined8 *)(in_x8 + 0x28) = 0;
            if (((byte)local_e0 & 1) != 0) {
              operator_delete((void *)CONCAT62(uStack_ce,CONCAT11(uStack_cf,uStack_d0)));
            }
            bVar7 = true;
          }
          else {
            uVar9 = (ulong)(local_258 >> 1);
            pcVar10 = acStack_257;
            if ((local_258 & 1) != 0) {
              uVar9 = local_250;
              pcVar10 = local_248;
            }
                    /* try { // try from 00983094 to 0098309b has its CatchHandler @ 00983514 */
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                      ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_240,pcVar10,uVar9);
            bVar7 = false;
          }
          if ((local_258 & 1) != 0) {
            operator_delete(local_248);
          }
          this = (__shared_weak_count *)0x0;
          if (!bVar7) goto LAB_00983178;
        }
      }
joined_r0x009834c0:
      if ((local_240 & 1) != 0) {
        operator_delete(local_230);
      }
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&local_228,(__tree_node *)local_220);
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&local_208,local_200[0]);
    if ((local_1f0 & 1) != 0) {
      operator_delete(local_1e0);
    }
    if ((local_1d0 & 1) != 0) {
      operator_delete(local_1c0);
    }
    if ((local_1b0 & 1) != 0) {
      operator_delete(local_1a0);
    }
    if ((local_168 & 1) != 0) {
      operator_delete(local_158);
    }
    if ((local_180 & 1) != 0) {
      operator_delete(local_170);
    }
    if ((local_198 & 1) != 0) {
      operator_delete(local_188);
    }
  }
  if ((local_150 & 1) != 0) {
    operator_delete(local_140);
  }
  if ((local_130 & 1) != 0) {
    operator_delete(local_120);
  }
  if (alStack_b0 == local_90) {
    pcVar19 = *(code **)(*local_90 + 0x20);
  }
  else {
    if (local_90 == (long *)0x0) goto LAB_0098338c;
    pcVar19 = *(code **)(*local_90 + 0x28);
  }
  (*pcVar19)();
LAB_0098338c:
  if (this != (__shared_weak_count *)0x0) {
    p_Var22 = this + 8;
    do {
      lVar20 = *(long *)p_Var22;
      cVar3 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(p_Var22,0x10);
      if (bVar7) {
        *(long *)p_Var22 = lVar20 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar20 == 0) {
      (**(code **)(*(long *)this + 0x10))(this);
      std::__ndk1::__shared_weak_count::__release_weak(this);
    }
  }
  if (*(long *)(lVar4 + 0x28) != lVar15) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

