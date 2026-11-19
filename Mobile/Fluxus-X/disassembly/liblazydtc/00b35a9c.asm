; FUN_00b35a9c @ 00b35a9c
00b35a9c	stp x28,x27,[sp, #-0x60]!
00b35aa0	stp x26,x25,[sp, #0x10]
00b35aa4	stp x24,x23,[sp, #0x20]
00b35aa8	stp x22,x21,[sp, #0x30]
00b35aac	stp x20,x19,[sp, #0x40]
00b35ab0	stp x29,x30,[sp, #0x50]
00b35ab4	add x29,sp,#0x50
00b35ab8	sub sp,sp,#0x460
00b35abc	mov x22,x2
00b35ac0	mov x21,x1
00b35ac4	add x1,sp,#0x20
00b35ac8	orr w2,wzr,#0x18
00b35acc	mov x26,x6
00b35ad0	mov x27,x5
00b35ad4	mov x23,x4
00b35ad8	mov x24,x3
00b35adc	mov x19,x0
00b35ae0	add x20,sp,#0x20
00b35ae4	bl 0x00c34220
00b35ae8	cmp w0,#0x18
00b35aec	b.ne 0x00b35c2c
00b35af0	add x0,sp,#0x18
00b35af4	orr w1,wzr,#0x18
00b35af8	add x3,sp,#0x14
00b35afc	add x4,sp,#0x10
00b35b00	mov w2,wzr
00b35b04	str x20,[sp, #0x18]
00b35b08	bl 0x00b35940
00b35b0c	cbz w0,0x00b35c58
00b35b10	ldp w8,w28,[sp, #0x10]
00b35b14	adrp x1,0x29e000
00b35b18	add x1,x1,#0xe1c
00b35b1c	mov w2,#0x3a8
00b35b20	str w8,[sp, #0xc]
00b35b24	add w8,w28,w8
00b35b28	sxtw x25,w8
00b35b2c	mov x0,x25
00b35b30	bl 0x00c32320
00b35b34	cbz x0,0x00b35c80
00b35b38	mov x20,x0
00b35b3c	str x0,[sp, #0x18]
00b35b40	mov x0,x19
00b35b44	mov x1,x20
00b35b48	mov w2,w25
00b35b4c	bl 0x00c34220
00b35b50	cmp w0,w25
00b35b54	mov x19,x25
00b35b58	b.ne 0x00b35cac
00b35b5c	stur x20,[x29, #-0x60]
00b35b60	bl 0x00c34b90
00b35b64	mov x25,x0
00b35b68	cbz x0,0x00b35ce0
00b35b6c	cbz w28,0x00b35d20
00b35b70	str x25,[sp]
00b35b74	mov x25,x19
00b35b78	add x0,sp,#0x3c
00b35b7c	mov w1,#0x400
00b35b80	mov w2,wzr
00b35b84	mov x3,x22
00b35b88	cbz x21,0x00b35d44
00b35b8c	blr x21
00b35b90	mov w19,w0
00b35b94	tbnz w0,#0x1f,0x00b35d50
00b35b98	ldr w8,[sp, #0xc]
00b35b9c	adrp x1,0x29e000
00b35ba0	add x1,x1,#0xe1c
00b35ba4	mov w2,#0x357
00b35ba8	add w0,w8,#0x8
00b35bac	bl 0x00c32320
00b35bb0	mov x22,x0
00b35bb4	cbz x0,0x00b35d84
00b35bb8	sub x0,x29,#0x74
00b35bbc	add x3,sp,#0x3c
00b35bc0	mov x1,x20
00b35bc4	mov w2,w28
00b35bc8	mov w4,w19
00b35bcc	mov x5,x27
00b35bd0	mov x6,x26
00b35bd4	bl 0x00b36a9c
00b35bd8	cbz w0,0x00b35db4
00b35bdc	add x28,x20,x28
00b35be0	ldr x8,[x28], #0x8
00b35be4	ldr w9,[sp, #0xc]
00b35be8	mov x19,x25
00b35bec	str x8,[x22]
00b35bf0	cmp w9,#0x7
00b35bf4	stur x28,[x29, #-0x60]
00b35bf8	b.hi 0x00b35e14
00b35bfc	bl 0x00c342a0
00b35c00	adrp x0,0x29e000
00b35c04	adrp x2,0x2ba000
00b35c08	add x0,x0,#0xe1c
00b35c0c	add x2,x2,#0xabe
00b35c10	mov w1,#0x364
00b35c14	bl 0x00c342b0
00b35c18	mov w0,#0x9
00b35c1c	mov w1,#0x7d
00b35c20	mov x2,xzr
00b35c24	bl 0x00c342c0
00b35c28	b 0x00b35db8
00b35c2c	bl 0x00c342a0
00b35c30	adrp x0,0x29e000
00b35c34	adrp x2,0x2ba000
00b35c38	add x0,x0,#0xe1c
00b35c3c	add x2,x2,#0xaaf
00b35c40	mov w1,#0x3a0
00b35c44	bl 0x00c342b0
00b35c48	mov w0,#0x9
00b35c4c	orr w1,wzr,#0x7c
00b35c50	mov x2,xzr
00b35c54	bl 0x00c342c0
00b35c58	mov x21,xzr
00b35c5c	mov x0,x21
00b35c60	add sp,sp,#0x460
00b35c64	ldp x29,x30,[sp, #0x50]
00b35c68	ldp x20,x19,[sp, #0x40]
00b35c6c	ldp x22,x21,[sp, #0x30]
00b35c70	ldp x24,x23,[sp, #0x20]
00b35c74	ldp x26,x25,[sp, #0x10]
00b35c78	ldp x28,x27,[sp], #0x60
00b35c7c	ret
00b35c80	bl 0x00c342a0
00b35c84	adrp x0,0x29e000
00b35c88	adrp x2,0x2ba000
00b35c8c	add x0,x0,#0xe1c
00b35c90	add x2,x2,#0xaaf
00b35c94	mov w1,#0x3aa
00b35c98	bl 0x00c342b0
00b35c9c	mov w1,#0x100
00b35ca0	mov w0,#0x9
00b35ca4	movk w1,#0xc, LSL #16
00b35ca8	b 0x00b35c50
00b35cac	bl 0x00c342a0
00b35cb0	adrp x0,0x29e000
00b35cb4	adrp x2,0x2ba000
00b35cb8	add x0,x0,#0xe1c
00b35cbc	add x2,x2,#0xaaf
00b35cc0	mov w1,#0x3af
00b35cc4	bl 0x00c342b0
00b35cc8	mov w0,#0x9
00b35ccc	orr w1,wzr,#0x7c
00b35cd0	mov x2,xzr
00b35cd4	bl 0x00c342c0
00b35cd8	mov x21,xzr
00b35cdc	b 0x00b35df8
00b35ce0	bl 0x00c342a0
00b35ce4	adrp x0,0x29e000
00b35ce8	adrp x2,0x2ba000
00b35cec	add x0,x0,#0xe1c
00b35cf0	add x2,x2,#0xabe
00b35cf4	mov w1,#0x344
00b35cf8	bl 0x00c342b0
00b35cfc	mov w1,#0x100
00b35d00	mov w0,#0x9
00b35d04	movk w1,#0xc, LSL #16
00b35d08	mov x2,xzr
00b35d0c	bl 0x00c342c0
00b35d10	mov x22,xzr
00b35d14	mov x21,xzr
00b35d18	mov x26,xzr
00b35d1c	b 0x00b35dc4
00b35d20	mov x22,xzr
00b35d24	mov x26,xzr
00b35d28	ldr w1,[sp, #0xc]
00b35d2c	sub x0,x29,#0x60
00b35d30	mov x2,x24
00b35d34	mov x3,x23
00b35d38	bl 0x00b34d84
00b35d3c	mov x21,x0
00b35d40	b 0x00b35dc4
00b35d44	bl 0x00c3f260
00b35d48	mov w19,w0
00b35d4c	tbz w0,#0x1f,0x00b35b98
00b35d50	bl 0x00c342a0
00b35d54	adrp x0,0x29e000
00b35d58	adrp x2,0x2ba000
00b35d5c	add x0,x0,#0xe1c
00b35d60	add x2,x2,#0xabe
00b35d64	mov w1,#0x354
00b35d68	bl 0x00c342b0
00b35d6c	mov w0,#0x9
00b35d70	mov w1,#0x68
00b35d74	mov x2,xzr
00b35d78	bl 0x00c342c0
00b35d7c	mov x22,xzr
00b35d80	b 0x00b35db4
00b35d84	bl 0x00c342a0
00b35d88	adrp x0,0x29e000
00b35d8c	adrp x2,0x2ba000
00b35d90	add x0,x0,#0xe1c
00b35d94	add x2,x2,#0xabe
00b35d98	mov w1,#0x359
00b35d9c	bl 0x00c342b0
00b35da0	mov w1,#0x100
00b35da4	mov w0,#0x9
00b35da8	movk w1,#0xc, LSL #16
00b35dac	mov x2,xzr
00b35db0	bl 0x00c342c0
00b35db4	mov x19,x25
00b35db8	ldr x25,[sp]
00b35dbc	mov x26,xzr
00b35dc0	mov x21,xzr
00b35dc4	mov x0,x25
00b35dc8	bl 0x00c342d0
00b35dcc	mov x0,x26
00b35dd0	bl 0x00c357d0
00b35dd4	cbz x22,0x00b35df8
00b35dd8	sub x0,x29,#0x74
00b35ddc	mov w1,#0x14
00b35de0	bl 0x00c34750
00b35de4	adrp x1,0x29e000
00b35de8	add x1,x1,#0xe1c
00b35dec	mov w2,#0x390
00b35df0	mov x0,x22
00b35df4	bl 0x00c32310
00b35df8	adrp x2,0x29e000
00b35dfc	add x2,x2,#0xe1c
00b35e00	mov w3,#0x3b5
00b35e04	mov x0,x20
00b35e08	mov x1,x19
00b35e0c	bl 0x00c345e0
00b35e10	b 0x00b35c5c
00b35e14	adrp x1,0x2c7000
00b35e18	add x1,x1,#0x50a
00b35e1c	mov x0,x27
00b35e20	mov x2,x26
00b35e24	bl 0x00c35260
00b35e28	ldr x25,[sp]
00b35e2c	mov x26,x0
00b35e30	cbz x0,0x00b35dc0
00b35e34	sub x3,x29,#0x74
00b35e38	mov x0,x25
00b35e3c	mov x1,x26
00b35e40	mov x2,xzr
00b35e44	mov x4,xzr
00b35e48	bl 0x00c36320
00b35e4c	cbz w0,0x00b35dc0
00b35e50	ldr w8,[sp, #0xc]
00b35e54	add x21,x22,#0x8
00b35e58	add x2,sp,#0x38
00b35e5c	mov x0,x25
00b35e60	sub w27,w8,#0x8
00b35e64	mov x1,x21
00b35e68	mov x3,x28
00b35e6c	mov w4,w27
00b35e70	bl 0x00c36330
00b35e74	cbz w0,0x00b35dc0
00b35e78	ldrsw x8,[sp, #0x38]
00b35e7c	add x2,sp,#0x38
00b35e80	mov x0,x25
00b35e84	add x1,x21,x8
00b35e88	bl 0x00c3cd10
00b35e8c	cbz w0,0x00b35dc0
00b35e90	ldr w8,[x22, #0x8]
00b35e94	mov w9,#0x5352
00b35e98	movk w9,#0x3241, LSL #16
00b35e9c	cmp w8,w9
00b35ea0	b.eq 0x00b35eb4
00b35ea4	mov w9,#0x5344
00b35ea8	movk w9,#0x3253, LSL #16
00b35eac	cmp w8,w9
00b35eb0	b.ne 0x00b35ebc
00b35eb4	stur x22,[x29, #-0x60]
00b35eb8	b 0x00b35d28
00b35ebc	sub x8,x29,#0x74
00b35ec0	sub x3,x29,#0x74
00b35ec4	mov x0,x25
00b35ec8	mov x1,x26
00b35ecc	mov x2,xzr
00b35ed0	mov x4,xzr
00b35ed4	sturb wzr,[x29, #-0x65]
00b35ed8	sturh wzr,[x8, #0xd]
00b35edc	stur xzr,[x8, #0x5]
00b35ee0	bl 0x00c36320
00b35ee4	cbz w0,0x00b35dc0
00b35ee8	add x2,sp,#0x38
00b35eec	mov x0,x25
00b35ef0	mov x1,x21
00b35ef4	mov x3,x28
00b35ef8	mov w4,w27
00b35efc	bl 0x00c36330
00b35f00	cbz w0,0x00b35dc0
00b35f04	ldrsw x8,[sp, #0x38]
00b35f08	add x2,sp,#0x38
00b35f0c	mov x0,x25
00b35f10	add x1,x21,x8
00b35f14	bl 0x00c3cd10
00b35f18	cbz w0,0x00b35dc0
00b35f1c	ldr w8,[x22, #0x8]
00b35f20	mov w9,#0x5352
00b35f24	movk w9,#0x3241, LSL #16
00b35f28	cmp w8,w9
00b35f2c	b.eq 0x00b35eb4
00b35f30	mov w9,#0x5344
00b35f34	movk w9,#0x3253, LSL #16
00b35f38	cmp w8,w9
00b35f3c	b.eq 0x00b35eb4
00b35f40	bl 0x00c342a0
00b35f44	adrp x0,0x29e000
00b35f48	adrp x2,0x2ba000
00b35f4c	add x0,x0,#0xe1c
00b35f50	add x2,x2,#0xabe
00b35f54	mov w1,#0x37d
00b35f58	bl 0x00c342b0
00b35f5c	mov w0,#0x9
00b35f60	mov w1,#0x65
00b35f64	mov x2,xzr
00b35f68	bl 0x00c342c0
00b35f6c	b 0x00b35dc0
