; PEM_write_PrivateKey_ex @ 00ab8b8c
00ab8b8c	sub sp,sp,#0x60
00ab8b90	str x25,[sp, #0x10]
00ab8b94	mov x25,x1
00ab8b98	mov w1,wzr
00ab8b9c	stp x24,x23,[sp, #0x20]
00ab8ba0	stp x22,x21,[sp, #0x30]
00ab8ba4	stp x20,x19,[sp, #0x40]
00ab8ba8	stp x29,x30,[sp, #0x50]
00ab8bac	add x29,sp,#0x50
00ab8bb0	mov x19,x6
00ab8bb4	mov x20,x5
00ab8bb8	mov w21,w4
00ab8bbc	mov x22,x3
00ab8bc0	mov x24,x2
00ab8bc4	bl 0x00c37810
00ab8bc8	cbz x0,0x00ab8c08
00ab8bcc	ldr x8,[x29, #0x10]
00ab8bd0	mov x1,x25
00ab8bd4	mov x2,x24
00ab8bd8	mov x3,x22
00ab8bdc	mov w4,w21
00ab8be0	mov x5,x20
00ab8be4	mov x6,x19
00ab8be8	mov x23,x0
00ab8bec	str x8,[sp]
00ab8bf0	bl 0x00ab8694
00ab8bf4	mov w19,w0
00ab8bf8	mov x0,x23
00ab8bfc	bl 0x00c31a40
00ab8c00	mov w0,w19
00ab8c04	b 0x00ab8c3c
00ab8c08	bl 0x00c342a0
00ab8c0c	adrp x0,0x2d6000
00ab8c10	adrp x2,0x2ae000
00ab8c14	add x0,x0,#0x444
00ab8c18	add x2,x2,#0x579
00ab8c1c	mov w1,#0x1b4
00ab8c20	bl 0x00c342b0
00ab8c24	mov w1,#0x7
00ab8c28	mov w0,#0x9
00ab8c2c	movk w1,#0x8, LSL #16
00ab8c30	mov x2,xzr
00ab8c34	bl 0x00c342c0
00ab8c38	mov w0,wzr
00ab8c3c	ldp x29,x30,[sp, #0x50]
00ab8c40	ldp x20,x19,[sp, #0x40]
00ab8c44	ldp x22,x21,[sp, #0x30]
00ab8c48	ldp x24,x23,[sp, #0x20]
00ab8c4c	ldr x25,[sp, #0x10]
00ab8c50	add sp,sp,#0x60
00ab8c54	ret
