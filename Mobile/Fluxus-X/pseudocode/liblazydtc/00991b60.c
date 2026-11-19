/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00991b60
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x00991ff8 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::parseHttpHeaders(std::__ndk1::unique_ptr<ix::Socket, std::__ndk1::default_delete<ix::Socket>
   >&, std::__ndk1::function<bool ()> const&) */

void __thiscall ix::parseHttpHeaders(ix *this,unique_ptr *param_1,function *param_2)

{
  pair *ppVar1;
  int iVar2;
  ulong __n;
  long lVar3;
  ix *piVar4;
  size_t __n_00;
  void *pvVar5;
  void *__dest;
  char *pcVar6;
  __tree_node_base *p_Var7;
  undefined1 *in_x8;
  __tree_node *p_Var8;
  int iVar9;
  ulong uVar10;
  __tree_node *p_Var11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  __tree_node *p_Var15;
  undefined8 *puVar16;
  void *pvVar17;
  char *pcVar18;
  ulong local_4e0;
  ulong local_4d8;
  char *local_4d0;
  ulong local_4c8;
  ulong local_4c0;
  void *local_4b8;
  __tree_node *local_4b0;
  __tree_node *local_4a8;
  undefined8 local_4a0;
  tuple local_498 [8];
  ulong *local_490;
  __tree_node_base *local_488;
  ulong local_480;
  undefined8 local_478;
  char local_470 [1024];
  long local_70;
  
  lVar3 = tpidr_el0;
  pvVar17 = (void *)((ulong)&local_488 | 1);
  pcVar18 = (char *)((ulong)&local_4e0 | 1);
  local_70 = *(long *)(lVar3 + 0x28);
  local_4a8 = (__tree_node *)0x0;
  local_4a0 = 0;
  uVar10 = 0;
  local_4b0 = (__tree_node *)&local_4a8;
  iVar2 = 0;
  piVar4 = this;
  while( true ) {
    while( true ) {
      iVar9 = iVar2;
      uVar13 = uVar10;
      if ((1 < uVar13) &&
         (((0x3fe < uVar13 || (local_470[uVar13 - 2] == '\r')) || (local_470[uVar13 - 1] == '\n'))))
      break;
                    /* try { // try from 00991c08 to 00991c0f has its CatchHandler @ 009921b4 */
      piVar4 = (ix *)Socket::readByte(*(Socket **)this,local_470 + uVar13,(function *)param_1);
      if (((ulong)piVar4 & 1) == 0) {
        *in_x8 = 0;
        puVar16 = (undefined8 *)(in_x8 + 0x10);
        *puVar16 = 0;
        *(undefined8 *)(in_x8 + 0x18) = 0;
        *(undefined8 **)(in_x8 + 8) = puVar16;
        if (local_4b0 == (__tree_node *)&local_4a8) goto LAB_009920bc;
        ppVar1 = (pair *)(in_x8 + 8);
        p_Var15 = local_4b0;
        goto LAB_00991edc;
      }
      iVar2 = (int)uVar13;
      if (local_470[uVar13] != ':' || iVar9 != 0) {
        iVar2 = iVar9;
      }
      uVar10 = uVar13 + 1;
    }
    if ((local_470[0] == '\r') && (local_470[1] == '\n')) break;
    uVar10 = 0;
    iVar2 = 0;
    if (0 < iVar9) {
      local_470[uVar13 & 0xffffffff] = '\0';
      local_488 = (__tree_node_base *)0x0;
      local_480 = 0;
      local_478 = (void *)0x0;
      __n_00 = strlen(local_470);
      if (0xffffffffffffffef < __n_00) {
                    /* try { // try from 009920fc to 00992103 has its CatchHandler @ 00992124 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (__n_00 < 0x17) {
        local_488 = (__tree_node_base *)CONCAT71(local_488._1_7_,(char)((int)__n_00 << 1));
        pvVar5 = pvVar17;
        if (__n_00 != 0) goto LAB_00991cc0;
      }
      else {
        uVar10 = __n_00 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00991ca8 to 00991caf has its CatchHandler @ 0099214c */
        pvVar5 = operator_new(uVar10);
        local_488 = (__tree_node_base *)(uVar10 | 1);
        local_480 = __n_00;
        local_478 = pvVar5;
LAB_00991cc0:
        memcpy(pvVar5,local_470,__n_00);
      }
      *(undefined1 *)((long)pvVar5 + __n_00) = 0;
      uVar10 = (ulong)iVar9;
      pvVar5 = pvVar17;
      if (((ulong)local_488 & 1) != 0) {
        pvVar5 = local_478;
      }
      uVar13 = uVar10;
      do {
        lVar12 = uVar13 + 1;
        uVar13 = uVar13 + 1;
      } while (*(char *)((long)pvVar5 + lVar12) == ' ');
      local_4c8 = 0;
      local_4c0 = 0;
      uVar14 = (ulong)local_488 >> 1 & 0x7f;
      if (((ulong)local_488 & 1) != 0) {
        uVar14 = local_480;
      }
      if (uVar10 <= uVar14) {
        uVar14 = uVar10;
      }
      local_4b8 = (void *)0x0;
      if (0xffffffffffffffef < uVar14) {
                    /* try { // try from 00992104 to 0099210b has its CatchHandler @ 00992120 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (uVar14 < 0x17) {
        local_4c8 = (ulong)(byte)((int)uVar14 << 1);
        __dest = (void *)((ulong)&local_4c8 | 1);
        if (uVar14 != 0) goto LAB_00991d68;
      }
      else {
        uVar10 = uVar14 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00991d50 to 00991d57 has its CatchHandler @ 0099213c */
        __dest = operator_new(uVar10);
        local_4c8 = uVar10 | 1;
        local_4c0 = uVar14;
        local_4b8 = __dest;
LAB_00991d68:
        memcpy(__dest,pvVar5,uVar14);
      }
      *(undefined1 *)((long)__dest + uVar14) = 0;
      local_4d8 = 0;
      local_4d0 = (char *)0x0;
      uVar10 = (ulong)local_488 >> 1 & 0x7f;
      if (((ulong)local_488 & 1) != 0) {
        uVar10 = local_480;
      }
      local_4e0 = 0;
      if (uVar10 < uVar13) {
                    /* try { // try from 0099210c to 0099211b has its CatchHandler @ 00992128 */
        std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_00992114:
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      uVar14 = (uVar10 - uVar13) - 2;
      pvVar5 = pvVar17;
      if (((ulong)local_488 & 1) != 0) {
        pvVar5 = local_478;
      }
      __n = uVar10 - uVar13;
      if (uVar14 <= uVar10 - uVar13) {
        __n = uVar14;
      }
      if (0xffffffffffffffef < __n) goto LAB_00992114;
      if (__n < 0x17) {
        local_4e0 = (ulong)(byte)((int)__n << 1);
        pcVar6 = pcVar18;
        if (__n != 0) goto LAB_00991e00;
      }
      else {
        uVar10 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00991de8 to 00991def has its CatchHandler @ 0099212c */
        pcVar6 = operator_new(uVar10);
        local_4e0 = uVar10 | 1;
        local_4d8 = __n;
        local_4d0 = pcVar6;
LAB_00991e00:
        memcpy(pcVar6,(void *)((long)pvVar5 + uVar13),__n);
      }
      local_490 = &local_4c8;
      pcVar6[__n] = '\0';
                    /* try { // try from 00991e1c to 00991e63 has its CatchHandler @ 00992168 */
      piVar4 = (ix *)std::__ndk1::
                     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     ::
                     __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>>
                               ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                 *)&local_4b0,(basic_string_conflict *)&local_4c8,
                                (piecewise_construct_t *)&DAT_0074a504,(tuple *)&local_490,local_498
                               );
      if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
          (piVar4 + 0x38) !=
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
          &local_4e0) {
        uVar10 = local_4e0 >> 1 & 0x7f;
        pcVar6 = pcVar18;
        if ((local_4e0 & 1) != 0) {
          uVar10 = local_4d8;
          pcVar6 = local_4d0;
        }
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 (piVar4 + 0x38),pcVar6,uVar10);
      }
      if ((local_4e0 & 1) != 0) {
        operator_delete(local_4d0);
      }
      if ((local_4c8 & 1) != 0) {
        operator_delete(local_4b8);
      }
      if (((ulong)local_488 & 1) != 0) {
        operator_delete(local_478);
      }
      uVar10 = 0;
      iVar2 = 0;
    }
  }
  *in_x8 = 1;
  puVar16 = (undefined8 *)(in_x8 + 0x10);
  *puVar16 = 0;
  *(undefined8 *)(in_x8 + 0x18) = 0;
  *(undefined8 **)(in_x8 + 8) = puVar16;
  if (local_4b0 != (__tree_node *)&local_4a8) {
    ppVar1 = (pair *)(in_x8 + 8);
    p_Var15 = local_4b0;
    do {
                    /* try { // try from 00991fe4 to 00992023 has its CatchHandler @ 00992150 */
      while (piVar4 = (ix *)std::__ndk1::
                            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                            ::
                            __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                      ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                        *)piVar4,puVar16,&local_4c8,&local_4e0,p_Var15 + 0x20),
            *(long *)piVar4 == 0) {
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::
        __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                  (ppVar1);
        *(undefined8 *)local_488 = 0;
        *(undefined8 *)(local_488 + 8) = 0;
        *(ulong *)(local_488 + 0x10) = local_4c8;
        *(__tree_node_base **)piVar4 = local_488;
        p_Var7 = local_488;
        if (**(long **)ppVar1 != 0) {
          *(long *)ppVar1 = **(long **)ppVar1;
          p_Var7 = *(__tree_node_base **)piVar4;
        }
        piVar4 = *(ix **)(in_x8 + 0x10);
        std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                  ((__tree_node_base *)piVar4,p_Var7);
        *(long *)(in_x8 + 0x18) = *(long *)(in_x8 + 0x18) + 1;
        p_Var8 = *(__tree_node **)(p_Var15 + 8);
        if (*(__tree_node **)(p_Var15 + 8) == (__tree_node *)0x0) goto LAB_00992078;
LAB_00992068:
        do {
          p_Var15 = p_Var8;
          p_Var8 = *(__tree_node **)p_Var15;
        } while (*(__tree_node **)p_Var15 != (__tree_node *)0x0);
LAB_009920a4:
        if (p_Var15 == (__tree_node *)&local_4a8) goto LAB_009920bc;
      }
      p_Var8 = *(__tree_node **)(p_Var15 + 8);
      if (*(__tree_node **)(p_Var15 + 8) != (__tree_node *)0x0) goto LAB_00992068;
LAB_00992078:
      p_Var8 = p_Var15 + 0x10;
      p_Var11 = *(__tree_node **)p_Var8;
      if (*(__tree_node **)p_Var11 != p_Var15) {
        do {
          lVar12 = *(long *)p_Var8;
          p_Var8 = (__tree_node *)(lVar12 + 0x10);
          p_Var15 = *(__tree_node **)p_Var8;
        } while (*(long *)p_Var15 != lVar12);
        goto LAB_009920a4;
      }
      p_Var15 = p_Var11;
    } while (p_Var11 != (__tree_node *)&local_4a8);
  }
LAB_009920bc:
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_4b0,local_4a8);
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
LAB_00991edc:
  do {
                    /* try { // try from 00991ee0 to 00991f1f has its CatchHandler @ 00992154 */
    piVar4 = (ix *)std::__ndk1::
                   __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                   ::
                   __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                             ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)piVar4,puVar16,&local_4c8,&local_4e0,p_Var15 + 0x20);
    if (*(long *)piVar4 == 0) {
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::
      __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                (ppVar1);
      *(undefined8 *)local_488 = 0;
      *(undefined8 *)(local_488 + 8) = 0;
      *(ulong *)(local_488 + 0x10) = local_4c8;
      *(__tree_node_base **)piVar4 = local_488;
      p_Var7 = local_488;
      if (**(long **)ppVar1 != 0) {
        *(long *)ppVar1 = **(long **)ppVar1;
        p_Var7 = *(__tree_node_base **)piVar4;
      }
      piVar4 = *(ix **)(in_x8 + 0x10);
      std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                ((__tree_node_base *)piVar4,p_Var7);
      *(long *)(in_x8 + 0x18) = *(long *)(in_x8 + 0x18) + 1;
      p_Var8 = *(__tree_node **)(p_Var15 + 8);
      if (*(__tree_node **)(p_Var15 + 8) == (__tree_node *)0x0) goto LAB_00991f74;
LAB_00991f64:
      do {
        p_Var11 = p_Var8;
        p_Var8 = *(__tree_node **)p_Var11;
      } while (*(__tree_node **)p_Var11 != (__tree_node *)0x0);
    }
    else {
      p_Var8 = *(__tree_node **)(p_Var15 + 8);
      if (*(__tree_node **)(p_Var15 + 8) != (__tree_node *)0x0) goto LAB_00991f64;
LAB_00991f74:
      p_Var8 = p_Var15 + 0x10;
      p_Var11 = *(__tree_node **)p_Var8;
      if (*(__tree_node **)p_Var11 != p_Var15) {
        do {
          lVar12 = *(long *)p_Var8;
          p_Var8 = (__tree_node *)(lVar12 + 0x10);
          p_Var11 = *(__tree_node **)p_Var8;
        } while (*(long *)p_Var11 != lVar12);
      }
    }
    p_Var15 = p_Var11;
  } while (p_Var11 != (__tree_node *)&local_4a8);
  goto LAB_009920bc;
}

