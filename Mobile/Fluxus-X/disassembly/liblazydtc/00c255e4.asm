; FUN_00c255e4 @ 00c255e4
00c255e4	paciasp
00c255e8	stp x29,x30,[sp, #-0x30]!
00c255ec	stp x22,x21,[sp, #0x10]
00c255f0	stp x20,x19,[sp, #0x20]
00c255f4	mov x29,sp
00c255f8	ldr x22,[x0, #0x1330]
00c255fc	mov x19,x2
00c25600	mov x20,x1
00c25604	ldr x8,[x22, #0x8]
00c25608	sub x9,x8,#0xfc0
00c2560c	cmn x9,#0xff1
00c25610	b.hi 0x00c25634
00c25614	mov x21,x0
00c25618	mov w0,#0x1000
00c2561c	bl 0x00c308d0
00c25620	cbz x0,0x00c2568c
00c25624	mov x8,xzr
00c25628	stp x22,xzr,[x0]
00c2562c	mov x22,x0
00c25630	str x0,[x21, #0x1330]
00c25634	add x9,x8,#0x30
00c25638	add x0,x22,x8
00c2563c	adrp x8,0xcb3000
00c25640	add x8,x8,#0xbd8
00c25644	str x9,[x22, #0x8]
00c25648	mov w9,#0x540
00c2564c	str x8,[x0, #0x10]!
00c25650	mov w8,#0x7
00c25654	strb w8,[x0, #0x8]
00c25658	ldurh w8,[x0, #0x9]
00c2565c	ldr x10,[x19]
00c25660	ldr q0,[x20]
00c25664	and w8,w8,#0xf000
00c25668	orr w8,w8,w9
00c2566c	str q0,[x0, #0x10]
00c25670	sturh w8,[x0, #0x9]
00c25674	str x10,[x0, #0x20]
00c25678	ldp x20,x19,[sp, #0x20]
00c2567c	ldp x22,x21,[sp, #0x10]
00c25680	ldp x29,x30,[sp], #0x30
00c25684	autiasp
00c25688	ret
00c2568c	bl 0x00c2fff0
