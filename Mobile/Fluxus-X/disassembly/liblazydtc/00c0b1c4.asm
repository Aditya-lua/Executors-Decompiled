; FUN_00c0b1c4 @ 00c0b1c4
00c0b1c4	paciasp
00c0b1c8	stp x29,x30,[sp, #-0x20]!
00c0b1cc	str x19,[sp, #0x10]
00c0b1d0	mov x29,sp
00c0b1d4	adrp x8,0xcb5000
00c0b1d8	mov x19,x0
00c0b1dc	ldr x8,[x8, #0xdf8]
00c0b1e0	ldrb w9,[x0, #0x60]
00c0b1e4	add x8,x8,#0x10
00c0b1e8	str x8,[x0]
00c0b1ec	tbnz w9,#0x0,0x00c0b22c
00c0b1f0	ldrb w8,[x19, #0x48]
00c0b1f4	tbnz w8,#0x0,0x00c0b248
00c0b1f8	ldrb w8,[x19, #0x30]
00c0b1fc	tbnz w8,#0x0,0x00c0b264
00c0b200	ldrb w8,[x19, #0x18]
00c0b204	tbz w8,#0x0,0x00c0b218
00c0b208	ldr x8,[x19, #0x18]
00c0b20c	ldr x0,[x19, #0x28]
00c0b210	and x1,x8,#-0x2
00c0b214	bl 0x00c2fe80
00c0b218	mov x0,x19
00c0b21c	ldr x19,[sp, #0x10]
00c0b220	ldp x29,x30,[sp], #0x20
00c0b224	autiasp
00c0b228	b 0x00c31530
00c0b22c	ldr x8,[x19, #0x60]
00c0b230	ldr x0,[x19, #0x70]
00c0b234	lsl x8,x8,#0x2
00c0b238	and x1,x8,#-0x8
00c0b23c	bl 0x00c2fe80
00c0b240	ldrb w8,[x19, #0x48]
00c0b244	tbz w8,#0x0,0x00c0b1f8
00c0b248	ldr x8,[x19, #0x48]
00c0b24c	ldr x0,[x19, #0x58]
00c0b250	lsl x8,x8,#0x2
00c0b254	and x1,x8,#-0x8
00c0b258	bl 0x00c2fe80
00c0b25c	ldrb w8,[x19, #0x30]
00c0b260	tbz w8,#0x0,0x00c0b200
00c0b264	ldr x8,[x19, #0x30]
00c0b268	ldr x0,[x19, #0x40]
00c0b26c	lsl x8,x8,#0x2
00c0b270	and x1,x8,#-0x8
00c0b274	bl 0x00c2fe80
00c0b278	ldrb w8,[x19, #0x18]
00c0b27c	tbnz w8,#0x0,0x00c0b208
00c0b280	b 0x00c0b218
