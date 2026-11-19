; FUN_00afd018 @ 00afd018
00afd018	str x21,[sp, #-0x30]!
00afd01c	stp x20,x19,[sp, #0x10]
00afd020	stp x29,x30,[sp, #0x20]
00afd024	ldrb w8,[x1]
00afd028	mov x20,x1
00afd02c	mov x19,x0
00afd030	add x29,sp,#0x20
00afd034	cmp w8,#0x40
00afd038	b.ne 0x00afd080
00afd03c	add x1,x20,#0x1
00afd040	mov x0,x19
00afd044	bl 0x00c396b0
00afd048	mov x21,x0
00afd04c	cbz x0,0x00afd090
00afd050	mov x0,xzr
00afd054	mov x1,x19
00afd058	mov x2,x21
00afd05c	bl 0x00c40980
00afd060	ldrb w8,[x20]
00afd064	mov x20,x0
00afd068	cmp w8,#0x40
00afd06c	b.ne 0x00afd0c4
00afd070	mov x0,x19
00afd074	mov x1,x21
00afd078	bl 0x00c396d0
00afd07c	b 0x00afd0d4
00afd080	mov x0,x20
00afd084	bl 0x00c39680
00afd088	mov x21,x0
00afd08c	cbnz x0,0x00afd050
00afd090	bl 0x00c342a0
00afd094	adrp x0,0x2b2000
00afd098	adrp x2,0x29e000
00afd09c	add x0,x0,#0xca4
00afd0a0	add x2,x2,#0xb00
00afd0a4	orr w1,wzr,#0x38
00afd0a8	bl 0x00c342b0
00afd0ac	mov w0,#0x22
00afd0b0	mov w1,#0x96
00afd0b4	mov x2,xzr
00afd0b8	bl 0x00c342c0
00afd0bc	mov x20,xzr
00afd0c0	b 0x00afd0d4
00afd0c4	adrp x1,0xcb5000
00afd0c8	ldr x1,[x1, #0x4b0]
00afd0cc	mov x0,x21
00afd0d0	bl 0x00c32600
00afd0d4	mov x0,x20
00afd0d8	ldp x29,x30,[sp, #0x20]
00afd0dc	ldp x20,x19,[sp, #0x10]
00afd0e0	ldr x21,[sp], #0x30
00afd0e4	ret
