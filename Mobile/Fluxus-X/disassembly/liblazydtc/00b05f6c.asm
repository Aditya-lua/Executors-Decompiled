; X509V3_add_value_int @ 00b05f6c
00b05f6c	stp x22,x21,[sp, #-0x30]!
00b05f70	stp x20,x19,[sp, #0x10]
00b05f74	stp x29,x30,[sp, #0x20]
00b05f78	add x29,sp,#0x20
00b05f7c	cbz x1,0x00b05ff0
00b05f80	mov x21,x0
00b05f84	mov x0,x1
00b05f88	mov x1,xzr
00b05f8c	mov x20,x2
00b05f90	bl 0x00c375e0
00b05f94	mov x19,x0
00b05f98	cbz x0,0x00b05ff8
00b05f9c	mov x0,x19
00b05fa0	bl 0x00b05c0c
00b05fa4	cbz x0,0x00b05ff8
00b05fa8	mov x22,x0
00b05fac	mov x0,x19
00b05fb0	bl 0x00c36290
00b05fb4	mov x0,x22
00b05fb8	bl 0x00c2ff50
00b05fbc	mov x2,x0
00b05fc0	mov x0,x21
00b05fc4	mov x1,x22
00b05fc8	mov x3,x20
00b05fcc	bl 0x00b0590c
00b05fd0	adrp x1,0x2c2000
00b05fd4	mov w19,w0
00b05fd8	add x1,x1,#0x5ca
00b05fdc	mov w2,#0x104
00b05fe0	mov x0,x22
00b05fe4	bl 0x00c32310
00b05fe8	mov w0,w19
00b05fec	b 0x00b06034
00b05ff0	mov w0,#0x1
00b05ff4	b 0x00b06034
00b05ff8	bl 0x00c342a0
00b05ffc	adrp x0,0x2c2000
00b06000	adrp x2,0x2b4000
00b06004	add x0,x0,#0x5ca
00b06008	add x2,x2,#0xa9e
00b0600c	mov w1,#0xbd
00b06010	bl 0x00c342b0
00b06014	mov w1,#0x100
00b06018	mov w0,#0x22
00b0601c	movk w1,#0xc, LSL #16
00b06020	mov x2,xzr
00b06024	bl 0x00c342c0
00b06028	mov x0,x19
00b0602c	bl 0x00c36290
00b06030	mov w0,wzr
00b06034	ldp x29,x30,[sp, #0x20]
00b06038	ldp x20,x19,[sp, #0x10]
00b0603c	ldp x22,x21,[sp], #0x30
00b06040	ret
