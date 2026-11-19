; FUN_008df008 @ 008df008
008df008	sub sp,sp,#0x80
008df00c	stp x29,x30,[sp, #0x30]
008df010	str x25,[sp, #0x40]
008df014	stp x24,x23,[sp, #0x50]
008df018	stp x22,x21,[sp, #0x60]
008df01c	stp x20,x19,[sp, #0x70]
008df020	add x29,sp,#0x30
008df024	mrs x22,tpidr_el0
008df028	mov x19,x0
008df02c	mov x23,xzr
008df030	ldr x8,[x22, #0x28]
008df034	mov x20,xzr
008df038	add x24,x0,#0x58
008df03c	stur x8,[x29, #-0x8]
008df040	ldr q0,[x0]
008df044	stp x1,x2,[sp]
008df048	str q0,[sp, #0x10]
008df04c	b 0x008df060
008df050	add x20,x20,#0x1
008df054	add x23,x23,#0x800
008df058	cmp x20,#0x80
008df05c	b.eq 0x008df0c8
008df060	mov x0,sp
008df064	mov w1,w20
008df068	bl 0x008dd8dc
008df06c	tbz w0,#0x0,0x008df050
008df070	add x8,x24,x20, LSL #0x4
008df074	add x0,sp,#0x10
008df078	ldp x1,x2,[x8]
008df07c	bl 0x008dd950
008df080	cbz x20,0x008df050
008df084	mov x21,xzr
008df088	mov x25,x23
008df08c	b 0x008df0a0
008df090	add x21,x21,#0x1
008df094	add x25,x25,#0x10
008df098	cmp x20,x21
008df09c	b.eq 0x008df050
008df0a0	mov x0,sp
008df0a4	mov w1,w21
008df0a8	bl 0x008dd8dc
008df0ac	tbz w0,#0x0,0x008df090
008df0b0	ldr x8,[x19, #0x858]
008df0b4	add x0,sp,#0x10
008df0b8	add x8,x8,x25
008df0bc	ldp x1,x2,[x8]
008df0c0	bl 0x008dd950
008df0c4	b 0x008df090
008df0c8	ldp x0,x1,[sp, #0x10]
008df0cc	ldr x8,[x22, #0x28]
008df0d0	ldur x9,[x29, #-0x8]
008df0d4	cmp x8,x9
008df0d8	b.ne 0x008df0f8
008df0dc	ldp x20,x19,[sp, #0x70]
008df0e0	ldr x25,[sp, #0x40]
008df0e4	ldp x22,x21,[sp, #0x60]
008df0e8	ldp x24,x23,[sp, #0x50]
008df0ec	ldp x29,x30,[sp, #0x30]
008df0f0	add sp,sp,#0x80
008df0f4	ret
008df0f8	bl 0x00c2fec0
