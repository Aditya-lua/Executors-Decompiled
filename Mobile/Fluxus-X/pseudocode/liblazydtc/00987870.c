/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987870
 */

/* ix::createSocket(bool, int, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&, ix::SocketTLSOptions const&) */

void __thiscall
ix::createSocket(ix *this,bool param_1,int param_2,basic_string_conflict *param_3,
                SocketTLSOptions *param_4)

{
  Socket *this_00;
  ulong uVar1;
  byte *pbVar2;
  undefined8 *in_x8;
  long lVar3;
  
  pbVar2 = (byte *)(ulong)(uint)param_2;
  if ((*pbVar2 & 1) == 0) {
    pbVar2[0] = 0;
    pbVar2[1] = 0;
    *in_x8 = 0;
  }
  else {
    **(undefined1 **)(pbVar2 + 0x10) = 0;
    pbVar2[8] = 0;
    pbVar2[9] = 0;
    pbVar2[10] = 0;
    pbVar2[0xb] = 0;
    pbVar2[0xc] = 0;
    pbVar2[0xd] = 0;
    pbVar2[0xe] = 0;
    pbVar2[0xf] = 0;
    *in_x8 = 0;
  }
  if (((ulong)this & 1) == 0) {
                    /* try { // try from 009878a8 to 009878af has its CatchHandler @ 0098795c */
    this_00 = operator_new(0x40);
                    /* try { // try from 009878b4 to 009878bb has its CatchHandler @ 00987944 */
    Socket::Socket(this_00,(uint)param_1);
  }
  else {
                    /* try { // try from 009878d4 to 009878db has its CatchHandler @ 0098793c */
    this_00 = operator_new(0x108);
                    /* try { // try from 009878e0 to 009878eb has its CatchHandler @ 00987938 */
    SocketOpenSSL::SocketOpenSSL((SocketOpenSSL *)this_00,(SocketTLSOptions *)param_3,(uint)param_1)
    ;
  }
  *in_x8 = this_00;
                    /* try { // try from 009878f0 to 009878fb has its CatchHandler @ 00987964 */
  uVar1 = Socket::init((basic_string_conflict *)this_00);
  if ((uVar1 & 1) == 0) {
    lVar3 = *(long *)this_00;
    *in_x8 = 0;
                    /* WARNING: Could not recover jumptable at 0x00987934. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(lVar3 + 8))(this_00);
    return;
  }
  return;
}

