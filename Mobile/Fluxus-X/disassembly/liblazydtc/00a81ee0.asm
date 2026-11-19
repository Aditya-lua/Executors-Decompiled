; FUN_00a81ee0 @ 00a81ee0
00a81ee0	sub sp,sp,#0x70
00a81ee4	stp x28,x27,[sp, #0x10]
00a81ee8	stp x26,x25,[sp, #0x20]
00a81eec	stp x24,x23,[sp, #0x30]
00a81ef0	stp x22,x21,[sp, #0x40]
00a81ef4	stp x20,x19,[sp, #0x50]
00a81ef8	stp x29,x30,[sp, #0x60]
00a81efc	ldr w8,[x1, #0x8]
00a81f00	mov w9,#0x16
00a81f04	mov w27,#0x1
00a81f08	mov w22,#0x1
00a81f0c	cmp w8,#0x0
00a81f10	csinc w21,w8,wzr,ne
00a81f14	csel w26,w9,w8,eq
00a81f18	cmp w21,w26
00a81f1c	add x29,sp,#0x60
00a81f20	b.gt 0x00a82048
00a81f24	mov x19,x1
00a81f28	mov x20,x0
00a81f2c	mov w28,#0xffffffff
00a81f30	mov w22,#0x1
00a81f34	add x2,sp,#0x8
00a81f38	mov x0,x20
00a81f3c	mov w1,w21
00a81f40	str wzr,[sp, #0x8]
00a81f44	bl 0x00c3dfa0
00a81f48	ldr w24,[sp, #0x8]
00a81f4c	str wzr,[sp, #0xc]
00a81f50	ldr x8,[x19, #0x18]
00a81f54	ldr x1,[x19, #0x38]
00a81f58	mov x23,x0
00a81f5c	mov w0,w24
00a81f60	blr x8
00a81f64	cbz w0,0x00a81fc8
00a81f68	ldr x8,[x19, #0x10]
00a81f6c	cbz x8,0x00a81fd0
00a81f70	ldr x3,[x19, #0x38]
00a81f74	add x4,sp,#0xc
00a81f78	mov x0,x20
00a81f7c	mov w1,w21
00a81f80	mov w2,w24
00a81f84	blr x8
00a81f88	cbz w0,0x00a81ffc
00a81f8c	ldr w8,[sp, #0xc]
00a81f90	cbz w8,0x00a82004
00a81f94	cbz x23,0x00a81fd8
00a81f98	ldr x8,[x23]
00a81f9c	cbz x8,0x00a81fd8
00a81fa0	mov x25,x23
00a81fa4	ldr x8,[x19, #0x20]
00a81fa8	ldr x3,[x19, #0x38]
00a81fac	mov x0,x20
00a81fb0	mov x1,x25
00a81fb4	mov w2,w24
00a81fb8	blr x8
00a81fbc	ldr x8,[x25, #0x20]!
00a81fc0	cbnz x8,0x00a81fa4
00a81fc4	b 0x00a81fd8
00a81fc8	mov w24,#0xffffffff
00a81fcc	b 0x00a82018
00a81fd0	str w27,[sp, #0xc]
00a81fd4	cbnz x23,0x00a81f98
00a81fd8	ldr x8,[x19, #0x30]
00a81fdc	cbz x8,0x00a82004
00a81fe0	ldr x3,[x19, #0x38]
00a81fe4	add x4,sp,#0xc
00a81fe8	mov x0,x20
00a81fec	mov w1,w21
00a81ff0	mov w2,w24
00a81ff4	blr x8
00a81ff8	cbnz w0,0x00a82008
00a81ffc	str w28,[sp, #0xc]
00a82000	b 0x00a82008
00a82004	str w27,[sp, #0xc]
00a82008	ldr x8,[x19, #0x28]
00a8200c	ldr x0,[x19, #0x38]
00a82010	blr x8
00a82014	ldr w24,[sp, #0xc]
00a82018	mov x0,x20
00a8201c	mov w1,w21
00a82020	mov x2,x23
00a82024	bl 0x00c3dfb0
00a82028	tbnz w24,#0x1f,0x00a82044
00a8202c	cmp w24,#0x0
00a82030	csel w22,wzr,w22,eq
00a82034	cmp w21,w26
00a82038	add w21,w21,#0x1
00a8203c	b.lt 0x00a81f34
00a82040	b 0x00a82048
00a82044	mov w22,wzr
00a82048	mov w0,w22
00a8204c	ldp x29,x30,[sp, #0x60]
00a82050	ldp x20,x19,[sp, #0x50]
00a82054	ldp x22,x21,[sp, #0x40]
00a82058	ldp x24,x23,[sp, #0x30]
00a8205c	ldp x26,x25,[sp, #0x20]
00a82060	ldp x28,x27,[sp, #0x10]
00a82064	add sp,sp,#0x70
00a82068	ret
