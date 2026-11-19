; FUN_008cadd4 @ 008cadd4
008cadd4	sub sp,sp,#0x70
008cadd8	stp x29,x30,[sp, #0x10]
008caddc	stp x28,x27,[sp, #0x20]
008cade0	stp x26,x25,[sp, #0x30]
008cade4	stp x24,x23,[sp, #0x40]
008cade8	stp x22,x21,[sp, #0x50]
008cadec	stp x20,x19,[sp, #0x60]
008cadf0	add x29,sp,#0x10
008cadf4	adrp x26,0xcb4000
008cadf8	ldr w8,[x1, #0xc]
008cadfc	mov w27,#0x2ef0
008cae00	ldr x26,[x26, #0xbe8]
008cae04	mov x19,x3
008cae08	mov x20,x2
008cae0c	mov x22,x1
008cae10	mov x21,x0
008cae14	mov w25,#0x64
008cae18	adrp x23,0xcca000
008cae1c	adrp x28,0xd1f000
008cae20	movk w27,#0x7f, LSL #16
008cae24	cmp w8,#0x6
008cae28	b.ne 0x008caea4
008cae2c	ldr x24,[x22]
008cae30	mov x1,x20
008cae34	mov x0,x24
008cae38	bl 0x008bb604
008cae3c	adrp x8,0xd1f000
008cae40	add x8,x8,#0x1e0
008cae44	ldarb w8,[x8]
008cae48	tbz w8,#0x0,0x008caf04
008cae4c	ldr x8,[x28, #0x1d8]
008cae50	add x8,x8,x27
008cae54	cmp x0,x8
008cae58	b.eq 0x008cae6c
008cae5c	ldr x8,[x24, #0x28]
008cae60	sub x8,x0,x8
008cae64	lsr x8,x8,#0x5
008cae68	str w8,[x21, #0x2c]
008cae6c	ldr w8,[x0, #0xc]
008cae70	cbnz w8,0x008caf40
008cae74	ldr x0,[x24, #0x10]
008cae78	cbz x0,0x008cb020
008cae7c	ldrb w8,[x0, #0x6]
008cae80	tbnz w8,#0x0,0x008cb020
008cae84	ldrb w8,[x0, #0x7]
008cae88	tbnz w8,#0x1,0x008caef8
008cae8c	ldr x8,[x21, #0x60]
008cae90	mov w1,wzr
008cae94	ldr x2,[x8, #0x338]
008cae98	bl 0x008bdfe0
008cae9c	cbnz x0,0x008caed8
008caea0	b 0x008cb020
008caea4	ldrb w9,[x26]
008caea8	cmp w9,#0x1
008caeac	b.ne 0x008caec0
008caeb0	cmp w8,#0xc
008caeb4	b.eq 0x008caf98
008caeb8	cmp w8,#0xb
008caebc	b.eq 0x008cafe8
008caec0	mov x0,x21
008caec4	mov x1,x22
008caec8	mov w2,wzr
008caecc	bl 0x008be028
008caed0	ldr w8,[x0, #0xc]
008caed4	cbz w8,0x008cb028
008caed8	mov x2,x0
008caedc	ldr w8,[x2, #0xc]
008caee0	cmp w8,#0x7
008caee4	b.eq 0x008caf68
008caee8	subs w25,w25,#0x1
008caeec	mov x22,x2
008caef0	b.ne 0x008cae24
008caef4	b 0x008cb038
008caef8	ldr x8,[x0, #0x20]
008caefc	sub x2,x8,#0x10
008caf00	b 0x008caedc
008caf04	str x0,[sp, #0x8]
008caf08	adrp x0,0xd1f000
008caf0c	add x0,x0,#0x1e0
008caf10	bl 0x00c2fe90
008caf14	mov w8,w0
008caf18	ldr x0,[sp, #0x8]
008caf1c	cbz w8,0x008cae4c
008caf20	ldr x0,[x23, #0x8c8]
008caf24	bl 0x007fe1ec
008caf28	str x0,[x28, #0x1d8]
008caf2c	adrp x0,0xd1f000
008caf30	add x0,x0,#0x1e0
008caf34	bl 0x00c2fea0
008caf38	ldr x0,[sp, #0x8]
008caf3c	b 0x008cae4c
008caf40	ldr q0,[x0]
008caf44	str q0,[x19]
008caf48	ldp x20,x19,[sp, #0x60]
008caf4c	ldp x22,x21,[sp, #0x50]
008caf50	ldp x24,x23,[sp, #0x40]
008caf54	ldp x26,x25,[sp, #0x30]
008caf58	ldp x28,x27,[sp, #0x20]
008caf5c	ldp x29,x30,[sp, #0x10]
008caf60	add sp,sp,#0x70
008caf64	ret
008caf68	mov x0,x21
008caf6c	mov x1,x19
008caf70	mov x3,x22
008caf74	mov x4,x20
008caf78	ldp x20,x19,[sp, #0x60]
008caf7c	ldp x22,x21,[sp, #0x50]
008caf80	ldp x24,x23,[sp, #0x40]
008caf84	ldp x26,x25,[sp, #0x30]
008caf88	ldp x28,x27,[sp, #0x20]
008caf8c	ldp x29,x30,[sp, #0x10]
008caf90	add sp,sp,#0x70
008caf94	b 0x008cb070
008caf98	ldr x23,[x22]
008caf9c	mov x1,x20
008cafa0	ldr x8,[x23, #0x10]
008cafa4	ldr x0,[x8, #0x38]
008cafa8	bl 0x008bb604
008cafac	ldr w8,[x0, #0xc]
008cafb0	cbz w8,0x008cb048
008cafb4	ldr d0,[x0]
008cafb8	ldr x9,[x23, #0x10]
008cafbc	add x11,x23,#0x20
008cafc0	fcvtzu w8,d0
008cafc4	ldr w10,[x9, #0x58]
008cafc8	add x9,x9,#0x28
008cafcc	cmp w10,w8
008cafd0	csel x9,x11,x9,hi
008cafd4	csel w10,wzr,w10,hi
008cafd8	ldr x9,[x9]
008cafdc	sub w8,w8,w10
008cafe0	ldr q0,[x9,w8, uxtw #4]
008cafe4	b 0x008caf44
008cafe8	ldr x23,[x22]
008cafec	mov x1,x20
008caff0	ldr x0,[x23, #0x38]
008caff4	bl 0x008bb604
008caff8	ldr w8,[x0, #0xc]
008caffc	cbz w8,0x008cb048
008cb000	ldr d0,[x0]
008cb004	ldr w9,[x23, #0x58]
008cb008	fcvtzu w8,d0
008cb00c	subs w8,w8,w9
008cb010	b.cc 0x008cb048
008cb014	ldr x9,[x23, #0x28]
008cb018	ldr q0,[x9,w8, uxtw #4]
008cb01c	b 0x008caf44
008cb020	str wzr,[x19, #0xc]
008cb024	b 0x008caf48
008cb028	mov x0,x21
008cb02c	mov x1,x22
008cb030	mov x2,x20
008cb034	bl 0x008b3be4
008cb038	adrp x1,0x2be000
008cb03c	add x1,x1,#0xfe5
008cb040	mov x0,x21
008cb044	bl 0x008b39cc
008cb048	mov x0,x21
008cb04c	mov x1,x22
008cb050	mov x2,x20
008cb054	bl 0x008b3c58
008cb058	mov x19,x0
008cb05c	adrp x0,0xd1f000
008cb060	add x0,x0,#0x1e0
008cb064	bl 0x00c2feb0
008cb068	mov x0,x19
008cb06c	bl 0x00c2c090
