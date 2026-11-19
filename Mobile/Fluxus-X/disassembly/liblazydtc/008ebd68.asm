; cpr::Session::SetRedirect @ 008ebd68
008ebd68	str x23,[sp, #-0x40]!
008ebd6c	stp x22,x21,[sp, #0x10]
008ebd70	stp x20,x19,[sp, #0x20]
008ebd74	stp x29,x30,[sp, #0x30]
008ebd78	add x29,sp,#0x30
008ebd7c	ldr x8,[x0, #0x18]
008ebd80	mov x19,x0
008ebd84	ldrb w2,[x1, #0x8]
008ebd88	mov x20,x1
008ebd8c	ldr x0,[x8]
008ebd90	mov w1,#0x34
008ebd94	bl 0x00c317c0
008ebd98	ldr x8,[x19, #0x18]
008ebd9c	ldr x2,[x20]
008ebda0	mov w1,#0x44
008ebda4	ldr x0,[x8]
008ebda8	bl 0x00c317c0
008ebdac	ldr x8,[x19, #0x18]
008ebdb0	ldrb w2,[x20, #0x9]
008ebdb4	mov w1,#0x69
008ebdb8	ldr x0,[x8]
008ebdbc	bl 0x00c317c0
008ebdc0	ldrb w0,[x20, #0xa]
008ebdc4	mov w1,#0x1
008ebdc8	bl 0x00c313d0
008ebdcc	bl 0x00c31340
008ebdd0	ldrb w8,[x20, #0xa]
008ebdd4	mov w21,w0
008ebdd8	mov w1,#0x2
008ebddc	and x22,x21,#0x1
008ebde0	mov w0,w8
008ebde4	mov w23,#0x2
008ebde8	bl 0x00c313d0
008ebdec	bl 0x00c31340
008ebdf0	ldrb w8,[x20, #0xa]
008ebdf4	bfxil x23,x21,#0x0,#0x1
008ebdf8	tst w0,#0x1
008ebdfc	mov w1,#0x4
008ebe00	mov w0,w8
008ebe04	csel x20,x23,x22,ne
008ebe08	bl 0x00c313d0
008ebe0c	bl 0x00c31340
008ebe10	ldr x8,[x19, #0x18]
008ebe14	orr x9,x20,#0x4
008ebe18	tst w0,#0x1
008ebe1c	csel x2,x9,x20,ne
008ebe20	ldr x8,[x8]
008ebe24	ldp x29,x30,[sp, #0x30]
008ebe28	ldp x20,x19,[sp, #0x20]
008ebe2c	ldp x22,x21,[sp, #0x10]
008ebe30	mov w1,#0xa1
008ebe34	mov x0,x8
008ebe38	ldr x23,[sp], #0x40
008ebe3c	b 0x00c317c0
