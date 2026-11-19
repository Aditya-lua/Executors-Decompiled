; mbedtls_ecjpake_init @ 00ba053c
00ba053c	str x19,[sp, #-0x20]!
00ba0540	stp x29,x30,[sp, #0x10]
00ba0544	add x29,sp,#0x10
00ba0548	mov x19,x0
00ba054c	str wzr,[x0], #0x8
00ba0550	bl 0x00c426c0
00ba0554	add x0,x19,#0xd0
00ba0558	str wzr,[x19, #0xcc]
00ba055c	bl 0x00c42760
00ba0560	add x0,x19,#0x100
00ba0564	bl 0x00c42760
00ba0568	add x0,x19,#0x130
00ba056c	bl 0x00c42760
00ba0570	add x0,x19,#0x160
00ba0574	bl 0x00c42760
00ba0578	add x0,x19,#0x190
00ba057c	bl 0x00c42760
00ba0580	add x0,x19,#0x1c0
00ba0584	bl 0x00c41c00
00ba0588	add x0,x19,#0x1d0
00ba058c	bl 0x00c41c00
00ba0590	ldp x29,x30,[sp, #0x10]
00ba0594	add x0,x19,#0x1e0
00ba0598	ldr x19,[sp], #0x20
00ba059c	b 0x00c41c00
