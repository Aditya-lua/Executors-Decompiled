/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099844c
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* ix::WebSocketTransport::dispatch(ix::WebSocketTransport::PollResult, std::__ndk1::function<void
   (std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, unsigned long, bool, ix::WebSocketTransport::MessageKind)> const&) */

void __thiscall ix::WebSocketTransport::dispatch(WebSocketTransport *this,int param_2,long param_3)

{
  mutex *this_00;
  byte *pbVar1;
  undefined **ppuVar2;
  undefined **ppuVar3;
  undefined1 *__src;
  byte *pbVar4;
  list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  *plVar5;
  undefined4 uVar6;
  WebSocketTransport WVar7;
  undefined1 uVar8;
  undefined1 uVar9;
  size_t __n;
  long lVar10;
  undefined8 *puVar11;
  bool bVar12;
  char *pcVar13;
  int iVar14;
  undefined **ppuVar15;
  long *plVar16;
  WebSocketTransport *pWVar17;
  basic_ostream *pbVar18;
  undefined8 *puVar19;
  WebSocketTransport *__s2;
  basic_string_conflict *pbVar20;
  ulong uVar21;
  undefined **ppuVar22;
  code *pcVar23;
  long lVar24;
  long lVar25;
  undefined **ppuVar26;
  undefined **ppuVar27;
  undefined **ppuVar28;
  uint uVar29;
  undefined **ppuVar30;
  list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  *plVar31;
  undefined **ppuVar32;
  undefined **ppuVar33;
  undefined1 *__dest;
  ushort uVar34;
  undefined *puVar35;
  undefined *puVar36;
  undefined *puVar37;
  undefined **local_208;
  undefined **ppuStack_200;
  WebSocketTransport *local_1f8;
  undefined **local_1f0;
  undefined **ppuStack_1e8;
  WebSocketTransport *local_1e0;
  ulong local_1d8;
  undefined **local_1d0;
  undefined **local_1c8;
  undefined1 local_1bc [4];
  uint local_1b8;
  char local_1b4;
  byte local_1b3;
  byte local_1b2;
  byte local_1b1;
  char local_1b0;
  uint local_1ac;
  uint local_1a8;
  undefined **local_1a0;
  undefined4 local_198;
  undefined **local_190;
  undefined **ppuStack_188;
  WebSocketTransport *local_180;
  undefined **ppuStack_178;
  undefined ***local_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  byte local_138;
  undefined8 uStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  long local_70;
  
  this_00 = (mutex *)(this + 0xb8);
  lVar10 = tpidr_el0;
  local_70 = *(long *)(lVar10 + 0x28);
  ppuVar32 = (undefined **)((ulong)&local_1d8 | 1);
  do {
    pbVar4 = *(byte **)(this + 0x38);
    uVar21 = *(long *)(this + 0x40) - (long)pbVar4;
    if (uVar21 < 2) {
LAB_00999130:
      if (param_2 != 0) {
        *(byte **)(this + 0x40) = pbVar4;
        if (*(int *)(this + 0xe0) == 0) {
          std::__ndk1::mutex::lock(this_00);
                    /* try { // try from 009991b0 to 009991b3 has its CatchHandler @ 009992c8 */
          (**(code **)(**(long **)(this + 0xb0) + 0x20))();
          std::__ndk1::mutex::unlock(this_00);
          setReadyState(this,1);
        }
        else if (*(int *)(this + 0xe0) != 1) {
          closeSocketAndSwitchToClosedState
                    (this,0x3ee,
                     (basic_string_conflict *)&WebSocketCloseConstants::kAbnormalCloseMessage,0,
                     false);
        }
      }
      goto LAB_009991e8;
    }
    local_1b4 = -((char)*pbVar4 >> 7);
    local_1b3 = *pbVar4 >> 6 & 1;
    local_1b2 = *pbVar4 >> 5 & 1;
    local_1b1 = *pbVar4 >> 4 & 1;
    local_1ac = *pbVar4 & 0xf;
    local_1b0 = -((char)pbVar4[1] >> 7);
    local_1a8 = pbVar4[1] & 0x7f;
    uVar29 = 4;
    if (local_1a8 != 0x7e) {
      uVar29 = 2;
    }
    iVar14 = 0;
    if (local_1b0 != '\0') {
      iVar14 = 4;
    }
    local_1b8 = (uVar29 | (uint)(local_1a8 == 0x7f) << 3) + iVar14;
    if (uVar21 < local_1b8) goto LAB_00999130;
    if (local_1b3 == 0) {
      if (((*pbVar4 >> 4 | *pbVar4 >> 5) & 1) == 0) {
        if (0x7d < local_1a8) goto LAB_00998650;
LAB_00998618:
        local_1a0 = (undefined **)(long)(int)local_1a8;
        lVar24 = 2;
        goto LAB_009986e4;
      }
LAB_00999184:
      pbVar20 = (basic_string_conflict *)&WebSocketCloseConstants::kProtocolErrorReservedBitUsed;
LAB_009991e0:
      close(this,0x3ea,pbVar20,uVar21,false);
      goto LAB_009991e8;
    }
    if ((((byte)this[0x185] & 1) == 0) || (local_1b1 != 0 || local_1b2 != 0)) {
      uVar21 = *(long *)(this + 0x40) - *(long *)(this + 0x38);
      goto LAB_00999184;
    }
    if (local_1a8 < 0x7e) goto LAB_00998618;
LAB_00998650:
    if (local_1a8 == 0x7f) {
      local_1a0 = (undefined **)
                  ((ulong)pbVar4[2] << 0x38 | (ulong)pbVar4[3] << 0x30 | (ulong)pbVar4[4] << 0x28 |
                   (ulong)pbVar4[5] << 0x20 | (ulong)pbVar4[6] << 0x18 | (ulong)pbVar4[7] << 0x10 |
                   (ulong)pbVar4[8] << 8 | (ulong)pbVar4[9]);
      lVar24 = 10;
    }
    else {
      if (local_1a8 != 0x7e) goto LAB_009991e8;
      lVar24 = 4;
      local_1a0 = (undefined **)(ulong)CONCAT11(pbVar4[2],pbVar4[3]);
    }
LAB_009986e4:
    if (local_1b0 == '\0') {
      local_198 = 0;
    }
    else {
      pbVar1 = pbVar4 + lVar24;
      local_198 = CONCAT13(pbVar1[3],CONCAT12(pbVar1[2],CONCAT11(pbVar4[(uint)lVar24 | 1],*pbVar1)))
      ;
    }
    if ((undefined **)0x8000000000000000 < local_1a0) goto LAB_009991e8;
    lVar24 = *(long *)(this + 0x38);
    uVar21 = (ulong)local_1b8;
    if ((undefined1 *)(*(long *)(this + 0x40) - lVar24) < (undefined1 *)((long)local_1a0 + uVar21))
    goto LAB_009991e8;
    if ((local_1b4 == '\0') && (local_1ac - 8 < 3)) {
      pbVar20 = (basic_string_conflict *)
                &WebSocketCloseConstants::kProtocolErrorCodeControlMessageFragmented;
      uVar21 = 0;
      goto LAB_009991e0;
    }
    ppuVar33 = local_1a0;
    if ((local_1b0 != '\0') && (local_1a0 != (undefined **)0x0)) {
      *(byte *)(lVar24 + uVar21) = *(byte *)(lVar24 + uVar21) ^ (byte)local_198;
      if (local_1a0 == (undefined **)0x1) {
        ppuVar33 = (undefined **)0x1;
      }
      else {
        ppuVar33 = (undefined **)0x1;
        do {
          *(byte *)((long)ppuVar33 + *(long *)(this + 0x38) + (ulong)local_1b8) =
               *(byte *)((long)ppuVar33 + *(long *)(this + 0x38) + (ulong)local_1b8) ^
               *(byte *)(((ulong)&local_1b8 | (ulong)ppuVar33 & 3) + 0x20);
          ppuVar33 = (undefined **)((long)ppuVar33 + 1);
        } while (local_1a0 != ppuVar33);
      }
      lVar24 = *(long *)(this + 0x38);
    }
    uVar21 = (ulong)local_1b8;
    local_1d8 = 0;
    local_1d0 = (undefined **)0x0;
    local_1c8 = (undefined **)0x0;
    if ((undefined **)0xffffffffffffffef < ppuVar33) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (ppuVar33 < (undefined **)0x17) {
      local_1d8 = (ulong)(byte)((int)ppuVar33 << 1);
      ppuVar15 = ppuVar32;
      if (ppuVar33 != (undefined **)0x0) goto LAB_0099881c;
    }
    else {
      ppuVar15 = operator_new((ulong)(ppuVar33 + 2) & 0xfffffffffffffff0);
      local_1d8 = (ulong)(ppuVar33 + 2) & 0xfffffffffffffff0 | 1;
      local_1d0 = ppuVar33;
      local_1c8 = ppuVar15;
LAB_0099881c:
      ppuVar2 = (undefined **)(lVar24 + uVar21);
      ppuVar3 = (undefined **)((long)ppuVar2 + (long)ppuVar33);
      ppuVar26 = ppuVar15;
      if (ppuVar33 < (undefined **)0x20) {
        ppuVar22 = ppuVar2;
LAB_0099888c:
        do {
          ppuVar33 = (undefined **)((long)ppuVar22 + 1);
          *(undefined1 *)ppuVar26 = *(undefined1 *)ppuVar22;
          ppuVar22 = ppuVar33;
          ppuVar26 = (undefined **)((long)ppuVar26 + 1);
        } while (ppuVar3 != ppuVar33);
      }
      else {
        if ((ppuVar15 < ppuVar3) &&
           (ppuVar22 = ppuVar2, ppuVar2 < (undefined **)((long)ppuVar15 + (long)ppuVar33)))
        goto LAB_0099888c;
        ppuVar27 = (undefined **)((ulong)ppuVar33 & 0xffffffffffffffe0);
        ppuVar26 = (undefined **)((long)ppuVar15 + (long)ppuVar27);
        ppuVar22 = (undefined **)((long)ppuVar2 + (long)ppuVar27);
        puVar19 = (undefined8 *)(lVar24 + uVar21 + 0x10);
        ppuVar28 = ppuVar15 + 2;
        ppuVar30 = ppuVar27;
        do {
          puVar11 = puVar19 + -1;
          puVar35 = (undefined *)puVar19[-2];
          puVar37 = (undefined *)puVar19[1];
          puVar36 = (undefined *)*puVar19;
          puVar19 = puVar19 + 4;
          ppuVar30 = ppuVar30 + -4;
          ppuVar28[-1] = (undefined *)*puVar11;
          ppuVar28[-2] = puVar35;
          ppuVar28[1] = puVar37;
          *ppuVar28 = puVar36;
          ppuVar28 = ppuVar28 + 4;
        } while (ppuVar30 != (undefined **)0x0);
        if (ppuVar33 != ppuVar27) goto LAB_0099888c;
      }
      ppuVar15 = (undefined **)((long)ppuVar15 + ((long)ppuVar3 - (long)ppuVar2));
    }
    *(undefined1 *)ppuVar15 = 0;
    switch(local_1ac) {
    case 0:
      if (*(long *)(this + 0xa0) == 0) {
        close(this,0x3ea,
              (basic_string_conflict *)
              &WebSocketCloseConstants::kProtocolErrorCodeContinuationOpCodeOutOfSequence,0,false);
      }
      goto LAB_00998998;
    case 1:
    case 2:
      *(uint *)(this + 0xa8) = (uint)(local_1ac != 1);
      this[0xac] = (WebSocketTransport)((byte)this[0x185] & local_1b3 & 1);
      if (*(long *)(this + 0xa0) != 0) {
                    /* try { // try from 009988f8 to 009989b3 has its CatchHandler @ 0099940c */
        close(this,0x3ea,
              (basic_string_conflict *)
              &WebSocketCloseConstants::kProtocolErrorCodeDataOpcodeOutOfSequence,0,false);
      }
LAB_00998998:
      if ((local_1b4 == '\0') || (*(long *)(this + 0xa0) != 0)) {
        std::__ndk1::
        list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
        ::
        emplace_back<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&>
                  ((list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                    *)(this + 0x90),(basic_string_conflict *)&local_1d8);
        if (local_1b4 == '\0') {
          local_190 = (undefined **)0x0;
          ppuStack_188 = (undefined **)0x0;
          local_180 = (WebSocketTransport *)0x0;
          local_1f0 = (undefined **)0x0;
          local_1bc[0] = 0;
          local_208 = (undefined **)CONCAT44(local_208._4_4_,4);
          plVar16 = *(long **)(param_3 + 0x20);
          if (plVar16 == (long *)0x0) {
            puVar19 = (undefined8 *)__cxa_allocate_exception(8);
            *puVar19 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 0099923c to 0099924f has its CatchHandler @ 009992bc */
                    /* WARNING: Subroutine does not return */
            __cxa_throw(puVar19,&std::__ndk1::bad_function_call::typeinfo,
                        std::bad_exception::~bad_exception);
          }
                    /* try { // try from 00998b20 to 00998b33 has its CatchHandler @ 00999350 */
          (**(code **)(*plVar16 + 0x30))(plVar16,&local_190,&local_1f0,local_1bc,&local_208);
          if (((ulong)local_190 & 1) != 0) {
            pWVar17 = local_180;
LAB_009990c4:
            operator_delete(pWVar17);
          }
          break;
        }
        uVar6 = *(undefined4 *)(this + 0xa8);
                    /* try { // try from 009989c0 to 009989cb has its CatchHandler @ 009993e4 */
        getMergedChunks();
                    /* try { // try from 009989d0 to 009989e3 has its CatchHandler @ 009993c4 */
        emitMessage(this,uVar6,&local_190,this[0xac],param_3);
        if (((ulong)local_190 & 1) != 0) {
          operator_delete(local_180);
        }
        if (*(long *)(this + 0xa0) != 0) {
          lVar24 = *(long *)(this + 0x90);
          plVar5 = *(list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                     **)(this + 0x98);
          lVar25 = *(long *)plVar5;
          *(undefined8 *)(lVar25 + 8) = *(undefined8 *)(lVar24 + 8);
          **(long **)(lVar24 + 8) = lVar25;
          *(undefined8 *)(this + 0xa0) = 0;
          while (plVar5 != (list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                            *)(this + 0x90)) {
            plVar31 = *(list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                        **)(plVar5 + 8);
            if (((byte)plVar5[0x10] & 1) != 0) {
              operator_delete(*(void **)(plVar5 + 0x20));
            }
            operator_delete(plVar5);
            plVar5 = plVar31;
          }
        }
      }
      else {
                    /* try { // try from 00998b4c to 00998b5b has its CatchHandler @ 0099940c */
        emitMessage(this,*(undefined4 *)(this + 0xa8),&local_1d8,this[0xac],param_3);
      }
      this[0xac] = (WebSocketTransport)0x0;
      break;
    default:
                    /* try { // try from 00998a54 to 00998ae7 has its CatchHandler @ 0099940c */
      close(this,0x3ea,(basic_string_conflict *)&WebSocketCloseConstants::kProtocolErrorMessage,
            *(long *)(this + 0x40) - *(long *)(this + 0x38),false);
      break;
    case 8:
      local_1f0 = (undefined **)0x0;
      ppuStack_1e8 = (undefined **)0x0;
      local_1e0 = (WebSocketTransport *)0x0;
      if (local_1a0 < (undefined **)0x2) {
        if ((WebSocketCloseConstants::kNoStatusCodeErrorMessage & 1) == 0) {
          uVar21 = (ulong)(WebSocketCloseConstants::kNoStatusCodeErrorMessage >> 1);
          pcVar13 = (char *)&DAT_00d21789;
        }
        else {
          uVar21 = ram0x00d21790;
          pcVar13 = DAT_00d21798;
        }
                    /* try { // try from 00998b88 to 00998b8f has its CatchHandler @ 009993e8 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_1f0,pcVar13,uVar21);
        uVar34 = 0x3ed;
      }
      else {
        uVar8 = *(undefined1 *)(*(long *)(this + 0x38) + (ulong)local_1b8);
        uVar9 = *(undefined1 *)(*(long *)(this + 0x38) + (ulong)(local_1b8 + 1));
        if (local_1a0 == (undefined **)0x2) {
          uVar21 = 0;
        }
        else {
          ppuStack_188 = (undefined **)0x0;
          local_180 = (WebSocketTransport *)0x0;
          local_190 = (undefined **)0x0;
          ppuVar33 = (undefined **)(ulong)((byte)local_1d8._0_1_ >> 1);
          if ((local_1d8 & 1) != 0) {
            ppuVar33 = local_1d0;
          }
          if (ppuVar33 < (undefined **)0x2) {
                    /* try { // try from 009992a8 to 009992b7 has its CatchHandler @ 009992c0 */
            std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_009992b0:
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          ppuVar15 = ppuVar32;
          if ((local_1d8 & 1) != 0) {
            ppuVar15 = local_1c8;
          }
          ppuVar2 = (undefined **)((long)ppuVar33 + -2);
          if (ppuVar33 < (undefined **)0x2) {
            ppuVar2 = ppuVar33;
          }
          if ((undefined **)0xffffffffffffffef < ppuVar2) goto LAB_009992b0;
          if (ppuVar2 < (undefined **)0x17) {
            local_190 = (undefined **)(ulong)(byte)((int)ppuVar2 << 1);
            pWVar17 = (WebSocketTransport *)((ulong)&local_190 | 1);
            if (ppuVar2 != (undefined **)0x0) goto LAB_00998c84;
          }
          else {
                    /* try { // try from 00998c64 to 00998c6b has its CatchHandler @ 009992e0 */
            pWVar17 = operator_new((ulong)(ppuVar2 + 2) & 0xfffffffffffffff0);
            local_190 = (undefined **)((ulong)(ppuVar2 + 2) & 0xfffffffffffffff0 | 1);
            ppuStack_188 = ppuVar2;
            local_180 = pWVar17;
LAB_00998c84:
            memcpy(pWVar17,(undefined1 *)((long)ppuVar15 + 2),(size_t)ppuVar2);
          }
          pWVar17[(long)ppuVar2] = (WebSocketTransport)0x0;
          if (((ulong)local_1f0 & 1) != 0) {
            *local_1e0 = (WebSocketTransport)0x0;
            ppuStack_1e8 = (undefined **)0x0;
            if (((ulong)local_1f0 & 1) != 0) {
              operator_delete(local_1e0);
            }
          }
          ppuStack_1e8 = ppuStack_188;
          local_1f0 = local_190;
          uVar21 = (ulong)local_190 & 0xff;
          local_1e0 = local_180;
        }
        uVar34 = CONCAT11(uVar8,uVar9);
        pWVar17 = (WebSocketTransport *)((ulong)&local_1f0 | 1);
        ppuVar33 = (undefined **)(uVar21 >> 1);
        if ((uVar21 & 1) != 0) {
          pWVar17 = local_1e0;
          ppuVar33 = ppuStack_1e8;
        }
        if (ppuVar33 != (undefined **)0x0) {
          uVar21 = 0;
          do {
            WVar7 = *pWVar17;
            lVar24 = uVar21 * 0x10;
            uVar21 = (ulong)(byte)(&DAT_0074a981)
                                  [((ulong)(byte)(&DAT_0074a981)[(byte)WVar7] | 0x100) + lVar24];
            if (uVar21 == 1) goto LAB_00998d30;
            ppuVar33 = (undefined **)((long)ppuVar33 + -1);
            pWVar17 = pWVar17 + 1;
          } while (ppuVar33 != (undefined **)0x0);
          if ((&DAT_0074a981)[((ulong)(byte)(&DAT_0074a981)[(byte)WVar7] | 0x100) + lVar24] != 0) {
LAB_00998d30:
            if ((WebSocketCloseConstants::kInvalidFramePayloadDataMessage & 1) == 0) {
              uVar21 = (ulong)(WebSocketCloseConstants::kInvalidFramePayloadDataMessage >> 1);
              pcVar13 = &DAT_00d21819;
            }
            else {
              uVar21 = DAT_00d21820;
              pcVar13 = DAT_00d21828;
            }
                    /* try { // try from 00998d54 to 00998d5b has its CatchHandler @ 009993e8 */
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                      ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_1f0,pcVar13,uVar21);
            uVar34 = 0x3ef;
          }
        }
        if (((uVar34 < 1000) || ((uVar34 | 2) == 0x3ee)) || ((ushort)(uVar34 - 0x3f6) < 0x7c2)) {
          local_180 = (WebSocketTransport *)&PTR_FUN_00c4e508;
          local_110[0] = &PTR__basic_istream_00c4e640;
          ppuStack_188 = (undefined **)0x0;
          local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00998da8 to 00998db3 has its CatchHandler @ 0099932c */
          std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
          local_88 = 0;
          local_80 = 0xffffffff;
          local_190 = &PTR_LAB_00c4e4e0;
          local_110[0] = &PTR_FUN_00c4e530;
          ppuStack_178 = &PTR__basic_streambuf_00c4e728;
          local_180 = (WebSocketTransport *)&PTR_FUN_00c4e508;
          std::__ndk1::locale::locale((locale *)&local_170);
          uStack_150 = 0;
          local_158 = 0;
          uStack_140 = 0;
          uStack_148 = 0;
          uStack_160 = 0;
          local_168 = 0;
          ppuStack_178 = &PTR_LAB_00c4e678;
          uStack_130 = 0;
          local_138 = 0;
          uStack_120 = 0;
          local_128 = (void *)0x0;
          local_118 = 0x18;
          if ((WebSocketCloseConstants::kInvalidCloseCodeMessage & 1) == 0) {
            uVar21 = (ulong)(WebSocketCloseConstants::kInvalidCloseCodeMessage >> 1);
            pcVar13 = &DAT_00d21831;
          }
          else {
            uVar21 = DAT_00d21838;
            pcVar13 = DAT_00d21840;
          }
                    /* try { // try from 00998e44 to 00998e5f has its CatchHandler @ 00999354 */
          pbVar18 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              ((basic_ostream *)&local_180,pcVar13,uVar21);
          pbVar18 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar18,": ",2);
          std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                    ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar18,uVar34);
                    /* try { // try from 00998e60 to 00998e6b has its CatchHandler @ 00999328 */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
          if (((ulong)local_1f0 & 1) != 0) {
            *local_1e0 = (WebSocketTransport)0x0;
            ppuStack_1e8 = (undefined **)0x0;
            if (((ulong)local_1f0 & 1) != 0) {
              operator_delete(local_1e0);
            }
          }
          local_1e0 = local_1f8;
          local_190 = &PTR_LAB_00c4e4e0;
          local_110[0] = &PTR_FUN_00c4e530;
          local_180 = (WebSocketTransport *)&PTR_FUN_00c4e508;
          ppuStack_178 = &PTR_LAB_00c4e678;
          ppuStack_1e8 = ppuStack_200;
          local_1f0 = local_208;
          if ((local_138 & 1) != 0) {
            operator_delete(local_128);
          }
          ppuStack_178 = &PTR__basic_streambuf_00c4e728;
          std::__ndk1::locale::~locale((locale *)&local_170);
          std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
          uVar34 = 0x3ea;
        }
      }
      if (*(int *)(this + 0xe0) == 0) {
        if (*(ushort *)(this + 0x160) == uVar34) {
                    /* try { // try from 00998f8c to 00998f93 has its CatchHandler @ 009992e4 */
          std::__ndk1::mutex::lock((mutex *)(this + 0x138));
          std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
          WVar7 = this[0x120];
          ppuVar33 = (undefined **)(ulong)((byte)WVar7 >> 1);
          if (((byte)WVar7 & 1) != 0) {
            ppuVar33 = *(undefined ***)(this + 0x128);
          }
          ppuVar15 = (undefined **)((ulong)local_1f0 >> 1 & 0x7f);
          if (((ulong)local_1f0 & 1) != 0) {
            ppuVar15 = ppuStack_1e8;
          }
          if (ppuVar33 == ppuVar15) {
            pWVar17 = this + 0x121;
            if (((byte)WVar7 & 1) != 0) {
              pWVar17 = *(WebSocketTransport **)(this + 0x130);
            }
            __s2 = (WebSocketTransport *)((ulong)&local_1f0 | 1);
            if (((ulong)local_1f0 & 1) != 0) {
              __s2 = local_1e0;
            }
            if (((byte)WVar7 & 1) == 0) {
              if (ppuVar33 != (undefined **)0x0) {
                lVar24 = -(long)(ulong)((byte)WVar7 >> 1);
                pWVar17 = this + 0x121;
                do {
                  if (*pWVar17 != *__s2) goto LAB_009990b8;
                  pWVar17 = pWVar17 + 1;
                  lVar24 = lVar24 + 1;
                  __s2 = __s2 + 1;
                } while (lVar24 != 0);
              }
            }
            else if ((ppuVar33 != (undefined **)0x0) &&
                    (iVar14 = memcmp(pWVar17,__s2,(size_t)ppuVar33), iVar14 != 0))
            goto LAB_009990b8;
                    /* try { // try from 009990a4 to 009990b7 has its CatchHandler @ 009992dc */
            closeSocketAndSwitchToClosedState
                      (this,uVar34,(basic_string_conflict *)&local_1f0,
                       *(long *)(this + 0x40) - *(long *)(this + 0x38),false);
          }
        }
      }
      else {
        if (*(int *)(this + 0xe0) != 0) {
          *(undefined4 *)(this + 0xe0) = 0;
        }
                    /* try { // try from 00998f2c to 00998f43 has its CatchHandler @ 009993e8 */
        sendCloseFrame(this,uVar34,(basic_string_conflict *)&local_1f0);
        std::__ndk1::mutex::lock(this_00);
                    /* try { // try from 00998f48 to 00998f4f has its CatchHandler @ 00999338 */
        Socket::wakeUpFromPoll(*(ulong *)(this + 0xb0));
        std::__ndk1::mutex::unlock(this_00);
                    /* try { // try from 00998f60 to 00998f73 has its CatchHandler @ 00999334 */
        closeSocketAndSwitchToClosedState
                  (this,uVar34,(basic_string_conflict *)&local_1f0,
                   *(long *)(this + 0x40) - *(long *)(this + 0x38),true);
      }
LAB_009990b8:
      if (((ulong)local_1f0 & 1) == 0) break;
      pWVar17 = local_1e0;
      goto LAB_009990c4;
    case 9:
      ppuVar33 = (undefined **)(ulong)((byte)local_1d8._0_1_ >> 1);
      if ((local_1d8 & 1) != 0) {
        ppuVar33 = local_1d0;
      }
      if (ppuVar33 < (undefined **)0x7e) {
        if (((byte)this[0x278] & 1) != 0) {
          local_170 = (undefined ***)0x0;
          ppuStack_200 = (undefined **)(ulong)((byte)local_1d8._0_1_ >> 1);
          local_208 = ppuVar32;
          if ((local_1d8 & 1) != 0) {
            ppuStack_200 = local_1d0;
            local_208 = local_1c8;
          }
                    /* try { // try from 00998bc4 to 00998bdf has its CatchHandler @ 009992e8 */
          sendData(&local_1f0,this,10,&local_208,0,&local_190);
          if (&local_190 == local_170) {
            pcVar23 = (code *)(*local_170)[4];
          }
          else {
            if (local_170 == (undefined ***)0x0) goto LAB_0099902c;
            pcVar23 = (code *)(*local_170)[5];
          }
          (*pcVar23)();
        }
LAB_0099902c:
        local_208 = (undefined **)((ulong)local_208 & 0xffffffffffffff00);
        local_190 = (undefined **)(local_1d8 >> 1 & 0x7f);
        if ((local_1d8 & 1) != 0) {
          local_190 = local_1d0;
        }
        local_1f0 = (undefined **)CONCAT44(local_1f0._4_4_,2);
        plVar16 = *(long **)(param_3 + 0x20);
        if (plVar16 == (long *)0x0) {
          puVar19 = (undefined8 *)__cxa_allocate_exception(8);
          *puVar19 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00999294 to 009992a7 has its CatchHandler @ 009992c4 */
                    /* WARNING: Subroutine does not return */
          __cxa_throw(puVar19,&std::__ndk1::bad_function_call::typeinfo,
                      std::bad_exception::~bad_exception);
        }
                    /* try { // try from 00999064 to 00999077 has its CatchHandler @ 0099940c */
        (**(code **)(*plVar16 + 0x30))(plVar16,&local_1d8,&local_190,&local_208,&local_1f0);
        break;
      }
      close(this,0x3ea,
            (basic_string_conflict *)&WebSocketCloseConstants::kProtocolErrorPingPayloadOversized,0,
            false);
      bVar12 = true;
      goto joined_r0x00999128;
    case 10:
      this[0x280] = (WebSocketTransport)0x1;
      local_208 = (undefined **)((ulong)local_208 & 0xffffffffffffff00);
      local_190 = (undefined **)(ulong)((byte)local_1d8._0_1_ >> 1);
      if ((local_1d8 & 1) != 0) {
        local_190 = local_1d0;
      }
      local_1f0 = (undefined **)CONCAT44(local_1f0._4_4_,3);
      plVar16 = *(long **)(param_3 + 0x20);
      if (plVar16 == (long *)0x0) {
        puVar19 = (undefined8 *)__cxa_allocate_exception(8);
        *puVar19 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00999268 to 0099927b has its CatchHandler @ 009992c4 */
                    /* WARNING: Subroutine does not return */
        __cxa_throw(puVar19,&std::__ndk1::bad_function_call::typeinfo,
                    std::bad_exception::~bad_exception);
      }
      (**(code **)(*plVar16 + 0x30))(plVar16,&local_1d8,&local_190,&local_208,&local_1f0);
    }
    __dest = *(undefined1 **)(this + 0x38);
    __src = __dest + local_1b8 + (long)local_1a0;
    if (__src == __dest) {
      bVar12 = false;
    }
    else {
      __n = *(long *)(this + 0x40) - (long)__src;
      if (__n != 0) {
        memmove(__dest,__src,__n);
      }
      bVar12 = false;
      *(undefined1 **)(this + 0x40) = __dest + __n;
    }
joined_r0x00999128:
    if ((local_1d8 & 1) != 0) {
      operator_delete(local_1c8);
    }
    if (bVar12) {
LAB_009991e8:
      if (*(long *)(lVar10 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  } while( true );
}

