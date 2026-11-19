/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099179c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_184(void)

{
  _DAT_00d21720 = 0;
  ix::WebSocketCloseConstants::kNormalClosureMessage = 0x1c;
  DAT_00d21711._0_6_ = 0x6c616d726f4e;
  DAT_00d21711._6_2_ = 0x6320;
  uRam0000000000d21719 = 0x657275736f6c;
  DAT_00d2171f = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kNormalClosureMessage,&PTR_LOOP_00c48880)
  ;
  DAT_00d21738 = 0;
  ix::WebSocketCloseConstants::kInternalErrorMessage = 0x1c;
  DAT_00d21729._0_6_ = 0x6e7265746e49;
  DAT_00d21729._6_2_ = 0x6c61;
  uRam0000000000d21731 = 0x726f72726520;
  DAT_00d21737 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kInternalErrorMessage,&PTR_LOOP_00c48880)
  ;
  uRam0000000000d21752 = 0;
  ix::WebSocketCloseConstants::kAbnormalCloseMessage = 0x20;
  uRam0000000000d21749 = 0x7275736f6c6320;
  DAT_00d21750 = 0x65;
  _DAT_00d21741 = 0x616d726f6e6241;
  DAT_00d21748 = 0x6c;
  DAT_00d21751 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kAbnormalCloseMessage,&PTR_LOOP_00c48880)
  ;
  uRam0000000000d21766 = 0;
  DAT_00d21768 = 0;
  ix::WebSocketCloseConstants::kPingTimeoutMessage = 0x18;
  _DAT_00d21761 = 0x74756f65;
  DAT_00d21759._0_7_ = 0x697420676e6950;
  DAT_00d21759._7_1_ = 0x6d;
  DAT_00d21765 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kPingTimeoutMessage,&PTR_LOOP_00c48880);
  _DAT_00d21780 = 0;
  ix::WebSocketCloseConstants::kProtocolErrorMessage = 0x1c;
  DAT_00d21771._0_6_ = 0x636f746f7250;
  DAT_00d21771._6_2_ = 0x6c6f;
  uRam0000000000d21779 = 0x726f72726520;
  DAT_00d2177f = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kProtocolErrorMessage,&PTR_LOOP_00c48880)
  ;
  DAT_00d21798 = 0;
  ix::WebSocketCloseConstants::kNoStatusCodeErrorMessage = 0x1c;
  DAT_00d21789._0_6_ = 0x617473206f4e;
  DAT_00d21789._6_2_ = 0x7574;
  uRam0000000000d21791 = 0x65646f632073;
  DAT_00d21797 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kNoStatusCodeErrorMessage,
               &PTR_LOOP_00c48880);
  ix::WebSocketCloseConstants::kProtocolErrorReservedBitUsed = 0x22;
  DAT_00d217b0._3_5_ = 0;
  DAT_00d217b0._1_2_ = 100;
  DAT_00d217a8._1_7_ = 0x73752074696220;
  DAT_00d217b0._0_1_ = 0x65;
  _DAT_00d217a1 = 0x65767265736552;
  DAT_00d217a8._0_1_ = 100;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kProtocolErrorReservedBitUsed,
               &PTR_LOOP_00c48880);
  _DAT_00d217c0 = 0;
  DAT_00d217c8 = (char *)0x0;
  ix::WebSocketCloseConstants::kProtocolErrorPingPayloadOversized = 0;
  DAT_00d217c8 = operator_new(0x40);
  builtin_strncpy(DAT_00d217c8,"Ping reason control frame with payload length > 125 octets",0x3b);
  _DAT_00d217c0 = 0x3a;
  ix::WebSocketCloseConstants::kProtocolErrorPingPayloadOversized = 0x41;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kProtocolErrorPingPayloadOversized,
               &PTR_LOOP_00c48880);
  _DAT_00d217d8 = 0;
  DAT_00d217e0 = (char *)0x0;
  ix::WebSocketCloseConstants::kProtocolErrorCodeControlMessageFragmented = 0;
  DAT_00d217e0 = operator_new(0x20);
  builtin_strncpy(DAT_00d217e0,"Control message fragmented",0x1b);
  _DAT_00d217d8 = 0x1a;
  ix::WebSocketCloseConstants::kProtocolErrorCodeControlMessageFragmented = 0x21;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,
               &ix::WebSocketCloseConstants::kProtocolErrorCodeControlMessageFragmented,
               &PTR_LOOP_00c48880);
  _DAT_00d217f0 = 0;
  DAT_00d217f8 = (char *)0x0;
  ix::WebSocketCloseConstants::kProtocolErrorCodeDataOpcodeOutOfSequence = 0;
  DAT_00d217f8 = operator_new(0x30);
  builtin_strncpy(DAT_00d217f8,"Fragmentation: data message out of sequence",0x2c);
  _DAT_00d217f0 = 0x2b;
  ix::WebSocketCloseConstants::kProtocolErrorCodeDataOpcodeOutOfSequence = 0x31;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kProtocolErrorCodeDataOpcodeOutOfSequence
               ,&PTR_LOOP_00c48880);
  _DAT_00d21808 = 0;
  DAT_00d21810 = (char *)0x0;
  ix::WebSocketCloseConstants::kProtocolErrorCodeContinuationOpCodeOutOfSequence = 0;
  DAT_00d21810 = operator_new(0x40);
  builtin_strncpy(DAT_00d21810,"Fragmentation: continuation opcode out of sequence",0x33);
  _DAT_00d21808 = 0x32;
  ix::WebSocketCloseConstants::kProtocolErrorCodeContinuationOpCodeOutOfSequence = 0x41;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,
               &ix::WebSocketCloseConstants::kProtocolErrorCodeContinuationOpCodeOutOfSequence,
               &PTR_LOOP_00c48880);
  DAT_00d21820 = 0;
  DAT_00d21828 = (char *)0x0;
  _kInvalidFramePayloadDataMessage = 0;
  DAT_00d21828 = operator_new(0x20);
  builtin_strncpy(DAT_00d21828,"Invalid frame payload data",0x1b);
  DAT_00d21820 = 0x1a;
  _kInvalidFramePayloadDataMessage = 0x21;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kInvalidFramePayloadDataMessage,
               &PTR_LOOP_00c48880);
  DAT_00d21840._4_4_ = 0;
  ix::WebSocketCloseConstants::kInvalidCloseCodeMessage = 0x24;
  DAT_00d21840._1_2_ = 0x6564;
  DAT_00d21838._1_7_ = 0x632065736f6c63;
  DAT_00d21840._0_1_ = 0x6f;
  _DAT_00d21831 = 0x64696c61766e49;
  DAT_00d21838._0_1_ = 0x20;
  DAT_00d21840._3_1_ = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::WebSocketCloseConstants::kInvalidCloseCodeMessage,
               &PTR_LOOP_00c48880);
  return;
}

