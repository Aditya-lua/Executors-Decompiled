; EVP_Digest @ 00a58968
00a58968	str x25,[sp, #-0x50]!
00a5896c	stp x22,x21,[sp, #0x20]
00a58970	mov x22,x1
00a58974	adrp x1,0x2b7000
00a58978	stp x24,x23,[sp, #0x10]
00a5897c	mov x21,x2
00a58980	mov x23,x0
00a58984	add x1,x1,#0xc61
00a58988	mov w0,#0x48
00a5898c	mov w2,#0x84
00a58990	stp x20,x19,[sp, #0x30]
00a58994	stp x29,x30,[sp, #0x40]
00a58998	add x29,sp,#0x40
00a5899c	mov x24,x5
00a589a0	mov x25,x4
00a589a4	mov x20,x3
00a589a8	bl 0x00c34250
00a589ac	cbz x0,0x00a58a04
00a589b0	mov w1,#0x1
00a589b4	mov x19,x0
00a589b8	bl 0x00c3c1b0
00a589bc	mov x0,x19
00a589c0	mov x1,x25
00a589c4	mov x2,xzr
00a589c8	mov x3,x24
00a589cc	bl 0x00a577c0
00a589d0	cbz w0,0x00a58a0c
00a589d4	mov x0,x19
00a589d8	mov x1,x23
00a589dc	mov x2,x22
00a589e0	bl 0x00a57ef4
00a589e4	cbz w0,0x00a58a0c
00a589e8	mov x0,x19
00a589ec	mov x1,x21
00a589f0	mov x2,x20
00a589f4	bl 0x00a58064
00a589f8	cmp w0,#0x0
00a589fc	cset w20,ne
00a58a00	b 0x00a58a10
00a58a04	mov w20,wzr
00a58a08	b 0x00a58a5c
00a58a0c	mov w20,wzr
00a58a10	mov w1,#0x400
00a58a14	mov x0,x19
00a58a18	bl 0x00c3c1d0
00a58a1c	cbnz w0,0x00a58a2c
00a58a20	ldr x0,[x19, #0x28]
00a58a24	bl 0x00c34620
00a58a28	str xzr,[x19, #0x28]
00a58a2c	mov x0,x19
00a58a30	mov w1,wzr
00a58a34	mov w2,wzr
00a58a38	bl 0x00a573e4
00a58a3c	mov w1,#0x48
00a58a40	mov x0,x19
00a58a44	bl 0x00c34750
00a58a48	adrp x1,0x2b7000
00a58a4c	add x1,x1,#0xc61
00a58a50	mov w2,#0x8d
00a58a54	mov x0,x19
00a58a58	bl 0x00c32310
00a58a5c	mov w0,w20
00a58a60	ldp x29,x30,[sp, #0x40]
00a58a64	ldp x20,x19,[sp, #0x30]
00a58a68	ldp x22,x21,[sp, #0x20]
00a58a6c	ldp x24,x23,[sp, #0x10]
00a58a70	ldr x25,[sp], #0x50
00a58a74	ret
