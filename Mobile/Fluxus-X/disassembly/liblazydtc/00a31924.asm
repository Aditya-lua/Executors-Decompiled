; EC_POINT_get_affine_coordinates @ 00a31924
00a31924	str x23,[sp, #-0x40]!
00a31928	stp x22,x21,[sp, #0x10]
00a3192c	stp x20,x19,[sp, #0x20]
00a31930	stp x29,x30,[sp, #0x30]
00a31934	ldr x8,[x0]
00a31938	add x29,sp,#0x30
00a3193c	ldr x9,[x8, #0x80]
00a31940	cbz x9,0x00a3197c
00a31944	ldr x9,[x1]
00a31948	mov x23,x1
00a3194c	cmp x8,x9
00a31950	b.eq 0x00a319a8
00a31954	bl 0x00c342a0
00a31958	adrp x0,0x29e000
00a3195c	adrp x2,0x2aa000
00a31960	add x0,x0,#0xa7
00a31964	add x2,x2,#0xa4
00a31968	mov w1,#0x38d
00a3196c	bl 0x00c342b0
00a31970	mov w0,#0x10
00a31974	mov w1,#0x65
00a31978	b 0x00a31a04
00a3197c	bl 0x00c342a0
00a31980	adrp x0,0x29e000
00a31984	adrp x2,0x2aa000
00a31988	add x0,x0,#0xa7
00a3198c	add x2,x2,#0xa4
00a31990	mov w1,#0x389
00a31994	bl 0x00c342b0
00a31998	mov w1,#0x101
00a3199c	mov w0,#0x10
00a319a0	movk w1,#0xc, LSL #16
00a319a4	b 0x00a31a04
00a319a8	ldr w8,[x0, #0x20]
00a319ac	mov x19,x4
00a319b0	mov x20,x3
00a319b4	mov x21,x2
00a319b8	mov x22,x0
00a319bc	cbz w8,0x00a319d0
00a319c0	ldr w9,[x23, #0x8]
00a319c4	cbz w9,0x00a319d0
00a319c8	cmp w8,w9
00a319cc	b.ne 0x00a31954
00a319d0	mov x0,x22
00a319d4	mov x1,x23
00a319d8	bl 0x00a31a54
00a319dc	cbz w0,0x00a31a24
00a319e0	bl 0x00c342a0
00a319e4	adrp x0,0x29e000
00a319e8	adrp x2,0x2aa000
00a319ec	add x0,x0,#0xa7
00a319f0	add x2,x2,#0xa4
00a319f4	mov w1,#0x391
00a319f8	bl 0x00c342b0
00a319fc	mov w0,#0x10
00a31a00	mov w1,#0x6a
00a31a04	mov x2,xzr
00a31a08	bl 0x00c342c0
00a31a0c	ldp x29,x30,[sp, #0x30]
00a31a10	ldp x20,x19,[sp, #0x20]
00a31a14	ldp x22,x21,[sp, #0x10]
00a31a18	mov w0,wzr
00a31a1c	ldr x23,[sp], #0x40
00a31a20	ret
00a31a24	ldr x8,[x22]
00a31a28	mov x0,x22
00a31a2c	mov x2,x21
00a31a30	mov x3,x20
00a31a34	ldr x5,[x8, #0x80]
00a31a38	mov x4,x19
00a31a3c	ldp x29,x30,[sp, #0x30]
00a31a40	ldp x20,x19,[sp, #0x20]
00a31a44	ldp x22,x21,[sp, #0x10]
00a31a48	mov x1,x23
00a31a4c	ldr x23,[sp], #0x40
00a31a50	br x5
