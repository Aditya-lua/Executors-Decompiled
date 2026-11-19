; psa_its_remove @ 00ba2be4
00ba2be4	sub sp,sp,#0x50
00ba2be8	str x19,[sp, #0x30]
00ba2bec	stp x29,x30,[sp, #0x40]
00ba2bf0	add x29,sp,#0x40
00ba2bf4	mrs x19,tpidr_el0
00ba2bf8	ldr x8,[x19, #0x28]
00ba2bfc	adrp x2,0x2c8000
00ba2c00	adrp x3,0x2ab000
00ba2c04	adrp x6,0x2da000
00ba2c08	mov x5,x0
00ba2c0c	lsr x4,x0,#0x20
00ba2c10	add x2,x2,#0x894
00ba2c14	add x3,x3,#0x32c
00ba2c18	add x6,x6,#0xd07
00ba2c1c	add x0,sp,#0xc
00ba2c20	mov w1,#0x19
00ba2c24	stur x8,[x29, #-0x18]
00ba2c28	bl 0x00c31ed0
00ba2c2c	adrp x1,0x2bb000
00ba2c30	add x1,x1,#0x65
00ba2c34	add x0,sp,#0xc
00ba2c38	bl 0x00c30c10
00ba2c3c	cbz x0,0x00ba2c5c
00ba2c40	bl 0x00c30be0
00ba2c44	add x0,sp,#0xc
00ba2c48	bl 0x00c433e0
00ba2c4c	cmp w0,#0x0
00ba2c50	mov w8,#0xffffff6e
00ba2c54	csel w0,wzr,w8,eq
00ba2c58	b 0x00ba2c60
00ba2c5c	mov w0,#0xffffff74
00ba2c60	ldr x8,[x19, #0x28]
00ba2c64	ldur x9,[x29, #-0x18]
00ba2c68	cmp x8,x9
00ba2c6c	b.ne 0x00ba2c80
00ba2c70	ldp x29,x30,[sp, #0x40]
00ba2c74	ldr x19,[sp, #0x30]
00ba2c78	add sp,sp,#0x50
00ba2c7c	ret
00ba2c80	bl 0x00c2fec0
