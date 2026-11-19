; EVP_MAC_CTX_get_mac_size @ 00a68500
00a68500	sub sp,sp,#0xa0
00a68504	stp x29,x30,[sp, #0x90]
00a68508	add x29,sp,#0x90
00a6850c	stur xzr,[x29, #-0x8]
00a68510	ldr x8,[x0, #0x8]
00a68514	str x19,[sp, #0x80]
00a68518	cbz x8,0x00a68594
00a6851c	mov x19,x0
00a68520	add x0,sp,#0x30
00a68524	mov w2,#0x50
00a68528	mov w1,wzr
00a6852c	bl 0x00c301c0
00a68530	adrp x0,0x2d7000
00a68534	add x0,x0,#0xe7d
00a68538	add x8,sp,#0x8
00a6853c	sub x1,x29,#0x8
00a68540	bl 0x00c36270
00a68544	ldr x8,[sp, #0x28]
00a68548	ldur q0,[sp, #0x18]
00a6854c	ldur q1,[sp, #0x8]
00a68550	str x8,[sp, #0x50]
00a68554	stp q1,q0,[sp, #0x30]
00a68558	ldr x9,[x19]
00a6855c	ldr x8,[x9, #0x80]
00a68560	cbz x8,0x00a68578
00a68564	ldr x0,[x19, #0x8]
00a68568	add x1,sp,#0x30
00a6856c	blr x8
00a68570	cbnz w0,0x00a6858c
00a68574	b 0x00a68594
00a68578	ldr x8,[x9, #0x78]
00a6857c	cbz x8,0x00a68594
00a68580	add x0,sp,#0x30
00a68584	blr x8
00a68588	cbz w0,0x00a68594
00a6858c	ldur x0,[x29, #-0x8]
00a68590	b 0x00a68598
00a68594	mov x0,xzr
00a68598	ldp x29,x30,[sp, #0x90]
00a6859c	ldr x19,[sp, #0x80]
00a685a0	add sp,sp,#0xa0
00a685a4	ret
