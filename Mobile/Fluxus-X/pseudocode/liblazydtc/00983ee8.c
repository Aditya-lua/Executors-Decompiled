/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00983ee8
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x00984180 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::HttpRequest::HttpRequest(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&) */

void __thiscall
ix::HttpRequest::HttpRequest
          (HttpRequest *this,basic_string_conflict *param_1,basic_string_conflict *param_2,
          basic_string_conflict *param_3,basic_string_conflict *param_4,map *param_5)

{
  long lVar1;
  HttpRequest *pHVar2;
  __tree_node_base *p_Var3;
  map *pmVar4;
  map *pmVar5;
  long lVar6;
  map *pmVar7;
  HttpRequest *pHVar8;
  void *pvVar9;
  ulong uVar10;
  pair *ppVar11;
  HttpRequest *pHVar12;
  ulong uVar13;
  map *pmVar14;
  undefined8 uVar15;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  __tree_node_base *p_Stack_80;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  pHVar2 = this;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar15 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar15;
  }
  else {
    uVar10 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar10) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar9 = *(void **)(param_1 + 0x10);
    if (uVar10 < 0x17) {
      pHVar8 = this + 1;
      *this = SUB41((int)uVar10 << 1,0);
      if (uVar10 != 0) goto LAB_00983f98;
    }
    else {
      uVar13 = uVar10 + 0x10 & 0xfffffffffffffff0;
      pHVar8 = operator_new(uVar13);
      *(ulong *)(this + 8) = uVar10;
      *(HttpRequest **)(this + 0x10) = pHVar8;
      *(ulong *)this = uVar13 | 1;
      pHVar2 = pHVar8;
LAB_00983f98:
      memcpy(pHVar8,pvVar9,uVar10);
    }
    pHVar8[uVar10] = (HttpRequest)0x0;
  }
  pHVar8 = this + 0x18;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if (((byte)*param_2 & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_2 + 0x10);
    uVar15 = *(undefined8 *)param_2;
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_2 + 8);
    *(undefined8 *)pHVar8 = uVar15;
  }
  else {
    uVar10 = *(ulong *)(param_2 + 8);
    if (0xffffffffffffffef < uVar10) {
                    /* try { // try from 00984280 to 00984287 has its CatchHandler @ 009842b8 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar9 = *(void **)(param_2 + 0x10);
    if (uVar10 < 0x17) {
      pHVar12 = this + 0x19;
      *pHVar8 = SUB41((int)uVar10 << 1,0);
      if (uVar10 != 0) goto LAB_00984020;
    }
    else {
      uVar13 = uVar10 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00984008 to 0098400f has its CatchHandler @ 009842b8 */
      pHVar12 = operator_new(uVar13);
      *(ulong *)(this + 0x20) = uVar10;
      *(HttpRequest **)(this + 0x28) = pHVar12;
      *(ulong *)(this + 0x18) = uVar13 | 1;
      pHVar2 = pHVar12;
LAB_00984020:
      memcpy(pHVar12,pvVar9,uVar10);
    }
    pHVar12[uVar10] = (HttpRequest)0x0;
  }
  pHVar8 = this + 0x30;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if (((byte)*param_3 & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_3 + 0x10);
    uVar15 = *(undefined8 *)param_3;
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_3 + 8);
    *(undefined8 *)pHVar8 = uVar15;
  }
  else {
    uVar10 = *(ulong *)(param_3 + 8);
    if (0xffffffffffffffef < uVar10) {
                    /* try { // try from 00984288 to 0098428f has its CatchHandler @ 009842a8 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar9 = *(void **)(param_3 + 0x10);
    if (uVar10 < 0x17) {
      pHVar12 = this + 0x31;
      *pHVar8 = SUB41((int)uVar10 << 1,0);
      if (uVar10 != 0) goto LAB_009840a8;
    }
    else {
      uVar13 = uVar10 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00984090 to 00984097 has its CatchHandler @ 009842a8 */
      pHVar12 = operator_new(uVar13);
      *(ulong *)(this + 0x38) = uVar10;
      *(HttpRequest **)(this + 0x40) = pHVar12;
      *(ulong *)(this + 0x30) = uVar13 | 1;
      pHVar2 = pHVar12;
LAB_009840a8:
      memcpy(pHVar12,pvVar9,uVar10);
    }
    pHVar12[uVar10] = (HttpRequest)0x0;
  }
  pHVar8 = this + 0x48;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x58) = 0;
  if (((byte)*param_4 & 1) == 0) {
    *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_4 + 0x10);
    uVar15 = *(undefined8 *)param_4;
    *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_4 + 8);
    *(undefined8 *)pHVar8 = uVar15;
    goto LAB_00984148;
  }
  uVar10 = *(ulong *)(param_4 + 8);
  if (0xffffffffffffffef < uVar10) {
                    /* try { // try from 00984290 to 00984297 has its CatchHandler @ 00984298 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar9 = *(void **)(param_4 + 0x10);
  if (uVar10 < 0x17) {
    pHVar12 = this + 0x49;
    *pHVar8 = SUB41((int)uVar10 << 1,0);
    if (uVar10 != 0) goto LAB_00984134;
  }
  else {
    uVar13 = uVar10 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098411c to 00984123 has its CatchHandler @ 00984298 */
    pHVar12 = operator_new(uVar13);
    *(ulong *)(this + 0x50) = uVar10;
    *(HttpRequest **)(this + 0x58) = pHVar12;
    *(ulong *)(this + 0x48) = uVar13 | 1;
    pHVar2 = pHVar12;
LAB_00984134:
    memcpy(pHVar12,pvVar9,uVar10);
  }
  pHVar12[uVar10] = (HttpRequest)0x0;
LAB_00984148:
  pHVar8 = this + 0x68;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x70) = 0;
  *(HttpRequest **)(this + 0x60) = pHVar8;
  pmVar7 = param_5 + 8;
  if (*(map **)param_5 != pmVar7) {
    ppVar11 = (pair *)(this + 0x60);
    pmVar14 = *(map **)param_5;
    do {
                    /* try { // try from 0098416c to 009841ab has its CatchHandler @ 009842c8 */
      while (pHVar2 = (HttpRequest *)
                      std::__ndk1::
                      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                      ::
                      __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                  *)pHVar2,pHVar8,&local_88,auStack_90,pmVar14 + 0x20),
            *(long *)pHVar2 == 0) {
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::
        __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                  (ppVar11);
        *(undefined8 *)p_Stack_80 = 0;
        *(undefined8 *)(p_Stack_80 + 8) = 0;
        *(undefined8 *)(p_Stack_80 + 0x10) = local_88;
        *(__tree_node_base **)pHVar2 = p_Stack_80;
        p_Var3 = p_Stack_80;
        if (**(long **)ppVar11 != 0) {
          *(long *)ppVar11 = **(long **)ppVar11;
          p_Var3 = *(__tree_node_base **)pHVar2;
        }
        pHVar2 = *(HttpRequest **)(this + 0x68);
        std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                  ((__tree_node_base *)pHVar2,p_Var3);
        *(long *)(this + 0x70) = *(long *)(this + 0x70) + 1;
        pmVar4 = *(map **)(pmVar14 + 8);
        if (*(map **)(pmVar14 + 8) == (map *)0x0) goto LAB_009841fc;
LAB_009841ec:
        do {
          pmVar14 = pmVar4;
          pmVar4 = *(map **)pmVar14;
        } while (*(map **)pmVar14 != (map *)0x0);
LAB_00984228:
        if (pmVar14 == pmVar7) goto LAB_00984240;
      }
      pmVar4 = *(map **)(pmVar14 + 8);
      if (*(map **)(pmVar14 + 8) != (map *)0x0) goto LAB_009841ec;
LAB_009841fc:
      pmVar4 = pmVar14 + 0x10;
      pmVar5 = *(map **)pmVar4;
      if (*(map **)pmVar5 != pmVar14) {
        do {
          lVar6 = *(long *)pmVar4;
          pmVar4 = (map *)(lVar6 + 0x10);
          pmVar14 = *(map **)pmVar4;
        } while (*(long *)pmVar14 != lVar6);
        goto LAB_00984228;
      }
      pmVar14 = pmVar5;
    } while (pmVar5 != pmVar7);
  }
LAB_00984240:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

