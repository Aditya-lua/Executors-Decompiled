; FUN_00c17500 @ 00c17500
00c17500	paciasp
00c17504	stp x29,x30,[sp, #-0x40]!
00c17508	str x23,[sp, #0x10]
00c1750c	stp x22,x21,[sp, #0x20]
00c17510	stp x20,x19,[sp, #0x30]
00c17514	mov x29,sp
00c17518	ldr x23,[x0, #0x1330]
00c1751c	mov x20,x3
00c17520	mov x19,x2
00c17524	mov x21,x1
00c17528	ldr x8,[x23, #0x8]
00c1752c	sub x9,x8,#0xfd0
00c17530	cmn x9,#0xff1
00c17534	b.hi 0x00c17558
00c17538	mov x22,x0
00c1753c	mov w0,#0x1000
00c17540	bl 0x00c308d0
00c17544	cbz x0,0x00c175b8
00c17548	mov x8,xzr
00c1754c	stp x23,xzr,[x0]
00c17550	mov x23,x0
00c17554	str x0,[x22, #0x1330]
00c17558	add x9,x8,#0x20
00c1755c	add x0,x23,x8
00c17560	adrp x8,0xcb1000
00c17564	add x8,x8,#0xb80
00c17568	str x9,[x23, #0x8]
00c1756c	mov w10,#0x540
00c17570	str x8,[x0, #0x10]!
00c17574	ldurh w8,[x0, #0x9]
00c17578	ldrh w9,[x20]
00c1757c	ldr x11,[x21]
00c17580	and w8,w8,#0xf000
00c17584	bfxil w8,w9,#0x0,#0x6
00c17588	mov w9,#0x37
00c1758c	strb w9,[x0, #0x8]
00c17590	ldr x9,[x19]
00c17594	orr w8,w8,w10
00c17598	sturh w8,[x0, #0x9]
00c1759c	stp x11,x9,[x0, #0x10]
00c175a0	ldp x20,x19,[sp, #0x30]
00c175a4	ldr x23,[sp, #0x10]
00c175a8	ldp x22,x21,[sp, #0x20]
00c175ac	ldp x29,x30,[sp], #0x40
00c175b0	autiasp
00c175b4	ret
00c175b8	bl 0x00c2fff0
