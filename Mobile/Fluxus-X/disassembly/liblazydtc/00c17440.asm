; FUN_00c17440 @ 00c17440
00c17440	paciasp
00c17444	stp x29,x30,[sp, #-0x40]!
00c17448	str x23,[sp, #0x10]
00c1744c	stp x22,x21,[sp, #0x20]
00c17450	stp x20,x19,[sp, #0x30]
00c17454	mov x29,sp
00c17458	ldr x23,[x0, #0x1330]
00c1745c	mov x20,x3
00c17460	mov x19,x2
00c17464	mov x21,x1
00c17468	ldr x8,[x23, #0x8]
00c1746c	sub x9,x8,#0xfc0
00c17470	cmn x9,#0xff1
00c17474	b.hi 0x00c17498
00c17478	mov x22,x0
00c1747c	mov w0,#0x1000
00c17480	bl 0x00c308d0
00c17484	cbz x0,0x00c174fc
00c17488	mov x8,xzr
00c1748c	stp x23,xzr,[x0]
00c17490	mov x23,x0
00c17494	str x0,[x22, #0x1330]
00c17498	add x9,x8,#0x30
00c1749c	add x0,x23,x8
00c174a0	adrp x8,0xcb1000
00c174a4	add x8,x8,#0xb08
00c174a8	str x9,[x23, #0x8]
00c174ac	ldr x10,[x21]
00c174b0	str x8,[x0, #0x10]!
00c174b4	ldurh w8,[x0, #0x9]
00c174b8	ldrh w9,[x20]
00c174bc	mov w11,#0x38
00c174c0	str x10,[x0, #0x10]
00c174c4	and w8,w8,#0xf000
00c174c8	strb w11,[x0, #0x8]
00c174cc	bfxil w8,w9,#0x0,#0x6
00c174d0	mov w9,#0x540
00c174d4	ldr q0,[x19]
00c174d8	orr w8,w8,w9
00c174dc	sturh w8,[x0, #0x9]
00c174e0	stur q0,[x0, #0x18]
00c174e4	ldp x20,x19,[sp, #0x30]
00c174e8	ldr x23,[sp, #0x10]
00c174ec	ldp x22,x21,[sp, #0x20]
00c174f0	ldp x29,x30,[sp], #0x40
00c174f4	autiasp
00c174f8	ret
00c174fc	bl 0x00c2fff0
