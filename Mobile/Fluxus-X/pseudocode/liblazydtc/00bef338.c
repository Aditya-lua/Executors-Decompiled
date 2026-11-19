/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bef338
 */

/* std::__ndk1::money_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, bool, std::__ndk1::ios_base&, unsigned int&, long double&)
   const */

long * __thiscall
std::__ndk1::
money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_get(undefined8 param_1,long *param_2,long *param_3,uint param_4,long param_5,uint *param_6,
      undefined8 param_7)

{
  wchar_t *pwVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  wchar_t **__ptr;
  wchar_t *pwVar5;
  undefined8 uVar6;
  wchar_t *pwVar7;
  long *plVar8;
  wchar_t **ppwVar9;
  wchar_t **ppwVar10;
  wchar_t *local_2b8 [13];
  wchar_t **local_250 [5];
  wchar_t local_228;
  undefined4 uStack_221;
  char local_21c [4];
  long local_218;
  wchar_t *local_210;
  wchar_t *local_208;
  code *local_200;
  wchar_t awStack_1f8 [100];
  long *local_68;
  
  local_208 = awStack_1f8;
  local_200 = __do_nothing;
  local_68 = param_2;
                    /* try { // try from 00bef384 to 00bef38f has its CatchHandler @ 00bef638 */
  ios_base::getloc();
  _local_228 = 0xd27260;
  uStack_221 = uStack_221 & 0xffffff00;
  if (ctype<wchar_t>::id != -1) {
    local_2b8[0] = &local_228;
    local_250[0] = local_2b8;
                    /* try { // try from 00bef3bc to 00bef3d3 has its CatchHandler @ 00bef64c */
    __call_once((ulong *)&ctype<wchar_t>::id,local_250,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_218 + 0x18) - *(long *)(local_218 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar8 = *(long **)(*(long *)(local_218 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar8 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bef608 to 00bef60b has its CatchHandler @ 00bef64c */
    FUN_00bd8968();
  }
  local_21c[0] = '\0';
                    /* try { // try from 00bef400 to 00bef42f has its CatchHandler @ 00bef648 */
  uVar4 = __do_get(&local_68,param_3,param_4 & 1,&local_218,*(undefined4 *)(param_5 + 8),param_6,
                   local_21c,plVar8,&local_208,&local_210,&local_68);
  if ((uVar4 & 1) != 0) {
    _local_228 = 0x36353433323130;
    uStack_221 = 0x393837;
                    /* try { // try from 00bef45c to 00bef46f has its CatchHandler @ 00bef630 */
    (**(code **)(*plVar8 + 0x60))(plVar8,&local_228,(long)&uStack_221 + 3,local_250);
    pwVar7 = local_208;
    pwVar1 = local_210;
    if ((long)local_210 - (long)local_208 < 0x189) {
LAB_00bef49c:
      __ptr = (wchar_t **)0x0;
      ppwVar10 = local_2b8;
    }
    else {
      __ptr = malloc(((ulong)((long)local_210 - (long)local_208) >> 2) + 2);
      ppwVar10 = __ptr;
      if (__ptr == (wchar_t **)0x0) {
                    /* try { // try from 00bef498 to 00bef49b has its CatchHandler @ 00bef618 */
        __throw_bad_alloc();
        goto LAB_00bef49c;
      }
    }
    ppwVar9 = ppwVar10;
    if (local_21c[0] == '\x01') {
      ppwVar9 = (wchar_t **)((long)ppwVar10 + 1);
      *(undefined1 *)ppwVar10 = 0x2d;
    }
    if (pwVar7 < pwVar1) {
      ppwVar10 = ppwVar9;
      do {
        pwVar5 = wmemchr((wchar_t *)local_250,*pwVar7,10);
        pwVar1 = &local_228;
        if (pwVar5 != (wchar_t *)0x0) {
          pwVar1 = pwVar5;
        }
        bVar2 = pwVar7 + 1 < local_210;
        ppwVar9 = (wchar_t **)((long)ppwVar10 + 1);
        *(undefined1 *)ppwVar10 =
             *(undefined1 *)((long)local_250 + ((long)pwVar1 - (long)local_250 >> 2) + 0x28);
        pwVar7 = pwVar7 + 1;
        ppwVar10 = ppwVar9;
      } while (bVar2);
    }
    *(undefined1 *)ppwVar9 = 0;
    iVar3 = sscanf((char *)local_2b8,"%Lf",param_7);
    if (iVar3 != 1) {
                    /* try { // try from 00bef60c to 00bef617 has its CatchHandler @ 00bef61c */
      uVar6 = __throw_runtime_error("money_get error");
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bef498 with catch @ 00bef618
                        */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bef3bc with catch @ 00bef64c
                       catch(type#1 @ 00000000) { ... } // from try @ 00bef608 with catch @ 00bef64c
                        */
      locale::~locale((locale *)&local_218);
      pwVar1 = local_208;
      local_208 = (wchar_t *)0x0;
      if (pwVar1 != (wchar_t *)0x0) {
                    /* try { // try from 00bef668 to 00bef66b has its CatchHandler @ 00bef674 */
        (*local_200)();
      }
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar6);
    }
    if (__ptr != (wchar_t **)0x0) {
      free(__ptr);
    }
  }
  if (local_68 == (long *)0x0) {
LAB_00bef578:
    bVar2 = true;
    if (param_3 == (long *)0x0) goto LAB_00bef56c;
LAB_00bef580:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar3 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar3 = *(int *)param_3[3];
    }
    if (bVar2 != (iVar3 == -1)) goto LAB_00bef5c0;
  }
  else {
    if ((int *)local_68[3] == (int *)local_68[4]) {
                    /* try { // try from 00bef550 to 00bef5a3 has its CatchHandler @ 00bef648 */
      iVar3 = (**(code **)(*local_68 + 0x48))();
    }
    else {
      iVar3 = *(int *)local_68[3];
    }
    if (iVar3 == -1) {
      local_68 = (long *)0x0;
      goto LAB_00bef578;
    }
    bVar2 = local_68 == (long *)0x0;
    if (param_3 != (long *)0x0) goto LAB_00bef580;
LAB_00bef56c:
    if (!bVar2) goto LAB_00bef5c0;
  }
  *param_6 = *param_6 | 2;
LAB_00bef5c0:
  plVar8 = local_68;
  locale::~locale((locale *)&local_218);
  pwVar1 = local_208;
  local_208 = (wchar_t *)0x0;
  if (pwVar1 != (wchar_t *)0x0) {
                    /* try { // try from 00bef5dc to 00bef5df has its CatchHandler @ 00bef634 */
    (*local_200)();
  }
  return plVar8;
}

