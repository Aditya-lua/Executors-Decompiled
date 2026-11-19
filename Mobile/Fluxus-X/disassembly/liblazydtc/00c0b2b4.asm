; FUN_00c0b2b4 @ 00c0b2b4
00c0b2b4	paciasp
00c0b2b8	stp x29,x30,[sp, #-0x20]!
00c0b2bc	str x19,[sp, #0x10]
00c0b2c0	mov x29,sp
00c0b2c4	adrp x8,0xcb5000
00c0b2c8	mov x19,x0
00c0b2cc	ldr x8,[x8, #0xe00]
00c0b2d0	ldrb w9,[x0, #0x60]
00c0b2d4	add x8,x8,#0x10
00c0b2d8	str x8,[x0]
00c0b2dc	tbnz w9,#0x0,0x00c0b31c
00c0b2e0	ldrb w8,[x19, #0x48]
00c0b2e4	tbnz w8,#0x0,0x00c0b338
00c0b2e8	ldrb w8,[x19, #0x30]
00c0b2ec	tbnz w8,#0x0,0x00c0b354
00c0b2f0	ldrb w8,[x19, #0x18]
00c0b2f4	tbz w8,#0x0,0x00c0b308
00c0b2f8	ldr x8,[x19, #0x18]
00c0b2fc	ldr x0,[x19, #0x28]
00c0b300	and x1,x8,#-0x2
00c0b304	bl 0x00c2fe80
00c0b308	mov x0,x19
00c0b30c	ldr x19,[sp, #0x10]
00c0b310	ldp x29,x30,[sp], #0x20
00c0b314	autiasp
00c0b318	b 0x00c31530
00c0b31c	ldr x8,[x19, #0x60]
00c0b320	ldr x0,[x19, #0x70]
00c0b324	lsl x8,x8,#0x2
00c0b328	and x1,x8,#-0x8
00c0b32c	bl 0x00c2fe80
00c0b330	ldrb w8,[x19, #0x48]
00c0b334	tbz w8,#0x0,0x00c0b2e8
00c0b338	ldr x8,[x19, #0x48]
00c0b33c	ldr x0,[x19, #0x58]
00c0b340	lsl x8,x8,#0x2
00c0b344	and x1,x8,#-0x8
00c0b348	bl 0x00c2fe80
00c0b34c	ldrb w8,[x19, #0x30]
00c0b350	tbz w8,#0x0,0x00c0b2f0
00c0b354	ldr x8,[x19, #0x30]
00c0b358	ldr x0,[x19, #0x40]
00c0b35c	lsl x8,x8,#0x2
00c0b360	and x1,x8,#-0x8
00c0b364	bl 0x00c2fe80
00c0b368	ldrb w8,[x19, #0x18]
00c0b36c	tbnz w8,#0x0,0x00c0b2f8
00c0b370	b 0x00c0b308
