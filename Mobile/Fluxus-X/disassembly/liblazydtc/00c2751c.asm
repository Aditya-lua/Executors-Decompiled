; FUN_00c2751c @ 00c2751c
00c2751c	paciasp
00c27520	stp x29,x30,[sp, #-0x30]!
00c27524	str x21,[sp, #0x10]
00c27528	stp x20,x19,[sp, #0x20]
00c2752c	mov x29,sp
00c27530	ldr x21,[x0, #0x1330]
00c27534	mov x19,x1
00c27538	ldr x8,[x21, #0x8]
00c2753c	sub x9,x8,#0xfd0
00c27540	cmn x9,#0xff1
00c27544	b.hi 0x00c27568
00c27548	mov x20,x0
00c2754c	mov w0,#0x1000
00c27550	bl 0x00c308d0
00c27554	cbz x0,0x00c275b8
00c27558	mov x8,xzr
00c2755c	stp x21,xzr,[x0]
00c27560	mov x21,x0
00c27564	str x0,[x20, #0x1330]
00c27568	add x9,x8,#0x20
00c2756c	add x0,x21,x8
00c27570	adrp x8,0xcb3000
00c27574	add x8,x8,#0xdb8
00c27578	str x9,[x21, #0x8]
00c2757c	mov w9,#0x1e
00c27580	str x8,[x0, #0x10]!
00c27584	ldurh w8,[x0, #0x9]
00c27588	mov w10,#0x540
00c2758c	strb w9,[x0, #0x8]
00c27590	ldr x9,[x19]
00c27594	and w8,w8,#0xf000
00c27598	orr w8,w8,w10
00c2759c	sturh w8,[x0, #0x9]
00c275a0	str x9,[x0, #0x10]
00c275a4	ldp x20,x19,[sp, #0x20]
00c275a8	ldr x21,[sp, #0x10]
00c275ac	ldp x29,x30,[sp], #0x30
00c275b0	autiasp
00c275b4	ret
00c275b8	bl 0x00c2fff0
