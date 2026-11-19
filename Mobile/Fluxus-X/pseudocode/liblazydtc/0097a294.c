/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097a294
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x0097a3a4 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::HttpResponse::HttpResponse(int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, ix::HttpErrorCode const&,
   std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long, unsigned
   long) */

void __thiscall
ix::HttpResponse::HttpResponse
          (HttpResponse *this,int param_1,basic_string_conflict *param_2,HttpErrorCode *param_3,
          map *param_4,basic_string_conflict *param_5,basic_string_conflict *param_6,ulong param_7,
          ulong param_8)

{
  undefined4 uVar1;
  long lVar2;
  bool bVar3;
  HttpResponse *pHVar4;
  __tree_node_base *p_Var5;
  map *pmVar6;
  long lVar7;
  HttpResponse *pHVar8;
  map *pmVar9;
  ulong uVar10;
  void *pvVar11;
  pair *ppVar12;
  ulong uVar13;
  HttpResponse *__dest;
  undefined8 uVar14;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  __tree_node_base *p_Stack_80;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  *(int *)this = param_1;
  pHVar8 = this + 8;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  pHVar4 = this;
  if (((byte)*param_2 & 1) == 0) {
    *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_2 + 0x10);
    uVar14 = *(undefined8 *)param_2;
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_2 + 8);
    *(undefined8 *)pHVar8 = uVar14;
  }
  else {
    uVar13 = *(ulong *)(param_2 + 8);
    if (0xffffffffffffffef < uVar13) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar11 = *(void **)(param_2 + 0x10);
    if (uVar13 < 0x17) {
      __dest = this + 9;
      *pHVar8 = SUB41((int)uVar13 << 1,0);
      if (uVar13 != 0) goto LAB_0097a350;
    }
    else {
      uVar10 = uVar13 + 0x10 & 0xfffffffffffffff0;
      __dest = operator_new(uVar10);
      *(ulong *)(this + 0x10) = uVar13;
      *(HttpResponse **)(this + 0x18) = __dest;
      *(ulong *)(this + 8) = uVar10 | 1;
      pHVar4 = __dest;
LAB_0097a350:
      memcpy(__dest,pvVar11,uVar13);
    }
    __dest[uVar13] = (HttpResponse)0x0;
  }
  uVar1 = *(undefined4 *)param_3;
  pHVar8 = this + 0x30;
  *(undefined8 *)pHVar8 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined4 *)(this + 0x20) = uVar1;
  *(HttpResponse **)(this + 0x28) = pHVar8;
  ppVar12 = (pair *)(this + 0x28);
  pmVar9 = *(map **)param_4;
joined_r0x0097a388:
  if (pmVar9 != param_4 + 8) {
    do {
                    /* try { // try from 0097a390 to 0097a3cf has its CatchHandler @ 0097a5ec */
      pHVar4 = (HttpResponse *)
               std::__ndk1::
               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::
               __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                         ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)pHVar4,pHVar8,&local_88,auStack_90,pmVar9 + 0x20);
      if (*(long *)pHVar4 == 0) {
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::
        __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                  (ppVar12);
        *(undefined8 *)p_Stack_80 = 0;
        *(undefined8 *)(p_Stack_80 + 8) = 0;
        *(undefined8 *)(p_Stack_80 + 0x10) = local_88;
        *(__tree_node_base **)pHVar4 = p_Stack_80;
        p_Var5 = p_Stack_80;
        if (**(long **)ppVar12 != 0) {
          *(long *)ppVar12 = **(long **)ppVar12;
          p_Var5 = *(__tree_node_base **)pHVar4;
        }
        pHVar4 = *(HttpResponse **)(this + 0x30);
        std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                  ((__tree_node_base *)pHVar4,p_Var5);
        *(long *)(this + 0x38) = *(long *)(this + 0x38) + 1;
        pmVar6 = *(map **)(pmVar9 + 8);
        if (*(map **)(pmVar9 + 8) != (map *)0x0) goto LAB_0097a410;
LAB_0097a420:
        pmVar6 = pmVar9 + 0x10;
        bVar3 = *(map **)*(map **)pmVar6 == pmVar9;
        pmVar9 = *(map **)pmVar6;
        if (bVar3) goto joined_r0x0097a388;
        do {
          lVar7 = *(long *)pmVar6;
          pmVar6 = (map *)(lVar7 + 0x10);
          pmVar9 = *(map **)pmVar6;
        } while (*(long *)pmVar9 != lVar7);
      }
      else {
        pmVar6 = *(map **)(pmVar9 + 8);
        if (*(map **)(pmVar9 + 8) == (map *)0x0) goto LAB_0097a420;
LAB_0097a410:
        do {
          pmVar9 = pmVar6;
          pmVar6 = *(map **)pmVar9;
        } while (*(map **)pmVar9 != (map *)0x0);
      }
      if (pmVar9 == param_4 + 8) break;
    } while( true );
  }
  pHVar4 = this + 0x40;
  *(undefined8 *)pHVar4 = 0;
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  if (((byte)*param_5 & 1) == 0) {
    *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_5 + 0x10);
    uVar14 = *(undefined8 *)param_5;
    *(undefined8 *)(this + 0x48) = *(undefined8 *)(param_5 + 8);
    *(undefined8 *)pHVar4 = uVar14;
  }
  else {
    uVar13 = *(ulong *)(param_5 + 8);
    if (0xffffffffffffffef < uVar13) {
                    /* try { // try from 0097a5b8 to 0097a5bf has its CatchHandler @ 0097a5e0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar11 = *(void **)(param_5 + 0x10);
    if (uVar13 < 0x17) {
      pHVar8 = this + 0x41;
      *pHVar4 = SUB41((int)uVar13 << 1,0);
      if (uVar13 != 0) goto LAB_0097a4d8;
    }
    else {
      uVar10 = uVar13 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097a4c0 to 0097a4c7 has its CatchHandler @ 0097a5e0 */
      pHVar8 = operator_new(uVar10);
      *(ulong *)(this + 0x48) = uVar13;
      *(HttpResponse **)(this + 0x50) = pHVar8;
      *(ulong *)(this + 0x40) = uVar10 | 1;
LAB_0097a4d8:
      memcpy(pHVar8,pvVar11,uVar13);
    }
    pHVar8[uVar13] = (HttpResponse)0x0;
  }
  pHVar4 = this + 0x58;
  *(undefined8 *)pHVar4 = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(undefined8 *)(this + 0x68) = 0;
  if (((byte)*param_6 & 1) == 0) {
    *(undefined8 *)(this + 0x68) = *(undefined8 *)(param_6 + 0x10);
    uVar14 = *(undefined8 *)param_6;
    *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_6 + 8);
    *(undefined8 *)pHVar4 = uVar14;
    goto LAB_0097a570;
  }
  uVar13 = *(ulong *)(param_6 + 8);
  if (0xffffffffffffffef < uVar13) {
                    /* try { // try from 0097a5c0 to 0097a5c7 has its CatchHandler @ 0097a5c8 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar11 = *(void **)(param_6 + 0x10);
  if (uVar13 < 0x17) {
    pHVar8 = this + 0x59;
    *pHVar4 = SUB41((int)uVar13 << 1,0);
    if (uVar13 != 0) goto LAB_0097a55c;
  }
  else {
    uVar10 = uVar13 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097a544 to 0097a54b has its CatchHandler @ 0097a5c8 */
    pHVar8 = operator_new(uVar10);
    *(ulong *)(this + 0x60) = uVar13;
    *(HttpResponse **)(this + 0x68) = pHVar8;
    *(ulong *)(this + 0x58) = uVar10 | 1;
LAB_0097a55c:
    memcpy(pHVar8,pvVar11,uVar13);
  }
  pHVar8[uVar13] = (HttpResponse)0x0;
LAB_0097a570:
  *(ulong *)(this + 0x70) = param_7;
  *(ulong *)(this + 0x78) = param_8;
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

