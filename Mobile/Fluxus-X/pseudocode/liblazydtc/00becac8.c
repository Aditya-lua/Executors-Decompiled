/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becac8
 */

/* std::__ndk1::__time_put::__do_put(wchar_t*, wchar_t*&, tm const*, char, char) const */

void __thiscall
std::__ndk1::__time_put::__do_put
          (__time_put *this,wchar_t *param_1,wchar_t **param_2,tm *param_3,char param_4,char param_5
          )

{
  undefined8 uVar1;
  __locale_t __dataset;
  size_t sVar2;
  wchar_t *pwVar3;
  char *local_b8;
  mbstate_t mStack_b0;
  char acStack_a4 [100];
  undefined8 local_28;
  
  uVar1 = local_28;
  local_28 = (__locale_t)CONCAT71((uint7)(byte)param_4,0x25);
  local_28._0_3_ = CONCAT12(param_5,(undefined2)local_28);
  local_28._4_4_ = SUB84(uVar1,4);
  local_28._0_4_ = (uint)(uint3)local_28;
  uVar1 = local_28;
  if (param_5 != '\0') {
    local_28._0_2_ = CONCAT11(param_5,0x25);
    local_28._3_5_ = SUB85(uVar1,3);
    local_28._0_3_ = CONCAT12(param_4,(undefined2)local_28);
  }
  strftime_l(acStack_a4,100,(char *)&local_28,param_3,*(__locale_t *)this);
  pwVar3 = *param_2;
  mStack_b0.__count = 0;
  mStack_b0.__value.__wch = 0;
  local_b8 = acStack_a4;
  __dataset = uselocale(*(__locale_t *)this);
                    /* try { // try from 00becb4c to 00becb5f has its CatchHandler @ 00becbac */
  local_28 = __dataset;
  sVar2 = mbsrtowcs(param_1,&local_b8,(long)pwVar3 - (long)param_1 >> 2,&mStack_b0);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00becb68 to 00becb6f has its CatchHandler @ 00becba8 */
    uselocale(__dataset);
  }
  if (sVar2 == 0xffffffffffffffff) {
    __throw_runtime_error("locale not supported");
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00becb68 with catch @ 00becba8
                        */
    FUN_007fe114();
  }
  *param_2 = param_1 + sVar2;
  return;
}

