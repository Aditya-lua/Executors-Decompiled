/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a34fc
 */

/* ix::SocketTLSOptions::SocketTLSOptions(ix::SocketTLSOptions const&) */

void __thiscall
ix::SocketTLSOptions::SocketTLSOptions(SocketTLSOptions *this,SocketTLSOptions *param_1)

{
  undefined2 uVar1;
  SocketTLSOptions *pSVar2;
  SocketTLSOptions *pSVar3;
  ulong uVar4;
  void *pvVar5;
  ulong uVar6;
  undefined8 uVar7;
  
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar7 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar4) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x10);
    if (uVar4 < 0x17) {
      pSVar2 = this + 1;
      *this = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_009a3590;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
      pSVar2 = operator_new(uVar6);
      *(ulong *)(this + 8) = uVar4;
      *(SocketTLSOptions **)(this + 0x10) = pSVar2;
      *(ulong *)this = uVar6 | 1;
LAB_009a3590:
      memcpy(pSVar2,pvVar5,uVar4);
    }
    pSVar2[uVar4] = (SocketTLSOptions)0x0;
  }
  pSVar2 = this + 0x18;
  *(undefined8 *)pSVar2 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if (((byte)param_1[0x18] & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
    uVar7 = *(undefined8 *)(param_1 + 0x18);
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
    *(undefined8 *)pSVar2 = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x20);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 009a3804 to 009a380b has its CatchHandler @ 009a38a4 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x28);
    if (uVar4 < 0x17) {
      pSVar3 = this + 0x19;
      *pSVar2 = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_009a361c;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009a3604 to 009a360b has its CatchHandler @ 009a38a4 */
      pSVar3 = operator_new(uVar6);
      *(ulong *)(this + 0x20) = uVar4;
      *(SocketTLSOptions **)(this + 0x28) = pSVar3;
      *(ulong *)(this + 0x18) = uVar6 | 1;
LAB_009a361c:
      memcpy(pSVar3,pvVar5,uVar4);
    }
    pSVar3[uVar4] = (SocketTLSOptions)0x0;
  }
  pSVar2 = this + 0x30;
  *(undefined8 *)pSVar2 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if (((byte)param_1[0x30] & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_1 + 0x40);
    uVar7 = *(undefined8 *)(param_1 + 0x30);
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
    *(undefined8 *)pSVar2 = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x38);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 009a380c to 009a3813 has its CatchHandler @ 009a3884 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x40);
    if (uVar4 < 0x17) {
      pSVar3 = this + 0x31;
      *pSVar2 = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_009a36a8;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009a3690 to 009a3697 has its CatchHandler @ 009a3884 */
      pSVar3 = operator_new(uVar6);
      *(ulong *)(this + 0x38) = uVar4;
      *(SocketTLSOptions **)(this + 0x40) = pSVar3;
      *(ulong *)(this + 0x30) = uVar6 | 1;
LAB_009a36a8:
      memcpy(pSVar3,pvVar5,uVar4);
    }
    pSVar3[uVar4] = (SocketTLSOptions)0x0;
  }
  pSVar2 = this + 0x48;
  *(undefined8 *)pSVar2 = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x58) = 0;
  if (((byte)param_1[0x48] & 1) == 0) {
    *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_1 + 0x58);
    uVar7 = *(undefined8 *)(param_1 + 0x48);
    *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 0x50);
    *(undefined8 *)pSVar2 = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x50);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 009a3814 to 009a381b has its CatchHandler @ 009a3864 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x58);
    if (uVar4 < 0x17) {
      pSVar3 = this + 0x49;
      *pSVar2 = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_009a3734;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009a371c to 009a3723 has its CatchHandler @ 009a3864 */
      pSVar3 = operator_new(uVar6);
      *(ulong *)(this + 0x50) = uVar4;
      *(SocketTLSOptions **)(this + 0x58) = pSVar3;
      *(ulong *)(this + 0x48) = uVar6 | 1;
LAB_009a3734:
      memcpy(pSVar3,pvVar5,uVar4);
    }
    pSVar3[uVar4] = (SocketTLSOptions)0x0;
  }
  uVar1 = *(undefined2 *)(param_1 + 0x60);
  pSVar2 = this + 0x68;
  *(undefined8 *)pSVar2 = 0;
  *(undefined8 *)(this + 0x70) = 0;
  *(undefined8 *)(this + 0x78) = 0;
  *(undefined2 *)(this + 0x60) = uVar1;
  if (((byte)param_1[0x68] & 1) == 0) {
    *(undefined8 *)(this + 0x78) = *(undefined8 *)(param_1 + 0x78);
    uVar7 = *(undefined8 *)(param_1 + 0x68);
    *(undefined8 *)(this + 0x70) = *(undefined8 *)(param_1 + 0x70);
    *(undefined8 *)pSVar2 = uVar7;
    goto LAB_009a37d8;
  }
  uVar4 = *(ulong *)(param_1 + 0x70);
  if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 009a381c to 009a3823 has its CatchHandler @ 009a3824 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar5 = *(void **)(param_1 + 0x78);
  if (uVar4 < 0x17) {
    pSVar3 = this + 0x69;
    *pSVar2 = SUB41((int)uVar4 << 1,0);
    if (uVar4 != 0) goto LAB_009a37c4;
  }
  else {
    uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009a37ac to 009a37b3 has its CatchHandler @ 009a3824 */
    pSVar3 = operator_new(uVar6);
    *(ulong *)(this + 0x70) = uVar4;
    *(SocketTLSOptions **)(this + 0x78) = pSVar3;
    *(ulong *)(this + 0x68) = uVar6 | 1;
LAB_009a37c4:
    memcpy(pSVar3,pvVar5,uVar4);
  }
  pSVar3[uVar4] = (SocketTLSOptions)0x0;
LAB_009a37d8:
  this[0x80] = param_1[0x80];
  return;
}

