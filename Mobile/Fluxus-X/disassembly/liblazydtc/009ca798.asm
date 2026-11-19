; RECORD_LAYER_release @ 009ca798
009ca798	str x19,[sp, #-0x20]!
009ca79c	stp x29,x30,[sp, #0x10]
009ca7a0	ldr x8,[x0, #0x20]
009ca7a4	mov x19,x0
009ca7a8	add x29,sp,#0x10
009ca7ac	cbz x8,0x009ca7b8
009ca7b0	ldr x0,[x19]
009ca7b4	bl 0x00c36cd0
009ca7b8	ldr x8,[x19, #0x18]
009ca7bc	cbz x8,0x009ca7c8
009ca7c0	ldr x0,[x19]
009ca7c4	bl 0x00c36ce0
009ca7c8	ldp x29,x30,[sp, #0x10]
009ca7cc	add x0,x19,#0x650
009ca7d0	mov w1,#0x20
009ca7d4	ldr x19,[sp], #0x20
009ca7d8	b 0x00c36c30
