; ossl_dsa_generate_ffc_parameters @ 00b4e188
00b4e188	str x19,[sp, #-0x20]!
00b4e18c	stp x29,x30,[sp, #0x10]
00b4e190	mov x19,x0
00b4e194	ldr x0,[x0, #0xb8]
00b4e198	add x29,sp,#0x10
00b4e19c	mov w8,w3
00b4e1a0	mov w9,w1
00b4e1a4	mov x6,x4
00b4e1a8	add x1,x19,#0x8
00b4e1ac	sxtw x3,w2
00b4e1b0	cmp w9,#0x1
00b4e1b4	sxtw x4,w8
00b4e1b8	sub x5,x29,#0x4
00b4e1bc	mov w2,wzr
00b4e1c0	b.ne 0x00b4e1d4
00b4e1c4	bl 0x00c3dc70
00b4e1c8	cmp w0,#0x1
00b4e1cc	b.ge 0x00b4e1e0
00b4e1d0	b 0x00b4e1ec
00b4e1d4	bl 0x00c3dc80
00b4e1d8	cmp w0,#0x1
00b4e1dc	b.lt 0x00b4e1ec
00b4e1e0	ldr x8,[x19, #0xc0]
00b4e1e4	add x8,x8,#0x1
00b4e1e8	str x8,[x19, #0xc0]
00b4e1ec	ldp x29,x30,[sp, #0x10]
00b4e1f0	ldr x19,[sp], #0x20
00b4e1f4	ret
