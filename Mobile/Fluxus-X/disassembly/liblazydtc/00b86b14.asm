; psa_import_key_into_slot @ 00b86b14
00b86b14	stp x22,x21,[sp, #-0x30]!
00b86b18	stp x20,x19,[sp, #0x10]
00b86b1c	stp x29,x30,[sp, #0x20]
00b86b20	add x29,sp,#0x20
00b86b24	mov x19,x5
00b86b28	mov x21,x3
00b86b2c	mov x20,x2
00b86b30	mov x22,x1
00b86b34	cbz x2,0x00b86b88
00b86b38	ldrh w8,[x0]
00b86b3c	and w9,w8,#0x7000
00b86b40	cmp w9,#0x2, LSL #12
00b86b44	b.eq 0x00b86b50
00b86b48	cmp w9,#0x1, LSL #12
00b86b4c	b.ne 0x00b86b84
00b86b50	lsl x1,x20,#0x3
00b86b54	mov w0,w8
00b86b58	str x1,[x6]
00b86b5c	bl 0x00c42d80
00b86b60	mov w8,w0
00b86b64	cbnz w0,0x00b86b8c
00b86b68	mov x0,x21
00b86b6c	mov x1,x22
00b86b70	mov x2,x20
00b86b74	bl 0x00c2ffd0
00b86b78	mov w8,wzr
00b86b7c	str x20,[x19]
00b86b80	b 0x00b86b8c
00b86b84	tbnz w8,#0xe,0x00b86ba0
00b86b88	mov w8,#0xffffff7a
00b86b8c	ldp x29,x30,[sp, #0x20]
00b86b90	ldp x20,x19,[sp, #0x10]
00b86b94	mov w0,w8
00b86b98	ldp x22,x21,[sp], #0x30
00b86b9c	ret
00b86ba0	mov w9,#0xcf00
00b86ba4	and w9,w8,w9
00b86ba8	mov w10,#0x4100
00b86bac	cmp w9,w10
00b86bb0	b.eq 0x00b86c0c
00b86bb4	mov w10,#0x4200
00b86bb8	cmp w9,w10
00b86bbc	b.ne 0x00b86c2c
00b86bc0	lsl x8,x20,#0x3
00b86bc4	sub x8,x8,#0x800
00b86bc8	ror x9,x8,#0xa
00b86bcc	cmp x9,#0x6
00b86bd0	mov w8,#0xffffff7a
00b86bd4	b.hi 0x00b86b8c
00b86bd8	mov w10,#0x1
00b86bdc	lsl x9,x10,x9
00b86be0	mov w10,#0x57
00b86be4	tst x9,x10
00b86be8	b.eq 0x00b86b8c
00b86bec	mov x2,x20
00b86bf0	mov x5,x19
00b86bf4	ldp x29,x30,[sp, #0x20]
00b86bf8	ldp x20,x19,[sp, #0x10]
00b86bfc	mov x1,x22
00b86c00	mov x3,x21
00b86c04	ldp x22,x21,[sp], #0x30
00b86c08	b 0x00c42fc0
00b86c0c	mov x2,x20
00b86c10	mov x5,x19
00b86c14	ldp x29,x30,[sp, #0x20]
00b86c18	ldp x20,x19,[sp, #0x10]
00b86c1c	mov x1,x22
00b86c20	mov x3,x21
00b86c24	ldp x22,x21,[sp], #0x30
00b86c28	b 0x00c42f70
00b86c2c	and w8,w8,#0xffffcfff
00b86c30	mov w9,#0x4001
00b86c34	cmp w8,w9
00b86c38	b.ne 0x00b86b88
00b86c3c	mov x2,x20
00b86c40	mov x5,x19
00b86c44	ldp x29,x30,[sp, #0x20]
00b86c48	ldp x20,x19,[sp, #0x10]
00b86c4c	mov x1,x22
00b86c50	mov x3,x21
00b86c54	ldp x22,x21,[sp], #0x30
00b86c58	b 0x00c43140
