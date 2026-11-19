; mbedtls_psa_aead_update_ad @ 00b983d0
00b983d0	stp x29,x30,[sp, #-0x10]!
00b983d4	mov x29,sp
00b983d8	ldr w8,[x0]
00b983dc	mov w9,#0x500
00b983e0	movk w9,#0x510, LSL #16
00b983e4	cmp w8,w9
00b983e8	b.eq 0x00b9841c
00b983ec	mov w9,#0x100
00b983f0	movk w9,#0x550, LSL #16
00b983f4	cmp w8,w9
00b983f8	b.eq 0x00b9842c
00b983fc	mov w9,#0x200
00b98400	movk w9,#0x550, LSL #16
00b98404	cmp w8,w9
00b98408	b.ne 0x00b9843c
00b9840c	add x0,x0,#0x8
00b98410	bl 0x00c421f0
00b98414	ldp x29,x30,[sp], #0x10
00b98418	b 0x00c42bf0
00b9841c	add x0,x0,#0x8
00b98420	bl 0x00c42140
00b98424	ldp x29,x30,[sp], #0x10
00b98428	b 0x00c42bf0
00b9842c	add x0,x0,#0x8
00b98430	bl 0x00c42060
00b98434	ldp x29,x30,[sp], #0x10
00b98438	b 0x00c42bf0
00b9843c	mov w0,#0xffffff7a
00b98440	ldp x29,x30,[sp], #0x10
00b98444	ret
