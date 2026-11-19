; X509_TRUST_add @ 00b0cea8
00b0cea8	sub sp,sp,#0x80
00b0ceac	sub w8,w0,#0x1
00b0ceb0	stp x26,x25,[sp, #0x30]
00b0ceb4	stp x24,x23,[sp, #0x40]
00b0ceb8	stp x22,x21,[sp, #0x50]
00b0cebc	stp x20,x19,[sp, #0x60]
00b0cec0	mov x20,x5
00b0cec4	mov w21,w4
00b0cec8	mov x25,x3
00b0cecc	mov x22,x2
00b0ced0	mov w23,w0
00b0ced4	cmp w8,#0x7
00b0ced8	mov w24,w1
00b0cedc	stp x29,x30,[sp, #0x70]
00b0cee0	add x29,sp,#0x70
00b0cee4	b.hi 0x00b0cf90
00b0cee8	adrp x9,0xcc9000
00b0ceec	add x9,x9,#0xbf8
00b0cef0	mov w10,#0x28
00b0cef4	mov w26,wzr
00b0cef8	smaddl x19,w8,w10,x9
00b0cefc	ldrb w8,[x19, #0x4]
00b0cf00	tbz w8,#0x1,0x00b0cf18
00b0cf04	ldr x0,[x19, #0x10]
00b0cf08	adrp x1,0x2b4000
00b0cf0c	add x1,x1,#0xb27
00b0cf10	mov w2,#0x94
00b0cf14	bl 0x00c32310
00b0cf18	adrp x1,0x2b4000
00b0cf1c	add x1,x1,#0xb27
00b0cf20	mov w2,#0x96
00b0cf24	mov x0,x25
00b0cf28	bl 0x00c34600
00b0cf2c	str x0,[x19, #0x10]
00b0cf30	cbz x0,0x00b0d00c
00b0cf34	ldr w9,[x19, #0x4]
00b0cf38	and w8,w24,#0xfffffffc
00b0cf3c	str x22,[x19, #0x8]
00b0cf40	str w21,[x19, #0x18]
00b0cf44	and w9,w9,#0x1
00b0cf48	orr w8,w8,w9
00b0cf4c	orr w8,w8,#0x2
00b0cf50	stp w23,w8,[x19]
00b0cf54	str x20,[x19, #0x20]
00b0cf58	cbz w26,0x00b0cf88
00b0cf5c	adrp x20,0xd22000
00b0cf60	ldr x0,[x20, #0x7e8]
00b0cf64	cbnz x0,0x00b0cf7c
00b0cf68	adrp x0,0xb0d000
00b0cf6c	add x0,x0,#0x110
00b0cf70	bl 0x00c35340
00b0cf74	str x0,[x20, #0x7e8]
00b0cf78	cbz x0,0x00b0d098
00b0cf7c	mov x1,x19
00b0cf80	bl 0x00c347a0
00b0cf84	cbz w0,0x00b0d07c
00b0cf88	mov w0,#0x1
00b0cf8c	b 0x00b0d0f4
00b0cf90	adrp x19,0xd22000
00b0cf94	ldr x0,[x19, #0x7e8]
00b0cf98	cbz x0,0x00b0cfdc
00b0cf9c	add x1,sp,#0x8
00b0cfa0	str w23,[sp, #0x8]
00b0cfa4	bl 0x00c34760
00b0cfa8	tbnz w0,#0x1f,0x00b0cfdc
00b0cfac	mov w1,w0
00b0cfb0	add w8,w0,#0x8
00b0cfb4	tbnz w8,#0x1f,0x00b0cfdc
00b0cfb8	cmp w8,#0x7
00b0cfbc	b.le 0x00b0cee8
00b0cfc0	ldr x0,[x19, #0x7e8]
00b0cfc4	bl 0x00c32610
00b0cfc8	mov x19,x0
00b0cfcc	mov w26,wzr
00b0cfd0	ldrb w8,[x19, #0x4]
00b0cfd4	tbnz w8,#0x1,0x00b0cf04
00b0cfd8	b 0x00b0cf18
00b0cfdc	adrp x1,0x2b4000
00b0cfe0	add x1,x1,#0xb27
00b0cfe4	mov w0,#0x28
00b0cfe8	mov w2,#0x8a
00b0cfec	bl 0x00c32320
00b0cff0	cbz x0,0x00b0d048
00b0cff4	mov w26,#0x1
00b0cff8	mov x19,x0
00b0cffc	str w26,[x0, #0x4]
00b0d000	ldrb w8,[x19, #0x4]
00b0d004	tbnz w8,#0x1,0x00b0cf04
00b0d008	b 0x00b0cf18
00b0d00c	bl 0x00c342a0
00b0d010	adrp x0,0x2b4000
00b0d014	adrp x2,0x2dc000
00b0d018	add x0,x0,#0xb27
00b0d01c	add x2,x2,#0xb8b
00b0d020	mov w1,#0x97
00b0d024	bl 0x00c342b0
00b0d028	mov w1,#0x100
00b0d02c	mov w0,#0xb
00b0d030	movk w1,#0xc, LSL #16
00b0d034	mov x2,xzr
00b0d038	bl 0x00c342c0
00b0d03c	mov w0,wzr
00b0d040	cbnz w26,0x00b0d0c8
00b0d044	b 0x00b0d0f4
00b0d048	bl 0x00c342a0
00b0d04c	adrp x0,0x2b4000
00b0d050	adrp x2,0x2dc000
00b0d054	add x0,x0,#0xb27
00b0d058	add x2,x2,#0xb8b
00b0d05c	mov w1,#0x8b
00b0d060	bl 0x00c342b0
00b0d064	mov w1,#0x100
00b0d068	mov w0,#0xb
00b0d06c	movk w1,#0xc, LSL #16
00b0d070	mov x2,xzr
00b0d074	bl 0x00c342c0
00b0d078	b 0x00b0d0f0
00b0d07c	bl 0x00c342a0
00b0d080	adrp x0,0x2b4000
00b0d084	adrp x2,0x2dc000
00b0d088	add x0,x0,#0xb27
00b0d08c	add x2,x2,#0xb8b
00b0d090	mov w1,#0xac
00b0d094	b 0x00b0d0b0
00b0d098	bl 0x00c342a0
00b0d09c	adrp x0,0x2b4000
00b0d0a0	adrp x2,0x2dc000
00b0d0a4	add x0,x0,#0xb27
00b0d0a8	add x2,x2,#0xb8b
00b0d0ac	mov w1,#0xa8
00b0d0b0	bl 0x00c342b0
00b0d0b4	mov w1,#0x100
00b0d0b8	mov w0,#0xb
00b0d0bc	movk w1,#0xc, LSL #16
00b0d0c0	mov x2,xzr
00b0d0c4	bl 0x00c342c0
00b0d0c8	ldr x0,[x19, #0x10]
00b0d0cc	adrp x20,0x2b4000
00b0d0d0	add x20,x20,#0xb27
00b0d0d4	mov w2,#0xb3
00b0d0d8	mov x1,x20
00b0d0dc	bl 0x00c32310
00b0d0e0	mov w2,#0xb4
00b0d0e4	mov x0,x19
00b0d0e8	mov x1,x20
00b0d0ec	bl 0x00c32310
00b0d0f0	mov w0,wzr
00b0d0f4	ldp x29,x30,[sp, #0x70]
00b0d0f8	ldp x20,x19,[sp, #0x60]
00b0d0fc	ldp x22,x21,[sp, #0x50]
00b0d100	ldp x24,x23,[sp, #0x40]
00b0d104	ldp x26,x25,[sp, #0x30]
00b0d108	add sp,sp,#0x80
00b0d10c	ret
