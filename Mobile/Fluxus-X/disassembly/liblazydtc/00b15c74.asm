; NETSCAPE_SPKI_sign @ 00b15c74
00b15c74	sub sp,sp,#0x40
00b15c78	str x21,[sp, #0x10]
00b15c7c	stp x20,x19,[sp, #0x20]
00b15c80	stp x29,x30,[sp, #0x30]
00b15c84	add x29,sp,#0x30
00b15c88	mov x19,x2
00b15c8c	mov x20,x1
00b15c90	mov x21,x0
00b15c94	bl 0x00c38330
00b15c98	ldr x3,[x21, #0x18]
00b15c9c	ldr x4,[x21]
00b15ca0	add x1,x21,#0x8
00b15ca4	mov x2,xzr
00b15ca8	mov x5,xzr
00b15cac	mov x6,x20
00b15cb0	mov x7,x19
00b15cb4	stp xzr,xzr,[sp]
00b15cb8	bl 0x00c377e0
00b15cbc	ldp x29,x30,[sp, #0x30]
00b15cc0	ldp x20,x19,[sp, #0x20]
00b15cc4	ldr x21,[sp, #0x10]
00b15cc8	add sp,sp,#0x40
00b15ccc	ret
