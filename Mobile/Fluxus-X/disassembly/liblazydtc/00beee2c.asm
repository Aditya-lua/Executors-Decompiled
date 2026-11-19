; std::__ndk1::__money_get<char>::__gather_info @ 00beee2c
00beee2c	paciasp
00beee30	sub sp,sp,#0x80
00beee34	stp x29,x30,[sp, #0x20]
00beee38	str x27,[sp, #0x30]
00beee3c	stp x26,x25,[sp, #0x40]
00beee40	stp x24,x23,[sp, #0x50]
00beee44	stp x22,x21,[sp, #0x60]
00beee48	stp x20,x19,[sp, #0x70]
00beee4c	add x29,sp,#0x20
00beee50	ldr x26,[x29, #0x60]
00beee54	ldr x21,[x1]
00beee58	mov x24,x7
00beee5c	mov x19,x6
00beee60	mov x20,x5
00beee64	mov x22,x4
00beee68	mov x23,x3
00beee6c	mov x25,x2
00beee70	tbz w0,#0x0,0x00beeea8
00beee74	adrp x27,0xcb5000
00beee78	ldr x27,[x27, #0xc20]
00beee7c	stur x27,[x29, #-0x8]
00beee80	ldar x8,[x27]
00beee84	cmn x8,#0x1
00beee88	b.eq 0x00beeee8
00beee8c	sub x8,x29,#0x8
00beee90	mov x9,sp
00beee94	adrp x0,0xcb5000
00beee98	str x8,[sp]
00beee9c	str x9,[x29, #0x18]
00beeea0	ldr x0,[x0, #0xc20]
00beeea4	b 0x00beeed8
00beeea8	adrp x27,0xcb5000
00beeeac	ldr x27,[x27, #0xc28]
00beeeb0	stur x27,[x29, #-0x8]
00beeeb4	ldar x8,[x27]
00beeeb8	cmn x8,#0x1
00beeebc	b.eq 0x00beeee8
00beeec0	sub x8,x29,#0x8
00beeec4	mov x9,sp
00beeec8	adrp x0,0xcb5000
00beeecc	str x8,[sp]
00beeed0	str x9,[x29, #0x18]
00beeed4	ldr x0,[x0, #0xc28]
00beeed8	nop
00beeedc	adr x2,0xc0bab0
00beeee0	add x1,x29,#0x18
00beeee4	bl 0x00c305d0
00beeee8	ldp x8,x10,[x21, #0x10]
00beeeec	ldrsw x9,[x27, #0x8]
00beeef0	sub x9,x9,#0x1
00beeef4	sub x10,x10,x8
00beeef8	cmp x9,x10, ASR #0x3
00beeefc	b.cs 0x00bef070
00beef00	ldr x21,[x8, x9, LSL #0x3]
00beef04	cbz x21,0x00bef070
00beef08	ldr x8,[x21]
00beef0c	mov x0,x21
00beef10	ldr x8,[x8, #0x58]
00beef14	blr x8
00beef18	str w0,[x25]
00beef1c	mov x0,x21
00beef20	ldr x8,[x21]
00beef24	ldr x9,[x8, #0x40]
00beef28	mov x8,sp
00beef2c	blr x9
00beef30	ldrb w8,[x26]
00beef34	tbz w8,#0x0,0x00beef48
00beef38	ldr x8,[x26]
00beef3c	ldr x0,[x26, #0x10]
00beef40	and x1,x8,#-0x2
00beef44	bl 0x00c2fe80
00beef48	ldr q0,[sp]
00beef4c	ldr x8,[sp, #0x10]
00beef50	mov x0,x21
00beef54	str q0,[x26]
00beef58	str x8,[x26, #0x10]
00beef5c	ldr x8,[x21]
00beef60	ldr x9,[x8, #0x38]
00beef64	mov x8,sp
00beef68	blr x9
00beef6c	ldrb w8,[x24]
00beef70	tbz w8,#0x0,0x00beef84
00beef74	ldr x8,[x24]
00beef78	ldr x0,[x24, #0x10]
00beef7c	and x1,x8,#-0x2
00beef80	bl 0x00c2fe80
00beef84	ldr q0,[sp]
00beef88	ldr x8,[sp, #0x10]
00beef8c	mov x0,x21
00beef90	str q0,[x24]
00beef94	str x8,[x24, #0x10]
00beef98	ldr x8,[x21]
00beef9c	ldr x8,[x8, #0x18]
00beefa0	blr x8
00beefa4	strb w0,[x23]
00beefa8	mov x0,x21
00beefac	ldr x8,[x21]
00beefb0	ldr x8,[x8, #0x20]
00beefb4	blr x8
00beefb8	strb w0,[x22]
00beefbc	mov x0,x21
00beefc0	ldr x8,[x21]
00beefc4	ldr x9,[x8, #0x28]
00beefc8	mov x8,sp
00beefcc	blr x9
00beefd0	ldrb w8,[x20]
00beefd4	tbz w8,#0x0,0x00beefe8
00beefd8	ldr x8,[x20]
00beefdc	ldr x0,[x20, #0x10]
00beefe0	and x1,x8,#-0x2
00beefe4	bl 0x00c2fe80
00beefe8	ldr q0,[sp]
00beefec	ldr x8,[sp, #0x10]
00beeff0	mov x0,x21
00beeff4	str q0,[x20]
00beeff8	str x8,[x20, #0x10]
00beeffc	ldr x8,[x21]
00bef000	ldr x9,[x8, #0x30]
00bef004	mov x8,sp
00bef008	blr x9
00bef00c	ldrb w8,[x19]
00bef010	tbz w8,#0x0,0x00bef024
00bef014	ldr x8,[x19]
00bef018	ldr x0,[x19, #0x10]
00bef01c	and x1,x8,#-0x2
00bef020	bl 0x00c2fe80
00bef024	ldr q0,[sp]
00bef028	ldr x8,[sp, #0x10]
00bef02c	mov x0,x21
00bef030	str q0,[x19]
00bef034	str x8,[x19, #0x10]
00bef038	ldr x19,[x29, #0x68]
00bef03c	ldr x8,[x21]
00bef040	ldr x8,[x8, #0x48]
00bef044	blr x8
00bef048	str w0,[x19]
00bef04c	ldp x20,x19,[sp, #0x70]
00bef050	ldr x27,[sp, #0x30]
00bef054	ldp x22,x21,[sp, #0x60]
00bef058	ldp x24,x23,[sp, #0x50]
00bef05c	ldp x26,x25,[sp, #0x40]
00bef060	ldp x29,x30,[sp, #0x20]
00bef064	add sp,sp,#0x80
00bef068	autiasp
00bef06c	ret
00bef070	bl 0x00bd8968
