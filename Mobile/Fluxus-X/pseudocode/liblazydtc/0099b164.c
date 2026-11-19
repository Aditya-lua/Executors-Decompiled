/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099b164
 */

/* ix::WebSocketHandshake::genRandomString(int) */

void ix::WebSocketHandshake::genRandomString(int param_1)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  char *pcVar5;
  int in_w1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  ulong uVar6;
  long lVar7;
  undefined8 local_70;
  basic_string_conflict local_68;
  undefined7 uStack_67;
  undefined1 uStack_60;
  undefined4 local_5f;
  undefined1 local_5b;
  undefined2 uStack_5a;
  void *local_58;
  random_device arStack_50 [8];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  pcVar5 = operator_new(0x20);
  uStack_5a = 0;
  local_68 = (basic_string_conflict)0x18;
  builtin_strncpy(pcVar5,"0123456789ABCDEFGHabcdefgh",0x1b);
  local_58 = (void *)0x0;
  local_5f = 0x6d6f646e;
  uStack_67 = 0x72752f7665642f;
  uStack_60 = 0x61;
  local_5b = 0;
                    /* try { // try from 0099b1e8 to 0099b1f3 has its CatchHandler @ 0099b304 */
  std::__ndk1::random_device::random_device(arStack_50,&local_68);
  if (((byte)local_68 & 1) != 0) {
    operator_delete(local_58);
  }
                    /* try { // try from 0099b204 to 0099b20b has its CatchHandler @ 0099b2fc */
  uVar3 = std::__ndk1::random_device::operator()(arStack_50);
  iVar4 = (int)((ulong)uVar3 + (ulong)uVar3 * 2 >> 0x20);
  uVar3 = uVar3 + (iVar4 + (uVar3 - iVar4 >> 1) >> 0x1e) * -0x7fffffff;
  uVar6 = (ulong)uVar3;
  if (uVar3 == 0) {
    uVar6 = 1;
  }
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  local_70 = 0x1900000000;
  local_68 = SUB81(uVar6,0);
  uStack_67 = (undefined7)(uVar6 >> 8);
  if (in_w1 == 0) {
    in_x8[1] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    *in_x8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  else {
                    /* try { // try from 0099b254 to 0099b263 has its CatchHandler @ 0099b2f8 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append(in_x8,(long)in_w1,'\0');
    if (0 < in_w1) {
      lVar7 = 0;
      do {
                    /* try { // try from 0099b274 to 0099b283 has its CatchHandler @ 0099b31c */
        iVar4 = std::__ndk1::uniform_int_distribution<int>::operator()
                          ((uniform_int_distribution<int> *)&local_70,
                           (linear_congruential_engine *)&local_68,(param_type *)&local_70);
        pbVar1 = in_x8 + 1;
        if (((byte)*in_x8 & 1) != 0) {
          pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     **)(in_x8 + 0x10);
        }
        pbVar1[lVar7] =
             *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              (pcVar5 + iVar4);
        lVar7 = lVar7 + 1;
      } while (lVar7 < in_w1);
    }
  }
  std::__ndk1::random_device::~random_device(arStack_50);
  operator_delete(pcVar5);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

