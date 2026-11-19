; FUN_009fae58 @ 009fae58
009fae58	str x28,[sp, #-0x40]!
009fae5c	stp x22,x21,[sp, #0x10]
009fae60	stp x20,x19,[sp, #0x20]
009fae64	stp x29,x30,[sp, #0x30]
009fae68	add x29,sp,#0x30
009fae6c	sub sp,sp,#0x430
009fae70	mov x19,x3
009fae74	mov x20,x2
009fae78	mov w22,w1
009fae7c	mov x21,x0
009fae80	bl 0x00c385b0
009fae84	cmp w0,#0x1
009fae88	mov w0,wzr
009fae8c	b.ne 0x009fb08c
009fae90	add x0,sp,#0x2c
009fae94	mov w2,#0x401
009fae98	mov w1,wzr
009fae9c	bl 0x00c301c0
009faea0	movi v0.2D,#0x0
009faea4	stur q0,[sp, #0x18]
009faea8	stur q0,[sp, #0x8]
009faeac	ldrh w8,[x21]
009faeb0	cmp w22,#0x0
009faeb4	mov w9,#0xa
009faeb8	csel w6,wzr,w9,eq
009faebc	cmp w8,#0x1
009faec0	b.eq 0x009faedc
009faec4	cmp w8,#0x2
009faec8	b.eq 0x009faee4
009faecc	cmp w8,#0xa
009faed0	b.ne 0x009faeec
009faed4	orr w1,wzr,#0x1c
009faed8	b 0x009faef0
009faedc	mov w1,#0x6e
009faee0	b 0x009faef0
009faee4	mov w1,#0x10
009faee8	b 0x009faef0
009faeec	orr w1,wzr,#0x70
009faef0	add x2,sp,#0x2c
009faef4	mov w3,#0x401
009faef8	add x4,sp,#0x8
009faefc	mov w5,#0x20
009faf00	mov x0,x21
009faf04	bl 0x00c385c0
009faf08	cbz w0,0x009faf4c
009faf0c	mov w22,w0
009faf10	bl 0x00c342a0
009faf14	adrp x0,0x2cd000
009faf18	adrp x2,0x2d5000
009faf1c	add x0,x0,#0x866
009faf20	add x2,x2,#0xac3
009faf24	cmp w22,#0xb
009faf28	b.ne 0x009faf6c
009faf2c	orr w1,wzr,#0xe0
009faf30	bl 0x00c342b0
009faf34	bl 0x00c30710
009faf38	ldr w1,[x0]
009faf3c	adrp x2,0x2cd000
009faf40	add x2,x2,#0x87c
009faf44	mov w0,#0x2
009faf48	b 0x009fb084
009faf4c	ldrb w8,[sp, #0x8]
009faf50	cbnz w8,0x009fafac
009faf54	ldrh w8,[x21]
009faf58	orr w8,w8,#0x8
009faf5c	cmp w8,#0xa
009faf60	b.ne 0x009faf90
009faf64	ldrh w8,[x21, #0x2]
009faf68	b 0x009faf94
009faf6c	mov w1,#0xe5
009faf70	bl 0x00c342b0
009faf74	mov w0,w22
009faf78	bl 0x00c33610
009faf7c	mov w1,#0x2
009faf80	mov x2,x0
009faf84	mov w0,#0x20
009faf88	movk w1,#0x8, LSL #16
009faf8c	b 0x009fb084
009faf90	mov w8,wzr
009faf94	adrp x2,0x2c6000
009faf98	rev16 w3,w8
009faf9c	add x2,x2,#0xd41
009fafa0	add x0,sp,#0x8
009fafa4	mov w1,#0x20
009fafa8	bl 0x00c34d30
009fafac	cbz x20,0x009fafc8
009fafb0	adrp x1,0x2cd000
009fafb4	add x1,x1,#0x866
009fafb8	add x0,sp,#0x2c
009fafbc	mov w2,#0xf6
009fafc0	bl 0x00c34600
009fafc4	str x0,[x20]
009fafc8	cbz x19,0x009fafe4
009fafcc	adrp x1,0x2cd000
009fafd0	add x1,x1,#0x866
009fafd4	add x0,sp,#0x8
009fafd8	orr w2,wzr,#0xf8
009fafdc	bl 0x00c34600
009fafe0	str x0,[x19]
009fafe4	cbz x20,0x009faff0
009fafe8	ldr x8,[x20]
009fafec	cbz x8,0x009fb004
009faff0	cbz x19,0x009faffc
009faff4	ldr x8,[x19]
009faff8	cbz x8,0x009fb024
009faffc	mov w0,#0x1
009fb000	b 0x009fb08c
009fb004	adrp x1,0x2cd000
009fb008	add x1,x1,#0x866
009fb00c	mov w2,#0x107
009fb010	mov x0,xzr
009fb014	bl 0x00c32310
009fb018	str xzr,[x20]
009fb01c	cbnz x19,0x009fb040
009fb020	b 0x009fb058
009fb024	cbz x20,0x009fb040
009fb028	ldr x0,[x20]
009fb02c	adrp x1,0x2cd000
009fb030	add x1,x1,#0x866
009fb034	mov w2,#0x107
009fb038	bl 0x00c32310
009fb03c	str xzr,[x20]
009fb040	ldr x0,[x19]
009fb044	adrp x1,0x2cd000
009fb048	add x1,x1,#0x866
009fb04c	mov w2,#0x10b
009fb050	bl 0x00c32310
009fb054	str xzr,[x19]
009fb058	bl 0x00c342a0
009fb05c	adrp x0,0x2cd000
009fb060	adrp x2,0x2d5000
009fb064	add x0,x0,#0x866
009fb068	add x2,x2,#0xac3
009fb06c	mov w1,#0x10e
009fb070	bl 0x00c342b0
009fb074	mov w1,#0x100
009fb078	mov w0,#0x20
009fb07c	movk w1,#0xc, LSL #16
009fb080	mov x2,xzr
009fb084	bl 0x00c342c0
009fb088	mov w0,wzr
009fb08c	add sp,sp,#0x430
009fb090	ldp x29,x30,[sp, #0x30]
009fb094	ldp x20,x19,[sp, #0x20]
009fb098	ldp x22,x21,[sp, #0x10]
009fb09c	ldr x28,[sp], #0x40
009fb0a0	ret
