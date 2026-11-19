; EVP_PKEY_get_default_digest_name @ 00a6e73c
00a6e73c	str x21,[sp, #-0x30]!
00a6e740	stp x20,x19,[sp, #0x10]
00a6e744	stp x29,x30,[sp, #0x20]
00a6e748	ldr x8,[x0, #0x8]
00a6e74c	mov x19,x2
00a6e750	mov x20,x1
00a6e754	add x29,sp,#0x20
00a6e758	cbz x8,0x00a6e7a8
00a6e75c	orr w1,wzr,#0x3
00a6e760	add x3,sp,#0xc
00a6e764	mov w2,wzr
00a6e768	str wzr,[sp, #0xc]
00a6e76c	bl 0x00a6e614
00a6e770	mov w21,w0
00a6e774	cmp w0,#0x1
00a6e778	b.lt 0x00a6e794
00a6e77c	ldr w0,[sp, #0xc]
00a6e780	bl 0x00c324f0
00a6e784	mov x1,x0
00a6e788	mov x0,x20
00a6e78c	mov x2,x19
00a6e790	bl 0x00c387f0
00a6e794	ldp x29,x30,[sp, #0x20]
00a6e798	ldp x20,x19,[sp, #0x10]
00a6e79c	mov w0,w21
00a6e7a0	ldr x21,[sp], #0x30
00a6e7a4	ret
00a6e7a8	ldp x8,x1,[x0, #0x60]
00a6e7ac	mov x2,x20
00a6e7b0	mov x3,x19
00a6e7b4	ldp x29,x30,[sp, #0x20]
00a6e7b8	ldp x20,x19,[sp, #0x10]
00a6e7bc	mov x0,x8
00a6e7c0	ldr x21,[sp], #0x30
00a6e7c4	b 0x00c3d350
