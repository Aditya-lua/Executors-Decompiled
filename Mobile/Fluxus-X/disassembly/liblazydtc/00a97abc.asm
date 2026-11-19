; FUN_00a97abc @ 00a97abc
00a97abc	sub sp,sp,#0x50
00a97ac0	stp x24,x23,[sp, #0x10]
00a97ac4	stp x22,x21,[sp, #0x20]
00a97ac8	stp x20,x19,[sp, #0x30]
00a97acc	stp x29,x30,[sp, #0x40]
00a97ad0	add x29,sp,#0x40
00a97ad4	mov x21,x3
00a97ad8	mov x23,x2
00a97adc	mov x20,x1
00a97ae0	mov x24,x0
00a97ae4	bl 0x00c3cea0
00a97ae8	ldr x22,[x0, #0x218]
00a97aec	mov x19,x0
00a97af0	add x8,x22,#0x10
00a97af4	cmp x8,x21
00a97af8	b.eq 0x00a97b08
00a97afc	cmn x22,#0x1
00a97b00	mov w0,wzr
00a97b04	b.ne 0x00a97c40
00a97b08	mov x0,x24
00a97b0c	bl 0x00c3cec0
00a97b10	cbz w0,0x00a97b48
00a97b14	cmn x22,#0x1
00a97b18	csel x24,x21,x22,eq
00a97b1c	add x22,x19,#0x1bc
00a97b20	mov x0,x22
00a97b24	mov x1,x23
00a97b28	mov x2,x24
00a97b2c	bl 0x00c32020
00a97b30	cmp x24,x21
00a97b34	b.ne 0x00a97bcc
00a97b38	mov x0,x19
00a97b3c	mov x1,x21
00a97b40	mov x2,x23
00a97b44	b 0x00a97c2c
00a97b48	mov x0,x19
00a97b4c	mov x1,x21
00a97b50	mov x2,x23
00a97b54	mov x3,x20
00a97b58	bl 0x00c3e1d0
00a97b5c	cmn x22,#0x1
00a97b60	add x23,x19,#0x1bc
00a97b64	b.eq 0x00a97c58
00a97b68	mov x0,x23
00a97b6c	mov x1,x20
00a97b70	mov x2,x22
00a97b74	bl 0x00c32020
00a97b78	mov x0,sp
00a97b7c	mov x1,x23
00a97b80	bl 0x00c32000
00a97b84	add x1,x19,#0x160
00a97b88	mov w2,#0x5c
00a97b8c	mov x0,x23
00a97b90	bl 0x00c2ffd0
00a97b94	mov x1,sp
00a97b98	mov w2,#0x10
00a97b9c	mov x0,x23
00a97ba0	bl 0x00c32020
00a97ba4	mov x0,sp
00a97ba8	mov x1,x23
00a97bac	bl 0x00c32000
00a97bb0	add x0,x20,x22
00a97bb4	mov x1,sp
00a97bb8	mov w2,#0x10
00a97bbc	bl 0x00c362f0
00a97bc0	cbz w0,0x00a97c34
00a97bc4	mov w0,wzr
00a97bc8	b 0x00a97c40
00a97bcc	cmp x23,x20
00a97bd0	b.eq 0x00a97be4
00a97bd4	mov x0,x20
00a97bd8	mov x1,x23
00a97bdc	mov x2,x24
00a97be0	bl 0x00c2ffd0
00a97be4	add x23,x20,x24
00a97be8	mov x0,x23
00a97bec	mov x1,x22
00a97bf0	bl 0x00c32000
00a97bf4	add x1,x19,#0x160
00a97bf8	mov w2,#0x5c
00a97bfc	mov x0,x22
00a97c00	bl 0x00c2ffd0
00a97c04	mov w2,#0x10
00a97c08	mov x0,x22
00a97c0c	mov x1,x23
00a97c10	bl 0x00c32020
00a97c14	mov x0,x23
00a97c18	mov x1,x22
00a97c1c	bl 0x00c32000
00a97c20	mov x0,x19
00a97c24	mov x1,x21
00a97c28	mov x2,x20
00a97c2c	mov x3,x20
00a97c30	bl 0x00c3e1d0
00a97c34	mov x8,#-0x1
00a97c38	mov w0,#0x1
00a97c3c	str x8,[x19, #0x218]
00a97c40	ldp x29,x30,[sp, #0x40]
00a97c44	ldp x20,x19,[sp, #0x30]
00a97c48	ldp x22,x21,[sp, #0x20]
00a97c4c	ldp x24,x23,[sp, #0x10]
00a97c50	add sp,sp,#0x50
00a97c54	ret
00a97c58	mov x0,x23
00a97c5c	mov x1,x20
00a97c60	mov x2,x21
00a97c64	bl 0x00c32020
00a97c68	b 0x00a97c34
