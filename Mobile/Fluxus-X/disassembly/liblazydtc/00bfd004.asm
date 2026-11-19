; std::__ndk1::ctype_byname<char>::ctype_byname @ 00bfd004
00bfd004	paciasp
00bfd008	sub sp,sp,#0x50
00bfd00c	stp x29,x30,[sp, #0x30]
00bfd010	stp x20,x19,[sp, #0x40]
00bfd014	add x29,sp,#0x30
00bfd018	strb wzr,[x0, #0x18]
00bfd01c	adrp x9,0xcb5000
00bfd020	mov x20,x1
00bfd024	ldr x9,[x9, #0xe20]
00bfd028	mov x19,x0
00bfd02c	sub x8,x2,#0x1
00bfd030	adrp x10,0x78a000
00bfd034	add x10,x10,#0x8e8
00bfd038	add x9,x9,#0x10
00bfd03c	stp x8,x10,[x0, #0x8]
00bfd040	str x9,[x0]
00bfd044	mov w0,#0x1fbf
00bfd048	mov x2,xzr
00bfd04c	bl 0x00c43890
00bfd050	str x0,[x19, #0x20]
00bfd054	cbz x0,0x00bfd06c
00bfd058	ldp x20,x19,[sp, #0x40]
00bfd05c	ldp x29,x30,[sp, #0x30]
00bfd060	add sp,sp,#0x50
00bfd064	autiasp
00bfd068	ret
00bfd06c	mov x0,sp
00bfd070	mov x1,x20
00bfd074	bl 0x00852d7c
00bfd078	adrp x0,0x2c4000
00bfd07c	add x0,x0,#0x99c
00bfd080	add x8,sp,#0x18
00bfd084	mov x1,sp
00bfd088	add x20,sp,#0x18
00bfd08c	bl 0x00bfb964
00bfd090	ldrb w8,[sp, #0x18]
00bfd094	ldr x9,[sp, #0x28]
00bfd098	tst w8,#0x1
00bfd09c	csinc x0,x9,x20,ne
00bfd0a0	bl 0x00c43d00
00bfd0a4	ldrb w8,[sp, #0x18]
00bfd0a8	mov x20,x0
00bfd0ac	tbz w8,#0x0,0x00bfd0c8
00bfd0b0	ldr x8,[sp, #0x18]
00bfd0b4	ldr x0,[sp, #0x28]
00bfd0b8	and x1,x8,#-0x2
00bfd0bc	bl 0x00c2fe80
00bfd0c0	b 0x00bfd0c8
00bfd0c8	ldrb w8,[sp]
00bfd0cc	tbz w8,#0x0,0x00bfd0ec
00bfd0d0	ldr x8,[sp]
00bfd0d4	ldr x0,[sp, #0x10]
00bfd0d8	and x1,x8,#-0x2
00bfd0dc	bl 0x00c2fe80
00bfd0e0	b 0x00bfd0ec
00bfd0ec	mov x0,x19
00bfd0f0	bl 0x00c444b0
00bfd0f4	mov x0,x20
00bfd0f8	bl 0x00c2c090
