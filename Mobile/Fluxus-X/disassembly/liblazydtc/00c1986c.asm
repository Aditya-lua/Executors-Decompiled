; FUN_00c1986c @ 00c1986c
00c1986c	paciasp
00c19870	stp x29,x30,[sp, #-0x30]!
00c19874	str x21,[sp, #0x10]
00c19878	stp x20,x19,[sp, #0x20]
00c1987c	mov x29,sp
00c19880	ldr x21,[x0, #0x1330]
00c19884	mov x19,x1
00c19888	ldr x8,[x21, #0x8]
00c1988c	sub x9,x8,#0xfd0
00c19890	cmn x9,#0xff1
00c19894	b.hi 0x00c198b8
00c19898	mov x20,x0
00c1989c	mov w0,#0x1000
00c198a0	bl 0x00c308d0
00c198a4	cbz x0,0x00c19914
00c198a8	mov x8,xzr
00c198ac	stp x21,xzr,[x0]
00c198b0	mov x21,x0
00c198b4	str x0,[x20, #0x1330]
00c198b8	add x9,x8,#0x20
00c198bc	mov x0,x19
00c198c0	add x20,x21,x8
00c198c4	str x9,[x21, #0x8]
00c198c8	bl 0x00c2ff50
00c198cc	adrp x9,0xcb1000
00c198d0	add x9,x9,#0x4c0
00c198d4	mov w11,#0x540
00c198d8	str x9,[x20, #0x10]!
00c198dc	ldurh w9,[x20, #0x9]
00c198e0	mov x8,x0
00c198e4	mov w10,#0x8
00c198e8	and w9,w9,#0xf000
00c198ec	strb w10,[x20, #0x8]
00c198f0	orr w9,w9,w11
00c198f4	stp x19,x8,[x20, #0x10]
00c198f8	sturh w9,[x20, #0x9]
00c198fc	mov x0,x20
00c19900	ldp x20,x19,[sp, #0x20]
00c19904	ldr x21,[sp, #0x10]
00c19908	ldp x29,x30,[sp], #0x30
00c1990c	autiasp
00c19910	ret
00c19914	bl 0x00c2fff0
