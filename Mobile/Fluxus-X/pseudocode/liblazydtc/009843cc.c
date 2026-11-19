/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009843cc
 */

/* ix::Socket::Socket(int) */

void __thiscall ix::Socket::Socket(Socket *this,int param_1)

{
  *(int *)(this + 8) = param_1;
  *(undefined8 *)(this + 0x2c) = 0;
  *(undefined ***)this = &PTR__Socket_00c51e28;
  *(undefined8 *)(this + 0xc) = 0;
  *(undefined8 *)(this + 0x24) = 0;
  *(undefined8 *)(this + 0x1c) = 0;
  *(undefined8 *)(this + 0x14) = 0;
                    /* try { // try from 00984408 to 0098440b has its CatchHandler @ 00984418 */
  createSelectInterrupt((ix *)this);
  return;
}

