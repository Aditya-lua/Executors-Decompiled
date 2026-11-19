; psa_key_derivation_input_bytes @ 00b8e174
00b8e174	str x23,[sp, #-0x40]!
00b8e178	stp x22,x21,[sp, #0x10]
00b8e17c	stp x20,x19,[sp, #0x20]
00b8e180	stp x29,x30,[sp, #0x30]
00b8e184	add x29,sp,#0x30
00b8e188	mov x20,x3
00b8e18c	mov x23,x2
00b8e190	mov w21,w1
00b8e194	mov x22,x0
00b8e198	cbz x3,0x00b8e1c4
00b8e19c	mov w1,#0x1
00b8e1a0	mov x0,x20
00b8e1a4	bl 0x00c30a30
00b8e1a8	mov x19,x0
00b8e1ac	cbz x0,0x00b8e1e8
00b8e1b0	mov x0,x19
00b8e1b4	mov x1,x23
00b8e1b8	mov x2,x20
00b8e1bc	bl 0x00c2ffd0
00b8e1c0	b 0x00b8e1c8
00b8e1c4	mov x19,xzr
00b8e1c8	mov x0,x22
00b8e1cc	mov w1,w21
00b8e1d0	mov w2,wzr
00b8e1d4	mov x3,x19
00b8e1d8	mov x4,x20
00b8e1dc	bl 0x00b8e20c
00b8e1e0	mov w20,w0
00b8e1e4	b 0x00b8e1ec
00b8e1e8	mov w20,#0xffffff73
00b8e1ec	mov x0,x19
00b8e1f0	bl 0x00c30960
00b8e1f4	mov w0,w20
00b8e1f8	ldp x29,x30,[sp, #0x30]
00b8e1fc	ldp x20,x19,[sp, #0x20]
00b8e200	ldp x22,x21,[sp, #0x10]
00b8e204	ldr x23,[sp], #0x40
00b8e208	ret
