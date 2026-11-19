; EC_KEY_set_method @ 00a2fc70
00a2fc70	stp x20,x19,[sp, #-0x20]!
00a2fc74	stp x29,x30,[sp, #0x10]
00a2fc78	ldr x8,[x0]
00a2fc7c	mov x19,x0
00a2fc80	mov x20,x1
00a2fc84	add x29,sp,#0x10
00a2fc88	ldr x8,[x8, #0x18]
00a2fc8c	cbz x8,0x00a2fc98
00a2fc90	mov x0,x19
00a2fc94	blr x8
00a2fc98	ldr x0,[x19, #0x8]
00a2fc9c	bl 0x00c32360
00a2fca0	stp x20,xzr,[x19]
00a2fca4	ldr x1,[x20, #0x10]
00a2fca8	cbz x1,0x00a2fcbc
00a2fcac	ldp x29,x30,[sp, #0x10]
00a2fcb0	mov x0,x19
00a2fcb4	ldp x20,x19,[sp], #0x20
00a2fcb8	br x1
00a2fcbc	ldp x29,x30,[sp, #0x10]
00a2fcc0	mov w0,#0x1
00a2fcc4	ldp x20,x19,[sp], #0x20
00a2fcc8	ret
