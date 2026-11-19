; ossl_param_build_set_bn_pad @ 00a9dd74
00a9dd74	stp x20,x19,[sp, #-0x20]!
00a9dd78	mov x20,x4
00a9dd7c	mov x19,x3
00a9dd80	stp x29,x30,[sp, #0x10]
00a9dd84	add x29,sp,#0x10
00a9dd88	cbz x0,0x00a9dda4
00a9dd8c	ldp x29,x30,[sp, #0x10]
00a9dd90	mov x1,x2
00a9dd94	mov x2,x19
00a9dd98	mov x3,x20
00a9dd9c	ldp x20,x19,[sp], #0x20
00a9dda0	b 0x00c3a8d0
00a9dda4	mov x0,x1
00a9dda8	mov x1,x2
00a9ddac	bl 0x00c3e8c0
00a9ddb0	cbz x0,0x00a9ddd8
00a9ddb4	ldr x8,[x0, #0x18]
00a9ddb8	cmp x8,x20
00a9ddbc	mov w8,wzr
00a9ddc0	b.cc 0x00a9dddc
00a9ddc4	str x20,[x0, #0x18]
00a9ddc8	ldp x29,x30,[sp, #0x10]
00a9ddcc	mov x1,x19
00a9ddd0	ldp x20,x19,[sp], #0x20
00a9ddd4	b 0x00c3da80
00a9ddd8	mov w8,#0x1
00a9dddc	ldp x29,x30,[sp, #0x10]
00a9dde0	mov w0,w8
00a9dde4	ldp x20,x19,[sp], #0x20
00a9dde8	ret
