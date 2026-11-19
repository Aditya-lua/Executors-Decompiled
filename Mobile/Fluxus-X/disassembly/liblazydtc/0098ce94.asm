; ix::WebSocket::~WebSocket @ 0098ce94
0098ce94	sub sp,sp,#0x80
0098ce98	str x23,[sp, #0x40]
0098ce9c	stp x22,x21,[sp, #0x50]
0098cea0	stp x20,x19,[sp, #0x60]
0098cea4	stp x29,x30,[sp, #0x70]
0098cea8	add x29,sp,#0x70
0098ceac	mrs x21,tpidr_el0
0098ceb0	ldr x8,[x21, #0x28]
0098ceb4	mov x19,x0
0098ceb8	str x8,[sp, #0x38]
0098cebc	adrp x8,0xcb4000
0098cec0	ldr x8,[x8, #0xa40]
0098cec4	adrp x2,0xcb4000
0098cec8	ldrh w1,[x8]
0098cecc	ldr x2,[x2, #0xa48]
0098ced0	mov x3,xzr
0098ced4	mov w4,wzr
0098ced8	bl 0x00c33890
0098cedc	ldr x8,[x19, #0x408]
0098cee0	add x20,x19,#0x408
0098cee4	cbz x8,0x0098cf08
0098cee8	add x22,x19,#0x400
0098ceec	mov w8,#0x1
0098cef0	add x0,x19,#0x46c
0098cef4	stlrb w8,[x22]
0098cef8	bl 0x00c315f0
0098cefc	mov x0,x20
0098cf00	bl 0x00c31920
0098cf04	stlrb wzr,[x22]
0098cf08	str xzr,[sp, #0x20]
0098cf0c	mov x1,sp
0098cf10	mov x0,x19
0098cf14	mov x22,sp
0098cf18	bl 0x00c33870
0098cf1c	ldr x0,[sp, #0x20]
0098cf20	cmp x22,x0
0098cf24	b.eq 0x0098cf38
0098cf28	cbz x0,0x0098cf44
0098cf2c	ldr x8,[x0]
0098cf30	ldr x8,[x8, #0x28]
0098cf34	b 0x0098cf40
0098cf38	ldr x8,[x0]
0098cf3c	ldr x8,[x8, #0x20]
0098cf40	blr x8
0098cf44	ldr x22,[x19, #0x4d0]
0098cf48	cbz x22,0x0098cf8c
0098cf4c	ldr x8,[x19, #0x4d8]
0098cf50	cmp x8,x22
0098cf54	b.eq 0x0098cf80
0098cf58	mov x23,x8
0098cf5c	ldrb w9,[x23, #-0x18]!
0098cf60	tbz w9,#0x0,0x0098cf6c
0098cf64	ldur x0,[x8, #-0x8]
0098cf68	bl 0x00c301d0
0098cf6c	cmp x22,x23
0098cf70	mov x8,x23
0098cf74	b.ne 0x0098cf5c
0098cf78	ldr x0,[x19, #0x4d0]
0098cf7c	b 0x0098cf84
0098cf80	mov x0,x22
0098cf84	str x22,[x19, #0x4d8]
0098cf88	bl 0x00c301d0
0098cf8c	ldrb w8,[x19, #0x4b0]
0098cf90	tbz w8,#0x0,0x0098cf9c
0098cf94	ldr x0,[x19, #0x4c0]
0098cf98	bl 0x00c301d0
0098cf9c	add x0,x19,#0x46c
0098cfa0	bl 0x00c31600
0098cfa4	add x0,x19,#0x444
0098cfa8	bl 0x00c2fee0
0098cfac	add x0,x19,#0x410
0098cfb0	bl 0x00c2fee0
0098cfb4	mov x0,x20
0098cfb8	bl 0x00c2ff80
0098cfbc	ldr x0,[x19, #0x3f0]
0098cfc0	add x8,x19,#0x3d0
0098cfc4	cmp x8,x0
0098cfc8	b.eq 0x0098cfdc
0098cfcc	cbz x0,0x0098cfe8
0098cfd0	ldr x8,[x0]
0098cfd4	ldr x8,[x8, #0x28]
0098cfd8	b 0x0098cfe4
0098cfdc	ldr x8,[x0]
0098cfe0	ldr x8,[x8, #0x20]
0098cfe4	blr x8
0098cfe8	add x0,x19,#0x3a0
0098cfec	bl 0x00c2fee0
0098cff0	ldrb w8,[x19, #0x380]
0098cff4	tbnz w8,#0x0,0x0098d06c
0098cff8	ldrb w8,[x19, #0x360]
0098cffc	tbnz w8,#0x0,0x0098d07c
0098d000	ldrb w8,[x19, #0x348]
0098d004	tbnz w8,#0x0,0x0098d08c
0098d008	ldrb w8,[x19, #0x330]
0098d00c	tbnz w8,#0x0,0x0098d09c
0098d010	ldrb w8,[x19, #0x318]
0098d014	tbz w8,#0x0,0x0098d020
0098d018	ldr x0,[x19, #0x328]
0098d01c	bl 0x00c301d0
0098d020	ldr x1,[x19, #0x300]
0098d024	add x0,x19,#0x2f8
0098d028	bl 0x00c32fc0
0098d02c	ldrb w8,[x19, #0x2e0]
0098d030	tbz w8,#0x0,0x0098d03c
0098d034	ldr x0,[x19, #0x2f0]
0098d038	bl 0x00c301d0
0098d03c	mov x0,x19
0098d040	bl 0x00c338f0
0098d044	ldr x8,[x21, #0x28]
0098d048	ldr x9,[sp, #0x38]
0098d04c	cmp x8,x9
0098d050	b.ne 0x0098d0b0
0098d054	ldp x29,x30,[sp, #0x70]
0098d058	ldp x20,x19,[sp, #0x60]
0098d05c	ldp x22,x21,[sp, #0x50]
0098d060	ldr x23,[sp, #0x40]
0098d064	add sp,sp,#0x80
0098d068	ret
0098d06c	ldr x0,[x19, #0x390]
0098d070	bl 0x00c301d0
0098d074	ldrb w8,[x19, #0x360]
0098d078	tbz w8,#0x0,0x0098d000
0098d07c	ldr x0,[x19, #0x370]
0098d080	bl 0x00c301d0
0098d084	ldrb w8,[x19, #0x348]
0098d088	tbz w8,#0x0,0x0098d008
0098d08c	ldr x0,[x19, #0x358]
0098d090	bl 0x00c301d0
0098d094	ldrb w8,[x19, #0x330]
0098d098	tbz w8,#0x0,0x0098d010
0098d09c	ldr x0,[x19, #0x340]
0098d0a0	bl 0x00c301d0
0098d0a4	ldrb w8,[x19, #0x318]
0098d0a8	tbnz w8,#0x0,0x0098d018
0098d0ac	b 0x0098d020
0098d0b0	bl 0x00c2fec0
