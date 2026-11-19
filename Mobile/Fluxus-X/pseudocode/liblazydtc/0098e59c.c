/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098e59c
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x0098e690 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocketOpenInfo::WebSocketOpenInfo(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall
ix::WebSocketOpenInfo::WebSocketOpenInfo
          (WebSocketOpenInfo *this,basic_string_conflict *param_1,map *param_2,
          basic_string_conflict *param_3)

{
  long lVar1;
  bool bVar2;
  WebSocketOpenInfo *pWVar3;
  __tree_node_base *p_Var4;
  map *pmVar5;
  long lVar6;
  void *pvVar7;
  WebSocketOpenInfo *pWVar8;
  pair *ppVar9;
  ulong uVar10;
  ulong uVar11;
  map *pmVar12;
  undefined8 uVar13;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  __tree_node_base *p_Stack_80;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  pWVar3 = this;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar13 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar13;
  }
  else {
    uVar10 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar10) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar7 = *(void **)(param_1 + 0x10);
    if (uVar10 < 0x17) {
      pWVar8 = this + 1;
      *this = SUB41((int)uVar10 << 1,0);
      if (uVar10 != 0) goto LAB_0098e644;
    }
    else {
      uVar11 = uVar10 + 0x10 & 0xfffffffffffffff0;
      pWVar8 = operator_new(uVar11);
      *(ulong *)(this + 8) = uVar10;
      *(WebSocketOpenInfo **)(this + 0x10) = pWVar8;
      *(ulong *)this = uVar11 | 1;
      pWVar3 = pWVar8;
LAB_0098e644:
      memcpy(pWVar8,pvVar7,uVar10);
    }
    pWVar8[uVar10] = (WebSocketOpenInfo)0x0;
  }
  pWVar8 = this + 0x20;
  *(undefined8 *)pWVar8 = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(WebSocketOpenInfo **)(this + 0x18) = pWVar8;
  ppVar9 = (pair *)(this + 0x18);
  pmVar12 = *(map **)param_2;
joined_r0x0098e674:
  if (pmVar12 != param_2 + 8) {
    do {
                    /* try { // try from 0098e67c to 0098e6bb has its CatchHandler @ 0098e81c */
      pWVar3 = (WebSocketOpenInfo *)
               std::__ndk1::
               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::
               __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                         ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)pWVar3,pWVar8,&local_88,auStack_90,pmVar12 + 0x20);
      if (*(long *)pWVar3 == 0) {
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::
        __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                  (ppVar9);
        *(undefined8 *)p_Stack_80 = 0;
        *(undefined8 *)(p_Stack_80 + 8) = 0;
        *(undefined8 *)(p_Stack_80 + 0x10) = local_88;
        *(__tree_node_base **)pWVar3 = p_Stack_80;
        p_Var4 = p_Stack_80;
        if (**(long **)ppVar9 != 0) {
          *(long *)ppVar9 = **(long **)ppVar9;
          p_Var4 = *(__tree_node_base **)pWVar3;
        }
        pWVar3 = *(WebSocketOpenInfo **)(this + 0x20);
        std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                  ((__tree_node_base *)pWVar3,p_Var4);
        *(long *)(this + 0x28) = *(long *)(this + 0x28) + 1;
        pmVar5 = *(map **)(pmVar12 + 8);
        if (*(map **)(pmVar12 + 8) != (map *)0x0) goto LAB_0098e6fc;
LAB_0098e70c:
        pmVar5 = pmVar12 + 0x10;
        bVar2 = *(map **)*(map **)pmVar5 == pmVar12;
        pmVar12 = *(map **)pmVar5;
        if (bVar2) goto joined_r0x0098e674;
        do {
          lVar6 = *(long *)pmVar5;
          pmVar5 = (map *)(lVar6 + 0x10);
          pmVar12 = *(map **)pmVar5;
        } while (*(long *)pmVar12 != lVar6);
      }
      else {
        pmVar5 = *(map **)(pmVar12 + 8);
        if (*(map **)(pmVar12 + 8) == (map *)0x0) goto LAB_0098e70c;
LAB_0098e6fc:
        do {
          pmVar12 = pmVar5;
          pmVar5 = *(map **)pmVar12;
        } while (*(map **)pmVar12 != (map *)0x0);
      }
      if (pmVar12 == param_2 + 8) break;
    } while( true );
  }
  pWVar3 = this + 0x30;
  *(undefined8 *)pWVar3 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if (((byte)*param_3 & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_3 + 0x10);
    uVar13 = *(undefined8 *)param_3;
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_3 + 8);
    *(undefined8 *)pWVar3 = uVar13;
    goto LAB_0098e7d4;
  }
  uVar10 = *(ulong *)(param_3 + 8);
  if (0xffffffffffffffef < uVar10) {
                    /* try { // try from 0098e810 to 0098e817 has its CatchHandler @ 0098e818 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar7 = *(void **)(param_3 + 0x10);
  if (uVar10 < 0x17) {
    pWVar8 = this + 0x31;
    *pWVar3 = SUB41((int)uVar10 << 1,0);
    if (uVar10 != 0) goto LAB_0098e7c0;
  }
  else {
    uVar11 = uVar10 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098e7a8 to 0098e7af has its CatchHandler @ 0098e818 */
    pWVar8 = operator_new(uVar11);
    *(ulong *)(this + 0x38) = uVar10;
    *(WebSocketOpenInfo **)(this + 0x40) = pWVar8;
    *(ulong *)(this + 0x30) = uVar11 | 1;
LAB_0098e7c0:
    memcpy(pWVar8,pvVar7,uVar10);
  }
  pWVar8[uVar10] = (WebSocketOpenInfo)0x0;
LAB_0098e7d4:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

