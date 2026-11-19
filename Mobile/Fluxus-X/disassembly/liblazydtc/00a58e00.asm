; EVP_MD_CTX_ctrl @ 00a58e00
00a58e00	sub sp,sp,#0xc0
00a58e04	stp x22,x21,[sp, #0x90]
00a58e08	stp x20,x19,[sp, #0xa0]
00a58e0c	mov w21,w2
00a58e10	mov w22,w1
00a58e14	mov x19,x0
00a58e18	add x0,sp,#0x30
00a58e1c	mov w2,#0x50
00a58e20	mov w1,wzr
00a58e24	stp x29,x30,[sp, #0xb0]
00a58e28	add x29,sp,#0xb0
00a58e2c	mov x20,x3
00a58e30	bl 0x00c301c0
00a58e34	cbz x19,0x00a58e80
00a58e38	ldr x8,[x19, #0x8]
00a58e3c	cbz x8,0x00a58e48
00a58e40	ldr x9,[x8, #0x70]
00a58e44	cbz x9,0x00a58ec8
00a58e48	cmp w22,#0x2
00a58e4c	b.eq 0x00a58ef0
00a58e50	cmp w22,#0x1d
00a58e54	b.eq 0x00a58f6c
00a58e58	cmp w22,#0x3
00a58e5c	b.ne 0x00a58eb0
00a58e60	sxtw x8,w21
00a58e64	adrp x0,0x2b4000
00a58e68	stur x8,[x29, #-0x28]
00a58e6c	add x0,x0,#0x231
00a58e70	add x8,sp,#0x8
00a58e74	sub x1,x29,#0x28
00a58e78	bl 0x00c36270
00a58e7c	b 0x00a58f84
00a58e80	bl 0x00c342a0
00a58e84	adrp x0,0x2b7000
00a58e88	adrp x2,0x2ac000
00a58e8c	add x0,x0,#0xc61
00a58e90	add x2,x2,#0xbc
00a58e94	mov w1,#0x32f
00a58e98	bl 0x00c342b0
00a58e9c	mov w1,#0x102
00a58ea0	orr w0,wzr,#0x6
00a58ea4	movk w1,#0xc, LSL #16
00a58ea8	mov x2,xzr
00a58eac	bl 0x00c342c0
00a58eb0	mov w0,wzr
00a58eb4	ldp x29,x30,[sp, #0xb0]
00a58eb8	ldp x20,x19,[sp, #0xa0]
00a58ebc	ldp x22,x21,[sp, #0x90]
00a58ec0	add sp,sp,#0xc0
00a58ec4	ret
00a58ec8	ldr x8,[x8, #0x50]
00a58ecc	cbz x8,0x00a58ff0
00a58ed0	mov x0,x19
00a58ed4	mov w1,w22
00a58ed8	mov w2,w21
00a58edc	mov x3,x20
00a58ee0	blr x8
00a58ee4	cmp w0,#0x0
00a58ee8	b.gt 0x00a58eb4
00a58eec	b 0x00a58eb0
00a58ef0	sxtw x8,w21
00a58ef4	cmp w21,#0x0
00a58ef8	mov w9,#0x270f
00a58efc	adrp x0,0x2bb000
00a58f00	csel x2,x9,x8,eq
00a58f04	add x0,x0,#0xc20
00a58f08	add x8,sp,#0x8
00a58f0c	mov x1,x20
00a58f10	bl 0x00c36280
00a58f14	ldr x8,[sp, #0x28]
00a58f18	ldur q0,[sp, #0x18]
00a58f1c	ldur q1,[sp, #0x8]
00a58f20	str x8,[sp, #0x50]
00a58f24	stp q1,q0,[sp, #0x30]
00a58f28	ldr x8,[x19, #0x28]
00a58f2c	cbz x8,0x00a58f58
00a58f30	ldr w9,[x8]
00a58f34	cmp w9,#0x100
00a58f38	b.eq 0x00a58f44
00a58f3c	cmp w9,#0x80
00a58f40	b.ne 0x00a58f58
00a58f44	ldr x0,[x8, #0x30]
00a58f48	cbz x0,0x00a58f58
00a58f4c	ldr x8,[x8, #0x28]
00a58f50	ldr x8,[x8, #0xd8]
00a58f54	cbnz x8,0x00a58fdc
00a58f58	ldr x8,[x19, #0x8]
00a58f5c	cbz x8,0x00a58eb0
00a58f60	ldr x8,[x8, #0xd0]
00a58f64	cbnz x8,0x00a58fd8
00a58f68	b 0x00a58eb0
00a58f6c	adrp x0,0x2b3000
00a58f70	sxtw x2,w21
00a58f74	add x0,x0,#0xc71
00a58f78	add x8,sp,#0x8
00a58f7c	mov x1,x20
00a58f80	bl 0x00c34c50
00a58f84	ldr x8,[sp, #0x28]
00a58f88	ldur q0,[sp, #0x18]
00a58f8c	ldur q1,[sp, #0x8]
00a58f90	str x8,[sp, #0x50]
00a58f94	stp q1,q0,[sp, #0x30]
00a58f98	ldr x8,[x19, #0x28]
00a58f9c	cbz x8,0x00a58fc8
00a58fa0	ldr w9,[x8]
00a58fa4	cmp w9,#0x100
00a58fa8	b.eq 0x00a58fb4
00a58fac	cmp w9,#0x80
00a58fb0	b.ne 0x00a58fc8
00a58fb4	ldr x0,[x8, #0x30]
00a58fb8	cbz x0,0x00a58fc8
00a58fbc	ldr x8,[x8, #0x28]
00a58fc0	ldr x8,[x8, #0xe8]
00a58fc4	cbnz x8,0x00a58fdc
00a58fc8	ldr x8,[x19, #0x8]
00a58fcc	cbz x8,0x00a58eb0
00a58fd0	ldr x8,[x8, #0xc8]
00a58fd4	cbz x8,0x00a58eb0
00a58fd8	ldr x0,[x19, #0x38]
00a58fdc	add x1,sp,#0x30
00a58fe0	blr x8
00a58fe4	cmp w0,#0x0
00a58fe8	b.gt 0x00a58eb4
00a58fec	b 0x00a58eb0
00a58ff0	bl 0x00c342a0
00a58ff4	adrp x0,0x2b7000
00a58ff8	adrp x2,0x2ac000
00a58ffc	add x0,x0,#0xc61
00a59000	add x2,x2,#0xbc
00a59004	mov w1,#0x352
00a59008	bl 0x00c342b0
00a5900c	orr w0,wzr,#0x6
00a59010	mov w1,#0x84
00a59014	b 0x00a58ea8
