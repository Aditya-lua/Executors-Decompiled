; FUN_00874b84 @ 00874b84
00874b84	stp x29,x30,[sp, #-0x40]!
00874b88	str x23,[sp, #0x10]
00874b8c	stp x22,x21,[sp, #0x20]
00874b90	stp x20,x19,[sp, #0x30]
00874b94	mov x29,sp
00874b98	mov x22,x0
00874b9c	add x0,x0,#0xf8
00874ba0	mov x19,x2
00874ba4	mov x21,x1
00874ba8	bl 0x0087b8b8
00874bac	cbz x0,0x00874bb8
00874bb0	ldr w20,[x0, #0x28]
00874bb4	b 0x00874c28
00874bb8	mov x23,x22
00874bbc	ldp x8,x9,[x23, #0x60]!
00874bc0	sub x8,x9,x8
00874bc4	mov w9,#0xcccd
00874bc8	lsr x8,x8,#0x3
00874bcc	movk w9,#0xcccc, LSL #16
00874bd0	mul w20,w8,w9
00874bd4	lsr w8,w20,#0x17
00874bd8	cbz w8,0x00874be4
00874bdc	mov w20,#0xffffffff
00874be0	b 0x00874c28
00874be4	ldp x8,x9,[x22, #0x118]
00874be8	add x8,x8,x8, LSL #0x1
00874bec	cmp x9,x8, LSR #0x2
00874bf0	b.cc 0x00874c0c
00874bf4	add x0,x22,#0xf8
00874bf8	mov x1,x21
00874bfc	bl 0x0087b8b8
00874c00	cbnz x0,0x00874c0c
00874c04	add x0,x22,#0xf8
00874c08	bl 0x0087bad0
00874c0c	add x0,x22,#0xf8
00874c10	mov x1,x21
00874c14	bl 0x0087b9ac
00874c18	str w20,[x0, #0x28]
00874c1c	mov x0,x23
00874c20	mov x1,x19
00874c24	bl 0x00874c40
00874c28	mov w0,w20
00874c2c	ldp x20,x19,[sp, #0x30]
00874c30	ldr x23,[sp, #0x10]
00874c34	ldp x22,x21,[sp, #0x20]
00874c38	ldp x29,x30,[sp], #0x40
00874c3c	ret
