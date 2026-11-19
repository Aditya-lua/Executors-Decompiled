; d2i_PrivateKey_ex_fp @ 00b16b48
00b16b48	sub sp,sp,#0x50
00b16b4c	str x23,[sp, #0x10]
00b16b50	stp x22,x21,[sp, #0x20]
00b16b54	stp x20,x19,[sp, #0x30]
00b16b58	stp x29,x30,[sp, #0x40]
00b16b5c	add x29,sp,#0x40
00b16b60	mov x20,x3
00b16b64	mov x21,x2
00b16b68	mov x22,x1
00b16b6c	mov x23,x0
00b16b70	bl 0x00c32270
00b16b74	bl 0x00c32240
00b16b78	cbz x0,0x00b16bd0
00b16b7c	mov w1,#0x6a
00b16b80	mov x2,xzr
00b16b84	mov x3,x23
00b16b88	mov x19,x0
00b16b8c	bl 0x00c321a0
00b16b90	add x1,sp,#0x18
00b16b94	mov x0,x19
00b16b98	str xzr,[sp, #0x18]
00b16b9c	bl 0x00c37460
00b16ba0	tbnz w0,#0x1f,0x00b16c08
00b16ba4	ldr x8,[sp, #0x18]
00b16ba8	sxtw x2,w0
00b16bac	add x1,sp,#0x8
00b16bb0	mov x0,x22
00b16bb4	ldr x8,[x8, #0x8]
00b16bb8	mov x3,x21
00b16bbc	mov x4,x20
00b16bc0	str x8,[sp, #0x8]
00b16bc4	bl 0x00c37cb0
00b16bc8	mov x20,x0
00b16bcc	b 0x00b16c0c
00b16bd0	bl 0x00c342a0
00b16bd4	adrp x0,0x2c4000
00b16bd8	adrp x2,0x2c4000
00b16bdc	add x0,x0,#0x3b5
00b16be0	add x2,x2,#0x3d7
00b16be4	mov w1,#0x2b6
00b16be8	bl 0x00c342b0
00b16bec	mov w1,#0x7
00b16bf0	mov w0,#0xb
00b16bf4	movk w1,#0x8, LSL #16
00b16bf8	mov x2,xzr
00b16bfc	bl 0x00c342c0
00b16c00	mov x20,xzr
00b16c04	b 0x00b16c1c
00b16c08	mov x20,xzr
00b16c0c	ldr x0,[sp, #0x18]
00b16c10	bl 0x00c35660
00b16c14	mov x0,x19
00b16c18	bl 0x00c31a40
00b16c1c	mov x0,x20
00b16c20	ldp x29,x30,[sp, #0x40]
00b16c24	ldp x20,x19,[sp, #0x30]
00b16c28	ldp x22,x21,[sp, #0x20]
00b16c2c	ldr x23,[sp, #0x10]
00b16c30	add sp,sp,#0x50
00b16c34	ret
