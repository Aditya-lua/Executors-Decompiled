; ossl_bn_priv_rand_range_fixed_top @ 00a1dd6c
00a1dd6c	str x25,[sp, #-0x50]!
00a1dd70	stp x24,x23,[sp, #0x10]
00a1dd74	stp x22,x21,[sp, #0x20]
00a1dd78	stp x20,x19,[sp, #0x30]
00a1dd7c	stp x29,x30,[sp, #0x40]
00a1dd80	add x29,sp,#0x40
00a1dd84	cbz x0,0x00a1ddd4
00a1dd88	ldr w8,[x1, #0x10]
00a1dd8c	mov x22,x1
00a1dd90	cbnz w8,0x00a1ddac
00a1dd94	mov x20,x0
00a1dd98	mov x0,x22
00a1dd9c	mov x19,x3
00a1dda0	mov w21,w2
00a1dda4	bl 0x00c369b0
00a1dda8	cbz w0,0x00a1de20
00a1ddac	bl 0x00c342a0
00a1ddb0	adrp x0,0x2c1000
00a1ddb4	adrp x2,0x2a5000
00a1ddb8	add x0,x0,#0xaac
00a1ddbc	add x2,x2,#0xd2a
00a1ddc0	orr w1,wzr,#0xff
00a1ddc4	bl 0x00c342b0
00a1ddc8	orr w0,wzr,#0x3
00a1ddcc	mov w1,#0x73
00a1ddd0	b 0x00a1ddfc
00a1ddd4	bl 0x00c342a0
00a1ddd8	adrp x0,0x2c1000
00a1dddc	adrp x2,0x2a5000
00a1dde0	add x0,x0,#0xaac
00a1dde4	add x2,x2,#0xd2a
00a1dde8	mov w1,#0xfa
00a1ddec	bl 0x00c342b0
00a1ddf0	mov w1,#0x102
00a1ddf4	orr w0,wzr,#0x3
00a1ddf8	movk w1,#0xc, LSL #16
00a1ddfc	mov x2,xzr
00a1de00	bl 0x00c342c0
00a1de04	mov w0,wzr
00a1de08	ldp x29,x30,[sp, #0x40]
00a1de0c	ldp x20,x19,[sp, #0x30]
00a1de10	ldp x22,x21,[sp, #0x20]
00a1de14	ldp x24,x23,[sp, #0x10]
00a1de18	ldr x25,[sp], #0x50
00a1de1c	ret
00a1de20	mov x0,x22
00a1de24	bl 0x00c322f0
00a1de28	cmp w0,#0x1
00a1de2c	b.ne 0x00a1de40
00a1de30	mov x0,x20
00a1de34	bl 0x00c38e00
00a1de38	mov w0,#0x1
00a1de3c	b 0x00a1de08
00a1de40	mov w23,w0
00a1de44	mov w1,#0x4
00a1de48	mov x0,x20
00a1de4c	bl 0x00c38dc0
00a1de50	add w24,w23,#0x1
00a1de54	mov w25,#0xffffff9c
00a1de58	mov w0,#0x2
00a1de5c	mov x1,x20
00a1de60	mov w2,w24
00a1de64	mov w3,wzr
00a1de68	mov w4,wzr
00a1de6c	mov w5,w21
00a1de70	mov x6,x19
00a1de74	bl 0x00a1d778
00a1de78	cbz w0,0x00a1de08
00a1de7c	adds w25,w25,#0x1
00a1de80	b.eq 0x00a1deac
00a1de84	mov x0,x20
00a1de88	mov w1,w23
00a1de8c	bl 0x00c38ea0
00a1de90	mov x0,x20
00a1de94	mov x1,x22
00a1de98	bl 0x00c369c0
00a1de9c	mov w8,w0
00a1dea0	mov w0,#0x1
00a1dea4	tbz w8,#0x1f,0x00a1de58
00a1dea8	b 0x00a1de08
00a1deac	bl 0x00c342a0
00a1deb0	adrp x0,0x2c1000
00a1deb4	adrp x2,0x2a5000
00a1deb8	add x0,x0,#0xaac
00a1debc	add x2,x2,#0xd2a
00a1dec0	mov w1,#0x111
00a1dec4	bl 0x00c342b0
00a1dec8	orr w0,wzr,#0x3
00a1decc	mov w1,#0x71
00a1ded0	b 0x00a1ddfc
