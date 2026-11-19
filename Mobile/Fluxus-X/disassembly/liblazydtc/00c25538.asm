; FUN_00c25538 @ 00c25538
00c25538	paciasp
00c2553c	stp x29,x30,[sp, #-0x30]!
00c25540	str x21,[sp, #0x10]
00c25544	stp x20,x19,[sp, #0x20]
00c25548	mov x29,sp
00c2554c	ldr x21,[x0, #0x1330]
00c25550	mov x19,x1
00c25554	ldr x8,[x21, #0x8]
00c25558	sub x9,x8,#0xfd0
00c2555c	cmn x9,#0xff1
00c25560	b.hi 0x00c25584
00c25564	mov x20,x0
00c25568	mov w0,#0x1000
00c2556c	bl 0x00c308d0
00c25570	cbz x0,0x00c255e0
00c25574	mov x8,xzr
00c25578	stp x21,xzr,[x0]
00c2557c	mov x21,x0
00c25580	str x0,[x20, #0x1330]
00c25584	add x9,x8,#0x20
00c25588	mov x0,x19
00c2558c	add x20,x21,x8
00c25590	str x9,[x21, #0x8]
00c25594	bl 0x00c2ff50
00c25598	adrp x9,0xcb1000
00c2559c	add x9,x9,#0x4c0
00c255a0	mov w11,#0x540
00c255a4	str x9,[x20, #0x10]!
00c255a8	ldurh w9,[x20, #0x9]
00c255ac	mov x8,x0
00c255b0	mov w10,#0x8
00c255b4	and w9,w9,#0xf000
00c255b8	strb w10,[x20, #0x8]
00c255bc	orr w9,w9,w11
00c255c0	stp x19,x8,[x20, #0x10]
00c255c4	sturh w9,[x20, #0x9]
00c255c8	mov x0,x20
00c255cc	ldp x20,x19,[sp, #0x20]
00c255d0	ldr x21,[sp, #0x10]
00c255d4	ldp x29,x30,[sp], #0x30
00c255d8	autiasp
00c255dc	ret
00c255e0	bl 0x00c2fff0
