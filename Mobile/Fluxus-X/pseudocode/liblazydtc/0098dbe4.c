/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098dbe4
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x0098dc88 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocket::connect(int) */

void ix::WebSocket::connect(int param_1)

{
  mutex *this;
  long lVar1;
  byte *pbVar2;
  WebSocketTransport *this_00;
  WebSocketTransport *pWVar3;
  char *pcVar4;
  long *plVar5;
  undefined8 *puVar6;
  int in_w1;
  __tree_node_base *p_Var7;
  WebSocketCloseInfo *in_x6;
  char *in_x8;
  long lVar8;
  WebSocketTransport *pWVar9;
  undefined8 uVar10;
  long lVar11;
  byte *pbVar12;
  int iVar13;
  WebSocketTransport *pWVar14;
  ulong uVar15;
  void *pvVar16;
  ulong uVar17;
  char *pcVar18;
  undefined4 local_180;
  undefined4 uStack_17c;
  void *local_178;
  byte *local_170;
  byte *local_168;
  ulong local_158;
  ulong local_150;
  char *local_148;
  __tree_node_base *local_140;
  __tree_node_base *local_138;
  long local_130;
  undefined2 local_128 [4];
  ulong local_120;
  undefined8 local_118;
  void *local_110;
  undefined1 local_108;
  piecewise_construct_t local_100;
  undefined7 uStack_ff;
  undefined1 uStack_f8;
  undefined6 uStack_f7;
  undefined1 uStack_f1;
  undefined1 uStack_f0;
  undefined6 uStack_ef;
  undefined1 uStack_e9;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_e8 [8];
  __tree_node *local_e0;
  byte local_d0;
  void *local_c0;
  piecewise_construct_t *local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  ulong uStack_98;
  undefined8 uStack_90;
  void *local_88;
  undefined8 local_80;
  
  this_00 = (WebSocketTransport *)(ulong)(uint)param_1;
  lVar1 = tpidr_el0;
  lVar8 = *(long *)(lVar1 + 0x28);
  this = (mutex *)(this_00 + 0x3a0);
  std::__ndk1::mutex::lock(this);
                    /* try { // try from 0098dc38 to 0098dc3f has its CatchHandler @ 0098e280 */
  WebSocketTransport::configure
            (this_00,(WebSocketPerMessageDeflateOptions *)(this_00 + 0x310),
             (SocketTLSOptions *)(this_00 + 0x318),(bool)this_00[0x4a0],*(int *)(this_00 + 0x4a4));
  std::__ndk1::mutex::unlock(this);
  local_138 = (__tree_node_base *)0x0;
  local_130 = 0;
  pWVar14 = *(WebSocketTransport **)(this_00 + 0x2f8);
  local_140 = (__tree_node_base *)&local_138;
  pWVar3 = this_00;
  while (pWVar14 != this_00 + 0x300) {
                    /* try { // try from 0098dc74 to 0098dcb3 has its CatchHandler @ 0098e328 */
    pWVar3 = (WebSocketTransport *)
             std::__ndk1::
             __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             ::
             __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                       ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)pWVar3,(__tree_node_base *)&local_138,&local_b0,local_128,pWVar14 + 0x20)
    ;
    if (*(long *)pWVar3 == 0) {
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::
      __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                ((pair *)&local_140);
      p_Var7 = (__tree_node_base *)CONCAT71(uStack_ff,local_100);
      *(undefined8 *)p_Var7 = 0;
      *(undefined8 *)(p_Var7 + 8) = 0;
      *(piecewise_construct_t **)(p_Var7 + 0x10) = local_b0;
      *(__tree_node_base **)pWVar3 = p_Var7;
      if (*(__tree_node_base **)local_140 != (__tree_node_base *)0x0) {
        p_Var7 = *(__tree_node_base **)pWVar3;
        local_140 = *(__tree_node_base **)local_140;
      }
      std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                (local_138,p_Var7);
      local_130 = local_130 + 1;
      pWVar9 = *(WebSocketTransport **)(pWVar14 + 8);
      if (*(WebSocketTransport **)(pWVar14 + 8) != (WebSocketTransport *)0x0) goto LAB_0098dcf8;
LAB_0098dd08:
      pWVar9 = pWVar14 + 0x10;
      if (*(WebSocketTransport **)*(WebSocketTransport **)pWVar9 == pWVar14) {
        pWVar14 = *(WebSocketTransport **)pWVar9;
      }
      else {
        do {
          lVar11 = *(long *)pWVar9;
          pWVar9 = (WebSocketTransport *)(lVar11 + 0x10);
          pWVar14 = *(WebSocketTransport **)pWVar9;
        } while (*(long *)pWVar14 != lVar11);
      }
    }
    else {
      pWVar9 = *(WebSocketTransport **)(pWVar14 + 8);
      if (*(WebSocketTransport **)(pWVar14 + 8) == (WebSocketTransport *)0x0) goto LAB_0098dd08;
LAB_0098dcf8:
      do {
        pWVar14 = pWVar9;
        pWVar9 = *(WebSocketTransport **)pWVar14;
      } while (*(WebSocketTransport **)pWVar14 != (WebSocketTransport *)0x0);
    }
  }
  local_158 = 0;
  local_150 = 0;
  local_148 = (char *)0x0;
                    /* try { // try from 0098dd44 to 0098dd63 has its CatchHandler @ 0098e294 */
  std::__ndk1::mutex::lock(this);
  std::__ndk1::mutex::unlock(this);
  std::__ndk1::
  vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  ::vector((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
            *)&local_170,(vector *)(this_00 + 0x4d0));
  pbVar2 = local_168;
  if (local_170 != local_168) {
    iVar13 = 0;
    pcVar18 = (char *)((ulong)&local_100 | 1);
    pbVar12 = local_170;
    do {
      uStack_f8 = 0;
      uStack_f7 = 0;
      uStack_f1 = 0;
      uStack_f0 = 0;
      uStack_ef = 0;
      uStack_e9 = 0;
      local_100 = (piecewise_construct_t)0x0;
      uStack_ff = 0;
      if ((*pbVar12 & 1) == 0) {
        uVar10 = *(undefined8 *)(pbVar12 + 0x10);
        uStack_f0 = (undefined1)uVar10;
        uStack_ef = (undefined6)((ulong)uVar10 >> 8);
        uStack_e9 = (undefined1)((ulong)uVar10 >> 0x38);
        uVar10 = *(undefined8 *)(pbVar12 + 8);
        uStack_f8 = (undefined1)uVar10;
        uStack_f7 = (undefined6)((ulong)uVar10 >> 8);
        uStack_f1 = (undefined1)((ulong)uVar10 >> 0x38);
        local_100 = SUB81(*(undefined8 *)pbVar12,0);
        uStack_ff = (undefined7)((ulong)*(undefined8 *)pbVar12 >> 8);
      }
      else {
        uVar15 = *(ulong *)(pbVar12 + 8);
        if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 0098e0fc to 0098e103 has its CatchHandler @ 0098e134 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        pvVar16 = *(void **)(pbVar12 + 0x10);
        if (uVar15 < 0x17) {
          local_100 = SUB41((int)uVar15 << 1,0);
          pcVar4 = pcVar18;
          if (uVar15 == 0) {
            *pcVar18 = '\0';
            goto joined_r0x0098de18;
          }
        }
        else {
          uVar17 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098ddec to 0098ddf3 has its CatchHandler @ 0098e2a4 */
          pcVar4 = operator_new(uVar17);
          local_100 = (piecewise_construct_t)((byte)uVar17 | 1);
          uStack_f8 = (undefined1)uVar15;
          uStack_f7 = (undefined6)(uVar15 >> 8);
          uStack_f1 = (undefined1)(uVar15 >> 0x38);
          uStack_f0 = SUB81(pcVar4,0);
          uStack_ef = (undefined6)((ulong)pcVar4 >> 8);
          uStack_e9 = (undefined1)((ulong)pcVar4 >> 0x38);
          uStack_ff = (undefined7)(uVar17 >> 8);
        }
        memcpy(pcVar4,pvVar16,uVar15);
        pcVar4[uVar15] = '\0';
      }
joined_r0x0098de18:
      if (iVar13 != 0) {
                    /* try { // try from 0098de1c to 0098de4b has its CatchHandler @ 0098e2b4 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_158,",",1);
      }
      uVar15 = (ulong)((byte)local_100 >> 1);
      pcVar4 = pcVar18;
      if (((byte)local_100 & 1) != 0) {
        uVar15 = CONCAT17(uStack_f1,CONCAT61(uStack_f7,uStack_f8));
        pcVar4 = (char *)CONCAT17(uStack_e9,CONCAT61(uStack_ef,uStack_f0));
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_158,pcVar4,uVar15);
      if (((byte)local_100 & 1) != 0) {
        operator_delete((void *)CONCAT17(uStack_e9,CONCAT61(uStack_ef,uStack_f0)));
      }
      pbVar12 = pbVar12 + 0x18;
      iVar13 = iVar13 + -1;
    } while (pbVar2 != pbVar12);
    local_b0 = &local_100;
    local_100 = (piecewise_construct_t)0x2c;
    uStack_f7 = 0x2d74656b636f;
    uStack_ff = 0x6265572d636553;
    uStack_f8 = 0x53;
    uStack_f1 = 0x50;
    uStack_f0 = 0x72;
    uStack_ef = 0x6c6f636f746f;
    uStack_e9 = 0;
                    /* try { // try from 0098de9c to 0098dee7 has its CatchHandler @ 0098e148 */
    lVar11 = std::__ndk1::
             __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             ::
             __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                       ((basic_string_conflict *)&local_140,&local_100,(tuple *)&DAT_0074a274,
                        (tuple *)&local_b0);
    if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
        (lVar11 + 0x38) !=
        (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)&local_158
       ) {
      uVar15 = local_158 >> 1 & 0x7f;
      pcVar18 = (char *)((ulong)&local_158 | 1);
      if ((local_158 & 1) != 0) {
        uVar15 = local_150;
        pcVar18 = local_148;
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             (lVar11 + 0x38),pcVar18,uVar15);
    }
    if (((byte)local_100 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_e9,CONCAT61(uStack_ef,uStack_f0)));
    }
  }
                    /* try { // try from 0098df00 to 0098df13 has its CatchHandler @ 0098e27c */
  WebSocketTransport::connectToUrl
            (this_00,(basic_string_conflict *)(this_00 + 0x2e0),(map *)&local_140,in_w1);
  if (*in_x8 != '\0') {
    local_180 = 0;
    uStack_17c = 1;
    local_80 = 0;
    uStack_98 = 0;
    local_a0 = 0;
    local_88 = (void *)0x0;
    uStack_90 = 0;
    uStack_a8 = 0;
    local_b0 = (piecewise_construct_t *)0x0;
                    /* try { // try from 0098df40 to 0098df4f has its CatchHandler @ 0098e24c */
    WebSocketOpenInfo::WebSocketOpenInfo
              ((WebSocketOpenInfo *)&local_100,(basic_string_conflict *)(in_x8 + 0x38),
               (map *)(in_x8 + 0x20),(basic_string_conflict *)(in_x8 + 0x50));
    local_128[0] = 0;
    local_118 = 0;
    local_110 = (void *)0x0;
    local_108 = 0;
    local_120 = 0;
                    /* try { // try from 0098df60 to 0098df83 has its CatchHandler @ 0098e1bc */
    make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo>
              ((ix *)&uStack_17c,(WebSocketMessageType *)&DAT_00d216c0,
               (basic_string_conflict *)&local_180,(int *)&local_b0,(WebSocketErrorInfo *)&local_100
               ,(WebSocketOpenInfo *)local_128,in_x6);
    plVar5 = *(long **)(this_00 + 0x3f0);
    if (plVar5 == (long *)0x0) {
      puVar6 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar6 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 0098e120 to 0098e133 has its CatchHandler @ 0098e14c */
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar6,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
                    /* try { // try from 0098df94 to 0098df9b has its CatchHandler @ 0098e14c */
    (**(code **)(*plVar5 + 0x30))(plVar5,&local_178);
    pvVar16 = local_178;
    local_178 = (void *)0x0;
    if (pvVar16 != (void *)0x0) {
      if ((*(byte *)((long)pvVar16 + 0xa0) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar16 + 0xb0));
      }
      if ((*(byte *)((long)pvVar16 + 0x80) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar16 + 0x90));
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)((long)pvVar16 + 0x68),*(__tree_node **)((long)pvVar16 + 0x70));
      if ((*(byte *)((long)pvVar16 + 0x50) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar16 + 0x60));
      }
      if ((*(byte *)((long)pvVar16 + 0x30) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar16 + 0x40));
      }
      operator_delete(pvVar16);
    }
    if ((local_120 & 1) != 0) {
      operator_delete(local_110);
    }
    if ((local_d0 & 1) != 0) {
      operator_delete(local_c0);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy(a_Stack_e8,local_e0);
    if (((byte)local_100 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_e9,CONCAT61(uStack_ef,uStack_f0)));
    }
    if ((uStack_98 & 1) != 0) {
      operator_delete(local_88);
    }
    if (0 < *(int *)(this_00 + 0x4a4)) {
                    /* try { // try from 0098e05c to 0098e067 has its CatchHandler @ 0098e138 */
      WebSocketTransport::sendHeartBeat(&local_100,this_00,*(undefined4 *)(this_00 + 0x4c8));
    }
  }
  pbVar2 = local_170;
  if (local_170 != (byte *)0x0) {
    if (local_168 != local_170) {
      do {
        pbVar12 = local_168 + -0x18;
        if ((*pbVar12 & 1) != 0) {
          operator_delete(*(void **)(local_168 + -8));
        }
        local_168 = pbVar12;
      } while (pbVar2 != pbVar12);
    }
    local_168 = pbVar2;
    operator_delete(local_170);
  }
  if ((local_158 & 1) != 0) {
    operator_delete(local_148);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_140,(__tree_node *)local_138);
  if (*(long *)(lVar1 + 0x28) != lVar8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

