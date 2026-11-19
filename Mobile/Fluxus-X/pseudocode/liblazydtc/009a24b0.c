/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a24b0
 */

/* bool ix::WebSocketPerMessageDeflateCompressor::compressData<ix::IXWebSocketSendData,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   >(ix::IXWebSocketSendData const&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

bool __thiscall
ix::WebSocketPerMessageDeflateCompressor::
compressData<ix::IXWebSocketSendData,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
          (WebSocketPerMessageDeflateCompressor *this,IXWebSocketSendData *param_1,
          basic_string_conflict *param_2)

{
  WebSocketPerMessageDeflateCompressor *pWVar1;
  ulong uVar2;
  ulong uVar3;
  basic_string_conflict *pbVar4;
  basic_string_conflict *pbVar5;
  basic_string_conflict bVar6;
  long lVar7;
  
  if (((byte)*param_2 & 1) == 0) {
    *(undefined2 *)param_2 = 0;
    lVar7 = *(long *)param_1;
  }
  else {
    **(undefined1 **)(param_2 + 0x10) = 0;
    *(undefined8 *)(param_2 + 8) = 0;
    lVar7 = *(long *)param_1;
  }
  if ((lVar7 == 0) || (*(long *)(param_1 + 8) == 0)) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              param_2,'\x02');
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              param_2,'\0');
  }
  else {
    pWVar1 = this + 0x4028;
    *(int *)(this + 0x4010) = (int)*(long *)(param_1 + 8);
    *(long *)(this + 0x4008) = lVar7;
    do {
      *(uint *)pWVar1 = 0x4000;
      *(WebSocketPerMessageDeflateCompressor **)(this + 0x4020) = this + 4;
      deflate(this + 0x4008,*(undefined4 *)this);
      uVar2 = (ulong)((byte)*param_2 >> 1);
      pbVar4 = param_2 + 1;
      if (((byte)*param_2 & 1) != 0) {
        uVar2 = *(ulong *)(param_2 + 8);
        pbVar4 = *(basic_string_conflict **)(param_2 + 0x10);
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      insert<unsigned_char*>
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 param_2,pbVar4 + uVar2,this + 4,this + (0x4004 - (ulong)*(uint *)pWVar1));
    } while (*(uint *)pWVar1 == 0);
    bVar6 = *param_2;
    uVar2 = (ulong)(DAT_00d21850 >> 1);
    if ((DAT_00d21850 & 1) != 0) {
      uVar2 = DAT_00d21858;
    }
    uVar3 = (ulong)((byte)bVar6 >> 1);
    if (((byte)bVar6 & 1) != 0) {
      uVar3 = *(ulong *)(param_2 + 8);
    }
    if (uVar2 <= uVar3) {
      pbVar4 = param_2 + 1;
      if (((byte)bVar6 & 1) != 0) {
        pbVar4 = *(basic_string_conflict **)(param_2 + 0x10);
      }
      pbVar5 = DAT_00d21860;
      if ((DAT_00d21850 & 1) == 0) {
        pbVar5 = (basic_string_conflict *)&DAT_00d21851;
      }
      if ((((pbVar4[uVar3 - 1] == pbVar5[3]) && (pbVar4[uVar3 - 2] == pbVar5[2])) &&
          (pbVar4[uVar3 - 3] == pbVar5[1])) && (lVar7 = uVar3 - 4, pbVar4[lVar7] == *pbVar5)) {
        if (uVar3 < 4) {
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_2,0xfffffffffffffffc,'\0');
        }
        else if (((byte)bVar6 & 1) == 0) {
          param_2[uVar3 - 3] = (basic_string_conflict)0x0;
          *param_2 = SUB41((int)lVar7 << 1,0);
        }
        else {
          (*(basic_string_conflict **)(param_2 + 0x10))[lVar7] = (basic_string_conflict)0x0;
          *(long *)(param_2 + 8) = lVar7;
        }
      }
    }
  }
  return true;
}

