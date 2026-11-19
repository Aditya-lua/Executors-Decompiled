; FUN_008acec0 @ 008acec0
008acec0	sub sp,sp,#0x40
008acec4	stp x29,x30,[sp, #0x10]
008acec8	stp x22,x21,[sp, #0x20]
008acecc	stp x20,x19,[sp, #0x30]
008aced0	add x29,sp,#0x10
008aced4	mrs x22,tpidr_el0
008aced8	mov w20,w2
008acedc	mov x19,x0
008acee0	ldr x8,[x22, #0x28]
008acee4	mov w21,w1
008acee8	str x8,[sp, #0x8]
008aceec	ldrb w8,[x0, #0x2]
008acef0	tbz w8,#0x2,0x008acf04
008acef4	add x2,x19,#0x38
008acef8	mov x0,x19
008acefc	mov x1,x19
008acf00	bl 0x008b63a4
008acf04	ldr x9,[x19, #0x50]
008acf08	ldr x8,[x19, #0x68]
008acf0c	ldr x10,[x9, #0x18]
008acf10	add x11,x8,#0x10
008acf14	cmp x11,x10
008acf18	b.ls 0x008acf80
008acf1c	ldr x11,[x19, #0x70]
008acf20	mov w12,#0xf3f0
008acf24	movk w12,#0x1, LSL #16
008acf28	sub x11,x8,x11
008acf2c	cmp x11,x12
008acf30	b.gt 0x008ad02c
008acf34	ldr x11,[x19, #0x48]
008acf38	sub x11,x11,x8
008acf3c	cmp x11,#0x10
008acf40	b.gt 0x008acf70
008acf44	mov w8,#0x1
008acf48	nop
008acf4c	adr x1,0x8aa604
008acf50	add x2,sp,#0x4
008acf54	mov x0,x19
008acf58	str w8,[sp, #0x4]
008acf5c	bl 0x008b3edc
008acf60	cbnz w0,0x008ad02c
008acf64	ldr x9,[x19, #0x50]
008acf68	ldr x8,[x19, #0x68]
008acf6c	ldr x10,[x9, #0x18]
008acf70	add x11,x8,#0x10
008acf74	cmp x10,x11
008acf78	b.cs 0x008acf80
008acf7c	str x11,[x9, #0x18]
008acf80	cmp w21,#0x1
008acf84	b.lt 0x008acfc0
008acf88	ldr x9,[x19, #0x70]
008acf8c	add x9,x9,w21, UXTW  #0x4
008acf90	sub x0,x9,#0x10
008acf94	cmp x0,x8
008acf98	b.cc 0x008acfe0
008acf9c	adrp x8,0xd1f000
008acfa0	add x8,x8,#0x1e0
008acfa4	adrp x21,0xd1f000
008acfa8	ldarb w8,[x8]
008acfac	tbz w8,#0x0,0x008ad054
008acfb0	ldr x8,[x21, #0x1d8]
008acfb4	add x8,x8,#0x7f2, LSL #12
008acfb8	add x0,x8,#0xef0
008acfbc	b 0x008acfe0
008acfc0	mov w9,#0xffffd8f1
008acfc4	cmp w21,w9
008acfc8	b.lt 0x008acfd4
008acfcc	add x0,x8,w21, SXTW  #0x4
008acfd0	b 0x008acfe0
008acfd4	mov x0,x19
008acfd8	mov w1,w21
008acfdc	bl 0x008aea7c
008acfe0	ldr x0,[x0]
008acfe4	mov w1,w20
008acfe8	bl 0x008bb19c
008acfec	ldr x8,[x19, #0x68]
008acff0	ldr q0,[x0]
008acff4	str q0,[x8]
008acff8	ldr x8,[x19, #0x68]
008acffc	add x9,x8,#0x10
008ad000	ldr w0,[x8, #0xc]
008ad004	str x9,[x19, #0x68]
008ad008	ldr x8,[x22, #0x28]
008ad00c	ldr x9,[sp, #0x8]
008ad010	cmp x8,x9
008ad014	b.ne 0x008ad0ac
008ad018	ldp x20,x19,[sp, #0x30]
008ad01c	ldp x22,x21,[sp, #0x20]
008ad020	ldp x29,x30,[sp, #0x10]
008ad024	add sp,sp,#0x40
008ad028	ret
008ad02c	adrp x1,0x2b6000
008ad030	add x1,x1,#0xc71
008ad034	mov x0,x19
008ad038	bl 0x008b9568
008ad03c	ldr x8,[x22, #0x28]
008ad040	ldr x9,[sp, #0x8]
008ad044	cmp x8,x9
008ad048	b.ne 0x008ad0ac
008ad04c	mov x0,x19
008ad050	bl 0x008aa5f4
008ad054	adrp x0,0xd1f000
008ad058	add x0,x0,#0x1e0
008ad05c	bl 0x00c2fe90
008ad060	cbz w0,0x008acfb0
008ad064	adrp x8,0xcca000
008ad068	ldr x0,[x8, #0x8c8]
008ad06c	bl 0x007fe1ec
008ad070	str x0,[x21, #0x1d8]
008ad074	adrp x0,0xd1f000
008ad078	add x0,x0,#0x1e0
008ad07c	bl 0x00c2fea0
008ad080	b 0x008acfb0
008ad0ac	bl 0x00c2fec0
