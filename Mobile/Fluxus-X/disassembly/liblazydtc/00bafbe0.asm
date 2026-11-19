; ZSTD_createDCtx @ 00bafbe0
00bafbe0	stp x29,x30,[sp, #-0x10]!
00bafbe4	mov x29,sp
00bafbe8	mov w0,#0x76e8
00bafbec	movk w0,#0x1, LSL #16
00bafbf0	bl 0x00c308d0
00bafbf4	cbz x0,0x00bafc7c
00bafbf8	fmov d0,xzr
00bafbfc	movi v1.2D,#0x0
00bafc00	mov w8,#0x76d8
00bafc04	movk w8,#0x1, LSL #16
00bafc08	mov w9,#0x75e0
00bafc0c	mov w10,#0x75e8
00bafc10	str xzr,[x0, x8#0x0]
00bafc14	mov w8,#0x761c
00bafc18	add x9,x0,x9
00bafc1c	mov v2.16B,v0.16B
00bafc20	add x8,x0,x8
00bafc24	str xzr,[x0, #0x75d8]
00bafc28	str q1,[x8]
00bafc2c	str wzr,[x8, #0x10]
00bafc30	mov w8,#0x1
00bafc34	mov v2.D[0x1],v0.D[0x0]
00bafc38	fmov d0,d0
00bafc3c	str w8,[x9]
00bafc40	mov w8,#0x7608
00bafc44	str xzr,[x0, #0x74d8]
00bafc48	str xzr,[x0, #0x7648]
00bafc4c	str q0,[x0,x8]
00bafc50	mov w8,#0x1
00bafc54	movk w8,#0x800, LSL #16
00bafc58	stur d1,[x9, #0x1c]
00bafc5c	str q2,[x0,x10]
00bafc60	str xzr,[x0, #0x75b0]
00bafc64	str xzr,[x0, #0x75c0]
00bafc68	str xzr,[x0, #0x75b8]
00bafc6c	str x8,[x0, #0x7638]
00bafc70	stur d1,[x9, #0x8c]
00bafc74	str d1,[x0, #0x7598]
00bafc78	str wzr,[x9, #0x38]
00bafc7c	ldp x29,x30,[sp], #0x10
00bafc80	ret
