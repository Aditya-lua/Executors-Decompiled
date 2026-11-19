; ossl_dh_generate_ffc_parameters @ 00a78b6c
00a78b6c	str x19,[sp, #-0x20]!
00a78b70	stp x29,x30,[sp, #0x10]
00a78b74	mov x19,x0
00a78b78	ldr x0,[x0, #0xb0]
00a78b7c	add x29,sp,#0x10
00a78b80	mov w8,w3
00a78b84	mov w9,w1
00a78b88	mov x6,x4
00a78b8c	add x1,x19,#0x8
00a78b90	sxtw x3,w2
00a78b94	cmp w9,#0x1
00a78b98	sxtw x4,w8
00a78b9c	mov w2,#0x1
00a78ba0	sub x5,x29,#0x4
00a78ba4	b.ne 0x00a78bb8
00a78ba8	bl 0x00c3dc70
00a78bac	cmp w0,#0x1
00a78bb0	b.ge 0x00a78bc4
00a78bb4	b 0x00a78bd0
00a78bb8	bl 0x00c3dc80
00a78bbc	cmp w0,#0x1
00a78bc0	b.lt 0x00a78bd0
00a78bc4	ldr x8,[x19, #0xc8]
00a78bc8	add x8,x8,#0x1
00a78bcc	str x8,[x19, #0xc8]
00a78bd0	ldp x29,x30,[sp, #0x10]
00a78bd4	ldr x19,[sp], #0x20
00a78bd8	ret
