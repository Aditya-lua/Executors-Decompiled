; n_ssl3_mac @ 009ceeec
009ceeec	sub sp,sp,#0xd0
009ceef0	cmp w3,#0x0
009ceef4	mov w12,#0x860
009ceef8	mov w13,#0x890
009ceefc	stp x26,x25,[sp, #0x80]
009cef00	stp x24,x23,[sp, #0x90]
009cef04	stp x22,x21,[sp, #0xa0]
009cef08	stp x20,x19,[sp, #0xb0]
009cef0c	stp x29,x30,[sp, #0xc0]
009cef10	csel x12,x13,x12,ne
009cef14	ldr x22,[x0, x12#0x0]
009cef18	mov w9,#0x1d00
009cef1c	mov w11,#0x1cf8
009cef20	mov x25,x0
009cef24	add x8,x0,#0x100
009cef28	add x10,x0,#0xb8
009cef2c	add x9,x0,x9
009cef30	add x11,x0,x11
009cef34	mov x0,x22
009cef38	str x27,[sp, #0x70]
009cef3c	add x29,sp,#0xc0
009cef40	mov w27,w3
009cef44	mov x20,x2
009cef48	mov x23,x1
009cef4c	csel x19,x9,x11,ne
009cef50	csel x21,x8,x10,ne
009cef54	bl 0x00c34c00
009cef58	bl 0x00c34c20
009cef5c	cmp w0,#0x1
009cef60	b.lt 0x009cf1c0
009cef64	orr w8,wzr,#0x30
009cef68	udiv w9,w8,w0
009cef6c	msub w9,w9,w0,w8
009cef70	sxtw x26,w0
009cef74	sub x24,x8,x9
009cef78	stur x26,[x29, #-0x58]
009cef7c	cbnz w27,0x009cf050
009cef80	ldr x0,[x25, #0x848]
009cef84	bl 0x00c34b80
009cef88	bl 0x00c35290
009cef8c	cmp w0,#0x2
009cef90	b.ne 0x009cf050
009cef94	mov x0,x22
009cef98	bl 0x00c34c00
009cef9c	bl 0x00c34c30
009cefa0	sub w8,w0,#0x2a0
009cefa4	cmp w8,#0x4
009cefa8	b.cs 0x009cf040
009cefac	add x0,sp,#0x1c
009cefb0	mov x1,x21
009cefb4	mov x2,x26
009cefb8	add x25,sp,#0x1c
009cefbc	bl 0x00c2ffd0
009cefc0	add x0,x25,x26
009cefc4	mov w1,#0x36
009cefc8	mov x2,x24
009cefcc	bl 0x00c301c0
009cefd0	ldr x8,[x19]
009cefd4	add x9,x24,x26
009cefd8	add x9,x25,x9
009cefdc	mov x0,x22
009cefe0	str x8,[x9]
009cefe4	ldr w8,[x23, #0x4]
009cefe8	strb w8,[x9, #0x8]
009cefec	ldr x8,[x23, #0x8]
009ceff0	lsr x10,x8,#0x8
009ceff4	strb w10,[x9, #0x9]
009ceff8	strb w8,[x9, #0xa]
009ceffc	bl 0x00c34c00
009cf000	ldr x4,[x23, #0x28]
009cf004	ldp x5,x6,[x23, #0x8]
009cf008	mov w8,#0x1
009cf00c	sub x2,x29,#0x58
009cf010	add x3,sp,#0x1c
009cf014	mov x1,x20
009cf018	mov x7,x21
009cf01c	strb w8,[sp, #0x8]
009cf020	str x26,[sp]
009cf024	bl 0x00c36df0
009cf028	cmp w0,#0x0
009cf02c	b.le 0x009cf1c0
009cf030	mov x0,x19
009cf034	bl 0x00c36bc0
009cf038	mov w0,#0x1
009cf03c	b 0x009cf1c4
009cf040	cmp w0,#0x40
009cf044	b.eq 0x009cefac
009cf048	cmp w0,#0x4
009cf04c	b.eq 0x009cefac
009cf050	bl 0x00c31fa0
009cf054	cbz x0,0x009cf1c4
009cf058	ldr w8,[x23, #0x4]
009cf05c	mov x1,x22
009cf060	mov x25,x0
009cf064	sturb w8,[x29, #-0x44]
009cf068	ldr x8,[x23, #0x8]
009cf06c	lsr x8,x8,#0x8
009cf070	strb w8,[x20]
009cf074	ldr x8,[x23, #0x8]
009cf078	strb w8,[x20, #0x1]
009cf07c	bl 0x00c34bf0
009cf080	cmp w0,#0x1
009cf084	b.lt 0x009cf1b8
009cf088	mov x0,x25
009cf08c	mov x1,x21
009cf090	mov x2,x26
009cf094	bl 0x00c31f80
009cf098	cmp w0,#0x1
009cf09c	b.lt 0x009cf1b8
009cf0a0	adrp x1,0x74c000
009cf0a4	add x1,x1,#0xebc
009cf0a8	mov x0,x25
009cf0ac	mov x2,x24
009cf0b0	bl 0x00c31f80
009cf0b4	cmp w0,#0x1
009cf0b8	b.lt 0x009cf1b8
009cf0bc	mov w2,#0x8
009cf0c0	mov x0,x25
009cf0c4	mov x1,x19
009cf0c8	bl 0x00c31f80
009cf0cc	cmp w0,#0x1
009cf0d0	b.lt 0x009cf1b8
009cf0d4	sub x1,x29,#0x44
009cf0d8	mov w2,#0x1
009cf0dc	mov x0,x25
009cf0e0	bl 0x00c31f80
009cf0e4	cmp w0,#0x1
009cf0e8	b.lt 0x009cf1b8
009cf0ec	mov w2,#0x2
009cf0f0	mov x0,x25
009cf0f4	mov x1,x20
009cf0f8	bl 0x00c31f80
009cf0fc	cmp w0,#0x1
009cf100	b.lt 0x009cf1b8
009cf104	ldr x1,[x23, #0x28]
009cf108	ldr x2,[x23, #0x8]
009cf10c	mov x0,x25
009cf110	bl 0x00c31f80
009cf114	cmp w0,#0x1
009cf118	b.lt 0x009cf1b8
009cf11c	mov x0,x25
009cf120	mov x1,x20
009cf124	mov x2,xzr
009cf128	bl 0x00c31f60
009cf12c	cmp w0,#0x1
009cf130	b.lt 0x009cf1b8
009cf134	mov x0,x25
009cf138	mov x1,x22
009cf13c	bl 0x00c34bf0
009cf140	cmp w0,#0x1
009cf144	b.lt 0x009cf1b8
009cf148	ldur x2,[x29, #-0x58]
009cf14c	mov x0,x25
009cf150	mov x1,x21
009cf154	bl 0x00c31f80
009cf158	cmp w0,#0x1
009cf15c	b.lt 0x009cf1b8
009cf160	adrp x1,0x74c000
009cf164	add x1,x1,#0xeec
009cf168	mov x0,x25
009cf16c	mov x2,x24
009cf170	bl 0x00c31f80
009cf174	cmp w0,#0x1
009cf178	b.lt 0x009cf1b8
009cf17c	ldur x2,[x29, #-0x58]
009cf180	mov x0,x25
009cf184	mov x1,x20
009cf188	bl 0x00c31f80
009cf18c	cmp w0,#0x1
009cf190	b.lt 0x009cf1b8
009cf194	add x2,sp,#0x1c
009cf198	mov x0,x25
009cf19c	mov x1,x20
009cf1a0	bl 0x00c31f60
009cf1a4	cmp w0,#0x0
009cf1a8	b.le 0x009cf1b8
009cf1ac	mov x0,x25
009cf1b0	bl 0x00c31f90
009cf1b4	b 0x009cf030
009cf1b8	mov x0,x25
009cf1bc	bl 0x00c31f90
009cf1c0	mov w0,wzr
009cf1c4	ldp x29,x30,[sp, #0xc0]
009cf1c8	ldp x20,x19,[sp, #0xb0]
009cf1cc	ldp x22,x21,[sp, #0xa0]
009cf1d0	ldp x24,x23,[sp, #0x90]
009cf1d4	ldp x26,x25,[sp, #0x80]
009cf1d8	ldr x27,[sp, #0x70]
009cf1dc	add sp,sp,#0xd0
009cf1e0	ret
