; FUN_00c13484 @ 00c13484
00c13484	paciasp
00c13488	stp x29,x30,[sp, #-0x30]!
00c1348c	str x21,[sp, #0x10]
00c13490	stp x20,x19,[sp, #0x20]
00c13494	mov x29,sp
00c13498	ldr x21,[x0, #0x1330]
00c1349c	mov x19,x1
00c134a0	ldr x8,[x21, #0x8]
00c134a4	sub x9,x8,#0xfc0
00c134a8	cmn x9,#0xff1
00c134ac	b.hi 0x00c134d0
00c134b0	mov x20,x0
00c134b4	mov w0,#0x1000
00c134b8	bl 0x00c308d0
00c134bc	cbz x0,0x00c13530
00c134c0	mov x8,xzr
00c134c4	stp x21,xzr,[x0]
00c134c8	mov x21,x0
00c134cc	str x0,[x20, #0x1330]
00c134d0	add x9,x8,#0x30
00c134d4	add x0,x21,x8
00c134d8	adrp x8,0xcb1000
00c134dc	add x8,x8,#0x3c0
00c134e0	str x9,[x21, #0x8]
00c134e4	mov w10,#0x540
00c134e8	str x8,[x0, #0x10]!
00c134ec	ldurh w9,[x0, #0x9]
00c134f0	mov w8,#0x15
00c134f4	mov w11,#0x1e
00c134f8	strb w8,[x0, #0x8]
00c134fc	adrp x8,0x2d0000
00c13500	add x8,x8,#0xa67
00c13504	and w9,w9,#0xf000
00c13508	str x8,[x0, #0x10]
00c1350c	orr w8,w9,w10
00c13510	ldr x9,[x19]
00c13514	sturh w8,[x0, #0x9]
00c13518	stp x11,x9,[x0, #0x18]
00c1351c	ldp x20,x19,[sp, #0x20]
00c13520	ldr x21,[sp, #0x10]
00c13524	ldp x29,x30,[sp], #0x30
00c13528	autiasp
00c1352c	ret
00c13530	bl 0x00c2fff0
