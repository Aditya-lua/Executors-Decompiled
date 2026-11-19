; psa_crypto_local_output_alloc @ 00b8727c
00b8727c	str x21,[sp, #-0x30]!
00b87280	stp x20,x19,[sp, #0x10]
00b87284	stp x29,x30,[sp, #0x20]
00b87288	add x29,sp,#0x20
00b8728c	mov x19,x2
00b87290	mov x21,x1
00b87294	mov x20,x0
00b87298	stp xzr,xzr,[x2]
00b8729c	str xzr,[x2, #0x10]
00b872a0	cbz x1,0x00b872c8
00b872a4	mov w1,#0x1
00b872a8	mov x0,x21
00b872ac	bl 0x00c30a30
00b872b0	str x0,[x19, #0x8]
00b872b4	cbz x0,0x00b872d0
00b872b8	mov w0,wzr
00b872bc	str x21,[x19, #0x10]
00b872c0	str x20,[x19]
00b872c4	b 0x00b872d4
00b872c8	mov w0,wzr
00b872cc	b 0x00b872d4
00b872d0	mov w0,#0xffffff73
00b872d4	ldp x29,x30,[sp, #0x20]
00b872d8	ldp x20,x19,[sp, #0x10]
00b872dc	ldr x21,[sp], #0x30
00b872e0	ret
