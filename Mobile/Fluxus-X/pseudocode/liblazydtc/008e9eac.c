/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9eac
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >&
   std::__ndk1::__put_character_sequence<char, std::__ndk1::char_traits<char>
   >(std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >&, char const*, unsigned long)
    */

basic_ostream *
std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
          (basic_ostream *param_1,char *param_2,ulong param_3)

{
  basic_ostream *pbVar1;
  char *pcVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  long *plVar7;
  undefined8 uVar8;
  sentry local_70 [8];
  basic_ostream *local_68;
  locale alStack_60 [8];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_70[0] = (sentry)0x0;
  plVar7 = (long *)(*(long *)param_1 + -0x18);
  local_68 = param_1;
  if (*(int *)(param_1 + *plVar7 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(param_1 + *plVar7 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 008e9f04 to 008e9f07 has its CatchHandler @ 008e9ff8 */
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(param_1 + *plVar7 + 0x88))
      ;
      plVar7 = (long *)(*(long *)param_1 + -0x18);
    }
    local_70[0] = (sentry)0x1;
    pbVar1 = param_1 + *plVar7;
    uVar8 = *(undefined8 *)(pbVar1 + 0x28);
    uVar3 = *(uint *)(pbVar1 + 8);
    if (*(int *)(pbVar1 + 0x90) == -1) {
                    /* try { // try from 008e9f34 to 008e9f3f has its CatchHandler @ 008ea010 */
      ios_base::getloc();
                    /* try { // try from 008e9f40 to 008e9f5f has its CatchHandler @ 008ea000 */
      plVar7 = (long *)locale::use_facet(alStack_60,(id *)&ctype<char>::id);
      uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,0x20);
      locale::~locale(alStack_60);
      *(uint *)(pbVar1 + 0x90) = uVar5 & 0xff;
    }
    pcVar2 = param_2 + param_3;
    if ((uVar3 & 0xb0) != 0x20) {
      pcVar2 = param_2;
    }
                    /* try { // try from 008e9f88 to 008e9f97 has its CatchHandler @ 008ea010 */
    lVar6 = FUN_008ea050(uVar8,param_2,pcVar2,param_2 + param_3,pbVar1);
    if (lVar6 == 0) {
                    /* try { // try from 008e9fb4 to 008e9fb7 has its CatchHandler @ 008e9ff4 */
      ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                      *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20)
                      | 5);
    }
  }
  basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_70);
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_1;
}

