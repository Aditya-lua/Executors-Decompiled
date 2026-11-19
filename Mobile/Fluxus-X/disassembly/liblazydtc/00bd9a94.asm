; FUN_00bd9a94 @ 00bd9a94
00bd9a94	paciasp
00bd9a98	sub sp,sp,#0x60
00bd9a9c	stp x29,x30,[sp, #0x20]
00bd9aa0	stp x24,x23,[sp, #0x30]
00bd9aa4	stp x22,x21,[sp, #0x40]
00bd9aa8	stp x20,x19,[sp, #0x50]
00bd9aac	add x29,sp,#0x20
00bd9ab0	ldrb w8,[x0, #0x60]
00bd9ab4	mov x19,x0
00bd9ab8	cmp w8,#0x1
00bd9abc	b.ne 0x00bd9ad8
00bd9ac0	ldr w0,[x19, #0x5c]
00bd9ac4	tbz w1,#0x0,0x00bd9c20
00bd9ac8	mov w8,#0xffffffff
00bd9acc	strb wzr,[x19, #0x60]
00bd9ad0	str w8,[x19, #0x5c]
00bd9ad4	b 0x00bd9c20
00bd9ad8	ldrb w8,[x19, #0x61]
00bd9adc	mov w20,w1
00bd9ae0	cmp w8,#0x1
00bd9ae4	b.ne 0x00bd9b04
00bd9ae8	ldr x0,[x19, #0x40]
00bd9aec	bl 0x00c43a20
00bd9af0	cmn w0,#0x1
00bd9af4	b.eq 0x00bd9c20
00bd9af8	tbz w20,#0x0,0x00bd9ba0
00bd9afc	str w0,[x19, #0x5c]
00bd9b00	b 0x00bd9c20
00bd9b04	ldr w8,[x19, #0x58]
00bd9b08	mov x22,xzr
00bd9b0c	sub x23,x29,#0x8
00bd9b10	cmp w8,#0x1
00bd9b14	csinc w21,w8,wzr,gt
00bd9b18	ldr x0,[x19, #0x40]
00bd9b1c	bl 0x00c30c20
00bd9b20	cmn w0,#0x1
00bd9b24	b.eq 0x00bd9c20
00bd9b28	strb w0,[x23, x22]
00bd9b2c	add x22,x22,#0x1
00bd9b30	cmp x21,x22
00bd9b34	b.ne 0x00bd9b18
00bd9b38	sub x22,x29,#0xc
00bd9b3c	sub x23,x29,#0x8
00bd9b40	ldp x0,x1,[x19, #0x48]
00bd9b44	sub x2,x29,#0x8
00bd9b48	add x3,x23,x21
00bd9b4c	add x4,sp,#0x8
00bd9b50	sub x5,x29,#0xc
00bd9b54	add x6,x22,#0x4
00bd9b58	mov x7,sp
00bd9b5c	ldr x8,[x0]
00bd9b60	ldr x24,[x1]
00bd9b64	ldr x8,[x8, #0x20]
00bd9b68	blr x8
00bd9b6c	cmp w0,#0x1
00bd9b70	b.ne 0x00bd9bbc
00bd9b74	ldr x8,[x19, #0x50]
00bd9b78	cmp x21,#0x8
00bd9b7c	str x24,[x8]
00bd9b80	b.eq 0x00bd9be4
00bd9b84	ldr x0,[x19, #0x40]
00bd9b88	bl 0x00c30c20
00bd9b8c	cmn w0,#0x1
00bd9b90	b.eq 0x00bd9c20
00bd9b94	strb w0,[x23, x21]
00bd9b98	add x21,x21,#0x1
00bd9b9c	b 0x00bd9b40
00bd9ba0	ldr x1,[x19, #0x40]
00bd9ba4	mov w19,w0
00bd9ba8	bl 0x00c43780
00bd9bac	cmn w0,#0x1
00bd9bb0	b.eq 0x00bd9c20
00bd9bb4	mov w0,w19
00bd9bb8	b 0x00bd9c20
00bd9bbc	cmp w0,#0x2
00bd9bc0	b.eq 0x00bd9be4
00bd9bc4	cmp w0,#0x3
00bd9bc8	b.ne 0x00bd9bd4
00bd9bcc	ldurb w8,[x29, #-0x8]
00bd9bd0	stur w8,[x29, #-0xc]
00bd9bd4	tbz w20,#0x0,0x00bd9bec
00bd9bd8	ldur w0,[x29, #-0xc]
00bd9bdc	str w0,[x19, #0x5c]
00bd9be0	b 0x00bd9c20
00bd9be4	mov w0,#0xffffffff
00bd9be8	b 0x00bd9c20
00bd9bec	sub x9,x29,#0x8
00bd9bf0	mov w8,w21
00bd9bf4	sub x20,x9,#0x1
00bd9bf8	subs x21,x8,#0x1
00bd9bfc	b.lt 0x00bd9c1c
00bd9c00	ldrb w0,[x20, x8]
00bd9c04	ldr x1,[x19, #0x40]
00bd9c08	bl 0x00c43910
00bd9c0c	cmn w0,#0x1
00bd9c10	mov x8,x21
00bd9c14	b.ne 0x00bd9bf8
00bd9c18	b 0x00bd9c20
00bd9c1c	ldur w0,[x29, #-0xc]
00bd9c20	ldp x20,x19,[sp, #0x50]
00bd9c24	ldp x22,x21,[sp, #0x40]
00bd9c28	ldp x24,x23,[sp, #0x30]
00bd9c2c	ldp x29,x30,[sp, #0x20]
00bd9c30	add sp,sp,#0x60
00bd9c34	autiasp
00bd9c38	ret
