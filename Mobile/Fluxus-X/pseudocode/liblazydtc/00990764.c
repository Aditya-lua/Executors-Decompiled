/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00990764
 */

/* ix::WebSocketMessage::WebSocketMessage(ix::WebSocketMessageType, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long,
   ix::WebSocketErrorInfo, ix::WebSocketOpenInfo, ix::WebSocketCloseInfo, bool) */

void __thiscall
ix::WebSocketMessage::WebSocketMessage
          (WebSocketMessage *this,undefined4 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 *param_5,WebSocketOpenInfo *param_6,undefined2 *param_7,byte param_8)

{
  undefined4 uVar1;
  WebSocketMessage WVar2;
  undefined2 uVar3;
  WebSocketMessage *pWVar4;
  WebSocketMessage *pWVar5;
  ulong uVar6;
  void *pvVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  *(undefined4 *)this = param_2;
  *(undefined8 *)(this + 8) = param_3;
  *(undefined8 *)(this + 0x10) = param_4;
  uVar1 = *(undefined4 *)(param_5 + 2);
  uVar10 = param_5[1];
  uVar9 = *param_5;
  pWVar4 = this + 0x30;
  *(undefined8 *)pWVar4 = 0;
  *(undefined4 *)(this + 0x28) = uVar1;
  *(undefined8 *)(this + 0x20) = uVar10;
  *(undefined8 *)(this + 0x18) = uVar9;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if ((*(byte *)(param_5 + 3) & 1) == 0) {
    *(undefined8 *)(this + 0x40) = param_5[5];
    uVar9 = param_5[3];
    *(undefined8 *)(this + 0x38) = param_5[4];
    *(undefined8 *)pWVar4 = uVar9;
  }
  else {
    uVar6 = param_5[4];
    if (0xffffffffffffffef < uVar6) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar7 = (void *)param_5[5];
    if (uVar6 < 0x17) {
      pWVar5 = this + 0x31;
      *pWVar4 = SUB41((int)uVar6 << 1,0);
      if (uVar6 != 0) goto LAB_00990824;
    }
    else {
      uVar8 = uVar6 + 0x10 & 0xfffffffffffffff0;
      pWVar5 = operator_new(uVar8);
      *(ulong *)(this + 0x38) = uVar6;
      *(WebSocketMessage **)(this + 0x40) = pWVar5;
      *(ulong *)(this + 0x30) = uVar8 | 1;
LAB_00990824:
      memcpy(pWVar5,pvVar7,uVar6);
    }
    pWVar5[uVar6] = (WebSocketMessage)0x0;
  }
  this[0x48] = *(WebSocketMessage *)(param_5 + 6);
                    /* try { // try from 00990844 to 0099084b has its CatchHandler @ 00990964 */
  WebSocketOpenInfo::WebSocketOpenInfo((WebSocketOpenInfo *)(this + 0x50),param_6);
  uVar3 = *param_7;
  pWVar4 = this + 0xa0;
  *(undefined8 *)pWVar4 = 0;
  *(undefined8 *)(this + 0xa8) = 0;
  *(undefined8 *)(this + 0xb0) = 0;
  *(undefined2 *)(this + 0x98) = uVar3;
  if ((*(byte *)(param_7 + 4) & 1) == 0) {
    *(undefined8 *)(this + 0xb0) = *(undefined8 *)(param_7 + 0xc);
    uVar9 = *(undefined8 *)(param_7 + 4);
    *(undefined8 *)(this + 0xa8) = *(undefined8 *)(param_7 + 8);
    *(undefined8 *)pWVar4 = uVar9;
    goto LAB_009908dc;
  }
  uVar6 = *(ulong *)(param_7 + 8);
  if (0xffffffffffffffef < uVar6) {
                    /* try { // try from 00990910 to 00990917 has its CatchHandler @ 00990918 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar7 = *(void **)(param_7 + 0xc);
  if (uVar6 < 0x17) {
    pWVar5 = this + 0xa1;
    *pWVar4 = SUB41((int)uVar6 << 1,0);
    if (uVar6 != 0) goto LAB_009908c8;
  }
  else {
    uVar8 = uVar6 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009908b0 to 009908b7 has its CatchHandler @ 00990918 */
    pWVar5 = operator_new(uVar8);
    *(ulong *)(this + 0xa8) = uVar6;
    *(WebSocketMessage **)(this + 0xb0) = pWVar5;
    *(ulong *)(this + 0xa0) = uVar8 | 1;
LAB_009908c8:
    memcpy(pWVar5,pvVar7,uVar6);
  }
  pWVar5[uVar6] = (WebSocketMessage)0x0;
LAB_009908dc:
  WVar2 = *(WebSocketMessage *)(param_7 + 0x10);
  this[0xc0] = (WebSocketMessage)(param_8 & 1);
  this[0xb8] = WVar2;
  return;
}

