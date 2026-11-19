; cpr::EncodedAuthentication::~EncodedAuthentication @ 008eade4
008eade4	stp x20,x19,[sp, #-0x20]!
008eade8	stp x29,x30,[sp, #0x10]
008eadec	add x29,sp,#0x10
008eadf0	adrp x8,0xcb4000
008eadf4	ldr x8,[x8, #0xcb0]
008eadf8	mov x20,x0
008eadfc	mov x19,x0
008eae00	add x8,x8,#0x10
008eae04	str x8,[x20], #0x8
008eae08	mov x0,x20
008eae0c	bl 0x00c30580
008eae10	ldrb w8,[x20]
008eae14	tbz w8,#0x0,0x008eae20
008eae18	ldr x0,[x19, #0x18]
008eae1c	bl 0x00c301d0
008eae20	ldp x29,x30,[sp, #0x10]
008eae24	mov x0,x19
008eae28	ldp x20,x19,[sp], #0x20
008eae2c	b 0x00c301d0
