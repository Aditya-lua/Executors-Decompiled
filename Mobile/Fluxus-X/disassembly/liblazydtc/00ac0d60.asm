; PKCS7_signatureVerify @ 00ac0d60
00ac0d60	sub sp,sp,#0xb0
00ac0d64	stp x24,x23,[sp, #0x70]
00ac0d68	mov x24,x0
00ac0d6c	mov x0,x1
00ac0d70	stp x26,x25,[sp, #0x60]
00ac0d74	stp x22,x21,[sp, #0x80]
00ac0d78	stp x20,x19,[sp, #0x90]
00ac0d7c	stp x29,x30,[sp, #0xa0]
00ac0d80	add x29,sp,#0xa0
00ac0d84	mov x21,x3
00ac0d88	mov x23,x2
00ac0d8c	mov x25,x1
00ac0d90	bl 0x00c3f7f0
00ac0d94	mov x19,x0
00ac0d98	bl 0x00c3f7d0
00ac0d9c	mov x20,x0
00ac0da0	mov x0,x19
00ac0da4	bl 0x00c3f7e0
00ac0da8	mov x22,x0
00ac0dac	bl 0x00c31fa0
00ac0db0	mov x19,x0
00ac0db4	cbz x0,0x00ac0e74
00ac0db8	ldr x0,[x25, #0x18]
00ac0dbc	bl 0x00c37750
00ac0dc0	cmp w0,#0x16
00ac0dc4	b.eq 0x00ac0dd8
00ac0dc8	ldr x0,[x25, #0x18]
00ac0dcc	bl 0x00c37750
00ac0dd0	cmp w0,#0x18
00ac0dd4	b.ne 0x00ac0ea0
00ac0dd8	ldr x8,[x23, #0x10]
00ac0ddc	ldr x0,[x8]
00ac0de0	bl 0x00c37750
00ac0de4	cbz x24,0x00ac0e4c
00ac0de8	mov w25,w0
00ac0dec	mov w1,#0x208
00ac0df0	mov x0,x24
00ac0df4	bl 0x00c355d0
00ac0df8	cbz x0,0x00ac0e4c
00ac0dfc	orr w1,wzr,#0x78
00ac0e00	sub x3,x29,#0x48
00ac0e04	mov x2,xzr
00ac0e08	mov x24,x0
00ac0e0c	bl 0x00c321a0
00ac0e10	ldur x0,[x29, #-0x48]
00ac0e14	cbz x0,0x00ac0f88
00ac0e18	bl 0x00c34c00
00ac0e1c	bl 0x00c34c30
00ac0e20	cmp w0,w25
00ac0e24	b.eq 0x00ac0ec8
00ac0e28	ldur x0,[x29, #-0x48]
00ac0e2c	bl 0x00c34c00
00ac0e30	bl 0x00c3cf60
00ac0e34	cmp w0,w25
00ac0e38	b.eq 0x00ac0ec8
00ac0e3c	mov x0,x24
00ac0e40	bl 0x00c35620
00ac0e44	mov x24,x0
00ac0e48	cbnz x0,0x00ac0dec
00ac0e4c	bl 0x00c342a0
00ac0e50	adrp x0,0x29e000
00ac0e54	adrp x2,0x2d6000
00ac0e58	add x0,x0,#0x913
00ac0e5c	add x2,x2,#0x4d4
00ac0e60	mov w1,#0x417
00ac0e64	bl 0x00c342b0
00ac0e68	mov w0,#0x21
00ac0e6c	mov w1,#0x6c
00ac0e70	b 0x00ac0fb4
00ac0e74	bl 0x00c342a0
00ac0e78	adrp x0,0x29e000
00ac0e7c	adrp x2,0x2d6000
00ac0e80	add x0,x0,#0x913
00ac0e84	add x2,x2,#0x4d4
00ac0e88	mov w1,#0x408
00ac0e8c	bl 0x00c342b0
00ac0e90	mov w1,#0x100
00ac0e94	mov w0,#0x21
00ac0e98	movk w1,#0xc, LSL #16
00ac0e9c	b 0x00ac0fb4
00ac0ea0	bl 0x00c342a0
00ac0ea4	adrp x0,0x29e000
00ac0ea8	adrp x2,0x2d6000
00ac0eac	add x0,x0,#0x913
00ac0eb0	add x2,x2,#0x4d4
00ac0eb4	mov w1,#0x40d
00ac0eb8	bl 0x00c342b0
00ac0ebc	mov w0,#0x21
00ac0ec0	mov w1,#0x72
00ac0ec4	b 0x00ac0fb4
00ac0ec8	ldur x1,[x29, #-0x48]
00ac0ecc	mov x0,x19
00ac0ed0	bl 0x00c34bf0
00ac0ed4	cbz w0,0x00ac0fbc
00ac0ed8	ldr x26,[x23, #0x18]
00ac0edc	cbz x26,0x00ac0ff4
00ac0ee0	mov x0,x26
00ac0ee4	bl 0x00c325e0
00ac0ee8	cbz w0,0x00ac0ff4
00ac0eec	add x1,sp,#0x18
00ac0ef0	add x2,sp,#0xc
00ac0ef4	mov x0,x19
00ac0ef8	str xzr,[sp, #0x10]
00ac0efc	bl 0x00c31f60
00ac0f00	cbz w0,0x00ac0fbc
00ac0f04	mov w1,#0x33
00ac0f08	mov w2,#0xffffffff
00ac0f0c	mov x0,x26
00ac0f10	bl 0x00c3d100
00ac0f14	mov w1,w0
00ac0f18	mov x0,x26
00ac0f1c	bl 0x00c3d0f0
00ac0f20	mov w1,wzr
00ac0f24	bl 0x00c3f610
00ac0f28	cbz x0,0x00ac1034
00ac0f2c	ldr x8,[x0, #0x8]
00ac0f30	cbz x8,0x00ac1034
00ac0f34	ldr w2,[x8]
00ac0f38	ldr w9,[sp, #0xc]
00ac0f3c	cmp w2,w9
00ac0f40	b.ne 0x00ac0f54
00ac0f44	ldr x0,[x8, #0x8]
00ac0f48	add x1,sp,#0x18
00ac0f4c	bl 0x00c300b0
00ac0f50	cbz w0,0x00ac1084
00ac0f54	bl 0x00c342a0
00ac0f58	adrp x0,0x29e000
00ac0f5c	adrp x2,0x2d6000
00ac0f60	add x0,x0,#0x913
00ac0f64	add x2,x2,#0x4d4
00ac0f68	mov w1,#0x441
00ac0f6c	bl 0x00c342b0
00ac0f70	mov w0,#0x21
00ac0f74	mov w1,#0x65
00ac0f78	mov x2,xzr
00ac0f7c	bl 0x00c342c0
00ac0f80	mov x24,xzr
00ac0f84	b 0x00ac107c
00ac0f88	bl 0x00c342a0
00ac0f8c	adrp x0,0x29e000
00ac0f90	adrp x2,0x2d6000
00ac0f94	add x0,x0,#0x913
00ac0f98	add x2,x2,#0x4d4
00ac0f9c	mov w1,#0x41c
00ac0fa0	bl 0x00c342b0
00ac0fa4	mov w8,#0x100
00ac0fa8	movk w8,#0xc, LSL #16
00ac0fac	add w1,w8,#0x3
00ac0fb0	mov w0,#0x21
00ac0fb4	mov x2,xzr
00ac0fb8	bl 0x00c342c0
00ac0fbc	mov w20,wzr
00ac0fc0	mov x24,xzr
00ac0fc4	mov x0,x19
00ac0fc8	bl 0x00c31f90
00ac0fcc	mov x0,x24
00ac0fd0	bl 0x00c35800
00ac0fd4	mov w0,w20
00ac0fd8	ldp x29,x30,[sp, #0xa0]
00ac0fdc	ldp x20,x19,[sp, #0x90]
00ac0fe0	ldp x22,x21,[sp, #0x80]
00ac0fe4	ldp x24,x23,[sp, #0x70]
00ac0fe8	ldp x26,x25,[sp, #0x60]
00ac0fec	add sp,sp,#0xb0
00ac0ff0	ret
00ac0ff4	mov x24,xzr
00ac0ff8	ldr x23,[x23, #0x28]
00ac0ffc	mov x0,x21
00ac1000	bl 0x00c32cb0
00ac1004	cbz x0,0x00ac107c
00ac1008	ldr x1,[x23, #0x8]
00ac100c	ldr w2,[x23]
00ac1010	mov x3,x0
00ac1014	mov x0,x19
00ac1018	mov x4,x20
00ac101c	mov x5,x22
00ac1020	bl 0x00c3dbd0
00ac1024	cmp w0,#0x0
00ac1028	b.le 0x00ac1050
00ac102c	mov w20,#0x1
00ac1030	b 0x00ac0fc4
00ac1034	bl 0x00c342a0
00ac1038	adrp x0,0x29e000
00ac103c	adrp x2,0x2d6000
00ac1040	add x0,x0,#0x913
00ac1044	add x2,x2,#0x4d4
00ac1048	mov w1,#0x43c
00ac104c	b 0x00ac0e64
00ac1050	bl 0x00c342a0
00ac1054	adrp x0,0x29e000
00ac1058	adrp x2,0x2d6000
00ac105c	add x0,x0,#0x913
00ac1060	add x2,x2,#0x4d4
00ac1064	mov w1,#0x46a
00ac1068	bl 0x00c342b0
00ac106c	mov w0,#0x21
00ac1070	mov w1,#0x69
00ac1074	mov x2,xzr
00ac1078	bl 0x00c342c0
00ac107c	mov w20,#0xffffffff
00ac1080	b 0x00ac0fc4
00ac1084	bl 0x00c35250
00ac1088	mov w0,w25
00ac108c	bl 0x00c324f0
00ac1090	mov x1,x0
00ac1094	mov x0,x20
00ac1098	mov x2,x22
00ac109c	bl 0x00c357f0
00ac10a0	mov x24,x0
00ac10a4	mov x1,x0
00ac10a8	cbnz x0,0x00ac10c0
00ac10ac	mov w0,w25
00ac10b0	bl 0x00c324f0
00ac10b4	bl 0x00c35310
00ac10b8	mov x1,x0
00ac10bc	cbz x0,0x00ac111c
00ac10c0	mov x0,x19
00ac10c4	mov x2,xzr
00ac10c8	bl 0x00c31f70
00ac10cc	cbz w0,0x00ac111c
00ac10d0	bl 0x00c35240
00ac10d4	bl 0x00c3f630
00ac10d8	mov x2,x0
00ac10dc	add x1,sp,#0x10
00ac10e0	mov x0,x26
00ac10e4	bl 0x00c36170
00ac10e8	cmp w0,#0x0
00ac10ec	b.le 0x00ac1128
00ac10f0	ldr x1,[sp, #0x10]
00ac10f4	sxtw x2,w0
00ac10f8	mov x0,x19
00ac10fc	bl 0x00c31f80
00ac1100	cbz w0,0x00ac1154
00ac1104	ldr x0,[sp, #0x10]
00ac1108	adrp x1,0x29e000
00ac110c	add x1,x1,#0x913
00ac1110	mov w2,#0x45e
00ac1114	bl 0x00c32310
00ac1118	b 0x00ac0ff8
00ac111c	bl 0x00c35ed0
00ac1120	mov w20,wzr
00ac1124	b 0x00ac0fc4
00ac1128	bl 0x00c342a0
00ac112c	adrp x0,0x29e000
00ac1130	adrp x2,0x2d6000
00ac1134	add x0,x0,#0x913
00ac1138	add x2,x2,#0x4d4
00ac113c	mov w1,#0x457
00ac1140	bl 0x00c342b0
00ac1144	mov w1,#0xd
00ac1148	mov w0,#0x21
00ac114c	movk w1,#0x8, LSL #16
00ac1150	b 0x00ac1074
00ac1154	mov w20,wzr
00ac1158	b 0x00ac0fc4
