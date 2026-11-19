; FUN_007ff544 @ 007ff544
007ff544	stp x29,x30,[sp, #-0x20]!
007ff548	stp x20,x19,[sp, #0x10]
007ff54c	mov x29,sp
007ff550	ldr x19,[x0]
007ff554	str xzr,[x0]
007ff558	cbz x19,0x007ff590
007ff55c	ldr x20,[x19]
007ff560	str xzr,[x19]
007ff564	cbz x20,0x007ff57c
007ff568	mov x0,x20
007ff56c	bl 0x00c301a0
007ff570	mov x0,x20
007ff574	mov w1,#0x8
007ff578	bl 0x00c2fe80
007ff57c	mov x0,x19
007ff580	mov w1,#0x10
007ff584	ldp x20,x19,[sp, #0x10]
007ff588	ldp x29,x30,[sp], #0x20
007ff58c	b 0x00c2fe80
007ff590	ldp x20,x19,[sp, #0x10]
007ff594	ldp x29,x30,[sp], #0x20
007ff598	ret
