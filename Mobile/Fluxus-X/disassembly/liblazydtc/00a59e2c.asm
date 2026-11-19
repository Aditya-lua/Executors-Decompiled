; EVP_DecodeUpdate @ 00a59e2c
00a59e2c	sub sp,sp,#0x70
00a59e30	stp x28,x27,[sp, #0x10]
00a59e34	stp x26,x25,[sp, #0x20]
00a59e38	stp x24,x23,[sp, #0x30]
00a59e3c	stp x22,x21,[sp, #0x40]
00a59e40	stp x20,x19,[sp, #0x50]
00a59e44	stp x29,x30,[sp, #0x60]
00a59e48	mov x21,x0
00a59e4c	mov x24,x3
00a59e50	ldr w3,[x21], #0x8
00a59e54	mov w23,w4
00a59e58	mov x28,x2
00a59e5c	mov x20,x0
00a59e60	cmp w3,#0x1
00a59e64	mov x22,x1
00a59e68	add x29,sp,#0x60
00a59e6c	b.lt 0x00a59fa4
00a59e70	sxtw x8,w3
00a59e74	add x9,x20,x8
00a59e78	ldrb w9,[x9, #0x7]
00a59e7c	mov w26,wzr
00a59e80	cmp w9,#0x3d
00a59e84	b.ne 0x00a59ea4
00a59e88	cmp w3,#0x2
00a59e8c	mov w26,#0x1
00a59e90	b.lt 0x00a59ea4
00a59e94	add x8,x20,x8
00a59e98	ldrb w8,[x8, #0x6]
00a59e9c	cmp w8,#0x3d
00a59ea0	cinc w26,w26,eq
00a59ea4	cbz w23,0x00a59fac
00a59ea8	ldrb w8,[x20, #0x5c]
00a59eac	adrp x9,0x766000
00a59eb0	adrp x10,0x766000
00a59eb4	add x9,x9,#0xd4
00a59eb8	add x10,x10,#0x154
00a59ebc	tst w8,#0x2
00a59ec0	csel x27,x10,x9,eq
00a59ec4	cmp w23,#0x1
00a59ec8	b.lt 0x00a59fb8
00a59ecc	str x28,[sp, #0x8]
00a59ed0	mov x28,xzr
00a59ed4	mov w25,wzr
00a59ed8	mov w19,#0x13
00a59edc	ldrsb w8,[x24, x28]
00a59ee0	tbnz w8,#0x1f,0x00a59f98
00a59ee4	and x9,x8,#0xff
00a59ee8	ldrb w9,[x27, x9]
00a59eec	cmp w9,#0xff
00a59ef0	b.eq 0x00a59f98
00a59ef4	cmp w8,#0x3d
00a59ef8	b.ne 0x00a59f7c
00a59efc	add w26,w26,#0x1
00a59f00	cmp w26,#0x2
00a59f04	b.gt 0x00a59f98
00a59f08	cmp w9,#0xf2
00a59f0c	b.eq 0x00a5a018
00a59f10	orr w9,w9,w19
00a59f14	cmp w9,#0xf3
00a59f18	b.eq 0x00a59f34
00a59f1c	cmp w3,#0x3f
00a59f20	b.gt 0x00a59f98
00a59f24	add w10,w3,#0x1
00a59f28	add x9,x20,w3, SXTW 
00a59f2c	mov w3,w10
00a59f30	strb w8,[x9, #0x8]
00a59f34	cmp w3,#0x40
00a59f38	b.ne 0x00a59f6c
00a59f3c	mov x0,x20
00a59f40	mov x1,x22
00a59f44	mov x2,x21
00a59f48	bl 0x00a5a080
00a59f4c	mov w8,w0
00a59f50	mov w0,#0xffffffff
00a59f54	tbnz w8,#0x1f,0x00a5a050
00a59f58	subs w8,w8,w26
00a59f5c	b.lt 0x00a5a050
00a59f60	mov w3,wzr
00a59f64	add w25,w8,w25
00a59f68	add x22,x22,w8, SXTW 
00a59f6c	add x28,x28,#0x1
00a59f70	cmp w28,w23
00a59f74	b.lt 0x00a59edc
00a59f78	b 0x00a5a020
00a59f7c	cmp w26,#0x1
00a59f80	b.lt 0x00a59f90
00a59f84	orr w10,w9,w19
00a59f88	cmp w10,#0xf3
00a59f8c	b.ne 0x00a59f98
00a59f90	cmp w26,#0x2
00a59f94	b.le 0x00a59f08
00a59f98	ldr x28,[sp, #0x8]
00a59f9c	mov w0,#0xffffffff
00a59fa0	b 0x00a5a058
00a59fa4	mov w26,wzr
00a59fa8	cbnz w23,0x00a59ea8
00a59fac	mov w0,wzr
00a59fb0	mov w25,wzr
00a59fb4	b 0x00a5a058
00a59fb8	mov w25,wzr
00a59fbc	mov w19,wzr
00a59fc0	cmp w3,#0x1
00a59fc4	b.lt 0x00a5a030
00a59fc8	tst w3,#0x3
00a59fcc	b.eq 0x00a59fdc
00a59fd0	cbz w19,0x00a5a038
00a59fd4	mov w0,#0xffffffff
00a59fd8	b 0x00a5a058
00a59fdc	mov x0,x20
00a59fe0	mov x1,x22
00a59fe4	mov x2,x21
00a59fe8	bl 0x00a5a080
00a59fec	mov w8,w0
00a59ff0	mov w0,#0xffffffff
00a59ff4	tbnz w8,#0x1f,0x00a5a054
00a59ff8	cmp w8,w26
00a59ffc	b.lt 0x00a5a054
00a5a000	sub w9,w25,w26
00a5a004	mov w3,wzr
00a5a008	add w25,w9,w8
00a5a00c	mov w0,wzr
00a5a010	cbnz w19,0x00a5a058
00a5a014	b 0x00a5a038
00a5a018	mov w19,#0x1
00a5a01c	b 0x00a5a024
00a5a020	mov w19,wzr
00a5a024	ldr x28,[sp, #0x8]
00a5a028	cmp w3,#0x1
00a5a02c	b.ge 0x00a59fc8
00a5a030	mov w0,wzr
00a5a034	cbnz w19,0x00a5a058
00a5a038	cmp w3,#0x0
00a5a03c	cset w8,ne
00a5a040	cmp w26,#0x0
00a5a044	cset w9,eq
00a5a048	orr w0,w9,w8
00a5a04c	b 0x00a5a058
00a5a050	ldr x28,[sp, #0x8]
00a5a054	mov w3,wzr
00a5a058	str w25,[x28]
00a5a05c	str w3,[x20]
00a5a060	ldp x29,x30,[sp, #0x60]
00a5a064	ldp x20,x19,[sp, #0x50]
00a5a068	ldp x22,x21,[sp, #0x40]
00a5a06c	ldp x24,x23,[sp, #0x30]
00a5a070	ldp x26,x25,[sp, #0x20]
00a5a074	ldp x28,x27,[sp, #0x10]
00a5a078	add sp,sp,#0x70
00a5a07c	ret
