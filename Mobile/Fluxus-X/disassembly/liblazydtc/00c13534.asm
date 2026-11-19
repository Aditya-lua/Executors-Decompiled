; FUN_00c13534 @ 00c13534
00c13534	paciasp
00c13538	stp x29,x30,[sp, #-0x30]!
00c1353c	str x21,[sp, #0x10]
00c13540	stp x20,x19,[sp, #0x20]
00c13544	mov x29,sp
00c13548	ldr x21,[x0, #0x1330]
00c1354c	mov x19,x1
00c13550	ldr x8,[x21, #0x8]
00c13554	sub x9,x8,#0xfc0
00c13558	cmn x9,#0xff1
00c1355c	b.hi 0x00c13580
00c13560	mov x20,x0
00c13564	mov w0,#0x1000
00c13568	bl 0x00c308d0
00c1356c	cbz x0,0x00c135e0
00c13570	mov x8,xzr
00c13574	stp x21,xzr,[x0]
00c13578	mov x21,x0
00c1357c	str x0,[x20, #0x1330]
00c13580	add x9,x8,#0x30
00c13584	add x0,x21,x8
00c13588	adrp x8,0xcb1000
00c1358c	add x8,x8,#0x3c0
00c13590	str x9,[x21, #0x8]
00c13594	mov w10,#0x540
00c13598	str x8,[x0, #0x10]!
00c1359c	ldurh w9,[x0, #0x9]
00c135a0	mov w8,#0x15
00c135a4	mov w11,#0xb
00c135a8	strb w8,[x0, #0x8]
00c135ac	adrp x8,0x2be000
00c135b0	add x8,x8,#0xd75
00c135b4	and w9,w9,#0xf000
00c135b8	str x8,[x0, #0x10]
00c135bc	orr w8,w9,w10
00c135c0	ldr x9,[x19]
00c135c4	sturh w8,[x0, #0x9]
00c135c8	stp x11,x9,[x0, #0x18]
00c135cc	ldp x20,x19,[sp, #0x20]
00c135d0	ldr x21,[sp, #0x10]
00c135d4	ldp x29,x30,[sp], #0x30
00c135d8	autiasp
00c135dc	ret
00c135e0	bl 0x00c2fff0
