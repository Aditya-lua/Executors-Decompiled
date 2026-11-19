; ossl_sm2_plaintext_size @ 00b21f94
00b21f94	str x19,[sp, #-0x20]!
00b21f98	adrp x3,0xc8c000
00b21f9c	mov x19,x2
00b21fa0	mov x2,x1
00b21fa4	str x0,[sp, #0x8]
00b21fa8	add x3,x3,#0xc88
00b21fac	add x1,sp,#0x8
00b21fb0	mov x0,xzr
00b21fb4	stp x29,x30,[sp, #0x10]
00b21fb8	add x29,sp,#0x10
00b21fbc	bl 0x00c36150
00b21fc0	cbz x0,0x00b21fe4
00b21fc4	ldr x8,[x0, #0x18]
00b21fc8	adrp x1,0xc8c000
00b21fcc	add x1,x1,#0xc88
00b21fd0	ldrsw x8,[x8]
00b21fd4	str x8,[x19]
00b21fd8	bl 0x00c36160
00b21fdc	mov w0,#0x1
00b21fe0	b 0x00b22014
00b21fe4	bl 0x00c342a0
00b21fe8	adrp x0,0x2c4000
00b21fec	adrp x2,0x2c2000
00b21ff0	add x0,x0,#0x55e
00b21ff4	add x2,x2,#0x986
00b21ff8	mov w1,#0x5a
00b21ffc	bl 0x00c342b0
00b22000	mov w0,#0x35
00b22004	mov w1,#0x68
00b22008	mov x2,xzr
00b2200c	bl 0x00c342c0
00b22010	mov w0,wzr
00b22014	ldp x29,x30,[sp, #0x10]
00b22018	ldr x19,[sp], #0x20
00b2201c	ret
