/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed1e0
 */

/* std::__ndk1::money_get<char, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> > >::do_get(std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, bool, std::__ndk1::ios_base&, unsigned int&, long double&)
   const */

long * __thiscall
std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get(undefined8 param_1,long *param_2,long *param_3,uint param_4,long param_5,uint *param_6,
      undefined8 param_7)

{
  undefined1 *puVar1;
  byte *pbVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  undefined8 ***__ptr;
  undefined1 *puVar6;
  undefined8 uVar7;
  byte *pbVar8;
  long *plVar9;
  undefined8 ***pppuVar10;
  undefined8 ***pppuVar11;
  undefined8 **local_178 [13];
  undefined8 *local_110;
  undefined1 auStack_106 [6];
  undefined7 local_100;
  undefined4 uStack_f9;
  char local_f4 [4];
  long local_f0;
  byte *local_e8;
  byte *local_e0;
  code *local_d8;
  byte abStack_cc [100];
  long *local_68;
  
  local_e0 = abStack_cc;
  local_d8 = __do_nothing;
  local_68 = param_2;
                    /* try { // try from 00bed22c to 00bed237 has its CatchHandler @ 00bed4dc */
  ios_base::getloc();
  local_110 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_178[0] = &local_110;
    local_100 = SUB87(local_178,0);
    uStack_f9._0_1_ = (undefined1)((ulong)local_178 >> 0x38);
                    /* try { // try from 00bed264 to 00bed27b has its CatchHandler @ 00bed4f0 */
    __call_once((ulong *)&ctype<char>::id,&local_100,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_f0 + 0x18) - *(long *)(local_f0 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar9 = *(long **)(*(long *)(local_f0 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar9 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bed4ac to 00bed4af has its CatchHandler @ 00bed4f0 */
    FUN_00bd8968();
  }
  local_f4[0] = '\0';
                    /* try { // try from 00bed2a8 to 00bed2d7 has its CatchHandler @ 00bed4ec */
  uVar5 = __do_get(&local_68,param_3,param_4 & 1,&local_f0,*(undefined4 *)(param_5 + 8),param_6,
                   local_f4,plVar9,&local_e0,&local_e8,&local_68);
  if ((uVar5 & 1) != 0) {
    local_100 = 0x36353433323130;
    uStack_f9 = 0x393837;
                    /* try { // try from 00bed304 to 00bed317 has its CatchHandler @ 00bed4d4 */
    (**(code **)(*plVar9 + 0x40))(plVar9,&local_100,(long)&uStack_f9 + 3,&local_110);
    pbVar8 = local_e0;
    pbVar2 = local_e8;
    if ((long)local_e8 - (long)local_e0 < 99) {
LAB_00bed340:
      __ptr = (undefined8 ***)0x0;
      pppuVar11 = local_178;
    }
    else {
      __ptr = malloc(((long)local_e8 - (long)local_e0) + 2);
      pppuVar11 = __ptr;
      if (__ptr == (undefined8 ***)0x0) {
                    /* try { // try from 00bed33c to 00bed33f has its CatchHandler @ 00bed4bc */
        __throw_bad_alloc();
        goto LAB_00bed340;
      }
    }
    pppuVar10 = pppuVar11;
    if (local_f4[0] == '\x01') {
      pppuVar10 = (undefined8 ***)((long)pppuVar11 + 1);
      *(undefined1 *)pppuVar11 = 0x2d;
    }
    if (pbVar8 < pbVar2) {
      pppuVar11 = pppuVar10;
      do {
        puVar6 = memchr(&local_110,(uint)*pbVar8,10);
        puVar1 = auStack_106;
        if (puVar6 != (undefined1 *)0x0) {
          puVar1 = puVar6;
        }
        bVar3 = pbVar8 + 1 < local_e8;
        pppuVar10 = (undefined8 ***)((long)pppuVar11 + 1);
        *(undefined1 *)pppuVar11 = puVar1[0x10];
        pbVar8 = pbVar8 + 1;
        pppuVar11 = pppuVar10;
      } while (bVar3);
    }
    *(undefined1 *)pppuVar10 = 0;
    iVar4 = sscanf((char *)local_178,"%Lf",param_7);
    if (iVar4 != 1) {
                    /* try { // try from 00bed4b0 to 00bed4bb has its CatchHandler @ 00bed4c0 */
      uVar7 = __throw_runtime_error("money_get error");
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bed33c with catch @ 00bed4bc
                        */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bed264 with catch @ 00bed4f0
                       catch(type#1 @ 00000000) { ... } // from try @ 00bed4ac with catch @ 00bed4f0
                        */
      locale::~locale((locale *)&local_f0);
      pbVar2 = local_e0;
      local_e0 = (byte *)0x0;
      if (pbVar2 != (byte *)0x0) {
                    /* try { // try from 00bed50c to 00bed50f has its CatchHandler @ 00bed518 */
        (*local_d8)();
      }
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar7);
    }
    if (__ptr != (undefined8 ***)0x0) {
      free(__ptr);
    }
  }
  if (local_68 == (long *)0x0) {
LAB_00bed41c:
    bVar3 = true;
    if (param_3 != (long *)0x0) goto LAB_00bed424;
LAB_00bed410:
    if (!bVar3) goto LAB_00bed440;
  }
  else {
    if (local_68[3] == local_68[4]) {
                    /* try { // try from 00bed3f4 to 00bed3f7 has its CatchHandler @ 00bed4ec */
      iVar4 = (**(code **)(*local_68 + 0x48))();
      if (iVar4 == -1) {
        local_68 = (long *)0x0;
        goto LAB_00bed41c;
      }
      bVar3 = local_68 == (long *)0x0;
    }
    else {
      bVar3 = false;
    }
    if (param_3 == (long *)0x0) goto LAB_00bed410;
LAB_00bed424:
    if (param_3[3] == param_3[4]) {
                    /* try { // try from 00bed490 to 00bed497 has its CatchHandler @ 00bed4ec */
      iVar4 = (**(code **)(*param_3 + 0x48))(param_3);
      if (bVar3 != (iVar4 == -1)) goto LAB_00bed440;
    }
    else if (bVar3 != false) goto LAB_00bed440;
  }
  *param_6 = *param_6 | 2;
LAB_00bed440:
  plVar9 = local_68;
  locale::~locale((locale *)&local_f0);
  pbVar2 = local_e0;
  local_e0 = (byte *)0x0;
  if (pbVar2 != (byte *)0x0) {
                    /* try { // try from 00bed45c to 00bed45f has its CatchHandler @ 00bed4d8 */
    (*local_d8)();
  }
  return plVar9;
}

