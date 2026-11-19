/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099aa10
 */

/* void 
   ix::WebSocketTransport::appendToSendBuffer<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>
   >(std::__ndk1::vector<unsigned char, std::__ndk1::allocator<unsigned char> > const&,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>, unsigned long, unsigned char*)
    */

void __thiscall
ix::WebSocketTransport::
appendToSendBuffer<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
          (WebSocketTransport *this,undefined8 *param_1,undefined8 *param_3,undefined8 *param_4,
          ulong param_5,long param_6)

{
  long lVar1;
  ulong uVar2;
  undefined8 local_68;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(this + 0x68));
                    /* try { // try from 0099aa68 to 0099aa6f has its CatchHandler @ 0099ab10 */
  std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
  insert<std::__ndk1::__wrap_iter<unsigned_char_const*>>
            ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)(this + 0x50),
             *(undefined8 *)(this + 0x58),*param_1,param_1[1]);
  local_60 = *param_3;
  local_68 = *param_4;
                    /* try { // try from 0099aa84 to 0099aa93 has its CatchHandler @ 0099ab0c */
  std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
  insert<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
            ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)(this + 0x50),
             *(undefined8 *)(this + 0x58),&local_60,&local_68);
  if ((((byte)this[0x18] & 1) != 0) && (param_5 != 0)) {
    uVar2 = 0;
    do {
      *(byte *)((*(long *)(this + 0x58) - param_5) + uVar2) =
           *(byte *)((*(long *)(this + 0x58) - param_5) + uVar2) ^ *(byte *)(param_6 + (uVar2 & 3));
      uVar2 = uVar2 + 1;
    } while (uVar2 != param_5);
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x68));
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

