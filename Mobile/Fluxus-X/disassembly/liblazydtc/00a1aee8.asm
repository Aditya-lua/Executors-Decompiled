; BN_is_prime_fasttest_ex @ 00a1aee8
00a1aee8	str x23,[sp, #-0x40]!
00a1aeec	stp x22,x21,[sp, #0x10]
00a1aef0	stp x20,x19,[sp, #0x20]
00a1aef4	stp x29,x30,[sp, #0x30]
00a1aef8	add x29,sp,#0x30
00a1aefc	mov x19,x4
00a1af00	mov w20,w3
00a1af04	mov x21,x2
00a1af08	mov w22,w1
00a1af0c	mov x23,x0
00a1af10	bl 0x00c322f0
00a1af14	cmp w0,#0x800
00a1af18	mov w8,#0x40
00a1af1c	mov w9,#0x80
00a1af20	csel w8,w9,w8,gt
00a1af24	cmp w8,w22
00a1af28	csel w1,w8,w22,gt
00a1af2c	mov x2,x21
00a1af30	mov w3,w20
00a1af34	mov x4,x19
00a1af38	ldp x29,x30,[sp, #0x30]
00a1af3c	ldp x20,x19,[sp, #0x20]
00a1af40	ldp x22,x21,[sp, #0x10]
00a1af44	mov x0,x23
00a1af48	ldr x23,[sp], #0x40
00a1af4c	b 0x00a1abb8
