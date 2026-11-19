; PEM_read_PUBKEY_ex @ 00ab85a0
00ab85a0	str x25,[sp, #-0x50]!
00ab85a4	stp x24,x23,[sp, #0x10]
00ab85a8	stp x22,x21,[sp, #0x20]
00ab85ac	stp x20,x19,[sp, #0x30]
00ab85b0	stp x29,x30,[sp, #0x40]
00ab85b4	add x29,sp,#0x40
00ab85b8	mov x19,x5
00ab85bc	mov x20,x4
00ab85c0	mov x21,x3
00ab85c4	mov x22,x2
00ab85c8	mov x23,x1
00ab85cc	mov x25,x0
00ab85d0	bl 0x00c32270
00ab85d4	bl 0x00c32240
00ab85d8	cbz x0,0x00ab8624
00ab85dc	mov w1,#0x6a
00ab85e0	mov x2,xzr
00ab85e4	mov x3,x25
00ab85e8	mov x24,x0
00ab85ec	bl 0x00c321a0
00ab85f0	mov w6,#0x86
00ab85f4	mov x0,x24
00ab85f8	mov x1,x23
00ab85fc	mov x2,x22
00ab8600	mov x3,x21
00ab8604	mov x4,x20
00ab8608	mov x5,x19
00ab860c	bl 0x00ab7f64
00ab8610	mov x19,x0
00ab8614	mov x0,x24
00ab8618	bl 0x00c31a40
00ab861c	mov x0,x19
00ab8620	b 0x00ab8658
00ab8624	bl 0x00c342a0
00ab8628	adrp x0,0x2d6000
00ab862c	adrp x2,0x2ae000
00ab8630	add x0,x0,#0x444
00ab8634	add x2,x2,#0x566
00ab8638	mov w1,#0x11d
00ab863c	bl 0x00c342b0
00ab8640	mov w1,#0x7
00ab8644	mov w0,#0x9
00ab8648	movk w1,#0x8, LSL #16
00ab864c	mov x2,xzr
00ab8650	bl 0x00c342c0
00ab8654	mov x0,xzr
00ab8658	ldp x29,x30,[sp, #0x40]
00ab865c	ldp x20,x19,[sp, #0x30]
00ab8660	ldp x22,x21,[sp, #0x20]
00ab8664	ldp x24,x23,[sp, #0x10]
00ab8668	ldr x25,[sp], #0x50
00ab866c	ret
