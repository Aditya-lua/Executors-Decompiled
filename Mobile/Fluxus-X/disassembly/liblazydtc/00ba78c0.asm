; mbedtls_rsa_rsaes_pkcs1_v15_encrypt @ 00ba78c0
00ba78c0	str x27,[sp, #-0x60]!
00ba78c4	stp x26,x25,[sp, #0x10]
00ba78c8	stp x24,x23,[sp, #0x20]
00ba78cc	stp x22,x21,[sp, #0x30]
00ba78d0	stp x20,x19,[sp, #0x40]
00ba78d4	stp x29,x30,[sp, #0x50]
00ba78d8	add x29,sp,#0x50
00ba78dc	mov x19,x5
00ba78e0	mov x22,x4
00ba78e4	mov x21,x3
00ba78e8	mov x23,x2
00ba78ec	mov x24,x1
00ba78f0	mov x20,x0
00ba78f4	cmn x3,#0xc
00ba78f8	mov w0,#0xffffbf80
00ba78fc	b.hi 0x00ba79c0
00ba7900	ldr x8,[x20, #0x8]
00ba7904	add x9,x21,#0xb
00ba7908	cmp x8,x9
00ba790c	b.cc 0x00ba79c0
00ba7910	strb wzr,[x19]
00ba7914	cbz x24,0x00ba79b0
00ba7918	orr x9,xzr,#-0x3
00ba791c	sub x9,x9,x21
00ba7920	add x25,x19,#0x2
00ba7924	adds x26,x9,x8
00ba7928	mov w8,#0x2
00ba792c	strb w8,[x19, #0x1]
00ba7930	b.eq 0x00ba7970
00ba7934	sub x26,x26,#0x1
00ba7938	mov w27,#0x64
00ba793c	mov w2,#0x1
00ba7940	mov x0,x23
00ba7944	mov x1,x25
00ba7948	blr x24
00ba794c	ldrb w8,[x25]
00ba7950	cbnz w8,0x00ba7960
00ba7954	subs w27,w27,#0x1
00ba7958	b.eq 0x00ba7960
00ba795c	cbz w0,0x00ba793c
00ba7960	cbnz w0,0x00ba79b8
00ba7964	cbz w27,0x00ba79b8
00ba7968	add x25,x25,#0x1
00ba796c	cbnz x26,0x00ba7934
00ba7970	strb wzr,[x25]
00ba7974	cbz x21,0x00ba7988
00ba7978	add x0,x25,#0x1
00ba797c	mov x1,x22
00ba7980	mov x2,x21
00ba7984	bl 0x00c2ffd0
00ba7988	mov x0,x20
00ba798c	mov x1,x19
00ba7990	mov x2,x19
00ba7994	ldp x29,x30,[sp, #0x50]
00ba7998	ldp x20,x19,[sp, #0x40]
00ba799c	ldp x22,x21,[sp, #0x30]
00ba79a0	ldp x24,x23,[sp, #0x20]
00ba79a4	ldp x26,x25,[sp, #0x10]
00ba79a8	ldr x27,[sp], #0x60
00ba79ac	b 0x00c43470
00ba79b0	mov w0,#0xffffbf80
00ba79b4	b 0x00ba79c0
00ba79b8	mov w8,#0xffffbb80
00ba79bc	add w0,w0,w8
00ba79c0	ldp x29,x30,[sp, #0x50]
00ba79c4	ldp x20,x19,[sp, #0x40]
00ba79c8	ldp x22,x21,[sp, #0x30]
00ba79cc	ldp x24,x23,[sp, #0x20]
00ba79d0	ldp x26,x25,[sp, #0x10]
00ba79d4	ldr x27,[sp], #0x60
00ba79d8	ret
