/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009774dc
 */

/* ix::HttpClient::request(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::unordered_map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::unordered_map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::hash<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::equal_to<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::shared_ptr<ix::HttpRequestArgs>) */

void ix::HttpClient::request
               (undefined8 param_1_00,HttpClient *param_1,undefined8 param_2,undefined8 param_3,
               unordered_map *param_4,unordered_map *param_6,long *param_7)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  ulong uVar3;
  char cVar4;
  bool bVar5;
  long lVar6;
  char *pcVar7;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this;
  basic_string_conflict *extraout_x1;
  basic_string_conflict *extraout_x1_00;
  basic_string_conflict *extraout_x1_01;
  basic_string_conflict *extraout_x1_02;
  basic_string_conflict *extraout_x1_03;
  basic_string_conflict *pbVar8;
  long lVar9;
  long local_c0;
  __shared_weak_count *local_b8;
  ulong local_b0;
  ulong uStack_a8;
  char *local_a0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_98;
  undefined7 uStack_97;
  ulong uStack_90;
  char *local_88;
  ulong local_80;
  ulong uStack_78;
  char *local_70;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  uStack_78 = 0;
  local_70 = (undefined1 *)0x0;
  local_80 = 0;
  if (*(long *)(param_6 + 0x18) == 0) {
                    /* try { // try from 00977598 to 009775a7 has its CatchHandler @ 00977754 */
    serializeHttpParameters(param_1,param_4);
    pbVar8 = extraout_x1_00;
    if ((local_80 & 1) != 0) {
      *local_70 = 0;
      uStack_78 = 0;
      if ((local_80 & 1) != 0) {
        operator_delete(local_70);
        pbVar8 = extraout_x1_03;
      }
    }
    local_80 = CONCAT71(uStack_97,local_98);
    local_70 = local_88;
    uStack_78 = uStack_90;
  }
  else {
                    /* try { // try from 00977534 to 0097753f has its CatchHandler @ 00977780 */
    generateMultipartBoundary(param_1);
    this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (*param_7 + 0x60);
    if (this != &local_98) {
      uVar3 = (ulong)((byte)local_98 >> 1);
      pcVar7 = (char *)((ulong)&local_98 | 1);
      if (((byte)local_98 & 1) != 0) {
        uVar3 = uStack_90;
        pcVar7 = local_88;
      }
                    /* try { // try from 00977570 to 00977573 has its CatchHandler @ 00977758 */
      this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             std::__ndk1::
             basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                       (this,pcVar7,uVar3);
    }
                    /* try { // try from 00977574 to 00977587 has its CatchHandler @ 00977760 */
    serializeHttpFormDataParameters
              ((HttpClient *)this,(basic_string_conflict *)&local_98,param_6,param_4);
    pbVar8 = extraout_x1;
    if ((local_80 & 1) != 0) {
      *local_70 = 0;
      uStack_78 = 0;
      if ((local_80 & 1) != 0) {
        operator_delete(local_70);
        pbVar8 = extraout_x1_01;
      }
    }
    local_70 = local_a0;
    uStack_78 = uStack_a8;
    local_80 = local_b0;
    if (((byte)local_98 & 1) != 0) {
      operator_delete(local_88);
      pbVar8 = extraout_x1_02;
    }
  }
  local_c0 = *param_7;
  if (*(char *)(local_c0 + 0x8a) != '\0') {
                    /* try { // try from 00977638 to 00977643 has its CatchHandler @ 0097775c */
    gzipCompress((ix *)&local_80,pbVar8);
    if ((local_80 & 1) != 0) {
      *local_70 = '\0';
      uStack_78 = 0;
      if ((local_80 & 1) != 0) {
        operator_delete(local_70);
      }
    }
    local_80 = CONCAT71(uStack_97,local_98);
    local_70 = local_88;
    uStack_78 = uStack_90;
    local_c0 = *param_7;
  }
  local_b8 = (__shared_weak_count *)param_7[1];
  if (local_b8 != (__shared_weak_count *)0x0) {
    p_Var1 = local_b8 + 8;
    do {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar5) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
  }
                    /* try { // try from 009776ac to 009776cb has its CatchHandler @ 00977790 */
  request(param_1_00,param_1,param_2,param_3,&local_80,&local_c0,0);
  p_Var1 = local_b8;
  if (local_b8 != (__shared_weak_count *)0x0) {
    p_Var2 = local_b8 + 8;
    do {
      lVar9 = *(long *)p_Var2;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar5) {
        *(long *)p_Var2 = lVar9 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar9 == 0) {
      (**(code **)(*(long *)local_b8 + 0x10))(local_b8);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  if ((local_80 & 1) != 0) {
    operator_delete(local_70);
  }
  if (*(long *)(lVar6 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

