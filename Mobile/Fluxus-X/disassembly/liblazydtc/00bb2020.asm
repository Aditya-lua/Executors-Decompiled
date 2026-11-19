; ZSTD_DCtx_loadDictionary_advanced @ 00bb2020
00bb2020	sub sp,sp,#0x70
00bb2024	stp x29,x30,[sp, #0x20]
00bb2028	str x25,[sp, #0x30]
00bb202c	stp x24,x23,[sp, #0x40]
00bb2030	stp x22,x21,[sp, #0x50]
00bb2034	stp x20,x19,[sp, #0x60]
00bb2038	add x29,sp,#0x20
00bb203c	mrs x23,tpidr_el0
00bb2040	add x24,x0,#0x7, LSL #12
00bb2044	ldr x8,[x23, #0x28]
00bb2048	stur x8,[x29, #-0x8]
00bb204c	ldr w8,[x24, #0x61c]
00bb2050	cbz w8,0x00bb2084
00bb2054	mov x0,#-0x3c
00bb2058	ldr x8,[x23, #0x28]
00bb205c	ldur x9,[x29, #-0x8]
00bb2060	cmp x8,x9
00bb2064	b.ne 0x00bb210c
00bb2068	ldp x20,x19,[sp, #0x60]
00bb206c	ldr x25,[sp, #0x30]
00bb2070	ldp x22,x21,[sp, #0x50]
00bb2074	ldp x24,x23,[sp, #0x40]
00bb2078	ldp x29,x30,[sp, #0x20]
00bb207c	add sp,sp,#0x70
00bb2080	ret
00bb2084	mov x19,x0
00bb2088	ldr x0,[x0, #0x75e8]
00bb208c	mov x21,x1
00bb2090	mov x25,x2
00bb2094	mov w22,w3
00bb2098	mov w20,w4
00bb209c	bl 0x00c435b0
00bb20a0	movi v0.2D,#0x0
00bb20a4	mov x0,xzr
00bb20a8	mov w8,#0x75e8
00bb20ac	str wzr,[x24, #0x600]
00bb20b0	str q0,[x19,x8]
00bb20b4	cbz x21,0x00bb2058
00bb20b8	cbz x25,0x00bb2058
00bb20bc	ldr q0,[x19, #0x75b0]
00bb20c0	ldr x8,[x19, #0x75c0]
00bb20c4	mov x1,x25
00bb20c8	mov x4,sp
00bb20cc	mov x0,x21
00bb20d0	mov w2,w22
00bb20d4	mov w3,w20
00bb20d8	str q0,[sp]
00bb20dc	str x8,[sp, #0x10]
00bb20e0	bl 0x00c435a0
00bb20e4	str x0,[x19, #0x75e8]
00bb20e8	cbz x0,0x00bb2104
00bb20ec	mov x8,x0
00bb20f0	mov x0,xzr
00bb20f4	str x8,[x19, #0x75f0]
00bb20f8	mov w8,#0xffffffff
00bb20fc	str w8,[x24, #0x600]
00bb2100	b 0x00bb2058
00bb2104	mov x0,#-0x40
00bb2108	b 0x00bb2058
00bb210c	bl 0x00c2fec0
