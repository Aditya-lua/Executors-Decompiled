; FUN_008b4164 @ 008b4164
008b4164	stp x29,x30,[sp, #-0x30]!
008b4168	stp x22,x21,[sp, #0x10]
008b416c	stp x20,x19,[sp, #0x20]
008b4170	mov x29,sp
008b4174	mov x19,x0
008b4178	tbnz w1,#0x1f,0x008b41dc
008b417c	ldrsw x8,[x19, #0x44]
008b4180	mov w22,#0x30
008b4184	ldr x21,[x19, #0x20]
008b4188	umull x3,w1,w22
008b418c	ldrb w4,[x19, #0x1]
008b4190	mov w20,w1
008b4194	add x8,x8,x8, LSL #0x1
008b4198	mov x0,x19
008b419c	mov x1,x21
008b41a0	lsl x2,x8,#0x4
008b41a4	bl 0x008b8498
008b41a8	ldr x8,[x19, #0x50]
008b41ac	nop
008b41b0	umaddl x9,w20,w22,x0
008b41b4	str w20,[x19, #0x44]
008b41b8	sub x8,x8,x21
008b41bc	add x8,x0,x8
008b41c0	str x8,[x19, #0x50]
008b41c4	sub x8,x9,#0x30
008b41c8	stp x8,x0,[x19, #0x18]
008b41cc	ldp x20,x19,[sp, #0x20]
008b41d0	ldp x22,x21,[sp, #0x10]
008b41d4	ldp x29,x30,[sp], #0x30
008b41d8	ret
008b41dc	mov x0,x19
008b41e0	bl 0x008b75fc
