; EVP_PKEY_set_int_param @ 00a6f508
00a6f508	sub sp,sp,#0xa0
00a6f50c	stp x29,x30,[sp, #0x90]
00a6f510	add x29,sp,#0x90
00a6f514	str x19,[sp, #0x80]
00a6f518	stur w2,[x29, #-0x4]
00a6f51c	cbz x1,0x00a6f5bc
00a6f520	mov x9,x1
00a6f524	mov x19,x0
00a6f528	add x8,sp,#0x8
00a6f52c	sub x1,x29,#0x4
00a6f530	mov x0,x9
00a6f534	bl 0x00c36260
00a6f538	ldr x8,[sp, #0x28]
00a6f53c	ldur q0,[sp, #0x18]
00a6f540	ldur q1,[sp, #0x8]
00a6f544	str x8,[sp, #0x50]
00a6f548	add x8,sp,#0x8
00a6f54c	stp q1,q0,[sp, #0x30]
00a6f550	bl 0x00c34c40
00a6f554	ldr x8,[sp, #0x28]
00a6f558	ldur q0,[sp, #0x18]
00a6f55c	ldur q1,[sp, #0x8]
00a6f560	str x8,[sp, #0x78]
00a6f564	stur q0,[sp, #0x68]
00a6f568	stur q1,[sp, #0x58]
00a6f56c	cbz x19,0x00a6f590
00a6f570	ldr x0,[x19, #0x60]
00a6f574	cbz x0,0x00a6f590
00a6f578	ldp x1,x8,[x19, #0x68]
00a6f57c	add x2,sp,#0x30
00a6f580	add x8,x8,#0x1
00a6f584	str x8,[x19, #0x70]
00a6f588	bl 0x00c3d440
00a6f58c	b 0x00a6f5c0
00a6f590	bl 0x00c342a0
00a6f594	adrp x0,0x2c1000
00a6f598	adrp x2,0x2dc000
00a6f59c	add x0,x0,#0xcf9
00a6f5a0	add x2,x2,#0x96
00a6f5a4	mov w1,#0x94c
00a6f5a8	bl 0x00c342b0
00a6f5ac	orr w0,wzr,#0x6
00a6f5b0	mov w1,#0xa3
00a6f5b4	mov x2,xzr
00a6f5b8	bl 0x00c342c0
00a6f5bc	mov w0,wzr
00a6f5c0	ldp x29,x30,[sp, #0x90]
00a6f5c4	ldr x19,[sp, #0x80]
00a6f5c8	add sp,sp,#0xa0
00a6f5cc	ret
