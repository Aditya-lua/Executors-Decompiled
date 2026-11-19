; FUN_007fc8a8 @ 007fc8a8
007fc8a8	stp x29,x30,[sp, #-0x20]!
007fc8ac	stp x20,x19,[sp, #0x10]
007fc8b0	mov x29,sp
007fc8b4	mov x19,x0
007fc8b8	ldr x0,[x0, #0x10]
007fc8bc	cbz x0,0x007fc8d4
007fc8c0	ldr x20,[x0]
007fc8c4	mov w1,#0x20
007fc8c8	bl 0x00c2fe80
007fc8cc	mov x0,x20
007fc8d0	cbnz x20,0x007fc8c0
007fc8d4	ldr x0,[x19]
007fc8d8	str xzr,[x19]
007fc8dc	cbz x0,0x007fc8f4
007fc8e0	ldr x8,[x19, #0x8]
007fc8e4	lsl x1,x8,#0x3
007fc8e8	ldp x20,x19,[sp, #0x10]
007fc8ec	ldp x29,x30,[sp], #0x20
007fc8f0	b 0x00c2fe80
007fc8f4	ldp x20,x19,[sp, #0x10]
007fc8f8	ldp x29,x30,[sp], #0x20
007fc8fc	ret
