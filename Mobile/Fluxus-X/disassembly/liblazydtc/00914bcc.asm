; FUN_00914bcc @ 00914bcc
00914bcc	str x23,[sp, #-0x40]!
00914bd0	stp x22,x21,[sp, #0x10]
00914bd4	stp x20,x19,[sp, #0x20]
00914bd8	stp x29,x30,[sp, #0x30]
00914bdc	add x29,sp,#0x30
00914be0	mov x19,x0
00914be4	cbz x0,0x00914c64
00914be8	adrp x22,0xcc4000
00914bec	add x22,x22,#0x678
00914bf0	mov x21,xzr
00914bf4	ldr x20,[x19, x21, LSL #0x3]
00914bf8	cbz x20,0x00914c50
00914bfc	ldr x8,[x22]
00914c00	ldr x0,[x20, #0x28]
00914c04	ldr x23,[x20]
00914c08	blr x8
00914c0c	ldr x8,[x22]
00914c10	ldr x0,[x20, #0x18]
00914c14	blr x8
00914c18	ldr x8,[x22]
00914c1c	ldr x0,[x20, #0x20]
00914c20	blr x8
00914c24	ldr x8,[x22]
00914c28	ldr x0,[x20, #0x8]
00914c2c	blr x8
00914c30	ldr x8,[x22]
00914c34	ldr x0,[x20, #0x10]
00914c38	blr x8
00914c3c	ldr x8,[x22]
00914c40	mov x0,x20
00914c44	blr x8
00914c48	mov x20,x23
00914c4c	cbnz x23,0x00914bfc
00914c50	str xzr,[x19, x21, LSL #0x3]
00914c54	add x21,x21,#0x1
00914c58	cmp x21,#0x3f
00914c5c	b.ne 0x00914bf4
00914c60	str wzr,[x19, #0x200]
00914c64	ldp x29,x30,[sp, #0x30]
00914c68	ldp x20,x19,[sp, #0x20]
00914c6c	ldp x22,x21,[sp, #0x10]
00914c70	ldr x23,[sp], #0x40
00914c74	ret
