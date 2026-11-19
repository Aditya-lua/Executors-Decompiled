/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00981070
 */

/* ix::ConnectionState::createConnectionState() */

void __thiscall ix::ConnectionState::createConnectionState(ConnectionState *this)

{
  undefined8 *puVar1;
  undefined8 *in_x8;
  
  puVar1 = operator_new(0xa0);
  puVar1[2] = 0;
  *puVar1 = &PTR____shared_ptr_emplace_00c51d88;
  puVar1[1] = 0;
                    /* try { // try from 009810a8 to 009810af has its CatchHandler @ 009810c4 */
  ConnectionState((ConnectionState *)(puVar1 + 4));
  *in_x8 = (ConnectionState *)(puVar1 + 4);
  in_x8[1] = puVar1;
  return;
}

