; RSA_get0_multi_prime_factors @ 00ad1ee4
00ad1ee4	stp x22,x21,[sp, #-0x30]!
00ad1ee8	stp x20,x19,[sp, #0x10]
00ad1eec	stp x29,x30,[sp, #0x20]
00ad1ef0	mov x19,x0
00ad1ef4	ldr x0,[x0, #0x88]
00ad1ef8	add x29,sp,#0x20
00ad1efc	mov x20,x1
00ad1f00	bl 0x00c325e0
00ad1f04	cmp w0,#0x1
00ad1f08	b.lt 0x00ad1f3c
00ad1f0c	mov x21,xzr
00ad1f10	mov w22,w0
00ad1f14	ldr x0,[x19, #0x88]
00ad1f18	mov w1,w21
00ad1f1c	bl 0x00c32610
00ad1f20	ldr x8,[x0]
00ad1f24	str x8,[x20, x21, LSL #0x3]
00ad1f28	add x21,x21,#0x1
00ad1f2c	cmp x21,x22
00ad1f30	b.cc 0x00ad1f14
00ad1f34	mov w0,#0x1
00ad1f38	b 0x00ad1f40
00ad1f3c	mov w0,wzr
00ad1f40	ldp x29,x30,[sp, #0x20]
00ad1f44	ldp x20,x19,[sp, #0x10]
00ad1f48	ldp x22,x21,[sp], #0x30
00ad1f4c	ret
