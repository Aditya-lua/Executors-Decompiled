/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbd40
 */

/* cpr::CurlContainer<cpr::Parameter>::CurlContainer(std::initializer_list<cpr::Parameter> const&)
    */

void __thiscall
cpr::CurlContainer<cpr::Parameter>::CurlContainer
          (CurlContainer<cpr::Parameter> *this,initializer_list *param_1)

{
  Parameter *this_00;
  Parameter *pPVar1;
  ulong uVar2;
  
  *this = (CurlContainer<cpr::Parameter>)0x1;
  pPVar1 = *(Parameter **)param_1;
  uVar2 = *(ulong *)(param_1 + 8);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  if (uVar2 != 0) {
    if (0x555555555555555 < uVar2) {
                    /* try { // try from 008fbdd8 to 008fbddf has its CatchHandler @ 008fbde0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__vector_base_common<true>::__throw_length_error();
    }
    uVar2 = uVar2 * 0x30;
                    /* try { // try from 008fbd90 to 008fbd97 has its CatchHandler @ 008fbde0 */
    this_00 = operator_new(uVar2);
    *(Parameter **)(this + 8) = this_00;
    *(Parameter **)(this + 0x10) = this_00;
    *(Parameter **)(this + 0x18) = this_00 + uVar2;
    do {
                    /* try { // try from 008fbda4 to 008fbdab has its CatchHandler @ 008fbde4 */
      Parameter::Parameter(this_00,pPVar1);
      pPVar1 = pPVar1 + 0x30;
      uVar2 = uVar2 - 0x30;
      this_00 = (Parameter *)(*(long *)(this + 0x10) + 0x30);
      *(Parameter **)(this + 0x10) = this_00;
    } while (uVar2 != 0);
  }
  return;
}

