/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099e3e4
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x0099f688 */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocketHandshake::serverHandshake(int, bool, std::__ndk1::shared_ptr<ix::HttpRequest>) */

void ix::WebSocketHandshake::serverHandshake
               (WebSocketInitResult *param_1,undefined8 *param_2,ulong param_3,atomic *param_4,
               long *param_5)

{
  long *plVar1;
  byte *pbVar2;
  byte bVar3;
  long lVar4;
  basic_string_conflict bVar5;
  tuple tVar6;
  undefined1 uVar7;
  bool bVar8;
  int iVar9;
  int iVar10;
  uint uVar11;
  ulong uVar12;
  char *pcVar13;
  basic_ostream *pbVar14;
  size_t __n;
  undefined8 *puVar15;
  char *__dest;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *p_Var16;
  basic_string_conflict *extraout_x1;
  basic_string_conflict *extraout_x1_00;
  __tree_node_base *p_Var17;
  uint uVar18;
  basic_string_conflict *pbVar19;
  ulong *puVar20;
  code *pcVar21;
  long lVar22;
  undefined8 uVar23;
  long lVar24;
  void *pvVar25;
  Socket *this;
  ulong uVar26;
  void *pvVar27;
  __tree_node *p_Var28;
  __tree_node *p_Var29;
  __tree_node *p_Var30;
  void *pvVar31;
  __tree_node_base *local_320;
  __tree_node_base *local_318;
  long local_310;
  __tree_node **local_308;
  __tree_node *local_300;
  undefined8 uStack_2f8;
  Http *local_2f0;
  undefined8 uStack_2e8;
  void *local_2e0;
  __tree_node **pp_Stack_2d8;
  __tree_node *local_2d0;
  undefined8 uStack_2c8;
  Http *local_2c0;
  ulong uStack_2b8;
  void *local_2b0;
  WebSocketPerMessageDeflateOptions aWStack_2a8 [8];
  Http *local_2a0;
  ulong uStack_298;
  void *local_290;
  __tree_node *local_280;
  __tree_node *local_278;
  undefined8 local_270;
  ulong local_268;
  ulong local_260;
  long *local_258;
  ulong local_250;
  undefined8 uStack_248;
  void *local_240;
  ulong local_238;
  ulong local_230;
  void *local_228;
  undefined1 auStack_220 [8];
  undefined8 local_218;
  basic_string_conflict local_210;
  undefined7 uStack_20f;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  _Stack_208;
  undefined5 uStack_207;
  undefined1 uStack_202;
  undefined1 uStack_201;
  basic_ostream bStack_200;
  undefined2 uStack_1ff;
  undefined4 uStack_1fd;
  undefined1 uStack_1f9;
  undefined8 uStack_1f8;
  ulong local_1f0;
  char *local_1e8;
  undefined8 uStack_1e0;
  atomic *local_1d8;
  char *pcStack_1d0;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  ulong local_1b8;
  undefined8 uStack_1b0;
  void *local_1a8;
  undefined8 uStack_1a0;
  undefined4 local_198;
  undefined **local_190 [17];
  undefined8 local_108;
  undefined4 local_100;
  Http local_f0;
  undefined7 uStack_ef;
  undefined1 uStack_e8;
  undefined7 uStack_e7;
  char *local_e0;
  tuple local_d0;
  undefined7 uStack_cf;
  Http HStack_c8;
  undefined2 uStack_c7;
  undefined3 uStack_c5;
  undefined2 uStack_c2;
  undefined1 uStack_c0;
  undefined4 uStack_bf;
  undefined1 uStack_bb;
  undefined1 uStack_ba;
  undefined1 uStack_b9;
  undefined5 uStack_b8;
  undefined3 uStack_b3;
  function afStack_b0 [32];
  function *local_90;
  
  lVar4 = tpidr_el0;
  lVar24 = *(long *)(lVar4 + 0x28);
  uVar18 = (uint)param_4;
  *(undefined1 *)*param_2 = 0;
  makeCancellationRequestWithTimeout((ix *)(param_3 & 0xffffffff),(int)*param_2,param_4);
  local_238 = 0;
  local_230 = 0;
  local_228 = (void *)0x0;
  local_250 = 0;
  uStack_248 = 0;
  local_240 = (void *)0x0;
  local_268 = 0;
  local_260 = 0;
  local_258 = (long *)0x0;
  puVar20 = (ulong *)*param_5;
  iVar9 = (int)param_2;
  if (puVar20 == (ulong *)0x0) {
                    /* try { // try from 0099e4fc to 0099e50b has its CatchHandler @ 0099fc34 */
    Socket::readLine(*(function **)param_2[1]);
    uVar7 = uStack_c0;
    tVar6 = local_d0;
    local_f0 = (Http)0x0;
    uStack_ef = 0;
    uStack_e8 = 0;
    uStack_e7 = 0;
    local_e0 = (char *)0x0;
    pbVar19 = extraout_x1;
    if (((byte)HStack_c8 & 1) == 0) {
      local_e0 = (char *)CONCAT35(uStack_b3,uStack_b8);
      uStack_e7 = (undefined7)
                  (CONCAT17(uStack_b9,
                            CONCAT16(uStack_ba,CONCAT15(uStack_bb,CONCAT41(uStack_bf,uStack_c0))))
                  >> 8);
      uStack_ef = (undefined7)
                  (CONCAT26(uStack_c2,CONCAT33(uStack_c5,CONCAT21(uStack_c7,HStack_c8))) >> 8);
      local_f0 = HStack_c8;
      uStack_e8 = uStack_c0;
    }
    else {
      uVar12 = CONCAT17(uStack_b9,
                        CONCAT16(uStack_ba,CONCAT15(uStack_bb,CONCAT41(uStack_bf,uStack_c0))));
      if (0xffffffffffffffef < uVar12) {
                    /* try { // try from 0099f930 to 0099f937 has its CatchHandler @ 0099fbf8 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      pvVar25 = (void *)CONCAT35(uStack_b3,uStack_b8);
      if (uVar12 < 0x17) {
        pcVar13 = (char *)((ulong)&local_f0 | 1);
        local_f0 = SUB41((int)CONCAT41(uStack_bf,uStack_c0) << 1,0);
        if (uVar12 == 0) {
          *pcVar13 = '\0';
          goto joined_r0x0099e870;
        }
      }
      else {
        uVar26 = uVar12 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099e844 to 0099e84b has its CatchHandler @ 0099fbf8 */
        pcVar13 = operator_new(uVar26);
        local_f0 = (Http)((byte)uVar26 | 1);
        uStack_e8 = uVar7;
        uStack_e7 = (undefined7)(uVar12 >> 8);
        uStack_ef = (undefined7)(uVar26 >> 8);
        local_e0 = pcVar13;
      }
      memcpy(pcVar13,pvVar25,uVar12);
      pcVar13[uVar12] = '\0';
      pbVar19 = extraout_x1_00;
    }
joined_r0x0099e870:
    if (tVar6 != (tuple)0x0) {
                    /* try { // try from 0099e538 to 0099e547 has its CatchHandler @ 0099fc24 */
      Http::parseRequestLine(&local_f0,pbVar19);
      uVar12 = (ulong)((byte)local_210 >> 1);
      pcVar13 = (char *)((ulong)&local_210 | 1);
      if (((byte)local_210 & 1) != 0) {
        uVar12 = CONCAT17(uStack_201,CONCAT16(uStack_202,CONCAT51(uStack_207,_Stack_208)));
        pcVar13 = (char *)CONCAT17(uStack_1f9,CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200)));
      }
                    /* try { // try from 0099e564 to 0099e5b7 has its CatchHandler @ 0099fc50 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_238,pcVar13,uVar12);
      uVar12 = (ulong)uStack_1f8 >> 1 & 0x7f;
      pcVar13 = (char *)((long)&uStack_1f8 + 1);
      if (((ulong)uStack_1f8 & 1) != 0) {
        uVar12 = local_1f0;
        pcVar13 = local_1e8;
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_250,pcVar13,uVar12);
      param_4 = (atomic *)(uStack_1e0 >> 1 & 0x7f);
      pcVar13 = (char *)((long)&uStack_1e0 + 1);
      if ((uStack_1e0 & 1) != 0) {
        param_4 = local_1d8;
        pcVar13 = pcStack_1d0;
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_268,pcVar13,(ulong)param_4);
      if ((uStack_1e0 & 1) != 0) {
        operator_delete(pcStack_1d0);
      }
      if (((ulong)uStack_1f8 & 1) != 0) {
        operator_delete(local_1e8);
      }
      if (((byte)local_210 & 1) != 0) {
        operator_delete((void *)CONCAT17(uStack_1f9,
                                         CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200))));
      }
      if (((byte)local_f0 & 1) != 0) {
        operator_delete(local_e0);
      }
      if (((byte)HStack_c8 & 1) != 0) {
        operator_delete((void *)CONCAT35(uStack_b3,uStack_b8));
      }
      goto LAB_0099e5e8;
    }
    local_210 = (basic_string_conflict)0x0;
    uStack_20f = 0;
    _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                  )0x0;
    uStack_207 = 0;
    uStack_202 = 0;
    uStack_201 = 0;
    bStack_200 = (basic_ostream)0x0;
    uStack_1ff = 0;
    uStack_1fd = 0;
    uStack_1f9 = 0;
                    /* try { // try from 0099e71c to 0099e723 has its CatchHandler @ 0099fc20 */
    pcVar13 = operator_new(0x20);
    bStack_200 = SUB81(pcVar13,0);
    uStack_1ff = (undefined2)((ulong)pcVar13 >> 8);
    uStack_1fd = (undefined4)((ulong)pcVar13 >> 0x18);
    uStack_1f9 = (undefined1)((ulong)pcVar13 >> 0x38);
    _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                  )0x1f;
    uStack_207 = 0;
    uStack_202 = 0;
    uStack_201 = 0;
    local_210 = (basic_string_conflict)0x21;
    uStack_20f = 0;
    builtin_strncpy(pcVar13,"Error reading HTTP request line",0x20);
                    /* try { // try from 0099e750 to 0099e763 has its CatchHandler @ 0099fc10 */
    sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
    if (((byte)local_210 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1f9,
                                       CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200))));
    }
    if (((byte)local_f0 & 1) != 0) {
      operator_delete(local_e0);
    }
    if (((byte)HStack_c8 & 1) != 0) {
      operator_delete((void *)CONCAT35(uStack_b3,uStack_b8));
    }
  }
  else {
    if (&local_238 != puVar20 + 3) {
      param_4 = (atomic *)puVar20[4];
      pbVar2 = (byte *)puVar20[5];
      if (((byte)puVar20[3] & 1) == 0) {
        pbVar2 = (byte *)((long)puVar20 + 0x19);
        param_4 = (atomic *)(ulong)(byte)((byte)puVar20[3] >> 1);
      }
                    /* try { // try from 0099e484 to 0099e4ef has its CatchHandler @ 0099fcc4 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_238,(char *)pbVar2,(ulong)param_4);
      puVar20 = (ulong *)*param_5;
    }
    if (&local_250 != puVar20) {
      param_4 = (atomic *)puVar20[1];
      pbVar2 = (byte *)puVar20[2];
      if (((byte)*puVar20 & 1) == 0) {
        pbVar2 = (byte *)((long)puVar20 + 1);
        param_4 = (atomic *)(ulong)(byte)((byte)*puVar20 >> 1);
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_250,(char *)pbVar2,(ulong)param_4);
      puVar20 = (ulong *)*param_5;
    }
    if (&local_268 != puVar20 + 6) {
      param_4 = (atomic *)puVar20[7];
      pbVar2 = (byte *)puVar20[8];
      if (((byte)puVar20[6] & 1) == 0) {
        pbVar2 = (byte *)((long)puVar20 + 0x31);
        param_4 = (atomic *)(ulong)(byte)((byte)puVar20[6] >> 1);
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_268,(char *)pbVar2,(ulong)param_4);
    }
LAB_0099e5e8:
    uVar12 = local_238 >> 1 & 0x7f;
    if ((local_238 & 1) != 0) {
      uVar12 = local_230;
    }
    if (uVar12 == 3) {
      pvVar25 = (void *)((ulong)&local_238 | 1);
      if ((local_238 & 1) != 0) {
        pvVar25 = local_228;
      }
      param_4 = (atomic *)0x3;
      iVar10 = memcmp(pvVar25,&DAT_002d7152,3);
      if (iVar10 != 0) goto LAB_0099e62c;
      uVar12 = local_268 >> 1 & 0x7f;
      if ((local_268 & 1) != 0) {
        uVar12 = local_260;
      }
      if (uVar12 == 8) {
        plVar1 = (long *)((ulong)&local_268 | 1);
        if ((local_268 & 1) != 0) {
          plVar1 = local_258;
        }
        if (*plVar1 == 0x312e312f50545448) {
          local_278 = (__tree_node *)0x0;
          local_270 = 0;
          lVar22 = *param_5;
          local_280 = (__tree_node *)&local_278;
          if (lVar22 == 0) {
                    /* try { // try from 0099e908 to 0099e917 has its CatchHandler @ 0099fbec */
            parseHttpHeaders((ix *)param_2[1],afStack_b0,(function *)param_4);
            bVar5 = local_210;
                    /* try { // try from 0099e924 to 0099e92b has its CatchHandler @ 0099fbd4 */
            std::__ndk1::
            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::
            __assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>>
                      ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                        *)&local_280,
                       CONCAT17(uStack_201,CONCAT16(uStack_202,CONCAT51(uStack_207,_Stack_208))),
                       &bStack_200);
            if (bVar5 != (basic_string_conflict)0x0) {
              std::__ndk1::
              __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
              ::destroy(&_Stack_208,
                        (__tree_node *)
                        CONCAT17(uStack_1f9,CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200))));
              goto LAB_0099e940;
            }
            local_d0 = (tuple)0x0;
            uStack_cf = 0;
            HStack_c8 = (Http)0x0;
            uStack_c7 = 0;
            uStack_c5 = 0;
            uStack_c2 = 0;
            uStack_c0 = 0;
            uStack_bf = 0;
            uStack_bb = 0;
            uStack_ba = 0;
            uStack_b9 = 0;
                    /* try { // try from 0099ed10 to 0099ed17 has its CatchHandler @ 0099fb80 */
            pcVar13 = operator_new(0x20);
            uStack_c0 = SUB81(pcVar13,0);
            uStack_bf = (undefined4)((ulong)pcVar13 >> 8);
            uStack_bb = (undefined1)((ulong)pcVar13 >> 0x28);
            uStack_ba = (undefined1)((ulong)pcVar13 >> 0x30);
            uStack_b9 = (undefined1)((ulong)pcVar13 >> 0x38);
            HStack_c8 = (Http)0x1a;
            uStack_c7 = 0;
            uStack_c5 = 0;
            uStack_c2 = 0;
            local_d0 = (tuple)0x21;
            uStack_cf = 0;
            builtin_strncpy(pcVar13,"Error parsing HTTP headers",0x1b);
                    /* try { // try from 0099ed44 to 0099ed57 has its CatchHandler @ 0099fb68 */
            sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
            if (((byte)local_d0 & 1) != 0) {
              operator_delete((void *)CONCAT17(uStack_b9,
                                               CONCAT16(uStack_ba,
                                                        CONCAT15(uStack_bb,
                                                                 CONCAT41(uStack_bf,uStack_c0)))));
            }
            std::__ndk1::
            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::destroy(&_Stack_208,
                      (__tree_node *)
                      CONCAT17(uStack_1f9,CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200))));
          }
          else {
            if (&local_280 != (__tree_node **)(lVar22 + 0x60)) {
                    /* try { // try from 0099e8f8 to 0099e8ff has its CatchHandler @ 0099fbf0 */
              std::__ndk1::
              __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
              ::
              __assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>>
                        ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                          *)&local_280,*(undefined8 *)(lVar22 + 0x60),lVar22 + 0x68);
            }
LAB_0099e940:
            uStack_1fd = 0;
            uStack_1f9 = 0;
            local_210 = (basic_string_conflict)0x22;
            uStack_207 = 0x74656b636f;
            uStack_202 = 0x2d;
            uStack_201 = 0x6b;
            bStack_200 = (basic_ostream)0x65;
            uStack_20f = 0x6265772d636573;
            _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                          )0x73;
            uStack_1ff = 0x79;
            if (local_278 == (__tree_node *)0x0) {
LAB_0099e9c8:
              p_Var30 = (__tree_node *)&local_278;
              if (((byte)local_210 & 1) != 0) goto LAB_0099e9d4;
LAB_0099ea40:
              if (p_Var30 == (__tree_node *)&local_278) goto LAB_0099e9e4;
LAB_0099ea48:
              uStack_207 = 0;
              uStack_202 = 0;
              uStack_201 = 0;
              local_210 = (basic_string_conflict)0xe;
              bStack_200 = (basic_ostream)0x0;
              uStack_1ff = 0;
              uStack_1fd = 0;
              uStack_1f9 = 0;
              uStack_20f = 0x65646172677075;
              _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                            )0x0;
              p_Var30 = (__tree_node *)&local_278;
              if (local_278 != (__tree_node *)0x0) {
                p_Var28 = (__tree_node *)&local_278;
                p_Var29 = local_278;
                do {
                    /* try { // try from 0099ea88 to 0099ea93 has its CatchHandler @ 0099fd8c */
                  uVar12 = CaseInsensitiveLess::operator()
                                     ((CaseInsensitiveLess *)&local_270,
                                      (basic_string_conflict *)(p_Var29 + 0x20),&local_210);
                  lVar22 = 8;
                  if ((uVar12 & 1) == 0) {
                    lVar22 = 0;
                    p_Var28 = p_Var29;
                  }
                  p_Var29 = *(__tree_node **)(p_Var29 + lVar22);
                } while (p_Var29 != (__tree_node *)0x0);
                    /* try { // try from 0099eab4 to 0099eabf has its CatchHandler @ 0099fb04 */
                if ((p_Var28 != (__tree_node *)&local_278) &&
                   (uVar12 = CaseInsensitiveLess::operator()
                                       ((CaseInsensitiveLess *)&local_270,&local_210,
                                        (basic_string_conflict *)(p_Var28 + 0x20)),
                   (uVar12 & 1) == 0)) {
                  p_Var30 = p_Var28;
                }
              }
              if (((byte)local_210 & 1) != 0) {
                operator_delete((void *)CONCAT17(uStack_1f9,
                                                 CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200)
                                                         )));
              }
              if (p_Var30 != (__tree_node *)&local_278) {
                uStack_207 = 0;
                uStack_202 = 0;
                uStack_201 = 0;
                bStack_200 = (basic_ostream)0x0;
                uStack_1ff = 0;
                uStack_1fd = 0;
                uStack_1f9 = 0;
                local_210 = (basic_string_conflict)0xe;
                uStack_20f = 0x65646172677075;
                _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                              )0x0;
                local_d0 = SUB81(&local_210,0);
                uStack_cf = (undefined7)((ulong)&local_210 >> 8);
                    /* try { // try from 0099eb68 to 0099eb83 has its CatchHandler @ 0099fbb8 */
                lVar22 = std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                   ((basic_string_conflict *)&local_280,
                                    (piecewise_construct_t *)&local_210,(tuple *)&DAT_0074aba8,
                                    &local_d0);
                uStack_c5 = 0;
                uStack_c2 = 0;
                local_d0 = (tuple)0x12;
                uStack_c0 = 0;
                uStack_bf = 0;
                uStack_bb = 0;
                uStack_ba = 0;
                uStack_b9 = 0;
                uStack_c7 = 0x74;
                uStack_cf = 0x6b636f53626557;
                HStack_c8 = (Http)0x65;
                    /* try { // try from 0099ebb4 to 0099ebbb has its CatchHandler @ 0099fb98 */
                uVar12 = CaseInsensitiveLess::cmp
                                   ((basic_string_conflict *)(lVar22 + 0x38),
                                    (basic_string_conflict *)&local_d0);
                bVar8 = false;
                if ((uVar12 & 1) != 0) {
                  local_2a0 = &local_f0;
                  uStack_e7 = 0;
                  local_e0 = (char *)0x0;
                  local_f0 = (Http)0xe;
                  uStack_ef = 0x65646172677055;
                  uStack_e8 = 0;
                    /* try { // try from 0099ebf0 to 0099ec0b has its CatchHandler @ 0099fb28 */
                  lVar22 = std::__ndk1::
                           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           ::
                           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                     ((basic_string_conflict *)&local_280,
                                      (piecewise_construct_t *)&local_f0,(tuple *)&DAT_0074aba8,
                                      (tuple *)&local_2a0);
                  bVar3 = *(byte *)(lVar22 + 0x38);
                  uVar12 = (ulong)(bVar3 >> 1);
                  if ((bVar3 & 1) != 0) {
                    uVar12 = *(ulong *)(lVar22 + 0x40);
                  }
                  if (uVar12 == 0x13) {
                    pvVar25 = *(void **)(lVar22 + 0x48);
                    if ((bVar3 & 1) == 0) {
                      pvVar25 = (void *)(lVar22 + 0x39);
                    }
                    iVar10 = memcmp(pvVar25,"keep-alive, Upgrade",0x13);
                    bVar8 = iVar10 != 0;
                  }
                  else {
                    bVar8 = true;
                  }
                  if (((byte)local_f0 & 1) != 0) {
                    operator_delete(local_e0);
                  }
                }
                if (((byte)local_d0 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_b9,
                                                   CONCAT16(uStack_ba,
                                                            CONCAT15(uStack_bb,
                                                                     CONCAT41(uStack_bf,uStack_c0)))
                                                  ));
                }
                p_Var30 = local_278;
                if (((byte)local_210 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_1f9,
                                                   CONCAT43(uStack_1fd,
                                                            CONCAT21(uStack_1ff,bStack_200))));
                  p_Var30 = local_278;
                }
                local_278 = p_Var30;
                if (bVar8) {
                  uStack_c7 = 0;
                  uStack_c5 = 0;
                  uStack_c2 = 0;
                  uStack_c0 = 0;
                  uStack_bf = 0;
                  uStack_bb = 0;
                  uStack_ba = 0;
                  uStack_b9 = 0;
                  local_d0 = (tuple)0xe;
                  uStack_cf = 0x65646172677075;
                  HStack_c8 = (Http)0x0;
                  local_f0 = SUB81(&local_d0,0);
                  uStack_ef = (undefined7)((ulong)&local_d0 >> 8);
                    /* try { // try from 0099eca0 to 0099eccf has its CatchHandler @ 0099fb84 */
                  pbVar19 = (basic_string_conflict *)&DAT_0074aba8;
                  lVar22 = std::__ndk1::
                           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           ::
                           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                     ((basic_string_conflict *)&local_280,
                                      (piecewise_construct_t *)&local_d0,(tuple *)&DAT_0074aba8,
                                      (tuple *)&local_f0);
                  std::__ndk1::operator+
                            ((__ndk1 *)"Invalid Upgrade header, need WebSocket, got ",
                             (char *)(lVar22 + 0x38),pbVar19);
                    /* try { // try from 0099ecd0 to 0099ece3 has its CatchHandler @ 0099fb08 */
                  sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
                  if (((byte)local_210 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_1f9,
                                                     CONCAT43(uStack_1fd,
                                                              CONCAT21(uStack_1ff,bStack_200))));
                  }
                  if (((byte)local_d0 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_b9,
                                                     CONCAT16(uStack_ba,
                                                              CONCAT15(uStack_bb,
                                                                       CONCAT41(uStack_bf,uStack_c0)
                                                                      ))));
                  }
                  goto LAB_0099ed78;
                }
                uStack_1f9 = 0;
                local_210 = (basic_string_conflict)0x2a;
                uStack_207 = 0x74656b636f;
                uStack_20f = 0x6265772d636573;
                _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                              )0x73;
                uStack_202 = 0x2d;
                uStack_201 = 0x76;
                bStack_200 = (basic_ostream)0x65;
                uStack_1ff = 0x7372;
                uStack_1fd = 0x6e6f69;
                p_Var28 = (__tree_node *)&local_278;
                if (p_Var30 != (__tree_node *)0x0) {
                  p_Var29 = (__tree_node *)&local_278;
                  do {
                    /* try { // try from 0099edfc to 0099ee07 has its CatchHandler @ 0099fd88 */
                    uVar12 = CaseInsensitiveLess::operator()
                                       ((CaseInsensitiveLess *)&local_270,
                                        (basic_string_conflict *)(p_Var30 + 0x20),&local_210);
                    lVar22 = 8;
                    if ((uVar12 & 1) == 0) {
                      lVar22 = 0;
                      p_Var29 = p_Var30;
                    }
                    p_Var30 = *(__tree_node **)(p_Var30 + lVar22);
                  } while (p_Var30 != (__tree_node *)0x0);
                    /* try { // try from 0099ee28 to 0099ee33 has its CatchHandler @ 0099f9d0 */
                  if ((p_Var29 != (__tree_node *)&local_278) &&
                     (uVar12 = CaseInsensitiveLess::operator()
                                         ((CaseInsensitiveLess *)&local_270,&local_210,
                                          (basic_string_conflict *)(p_Var29 + 0x20)),
                     (uVar12 & 1) == 0)) {
                    p_Var28 = p_Var29;
                  }
                }
                if (((byte)local_210 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_1f9,
                                                   CONCAT43(uStack_1fd,
                                                            CONCAT21(uStack_1ff,bStack_200))));
                }
                if (p_Var28 == (__tree_node *)&local_278) {
                  local_210 = (basic_string_conflict)0x0;
                  uStack_20f = 0;
                  _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                )0x0;
                  uStack_207 = 0;
                  uStack_202 = 0;
                  uStack_201 = 0;
                  bStack_200 = (basic_ostream)0x0;
                  uStack_1ff = 0;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                    /* try { // try from 0099ee5c to 0099ee63 has its CatchHandler @ 0099fa48 */
                  pcVar13 = operator_new(0x30);
                  bStack_200 = SUB81(pcVar13,0);
                  uStack_1ff = (undefined2)((ulong)pcVar13 >> 8);
                  uStack_1fd = (undefined4)((ulong)pcVar13 >> 0x18);
                  uStack_1f9 = (undefined1)((ulong)pcVar13 >> 0x38);
                  builtin_strncpy(pcVar13,"Missing Sec-WebSocket-Version value",0x24);
                  _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                )0x23;
                  uStack_207 = 0;
                  uStack_202 = 0;
                  uStack_201 = 0;
                  local_210 = (basic_string_conflict)0x31;
                  uStack_20f = 0;
                    /* try { // try from 0099ee98 to 0099eeab has its CatchHandler @ 0099fa44 */
                  sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
                  goto LAB_0099eb18;
                }
                bStack_200 = (basic_ostream)0x8;
                uStack_1ff = 0xc4e5;
                uStack_1fd = 0;
                uStack_1f9 = 0;
                local_190[0] = &PTR__basic_istream_00c4e640;
                _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                              )0x0;
                uStack_207 = 0;
                uStack_202 = 0;
                uStack_201 = 0;
                local_210 = (basic_string_conflict)0x18;
                uStack_20f = 0xc4e6;
                    /* try { // try from 0099eefc to 0099ef07 has its CatchHandler @ 0099fa74 */
                std::__ndk1::ios_base::init((ios_base *)local_190,&uStack_1f8);
                local_108 = 0;
                local_100 = 0xffffffff;
                local_210 = (basic_string_conflict)0xe0;
                uStack_20f = 0xc4e4;
                local_190[0] = &PTR_FUN_00c4e530;
                uStack_1f8 = &PTR__basic_streambuf_00c4e728;
                bStack_200 = (basic_ostream)0x8;
                uStack_1ff = 0xc4e5;
                uStack_1fd = 0;
                uStack_1f9 = 0;
                std::__ndk1::locale::locale((locale *)&local_1f0);
                uStack_1c0 = 0;
                local_1c8 = 0;
                pcStack_1d0 = (char *)0x0;
                local_1d8 = (atomic *)0x0;
                uStack_1e0 = 0;
                local_1e8 = (char *)0x0;
                local_d0 = (tuple)0x2a;
                uStack_1f8 = &PTR_LAB_00c4e678;
                uStack_b9 = 0;
                uStack_c7 = 0x636f;
                uStack_c5 = 0x74656b;
                uStack_cf = 0x6265772d636573;
                HStack_c8 = (Http)0x73;
                uStack_c2 = 0x762d;
                uStack_c0 = 0x65;
                uStack_bf = 0x6f697372;
                uStack_bb = 0x6e;
                uStack_ba = 0;
                uStack_1a0 = 0;
                local_1a8 = (void *)0x0;
                uStack_1b0 = 0;
                local_1b8 = 0;
                local_198 = 0x18;
                local_f0 = SUB81(&local_d0,0);
                uStack_ef = (undefined7)((ulong)&local_d0 >> 8);
                    /* try { // try from 0099efa8 to 0099efeb has its CatchHandler @ 0099fa8c */
                lVar22 = std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                   ((basic_string_conflict *)&local_280,
                                    (piecewise_construct_t *)&local_d0,(tuple *)&DAT_0074aba8,
                                    (tuple *)&local_f0);
                uVar12 = (ulong)(*(byte *)(lVar22 + 0x38) >> 1);
                pcVar13 = (char *)(lVar22 + 0x39);
                if ((*(byte *)(lVar22 + 0x38) & 1) != 0) {
                  uVar12 = *(ulong *)(lVar22 + 0x40);
                  pcVar13 = *(char **)(lVar22 + 0x48);
                }
                std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (&bStack_200,pcVar13,uVar12);
                if (((byte)local_d0 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_b9,
                                                   CONCAT16(uStack_ba,
                                                            CONCAT15(uStack_bb,
                                                                     CONCAT41(uStack_bf,uStack_c0)))
                                                  ));
                }
                    /* try { // try from 0099effc to 0099f007 has its CatchHandler @ 0099fa6c */
                std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
                          ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_210,
                           (int *)&local_2a0);
                if ((int)local_2a0 == 0xd) {
                  local_210 = (basic_string_conflict)0xe0;
                  uStack_20f = 0xc4e4;
                  local_190[0] = &PTR_FUN_00c4e530;
                  bStack_200 = (basic_ostream)0x8;
                  uStack_1ff = 0xc4e5;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  uStack_1f8 = &PTR_LAB_00c4e678;
                  if ((local_1b8 & 1) != 0) {
                    operator_delete(local_1a8);
                  }
                  uStack_1f8 = &PTR__basic_streambuf_00c4e728;
                  std::__ndk1::locale::~locale((locale *)&local_1f0);
                  std::__ndk1::ios_base::~ios_base((ios_base *)local_190);
                  local_d0 = (tuple)0x0;
                  uStack_cf = 0;
                  HStack_c8 = (Http)0x0;
                  uStack_c7 = 0;
                  uStack_c5 = 0;
                  uStack_c2 = 0;
                  uStack_b8 = 0;
                  uStack_c0 = 0;
                  uStack_bf = 0;
                  uStack_bb = 0;
                  uStack_ba = 0;
                  uStack_b9 = 0;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  local_210 = (basic_string_conflict)0x22;
                  uStack_207 = 0x74656b636f;
                  uStack_202 = 0x2d;
                  uStack_201 = 0x6b;
                  bStack_200 = (basic_ostream)0x65;
                  uStack_20f = 0x6265772d636573;
                  _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                )0x73;
                  uStack_1ff = 0x79;
                  local_f0 = SUB81(&local_210,0);
                  uStack_ef = (undefined7)((ulong)&local_210 >> 8);
                    /* try { // try from 0099f09c to 0099f0c3 has its CatchHandler @ 0099fa68 */
                  lVar22 = std::__ndk1::
                           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           ::
                           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                     ((basic_string_conflict *)&local_280,
                                      (piecewise_construct_t *)&local_210,(tuple *)&DAT_0074aba8,
                                      (tuple *)&local_f0);
                  WebSocketHandshakeKeyGen::generate
                            ((basic_string_conflict *)(lVar22 + 0x38),(char *)&local_d0);
                  if (((byte)local_210 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_1f9,
                                                     CONCAT43(uStack_1fd,
                                                              CONCAT21(uStack_1ff,bStack_200))));
                  }
                  bStack_200 = (basic_ostream)0x8;
                  uStack_1ff = 0xc4e5;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  local_190[0] = &PTR__basic_istream_00c4e640;
                  _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                )0x0;
                  uStack_207 = 0;
                  uStack_202 = 0;
                  uStack_201 = 0;
                  local_210 = (basic_string_conflict)0x18;
                  uStack_20f = 0xc4e6;
                    /* try { // try from 0099f10c to 0099f117 has its CatchHandler @ 0099fa3c */
                  std::__ndk1::ios_base::init((ios_base *)local_190,&uStack_1f8);
                  local_108 = 0;
                  local_100 = 0xffffffff;
                  local_210 = (basic_string_conflict)0xe0;
                  uStack_20f = 0xc4e4;
                  local_190[0] = &PTR_FUN_00c4e530;
                  uStack_1f8 = &PTR__basic_streambuf_00c4e728;
                  bStack_200 = (basic_ostream)0x8;
                  uStack_1ff = 0xc4e5;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  std::__ndk1::locale::locale((locale *)&local_1f0);
                  uStack_1c0 = 0;
                  local_1c8 = 0;
                  pcStack_1d0 = (char *)0x0;
                  local_1d8 = (atomic *)0x0;
                  uStack_1e0 = 0;
                  local_1e8 = (char *)0x0;
                  uStack_1f8 = &PTR_LAB_00c4e678;
                  uStack_1a0 = 0;
                  local_1a8 = (void *)0x0;
                  uStack_1b0 = 0;
                  local_1b8 = 0;
                  local_198 = 0x18;
                    /* try { // try from 0099f184 to 0099f1ab has its CatchHandler @ 0099fb5c */
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (&bStack_200,"HTTP/1.1 101 Switching Protocols\r\n",0x22);
                  pbVar14 = std::__ndk1::
                            __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                      (&bStack_200,"Sec-WebSocket-Accept: ",0x16);
                  local_f0 = (Http)0x0;
                  uStack_ef = 0;
                  uStack_e8 = 0;
                  uStack_e7 = 0;
                  local_e0 = (char *)0x0;
                  __n = strlen((char *)&local_d0);
                  if (0xffffffffffffffef < __n) {
                    /* try { // try from 0099f938 to 0099f93f has its CatchHandler @ 0099f9b0 */
                    /* WARNING: Subroutine does not return */
                    std::__ndk1::__basic_string_common<true>::__throw_length_error();
                  }
                  if (__n < 0x17) {
                    pcVar13 = (char *)((ulong)&local_f0 | 1);
                    local_f0 = SUB41((int)__n << 1,0);
                    __dest = pcVar13;
                    if (__n != 0) goto LAB_0099f2ec;
                  }
                  else {
                    uVar12 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099f2cc to 0099f2d3 has its CatchHandler @ 0099f9b0 */
                    __dest = operator_new(uVar12);
                    local_f0 = (Http)((byte)uVar12 | 1);
                    uStack_e8 = (undefined1)__n;
                    uStack_e7 = (undefined7)(__n >> 8);
                    uStack_ef = (undefined7)(uVar12 >> 8);
                    pcVar13 = (char *)((ulong)&local_f0 | 1);
                    local_e0 = __dest;
LAB_0099f2ec:
                    memcpy(__dest,&local_d0,__n);
                  }
                  __dest[__n] = '\0';
                  uVar12 = (ulong)((byte)local_f0 >> 1);
                  if (((byte)local_f0 & 1) != 0) {
                    uVar12 = CONCAT71(uStack_e7,uStack_e8);
                    pcVar13 = local_e0;
                  }
                    /* try { // try from 0099f318 to 0099f32f has its CatchHandler @ 0099fa54 */
                  pbVar14 = std::__ndk1::
                            __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                      (pbVar14,pcVar13,uVar12);
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar14,"\r\n",2);
                  if (((byte)local_f0 & 1) != 0) {
                    operator_delete(local_e0);
                  }
                    /* try { // try from 0099f340 to 0099f37b has its CatchHandler @ 0099fb5c */
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (&bStack_200,"Upgrade: websocket\r\n",0x14);
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (&bStack_200,"Connection: Upgrade\r\n",0x15);
                  pbVar14 = std::__ndk1::
                            __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                      (&bStack_200,"Server: ",8);
                    /* try { // try from 0099f380 to 0099f38b has its CatchHandler @ 0099f9fc */
                  userAgent();
                  uVar12 = (ulong)((byte)local_f0 >> 1);
                  pcVar13 = (char *)((ulong)&local_f0 | 1);
                  if (((byte)local_f0 & 1) != 0) {
                    uVar12 = CONCAT71(uStack_e7,uStack_e8);
                    pcVar13 = local_e0;
                  }
                    /* try { // try from 0099f3a8 to 0099f3bf has its CatchHandler @ 0099fa50 */
                  pbVar14 = std::__ndk1::
                            __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                      (pbVar14,pcVar13,uVar12);
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar14,"\r\n",2);
                  if (((byte)local_f0 & 1) != 0) {
                    operator_delete(local_e0);
                  }
                  local_f0 = (Http)0x0;
                  uStack_ef = 0;
                  uStack_e8 = 0;
                  uStack_e7 = 0;
                  local_e0 = (char *)0x0;
                    /* try { // try from 0099f3d8 to 0099f3df has its CatchHandler @ 0099f9f4 */
                  local_e0 = operator_new(0x20);
                  local_2f0 = &local_f0;
                  builtin_strncpy(local_e0,"sec-websocket-extensions",0x19);
                  uStack_e8 = 0x18;
                  uStack_e7 = 0;
                  local_f0 = (Http)0x21;
                  uStack_ef = 0;
                    /* try { // try from 0099f414 to 0099f4f7 has its CatchHandler @ 0099fa4c */
                  pvVar25 = (void *)std::__ndk1::
                                    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                    ::
                                    __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                              ((basic_string_conflict *)&local_280,
                                               (piecewise_construct_t *)&local_f0,
                                               (tuple *)&DAT_0074aba8,(tuple *)&local_2f0);
                  uStack_298 = 0;
                  local_290 = (void *)0x0;
                  local_2a0 = (Http *)0x0;
                  if ((*(byte *)((long)pvVar25 + 0x38) & 1) == 0) {
                    local_290 = *(void **)((long)pvVar25 + 0x48);
                    uStack_298 = *(ulong *)((long)pvVar25 + 0x40);
                    local_2a0 = *(Http **)((long)pvVar25 + 0x38);
                  }
                  else {
                    uVar12 = *(ulong *)((long)pvVar25 + 0x40);
                    if (0xffffffffffffffef < uVar12) {
                    /* try { // try from 0099f940 to 0099f947 has its CatchHandler @ 0099fa4c */
                    /* WARNING: Subroutine does not return */
                      std::__ndk1::__basic_string_common<true>::__throw_length_error();
                    }
                    pvVar31 = *(void **)((long)pvVar25 + 0x48);
                    if (uVar12 < 0x17) {
                      pvVar27 = (void *)((ulong)&local_2a0 | 1);
                      local_2a0 = (Http *)(ulong)(byte)((int)uVar12 << 1);
                      if (uVar12 != 0) goto LAB_0099f508;
                    }
                    else {
                      uVar26 = uVar12 + 0x10 & 0xfffffffffffffff0;
                      pvVar27 = operator_new(uVar26);
                      local_2a0 = (Http *)(uVar26 | 1);
                      uStack_298 = uVar12;
                      local_290 = pvVar27;
                      pvVar25 = pvVar27;
LAB_0099f508:
                      memcpy(pvVar27,pvVar31,uVar12);
                    }
                    *(undefined1 *)((long)pvVar27 + uVar12) = 0;
                  }
                  if (((byte)local_f0 & 1) != 0) {
                    operator_delete(local_e0);
                  }
                  pvVar31 = local_290;
                  uVar12 = uStack_298;
                  uVar11 = (uint)pvVar25;
                  local_2c0 = (Http *)0x0;
                  uStack_2b8 = 0;
                  local_2b0 = (void *)0x0;
                  if (((ulong)local_2a0 & 1) == 0) {
                    local_2b0 = local_290;
                    uStack_2b8 = uStack_298;
                    local_2c0 = local_2a0;
                  }
                  else {
                    if (0xffffffffffffffef < uStack_298) {
                    /* try { // try from 0099f948 to 0099f94f has its CatchHandler @ 0099fa7c */
                    /* WARNING: Subroutine does not return */
                      std::__ndk1::__basic_string_common<true>::__throw_length_error();
                    }
                    if (uStack_298 < 0x17) {
                      pvVar27 = (void *)((ulong)&local_2c0 | 1);
                      local_2c0 = (Http *)(ulong)(byte)((int)uStack_298 << 1);
                      if (uStack_298 != 0) goto LAB_0099f548;
                    }
                    else {
                      uVar26 = uStack_298 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099f530 to 0099f537 has its CatchHandler @ 0099fa7c */
                      pvVar27 = operator_new(uVar26);
                      local_2c0 = (Http *)(uVar26 | 1);
                      uStack_2b8 = uVar12;
                      local_2b0 = pvVar27;
                      pvVar25 = pvVar27;
LAB_0099f548:
                      uVar11 = (uint)pvVar25;
                      memcpy(pvVar27,pvVar31,uVar12);
                    }
                    *(undefined1 *)((long)pvVar27 + uVar12) = 0;
                  }
                    /* try { // try from 0099f55c to 0099f567 has its CatchHandler @ 0099f9d4 */
                  WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
                            (aWStack_2a8,&local_2c0);
                  if (((ulong)local_2c0 & 1) != 0) {
                    operator_delete(local_2b0);
                  }
                    /* try { // try from 0099f578 to 0099f5a3 has its CatchHandler @ 0099fa7c */
                  WebSocketPerMessageDeflateOptions::enabled(aWStack_2a8);
                  if ((uVar11 & uVar18 & 1) == 0) {
LAB_0099f5ec:
                    /* try { // try from 0099f5ec to 0099f5ff has its CatchHandler @ 0099fa7c */
                    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (&bStack_200,"\r\n",2);
                    this = *(Socket **)param_2[1];
                    /* try { // try from 0099f608 to 0099f613 has its CatchHandler @ 0099f9cc */
                    std::__ndk1::
                    basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                    ::str();
                    /* try { // try from 0099f614 to 0099f62b has its CatchHandler @ 0099f9b8 */
                    p_Var16 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)Socket::writeBytes(this,(basic_string_conflict *)&local_f0,
                                                    afStack_b0);
                    if (((byte)local_f0 & 1) != 0) {
                      operator_delete(local_e0);
                    }
                    if (((ulong)p_Var16 & 1) == 0) {
                      local_f0 = (Http)0x0;
                      uStack_ef = 0;
                      uStack_e8 = 0;
                      uStack_e7 = 0;
                      local_e0 = (char *)0x0;
                    /* try { // try from 0099f798 to 0099f79f has its CatchHandler @ 0099f9ac */
                      local_e0 = operator_new(0x30);
                      uStack_e8 = 0x25;
                      uStack_e7 = 0;
                      local_f0 = (Http)0x31;
                      uStack_ef = 0;
                      builtin_strncpy(local_e0,"Failed sending response to remote end",0x26);
                      local_308 = &local_300;
                      local_300 = (__tree_node *)0x0;
                      uStack_2f8 = 0;
                      local_2f0 = (Http *)0x0;
                      uStack_2e8 = 0;
                      local_2e0 = (void *)0x0;
                    /* try { // try from 0099f7e4 to 0099f7ff has its CatchHandler @ 0099f980 */
                      WebSocketInitResult::WebSocketInitResult
                                (param_1,0,0,&local_f0,&local_308,&local_2f0);
                      if (((ulong)local_2f0 & 1) != 0) {
                        operator_delete(local_2e0);
                      }
                      p_Var16 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                 *)&local_308;
                      p_Var30 = local_300;
                      goto LAB_0099f8b8;
                    }
                    local_2f0 = (Http *)0x0;
                    uStack_2e8 = 0;
                    local_2e0 = (void *)0x0;
                    local_318 = (__tree_node_base *)0x0;
                    local_310 = 0;
                    local_320 = (__tree_node_base *)&local_318;
                    p_Var30 = local_280;
                    while (p_Var30 != (__tree_node *)&local_278) {
                    /* try { // try from 0099f674 to 0099f6a7 has its CatchHandler @ 0099fcf4 */
                      p_Var16 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                 *)std::__ndk1::
                                   __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                   ::
                                   __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                             (p_Var16,(__tree_node_base *)&local_318,&local_218,
                                              auStack_220,p_Var30 + 0x20);
                      if (*(long *)p_Var16 == 0) {
                        std::__ndk1::
                        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                        ::
                        __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                                  ((pair *)&local_320);
                        p_Var17 = (__tree_node_base *)CONCAT71(uStack_ef,local_f0);
                        *(undefined8 *)p_Var17 = 0;
                        *(undefined8 *)(p_Var17 + 8) = 0;
                        *(undefined8 *)(p_Var17 + 0x10) = local_218;
                        *(__tree_node_base **)p_Var16 = p_Var17;
                        if (*(__tree_node_base **)local_320 != (__tree_node_base *)0x0) {
                          p_Var17 = *(__tree_node_base **)p_Var16;
                          local_320 = *(__tree_node_base **)local_320;
                        }
                        std::__ndk1::
                        __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                                  (local_318,p_Var17);
                        local_310 = local_310 + 1;
                      }
                      p_Var28 = *(__tree_node **)(p_Var30 + 8);
                      if (*(__tree_node **)(p_Var30 + 8) == (__tree_node *)0x0) {
                        p_Var28 = p_Var30 + 0x10;
                        bVar8 = (__tree_node *)*(__tree_node ***)*(__tree_node **)p_Var28 != p_Var30
                        ;
                        p_Var30 = *(__tree_node **)p_Var28;
                        if (bVar8) {
                          do {
                            lVar22 = *(long *)p_Var28;
                            p_Var28 = (__tree_node *)(lVar22 + 0x10);
                            p_Var30 = *(__tree_node **)p_Var28;
                          } while (*(long *)*(__tree_node **)p_Var28 != lVar22);
                        }
                      }
                      else {
                        do {
                          p_Var30 = p_Var28;
                          p_Var28 = *(__tree_node **)p_Var30;
                        } while (p_Var28 != (__tree_node *)0x0);
                      }
                    }
                    /* try { // try from 0099f738 to 0099f753 has its CatchHandler @ 0099f950 */
                    WebSocketInitResult::WebSocketInitResult
                              (param_1,1,200,&local_2f0,&local_320,&local_250);
                    std::__ndk1::
                    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)&local_320,(__tree_node *)local_318);
                    if (((ulong)local_2f0 & 1) != 0) {
                      operator_delete(local_2e0);
                    }
                  }
                  else {
                    *(undefined1 *)param_2[4] = 1;
                    uVar12 = WebSocketPerMessageDeflate::init
                                       (*(WebSocketPerMessageDeflate **)param_2[2],aWStack_2a8);
                    if ((uVar12 & 1) != 0) {
                    /* try { // try from 0099f5a8 to 0099f5b7 has its CatchHandler @ 0099f97c */
                      WebSocketPerMessageDeflateOptions::generateHeader(aWStack_2a8);
                      uVar12 = (ulong)((byte)local_f0 >> 1);
                      pcVar13 = (char *)((ulong)&local_f0 | 1);
                      if (((byte)local_f0 & 1) != 0) {
                        uVar12 = CONCAT71(uStack_e7,uStack_e8);
                        pcVar13 = local_e0;
                      }
                    /* try { // try from 0099f5d4 to 0099f5db has its CatchHandler @ 0099f978 */
                      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                (&bStack_200,pcVar13,uVar12);
                      if (((byte)local_f0 & 1) != 0) {
                        operator_delete(local_e0);
                      }
                      goto LAB_0099f5ec;
                    }
                    local_f0 = (Http)0x0;
                    uStack_ef = 0;
                    uStack_e8 = 0;
                    uStack_e7 = 0;
                    local_e0 = (char *)0x0;
                    /* try { // try from 0099f828 to 0099f837 has its CatchHandler @ 0099f974 */
                    local_e0 = operator_new(0x30);
                    pp_Stack_2d8 = &local_2d0;
                    uStack_e8 = 0x2f;
                    uStack_e7 = 0;
                    local_f0 = (Http)0x31;
                    uStack_ef = 0;
                    builtin_strncpy(local_e0,"Failed to initialize per message deflate engine",0x30)
                    ;
                    local_2d0 = (__tree_node *)0x0;
                    uStack_2c8 = 0;
                    local_2f0 = (Http *)0x0;
                    uStack_2e8 = 0;
                    local_2e0 = (void *)0x0;
                    /* try { // try from 0099f878 to 0099f89b has its CatchHandler @ 0099f954 */
                    WebSocketInitResult::WebSocketInitResult
                              (param_1,0,0,&local_f0,&pp_Stack_2d8,&local_2f0);
                    if (((ulong)local_2f0 & 1) != 0) {
                      operator_delete(local_2e0);
                    }
                    p_Var16 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)&pp_Stack_2d8;
                    p_Var30 = local_2d0;
LAB_0099f8b8:
                    std::__ndk1::
                    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                    ::destroy(p_Var16,p_Var30);
                    if (((byte)local_f0 & 1) != 0) {
                      operator_delete(local_e0);
                    }
                  }
                  if (((ulong)local_2a0 & 1) != 0) {
                    operator_delete(local_290);
                  }
                  local_210 = (basic_string_conflict)0xe0;
                  uStack_20f = 0xc4e4;
                  local_190[0] = &PTR_FUN_00c4e530;
                  bStack_200 = (basic_ostream)0x8;
                  uStack_1ff = 0xc4e5;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  uStack_1f8 = &PTR_LAB_00c4e678;
                  if ((local_1b8 & 1) != 0) {
                    operator_delete(local_1a8);
                  }
                  uStack_1f8 = &PTR__basic_streambuf_00c4e728;
                  std::__ndk1::locale::~locale((locale *)&local_1f0);
                }
                else {
                    /* try { // try from 0099f200 to 0099f20b has its CatchHandler @ 0099fa38 */
                  std::__ndk1::
                  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  ::str();
                    /* try { // try from 0099f20c to 0099f223 has its CatchHandler @ 0099fa24 */
                  puVar15 = (undefined8 *)
                            std::__ndk1::
                            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            ::insert((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                      *)&local_f0,0,"Invalid Sec-WebSocket-Version, need 13, got ",
                                     0x2c);
                  uVar23 = puVar15[2];
                  uStack_c0 = (undefined1)uVar23;
                  uStack_bf = (undefined4)((ulong)uVar23 >> 8);
                  uStack_bb = (undefined1)((ulong)uVar23 >> 0x28);
                  uStack_ba = (undefined1)((ulong)uVar23 >> 0x30);
                  uStack_b9 = (undefined1)((ulong)uVar23 >> 0x38);
                  uVar23 = puVar15[1];
                  HStack_c8 = SUB81(uVar23,0);
                  uStack_c7 = (undefined2)((ulong)uVar23 >> 8);
                  uStack_c5 = (undefined3)((ulong)uVar23 >> 0x18);
                  uStack_c2 = (undefined2)((ulong)uVar23 >> 0x30);
                  local_d0 = SUB81(*puVar15,0);
                  uStack_cf = (undefined7)((ulong)*puVar15 >> 8);
                  *puVar15 = 0;
                  puVar15[1] = 0;
                  puVar15[2] = 0;
                    /* try { // try from 0099f23c to 0099f257 has its CatchHandler @ 0099fa04 */
                  sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
                  if (((byte)local_d0 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_b9,
                                                     CONCAT16(uStack_ba,
                                                              CONCAT15(uStack_bb,
                                                                       CONCAT41(uStack_bf,uStack_c0)
                                                                      ))));
                  }
                  if (((byte)local_f0 & 1) != 0) {
                    operator_delete(local_e0);
                  }
                  local_210 = (basic_string_conflict)0xe0;
                  uStack_20f = 0xc4e4;
                  local_190[0] = &PTR_FUN_00c4e530;
                  bStack_200 = (basic_ostream)0x8;
                  uStack_1ff = 0xc4e5;
                  uStack_1fd = 0;
                  uStack_1f9 = 0;
                  uStack_1f8 = &PTR_LAB_00c4e678;
                  if ((local_1b8 & 1) != 0) {
                    operator_delete(local_1a8);
                  }
                  uStack_1f8 = &PTR__basic_streambuf_00c4e728;
                  std::__ndk1::locale::~locale((locale *)&local_1f0);
                }
                std::__ndk1::ios_base::~ios_base((ios_base *)local_190);
                goto LAB_0099ed78;
              }
              local_210 = (basic_string_conflict)0x2c;
              uStack_207 = 0x6172677055;
              uStack_202 = 100;
              uStack_20f = 0x676e697373694d;
              _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                            )0x20;
              uStack_201 = 0x65;
              bStack_200 = (basic_ostream)0x20;
              uStack_1ff = 0x6568;
              uStack_1fd = 0x72656461;
              uStack_1f9 = 0;
                    /* try { // try from 0099eb04 to 0099eb17 has its CatchHandler @ 0099fb64 */
              sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
            }
            else {
              p_Var30 = (__tree_node *)&local_278;
              p_Var28 = local_278;
              do {
                    /* try { // try from 0099e98c to 0099e997 has its CatchHandler @ 0099fd90 */
                uVar12 = CaseInsensitiveLess::operator()
                                   ((CaseInsensitiveLess *)&local_270,
                                    (basic_string_conflict *)(p_Var28 + 0x20),&local_210);
                lVar22 = 8;
                if ((uVar12 & 1) == 0) {
                  lVar22 = 0;
                  p_Var30 = p_Var28;
                }
                p_Var28 = *(__tree_node **)(p_Var28 + lVar22);
              } while (p_Var28 != (__tree_node *)0x0);
                    /* try { // try from 0099e9b8 to 0099e9c3 has its CatchHandler @ 0099fbbc */
              if ((p_Var30 == (__tree_node *)&local_278) ||
                 (uVar12 = CaseInsensitiveLess::operator()
                                     ((CaseInsensitiveLess *)&local_270,&local_210,
                                      (basic_string_conflict *)(p_Var30 + 0x20)), (uVar12 & 1) != 0)
                 ) goto LAB_0099e9c8;
              if (((byte)local_210 & 1) == 0) goto LAB_0099ea40;
LAB_0099e9d4:
              operator_delete((void *)CONCAT17(uStack_1f9,
                                               CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200)))
                             );
              if (p_Var30 != (__tree_node *)&local_278) goto LAB_0099ea48;
LAB_0099e9e4:
              local_210 = (basic_string_conflict)0x0;
              uStack_20f = 0;
              _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                            )0x0;
              uStack_207 = 0;
              uStack_202 = 0;
              uStack_201 = 0;
              bStack_200 = (basic_ostream)0x0;
              uStack_1ff = 0;
              uStack_1fd = 0;
              uStack_1f9 = 0;
                    /* try { // try from 0099e9ec to 0099e9f3 has its CatchHandler @ 0099fbd0 */
              pcVar13 = operator_new(0x20);
              bStack_200 = SUB81(pcVar13,0);
              uStack_1ff = (undefined2)((ulong)pcVar13 >> 8);
              uStack_1fd = (undefined4)((ulong)pcVar13 >> 0x18);
              uStack_1f9 = (undefined1)((ulong)pcVar13 >> 0x38);
              _Stack_208 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                            )0x1f;
              uStack_207 = 0;
              uStack_202 = 0;
              uStack_201 = 0;
              local_210 = (basic_string_conflict)0x21;
              uStack_20f = 0;
              builtin_strncpy(pcVar13,"Missing Sec-WebSocket-Key value",0x20);
                    /* try { // try from 0099ea20 to 0099ea33 has its CatchHandler @ 0099fbc0 */
              sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
            }
LAB_0099eb18:
            if (((byte)local_210 & 1) != 0) {
              operator_delete((void *)CONCAT17(uStack_1f9,
                                               CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200)))
                             );
            }
          }
LAB_0099ed78:
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)&local_280,local_278);
          goto joined_r0x0099e8a4;
        }
      }
                    /* try { // try from 0099e7cc to 0099e7df has its CatchHandler @ 0099fc0c */
      std::__ndk1::operator+
                ((__ndk1 *)"Invalid HTTP version, need HTTP/1.1, got: ",(char *)&local_268,
                 (basic_string_conflict *)param_4);
                    /* try { // try from 0099e7e0 to 0099e7f3 has its CatchHandler @ 0099fc08 */
      sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
    }
    else {
LAB_0099e62c:
                    /* try { // try from 0099e62c to 0099e63f has its CatchHandler @ 0099fc4c */
      std::__ndk1::operator+
                ((__ndk1 *)"Invalid HTTP method, need GET, got ",(char *)&local_238,
                 (basic_string_conflict *)param_4);
                    /* try { // try from 0099e640 to 0099e653 has its CatchHandler @ 0099fc38 */
      sendErrorResponse(iVar9,(basic_string_conflict *)0x190);
    }
    if (((byte)local_210 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1f9,
                                       CONCAT43(uStack_1fd,CONCAT21(uStack_1ff,bStack_200))));
    }
  }
joined_r0x0099e8a4:
  if ((local_268 & 1) != 0) {
    operator_delete(local_258);
  }
  if ((local_250 & 1) != 0) {
    operator_delete(local_240);
  }
  if ((local_238 & 1) != 0) {
    operator_delete(local_228);
  }
  if (afStack_b0 == local_90) {
    pcVar21 = *(code **)(*(long *)local_90 + 0x20);
  }
  else {
    if (local_90 == (function *)0x0) goto LAB_0099e6b0;
    pcVar21 = *(code **)(*(long *)local_90 + 0x28);
  }
  (*pcVar21)();
LAB_0099e6b0:
  if (*(long *)(lVar4 + 0x28) != lVar24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

