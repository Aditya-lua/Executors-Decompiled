; ASN1_TIME_cmp_time_t @ 009ef508
009ef508	sub sp,sp,#0x90
009ef50c	stp x29,x30,[sp, #0x80]
009ef510	add x29,sp,#0x80
009ef514	stur x1,[x29, #-0x8]
009ef518	cbz x0,0x009ef534
009ef51c	mov x8,x0
009ef520	add x0,sp,#0x40
009ef524	mov x1,x8
009ef528	bl 0x009ee624
009ef52c	cbnz w0,0x009ef564
009ef530	b 0x009ef5b4
009ef534	add x0,sp,#0x8
009ef538	bl 0x00c30970
009ef53c	add x0,sp,#0x8
009ef540	add x1,sp,#0x40
009ef544	stp xzr,xzr,[sp, #0x68]
009ef548	stp xzr,xzr,[sp, #0x58]
009ef54c	stp xzr,xzr,[sp, #0x48]
009ef550	str xzr,[sp, #0x40]
009ef554	bl 0x00c37980
009ef558	cmp x0,#0x0
009ef55c	cset w0,ne
009ef560	cbz w0,0x009ef5b4
009ef564	sub x0,x29,#0x8
009ef568	add x1,sp,#0x8
009ef56c	bl 0x00c37980
009ef570	cbz x0,0x009ef5b4
009ef574	add x0,sp,#0x4
009ef578	mov x1,sp
009ef57c	add x2,sp,#0x8
009ef580	add x3,sp,#0x40
009ef584	bl 0x00c379a0
009ef588	cbz w0,0x009ef5b4
009ef58c	ldr w8,[sp, #0x4]
009ef590	mov w0,#0x1
009ef594	cmp w8,#0x0
009ef598	b.gt 0x009ef5b8
009ef59c	ldr w9,[sp]
009ef5a0	cmp w9,#0x0
009ef5a4	b.gt 0x009ef5b8
009ef5a8	orr w8,w9,w8
009ef5ac	asr w0,w8,#0x1f
009ef5b0	b 0x009ef5b8
009ef5b4	orr w0,wzr,#0xfffffffe
009ef5b8	ldp x29,x30,[sp, #0x80]
009ef5bc	add sp,sp,#0x90
009ef5c0	ret
