; FUN_00b48ad0 @ 00b48ad0
00b48ad0	sub sp,sp,#0xb0
00b48ad4	stp x28,x27,[sp, #0x50]
00b48ad8	stp x26,x25,[sp, #0x60]
00b48adc	stp x24,x23,[sp, #0x70]
00b48ae0	stp x22,x21,[sp, #0x80]
00b48ae4	stp x20,x19,[sp, #0x90]
00b48ae8	stp x29,x30,[sp, #0xa0]
00b48aec	add x29,sp,#0xa0
00b48af0	mov x22,x3
00b48af4	mov x20,x2
00b48af8	mov x21,x1
00b48afc	mov x19,x0
00b48b00	bl 0x00c41000
00b48b04	cbz w0,0x00b48ccc
00b48b08	mov x0,x19
00b48b0c	mov x1,x22
00b48b10	bl 0x00b48dd0
00b48b14	cbz w0,0x00b48ccc
00b48b18	add x0,x19,#0x8
00b48b1c	bl 0x00c41160
00b48b20	cbz x0,0x00b48c00
00b48b24	ldr x23,[x19, #0x20]
00b48b28	cbz x23,0x00b48c28
00b48b2c	ldr x24,[x19, #0x30]
00b48b30	cbz x24,0x00b48c50
00b48b34	ldr x27,[x19, #0x48]
00b48b38	cbz x27,0x00b48c78
00b48b3c	ldrb w8,[x19, #0x40]
00b48b40	cbz w8,0x00b48ca0
00b48b44	ldr x25,[x19, #0x28]
00b48b48	ldr x26,[x19, #0x38]
00b48b4c	ldr x28,[x19, #0x50]
00b48b50	mov x22,x0
00b48b54	strb w8,[sp, #0x4c]
00b48b58	str wzr,[sp, #0x8]
00b48b5c	bl 0x00c31fa0
00b48b60	cbz x0,0x00b48ccc
00b48b64	mov x1,x22
00b48b68	mov x2,xzr
00b48b6c	mov x19,x0
00b48b70	bl 0x00c31f70
00b48b74	cbz w0,0x00b48d9c
00b48b78	mov x0,x19
00b48b7c	mov x1,x23
00b48b80	mov x2,x25
00b48b84	bl 0x00c31f80
00b48b88	cbz w0,0x00b48d9c
00b48b8c	mov x0,x19
00b48b90	mov x1,x24
00b48b94	mov x2,x26
00b48b98	bl 0x00c31f80
00b48b9c	cbz w0,0x00b48d9c
00b48ba0	add x1,sp,#0x4c
00b48ba4	mov w2,#0x1
00b48ba8	mov x0,x19
00b48bac	bl 0x00c31f80
00b48bb0	cbz w0,0x00b48d9c
00b48bb4	mov x0,x19
00b48bb8	mov x1,x27
00b48bbc	mov x2,x28
00b48bc0	bl 0x00c31f80
00b48bc4	cbz w0,0x00b48d9c
00b48bc8	add x1,sp,#0xc
00b48bcc	add x2,sp,#0x8
00b48bd0	mov x0,x19
00b48bd4	bl 0x00c31f60
00b48bd8	cbz w0,0x00b48d9c
00b48bdc	ldr w27,[sp, #0x8]
00b48be0	add x1,sp,#0xc
00b48be4	cmp x27,x20
00b48be8	b.ls 0x00b48cf4
00b48bec	mov x0,x21
00b48bf0	mov x2,x20
00b48bf4	bl 0x00c2ffd0
00b48bf8	mov w28,#0x1
00b48bfc	b 0x00b48da0
00b48c00	bl 0x00c342a0
00b48c04	adrp x0,0x2cc000
00b48c08	adrp x2,0x2b4000
00b48c0c	add x0,x0,#0x73f
00b48c10	add x2,x2,#0xe7d
00b48c14	mov w1,#0x6e
00b48c18	bl 0x00c342b0
00b48c1c	mov w0,#0x39
00b48c20	mov w1,#0x81
00b48c24	b 0x00b48cc4
00b48c28	bl 0x00c342a0
00b48c2c	adrp x0,0x2cc000
00b48c30	adrp x2,0x2b4000
00b48c34	add x0,x0,#0x73f
00b48c38	add x2,x2,#0xe7d
00b48c3c	mov w1,#0x72
00b48c40	bl 0x00c342b0
00b48c44	mov w0,#0x39
00b48c48	mov w1,#0x80
00b48c4c	b 0x00b48cc4
00b48c50	bl 0x00c342a0
00b48c54	adrp x0,0x2cc000
00b48c58	adrp x2,0x2b4000
00b48c5c	add x0,x0,#0x73f
00b48c60	add x2,x2,#0xe7d
00b48c64	mov w1,#0x76
00b48c68	bl 0x00c342b0
00b48c6c	mov w0,#0x39
00b48c70	mov w1,#0x87
00b48c74	b 0x00b48cc4
00b48c78	bl 0x00c342a0
00b48c7c	adrp x0,0x2cc000
00b48c80	adrp x2,0x2b4000
00b48c84	add x0,x0,#0x73f
00b48c88	add x2,x2,#0xe7d
00b48c8c	mov w1,#0x7a
00b48c90	bl 0x00c342b0
00b48c94	mov w0,#0x39
00b48c98	mov w1,#0x85
00b48c9c	b 0x00b48cc4
00b48ca0	bl 0x00c342a0
00b48ca4	adrp x0,0x2cc000
00b48ca8	adrp x2,0x2b4000
00b48cac	add x0,x0,#0x73f
00b48cb0	add x2,x2,#0xe7d
00b48cb4	orr w1,wzr,#0x7e
00b48cb8	bl 0x00c342b0
00b48cbc	mov w0,#0x39
00b48cc0	mov w1,#0x86
00b48cc4	mov x2,xzr
00b48cc8	bl 0x00c342c0
00b48ccc	mov w28,wzr
00b48cd0	mov w0,w28
00b48cd4	ldp x29,x30,[sp, #0xa0]
00b48cd8	ldp x20,x19,[sp, #0x90]
00b48cdc	ldp x22,x21,[sp, #0x80]
00b48ce0	ldp x24,x23,[sp, #0x70]
00b48ce4	ldp x26,x25,[sp, #0x60]
00b48ce8	ldp x28,x27,[sp, #0x50]
00b48cec	add sp,sp,#0xb0
00b48cf0	ret
00b48cf4	mov x0,x21
00b48cf8	mov x2,x27
00b48cfc	bl 0x00c2ffd0
00b48d00	mov w28,#0x1
00b48d04	cmp x27,x20
00b48d08	b.cs 0x00b48da0
00b48d0c	mov x0,x19
00b48d10	mov x1,x22
00b48d14	mov x2,xzr
00b48d18	bl 0x00c31f70
00b48d1c	cbz w0,0x00b48d9c
00b48d20	mov x0,x19
00b48d24	mov x1,x23
00b48d28	mov x2,x25
00b48d2c	bl 0x00c31f80
00b48d30	cbz w0,0x00b48d9c
00b48d34	mov x0,x19
00b48d38	mov x1,x24
00b48d3c	mov x2,x26
00b48d40	bl 0x00c31f80
00b48d44	cbz w0,0x00b48d9c
00b48d48	mov x0,x19
00b48d4c	mov x1,x21
00b48d50	mov x2,x27
00b48d54	bl 0x00c31f80
00b48d58	cbz w0,0x00b48d9c
00b48d5c	add x1,sp,#0xc
00b48d60	add x2,sp,#0x8
00b48d64	mov x0,x19
00b48d68	bl 0x00c31f60
00b48d6c	cbz w0,0x00b48d9c
00b48d70	ldr w2,[sp, #0x8]
00b48d74	mov x8,x27
00b48d78	add x0,x21,x8
00b48d7c	add x27,x27,x2
00b48d80	cmp x27,x20
00b48d84	b.hi 0x00b48db8
00b48d88	add x1,sp,#0xc
00b48d8c	bl 0x00c2ffd0
00b48d90	cmp x27,x20
00b48d94	b.cc 0x00b48d0c
00b48d98	b 0x00b48da0
00b48d9c	mov w28,wzr
00b48da0	mov x0,x19
00b48da4	bl 0x00c31f90
00b48da8	add x0,sp,#0xc
00b48dac	mov w1,#0x40
00b48db0	bl 0x00c34750
00b48db4	b 0x00b48cd0
00b48db8	sub x2,x20,x8
00b48dbc	add x1,sp,#0xc
00b48dc0	b 0x00b48bf4
