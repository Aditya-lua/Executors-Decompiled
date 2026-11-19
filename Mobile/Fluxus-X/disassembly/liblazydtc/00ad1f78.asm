; RSA_get0_multi_prime_crt_params @ 00ad1f78
00ad1f78	str x23,[sp, #-0x40]!
00ad1f7c	stp x22,x21,[sp, #0x10]
00ad1f80	stp x20,x19,[sp, #0x20]
00ad1f84	stp x29,x30,[sp, #0x30]
00ad1f88	mov x20,x0
00ad1f8c	ldr x0,[x0, #0x88]
00ad1f90	add x29,sp,#0x30
00ad1f94	mov x19,x2
00ad1f98	mov x21,x1
00ad1f9c	bl 0x00c325e0
00ad1fa0	cmp w0,#0x1
00ad1fa4	b.lt 0x00ad1ff0
00ad1fa8	orr x8,x21,x19
00ad1fac	cbz x8,0x00ad1fe8
00ad1fb0	mov x22,xzr
00ad1fb4	mov w23,w0
00ad1fb8	ldr x0,[x20, #0x88]
00ad1fbc	mov w1,w22
00ad1fc0	bl 0x00c32610
00ad1fc4	cbz x21,0x00ad1fd0
00ad1fc8	ldr x8,[x0, #0x8]
00ad1fcc	str x8,[x21, x22, LSL #0x3]
00ad1fd0	cbz x19,0x00ad1fdc
00ad1fd4	ldr x8,[x0, #0x10]
00ad1fd8	str x8,[x19, x22, LSL #0x3]
00ad1fdc	add x22,x22,#0x1
00ad1fe0	cmp x23,x22
00ad1fe4	b.ne 0x00ad1fb8
00ad1fe8	mov w0,#0x1
00ad1fec	b 0x00ad1ff4
00ad1ff0	mov w0,wzr
00ad1ff4	ldp x29,x30,[sp, #0x30]
00ad1ff8	ldp x20,x19,[sp, #0x20]
00ad1ffc	ldp x22,x21,[sp, #0x10]
00ad2000	ldr x23,[sp], #0x40
00ad2004	ret
