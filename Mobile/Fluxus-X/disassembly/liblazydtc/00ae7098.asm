; SRP_check_known_gN_param @ 00ae7098
00ae7098	str x21,[sp, #-0x30]!
00ae709c	stp x20,x19,[sp, #0x10]
00ae70a0	mov x20,x0
00ae70a4	mov x0,xzr
00ae70a8	stp x29,x30,[sp, #0x20]
00ae70ac	add x29,sp,#0x20
00ae70b0	cbz x20,0x00ae71f4
00ae70b4	mov x19,x1
00ae70b8	cbz x1,0x00ae71f4
00ae70bc	adrp x21,0xcc9000
00ae70c0	add x21,x21,#0x340
00ae70c4	ldr x0,[x21, #0x8]
00ae70c8	mov x1,x20
00ae70cc	bl 0x00c38cc0
00ae70d0	cbnz w0,0x00ae70e4
00ae70d4	ldr x0,[x21, #0x10]
00ae70d8	mov x1,x19
00ae70dc	bl 0x00c38cc0
00ae70e0	cbz w0,0x00ae71bc
00ae70e4	ldr x0,[x21, #0x20]
00ae70e8	mov x1,x20
00ae70ec	bl 0x00c38cc0
00ae70f0	cbnz w0,0x00ae7104
00ae70f4	ldr x0,[x21, #0x28]
00ae70f8	mov x1,x19
00ae70fc	bl 0x00c38cc0
00ae7100	cbz w0,0x00ae71c4
00ae7104	ldr x0,[x21, #0x38]
00ae7108	mov x1,x20
00ae710c	bl 0x00c38cc0
00ae7110	cbnz w0,0x00ae7124
00ae7114	ldr x0,[x21, #0x40]
00ae7118	mov x1,x19
00ae711c	bl 0x00c38cc0
00ae7120	cbz w0,0x00ae71cc
00ae7124	ldr x0,[x21, #0x50]
00ae7128	mov x1,x20
00ae712c	bl 0x00c38cc0
00ae7130	cbnz w0,0x00ae7144
00ae7134	ldr x0,[x21, #0x58]
00ae7138	mov x1,x19
00ae713c	bl 0x00c38cc0
00ae7140	cbz w0,0x00ae71d4
00ae7144	ldr x0,[x21, #0x68]
00ae7148	mov x1,x20
00ae714c	bl 0x00c38cc0
00ae7150	cbnz w0,0x00ae7164
00ae7154	ldr x0,[x21, #0x70]
00ae7158	mov x1,x19
00ae715c	bl 0x00c38cc0
00ae7160	cbz w0,0x00ae71dc
00ae7164	ldr x0,[x21, #0x80]
00ae7168	mov x1,x20
00ae716c	bl 0x00c38cc0
00ae7170	cbnz w0,0x00ae7184
00ae7174	ldr x0,[x21, #0x88]
00ae7178	mov x1,x19
00ae717c	bl 0x00c38cc0
00ae7180	cbz w0,0x00ae71e4
00ae7184	ldr x0,[x21, #0x98]
00ae7188	mov x1,x20
00ae718c	bl 0x00c38cc0
00ae7190	mov w8,w0
00ae7194	mov x0,xzr
00ae7198	cbnz w8,0x00ae71f4
00ae719c	ldr x0,[x21, #0xa0]
00ae71a0	mov x1,x19
00ae71a4	bl 0x00c38cc0
00ae71a8	mov w8,w0
00ae71ac	mov x0,xzr
00ae71b0	cbnz w8,0x00ae71f4
00ae71b4	orr w8,wzr,#0x6
00ae71b8	b 0x00ae71e8
00ae71bc	mov x8,xzr
00ae71c0	b 0x00ae71e8
00ae71c4	mov w8,#0x1
00ae71c8	b 0x00ae71e8
00ae71cc	mov w8,#0x2
00ae71d0	b 0x00ae71e8
00ae71d4	orr w8,wzr,#0x3
00ae71d8	b 0x00ae71e8
00ae71dc	mov w8,#0x4
00ae71e0	b 0x00ae71e8
00ae71e4	mov w8,#0x5
00ae71e8	orr w9,wzr,#0x18
00ae71ec	mul x8,x8,x9
00ae71f0	ldr x0,[x21, x8#0x0]
00ae71f4	ldp x29,x30,[sp, #0x20]
00ae71f8	ldp x20,x19,[sp, #0x10]
00ae71fc	ldr x21,[sp], #0x30
00ae7200	ret
