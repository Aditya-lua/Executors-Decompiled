; ossl_statem_server_construct_message @ 009e6fb0
009e6fb0	str x19,[sp, #-0x20]!
009e6fb4	stp x29,x30,[sp, #0x10]
009e6fb8	ldr w8,[x0, #0x5c]
009e6fbc	mov x19,x0
009e6fc0	add x29,sp,#0x10
009e6fc4	sub w8,w8,#0x13
009e6fc8	cmp w8,#0x1b
009e6fcc	b.hi 0x009e6ff0
009e6fd0	adrp x9,0x74d000
009e6fd4	add x9,x9,#0xbd4
009e6fd8	ldrsw x8,[x9, x8, LSL #0x2]
009e6fdc	add x8,x8,x9
009e6fe0	br x8
009e6fe4	str xzr,[x2]
009e6fe8	str wzr,[x3]
009e6fec	b 0x009e7130
009e6ff0	bl 0x00c342a0
009e6ff4	adrp x0,0x2bd000
009e6ff8	adrp x2,0x2c1000
009e6ffc	add x0,x0,#0x74c
009e7000	add x2,x2,#0x9c5
009e7004	mov w1,#0x401
009e7008	bl 0x00c342b0
009e700c	mov w1,#0x50
009e7010	mov w2,#0xec
009e7014	mov x0,x19
009e7018	mov x3,xzr
009e701c	bl 0x00c34410
009e7020	mov w0,wzr
009e7024	b 0x009e7134
009e7028	adrp x8,0xcb5000
009e702c	ldr x8,[x8, #0x2c0]
009e7030	orr w9,wzr,#0x3
009e7034	b 0x009e7128
009e7038	adrp x8,0xcb5000
009e703c	ldr x8,[x8, #0x2f0]
009e7040	mov w9,#0x2
009e7044	b 0x009e7128
009e7048	adrp x8,0xcb5000
009e704c	ldr x8,[x8, #0x2e0]
009e7050	mov w9,#0xb
009e7054	b 0x009e7128
009e7058	adrp x8,0xcb5000
009e705c	ldr x8,[x8, #0x2f8]
009e7060	orr w9,wzr,#0xc
009e7064	b 0x009e7128
009e7068	adrp x8,0xcb5000
009e706c	ldr x8,[x8, #0x2d0]
009e7070	mov w9,#0xd
009e7074	b 0x009e7128
009e7078	adrp x8,0xcb5000
009e707c	ldr x8,[x8, #0x2e8]
009e7080	orr w9,wzr,#0xe
009e7084	b 0x009e7128
009e7088	adrp x8,0xcb5000
009e708c	ldr x8,[x8, #0x2d8]
009e7090	mov w9,#0x4
009e7094	b 0x009e7128
009e7098	ldr x8,[x19, #0x8]
009e709c	adrp x9,0xcb5000
009e70a0	adrp x10,0xcb5000
009e70a4	mov w11,#0x101
009e70a8	ldr x8,[x8, #0xc0]
009e70ac	ldr w8,[x8, #0x60]
009e70b0	ldr x9,[x9, #0x268]
009e70b4	ldr x10,[x10, #0x278]
009e70b8	tst w8,#0x8
009e70bc	csel x8,x10,x9,eq
009e70c0	str x8,[x2]
009e70c4	str w11,[x3]
009e70c8	b 0x009e7130
009e70cc	adrp x8,0xcb5000
009e70d0	ldr x8,[x8, #0x2a0]
009e70d4	mov w9,#0x14
009e70d8	b 0x009e7128
009e70dc	adrp x8,0x9e8000
009e70e0	add x8,x8,#0xd10
009e70e4	mov w9,#0x8
009e70e8	b 0x009e7128
009e70ec	adrp x8,0xcb5000
009e70f0	ldr x8,[x8, #0x270]
009e70f4	orr w9,wzr,#0xf
009e70f8	b 0x009e7128
009e70fc	adrp x8,0xcb5000
009e7100	ldr x8,[x8, #0x2a8]
009e7104	orr w9,wzr,#0x18
009e7108	b 0x009e7128
009e710c	mov w8,#0xffffffff
009e7110	str xzr,[x2]
009e7114	str w8,[x3]
009e7118	b 0x009e7130
009e711c	adrp x8,0xcb5000
009e7120	ldr x8,[x8, #0x2c8]
009e7124	mov w9,#0x16
009e7128	str x8,[x2]
009e712c	str w9,[x3]
009e7130	mov w0,#0x1
009e7134	ldp x29,x30,[sp, #0x10]
009e7138	ldr x19,[sp], #0x20
009e713c	ret
