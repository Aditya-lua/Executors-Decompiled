; FUN_00b2cf68 @ 00b2cf68
00b2cf68	sub sp,sp,#0x80
00b2cf6c	stp x28,x27,[sp, #0x20]
00b2cf70	stp x26,x25,[sp, #0x30]
00b2cf74	stp x24,x23,[sp, #0x40]
00b2cf78	stp x22,x21,[sp, #0x50]
00b2cf7c	stp x20,x19,[sp, #0x60]
00b2cf80	stp x29,x30,[sp, #0x70]
00b2cf84	ldrsb w8,[x0, #0x6c]
00b2cf88	lsl x9,x3,#0x3
00b2cf8c	add x29,sp,#0x70
00b2cf90	str x2,[sp, #0x10]
00b2cf94	cmp w8,#0x0
00b2cf98	csel x9,x9,x3,ge
00b2cf9c	cbz x9,0x00b2d050
00b2cfa0	mov x20,x0
00b2cfa4	mov x21,x1
00b2cfa8	mov x26,xzr
00b2cfac	add x22,x0,#0xc0
00b2cfb0	add x23,x0,#0x140
00b2cfb4	add x24,x0,#0x1c0
00b2cfb8	add x25,x0,#0x20
00b2cfbc	sub x27,x9,#0x1
00b2cfc0	b 0x00b2cfcc
00b2cfc4	ldrb w8,[x20, #0x6c]
00b2cfc8	add x26,x26,#0x1
00b2cfcc	ldr x9,[sp, #0x10]
00b2cfd0	lsr x28,x26,#0x3
00b2cfd4	and w19,w26,#0x7
00b2cfd8	eor w10,w19,#0x7
00b2cfdc	ldrb w9,[x9, x28]
00b2cfe0	mov w11,#0x1
00b2cfe4	lsl w10,w11,w10
00b2cfe8	ubfx w8,w8,#0x1,#0x1
00b2cfec	tst w10,w9
00b2cff0	orr w9,wzr,#0xffffff80
00b2cff4	csel w9,wzr,w9,eq
00b2cff8	add x0,sp,#0x1c
00b2cffc	add x1,sp,#0x18
00b2d000	mov w2,#0x1
00b2d004	mov w3,#0x1
00b2d008	mov x4,x22
00b2d00c	mov x5,x23
00b2d010	mov x6,x24
00b2d014	mov x7,x25
00b2d018	strb w9,[sp, #0x1c]
00b2d01c	str w8,[sp]
00b2d020	bl 0x00c399b0
00b2d024	ldrb w9,[sp, #0x18]
00b2d028	ldrb w8,[x21, x28]
00b2d02c	orr w10,wzr,#0xffffff7f
00b2d030	asr w10,w10,w19
00b2d034	and w9,w9,#0x80
00b2d038	and w8,w10,w8
00b2d03c	lsr w9,w9,w19
00b2d040	orr w8,w9,w8
00b2d044	cmp x27,x26
00b2d048	strb w8,[x21, x28]
00b2d04c	b.ne 0x00b2cfc4
00b2d050	ldp x29,x30,[sp, #0x70]
00b2d054	ldp x20,x19,[sp, #0x60]
00b2d058	ldp x22,x21,[sp, #0x50]
00b2d05c	ldp x24,x23,[sp, #0x40]
00b2d060	ldp x26,x25,[sp, #0x30]
00b2d064	ldp x28,x27,[sp, #0x20]
00b2d068	mov w0,#0x1
00b2d06c	add sp,sp,#0x80
00b2d070	ret
