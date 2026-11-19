; mbedtls_aes_xts_setkey_dec @ 00b6e660
00b6e660	str x21,[sp, #-0x30]!
00b6e664	stp x20,x19,[sp, #0x10]
00b6e668	stp x29,x30,[sp, #0x20]
00b6e66c	add x29,sp,#0x20
00b6e670	mov x19,x1
00b6e674	cmp w2,#0x200
00b6e678	mov x20,x0
00b6e67c	b.eq 0x00b6e688
00b6e680	cmp w2,#0x100
00b6e684	b.ne 0x00b6e6c0
00b6e688	lsr w21,w2,#0x1
00b6e68c	lsr w8,w2,#0x4
00b6e690	add x1,x19,x8
00b6e694	add x0,x20,#0x120
00b6e698	mov w2,w21
00b6e69c	bl 0x00c41940
00b6e6a0	cbnz w0,0x00b6e6c4
00b6e6a4	mov x0,x20
00b6e6a8	mov x1,x19
00b6e6ac	ldp x29,x30,[sp, #0x20]
00b6e6b0	ldp x20,x19,[sp, #0x10]
00b6e6b4	mov w2,w21
00b6e6b8	ldr x21,[sp], #0x30
00b6e6bc	b 0x00c41930
00b6e6c0	orr w0,wzr,#0xffffffe0
00b6e6c4	ldp x29,x30,[sp, #0x20]
00b6e6c8	ldp x20,x19,[sp, #0x10]
00b6e6cc	ldr x21,[sp], #0x30
00b6e6d0	ret
