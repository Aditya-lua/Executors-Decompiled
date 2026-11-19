; cpr::EncodedAuthentication::~EncodedAuthentication @ 008ead80
008ead80	stp x20,x19,[sp, #-0x20]!
008ead84	stp x29,x30,[sp, #0x10]
008ead88	add x29,sp,#0x10
008ead8c	adrp x8,0xcb4000
008ead90	ldr x8,[x8, #0xcb0]
008ead94	mov x20,x0
008ead98	mov x19,x0
008ead9c	add x8,x8,#0x10
008eada0	str x8,[x20], #0x8
008eada4	mov x0,x20
008eada8	bl 0x00c30580
008eadac	ldrb w8,[x20]
008eadb0	tbnz w8,#0x0,0x008eadc0
008eadb4	ldp x29,x30,[sp, #0x10]
008eadb8	ldp x20,x19,[sp], #0x20
008eadbc	ret
008eadc0	ldr x0,[x19, #0x18]
008eadc4	ldp x29,x30,[sp, #0x10]
008eadc8	ldp x20,x19,[sp], #0x20
008eadcc	b 0x00c301d0
