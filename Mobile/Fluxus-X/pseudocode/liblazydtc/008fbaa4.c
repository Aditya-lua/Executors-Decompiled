/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbaa4
 */

/* cpr::CurlContainer<cpr::Pair>::CurlContainer(std::initializer_list<cpr::Pair> const&) */

void __thiscall
cpr::CurlContainer<cpr::Pair>::CurlContainer
          (CurlContainer<cpr::Pair> *this,initializer_list *param_1)

{
  Pair *this_00;
  Pair *pPVar1;
  ulong uVar2;
  
  *this = (CurlContainer<cpr::Pair>)0x1;
  pPVar1 = *(Pair **)param_1;
  uVar2 = *(ulong *)(param_1 + 8);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  if (uVar2 != 0) {
    if (0x555555555555555 < uVar2) {
                    /* try { // try from 008fbb3c to 008fbb43 has its CatchHandler @ 008fbb44 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__vector_base_common<true>::__throw_length_error();
    }
    uVar2 = uVar2 * 0x30;
                    /* try { // try from 008fbaf4 to 008fbafb has its CatchHandler @ 008fbb44 */
    this_00 = operator_new(uVar2);
    *(Pair **)(this + 8) = this_00;
    *(Pair **)(this + 0x10) = this_00;
    *(Pair **)(this + 0x18) = this_00 + uVar2;
    do {
                    /* try { // try from 008fbb08 to 008fbb0f has its CatchHandler @ 008fbb48 */
      Pair::Pair(this_00,pPVar1);
      pPVar1 = pPVar1 + 0x30;
      uVar2 = uVar2 - 0x30;
      this_00 = (Pair *)(*(long *)(this + 0x10) + 0x30);
      *(Pair **)(this + 0x10) = this_00;
    } while (uVar2 != 0);
  }
  return;
}

