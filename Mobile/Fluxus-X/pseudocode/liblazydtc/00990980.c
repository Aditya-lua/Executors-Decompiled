/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00990980
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x00990a74 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocketOpenInfo::WebSocketOpenInfo(ix::WebSocketOpenInfo const&) */

void __thiscall
ix::WebSocketOpenInfo::WebSocketOpenInfo(WebSocketOpenInfo *this,WebSocketOpenInfo *param_1)

{
  long lVar1;
  bool bVar2;
  WebSocketOpenInfo *pWVar3;
  __tree_node_base *p_Var4;
  WebSocketOpenInfo *pWVar5;
  long lVar6;
  void *pvVar7;
  WebSocketOpenInfo *pWVar8;
  pair *ppVar9;
  ulong uVar10;
  ulong uVar11;
  WebSocketOpenInfo *pWVar12;
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
      pWVar12 = this + 1;
      *this = SUB41((int)uVar10 << 1,0);
      if (uVar10 != 0) goto LAB_00990a24;
    }
    else {
      uVar11 = uVar10 + 0x10 & 0xfffffffffffffff0;
      pWVar12 = operator_new(uVar11);
      *(ulong *)(this + 8) = uVar10;
      *(WebSocketOpenInfo **)(this + 0x10) = pWVar12;
      *(ulong *)this = uVar11 | 1;
      pWVar3 = pWVar12;
LAB_00990a24:
      memcpy(pWVar12,pvVar7,uVar10);
    }
    pWVar12[uVar10] = (WebSocketOpenInfo)0x0;
  }
  pWVar8 = this + 0x20;
  *(undefined8 *)pWVar8 = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(WebSocketOpenInfo **)(this + 0x18) = pWVar8;
  ppVar9 = (pair *)(this + 0x18);
  pWVar12 = *(WebSocketOpenInfo **)(param_1 + 0x18);
joined_r0x00990a58:
  if (pWVar12 != param_1 + 0x20) {
    do {
                    /* try { // try from 00990a60 to 00990a9f has its CatchHandler @ 00990c04 */
      pWVar3 = (WebSocketOpenInfo *)
               std::__ndk1::
               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::
               __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                         ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)pWVar3,pWVar8,&local_88,auStack_90,pWVar12 + 0x20);
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
        pWVar5 = *(WebSocketOpenInfo **)(pWVar12 + 8);
        if (*(WebSocketOpenInfo **)(pWVar12 + 8) != (WebSocketOpenInfo *)0x0) goto LAB_00990ae0;
LAB_00990af0:
        pWVar5 = pWVar12 + 0x10;
        bVar2 = *(WebSocketOpenInfo **)*(WebSocketOpenInfo **)pWVar5 == pWVar12;
        pWVar12 = *(WebSocketOpenInfo **)pWVar5;
        if (bVar2) goto joined_r0x00990a58;
        do {
          lVar6 = *(long *)pWVar5;
          pWVar5 = (WebSocketOpenInfo *)(lVar6 + 0x10);
          pWVar12 = *(WebSocketOpenInfo **)pWVar5;
        } while (*(long *)pWVar12 != lVar6);
      }
      else {
        pWVar5 = *(WebSocketOpenInfo **)(pWVar12 + 8);
        if (*(WebSocketOpenInfo **)(pWVar12 + 8) == (WebSocketOpenInfo *)0x0) goto LAB_00990af0;
LAB_00990ae0:
        do {
          pWVar12 = pWVar5;
          pWVar5 = *(WebSocketOpenInfo **)pWVar12;
        } while (*(WebSocketOpenInfo **)pWVar12 != (WebSocketOpenInfo *)0x0);
      }
      if (pWVar12 == param_1 + 0x20) break;
    } while( true );
  }
  pWVar3 = this + 0x30;
  *(undefined8 *)pWVar3 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if (((byte)param_1[0x30] & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_1 + 0x40);
    uVar13 = *(undefined8 *)(param_1 + 0x30);
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
    *(undefined8 *)pWVar3 = uVar13;
    goto LAB_00990bbc;
  }
  uVar10 = *(ulong *)(param_1 + 0x38);
  if (0xffffffffffffffef < uVar10) {
                    /* try { // try from 00990bf8 to 00990bff has its CatchHandler @ 00990c00 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar7 = *(void **)(param_1 + 0x40);
  if (uVar10 < 0x17) {
    pWVar12 = this + 0x31;
    *pWVar3 = SUB41((int)uVar10 << 1,0);
    if (uVar10 != 0) goto LAB_00990ba8;
  }
  else {
    uVar11 = uVar10 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00990b90 to 00990b97 has its CatchHandler @ 00990c00 */
    pWVar12 = operator_new(uVar11);
    *(ulong *)(this + 0x38) = uVar10;
    *(WebSocketOpenInfo **)(this + 0x40) = pWVar12;
    *(ulong *)(this + 0x30) = uVar11 | 1;
LAB_00990ba8:
    memcpy(pWVar12,pvVar7,uVar10);
  }
  pWVar12[uVar10] = (WebSocketOpenInfo)0x0;
LAB_00990bbc:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

