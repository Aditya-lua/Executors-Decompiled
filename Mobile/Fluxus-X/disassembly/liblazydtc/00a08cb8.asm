; BN_nnmod @ 00a08cb8
00a08cb8	stp x20,x19,[sp, #-0x20]!
00a08cbc	cmp x0,x2
00a08cc0	stp x29,x30,[sp, #0x10]
00a08cc4	add x29,sp,#0x10
00a08cc8	b.eq 0x00a08d2c
00a08ccc	mov x19,x2
00a08cd0	mov x20,x0
00a08cd4	mov x4,x3
00a08cd8	mov x2,x1
00a08cdc	mov x0,xzr
00a08ce0	mov x1,x20
00a08ce4	mov x3,x19
00a08ce8	bl 0x00c38ab0
00a08cec	cbz w0,0x00a08d68
00a08cf0	ldr w8,[x20, #0x10]
00a08cf4	cbz w8,0x00a08d64
00a08cf8	ldr w8,[x19, #0x10]
00a08cfc	adrp x9,0xcb5000
00a08d00	adrp x10,0xcb5000
00a08d04	ldr x9,[x9, #0x3d0]
00a08d08	ldr x10,[x10, #0x3c8]
00a08d0c	ldp x29,x30,[sp, #0x10]
00a08d10	cmp w8,#0x0
00a08d14	mov x0,x20
00a08d18	csel x3,x10,x9,eq
00a08d1c	mov x1,x20
00a08d20	mov x2,x19
00a08d24	ldp x20,x19,[sp], #0x20
00a08d28	br x3
00a08d2c	bl 0x00c342a0
00a08d30	adrp x0,0x2b4000
00a08d34	adrp x2,0x2d1000
00a08d38	add x0,x0,#0x47
00a08d3c	add x2,x2,#0x736
00a08d40	mov w1,#0x15
00a08d44	bl 0x00c342b0
00a08d48	mov w1,#0x106
00a08d4c	orr w0,wzr,#0x3
00a08d50	movk w1,#0x8, LSL #16
00a08d54	mov x2,xzr
00a08d58	bl 0x00c342c0
00a08d5c	mov w0,wzr
00a08d60	b 0x00a08d68
00a08d64	mov w0,#0x1
00a08d68	ldp x29,x30,[sp, #0x10]
00a08d6c	ldp x20,x19,[sp], #0x20
00a08d70	ret
