; cpr::Session::SetLowSpeed @ 008eead0
008eead0	stp x20,x19,[sp, #-0x20]!
008eead4	stp x29,x30,[sp, #0x10]
008eead8	add x29,sp,#0x10
008eeadc	ldr x8,[x0, #0x18]
008eeae0	mov x20,x0
008eeae4	ldr w2,[x1]
008eeae8	mov x19,x1
008eeaec	ldr x0,[x8]
008eeaf0	mov w1,#0x13
008eeaf4	bl 0x00c317c0
008eeaf8	ldr x8,[x20, #0x18]
008eeafc	ldr w2,[x19, #0x4]
008eeb00	ldp x29,x30,[sp, #0x10]
008eeb04	mov w1,#0x14
008eeb08	ldr x0,[x8]
008eeb0c	ldp x20,x19,[sp], #0x20
008eeb10	b 0x00c317c0
