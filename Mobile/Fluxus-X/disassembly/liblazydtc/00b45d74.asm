; FUN_00b45d74 @ 00b45d74
00b45d74	stp x24,x23,[sp, #-0x40]!
00b45d78	stp x22,x21,[sp, #0x10]
00b45d7c	stp x20,x19,[sp, #0x20]
00b45d80	stp x29,x30,[sp, #0x30]
00b45d84	mov x19,x0
00b45d88	ldr x0,[x0]
00b45d8c	add x29,sp,#0x30
00b45d90	mov x21,x1
00b45d94	bl 0x00c41210
00b45d98	cbz x21,0x00b4605c
00b45d9c	add x20,x19,#0x10
00b45da0	mov x5,x0
00b45da4	mov x0,x20
00b45da8	mov x1,x21
00b45dac	mov x2,xzr
00b45db0	mov x3,xzr
00b45db4	mov x4,xzr
00b45db8	bl 0x00c41180
00b45dbc	cbz w0,0x00b46094
00b45dc0	ldr x0,[x20]
00b45dc4	cbz x0,0x00b45df4
00b45dc8	bl 0x00c3d790
00b45dcc	adrp x1,0x2c3000
00b45dd0	add x1,x1,#0x5d3
00b45dd4	bl 0x00c3d7c0
00b45dd8	cbnz w0,0x00b45df4
00b45ddc	ldr x0,[x20]
00b45de0	bl 0x00c3d790
00b45de4	adrp x1,0x2bd000
00b45de8	add x1,x1,#0xb6e
00b45dec	bl 0x00c3d7c0
00b45df0	cbz w0,0x00b46064
00b45df4	adrp x1,0x2d7000
00b45df8	add x1,x1,#0xa76
00b45dfc	mov x0,x21
00b45e00	bl 0x00c36530
00b45e04	cbz x0,0x00b45e6c
00b45e08	ldp x1,x2,[x0, #0x10]
00b45e0c	mov x22,x0
00b45e10	adrp x0,0x2a2000
00b45e14	add x0,x0,#0x226
00b45e18	bl 0x00c35ef0
00b45e1c	cbz w0,0x00b45e5c
00b45e20	ldp x1,x2,[x22, #0x10]
00b45e24	adrp x0,0x2a4000
00b45e28	add x0,x0,#0xf37
00b45e2c	bl 0x00c35ef0
00b45e30	cbz w0,0x00b45e64
00b45e34	bl 0x00c342a0
00b45e38	adrp x0,0x2cc000
00b45e3c	adrp x2,0x2c0000
00b45e40	add x0,x0,#0x6ff
00b45e44	add x2,x2,#0x930
00b45e48	mov w1,#0x134
00b45e4c	bl 0x00c342b0
00b45e50	mov w0,#0x39
00b45e54	mov w1,#0x7d
00b45e58	b 0x00b46088
00b45e5c	mov w8,wzr
00b45e60	b 0x00b45e68
00b45e64	mov w8,#0x1
00b45e68	str w8,[x19, #0x8]
00b45e6c	adrp x1,0x2c5000
00b45e70	add x1,x1,#0x67e
00b45e74	mov x0,x21
00b45e78	bl 0x00c36530
00b45e7c	cbz x0,0x00b45ed0
00b45e80	ldr x8,[x0, #0x10]
00b45e84	mov x22,x0
00b45e88	cbz x8,0x00b45ed0
00b45e8c	ldr x8,[x22, #0x18]
00b45e90	cbz x8,0x00b45ed0
00b45e94	add x23,x19,#0x18
00b45e98	add x24,x19,#0x20
00b45e9c	ldr x0,[x23]
00b45ea0	ldr x1,[x24]
00b45ea4	adrp x2,0x2cc000
00b45ea8	add x2,x2,#0x6ff
00b45eac	mov w3,#0x112
00b45eb0	bl 0x00c345e0
00b45eb4	mov x0,x22
00b45eb8	mov x1,x23
00b45ebc	mov x2,xzr
00b45ec0	mov x3,x24
00b45ec4	str xzr,[x23]
00b45ec8	bl 0x00c3ace0
00b45ecc	cbz w0,0x00b46094
00b45ed0	adrp x1,0x2a7000
00b45ed4	add x1,x1,#0xb6c
00b45ed8	mov x0,x21
00b45edc	bl 0x00c36530
00b45ee0	cbz x0,0x00b45f34
00b45ee4	ldr x8,[x0, #0x10]
00b45ee8	mov x22,x0
00b45eec	cbz x8,0x00b45f34
00b45ef0	ldr x8,[x22, #0x18]
00b45ef4	cbz x8,0x00b45f34
00b45ef8	add x23,x19,#0x28
00b45efc	add x24,x19,#0x30
00b45f00	ldr x0,[x23]
00b45f04	ldr x1,[x24]
00b45f08	adrp x2,0x2cc000
00b45f0c	add x2,x2,#0x6ff
00b45f10	mov w3,#0x112
00b45f14	bl 0x00c345e0
00b45f18	mov x0,x22
00b45f1c	mov x1,x23
00b45f20	mov x2,xzr
00b45f24	mov x3,x24
00b45f28	str xzr,[x23]
00b45f2c	bl 0x00c3ace0
00b45f30	cbz w0,0x00b46094
00b45f34	adrp x1,0x29e000
00b45f38	add x1,x1,#0x225
00b45f3c	mov x0,x21
00b45f40	bl 0x00c36530
00b45f44	cbz x0,0x00b45f98
00b45f48	ldr x8,[x0, #0x10]
00b45f4c	mov x22,x0
00b45f50	cbz x8,0x00b45f98
00b45f54	ldr x8,[x22, #0x18]
00b45f58	cbz x8,0x00b45f98
00b45f5c	add x23,x19,#0x38
00b45f60	add x24,x19,#0x40
00b45f64	ldr x0,[x23]
00b45f68	ldr x1,[x24]
00b45f6c	adrp x2,0x2cc000
00b45f70	add x2,x2,#0x6ff
00b45f74	mov w3,#0x112
00b45f78	bl 0x00c345e0
00b45f7c	mov x0,x22
00b45f80	mov x1,x23
00b45f84	mov x2,xzr
00b45f88	mov x3,x24
00b45f8c	str xzr,[x23]
00b45f90	bl 0x00c3ace0
00b45f94	cbz w0,0x00b46094
00b45f98	adrp x1,0x2bb000
00b45f9c	add x1,x1,#0x864
00b45fa0	mov x0,x21
00b45fa4	bl 0x00c36530
00b45fa8	cbz x0,0x00b45ffc
00b45fac	ldr x8,[x0, #0x10]
00b45fb0	mov x22,x0
00b45fb4	cbz x8,0x00b45ffc
00b45fb8	ldr x8,[x22, #0x18]
00b45fbc	cbz x8,0x00b45ffc
00b45fc0	add x23,x19,#0x48
00b45fc4	add x24,x19,#0x50
00b45fc8	ldr x0,[x23]
00b45fcc	ldr x1,[x24]
00b45fd0	adrp x2,0x2cc000
00b45fd4	add x2,x2,#0x6ff
00b45fd8	mov w3,#0x112
00b45fdc	bl 0x00c345e0
00b45fe0	mov x0,x22
00b45fe4	mov x1,x23
00b45fe8	mov x2,xzr
00b45fec	mov x3,x24
00b45ff0	str xzr,[x23]
00b45ff4	bl 0x00c3ace0
00b45ff8	cbz w0,0x00b46094
00b45ffc	adrp x1,0x2da000
00b46000	add x1,x1,#0xc48
00b46004	mov x0,x21
00b46008	bl 0x00c36530
00b4600c	cbz x0,0x00b4601c
00b46010	add x1,x19,#0x58
00b46014	bl 0x00c36510
00b46018	cbz w0,0x00b46094
00b4601c	adrp x1,0x2b3000
00b46020	add x1,x1,#0x0
00b46024	mov x0,x21
00b46028	bl 0x00c36530
00b4602c	cbz x0,0x00b4603c
00b46030	add x1,x19,#0x5c
00b46034	bl 0x00c36510
00b46038	cbz w0,0x00b46094
00b4603c	ldr x0,[x20]
00b46040	cbz x0,0x00b4605c
00b46044	ldr x2,[x19, #0x20]
00b46048	cbz x2,0x00b4605c
00b4604c	ldr x1,[x19, #0x18]
00b46050	mov x3,xzr
00b46054	bl 0x00c363d0
00b46058	cbz w0,0x00b46094
00b4605c	mov w0,#0x1
00b46060	b 0x00b46094
00b46064	bl 0x00c342a0
00b46068	adrp x0,0x2cc000
00b4606c	adrp x2,0x2c0000
00b46070	add x0,x0,#0x6ff
00b46074	add x2,x2,#0x930
00b46078	mov w1,#0x128
00b4607c	bl 0x00c342b0
00b46080	mov w0,#0x39
00b46084	mov w1,#0x97
00b46088	mov x2,xzr
00b4608c	bl 0x00c342c0
00b46090	mov w0,wzr
00b46094	ldp x29,x30,[sp, #0x30]
00b46098	ldp x20,x19,[sp, #0x20]
00b4609c	ldp x22,x21,[sp, #0x10]
00b460a0	ldp x24,x23,[sp], #0x40
00b460a4	ret
