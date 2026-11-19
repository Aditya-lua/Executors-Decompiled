; FUN_00c14548 @ 00c14548
00c14548	paciasp
00c1454c	stp x29,x30,[sp, #-0x30]!
00c14550	str x21,[sp, #0x10]
00c14554	stp x20,x19,[sp, #0x20]
00c14558	mov x29,sp
00c1455c	ldr x21,[x0, #0x1330]
00c14560	mov x19,x1
00c14564	ldr x8,[x21, #0x8]
00c14568	sub x9,x8,#0xfd0
00c1456c	cmn x9,#0xff1
00c14570	b.hi 0x00c14594
00c14574	mov x20,x0
00c14578	mov w0,#0x1000
00c1457c	bl 0x00c308d0
00c14580	cbz x0,0x00c145e4
00c14584	mov x8,xzr
00c14588	stp x21,xzr,[x0]
00c1458c	mov x21,x0
00c14590	str x0,[x20, #0x1330]
00c14594	add x9,x8,#0x20
00c14598	add x0,x21,x8
00c1459c	adrp x8,0xcb1000
00c145a0	add x8,x8,#0x4c0
00c145a4	str x9,[x21, #0x8]
00c145a8	mov w9,#0x8
00c145ac	str x8,[x0, #0x10]!
00c145b0	ldurh w8,[x0, #0x9]
00c145b4	strb w9,[x0, #0x8]
00c145b8	mov w9,#0x540
00c145bc	and w8,w8,#0xf000
00c145c0	ldr q0,[x19]
00c145c4	orr w8,w8,w9
00c145c8	sturh w8,[x0, #0x9]
00c145cc	str q0,[x0, #0x10]
00c145d0	ldp x20,x19,[sp, #0x20]
00c145d4	ldr x21,[sp, #0x10]
00c145d8	ldp x29,x30,[sp], #0x30
00c145dc	autiasp
00c145e0	ret
00c145e4	bl 0x00c2fff0
