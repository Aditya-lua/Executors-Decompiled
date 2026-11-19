; FUN_008bcf64 @ 008bcf64
008bcf64	sub sp,sp,#0x30
008bcf68	stp x29,x30,[sp, #0x10]
008bcf6c	stp x20,x19,[sp, #0x20]
008bcf70	add x29,sp,#0x10
008bcf74	ldr w9,[x0, #0xc]
008bcf78	tbnz w9,#0x1f,0x008bcf90
008bcf7c	ldr w8,[x0, #0x8]
008bcf80	cmp w8,#0x1
008bcf84	mov w19,w8
008bcf88	b.ge 0x008bcf98
008bcf8c	b 0x008bd0f0
008bcf90	ldr w8,[x0, #0x8]
008bcf94	neg w19,w9
008bcf98	ldr x9,[x0, #0x20]
008bcf9c	add x9,x9,w8, SXTW  #0x4
008bcfa0	ldur w9,[x9, #-0x4]
008bcfa4	cbz w9,0x008bcfd8
008bcfa8	adrp x8,0xd1f000
008bcfac	add x8,x8,#0xc90
008bcfb0	ldr x9,[x0, #0x28]
008bcfb4	ldarb w8,[x8]
008bcfb8	adrp x10,0xd1f000
008bcfbc	tbz w8,#0x0,0x008bd104
008bcfc0	ldr x8,[x10, #0xc88]
008bcfc4	add x8,x8,#0x7f3, LSL #12
008bcfc8	add x10,x8,#0x700
008bcfcc	ldr w8,[x0, #0x8]
008bcfd0	cmp x9,x10
008bcfd4	b.eq 0x008bd0f0
008bcfd8	cmp w19,w8
008bcfdc	b.ge 0x008bd010
008bcfe0	ldr x11,[x0, #0x20]
008bcfe4	add x10,x11,w19, UXTW  #0x4
008bcfe8	ldur w9,[x10, #-0x4]
008bcfec	cbz w9,0x008bd000
008bcff0	mov w9,w19
008bcff4	add x9,x11,x9, LSL #0x4
008bcff8	ldr w9,[x9, #0xc]
008bcffc	cbz w9,0x008bd0ec
008bd000	sub w9,w19,#0x1
008bd004	add x11,x11,w9, UXTW  #0x4
008bd008	ldr w11,[x11, #0xc]
008bd00c	cbz w11,0x008bd058
008bd010	add w9,w19,#0x1
008bd014	cmp w9,w8
008bd018	b.ge 0x008bd04c
008bd01c	ldr x10,[x0, #0x20]
008bd020	add x11,x10,w19, UXTW  #0x4
008bd024	ldr w11,[x11, #0xc]
008bd028	cbz w11,0x008bd080
008bd02c	add x10,x10,w9, UXTW  #0x4
008bd030	ldr w10,[x10, #0xc]
008bd034	cbnz w10,0x008bd080
008bd038	ldr w8,[x0, #0xc]
008bd03c	cmp w8,#0x0
008bd040	b.gt 0x008bd0e4
008bd044	mvn w8,w19
008bd048	b 0x008bd0e0
008bd04c	cmp w8,#0x1
008bd050	b.ge 0x008bd080
008bd054	b 0x008bd0f0
008bd058	cmp w19,#0x2
008bd05c	b.cc 0x008bd080
008bd060	ldur w10,[x10, #-0x14]
008bd064	cbz w10,0x008bd080
008bd068	ldr w8,[x0, #0xc]
008bd06c	cmp w8,#0x0
008bd070	b.gt 0x008bd0e4
008bd074	mov w8,#0x1
008bd078	sub w8,w8,w19
008bd07c	b 0x008bd0e0
008bd080	ldr x9,[x0, #0x20]
008bd084	add x10,x9,w8, UXTW  #0x4
008bd088	ldur w10,[x10, #-0x4]
008bd08c	cbnz w10,0x008bd0f0
008bd090	mov x10,x9
008bd094	cmp w8,#0x1
008bd098	b.eq 0x008bd0bc
008bd09c	asr w11,w8,#0x1
008bd0a0	add x12,x10,w11, SXTW  #0x4
008bd0a4	sub w8,w8,w11
008bd0a8	ldr w13,[x12, #0xc]
008bd0ac	cmp w13,#0x0
008bd0b0	csel x10,x10,x12,eq
008bd0b4	cmp w8,#0x1
008bd0b8	b.hi 0x008bd09c
008bd0bc	ldr w8,[x10, #0xc]
008bd0c0	sub x9,x10,x9
008bd0c4	ldr w10,[x0, #0xc]
008bd0c8	lsr x9,x9,#0x4
008bd0cc	cmp w8,#0x0
008bd0d0	cinc w9,w9,ne
008bd0d4	cmp w10,#0x0
008bd0d8	b.gt 0x008bd0e4
008bd0dc	neg w8,w9
008bd0e0	str w8,[x0, #0xc]
008bd0e4	mov w8,w9
008bd0e8	b 0x008bd0f0
008bd0ec	mov w8,w19
008bd0f0	mov w0,w8
008bd0f4	ldp x20,x19,[sp, #0x20]
008bd0f8	ldp x29,x30,[sp, #0x10]
008bd0fc	add sp,sp,#0x30
008bd100	ret
008bd104	adrp x8,0xd1f000
008bd108	add x8,x8,#0xc90
008bd10c	stp x9,x0,[sp]
008bd110	mov x0,x8
008bd114	bl 0x00c2fe90
008bd118	mov w8,w0
008bd11c	ldp x9,x0,[sp]
008bd120	adrp x10,0xd1f000
008bd124	cbz w8,0x008bcfc0
008bd128	adrp x8,0xcca000
008bd12c	ldr x0,[x8, #0x8c8]
008bd130	bl 0x007fe1ec
008bd134	adrp x20,0xd1f000
008bd138	str x0,[x20, #0xc88]
008bd13c	adrp x0,0xd1f000
008bd140	add x0,x0,#0xc90
008bd144	bl 0x00c2fea0
008bd148	ldp x9,x0,[sp]
008bd14c	mov x10,x20
008bd150	b 0x008bcfc0
