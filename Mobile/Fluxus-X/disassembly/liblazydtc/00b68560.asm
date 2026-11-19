; ossl_cipher_hw_generic_ctr @ 00b68560
00b68560	str x19,[sp, #-0x20]!
00b68564	stp x29,x30,[sp, #0x10]
00b68568	ldr w9,[x0, #0xa0]
00b6856c	add x29,sp,#0x10
00b68570	mov x8,x3
00b68574	mov x19,x0
00b68578	stur w9,[x29, #-0x4]
00b6857c	ldr x7,[x0, #0x38]
00b68580	ldr x3,[x0, #0xb0]
00b68584	add x4,x0,#0x20
00b68588	add x5,x0,#0x10
00b6858c	cbz x7,0x00b685a4
00b68590	sub x6,x29,#0x4
00b68594	mov x0,x2
00b68598	mov x2,x8
00b6859c	bl 0x00c3e320
00b685a0	b 0x00b685b8
00b685a4	ldr x7,[x19, #0x30]
00b685a8	sub x6,x29,#0x4
00b685ac	mov x0,x2
00b685b0	mov x2,x8
00b685b4	bl 0x00c3e310
00b685b8	ldur w8,[x29, #-0x4]
00b685bc	mov w0,#0x1
00b685c0	str w8,[x19, #0xa0]
00b685c4	ldp x29,x30,[sp, #0x10]
00b685c8	ldr x19,[sp], #0x20
00b685cc	ret
