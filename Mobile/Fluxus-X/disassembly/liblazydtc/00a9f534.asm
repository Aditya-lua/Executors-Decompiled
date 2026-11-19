; OSSL_PARAM_get_octet_string @ 00a9f534
00a9f534	stp x22,x21,[sp, #-0x30]!
00a9f538	orr x8,x1,x3
00a9f53c	cmp x8,#0x0
00a9f540	stp x20,x19,[sp, #0x10]
00a9f544	mov x19,x0
00a9f548	mov w0,wzr
00a9f54c	cset w8,eq
00a9f550	stp x29,x30,[sp, #0x20]
00a9f554	add x29,sp,#0x20
00a9f558	cbz x19,0x00a9f5e8
00a9f55c	tbnz w8,#0x0,0x00a9f5e8
00a9f560	ldr w8,[x19, #0x8]
00a9f564	mov w0,wzr
00a9f568	cmp w8,#0x5
00a9f56c	b.ne 0x00a9f5e8
00a9f570	ldr x21,[x19, #0x18]
00a9f574	mov x20,x1
00a9f578	cmp x21,#0x0
00a9f57c	cinc x22,x21,eq
00a9f580	cbz x3,0x00a9f588
00a9f584	str x21,[x3]
00a9f588	ldr x8,[x19, #0x10]
00a9f58c	cmp x8,#0x0
00a9f590	cset w0,ne
00a9f594	cbz x20,0x00a9f5e8
00a9f598	cbz x8,0x00a9f5e8
00a9f59c	ldr x8,[x20]
00a9f5a0	cbnz x8,0x00a9f5c8
00a9f5a4	adrp x1,0x2a2000
00a9f5a8	add x1,x1,#0x739
00a9f5ac	mov w2,#0x463
00a9f5b0	mov x0,x22
00a9f5b4	bl 0x00c32320
00a9f5b8	cbz x0,0x00a9f5e8
00a9f5bc	mov x8,x0
00a9f5c0	mov x2,x22
00a9f5c4	str x0,[x20]
00a9f5c8	cmp x2,x21
00a9f5cc	mov w0,wzr
00a9f5d0	b.cc 0x00a9f5e8
00a9f5d4	ldr x1,[x19, #0x10]
00a9f5d8	mov x0,x8
00a9f5dc	mov x2,x21
00a9f5e0	bl 0x00c2ffd0
00a9f5e4	mov w0,#0x1
00a9f5e8	ldp x29,x30,[sp, #0x20]
00a9f5ec	ldp x20,x19,[sp, #0x10]
00a9f5f0	ldp x22,x21,[sp], #0x30
00a9f5f4	ret
