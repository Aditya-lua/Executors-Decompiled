; OPENSSL_sk_dup @ 00ae86d0
00ae86d0	stp x20,x19,[sp, #-0x20]!
00ae86d4	adrp x1,0x2c6000
00ae86d8	mov x20,x0
00ae86dc	add x1,x1,#0x275
00ae86e0	mov w0,#0x20
00ae86e4	orr w2,wzr,#0x30
00ae86e8	stp x29,x30,[sp, #0x10]
00ae86ec	add x29,sp,#0x10
00ae86f0	bl 0x00c32320
00ae86f4	mov x19,x0
00ae86f8	cbz x0,0x00ae874c
00ae86fc	cbz x20,0x00ae8780
00ae8700	ldr q0,[x20, #0x10]
00ae8704	str q0,[x19, #0x10]
00ae8708	ldr q0,[x20]
00ae870c	str q0,[x19]
00ae8710	ldr w8,[x20]
00ae8714	cbz w8,0x00ae878c
00ae8718	ldrsw x8,[x20, #0x14]
00ae871c	adrp x1,0x2c6000
00ae8720	add x1,x1,#0x275
00ae8724	mov w2,#0x44
00ae8728	lsl x0,x8,#0x3
00ae872c	bl 0x00c32320
00ae8730	str x0,[x19, #0x8]
00ae8734	cbz x0,0x00ae87a4
00ae8738	ldrsw x8,[x20]
00ae873c	ldr x1,[x20, #0x8]
00ae8740	lsl x2,x8,#0x3
00ae8744	bl 0x00c2ffd0
00ae8748	b 0x00ae8794
00ae874c	bl 0x00c342a0
00ae8750	adrp x0,0x2c6000
00ae8754	adrp x2,0x2ae000
00ae8758	add x0,x0,#0x275
00ae875c	add x2,x2,#0x63a
00ae8760	mov w1,#0x4b
00ae8764	bl 0x00c342b0
00ae8768	mov w1,#0x100
00ae876c	orr w0,wzr,#0xf
00ae8770	movk w1,#0xc, LSL #16
00ae8774	mov x2,xzr
00ae8778	bl 0x00c342c0
00ae877c	b 0x00ae8794
00ae8780	str wzr,[x19]
00ae8784	str wzr,[x19, #0x10]
00ae8788	str xzr,[x19, #0x18]
00ae878c	str xzr,[x19, #0x8]
00ae8790	str wzr,[x19, #0x14]
00ae8794	ldp x29,x30,[sp, #0x10]
00ae8798	mov x0,x19
00ae879c	ldp x20,x19,[sp], #0x20
00ae87a0	ret
00ae87a4	bl 0x00c342a0
00ae87a8	adrp x0,0x2c6000
00ae87ac	adrp x2,0x2ae000
00ae87b0	add x0,x0,#0x275
00ae87b4	add x2,x2,#0x63a
00ae87b8	mov w1,#0x4b
00ae87bc	bl 0x00c342b0
00ae87c0	mov w1,#0x100
00ae87c4	orr w0,wzr,#0xf
00ae87c8	movk w1,#0xc, LSL #16
00ae87cc	mov x2,xzr
00ae87d0	bl 0x00c342c0
00ae87d4	cbz x19,0x00ae8794
00ae87d8	ldr x0,[x19, #0x8]
00ae87dc	adrp x20,0x2c6000
00ae87e0	add x20,x20,#0x275
00ae87e4	mov w2,#0x1b2
00ae87e8	mov x1,x20
00ae87ec	bl 0x00c32310
00ae87f0	mov w2,#0x1b3
00ae87f4	mov x0,x19
00ae87f8	mov x1,x20
00ae87fc	bl 0x00c32310
00ae8800	mov x19,xzr
00ae8804	b 0x00ae8794
