; cpr::Session::Complete @ 008ece58
008ece58	sub sp,sp,#0xd0
008ece5c	stp x26,x25,[sp, #0x80]
008ece60	stp x24,x23,[sp, #0x90]
008ece64	stp x22,x21,[sp, #0xa0]
008ece68	stp x20,x19,[sp, #0xb0]
008ece6c	stp x29,x30,[sp, #0xc0]
008ece70	add x29,sp,#0xc0
008ece74	mrs x26,tpidr_el0
008ece78	ldr x9,[x26, #0x28]
008ece7c	mov x20,x0
008ece80	mov w21,w1
008ece84	mov w1,#0x1c
008ece88	stur x9,[x29, #-0x48]
008ece8c	stur xzr,[x29, #-0x50]
008ece90	ldr x9,[x0, #0x18]
008ece94	movk w1,#0x40, LSL #16
008ece98	sub x2,x29,#0x50
008ece9c	mov x19,x8
008ecea0	ldr x0,[x9]
008ecea4	bl 0x00c317a0
008ecea8	ldur x0,[x29, #-0x50]
008eceac	add x8,sp,#0x50
008eceb0	bl 0x00c31350
008eceb4	ldur x0,[x29, #-0x50]
008eceb8	bl 0x00c31040
008ecebc	ldr x8,[x20, #0x18]
008ecec0	strb wzr,[x20, #0x10]
008ecec4	stp xzr,xzr,[sp, #0x38]
008ecec8	str xzr,[sp, #0x48]
008ececc	add x23,x8,#0x20
008eced0	mov x0,x23
008eced4	bl 0x00c2ff50
008eced8	mov x22,x0
008ecedc	cmn x0,#0x10
008ecee0	b.cs 0x008ed03c
008ecee4	cmp x22,#0x17
008ecee8	b.cs 0x008ecf04
008eceec	add x9,sp,#0x38
008ecef0	lsl w8,w22,#0x1
008ecef4	orr x24,x9,#0x1
008ecef8	strb w8,[sp, #0x38]
008ecefc	cbnz x22,0x008ecf24
008ecf00	b 0x008ecf34
008ecf04	add x8,x22,#0x10
008ecf08	and x25,x8,#-0x10
008ecf0c	mov x0,x25
008ecf10	bl 0x00c2fed0
008ecf14	orr x8,x25,#0x1
008ecf18	mov x24,x0
008ecf1c	stp x22,x0,[sp, #0x40]
008ecf20	str x8,[sp, #0x38]
008ecf24	mov x0,x24
008ecf28	mov x1,x23
008ecf2c	mov x2,x22
008ecf30	bl 0x00c2ffd0
008ecf34	strb wzr,[x24, x22]
008ecf38	ldr x8,[x20, #0x18]
008ecf3c	str x8,[sp, #0x28]
008ecf40	ldr x8,[x20, #0x20]
008ecf44	str x8,[sp, #0x30]
008ecf48	cbz x8,0x008ecf60
008ecf4c	add x8,x8,#0x8
008ecf50	ldxr x9,[x8]
008ecf54	add x9,x9,#0x1
008ecf58	stxr w10,x9,[x8]
008ecf5c	cbnz w10,0x008ecf50
008ecf60	mov w0,w21
008ecf64	bl 0x00c31050
008ecf68	ldur q0,[sp, #0x38]
008ecf6c	ldr x8,[sp, #0x48]
008ecf70	add x3,x20,#0x260
008ecf74	add x2,x20,#0x248
008ecf78	str w0,[sp, #0x8]
008ecf7c	stp xzr,xzr,[sp, #0x38]
008ecf80	stur q0,[sp, #0x10]
008ecf84	str x8,[sp, #0x20]
008ecf88	str xzr,[sp, #0x48]
008ecf8c	add x1,sp,#0x28
008ecf90	add x4,sp,#0x50
008ecf94	add x5,sp,#0x8
008ecf98	mov x0,x19
008ecf9c	bl 0x00c313c0
008ecfa0	ldrb w8,[sp, #0x10]
008ecfa4	tbz w8,#0x0,0x008ecfb0
008ecfa8	ldr x0,[sp, #0x20]
008ecfac	bl 0x00c301d0
008ecfb0	ldr x19,[sp, #0x30]
008ecfb4	cbz x19,0x008ecfd0
008ecfb8	add x8,x19,#0x8
008ecfbc	ldaxr x9,[x8]
008ecfc0	sub x10,x9,#0x1
008ecfc4	stlxr w11,x10,[x8]
008ecfc8	cbnz w11,0x008ecfbc
008ecfcc	cbz x9,0x008ed018
008ecfd0	ldrb w8,[sp, #0x38]
008ecfd4	tbz w8,#0x0,0x008ecfe0
008ecfd8	ldr x0,[sp, #0x48]
008ecfdc	bl 0x00c301d0
008ecfe0	add x8,sp,#0x50
008ecfe4	add x0,x8,#0x8
008ecfe8	bl 0x00c31500
008ecfec	ldr x8,[x26, #0x28]
008ecff0	ldur x9,[x29, #-0x48]
008ecff4	cmp x8,x9
008ecff8	b.ne 0x008ed044
008ecffc	ldp x29,x30,[sp, #0xc0]
008ed000	ldp x20,x19,[sp, #0xb0]
008ed004	ldp x22,x21,[sp, #0xa0]
008ed008	ldp x24,x23,[sp, #0x90]
008ed00c	ldp x26,x25,[sp, #0x80]
008ed010	add sp,sp,#0xd0
008ed014	ret
008ed018	ldr x8,[x19]
008ed01c	mov x0,x19
008ed020	ldr x8,[x8, #0x10]
008ed024	blr x8
008ed028	mov x0,x19
008ed02c	bl 0x00c2ff00
008ed030	ldrb w8,[sp, #0x38]
008ed034	tbnz w8,#0x0,0x008ecfd8
008ed038	b 0x008ecfe0
008ed03c	add x0,sp,#0x38
008ed040	bl 0x00c30ce0
008ed044	bl 0x00c2fec0
