; FUN_00ac6ed4 @ 00ac6ed4
00ac6ed4	stp x28,x27,[sp, #-0x60]!
00ac6ed8	stp x26,x25,[sp, #0x10]
00ac6edc	stp x24,x23,[sp, #0x20]
00ac6ee0	stp x22,x21,[sp, #0x30]
00ac6ee4	stp x20,x19,[sp, #0x40]
00ac6ee8	stp x29,x30,[sp, #0x50]
00ac6eec	add x29,sp,#0x50
00ac6ef0	mov x21,x3
00ac6ef4	mov x19,x2
00ac6ef8	mov x20,x1
00ac6efc	mov x23,x0
00ac6f00	bl 0x00c2ff50
00ac6f04	ldr x8,[x21]
00ac6f08	mov x22,x0
00ac6f0c	mov w25,wzr
00ac6f10	add x8,x8,x0
00ac6f14	str x8,[x21]
00ac6f18	cbz x0,0x00ac6f74
00ac6f1c	mov w24,#0x27
00ac6f20	mov w26,#0x22
00ac6f24	mov x27,x22
00ac6f28	mov x28,x23
00ac6f2c	b 0x00ac6f58
00ac6f30	ldrb w8,[x28]
00ac6f34	cmp w8,#0x2e
00ac6f38	b.eq 0x00ac6f68
00ac6f3c	cmp w8,#0x5f
00ac6f40	b.eq 0x00ac6f68
00ac6f44	tst w25,#0xff
00ac6f48	csel w9,w24,w25,eq
00ac6f4c	cmp w8,#0x27
00ac6f50	csel w25,w26,w9,eq
00ac6f54	b 0x00ac6f68
00ac6f58	ldrb w0,[x28]
00ac6f5c	orr w1,wzr,#0x7
00ac6f60	bl 0x00c377c0
00ac6f64	cbz w0,0x00ac6f30
00ac6f68	subs x27,x27,#0x1
00ac6f6c	add x28,x28,#0x1
00ac6f70	b.ne 0x00ac6f58
00ac6f74	ldr x8,[x19]
00ac6f78	cbz x8,0x00ac7044
00ac6f7c	tst w25,#0xff
00ac6f80	b.eq 0x00ac6fb8
00ac6f84	ldr x9,[x20]
00ac6f88	cmp x8,#0x1
00ac6f8c	csel w8,wzr,w25,eq
00ac6f90	strb w8,[x9]
00ac6f94	ldr x8,[x20]
00ac6f98	add x8,x8,#0x1
00ac6f9c	str x8,[x20]
00ac6fa0	ldr x8,[x21]
00ac6fa4	add x8,x8,#0x1
00ac6fa8	str x8,[x21]
00ac6fac	ldr x8,[x19]
00ac6fb0	sub x8,x8,#0x1
00ac6fb4	str x8,[x19]
00ac6fb8	tst w25,#0xff
00ac6fbc	cinc x9,x22,ne
00ac6fc0	add x9,x9,#0x1
00ac6fc4	sub x10,x8,#0x1
00ac6fc8	cmp x8,x9
00ac6fcc	csel x24,x10,x22,cc
00ac6fd0	cbz x24,0x00ac6ffc
00ac6fd4	ldr x0,[x20]
00ac6fd8	mov x1,x23
00ac6fdc	mov x2,x24
00ac6fe0	bl 0x00c2ffd0
00ac6fe4	ldr x8,[x20]
00ac6fe8	add x8,x8,x24
00ac6fec	str x8,[x20]
00ac6ff0	ldr x8,[x19]
00ac6ff4	sub x8,x8,x24
00ac6ff8	str x8,[x19]
00ac6ffc	tst w25,#0xff
00ac7000	b.eq 0x00ac706c
00ac7004	cbz x8,0x00ac705c
00ac7008	cmp x8,#0x1
00ac700c	mov w8,wzr
00ac7010	b.eq 0x00ac7018
00ac7014	mov w8,w25
00ac7018	ldr x9,[x20]
00ac701c	strb w8,[x9]
00ac7020	ldr x8,[x20]
00ac7024	add x8,x8,#0x1
00ac7028	str x8,[x20]
00ac702c	ldr x8,[x21]
00ac7030	add x8,x8,#0x1
00ac7034	str x8,[x21]
00ac7038	mov x8,#-0x1
00ac703c	mov x21,x19
00ac7040	b 0x00ac7060
00ac7044	ldr x8,[x21]
00ac7048	tst w25,#0xff
00ac704c	cset w9,ne
00ac7050	add x8,x8,w9, UXTW  #0x1
00ac7054	str x8,[x21]
00ac7058	b 0x00ac70a0
00ac705c	mov w8,#0x1
00ac7060	ldr x9,[x21]
00ac7064	add x8,x9,x8
00ac7068	str x8,[x21]
00ac706c	cmp x24,x22
00ac7070	b.cs 0x00ac70a0
00ac7074	ldr x8,[x19]
00ac7078	cmp x8,#0x1
00ac707c	b.ne 0x00ac70a0
00ac7080	ldr x8,[x20]
00ac7084	strb wzr,[x8]
00ac7088	ldr x8,[x20]
00ac708c	add x8,x8,#0x1
00ac7090	str x8,[x20]
00ac7094	ldr x8,[x19]
00ac7098	sub x8,x8,#0x1
00ac709c	str x8,[x19]
00ac70a0	ldp x29,x30,[sp, #0x50]
00ac70a4	ldp x20,x19,[sp, #0x40]
00ac70a8	ldp x22,x21,[sp, #0x30]
00ac70ac	ldp x24,x23,[sp, #0x20]
00ac70b0	ldp x26,x25,[sp, #0x10]
00ac70b4	ldp x28,x27,[sp], #0x60
00ac70b8	ret
