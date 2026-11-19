; SRP_VBASE_free @ 00ae7540
00ae7540	cbz x0,0x00ae759c
00ae7544	stp x20,x19,[sp, #-0x20]!
00ae7548	stp x29,x30,[sp, #0x10]
00ae754c	adrp x1,0xcb5000
00ae7550	mov x19,x0
00ae7554	ldr x0,[x0]
00ae7558	ldr x1,[x1, #0x7d8]
00ae755c	add x29,sp,#0x10
00ae7560	bl 0x00c32600
00ae7564	ldr x0,[x19, #0x8]
00ae7568	bl 0x00c34770
00ae756c	ldr x0,[x19, #0x10]
00ae7570	adrp x20,0x2ce000
00ae7574	add x20,x20,#0x365
00ae7578	mov w2,#0x134
00ae757c	mov x1,x20
00ae7580	bl 0x00c32310
00ae7584	ldp x29,x30,[sp, #0x10]
00ae7588	mov w2,#0x135
00ae758c	mov x0,x19
00ae7590	mov x1,x20
00ae7594	ldp x20,x19,[sp], #0x20
00ae7598	b 0x00c32310
00ae759c	ret
