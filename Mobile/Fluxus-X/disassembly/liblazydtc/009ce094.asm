; ssl3_do_compress @ 009ce094
009ce094	str x19,[sp, #-0x20]!
009ce098	stp x29,x30,[sp, #0x10]
009ce09c	mov x19,x1
009ce0a0	ldr w4,[x1, #0x8]
009ce0a4	ldr x0,[x0, #0x868]
009ce0a8	ldr x1,[x1, #0x20]
009ce0ac	ldr x3,[x19, #0x28]
009ce0b0	add w2,w4,#0x400
009ce0b4	add x29,sp,#0x10
009ce0b8	bl 0x00c36d20
009ce0bc	tbnz w0,#0x1f,0x009ce0d8
009ce0c0	ldr x8,[x19, #0x20]
009ce0c4	sxtw x9,w0
009ce0c8	mov w0,#0x1
009ce0cc	str x9,[x19, #0x8]
009ce0d0	str x8,[x19, #0x28]
009ce0d4	b 0x009ce0dc
009ce0d8	mov w0,wzr
009ce0dc	ldp x29,x30,[sp, #0x10]
009ce0e0	ldr x19,[sp], #0x20
009ce0e4	ret
