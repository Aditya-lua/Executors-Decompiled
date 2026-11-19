; psa_key_agreement_raw_builtin @ 00b8e9ac
00b8e9ac	ldr x9,[sp]
00b8e9b0	mov w11,#0x9010000
00b8e9b4	mov x8,x2
00b8e9b8	mov x10,x1
00b8e9bc	cmp w3,w11
00b8e9c0	b.eq 0x00b8e9e4
00b8e9c4	mov w11,#0x9020000
00b8e9c8	cmp w3,w11
00b8e9cc	b.ne 0x00b8ea04
00b8e9d0	mov w3,#0x9020000
00b8e9d4	mov x1,x10
00b8e9d8	mov x2,x8
00b8e9dc	str x9,[sp]
00b8e9e0	b 0x00c42f90
00b8e9e4	mov x1,x4
00b8e9e8	mov x2,x5
00b8e9ec	mov x3,x10
00b8e9f0	mov x4,x8
00b8e9f4	mov x5,x6
00b8e9f8	mov x6,x7
00b8e9fc	mov x7,x9
00b8ea00	b 0x00c42fd0
00b8ea04	mov w0,#0xffffff7a
00b8ea08	ret
