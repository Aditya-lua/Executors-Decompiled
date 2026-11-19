; EVP_PKEY_CTX_set0_ecdh_kdf_ukm @ 00a7ae74
00a7ae74	sub sp,sp,#0xa0
00a7ae78	stp x20,x19,[sp, #0x80]
00a7ae7c	stp x29,x30,[sp, #0x90]
00a7ae80	add x29,sp,#0x90
00a7ae84	cbz x0,0x00a7af28
00a7ae88	ldr w8,[x0]
00a7ae8c	mov x20,x0
00a7ae90	cmp w8,#0x800
00a7ae94	b.ne 0x00a7af28
00a7ae98	ldr x8,[x20, #0x20]
00a7ae9c	mov x19,x1
00a7aea0	cbz x8,0x00a7af68
00a7aea4	adrp x0,0x29e000
00a7aea8	sxtw x2,w2
00a7aeac	add x0,x0,#0x10e
00a7aeb0	add x8,sp,#0x8
00a7aeb4	mov x1,x19
00a7aeb8	bl 0x00c34c50
00a7aebc	ldr x8,[sp, #0x28]
00a7aec0	ldur q0,[sp, #0x18]
00a7aec4	ldur q1,[sp, #0x8]
00a7aec8	str x8,[sp, #0x50]
00a7aecc	add x8,sp,#0x8
00a7aed0	stp q1,q0,[sp, #0x30]
00a7aed4	bl 0x00c34c40
00a7aed8	ldr x8,[sp, #0x28]
00a7aedc	ldur q0,[sp, #0x18]
00a7aee0	ldur q1,[sp, #0x8]
00a7aee4	add x1,sp,#0x30
00a7aee8	mov x0,x20
00a7aeec	str x8,[sp, #0x78]
00a7aef0	stur q0,[sp, #0x68]
00a7aef4	stur q1,[sp, #0x58]
00a7aef8	bl 0x00c3c120
00a7aefc	cmp w0,#0x1
00a7af00	b.eq 0x00a7af84
00a7af04	cmn w0,#0x2
00a7af08	b.ne 0x00a7af58
00a7af0c	bl 0x00c342a0
00a7af10	adrp x0,0x2d9000
00a7af14	adrp x2,0x2b9000
00a7af18	add x0,x0,#0xd63
00a7af1c	add x2,x2,#0xf5c
00a7af20	mov w1,#0xe8
00a7af24	b 0x00a7af40
00a7af28	bl 0x00c342a0
00a7af2c	adrp x0,0x2d9000
00a7af30	adrp x2,0x2bd000
00a7af34	add x0,x0,#0xd63
00a7af38	add x2,x2,#0xbcb
00a7af3c	mov w1,#0x1b
00a7af40	bl 0x00c342b0
00a7af44	orr w0,wzr,#0x6
00a7af48	mov w1,#0x93
00a7af4c	mov x2,xzr
00a7af50	bl 0x00c342c0
00a7af54	orr w0,wzr,#0xfffffffe
00a7af58	ldp x29,x30,[sp, #0x90]
00a7af5c	ldp x20,x19,[sp, #0x80]
00a7af60	add sp,sp,#0xa0
00a7af64	ret
00a7af68	ldr x8,[x20, #0x78]
00a7af6c	cbz x8,0x00a7aea4
00a7af70	ldr w8,[x8]
00a7af74	cmp w8,#0x198
00a7af78	b.eq 0x00a7aea4
00a7af7c	mov w0,#0xffffffff
00a7af80	b 0x00a7af58
00a7af84	adrp x1,0x2d9000
00a7af88	add x1,x1,#0xd63
00a7af8c	mov w2,#0xeb
00a7af90	mov x0,x19
00a7af94	bl 0x00c32310
00a7af98	mov w0,#0x1
00a7af9c	b 0x00a7af58
