; FUN_008add48 @ 008add48
008add48	sub sp,sp,#0x50
008add4c	stp x29,x30,[sp, #0x10]
008add50	str x23,[sp, #0x20]
008add54	stp x22,x21,[sp, #0x30]
008add58	stp x20,x19,[sp, #0x40]
008add5c	add x29,sp,#0x10
008add60	mrs x21,tpidr_el0
008add64	add w9,w1,#0x1
008add68	mov w20,w2
008add6c	ldr x8,[x21, #0x28]
008add70	mov x19,x0
008add74	subs w11,w2,w9
008add78	str x8,[sp, #0x8]
008add7c	ldr x8,[x0, #0x68]
008add80	b.le 0x008ade18
008add84	ldr x9,[x19, #0x50]
008add88	add x12,x8,w11, SXTW  #0x4
008add8c	ldr x10,[x9, #0x18]
008add90	cmp x12,x10
008add94	b.ls 0x008ade18
008add98	mov w12,#0x1f40
008add9c	cmp w11,w12
008adda0	b.gt 0x008ade74
008adda4	ldr x12,[x19, #0x70]
008adda8	sxtw x22,w11
008addac	mov w13,#0x1f40
008addb0	sub x12,x8,x12
008addb4	add x12,x22,x12, ASR #0x4
008addb8	cmp x12,x13
008addbc	b.gt 0x008ade74
008addc0	ldr x12,[x19, #0x48]
008addc4	lsl w13,w11,#0x4
008addc8	sub x12,x12,x8
008addcc	cmp x12,x13
008addd0	b.gt 0x008ade08
008addd4	nop
008addd8	adr x8,0x8aa604
008adddc	add x2,sp,#0x4
008adde0	mov x0,x19
008adde4	mov w23,w1
008adde8	mov x1,x8
008addec	str w11,[sp, #0x4]
008addf0	bl 0x008b3edc
008addf4	cbnz w0,0x008ade74
008addf8	ldr x9,[x19, #0x50]
008addfc	ldr x8,[x19, #0x68]
008ade00	mov w1,w23
008ade04	ldr x10,[x9, #0x18]
008ade08	add x11,x8,x22, LSL #0x4
008ade0c	cmp x10,x11
008ade10	b.cs 0x008ade18
008ade14	str x11,[x9, #0x18]
008ade18	mvn w9,w1
008ade1c	mov x0,x19
008ade20	mov w2,w20
008ade24	add x1,x8,w9, SXTW  #0x4
008ade28	bl 0x008b465c
008ade2c	cmn w20,#0x1
008ade30	b.ne 0x008ade4c
008ade34	ldr x8,[x19, #0x50]
008ade38	ldr x9,[x19, #0x68]
008ade3c	ldr x10,[x8, #0x18]
008ade40	cmp x9,x10
008ade44	b.cc 0x008ade4c
008ade48	str x9,[x8, #0x18]
008ade4c	ldr x8,[x21, #0x28]
008ade50	ldr x9,[sp, #0x8]
008ade54	cmp x8,x9
008ade58	b.ne 0x008ade9c
008ade5c	ldp x20,x19,[sp, #0x40]
008ade60	ldr x23,[sp, #0x20]
008ade64	ldp x22,x21,[sp, #0x30]
008ade68	ldp x29,x30,[sp, #0x10]
008ade6c	add sp,sp,#0x50
008ade70	ret
008ade74	adrp x1,0x2b6000
008ade78	add x1,x1,#0xc71
008ade7c	mov x0,x19
008ade80	bl 0x008b9568
008ade84	ldr x8,[x21, #0x28]
008ade88	ldr x9,[sp, #0x8]
008ade8c	cmp x8,x9
008ade90	b.ne 0x008ade9c
008ade94	mov x0,x19
008ade98	bl 0x008aa5f4
008ade9c	bl 0x00c2fec0
