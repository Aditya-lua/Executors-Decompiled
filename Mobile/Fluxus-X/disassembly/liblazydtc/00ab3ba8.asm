; EVP_VerifyFinal_ex @ 00ab3ba8
00ab3ba8	sub sp,sp,#0xa0
00ab3bac	stp x20,x19,[sp, #0x80]
00ab3bb0	mov x19,x1
00ab3bb4	mov w1,#0x200
00ab3bb8	stp x26,x25,[sp, #0x50]
00ab3bbc	stp x24,x23,[sp, #0x60]
00ab3bc0	stp x22,x21,[sp, #0x70]
00ab3bc4	stp x29,x30,[sp, #0x90]
00ab3bc8	add x29,sp,#0x90
00ab3bcc	mov x22,x5
00ab3bd0	mov x24,x4
00ab3bd4	mov x23,x3
00ab3bd8	mov w20,w2
00ab3bdc	mov x21,x0
00ab3be0	str wzr,[sp, #0xc]
00ab3be4	bl 0x00c3c1d0
00ab3be8	cbz w0,0x00ab3c64
00ab3bec	add x1,sp,#0x10
00ab3bf0	add x2,sp,#0xc
00ab3bf4	mov x0,x21
00ab3bf8	bl 0x00c31f60
00ab3bfc	cbz w0,0x00ab3cac
00ab3c00	mov x0,x24
00ab3c04	mov x1,x23
00ab3c08	mov x2,x22
00ab3c0c	bl 0x00c34640
00ab3c10	mov x22,x0
00ab3c14	cbz x0,0x00ab3ca4
00ab3c18	mov x0,x22
00ab3c1c	bl 0x00c3d730
00ab3c20	cmp w0,#0x1
00ab3c24	b.lt 0x00ab3ca4
00ab3c28	mov x0,x21
00ab3c2c	bl 0x00c34c00
00ab3c30	mov x1,x0
00ab3c34	mov x0,x22
00ab3c38	bl 0x00c3d6e0
00ab3c3c	cmp w0,#0x1
00ab3c40	b.lt 0x00ab3ca4
00ab3c44	ldr w4,[sp, #0xc]
00ab3c48	mov w2,w20
00ab3c4c	add x3,sp,#0x10
00ab3c50	mov x0,x22
00ab3c54	mov x1,x19
00ab3c58	bl 0x00c3d720
00ab3c5c	mov w19,w0
00ab3c60	b 0x00ab3cb4
00ab3c64	bl 0x00c31fa0
00ab3c68	cbz x0,0x00ab3cdc
00ab3c6c	mov x1,x21
00ab3c70	mov x25,x0
00ab3c74	bl 0x00c34bf0
00ab3c78	cbz w0,0x00ab3d14
00ab3c7c	add x1,sp,#0x10
00ab3c80	add x2,sp,#0xc
00ab3c84	mov x0,x25
00ab3c88	bl 0x00c31f60
00ab3c8c	mov w26,w0
00ab3c90	mov x0,x25
00ab3c94	bl 0x00c31f90
00ab3c98	cbnz w26,0x00ab3c00
00ab3c9c	mov w19,wzr
00ab3ca0	b 0x00ab3cbc
00ab3ca4	mov w19,#0xffffffff
00ab3ca8	b 0x00ab3cb4
00ab3cac	mov w19,wzr
00ab3cb0	mov x22,xzr
00ab3cb4	mov x0,x22
00ab3cb8	bl 0x00c34620
00ab3cbc	mov w0,w19
00ab3cc0	ldp x29,x30,[sp, #0x90]
00ab3cc4	ldp x20,x19,[sp, #0x80]
00ab3cc8	ldp x22,x21,[sp, #0x70]
00ab3ccc	ldp x24,x23,[sp, #0x60]
00ab3cd0	ldp x26,x25,[sp, #0x50]
00ab3cd4	add sp,sp,#0xa0
00ab3cd8	ret
00ab3cdc	bl 0x00c342a0
00ab3ce0	adrp x0,0x2d0000
00ab3ce4	adrp x2,0x2aa000
00ab3ce8	add x0,x0,#0x209
00ab3cec	add x2,x2,#0x812
00ab3cf0	mov w1,#0x22
00ab3cf4	bl 0x00c342b0
00ab3cf8	mov w1,#0x100
00ab3cfc	orr w0,wzr,#0x6
00ab3d00	movk w1,#0xc, LSL #16
00ab3d04	mov x2,xzr
00ab3d08	bl 0x00c342c0
00ab3d0c	mov w19,wzr
00ab3d10	b 0x00ab3cbc
00ab3d14	mov x0,x25
00ab3d18	bl 0x00c31f90
00ab3d1c	mov w19,wzr
00ab3d20	b 0x00ab3cbc
